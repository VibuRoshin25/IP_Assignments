import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class assgn1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        final Object[][] object = new Object[5][2];

        object[0][0] = "AaA";
        object[0][1] = 101;

        object[1][0] = "BbB";
        object[1][1] = 102;

        object[2][0] = "CcC";
        object[2][1] = 103;
		
		object[1][0] = "DdD";
        object[1][1] = 104;

        object[2][0] = "EeE";
        object[2][1] = 105;

        int x = Integer.parseInt(request.getParameter("number"));
        x = x - 1;
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head>");
		out.println("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">");
		out.println("</head><body>");
        out.println("<h1>Data of " + x + ":</h1><br/>");
        out.println("<h1>" + object[x][0] + "</h1>");
        out.println("<h1>" + object[x][1] + "</h1>");
        out.println("</body></html>");
    }
}