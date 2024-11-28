   Intersevlet Communication:When you called one servlet from another servlet using request Dispacher concept then it id called as Interservlet communication.
   During Interservlet communication exchange data between servlet using request set Attribute and request get attribute.
    However,data store using request.setAttribute is nature.


    public class FirstServlet extends HttpServlet{
    public static final long serial version UID=1L;
    public FirstServlet(){
        super();
    }

    protected void doGet() throws ServletException,IOException{

    }
    protected void doPost() throws ServletException,IOException{

    }
    String name=request.getParameter("name");
    request.setAttribute("firstName",name);
    RequestDispatcher rd=request.getRequestDispacher("secondServlet");
    rd.forword(request,response);
}


   RequestDispatcher: It receive request from client and send it to any resources like servlets, jsp or HTML file.

     import jakarta.servlet.annotation.WebServlet;
     import jakarta.servlet.http.HttpSession;
     import org.apache.coyote.Request;

     import jakarta.servlet.annotation.WebServlet;
     import jakarta.servlet.http.HttpServlet;
     import jakarta.servlet.http.HttpServletRequest;
     import jakarta.servlet.http.HttpServletResponse;
     import jakarta.servlet.http.HttpSession;
     import java.io.IOException;

     @WebServlet("/firstServlet")
     public class FirstServlet extends HttpServlet {

         protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
             String name = (String) request.getAttribute("firstName");
             System.out.println(name);

             HttpSession session = request.getSession();
             String sessionVal = (String) session.getAttribute("sessionName");
             System.out.println(sessionVal);
         }

         protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
             String name = request.getParameter("firstName");
             System.out.println(name);

             HttpSession session = request.getSession();
             String sessionVal = (String) session.getAttribute("sessionName");
             System.out.println(sessionVal);
         }

     }


     session variable:session Variable are once you store data in that the data can access the application regrdless of request dispacher used or not.
     request variable:The variable data can be exchange between servlet only when request concept is used.


     SERVLET LIFE Cycle

     create Servlet--->start server--->Tomcat Container--->init()--->service method(doGet(),doPost())--->destroy()--->end
     When first time start Tomcat server its loaded in tomcat container,
      tomcat container is area logical implementation is we develop to run servlet,
      once's will tomcat started very first
     method in servlet call as init() and
     this method run's one after init() called the services method are called servel times(service method doget() and dopost()) then
     called any number of time depending on bussiness requirement finally destroy() will executed servlet life cycle cames to end.


     package com.example.demo;

     import jakarta.servlet.ServletConfig;
     import jakarta.servlet.ServletException;
     import jakarta.servlet.annotation.WebServlet;
     import jakarta.servlet.http.HttpServlet;
     import jakarta.servlet.http.HttpServletRequest;
     import jakarta.servlet.http.HttpServletResponse;

     import java.io.IOException;

     @WebServlet("addController")
     public class AddController extends HttpServlet {
         public AddController() {
         }

         @Override
         public void init(ServletConfig config) throws ServletException {
             System.out.println("init");
         }

         @Override
         protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
             System.out.println("get");    }

         @Override
         protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
             System.out.println("post");
         }

         @Override
         public void destroy() {
             System.out.println("destroyed");
         }
     }


