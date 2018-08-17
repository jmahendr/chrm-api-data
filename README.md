
##Create Docker container for Oracle
REF: https://hub.docker.com/r/sath89/oracle-12c/
docker pull sath89/oracle-12c

Add Oracle JDBC Driver to mvn repository
https://www.mkyong.com/maven/how-to-add-oracle-jdbc-driver-in-your-maven-local-repository/

mvn install:install-file -Dfile="D:\programming\lib\ojdbc7.jar" -DgroupId="com.oracle" -DartifactId="ojdbc7" -Dversion="12.1.0" -Dpackaging="jar"
Note: We need to use double quotes to arguments, else mvn freaks out, not sure why.

docker run -d --name oracle -p 1521:1521 -v D:/dockervolume/oracle:/u01/app/oracle sath89/oracle-12c

docker exec -it oracle sqlplus
login as system/oracle

##Create database objects
CREATE USER apps IDENTIFIED BY apps;
GRANT CREATE SESSION to apps; 
GRANT UNLIMITED TABLESPACE TO apps;

CREATE SEQUENCE apps.offer_s
  START WITH 1000 
  INCREMENT BY 1
  CACHE 20;

CREATE TABLE apps.ozf_offers (
id         NUMBER PRIMARY KEY,
name       VARCHAR2(30),
code       VARCHAR2(15),
start_date DATE,
end_date   DATE);

##Documentation access
http://localhost:8080/swagger-ui.html


##API Access
http://localhost:8080/offers