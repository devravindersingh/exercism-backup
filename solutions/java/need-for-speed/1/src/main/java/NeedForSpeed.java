class NeedForSpeed {
    private int distanceDriven = 0;
    private int speed;
    private int batteryDrain;
    private int battery = 100;
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        if (battery == 0 || battery < batteryDrain)
            return true;
        else
            return false;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        System.out.println(battery);
        if(battery != 0){
            distanceDriven += speed;
            battery -= batteryDrain;
        }
        System.out.println(battery);
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        while(!car.batteryDrained()){
            car.drive();
        }
        if(car.distanceDriven() >= this.distance)
            return true;
        else 
            return false;
        
    }
}
