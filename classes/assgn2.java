import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class assgn2 extends HttpServlet {

    String students[][] = { { "X001", "AZaz", "1" }, 
								{ "X002", "BYby", "8" }, 
								{ "X003", "CXcx", "6" },
								{ "X004", "DWdw", "2" },
								{ "X005", "Evev", "4" }, 
								{ "X006", "FTft", "5" }, 
								{ "X007", "GUgu", "9" }, 
								{ "X008", "HShs", "10" },
								{ "X009", "IRir", "3" },
								{ "X00A", "JQjq", "7" },};

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String x = request.getParameter("register");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        for (int i = 0; i < 5; i++) {
            if (x.equals(students[i][0])) {
                out.println("<html><head>");
				out.println("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">");
				out.println("</head><body>");
                out.println("<h1>Data of " + x + ":</h1><br/>");
                out.println("<h1>Name: " + students[i][1] + "</h1>");
                out.println("<h1>Rank: " + students[i][2] + "</h1>");
                out.println("</body></html>");
                break;
            }
        }
    }
}