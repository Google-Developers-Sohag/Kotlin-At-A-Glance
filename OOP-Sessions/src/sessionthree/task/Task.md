A restaurant manager calls you once a day to build an apk that orders `main dishes`, so you accepted his job and started building a model for the core application,
a restaurant model should be based on a stable abstraction layer and proceeded with inheritance.

Your job is to build a class hierarchy of as following : 

## Step (1) :

- Build an abstract class called `Dish` and it has those abstract functions : 
  - name: String
  - salat: String
  - sideDish: String
  - price: Double
  - discount: Double
  - proteinPercentage: Double
  - numberOfDishes: Int
  
- And some implementation code for this `Dish` as follows : 
  - Fish
  - Chicken
  - Steak
  - Beef
  - Pizza
  - Oriental
  
and, finally implement the abstract fields from the parent `Dish` class and fill the data for each dish respectively.

And ofc, other delicious abstract dishes are very welcomed...!!

Each of which should be opened for further inheritance.

## Step (2) -- Optional :

For proper creating of dishes, you may build a utility class called `Menu` that has companion functions : 

- `orderFishDish(fishDish: FishDish, numberOfDishes: Int)` which creates a fish dish object and returns it based on the `FishDish` enum which contains various subtypes of fish dishes.
- `orderChickenDish(chickenDish: ChickenDish, numberOfDishes: Int)`
- `orderSteakDish(steakDish: SteakDish, numberOfDishes: Int)`
and so on.....

the beneficence of the utility class pays back when building a complex application with nested screens, for instance you could make it checks for the 
number of available dishes with the restaurant database when the user orders some food and displays a not available dialog for the user or shows him/her 
some other suggestions.
