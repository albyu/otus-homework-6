FROM amazoncorretto:17
ARG APP_HOME=/opt/otus-homework
RUN mkdir $APP_HOME
WORKDIR $APP_HOME
COPY build/libs/otus-homework-6.jar $APP_HOME/otus-homework-6.jar
EXPOSE 8000
ENTRYPOINT ["java","-jar","otus-homework-6.jar"]
