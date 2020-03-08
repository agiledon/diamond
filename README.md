# Diamond Symmetry Architecture

The pattern of Diamond Symmetry Architecture is based on Clean Architecture provided by Robert Martin, and borrowed some idea from Hexagon and Layered Architecture. This pattern should be recognized as DDD(Domain-Driven Design) pattern which is used in the strategic design phase. It can help us to create the clean architecture on bounded context level.

Diamond Symmetry Architecture suggests the whole bounded context should be composed by inner domain layer and outer gateway layers. According to the different direction of invoking request, the outer gateway layers contains the northbound gateway and the southbound gateway. Here is the diagram of this pattern:
![Diamond Symmetry Architecture](/doc/images/diamond.png)


