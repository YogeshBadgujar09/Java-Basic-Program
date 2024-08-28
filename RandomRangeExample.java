 public class RandomRangeExample {
     public static void main(String[] args) {
         int min = 1;
         int max = 10;

         // Generate random integer between min (inclusive) and max (inclusive)
         int randomInt = (int) (Math.random() * (max - min + 1)) + min;

         System.out.println("Random integer between " + min + " and " + max + ": " + randomInt);
     }
}