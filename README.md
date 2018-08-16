REF: https://hub.docker.com/r/sath89/oracle-12c/
docker pull sath89/oracle-12c

Add Oracle JDBC Driver to mvn repository
https://www.mkyong.com/maven/how-to-add-oracle-jdbc-driver-in-your-maven-local-repository/

mvn install:install-file -Dfile="D:\programming\lib\ojdbc7.jar" -DgroupId="com.oracle" -DartifactId="ojdbc7" -Dversion="12.1.0" -Dpackaging="jar"
Note: We need to use double quotes to arguments, else mvn freaks out, not sure why.

docker run -d -p 1521:1521 -v D:/dockervolume/oracle:/u01/app/oracle sath89/oracle-12c

create user apps/apps
grant privileges to user apps

CREATE SEQUENCE apps.offer_seq

CREATE TABLE apps.offer (
id         NUMBER PRIMARY KEY,
name       VARCHAR2(30),
code       VARCHAR2(15),
start_date DATE,
end_date   DATE);