package com.infogalaxy.interfacedemo.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class CollectionDemo {
    public static void main(String[] args) {

        List<String> nameVector = new Vector<>();
        nameVector.add("Nayan");
        nameVector.add("Gagan");
        nameVector.add("Raman");
        nameVector.add(1,"Raj");
        nameVector.remove("Raj");
        System.out.println("Name Vector="+nameVector);

        System.out.println("2nd Element="+nameVector.get(1));

//        for(int i=0;i<nameVector.size();i++) {
//            System.out.println(nameVector.get(i));
//        }

//          for(int i = 0; i < nameVector.size(); i++ ) {
//              String str = nameVector.get(i);
//              System.out.println(str);
//          }
//
        for(String str : nameVector) {
            System.out.println(str);
        }

        Map<String,String> nameTeam = new HashMap<>();
        nameTeam.put("Sachin","India");
        nameTeam.put("Anderson","England");
        nameTeam.put("Sachin","MI");
        nameTeam.put(null,"West Indies");
        nameTeam.put(null,"Bangladesh");    //Not Allowed
        nameTeam.put("AB De V",null);

        System.out.println("All Keys:"+nameTeam.keySet());
        for(String keys : nameTeam.keySet()) {
            System.out.println("Key:"+keys+"\t Value:"+nameTeam.get(keys));
        }

        for(Map.Entry<String,String> entry : nameTeam.entrySet()) {
            System.out.println(entry.getKey()+"\t"+entry.getValue());
        }
        System.out.println("is Map contain Key Sachin? :"+nameTeam.containsKey("sachin"));
        System.out.println("is Map contain Value England? :"+nameTeam.containsValue("england"));
    }
}
