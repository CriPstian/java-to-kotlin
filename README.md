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

TODO: Add sequence of steps to present


### Why?

    This project is a start off project to present the power of Kotlin.
    We will follow a pattern to be able to give an example for some of Kotlin's new features.

[check]: https://github.com/CriPstian/how-to-kotlin/raw/master/checkmark.png "Checked"
