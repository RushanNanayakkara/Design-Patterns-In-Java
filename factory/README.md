# Factory Design Pattern

## Table of Contents

- [Description](#description)
- [Usage](#usage)
- [Implementation](#implentation)

## Description <a name = "description"></a>

Factory design pattern is a pattern where a single factory class is used to create multiple object types which share a common ancestor. The factory takes in the type of object to be created and the required parameters, then creates the requested object and returns. This allows more abstraction in the code and improves maintainability since if one class is to be changed, only the factory class implementation has to change. 

## Usage <a name = "usage"></a>

Factory pattern is used in places where there are different child type objects of a parent class need to be created. 
eg: 
- parent class is a vehicle class, upon request different vehicle types neeed to be created. Using the factory pattern, at the places in code where vehicles are created, only the facotry class is called(if factory is not used each time a vehicle is created the original class constructor needs to be called). 
- if a vehicle class needs to be changed (need to use Ferrari class instead of Bugatti for cars), in factory implementation a simple change in the factory class is sufficient  to change the code. 
- However if factory pattern was not used each line where a car was created using "Bugatti" class needs to be changed. 
- A more practical usage is when using layered architecture each layer can use a factory to create the current layer instances for the upper layer. This  way (with the help of interfaces) each layer can be independantly maintained.

## Implementation <a name = "implentation"></a>

- Create factory class
- create types enum
- implement getInstance method
    - params : type(enum) and optionally other required params
    - return : instance of requested object type