package cloud_harvesting;

public class CloudSeed {
    private final String seed;

    public CloudSeed(String seedName) {
        this.seed = seedName;
    }

    /**
     * @return String
     */
    public String getSeedName() {
        return seed;
    }
}
