/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Data Access Object (DAO) interface for managing IndyWinner entities.
 * Provides methods for retrieving IndyCar race winner data from a data source.
 * @author rebec
 */
import java.util.List;
    
public interface IndyWinnerDAO {
    /**
     * Retrieves a paginated list of IndyWinner objects from the data source.
     *
     * @param offset The starting position of the records to retrieve.
     * @param limit The maximum number of records to retrieve.
     * @return A list of IndyWinner objects containing race winner details.
     * @throws Exception If a database connection or query error occurs.
     */
    List<IndyWinner> getIndyWinners(int offset, int limit) throws Exception;
}
