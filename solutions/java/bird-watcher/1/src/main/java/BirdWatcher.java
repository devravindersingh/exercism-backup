
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return new int[] {0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        int lastPos = birdsPerDay.length - 1;
        return birdsPerDay[lastPos];
    }

    public void incrementTodaysCount() {
        int lastPos = birdsPerDay.length - 1;
        birdsPerDay[lastPos] = birdsPerDay[lastPos] + 1;
    }

    public boolean hasDayWithoutBirds() {
        boolean result = false;
        for (int a : birdsPerDay) {
            if (a == 0){
                result = true;
                break;
            }
        }
        return result;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        if(numberOfDays > birdsPerDay.length)
            numberOfDays = birdsPerDay.length;
        
        for (int i = 0; i < numberOfDays; i++) {
            sum += birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays() {
        int count = 0;
        for (int a : birdsPerDay){
            if(a > 4)
                count++;
        }

        return count;
    }
}
