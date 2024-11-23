import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of the IndyWinnerDAO interface.
 * Provides methods to retrieve data about IndyCar race winners from a MySQL database.
 */
public class IndyWinnerDAOImpl implements IndyWinnerDAO {

    // JDBC driver class name
    private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";

    // Database connection URL with SSL and timezone configuration
    private static final String DB_URL = "jdbc:mysql://localhost:3306/indywinners?useSSL=false&serverTimezone=UTC";

    // Database credentials
    private static final String USER = "root";
    private static final String PASS = "wu000167";

    /**
     * Retrieves a paginated list of IndyWinners from the database.
     *
     * @param offset The starting position for retrieving records.
     * @param limit The maximum number of records to retrieve.
     * @return A list of {@link IndyWinner} objects representing the race winners.
     * @throws Exception If the JDBC driver is not found or a database access error occurs.
     */
    @Override
    public List<IndyWinner> getIndyWinners(int offset, int limit) throws Exception {
        List<IndyWinner> winners = new ArrayList<>();
        String query = "SELECT * FROM indywinners ORDER BY year DESC LIMIT ? OFFSET ?";

        // Load the JDBC driver class
        try {
            Class.forName(DRIVER_NAME);
        } catch (ClassNotFoundException e) {
            throw new Exception("JDBC Driver not found: " + e.getMessage(), e);
        }

        // Establish a database connection and execute the query
        try (Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement stmt = con.prepareStatement(query)) {

            // Set the query parameters
            stmt.setInt(1, limit);
            stmt.setInt(2, offset);

            // Execute the query and process the result set
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    int year = rs.getInt("YEAR");
                    String driver = rs.getString("DRIVER");
                    double averageSpeed = rs.getDouble("AVERAGESPEED");
                    String country = rs.getString("COUNTRY");

                    // Add each result to the winners list
                    winners.add(new IndyWinner(year, driver, averageSpeed, country));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new Exception("Database connection or query error: " + e.getMessage(), e);
        }

        return winners;
    }
}
