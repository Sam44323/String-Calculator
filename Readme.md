# String-Calculator

**Calculates the value from the string arguments**
_Uses Junit for testing_

---

## Properties

* _Empty String addition ---> returns 0_
* _A single string value (e.g. "100") ---> returns that number_
* _Two string number sum (e.g. "60,40") ---> return the sum i.e. 140_
* _Multiple number sum (e.g. "7,1,3,4,8") ---> returns the sum i.e. 150_
* _Sum of numbers separated by new lines (e.g. "10,20,30\n15\n15") ---> returns the sum i.e. 90_
* _Sum of numbers separated by custome delimiters(specified using //) (e.g. "//;\n10;20;30;15;15") ---> returns the sum i.e. 90_
* _0 added for number greater than 1000 (e.g. "7,1,3,4,8,1001") ---> returns the sum i.e. 23_
* _Long custom delimeter accepted (e.g. "//[!!!]\n10!!!20!!!30!!!15!!!15") ---> returns the sum i.e. 90_
* _Throws error for negative value passed (e.g. "60,-1") ---> returns error i.e "Negative integer not allowed"_
* _Custom multiple delimiters accepted (e.g. "//[***][!!!]\n10***20***30!!!15***15") ---> returns the sum i.e. 90_

---
# _Techstack_
* Java
* Junit(for testing)

---
