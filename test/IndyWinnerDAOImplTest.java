import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for the IndyWinnerDAOImpl class.
 */
public class IndyWinnerDAOImplTest {

    private IndyWinnerDAOImpl instance;

    public IndyWinnerDAOImplTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        // Runs once before all tests
        System.out.println("Setup before running test suite...");
    }

    @AfterClass
    public static void tearDownClass() {
        // Runs once after all tests
        System.out.println("Teardown after completing test suite...");
    }

    @Before
    public void setUp() {
        // Initialize the DAO implementation before each test
        instance = new IndyWinnerDAOImpl();
    }

    @After
    public void tearDown() {
        // Clean up resources after each test
        instance = null;
    }

    /**
     * Test of getIndyWinners method, of class IndyWinnerDAOImpl.
     */
    @Test
    public void testGetIndyWinners() throws Exception {
        System.out.println("Running test: getIndyWinners");

        // Define test parameters
        int offset = 0;
        int limit = 10;

        // Call the method under test
        List<IndyWinner> result = instance.getIndyWinners(offset, limit);

        // Assertions
        assertNotNull("Result should not be null", result);
        assertTrue("Result list size should be less than or equal to the limit", result.size() <= limit);

        // Check that returned data is valid (assuming database contains data)
        if (!result.isEmpty()) {
            IndyWinner firstWinner = result.get(0);
            assertNotNull("First winner should not be null", firstWinner);
            assertNotNull("Driver name should not be null", firstWinner.getDriver());
            assertTrue("Year should be a positive value", firstWinner.getYear() > 0);
        }
    }
}
