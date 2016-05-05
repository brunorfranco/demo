Maven parent - brings all the dependencies already configured

@SpringBootApplication - ComponentScan from this package

Talk a little about Java annotation

Repository - Check Spring data interface hierarchy

in memory database H2 will save it all

run application

application.properties
 change server.port and show logs

RestController example - talk about the annotation
 
http://localhost:9090/reservations

@RepositoryRestResource and @Param("rn")

http://localhost:9090/reservations?page=1

http://localhost:9090/reservations/search/findByReservationName?rn=Bruno

implements ResourceProcessor

http://localhost:9090/reservations/search/findByReservationName?rn=Bruno

@Controller ReservationMvcController - Discuss ViewResolver

thymeleaf template

http://localhost:9090/metrics
http://localhost:9090/dump
http://localhost:9090/mappings

pom.xml change Servlet container <artifactId>spring-boot-starter-jetty</artifactId>