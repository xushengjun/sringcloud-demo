FROM java:8
VOLUME /tmp
ADD eurake-server-0.0.1-SNAPSHOT.jar  app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8881
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]



