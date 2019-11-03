# Manage beauty institut services menu
## Context description
The services menu of a beauty institut is organized by categories and subcategories. 
  
### Example : 

* Category : 'women'

* SubCategory : 'long hair'

* service : 'shampoing and cut'

### Entities definition : 

A category is characterized by :
 * an id,
 * a label,
 * a list of sub categories,
 * a list of services.
 
A service is characterized by :
* an id, 
* a label,
* a price.

## Questions : 
### Manage services menu
The menu of the “flexy-developper-backend” institut is described in a json file (servicesMenu.json) you will found in the git-hub project.

Write the java code in order to :
* Load the services menu into a root category
* Search services whose label match a given string (the path of each matched services is required)
* Search services whose price is under a threshold (the path of each matched services is required)
* Test unitary the different written functions

### Manage products menu
A beauty institut sells products too. Propose a code evolution, in order to manage product menu.
