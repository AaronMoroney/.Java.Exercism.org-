public class Lasagna {
    private int expectedMinutesInOven = 40;
    private int remainingMinutesInOven;
    private int preparationTimeInMinutes;
    private int preparationTime = 2;
    private int totalTimeInMinutes;
    
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return this.expectedMinutesInOven;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minutes) {
        return this.remainingMinutesInOven = expectedMinutesInOven - minutes;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numberOfLayers) {
        // 2 minutes per layer * number of layers
        return this.preparationTimeInMinutes = numberOfLayers * preparationTime;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numberOfLayers, int minutes) {
        return this.totalTimeInMinutes = (numberOfLayers * 2) + minutes;
    }
}
