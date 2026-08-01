public class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar>{
    private int distance;
    private int victories;
    public void setNumberOfVictories(int v){
        victories = v;
    }
    public int getNumberOfVictories(){
        return victories;
    }
    @Override
    public void drive() {
        distance += 10;
    }
    @Override
    public int getDistanceTravelled() {
        return distance;
    }
    @Override
    public int compareTo(ProductionRemoteControlCar otherCar){
        return Integer.compare(otherCar.getNumberOfVictories(), this.victories);    
    }
}