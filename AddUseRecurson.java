class AddUseRecurson{

	int addition(int n) {
	    if (n == 1) {
	        return 1;
	    } else {
	        return n + factorial(n-1);
	    }
	}

	 public static void main(String args[]){


	   AddUseRecurson obj = new AddUseRecurson();

	   int num = 5;

	   int result = obj.addition(num);

		System.out.println(result);
	}



}
