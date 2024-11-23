import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for the IndyWinner class.
 */
public class IndyWinnerTest {

    private IndyWinner instance;

    public IndyWinnerTest() {
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
        // Initialize a default IndyWinner instance before each test
        instance = new IndyWinner(2021, "John Doe", 150.5, "USA");
    }

    @After
    public void tearDown() {
        // Clean up resources after each test
        instance = null;
    }

    /**
     * Test of getYear method, of class IndyWinner.
     */
    @Test
    public void testGetYear() {
        System.out.println("getYear");
        int expResult = 2021;
        int result = instance.getYear();
        assertEquals(expResult, result);
    }

    /**
     * Test of setYear method, of class IndyWinner.
     */
    @Test
    public void testSetYear() {
        System.out.println("setYear");
        int year = 2022;
        instance.setYear(year);
        assertEquals(year, instance.getYear());
    }

    /**
     * Test of getDriver method, of class IndyWinner.
     */
    @Test
    public void testGetDriver() {
        System.out.println("getDriver");
        String expResult = "John Doe";
        String result = instance.getDriver();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDriver method, of class IndyWinner.
     */
    @Test
    public void testSetDriver() {
        System.out.println("setDriver");
        String driver = "Jane Smith";
        instance.setDriver(driver);
        assertEquals(driver, instance.getDriver());
    }

    /**
     * Test of getAverageSpeed method, of class IndyWinner.
     */
    @Test
    public void testGetAverageSpeed() {
        System.out.println("getAverageSpeed");
        double expResult = 150.5;
        double result = instance.getAverageSpeed();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setAverageSpeed method, of class IndyWinner.
     */
    @Test
    public void testSetAverageSpeed() {
        System.out.println("setAverageSpeed");
        double averageSpeed = 160.75;
        instance.setAverageSpeed(averageSpeed);
        assertEquals(averageSpeed, instance.getAverageSpeed(), 0.0);
    }

    /**
     * Test of getCountry method, of class IndyWinner.
     */
    @Test
    public void testGetCountry() {
        System.out.println("getCountry");
        String expResult = "USA";
        String result = instance.getCountry();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCountry method, of class IndyWinner.
     */
    @Test
    public void testSetCountry() {
        System.out.println("setCountry");
        String country = "Canada";
        instance.setCountry(country);
        assertEquals(country, instance.getCountry());
    }
}
