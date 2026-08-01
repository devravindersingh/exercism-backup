public class JedliksToyCar {
    private int distanceDriven = 0;
    private int batteryLevel = 100;
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        String str = "Driven %d meters".formatted(this.distanceDriven);
        return str;
    }

    public String batteryDisplay() {
        String str = "";
        if(this.batteryLevel == 0)
            str = "Battery empty";  
        else
            str = "Battery at %d%%".formatted(this.batteryLevel);  
        return str;
    }

    public void drive() {
        if(this.batteryLevel != 0){
            this.distanceDriven += 20;
            this.batteryLevel -= 1;
        }
    }
}
