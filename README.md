# cdi2-se-example
created my first weld java se cdi 2.0 tiny application.

# run immediately

```
# mvn clean package exec:java
```

# complile and execute jar file

following valid pom.xml 
```
	<build>
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-assembly-plugin</artifactId>
				<version>2.5.2</version>
				<configuration>
					<descriptorRefs>
						<descriptorRef>jar-with-dependencies</descriptorRef>
					</descriptorRefs>
					<appendAssemblyId>false</appendAssemblyId>
					<archive>
						<manifest>
							<mainClass>eternal.hoge.cdi2.se.example.Main</mainClass>
							<addClasspath>true</addClasspath>
							<addExtensions>false</addExtensions>
							<classpathPrefix></classpathPrefix>
						</manifest>
					</archive>
				</configuration>
				<executions>
					<execution>
						<id>make-assembly</id>
						<phase>package</phase>
						<goals>
							<goal>single</goal>
						</goals>
					</execution>
				</executions>
			</plugin>
		</plugins>
	</build>
```

create jar file.
```
# mvn clean install
```

execute jar file.
```
# java -jar .\target\cdi-j2se-1.0-SNAPSHOT.jar
```

