
package com.yogesh.transaction;

import com.yogesh.dbandadmin.GlobalDatabase;
import com.yogesh.optimization.AccountAvailableClass;
import java.util.Scanner;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TransferMoney {
    
    TransferMoney()
    {
        int senderBalance ;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yogesh.transaction;

import com.yogesh.dbandadmin.GlobalDatabase;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author Yogesh
 */
public class TransactionTracking {
    
       public TransactionTracking(String accountNo ,String particulars, String debitAmount, String creditAmount ,String totalBalance ){
        
          Random random = new Random();
            int randomId; 
            
            do{
                randomId = random.nextInt();
            }while(randomId < 1);
          
            String transactionId = "TRAN" + randomId;
            System.out.print(transactionId);
            
            Date date = new Date();
            SimpleDateFormat simpleDateFormat= new SimpleDateFormat("dd-MMM-YYYY");
            String formatedDate = simpleDateFormat.format(date);
               System.out.println(formatedDate);
                //Transaction Tracking
               GlobalDatabase.nonSelectQuery("INSERT INTO transaction VALUES('"+transactionId+"','"+ accountNo +"','"+ particulars +"','"+ debitAmount +"','"+ creditAmount +"','SUCCESSFUL','"+formatedDate+"','"+ totalBalance+"')");
                
        }
    
}

        int recieverBalance ;
        String senderAccountNumber = null ;
        String recieverAccountNo;
        final int BALANCE_COLUMN = 16 ;
        final int ACCOUNT_NO_COLUMN = 15 ;
        int transferAmount = 0 ;
        System.out.println("Sender Account finding processs..... !!!!");
        ResultSet senderResultSet = accountFind();
        System.out.println("Reciever Account finding processs..... !!!!");
        ResultSet recieverResultSet = accountFind();
        try {
            
            System.out.println("Payment Transfer Proccess .... !!!");
            
            senderBalance = Integer.parseInt(senderResultSet.getString(BALANCE_COLUMN));
            senderAccountNumber = senderResultSet.getString(ACCOUNT_NO_COLUMN);
            recieverBalance = Integer.parseInt(recieverResultSet.getString(BALANCE_COLUMN));
            recieverAccountNo = recieverResultSet.getString(ACCOUNT_NO_COLUMN);
            System.out.println("AVAILABLE BALANCE :" + senderBalance );
            
            recieverAccountNo = recieverResultSet.getString(ACCOUNT_NO_COLUMN);
            
            boolean flag = false ;
            do{
                System.out.println("Enter Amount for transfer :");
                transferAmount = new Scanner(System.in).nextInt();
                
                final int MINIMUM_BALANCE = 0 ;
                final int MAXIMUM_BALANCE = senderBalance;
                
                if(senderBalance > MINIMUM_BALANCE && transferAmount < MAXIMUM_BALANCE )
                {
                    flag = true ;
                    System.out.println("You enter Valid Amount .... !!!");
                    
                    senderBalance = senderBalance - transferAmount ;
                    GlobalDatabase.nonSelectQuery("UPDATE account SET balance='"+ senderBalance +"' Where accountno = '"+ senderAccountNumber +"'");
                    String particulars = "TRANSFER TO" + recieverAccountNo;
                    String credit = " ";
                    new TransactionTracking(senderAccountNumber, particulars, String.valueOf(transferAmount), credit , String.valueOf(senderBalance));
                    
                    
                    // Recieve Money ....
             
                    recieverBalance = recieverBalance + transferAmount ;
                    GlobalDatabase.nonSelectQuery("UPDATE account SET balance='"+ recieverBalance +"' Where accountno = '"+ recieverAccountNo +"'");
                    particulars = "TRANSFER FROM" + String.valueOf(senderAccountNumber);
                    String debit = " ";
                    new TransactionTracking(recieverAccountNo, particulars,debit, String.valueOf(transferAmount),String.valueOf(recieverBalance));
                    
                    System.out.println("Tranfer Successfull ... !!!");
                    GlobalDatabase.closeConnection();
                    
                }else{
                    System.out.println("Not Valid Amount .... !!!");
                }
                
            }while(flag != true);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(TransferMoney.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }
    
    public ResultSet accountFind()
    {
        Scanner scanner = new Scanner(System.in);
        boolean flag = false ;
        do{
                System.out.println("Enter Your Account Number :");
                String accountNo = scanner.next();

                ResultSet resultSet = new AccountAvailableClass().accountAvailable(accountNo);

                if(resultSet != null)
                {
                    try {
                        System.out.println("Sender Account found .... !!!!");
                        System.out.println("Name :" + resultSet.getString(1) + " Balance :" +resultSet.getString(16));
                        return resultSet;
                    } catch (SQLException ex) {
                        Logger.getLogger(TransferMoney.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    System.out.println("Account NOT found .... !!!!");
                }
        
        }while(flag == false);
        return null;
    }
  
    public static void main(String args[])
    {
           new TransferMoney();    
    }
    
}
