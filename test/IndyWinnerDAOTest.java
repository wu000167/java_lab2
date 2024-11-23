import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for the IndyWinnerDAO implementation.
 */
public class IndyWinnerDAOTest {

    private IndyWinnerDAO instance;

    public IndyWinnerDAOTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        // Runs once before all tests in the class
    }

    @AfterClass
    public static void tearDownClass() {
        // Runs once after all tests in the class
    }

    @Before
    public void setUp() {
        // Initialize IndyWinnerDAO implementation before each test
        instance = new IndyWinnerDAOImpl();
    }

    @After
    public void tearDown() {
        // Clean up resources after each test
        instance = null;
    }

    /**
     * Test of getIndyWinners method, of class IndyWinnerDAO.
     */
    @Test
    public void testGetIndyWinners() throws Exception {
        System.out.println("getIndyWinners");

        // Define input parameters
        int offset = 0;
        int limit = 10;

        // Call the method and fetch results
        List<IndyWinner> result = instance.getIndyWinners(offset, limit);

        // Assertions
        assertNotNull("Result should not be null", result);
        assertTrue("Result list should contain at most 10 items", result.size() <= limit);

        // Optionally check a known record (if database is pre-populated)
        if (!result.isEmpty()) {
            IndyWinner firstWinner = result.get(0);
            assertNotNull("First winner should not be null", firstWinner);
            assertNotNull("Winner driver name should not be null", firstWinner.getDriver());
            assertTrue("Year should be valid", firstWinner.getYear() > 1900);
        }
    }
}
