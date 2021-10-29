# Singleton Design Pattern

## Table of Contents

- [Description](#description)
- [Usage](#usage)
- [Implementation](#implentation)

## Description <a name = "description"></a>

Singleton design pattern is a pattern used in order to limit instance creation of a class to just one and use that one instance for all tasks. This is done by keeping an private static instance of own class and returning it everytime an instance is requested. The constructor is made private in order to not allow outside functions to call the constructor and create new instances.
Here the instance creation is implemented as a synchronized block in order to not allow multiple threads that detects the instance to be null at the same time, to create multiple new instances. 
Note: Making  the whole function synchronized negatively affects the performance therefore only the instance creation is implemented as a synchronized block

## Usage <a name = "usage"></a>

Singleton pattern is used in places where having multiple instances of a class doesn't make sense. 
eg :
-  services
-  connections

## Implementation <a name = "implentation"></a>

- Implement the class
- make constructor private
- create a private static instance variable of own type
- create static get instance function
    - check if instance variable is not initialized
    - if not initialized, create new self 
    - return the instance
- make the instance creation synchronized