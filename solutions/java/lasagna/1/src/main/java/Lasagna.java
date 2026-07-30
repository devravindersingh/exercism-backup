public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int currentMinutes){
        return this.expectedMinutesInOven() - currentMinutes;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numberOfLayers){
        return 2 * numberOfLayers;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numberOfLayers, int currentMinutes){
        int totalTime = this.preparationTimeInMinutes(numberOfLayers) + currentMinutes;
        return totalTime;
    }
}
