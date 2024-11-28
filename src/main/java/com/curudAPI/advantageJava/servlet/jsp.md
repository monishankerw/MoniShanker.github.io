
                              JSP: JAKARTA SERVER PAGES
Inside JSP we can access partial java code.
Implicit object:session,request,response,out


JSP tags
1. Scriptlet Tag(<% %>)

->In jsp tags can not used access specifier.

->Decleration method not allow.

->Inside scripted code not write html code.

->partial java code.

Implicit object:-> implicit object are like 'out'

request.setAttribute("msg",10);
out.println(request.getAttribute)
response.object
allows session attribute. etc.

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Scriptlet Tags</title>
</head>
<body>
<%
int x = 10;
out.println(x);
%>
</body>
</html>



2. Declaration Tag:
<%!  %>
-> We can used access specifier,method,decleared variable.
-> We can not used implicit object.

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Declaration Tag Example</title>
</head>
<body>
    <%!
        // Declare a global variable
        private int counter = 0;

        // Declare a global method
        public void incrementCounter() {
            counter++;
        }
    %>

    <h1>Counter Value: <%= counter %></h1>

    <button onclick="increment()">Increment Counter</button>

    <script>
        function increment() {
            <% incrementCounter(); %>
            document.getElementsByTagName("h1")[0].innerText = "Counter Value: <%= counter %>";
        }
    </script>
</body>
</html>

3. Expression Tag(<=  >)
-> can write only one statement of code.
->can not used end with semicolumn(;)

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Expression Tag Example</title>
</head>
<body>
    <%-- Declare a variable --%>
    <% int x = 10; %>

    <%-- Print the value of the variable using expression tag --%>
    <p>The value of x is: <%= x %></p>

    <%-- Perform arithmetic operation and print result --%>
    <p>The result of 5 + 3 is: <%= 5 + 3 %></p>

    <%-- Accessing request parameter and printing its value --%>
    <p>Hello, <%= request.getParameter("name") %></p>
</body>
</html>

4. Directive Tag(<!@  %>)
->divided into two types: page and include
page directive is use to import any packages into the jsp page.
include directive used to import any file into the page.

/*
<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.util.*, java.io.*" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>JSP with Directives</title>
</head>
<body>
    <!-- Page Directive Example -->
    <h2>Page Directive Example</h2>
    <p>This page directive imports the java.util.* and java.io.* packages.</p>

    <%-- Include Directive Example --%>
    <h2>Include Directive Example</h2>
    <p>This include directive includes the content of the header.jsp file:</p>

    <%@ include file="header.jsp" %>

    <p>This is the main content of the JSP page.</p>

    <!-- Include another file -->
    <%@ include file="footer.jsp" %>
</body>
</html>
*/


Here are some multiple-choice questions (MCQs) based on JSP tags and directives:

### MCQs

1. **Which of the following JSP tag is used to embed Java code within the HTML of a JSP page?**
    - A) Expression Tag
    - B) Declaration Tag
    - C) Scriptlet Tag
    - D) Directive Tag

   **Answer**: C) Scriptlet Tag

2. **Which of the following is not allowed inside a Scriptlet Tag (`<% %>`) in JSP?**
    - A) Access specifiers
    - B) Implicit objects
    - C) HTML code
    - D) Partial Java code

   **Answer**: A) Access specifiers

3. **What is the purpose of the Declaration Tag (`<%! %>`) in JSP?**
    - A) To declare and initialize variables that are available for each request
    - B) To declare methods and variables that are globally accessible throughout the JSP
    - C) To print the values of variables directly in HTML
    - D) To include external content from other files

   **Answer**: B) To declare methods and variables that are globally accessible throughout the JSP

4. **Which of the following statements about the Expression Tag (`<%= %>`) is correct?**
    - A) It allows multiple lines of Java code.
    - B) It must end with a semicolon.
    - C) It can only output a single line of code as a string.
    - D) It does not support arithmetic operations.

   **Answer**: C) It can only output a single line of code as a string.

5. **What is the output of the following JSP code if `x = 10`?**
   ```jsp
   <p>The value of x is: <%= x %></p>
   ```
    - A) 10
    - B) `The value of x is: 10`
    - C) `x is: 10`
    - D) `x: 10`

   **Answer**: B) `The value of x is: 10`

6. **Which JSP tag does not allow the use of implicit objects such as `request`, `response`, etc.?**
    - A) Scriptlet Tag
    - B) Declaration Tag
    - C) Expression Tag
    - D) Directive Tag

   **Answer**: B) Declaration Tag

