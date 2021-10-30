# Builder Design Pattern

## Table of Contents

- [Description](#description)
- [Usage](#usage)
- [Implementation](#implentation)

## Description <a name = "description"></a>

Builder design pattern is used to create immutable objects that either has large amount of attributes or has both required and optional attributes. 
Builder pattern prevents the instances being created from the object constructor and passes that responsibility to a builder class. 
The builder class takes required attributes for the object and provides functions to set the optional variables.
It also provides a build method where finally the required object instance will be returned. 

## Usage <a name = "usage"></a>

Builder pattern is used to create immutable objects(if not immutable this can be done using constructor and setters) that has either large amount of attributes
or both required and optional attributes. Using a builder allows the code to be more readable and maintainable. 
eg : 
- A user object has large amount of attributes. Passing all attributes to the constructor makes code highly unreadable. 
- If these values are to be set using setters after creating the object, it makes the object mutable and leaves the object in an incomplete state in the middle of setter calls.
- The builder pattern first creates a UserBuilder object with required attributes and then with setters collects the optional attributes. 
Finally with the build function the builder object creates  and returns in instance of the intended object type.

An object can have multiple builders assigned to it for different configurations of the object type.
eg : 
- Local user has a different set of required attributes to openid users. Two builders can be created for user class in order to build this two different types.

## Implementation <a name = "implentation"></a>

- Builder class can be implemented as a static(builder should be accessible without creating a parent instance) inner class or a separate class.
However an inner static class is prefered due to the tight relationship between the two classes.

#### Steps 
- Make parent class
- Make parent constructor private (so that it can only be created using builder. if using separate builder class file use appropiate access modifier)
- Implement builder class 
- Make builder constructor accept required  attributes
- Implement setter methods for all optional attributes
- Implement build method which creates a parent class object instance.