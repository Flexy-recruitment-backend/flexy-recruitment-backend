# Manage beauty institute services menu
## Context description
The services menu of a beauty institute is organized by categories and subcategories. 
  
### Example : 

* Category : 'women'

* SubCategory : 'long hair'

* Service : 'shampoo and haircut'

### Entities definition : 

A category is defined by :
 * an id
 * a label
 * a list of sub categories
 * a list of services
 
A service is defined by :
* an id
* a label
* a price

## Questions : 
### Manage services menu
The menu of the “flexy-developer-backend” institute is described in a json file (servicesMenu.json). You can find this file in the github project.

Write the java code to :
* Load the services menu into a root category
* Search services with a label that matches a given string (the path of each matched services is required)
* Search services with a price under a given threshold (the path of each matched services is required)
* Unit test the written code
 
### Manage products menu
A beauty institute also sells products. Suggest an evolution of your code so that it can handle products as well.
