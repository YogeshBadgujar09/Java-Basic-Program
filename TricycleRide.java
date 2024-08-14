public class TricycleRide {
    private int speed;
    private String terrain;

    public TricycleRide() {
        this.speed = 0;
        this.terrain = "flat";
    }

    public void pedal() {
        speed += 1;
        System.out.println("Pedaling... Speed: " + speed);
    }

    public void shiftTerrain(String terrain) {
        this.terrain = terrain;
        System.out.println("Terrain changed to: " + terrain);
    }

    public void ride() {
        if (terrain.equals("flat")) {
            speed += 2;
        } else if (terrain.equals("hilly")) {
            speed -= 1;
        } else if (terrain.equals("mountainous")) {
            speed -= 2;
        }
        System.out.println("Riding... Speed: " + speed);
    }
	
	 public static void main(String[] args) {
	        TricycleRide tricycleRide = new TricycleRide();
	        tricycleRide.pedal();
	        tricycleRide.shiftTerrain("hilly");
	        tricycleRide.ride();
	        tricycleRide.shiftTerrain("mountainous");
	        tricycleRide.ride();
	    }
	}
