# Proxy Design Pattern

## Table of Contents

- [Description](#description)
- [Usage](#usage)
- [Implementation](#implentation)

## Description <a name = "description"></a>

Proxy design pattern is a structural design pattern. This is used to add control to access and responces for some sections of the code. Proxy class acts as the middle man, intercepts the requests to protected code segment and runs the logic implementated.

## Usage <a name = "usage"></a>

Proxy design pattern can be used to controll access, controll responces and any other logic that are required to be followed when generating responses from a code segment. Multiple proxies can be implemented for the same code segment where a proxy applier can be used to run the requests through all proxies. 

## Implementation <a name = "implentation"></a>

- Create an interface that represents protected class functionality and implement it in the class being protected
- Create the proxy class and implement the same interface as protected class
- Implement each function call in the proxy class. 
- In each function in function implement the logic for request and response restriction before calling and responding from protected class
- Use the proxy(if proxy applier exists use that) in place of the protected class in your implementation.