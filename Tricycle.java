class Tricycle {
    private int speed;
    private int gear;

    public Tricycle() {
        this.speed = 0;
        this.gear = 1;
    }

    public void pedal() {
        speed += 1;
        System.out.println("Pedaling... Speed: " + speed);
    }

    public void shiftGear(int gear) {
        this.gear = gear;
        System.out.println("Gear shifted to: " + gear);
    }

    public void brake() {
        speed = 0;
        System.out.println("Braking... Speed: " + speed);
    }

    public static void main(String[] args) {
	        Tricycle tricycle = new Tricycle();
	        tricycle.pedal();
	        tricycle.shiftGear(2);
	        tricycle.pedal();
	        tricycle.brake();
	    }
	    
}
