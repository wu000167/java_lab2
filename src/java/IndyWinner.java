/**
 * Represents an IndyCar race winner with details about the race year,
 * winning driver, average speed, and country of origin.
 */
public class IndyWinner {
    
    private int year; // The year the race was won.
    private String driver; // The name of the winning driver.
    private double averageSpeed; // The average speed achieved during the race.
    private String country; // The country of the winning driver.

    /**
     * Constructs an IndyWinner instance with the specified details.
     *
     * @param year The year the race was won.
     * @param driver The name of the winning driver.
     * @param averageSpeed The average speed achieved during the race.
     * @param country The country of the winning driver.
     */
    public IndyWinner(int year, String driver, double averageSpeed, String country) {
        this.year = year;
        this.driver = driver;
        this.averageSpeed = averageSpeed;
        this.country = country;
    }

    /**
     * Gets the year the race was won.
     *
     * @return The year of the race.
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the year the race was won.
     *
     * @param year The year to set.
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Gets the name of the winning driver.
     *
     * @return The name of the driver.
     */
    public String getDriver() {
        return driver;
    }

    /**
     * Sets the name of the winning driver.
     *
     * @param driver The name of the driver to set.
     */
    public void setDriver(String driver) {
        this.driver = driver;
    }

    /**
     * Gets the average speed achieved during the race.
     *
     * @return The average speed in miles per hour (or kilometers per hour).
     */
    public double getAverageSpeed() {
        return averageSpeed;
    }

    /**
     * Sets the average speed achieved during the race.
     *
     * @param averageSpeed The average speed to set.
     */
    public void setAverageSpeed(double averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    /**
     * Gets the country of the winning driver.
     *
     * @return The country of the driver.
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the country of the winning driver.
     *
     * @param country The country to set.
     */
    public void setCountry(String country) {
        this.country = country;
    }
}
