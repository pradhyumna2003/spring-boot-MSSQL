# Introduction

Microservice Application to accept the APIs and to store into the DB

# Build

This is a Gradle based java Project .To build the project 

```terminal
gradle build
```

# Run Application 

This is a microservice application ,the builded  jar file will be converted into the  image to run it on the dockers.

```terminal

docker build --build-arg JAR_FILE="build/libs/*.jar" -t <image_name> .

```

To run the image in docker.

```terminal

docker run -p <container_port>:8090 <image_name>

```
# API input

```URL
POST:localhost:8090/cylinder/cylinder/api
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



