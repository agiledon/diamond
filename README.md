# Rhombic Symmetric Architecture

The pattern of Rhombic Symmetric Architecture which nickname is "diamond" is based on Clean Architecture provided by Robert Martin, and borrowed some idea from Hexagon and Layered Architecture. This pattern should be recognized as DDD(Domain-Driven Design) pattern which is used in the strategic design phase. It can help us to create the clean architecture on bounded context level.

Rhombic Symmetric Architecture suggests the whole bounded context should be composed by inner domain layer and outer gateway layers. According to the different direction of invoking request, the outer gateway layers contains the northbound gateway and the southbound gateway. Here is the diagram of this pattern:
![Rhombic Symmetric Architecture](/doc/images/rhombic.png)

The components of Rhombic Symmetric Architecture and their descriptions are as below:
* Domain: It contains domain model composed by domain services, aggregates(entities and value objects) and domain events
* Northbound Gateway: It embodies the OHS(Open Host Service) pattern of context mapping, and contains:
	* remote: It provides the remote services which can be called across processes via RPC, HTTP, AMOP protocols etc.
	* local: In fact, it's an application service in DDD layered architecture. At the same time, it also contains message contracts which demonstrate the Published Language pattern of context mapping.
* Southbound Gateway: It embodies the ACL(Anti-Corruption Layer) pattern of context mapping, and contains:
	* port: It is the abstract layer which provides the access ports to the external environments including DB, files, network, and other bounded contexts. 
	* adapter: It is the implementation of the port.       	


