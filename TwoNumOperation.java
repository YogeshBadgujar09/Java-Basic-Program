@FunctionalInterface
interface TwoNumAdd {
    int run(int a, int b);
}

class TwoNumOperation {

    public static void main(String[] args) {

        TwoNumAdd add = (a, b) -> a + b;
        System.out.println("3 + 2 = " + add.run(3, 2));


        TwoNumAdd subtract = (a, b) -> a - b;
        System.out.println("4 - 3 = " + subtract.run(4, 3));

    }
}