package cloud_harvesting;

public class Environment {

    public void plantSeed(CloudSeed seed, String location) {
        System.out.println("Planting " + seed.getSeedName() + " at " + location);

        // Plant object is defined and created here
        Plant plant = new Plant(seed);

        // simulate sunlight condition based on location
        String sunlightCondition = location.equals("Sunny Spot") ? "Sunny" : "Shade";
        plant.grow(sunlightCondition);

        System.out.println("Plant status: " + plant.getGrowthStatus());
    }
}
