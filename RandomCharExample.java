public class RandomCharExample {
    public static void main(String[] args) {
        char randomChar = (char) ((Math.random() * 26) + 'a');
        System.out.println("Random character: " + randomChar);
    }
}