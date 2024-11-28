JSTL (JavaServer Pages Standard Tag Library) is a set of tags that provide common functionalities to simplify JSP (JavaServer Pages) development. It allows you to use tags to control flow, format data, work with XML, and more, reducing the need for Java code directly embedded in JSPs. Here's a breakdown of some key features and how to use JSTL in JSP files.

### 1. **Adding JSTL Dependencies**
Before using JSTL in a JSP file, you need to include the necessary libraries in your project. If you're using Maven, you can include JSTL using the following dependency in your `pom.xml`:

```xml
<dependency>
    <groupId>javax.servlet</groupId>
    <artifactId>jstl</artifactId>
    <version>1.2</version>
</dependency>
```

### 2. **Importing JSTL Core Library**
At the beginning of your JSP file, you need to declare the JSTL tag library. The core library prefix (`c`) is used for common functions like conditionals and loops:

```jsp
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
```

### 3. **Common JSTL Tags**

#### a. **Conditional Tag: `c:if`**
The `<c:if>` tag is used to perform conditional logic, similar to an `if` statement in Java.

**Example:**
```jsp
<c:if test="${user != null}">
    Welcome, ${user.name}!
</c:if>
```

#### b. **Loop Tag: `c:forEach`**
The `<c:forEach>` tag is used to iterate over collections such as lists, arrays, or even a range of numbers.

**Example:**
```jsp
<ul>
    <c:forEach var="item" items="${itemList}">
        <li>${item}</li>
    </c:forEach>
</ul>
```

In this example, `itemList` is a collection passed from the backend, and `item` is the variable used to access each element of the list.

#### c. **Setting Variables: `c:set`**
The `<c:set>` tag is used to assign a value to a variable in the scope of the JSP page.

**Example:**
```jsp
<c:set var="discount" value="10"/>
<p>The discount is ${discount}%</p>
```

#### d. **Conditional Tag: `c:choose`, `c:when`, `c:otherwise`**
The `<c:choose>` tag works like a `switch` statement in Java. It includes `c:when` for conditions and `c:otherwise` for the default case.

**Example:**
```jsp
<c:choose>
    <c:when test="${age >= 18}">
        <p>You are an adult.</p>
    </c:when>
    <c:otherwise>
        <p>You are a minor.</p>
    </c:otherwise>
</c:choose>
```

#### e. **Displaying Internationalized Messages: `fmt:message`**
If you're working with internationalization (i18n), the `fmt:message` tag is used to display localized messages.

**Example:**
```jsp
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<fmt:message key="welcome.message"/>
```

This requires a properties file (e.g., `messages_en.properties`) with the `welcome.message` key.

### 4. **Full Example Using JSTL**
Here’s a simple example where we use various JSTL tags in a JSP file:

```jsp
<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>JSTL Example</title>
</head>
<body>
    <h1>Welcome Page</h1>
    
    <!-- Conditionally render content -->
    <c:if test="${user != null}">
        <p>Hello, ${user.name}!</p>
    </c:if>
    
    <!-- Set a variable -->
    <c:set var="price" value="100" />
    <p>Price: ${price}</p>
    
    <!-- Iterate over a list -->
    <h2>Items List</h2>
    <ul>
        <c:forEach var="item" items="${itemList}">
            <li>${item}</li>
        </c:forEach>
    </ul>
    
    <!-- Conditional logic with choose, when, otherwise -->
    <c:choose>
        <c:when test="${user.age >= 18}">
            <p>You are an adult.</p>
        </c:when>
        <c:otherwise>
            <p>You are a minor.</p>
        </c:otherwise>
    </c:choose>
</body>
</html>
```

In this example:
- We greet the user by name if the `user` object is available.
- We set and display a variable (`price`).
- We loop through an `itemList` and display each item in a list.
- We conditionally display content based on the user's age.

### 5. **EL (Expression Language)**
JSTL works well with JSP Expression Language (EL), which allows you to access JavaBeans properties, collections, and scoped variables directly in JSP. For instance:
- `${user.name}` accesses the `name` property of the `user` object.
- `${itemList}` refers to a list or collection passed into the JSP page.

### Advantages of Using JSTL:
- **Less Java code in JSP:** Simplifies JSP by avoiding Java code embedded in the page.
- **Reusability and readability:** JSTL makes JSPs more readable and maintainable by using tag-based logic.
- **Predefined functionalities:** Tags like iteration, conditionals, and formatting provide commonly needed functionalities in a standardized way.

