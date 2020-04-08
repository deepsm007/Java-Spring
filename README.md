# Java-Spring
A sample Java Spring boot applications to implement the CRUD operation with rest api web service along with spring security.

After running the application navigate to the browser and type in the URL: http://localhost:8080/users

To utilize the REST api you can use POSTMAN for the GET, POST, PUT, DELETE operations.

## Dockerfile ##

The Dockerfile is added to the project to run the Java-Spring project as a docker container.

Following are the steps to build the container:

1. Open Terminal
2. Navigate to the project directory and make sure that the Dockerfile is in the root directory

$ cd {project directory}

3. Type the following commands:

$ sudo docker build -t spring-boot-ws:1.0 .
$ sudo docker run -d -p 8080:8080 -t spring-boot-ws:1.0

4. To check if container is running 

$ docker ps  

5. Navigate to the browser and type in the URL: http://localhost:8080/users

6. user: admin
   pwd: admin

7. Now you can use the spring application as a docker container

8. To stop the container 

$ docker stop {container_id}


For any queries you can connect with me on LinkedIN: 

### https://www.linkedin.com/in/deepsm007/ ###

## THANK YOU!!! ##

