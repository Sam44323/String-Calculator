# String-Calculator

**Calculates the value from the string arguments**
_Uses Junit for testing_

---

## Properties

* Empty String addition ---> returns 0
* A single string value (e.g. "100") ---> returns that number
* Two string number sum (e.g. "60,40") ---> return the sum i.e. 140
* Multiple number sum (e.g. "7,1,3,4,8") ---> returns the sum i.e. 150
* Sum of numbers separated by new lines (e.g. "10,20,30\n15\n15") ---> returns the sum i.e. 90
* Sum of numbers separated by custome delimiters(specified using //) (e.g. "//;\n10;20;30;15;15") ---> returns the sum i.e. 90
* 0 added for number greater than 1000 (e.g. "7,1,3,4,8,1001") ---> returns the sum i.e. 23
* Long custom delimeter accepted (e.g. "//[!!!]\n10!!!20!!!30!!!15!!!15") ---> returns the sum i.e. 90
* Throws error for negative value passed (e.g. "60,-1") ---> returns error i.e "Negative integer not allowed"
* Custom multiple delimiters accepted (e.g. "//[***][!!!]\n10***20***30!!!15***15") ---> returns the sum i.e. 90

---
# _Techstack_
* Java
* Junit(for testing)

---
