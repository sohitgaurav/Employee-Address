# Employee-Address
my sql workbeach @One to one mapping annotation
## Framework and language used
* Springboot
* java

## dependency used
 * dev
 * web
 * lombok
 * my sql  server driver
 * jpa
 * spring boot starter data jpa 

## Data Flow

### Model
* Employ
   *  Long id
   *  String First Name
   *  string last name
   *  Address address

* Address
   *  Long id
   *  String street
   *  string last name
   *  address(Address) 

### EmployController
* @GetMapping  
    * employ
    
    
* @PostMapping
    * employ
* @DeleteMapping
   * /deleteemploy/{id}


*  @Putmapping 
    * updateDepartment/{department}/id/{id}

### AddressService
 

### EmployRepository

### AddressRepository



### Database used
* my sql  workbench

##  About Project
* this Project is the about information about users and address
