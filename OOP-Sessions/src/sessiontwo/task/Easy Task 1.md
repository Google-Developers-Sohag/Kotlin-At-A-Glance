## Animals hierarchy :

Your task is to build `Animal` class system. An `Animal` can categorized as a `Pet` or a `Zoo`. Either of which can have numerous type of species. 
`Species` can be of numerous names and number.

Hint : 

An `Animal` can have : 
- Sound
- Hair Color
- Weight
- Vaccinations
- Food
- LifeSpan

A `PetAnimal` is a child of Animal class and can have some extra data over the `Animal` class: 
- Price
- Clinic Name
- Pet Nickname

A `Cat` is a child of `PetAnimal` system and can have some extra features as : 
- Power of claws
- Speed

A `BombayCat` is a child of `Cat` class and can have some extra features over the Cat class : 
=> You search the features of a Bombay cat species.

A `ZooAnimal` is a child of `Animal` class and can have some extra feautres over the `Animal` class : 
- Speed
- IsPredator
- Stability
- Food type
- Ticket price

A `ZooAnimal` class can also have children classes that describe different types of animals in a Zoo 
and each type has some children classes that describe the type species.
=> You should search the types and the types' species and organize them in a class hierarchy.
