package cloud_harvesting;

public class Plant {
    private CloudSeed seed;
    private String growPlantCondition;

    public Plant(CloudSeed seed) {
        this.seed = seed;
        this.growPlantCondition = "Planted";
    }

    /**
     * @param sunlightCondition
     */
    public void grow(String sunlightCondition) {
        if (sunlightCondition == null) {
            throw new IllegalArgumentException("sunlight condition cannot be null");
        }
        switch (sunlightCondition) {
            case "Sunny":
                growPlantCondition = "Growing well";
                break;
            case "Shade":
                growPlantCondition = "Growing slowly";
                break;
            default:
                growPlantCondition = "Not enough sunlight";
                break;
        }
    }

    /**
     * @return String
     */
    public String getGrowthStatus() {
        return growPlantCondition;
    }

    /**
     * @return CloudSeed
     */
    public CloudSeed getSeed() {
        return seed;
    }
}
