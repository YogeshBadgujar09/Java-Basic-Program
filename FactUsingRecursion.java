class FactUsingRecursion{

	int factorial(int n) {
	    if (n == 0) {
	        return 1;
	    } else {
	        return n * factorial(n-1);
	    }
	}

	 public static void main(String args[]){


	   FactUsingRecursion obj = new FactUsingRecursion();

	   int num = 5;

	   int result = obj.factorial(num);

		System.out.println(result);
	}



}