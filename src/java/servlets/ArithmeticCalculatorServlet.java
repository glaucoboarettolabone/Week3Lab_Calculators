package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 815000
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String arithmetic = request.getParameter("arithmetic");
        int result;
        int numFirst = 0;
        int numSecond = 0;
        boolean isNumericFirst = true;
        boolean isNumericSecond = true;
        final String SUM = "+";
        final String MINUS = "-";
        final String MULTIPLY = "*";
        final String MODULUS = "%";
        
        request.setAttribute("first", first);
        request.setAttribute("second", second);
        
        try {
            numFirst = Integer.parseInt(first);
        } catch (NumberFormatException e) {
            isNumericFirst = false;
        }
        try {
            numSecond = Integer.parseInt(second);
        } catch (NumberFormatException e) {
            isNumericSecond = false;
        }        
        
        if ((first == null || first.equals("")) && (second == null || second.equals(""))) {
            request.setAttribute("message", "Result: ---");
        } else if (!(isNumericFirst) || !(isNumericSecond)) {
            request.setAttribute("message", "Result: invalid");
        } else {
            switch (arithmetic) {
                case SUM: {
                    result = Integer.parseInt(first) + Integer.parseInt(second);
                    break;
                } case MINUS: {
                    result = Integer.parseInt(first) - Integer.parseInt(second);
                    break;
                } case MULTIPLY: {
                    result = Integer.parseInt(first) * Integer.parseInt(second);
                    break;
                } case MODULUS: {
                    result = Integer.parseInt(first) % Integer.parseInt(second);
                    break;
                } default: {
                    result = 0;
                }
            }
            
            request.setAttribute("message", "Result: " + String.valueOf(result));
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

}
