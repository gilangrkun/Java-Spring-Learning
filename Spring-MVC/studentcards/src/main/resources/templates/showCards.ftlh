<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Student Cards</title>
  </head>
  <body>
    <h2>List of Cards</h2>
    <table>
      <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Country</th>
      </tr>
      <#list studentCards as card>
        <tr>
            <td>${card.id}</td>
            <td>${card.name}</td>
            <td>${card.country}</td>
        </tr>
      </#list>
    </table>
  </body>
</html>
