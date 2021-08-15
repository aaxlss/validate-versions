# Validate two different version
## You'll be able to send two different number of version and the system will validate which is the latest one.


you could fork or you can clone this repository using the command 
```sh
https://github.com/aaxlss/validate-versions.git
```

In order to run the system you sould download Intellij IDE communite edition from this link 
```sh
https://www.jetbrains.com/idea/download/#section=windows
```
To run the embed server, you should open the file 
```sh
RestServiceApplication.java
```
You'll find it in the next path 
```sh
src\main\java\com\example\restservice\RestServiceApplication.java
```
Finally, you'll se a green arrow, this is a functinality from the IDE, and you should click on it. The server will be starting using localhost and the port 8080.

To be able to request the API you can use postmand, where you can daowload it from the official page
```sh
https://www.postman.com/
```

using the defail url that sping is using you can request the next API and you need to inclide in the body the keys "v1" and "v2".
```sh
http://localhost:8080/versions
```

If the versions are the same. the response will be 0.
If the version 1 (v1) is greater than the version 2 (v2) the response will be 1
If the version 2 (v2) is greater than thev version 1 (v1) the response will be -1
