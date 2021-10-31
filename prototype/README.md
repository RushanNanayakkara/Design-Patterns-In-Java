# Prototype Design Pattern

## Table of Contents

- [Description](#description)
- [Usage](#usage)
- [Implementation](#implentation)

## Description <a name = "description"></a>

Prototype design pattern uses deep cloning of objects that require heavy computation or time to initialize, to remove the overhead of reinitializing the new object.

## Usage <a name = "usage"></a>

Prototypes are used when ther are object types that needs to be initialized with computationaly expensive or time consuming values(eg: database calls) and those values do not change for all object instances. Here prototype design pattern uses an initially created prototype object with default values and then creates clones from that object hence removing the requirement of recomputing the values. Eventhough same can be achieved by using existing object to get the values from, this creates a bunch of problems. 
- The said values might be private in class 
- Creates a lot of boilerplate code
This can be used with  an object registry where each type of object can be registered at first creation and then that registry can provide the requesting types of objects as necessary. 

## Implementation <a name = "implentation"></a>

- Implement the class
- Implement clonable interface
- Override the clone function and create a deep copy of current object
- return the object