FROM tomcat:7.0
EXPOSE 8082
RUN rm -rf /usr/local/tomcat/webapps/* 
ADD target/springbootdemo-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war
CMD ["catalina.sh","run"]
