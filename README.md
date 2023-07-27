# Introduction

Microservice application to accept the data via the APIs and to store it into the SQL Express Server.

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
# API Input

```URL
POST:localhost:8090/cylinder/api
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
    "vldResultFlag":2,
    "oldResultFlag":1,
    "grossWeightResultFlag":5,
    "carousel":45,
    "resultFlag":3,
    "stDueDate":"ssfsf",
    "remark":"xxx"
}
```



