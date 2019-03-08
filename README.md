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
* It should return true if the ISBN is valid, return false if the ISBN is invalid
* ISBN can contain only 10 (XXXXXXXXXX) or 13 digits (XXX-XXXXXXXXXX)
* 10 digit ISBNs will be valid if it satisfies this formula
![alt text](https://github.com/pongpon-tienthong/isbnvalidator/raw/master/images/10DigitFormula.png)
![alt text](https://github.com/pongpon-tienthong/isbnvalidator/raw/master/images/10DigitExample.png)
* 13 digit ISBNs will be valid if it satisfies this formula
![alt text](https://github.com/pongpon-tienthong/isbnvalidator/raw/master/images/13DigitFormula.png)
* Both 10 and 13 digit ISBN can also end with 'X' which is equal to 10.

[Ref: International Standard Book Number (ISBN)](https://en.wikipedia.org/wiki/International_Standard_Book_Number)

#### Test Data
10 Digit ISBN
* 0998406260
* 0553384619
* 1501135910
* 012000030X

13 Digit ISBN
* 978-0998406268
* 978-0553384611
* 978-1501135910

#### References
* https://agiledeveloper.com/presentations/benefits_of_tdd.pdf
* http://cecs.wright.edu/~pmateti/Courses/7140/Lectures/Testing/TDD/tdd-calpoly-slides.pdf
* https://pdfs.semanticscholar.org/presentation/ba62/a5f96a0eab94a18766fdd10c91cb02d4630c.pdf
* https://www.udemy.com/practical-test-driven-development-for-java-programmers/learn/v4/content
