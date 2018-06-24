# Singtel Java & Rest (SpringBoot) Basis



This sample demostrates Java 8 basic concepts like inheritance, polymorphism, abstraction, interface, enumeration, Composition, dynamic property loading, design pattern and rest/micro services concepts using Spring Boot technology including simple jUnit testing.

  - Java 8 basis
    Covers java concepts for the animal and its related component
  - Rest API service
    Covers rest end points for the above animal component

# Current Features!

  - Samples included for Java 8 basis using Animals.
  - JUnit testing for one of the component.
  - Rest based API url's created using Spring Boot microservice.


You can also:
  - Singleton pattern, Composition, Service patterns including examples.
  - Created separate Dto for animal counts



### Tech

This sample demo uses a number of open source projects to work properly:

* [Java 8] - For java basis
* [Maven 3.5] - Build tool to build and package source code.
* [STS & IntelliJ] - IDE to develop application.
* [Junit] - For unit testing.
* [SpringBoot] - For rest code development includes embedded web server.
* [Git] - SCM tool
* [Rest Client] - Postman & Advanced Rest Client.



### Modules Used

This sample rest API service requires java-basis module where I have created the animal components. Animal component is added as dependency to this module. In order to run this API service you should have Java 8, Maven 3 or higer with best IDE.


```sh
	<groupId>com.singtel.rest.basis</groupId>
	<artifactId>rest-basis</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<packaging>jar</packaging>
	<name>rest-basis</name>
	<description>Demo project for Singtel</description>
```

```sh
		<dependency>
			<groupId>com.singtel.java.basis</groupId>
			<artifactId>java-basis</artifactId>
			<version>0.0.1-SNAPSHOT</version>
		</dependency>

```


### Endpoints

Rest API url's for animals count based on type. Prefix endwith http://localhost:8080/

| HTTP Method  | API URL | Description |
| ------ | ------ | ------ |
| GET | [/animals/all] | To get all the animals and count
| GET | [/animals/fly] | To get flying animals and their's count
| GET | [/animals/walk] | To get walking animals and their's count
| GET | [/animals/sing] | To get singing animals and their's count
| GET | [/animals/swim] | To get swimming animals and their's count

## Sample output



    {
        "animalType": "Flying Walking Singing Swimming"
        "animalCount": 13
    }

    {
        "animalType": "Flying Animal"
        "animalCount": 6
    }

    {
        "animalType": "Walking Animal"
        "animalCount": 9
    }

    {
        "animalType": "Singing Animal"
        "animalCount": 8
    }

    {
        "animalType": "Swimming Animal"
        "animalCount": 4
    }

### Todos

 - Write MORE Tests
 - Write MORE features and services

License
----

NA


