public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "ZBWURGGGGGG !!!! ";
    }

    // *** Méthodes ajouté dans la classe aigle  *** \\

    @Override
    public void takeOff() {

        if (!this.flying && this.altitude == 0) {
            System.out.println("It's Bird, no It's a Plane, NOOO it's a " + this.getName()+ " !!");
            this.flying = true;
        }
    }

    @Override
    public int ascend(int meters) {
        if (this.flying) {
            this.altitude = Math.min(this.altitude + meters, 666);
            System.out.println(" flies upward, altitude : " + this.altitude + " " + this.getName() + " copy !!! SHHRRRRKKKK");
        }
        return this.altitude;
    }

    @Override
    public void land() {
        if (this.flying && this.altitude == 1) {
            System.out.println(this.getName() + " have been crashed... Stupide bird");
            this.flying = false;
        } else {
            System.out.println("Can Approch too hight !!! Abort mission !!! Abort mission !!! "+ this.getName() + " !!! SHHHRRRRKKKKK");
        }
    }

    @Override
    public int descend(int meters) {
        if (this.flying) {
            this.altitude = Math.max(this.altitude - meters, 1);
            System.out.println(this.getName() + " flies downward, altitude : " + this.altitude);
        }
        return this.altitude;
    }
}
