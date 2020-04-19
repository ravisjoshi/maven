docker run --rm -d --name sonarqube -p 9000:9000 sonarqube

mvn clean
mvn clean install
mvn sonar:sonar -s ./settings.xml

## Note, you won't be able to run both sonarqube & nexus together, as both need quite some memory

docker run --rm -d --name nexus -p 8081:8081 -p 8082:8082 -p 8083:8083 -v /Users/ac31613/Testing/nexus-data:/nexus-data sonatype/nexus3
mvn clean
mvn clean install
mvn deploy -s ./settings.xml
