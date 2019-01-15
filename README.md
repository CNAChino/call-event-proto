# call-event-proto 1.0

**call-event-proto** contains the event message model and service model written in .proto file.  The proto file is used by protobuf to generate classes that are used to implement gRPC clients and servers.  **call-event-proto** is intended to be used by https://github.com/CNAChino/call-event-service, a prototype that will serve as a reference for implementing a distributed gRPC application together with **Spring Boo**t, **Docker** and **NGINX**.

The generated class contains
* serializer and deserializer for the protobuf data
* data objects builders, setters and getters.
* grpc stubs(used by clients) and base service (a io.grpc.BindableService to be extended by service developer) 

see the following links for details about protobuf and gRPC:
* https://developers.google.com/protocol-buffers/docs/javatutorial
* https://grpc.io/docs/quickstart/java.html

## Building call-event-proto

This project uses protobuf-maven-plugin (see https://www.xolstice.org/protobuf-maven-plugin/index.html) to generate java sources from src/main/proto/*.proto 

Prerequisite:\
Install **Java 1.8 SDK**, **Git**, **Maven 3**:\
&nbsp;\
Procedure:\
Follow the following to build call-event-proto:

`$ git clone https://github.com/CNAChino/call-event-proto.git`\
`$ cd call-event-proto`\
`$ mvn clean install`

This should install call-event-proto jar file in your maven local repository.

## Call Event Service

see https://github.com/CNAChino/call-event-service