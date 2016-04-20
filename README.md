#TopsTV API Server

A web server to provide APIs for [TopsTVPlayer](https://github.com/yuantops/TopsTVPlayer) based on Spring MVC infrastructure. 

The structure of this project is rather plain, consisting of four layers: Bean, DAO, Service, Controller.    

## Usage and configuration

1. Download this project.   
2. Configure jdbc connection parameters (database url, username, passowrd, etc) in TopsAPIServer/src/main/resources/properties/jdbc.properties. 
3. Use maven to complile, package the project.   
4. Deploy the .war file obtained from previous step to a Java web container (Apache Tomcat is a common choice). 
5. Launch the web container. 

