class LogicalProgram {
    public static void main(String[] args) {
        boolean isAdmin = true;
        boolean isVerified = true;

        // AND operator (&&)
        if (isAdmin && isVerified) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }

        // OR operator (||)
        isAdmin = false;
        if (isAdmin || isVerified) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }

        // NOT operator (!)
        isAdmin = true;
        if (!isAdmin) {
            System.out.println("Access denied");
        } else {
            System.out.println("Access granted");
        }
    }
}
