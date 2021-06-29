# Kata
Demo SpringBoot project for kata calculator It’s an incremental kata to simulate a real business situation: start of by reading the section 1 and completing it, then go onto section 2, and when you have finished that, look at section 3, etc.
                                 

## Installation
download project with GIT command 
run:  mvn clean install to generate jar 
run main class KataApplication.java like a java application  


## Usage
 we can test kata application with api rest by writing in a rest API Client like POSTMAN
 POST : http://localhost:8080/craft/kata/calculator/run
 and with adding 'numbers' like parameter 
 
 we can have the result like a response with 200 OK Status 
if there's any problem an exception will be returned 
 
 