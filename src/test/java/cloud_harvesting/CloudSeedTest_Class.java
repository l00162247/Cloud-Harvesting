package cloud_harvesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CloudSeedTest_Class {

    private static CloudSeed seed;

@BeforeEach
public void setup() {
	seed = new CloudSeed("Test trial here");
}


    @Test
    void testCloudSeedInitialization() {
        //  the CloudSeed object is initialized
        assertNotNull(seed, "no null value");
    }

    @Test
    void testGetSeedName() {
        // checks that getSeedName returns the correct value
        assertEquals("Test trial here", seed.getSeedName(), 
                "The seed name should match set value");
    }
}
