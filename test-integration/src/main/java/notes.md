### BOM- Bill of Materials Dependency Management
- All set for u
- spring-boot-starter handles all dependency for u
- No need to declare version
```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
```
   
###
- Spring Context
- Spring Auto Configuration
- Default embedded server is Tomcat

### @SpringBootApplication
- wraps common used annotations.

### @Configuration
- Configuration of environment on start up. Equivalent to Spring xml configuration file.

### @EnableAutoConfiguration
- Auto configures Spring frameworks detected on classpath

### @ComponentScan
- Scan for Spring components, based on the directory where Spring Application Main class is located.

### Container Vs SpringBoot

|Container|SpringBoot| 
|:---:|:---:|
| Need to install container | Just need Java |
| Configuration | Auto Configuration |



### Spring MVC 
- Setup static content: Directories where to put static content:
resources, etc.
- Setup View Resolvers: Based on content negotiation response properly.
- HttpMessageConverter: To convert http content into java 
- Setup customizable hooks.

### application.properties
- Where: on classpath or resources
- Can change within the environment: application-{environment}.properties
```
-Dspring.profiles.active=test
``` 
- https://docs.spring.io/spring-boot/docs/current/reference/html/common-application-properties.html


### Spring Data JPA
- The default connection pool is tomcat-jdbc