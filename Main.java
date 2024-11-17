public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Cloud Seed Planting!");

        Environment environment = new Environment();
        CloudSeed seed = new CloudSeed("aubergines, chillies, tomatoes, courgettes");

        environment.plantSeed(seed, "Sunny Spot");
    }
}
