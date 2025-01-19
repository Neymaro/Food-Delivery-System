Proje : Food Delivery System

Admin Role :
- Creating New Courier
- Can Check Courier If they are free or not

Customer :
-Can Order
-Can see their order status

Courier :
-Can see assigned orders
-Can update their order

Address & Map Logic :
- Can have address
- Can find the closest courier to their address

Model : Customer , Courier , Order , Address
Repository : CustomerRepository , CourierRepository , OrderRepository , AddressRepository
Logic / Service : Logic will be proceed here
Controller : Controller for Admin Customer and Courier

-*-*-*-*-*-*-*-*-*-*-*-*
In the model section , defining the values and their variables. ( get;set;constructor methods )
In Repository , we are choosing their data structure type ( such as List<> ) and their id matching at the end.
In Repository , we are also adding the functions that we are going to need in our projects.
In the Service we are managing the logic of the app.

