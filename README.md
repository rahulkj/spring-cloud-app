Sample Spring Cloud Services Application
----------------------------------------

This application illustrates:

-	Spring Config Server
-	Short Circuit Pattern
-	Hystrix Dashboard
-	Directly consuming a service

-	Demo Config Server is a simple Spring Boot Application that runs locally as a config server.

-	Coffee is a service that binds to the config server instance to fetch the application properties and it uses the Circuit breaker dashboard to show the health of the application when the circuit is open. This application calls the `snacks` service to fetch the snacks available to list in in the menu

-	Snacks is a service that binds to the config server instance to fetch the application properties and updates the snacks menu
