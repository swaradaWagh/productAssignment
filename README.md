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

Design Assumption :
1. product has one to one mapping with category. This means one product canbe assigned to 1 category
For example :
Categories can have : Electronic ,Kids-Toys ,Medicines , Automotives,
Product --Electronic can have products as Mobile ,TV ,Music Systems ,Camera
Now if want to specify a TV of brand LG having size 40 inches then we will need one more entity called as "ProductModel"
which is currently not implemented in assignment.
Alsp Product can be associated with Accesories as Mobile --> battery,charger,headphones,screen-cover,bluetooth,usb cable etc.
In this case one more entity will come into picture named as "Accessories"
There can be multiple vendors selling the same product ,we will need entity named as "Vendor" and so on.


To run compile and build application

mvn package && java -jar target/productApp-0.1.0.jar
mvn spring boot:run


