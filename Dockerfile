FROM library/ubuntu:latest
FROM java:8
RUN wget http://sgjp.pl/apt/sgjp.gpg.key
RUN apt-key add sgjp.gpg.key
RUN apt-get update
RUN apt-get install software-properties-common -y
RUN add-apt-repository 'deb http://sgjp.pl/apt/ubuntu trusty main'
RUN apt-get update
RUN apt-get install libmorfeusz2 -y
RUN apt-get install libmorfeusz2-dev -y
VOLUME /tmp
ADD jmorfeusz.jar /srv/libs/jmorfeusz.jar
ADD libjmorfeusz.so /srv/libs/libjmorfeusz.so
ADD morfer_server-0.0.1-SNAPSHOT.jar /srv/app.jar
RUN sh -c 'touch /srv/app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -Djava.library.path=/srv/libs -jar /srv/app.jar" ]