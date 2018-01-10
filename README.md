# Java to Kotlin

Sample project to start off with my presentation.

## Default endpoints

##### Get all pets
    GET /pets
Return a List of existing hardcoded pets.

```bash
http http://localhost:8080/pets
```

Example result:

```bash
HTTP/1.1 200 
Content-Type: application/json;charset=UTF-8
Date: Wed, 10 Jan 2018 10:42:49 GMT
Transfer-Encoding: chunked

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


### Why?

    This project is a start project to present the power of Kotlin.
    We will follow a pettern to be able to give an example for some of Kotlin's new features.
