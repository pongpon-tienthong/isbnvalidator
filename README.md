### TDD Training: ISBN Validator

#### Getting Started
1. Go to your project directory
2. Build your project
```
./gradlew build  
```

#### Running Unit Test
Option 1: Use your IDE (recommended)

![alt text](https://github.com/pongpon-tienthong/isbnvalidator/raw/master/images/runningJunit.png)

Option 2: Use gradlew (not recommended)
```
./gradlew test
```
#### Requirement
* Create an ISBN validator class which has a validate method
* It should return true if the ISBN is valid, return false if the ISBN is invalid.
* ISBN can contain only 10 (XXXXXXXXXX) or 13 digits (XXX-XXXXXXXXXX)
* 10 digit ISBN will be valid if it satisfies this formular
![alt text](https://github.com/pongpon-tienthong/isbnvalidator/raw/master/images/10DigitFormula.png)
![alt text](https://github.com/pongpon-tienthong/isbnvalidator/raw/master/images/10DigitExample.png)

[Ref: International Standard Book Number (ISBN](https://en.wikipedia.org/wiki/International_Standard_Book_Number)

#### Test Data

