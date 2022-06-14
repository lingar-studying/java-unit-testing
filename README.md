# java-unit-testing
How to do unit tests in Java

## Task: 

Do a unit tests for simple <b>Account</b> program. 

**The program should Check some Account object.**

It should have those fields: 

Balance - the actual current money in the account. 

restricted - if it's true the account owner cannot withdraw any money from the account (but can deposit). 

maxDeviation - the maximum minus that the owner can have. By default it's 50, but the system can change it. 

The system should block any withdrawing that exceeds that amount (larger then). 

Naturally, this Object should have some methods: 

1- deposit
2- withdraw


## Your Mission

You managing some team of developers. They have to develop that piece of code, and constantly in the future to upgrade it. 

Create those objects, without the working code.
Make a prepared tests for running, on those objects and testing if it's working. 

So your developer would be able to run it and test their work. 

Do some excel with test plan. 

Try to make at least 10 test. 


### Note: TDD - Test Driven Development

The above approach called so. "test driven development." 

As it sounds, it drives the system creator to create the right program components. 
With that, when we have a prepared tests, not only we can be pretty sure that we built the right materials, 
we also can test it again in the future, in case we want to make changes that related to those components.

## TODO Process:

* Add it to the project and check if it's running.
* Create the object with empty fields and methods. 
* Prepare 10 test plan
* Implement them in the test
* Create the object so it will pass the tests




