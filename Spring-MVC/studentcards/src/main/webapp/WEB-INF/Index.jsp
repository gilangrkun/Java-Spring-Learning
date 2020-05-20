<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Student Cards</title>
  </head>
  <body>
    <h1>StudentCard List</h1>
    <c:out value="${studentCards.get(0).id}" />
    <c:out value="${studentCards.get(0).name}" />
    <c:out value="${studentCards.get(0).country}" />
    <c:out value="${studentCards.get(1).id}" />
    <c:out value="${studentCards.get(1).name}" />
    <c:out value="${studentCards.get(1).country}" />
  </body>
</html>
