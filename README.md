# spring-boot-docker 
Spring Boot Jersey Docker Reference Implementation

# To run the project :

- Open the project in STS latest (3.8.0.RELEASE recommended) & run SpringBootJerseyApp.java (Run as Spring Boot App)
- Open browser and invoke below url. App will be running in Embedded Tomcat Container. We can override using Jetty or undertow container if required.

  localhost:8080/availability/searchByDate

# Build Option

Build the project using maven and deploy to the container of your choice and invoke the endpoint mentioned above.

# Docker Build

To build the project using Docker, follow below blog

https://medium.com/@shatk/getting-started-with-docker-95333b388871#.942qnli80

Note - This is the base code of spring boot jersey with docker , advanced feature's of Spring boot and spring cloud is yet to be added. 

