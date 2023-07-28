# Introduction

Microservice application to accept the data via the APIs and to store it into the SQL Express Server.

# Change in application.properties file

Set the correct username,password and url in application.properties file.

```application.properties

spring.datasource.url=jdbc:sqlserver://<ip_address:port>;encrypt=true;trustServerCertificate=true;databaseName=<db_name>
spring.datasource.username=<username>
spring.datasource.password=<password>

```

# Build

This is a gradle based java project .To build the project. 

```terminal
gradle build
```

# Run Application 

This is a microservice application ,the built jar file will be converted into an image to run it in the docker.

```terminal

docker build --build-arg JAR_FILE="build/libs/*.jar" -t <image_name> .

```

To run the image in docker.

```terminal

docker run -p <container_port>:8090 <image_name>

```
# API Input and HTTP request method.

```URL
POST:<ServerIP>:8090/cylinder/api
```
```JSON
{
    "timeVal":9999.978779,
    "serialNo":"c11",
    "cylinderType":99,
    "vldValue":89.89,
    "oldValue":73.99,
    "grossWeight":7.88,
    "tareWeight":9.833,
    "vldResultFlag":0,
    "oldResultFlag":1,
    "grossWeightResultFlag":1,
    "carousel":45,
    "resultFlag":0,
    "stDueDate":"ssfsf",
    "remark":"xxx",
    "bungLeak":0,
    "bodyLeak":0,
    "netWeight":8.86
}
```



