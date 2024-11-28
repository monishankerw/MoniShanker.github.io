Servlet:
   ->Servlet is a java class extends HttpServlet. It is used to develop backend code and helps us to read data from the frontend view and backend bussiness logic.


        Q. How to create servlets?
         1. By implementing servlet interface.
         2. By extending Generic servlet(abstract class)
         3. by extending HttpServlet(class)


      Two methods:
         doget() & dopost()

       Q. Difference between Doget and dopost?


         DOGET                                        |            DOPOST
      1. Getting data from data base                  |   1.Submit the data in data base.
      2. Data expose to URL                           |   2. DATA not expose to URL
      3. When you refresh page you will not any
      security pop-up alert                           |  3. When you refresh page you will get  security pop-up alert

      4. very less secure                             | 4. secure

    create database loginPage;
    use loginPage;

    create table login(
    email varchar(120),
    password varchar(20)
    );

    select * from login;


    @WebServlet("/verifyLogin")
    public class LoginServlet extends HttpServlet {

        protected void doPost(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            // Get the parameters from the request
            String email = request.getParameter("email");
            String password = request.getParameter("password");

            // Set up the database connection
            String jdbcUrl = "jdbc:mysql://localhost:3306/loginPage";
            String dbUsername = "root";
            String dbPassword = "12Rose#2323";

            try (Connection connection = DriverManager.getConnection(jdbcUrl, dbUsername, dbPassword)) {
                // Prepare SQL statement to check user credentials
                String sql = "SELECT * FROM users WHERE email = ? AND password = ?";
                try (PreparedStatement statement = connection.prepareStatement(sql)) {
                    statement.setString(1, email);
                    statement.setString(2, password);
                    try (ResultSet resultSet = statement.executeQuery()) {
                        if (resultSet.next()) {
                            // Authentication successful, redirect to success page
                            response.sendRedirect("success.html");
                        } else {
                            // Authentication failed, redirect back to login page with error message
                            response.sendRedirect("login.html?error=1");
                        }
                    }
                }
            } catch (SQLException e) {
                throw new ServletException("Database access error", e);
            }
        }
    }


    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Login Page</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f4f4f4;
                margin: 0;
                padding: 0;
            }
            form {
                background-color: #fff;
                width: 300px;
                margin: 100px auto;
                padding: 20px;
                border-radius: 5px;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            }
            label {
                display: block;
                margin-bottom: 5px;
                font-weight: bold;
            }
            input[type="text"],
            input[type="password"] {
                width: 100%;
                padding: 10px;
                margin-bottom: 20px;
                border: 1px solid #ccc;
                border-radius: 4px;
                box-sizing: border-box;
            }
            input[type="submit"] {
                width: 100%;
                padding: 10px;
                background-color: #007bff;
                border: none;
                border-radius: 4px;
                color: #fff;
                cursor: pointer;
            }
            input[type="submit"]:hover {
                background-color: #0056b3;
            }
        </style>
    </head>
    <body>
    <form action="verifyLogin" method="post">
        <label for="email">Email:</label>
        <input type="text" id="email" name="email" placeholder="Enter your email"><br>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" placeholder="Enter your password"><br>

        <input type="submit" value="Login">
    </form>
    </body>
    </html>


    <!DOCTYPE html>
    <html lang="en">
    <head>
      <meta charset="UTF-8">
      <title>Login Success</title>
      <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            text-align: center;
        }
        .container {
            margin-top: 100px;
        }
        h1 {
            color: #007bff;
        }
      </style>
    </head>
    <body>
    <div class="container">
      <h1>Login Successful!</h1>
      <p>Welcome to our website.</p>
    </div>
    </body>
    </html>

