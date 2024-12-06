/**
 * 
 */
package cloud_harvesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * 
 */
class CloudSeedTest {

	/**
	 * @throws java.lang.Exception
	 */
	private static CloudSeed seed;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		seed = new CloudSeed("Test trial here");
	}

	/**
	 * Test method for {@link cloud_harvesting.CloudSeed#CloudSeed(java.lang.String)}.
	 */
	@Test
	void testCloudSeed() {
		assertNotNull(seed,"Ensure value(s) is here");
	}

	/**
	 * Test method for {@link cloud_harvesting.CloudSeed#getSeedName()}.
	 */
	@Test
	void testGetSeedName() {
		assertNotNull(seed, "a value for this method must not be null");
	}

}
