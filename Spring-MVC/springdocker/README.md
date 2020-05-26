### Create a simple RESTful API using Spring-Boot

This project is created with **Gradle** build-tool and also include **Docker** as a tool to connect into **PostgreSQL** database I've created before.

To run this project, write this command on terminal:

> \$ gradle bootrun

The application starts to run properly (tested on my pc) like this below:
![terminal](https://user-images.githubusercontent.com/60772041/82899503-4f697700-9f85-11ea-982e-e6a7732d1fe4.png)

To check the API functionality, try it with web browser then just go into the server domain:

Get all data:
**http://localhost:8080/api/v1/person**
![postgres](https://user-images.githubusercontent.com/60772041/82900285-7c6a5980-9f86-11ea-9584-98447f80c3b6.png)

or get the specific data with id:
**http://localhost:8080/api/v1/person/d781f84c-9b67-4153-ad27-a42cffdaf44e**
![sitikha](https://user-images.githubusercontent.com/60772041/82900437-b9365080-9f86-11ea-8b41-3cac328c9c98.png)
