package cloud_harvesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CloudSeedTest {

    private static CloudSeed seed;

    @BeforeAll
    static void setUpBeforeClass() {
        // Initialize the CloudSeed object before all tests
        seed = new CloudSeed("Test trial here");
    }

    @Test
    void testCloudSeedInitialization() {
        // Verify that the CloudSeed object is initialized
        assertNotNull(seed, "The CloudSeed object should not be null.");
    }

    @Test
    void testGetSeedName() {
        //  getSeedName should return the correct value
        assertEquals("Test trial here", seed.getSeedName(), 
                "The seed name should match the set name");
    }
}
