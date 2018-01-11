# Java to Kotlin

Sample project to start off with my presentation.

### ![check] Points to cover
* [Java interoperability](https://kotlinlang.org/docs/reference/java-interop.html)
* Type inference
* Smart cast
* Method references
* inline if-else and try-catch
* Expression body methods
* Default closed classes
* Null safety
* Default parameters and named parameters
* Infix methods
* Extension functions
* String templates
* Compile time constants using `const`
* Lateinit and Delegated properties
* [Operator overloading](https://kotlinlang.org/docs/reference/operator-overloading.html)
* Arrays
* Collections
* Object expressions and declarations (Singleton, anonymous objects etc.)
* [Range expressions](https://kotlinlang.org/docs/reference/ranges.html)
* [Data classes](https://kotlinlang.org/docs/reference/data-classes.html)
* [Higher-Order Functions and Lambdas](https://kotlinlang.org/docs/reference/lambdas.html)

## Default endpoints

#### GET /pets
```bash
$ http http://localhost:8080/pets
```

Return a List of all existing hardcoded pets.

Example result:

```json
[
    {
        "age": 3, 
        "breed": "Doggo", 
        "color": "ORANGE", 
        "id": 1, 
        "name": "Capy", 
        "size": "SMALL"
    }, 
    {
        "age": 4, 
        "breed": "Kitty", 
        "color": "BLACK", 
        "hasFur": true, 
        "id": 2, 
        "name": "Tom", 
        "size": "MEDIUM"
    }
]
```
---

#### GET /pets/dogs
```bash
$ http http://localhost:8080/pets/dogs
```
Return a List of all existing hardcoded dogs.

Example result:
```json
[
    {
        "age": 3, 
        "breed": "Doggo", 
        "color": "ORANGE", 
        "id": 1, 
        "name": "Capy", 
        "size": "SMALL"
    }
]
```
---
#### GET /pets/cats
```bash
$ http http://localhost:8080/pets/cats
```

Return a List of all existing hardcoded cats.

Example result:

```json
[
    {
        "age": 4, 
        "breed": "Kitty", 
        "color": "BLACK", 
        "hasFur": true, 
        "id": 2, 
        "name": "Tom", 
        "size": "MEDIUM"
    }
]
```
---
#### POST /pets/dog
```bash
$ http POST http://localhost:8080/pets/dog id:=100 name="Dogger" age:=14 breed="Dogger" color="WHITE" size="SMALL"
```

Post a new dog in the pet array

---
#### POST /pets/cat
```bash
$ http POST http://localhost:8080/pets/cat id:=100 name="Tommy" age:=5 breed="Kitty" color="BLACK" size="SMALL" 
hasFur:=true
```

Post a new cat in the pet array

### Install kotlin and compile example

##### How to install

```bash
$ # install sdkman
$ curl -s https://get.sdkman.io | bash
$ # install kotlin
$ sdk install kotlin    
```
##### Run in console
```bash
$ # Start in console
$ kotlinc
Welcome to Kotlin version 1.2.10 (JRE 1.8.0_45-b14)
Type :help for help, :quit for quit
>>> // Run simple command
>>> println("Hello World")
>>> // Exit
>>> :quit
```
##### Run a script
```bash
$ # Write the simplest script prossible
$ echo 'println("Hello World")' >> SimpleScript.kts
$ # Run example
$ kotlinc -script SimpleScript.kts
```
##### Run as a java JAR

```bash
$ # Write the simplest program possible
$ echo 'fun main(args: Array<String>) = println("Hello World")' >> HelloWorld.kt
$ # generate jar
$ kotlinc HelloWorld.kt -include-runtime -d hello-world.jar
$ # run program
$ java -jar hello-world.jar
```

### Steps
1. Clone this repository from [GitHub](https://github.com/CriPstian/java-to-kotlin.git) and run `mvn spring-boot:run`
 in the console to show nice banner
2. Present current project and show `curl` examples
3. Add `kotlin` support using IDEA

    Project Structure -> Modules -> Add Kotlin

    Tools -> Kotlin -> Configure Kotlin in Project
    
    this will add the following in the maven pom file
    
```xml
<project>
    <properties>
        <!-- ... OTHER PROPERTIES ... -->
        <kotlin.version>1.2.10</kotlin.version>
    </properties>
    <dependencies>
        <!-- ... OTHER DEPENDECIES ... -->
        <!-- Target java version 1.8 (other: 1.6, 1.7) -->
        <dependency>
            <groupId>org.jetbrains.kotlin</groupId>
            <artifactId>kotlin-stdlib-jdk8</artifactId>
            <version>${kotlin.version}</version>
        </dependency>
        <!-- LATER EDIT: For jackson -->
        <dependency>
            <groupId>com.fasterxml.jackson.module</groupId>
            <artifactId>jackson-module-kotlin</artifactId>
        </dependency>
        <!-- LATER EDIT: Make classes default open for spring to do it's job -->
        <dependency>
            <groupId>org.jetbrains.kotlin</groupId>
            <artifactId>kotlin-maven-allopen</artifactId>
            <version>${kotlin.version}</version>
        </dependency>
        <!-- Kotlin test framework -->
        <dependency>
            <groupId>org.jetbrains.kotlin</groupId>
            <artifactId>kotlin-test</artifactId>
            <version>${kotlin.version}</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
    
    <build>
        <plugins>
            <!-- ... OTHER PLUGINS ... -->
            <plugin>
                <groupId>org.jetbrains.kotlin</groupId>
                <artifactId>kotlin-maven-plugin</artifactId>
                <version>${kotlin.version}</version>
                <executions>
                    <execution>
                        <id>compile</id>
                        <phase>compile</phase>
                        <goals>
                            <goal>compile</goal>
                        </goals>
                    </execution>
                    <execution>
                        <id>test-compile</id>
                        <phase>test-compile</phase>
                        <goals>
                            <goal>test-compile</goal>
                        </goals>
                    </execution>
                </executions>
                <configuration>
                    <jvmTarget>1.8</jvmTarget>
                    <!-- LATER EDIT: To help spring with kotlin -->
                    <compilerPlugins>
                        <plugin>spring</plugin>
                    </compilerPlugins>
                </configuration>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <executions>
                    <execution>
                        <id>compile</id>
                        <phase>compile</phase>
                        <goals>
                            <goal>compile</goal>
                        </goals>
                    </execution>
                    <execution>
                        <id>testCompile</id>
                        <phase>test-compile</phase>
                        <goals>
                            <goal>testCompile</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
        </plugins>
    </build>
</project>
```
4. Create `kotlin` directory and mark as source root. Build project.

5. For kotlin and spring integration we must add the spring-kotlin plugin.

6. For Jackson Kotlin classes support please add `com.fasterxml.jackson.module:jackson-module-kotlin` to the classpath.

### Why?

    This project is a start off project to present the power of Kotlin.
    We will follow a pattern to be able to give an example for some of Kotlin's new features.

[check]: https://github.com/CriPstian/how-to-kotlin/raw/master/checkmark.png "Checked"
