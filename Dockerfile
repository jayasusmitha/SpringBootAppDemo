FROM tomcat:7.0
RUN rm -rf /usr/local/tomcat/webapps/* 
ADD sample3.war /usr/local/tomcat/webapps/ROOT.war
CMD ["catalina.sh","run"]
