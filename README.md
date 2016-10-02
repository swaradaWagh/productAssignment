# productAssignment

Commands for DB queries :

In mysql :
create schema ProductAppDb;
insert into ProductAppDb.category values(1,'Accessories','Accessories');
insert into ProductAppDb.user values(1,'admin','ADMIN',1,'admin');
insert into ProductAppDb.product values(1,'Nike','nike shoes',true,'111-22', 'shoes',200,1,'large-22',1);

Application is developed using 
spring boot
spring security
spring mvc
maven as build tool


To run compile and build application

mvn package && java -jar target/productApp-0.1.0.jar
mvn spring boot:run


