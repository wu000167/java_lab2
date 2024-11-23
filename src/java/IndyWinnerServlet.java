import java.io.IOException;
import java.util.List;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet responsible for handling requests and displaying IndyCar race winners.
 * Retrieves data from the database using the DAO pattern and forwards it to a JSP for rendering.
 */
@WebServlet("/IndyWinnerServlet")
public class IndyWinnerServlet extends HttpServlet {

    // Number of race winners to display per page
    private static final int WINNERS_PER_PAGE = 10;

    // DAO for accessing IndyWinner data
    private IndyWinnerDAO indyWinnerDAO = new IndyWinnerDAOImpl();

    /**
     * Handles HTTP GET requests to retrieve and display paginated race winner data.
     *
     * @param request  The HttpServletRequest object containing client request data.
     * @param response The HttpServletResponse object for sending data to the client.
     * @throws ServletException If a servlet-specific error occurs.
     * @throws IOException      If an input or output error is detected.
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int page = 1;

        // Retrieve the page number from the request, defaulting to 1 if not specified
        if (request.getParameter("page") != null) {
            page = Integer.parseInt(request.getParameter("page"));
        }

        int offset = (page - 1) * WINNERS_PER_PAGE;

        try {
            // Fetch the list of winners from the DAO
            List<IndyWinner> winners = indyWinnerDAO.getIndyWinners(offset, WINNERS_PER_PAGE);

            // Set attributes for the JSP
            request.setAttribute("winners", winners);
            request.setAttribute("currentPage", page);

            // Forward the request to the JSP for rendering
            RequestDispatcher dispatcher = request.getRequestDispatcher("indyWinners.jsp");
            dispatcher.forward(request, response);
        } catch (Exception e) {
            // Handle exceptions by wrapping them in a ServletException
            throw new ServletException(e);
        }
    }
}