7. **Which JSP directive is used to include another JSP file’s content?**
    - A) `<%@ page %>`
    - B) `<%@ import %>`
    - C) `<%@ include %>`
    - D) `<%@ jsp:include %>`

   **Answer**: C) `<%@ include %>`

8. **What is the function of the `page` directive in JSP?**
    - A) To declare global variables
    - B) To include Java packages
    - C) To import other JSP files
    - D) To output Java expressions

   **Answer**: B) To include Java packages

9. **Which of the following is a valid example of an Expression Tag in JSP?**
    - A) `<%= 5 + 10 %>`
    - B) `<%! 5 + 10 %>`
    - C) `<%@ 5 + 10 %>`
    - D) `<% 5 + 10 %>`

   **Answer**: A) `<%= 5 + 10 %>`

10. **Which JSP tag is used to declare methods and global variables that can be accessed throughout the JSP page?**
    - A) Scriptlet Tag (`<% %>`)
    - B) Declaration Tag (`<%! %>`)
    - C) Expression Tag (`<%= %>`)
    - D) Directive Tag (`<%@ %>`)

    **Answer**: B) Declaration Tag (`<%! %>`)
------->>>>>>>>>>>>>>>>>>>>>
 JSP LIFE CYCLE

                  .jsp                  Request
         JAVA CODE------->jsp Translator------->jsp Init(),jsp Service(),jsp Destroy()(Servlet)
                                       <---------
                                         Response

When java code write in .jsp file with help us to jsp Translator then java code converted into servlet and servlet has three method jspinit(),jspService(),jsp Destroy()
jspinit() run only one's after Tomcat will started.
Service() run any number of time depending on bussiness required.
when Dedtroyed() run it means life cycle of jsp comes to end.

Here are some multiple-choice questions (MCQs) based on the JSP life cycle:

1. **Which of the following is the correct order of the JSP life cycle methods?**
    - A) `jspService()`, `jspInit()`, `jspDestroy()`
    - B) `jspInit()`, `jspDestroy()`, `jspService()`
    - C) `jspInit()`, `jspService()`, `jspDestroy()`
    - D) `jspDestroy()`, `jspInit()`, `jspService()`

   **Answer**: C) `jspInit()`, `jspService()`, `jspDestroy()`

2. **What is the purpose of the `jspInit()` method in the JSP life cycle?**
    - A) It is called when the JSP file is compiled into a servlet.
    - B) It initializes resources before the JSP starts handling requests.
    - C) It handles all client requests sent to the JSP.
    - D) It cleans up resources when the JSP is destroyed.

   **Answer**: B) It initializes resources before the JSP starts handling requests.

3. **Which method in the JSP life cycle is called only once?**
    - A) `jspService()`
    - B) `jspDestroy()`
    - C) `jspInit()`
    - D) `jspProcess()`

   **Answer**: C) `jspInit()`

4. **What does the `jspService()` method do in the JSP life cycle?**
    - A) Initializes resources.
    - B) Cleans up resources when JSP is destroyed.
    - C) Handles client requests.
    - D) Translates JSP into servlet.

   **Answer**: C) Handles client requests.

5. **When is the `jspDestroy()` method in a JSP page called?**
    - A) When the JSP page is initialized.
    - B) After each request is processed.
    - C) When the JSP page is being removed from service.
    - D) When a new request is received.

   **Answer**: C) When the JSP page is being removed from service.

6. **Which JSP life cycle method cannot be overridden in a JSP page?**
    - A) `jspInit()`
    - B) `jspService()`
    - C) `jspDestroy()`
    - D) None of the above

   **Answer**: B) `jspService()`

7. **In JSP, which method is responsible for generating the response?**
    - A) `jspInit()`
    - B) `jspService()`
    - C) `jspDestroy()`
    - D) `doGet()`

   **Answer**: B) `jspService()`

8. **At which stage does the JSP Translator convert a `.jsp` file into a servlet?**
    - A) During the `jspInit()` method.
    - B) During the `jspService()` method.
    - C) Before calling any JSP life cycle methods.
    - D) During the `jspDestroy()` method.

   **Answer**: C) Before calling any JSP life cycle methods.

9. **Which method is invoked multiple times based on the number of requests received by the JSP?**
    - A) `jspInit()`
    - B) `jspService()`
    - C) `jspDestroy()`
    - D) `doInit()`

   **Answer**: B) `jspService()`

10. **When a JSP page is reloaded after modification, which method is called again?**
    - A) `jspInit()`
    - B) `jspService()`
    - C) `jspDestroy()`
    - D) Both `jspInit()` and `jspService()`

    **Answer**: D) Both `jspInit()` and `jspService()`





