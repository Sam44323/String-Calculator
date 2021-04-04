# String-Calculator

**Calculates the value from the string arguments**
_Uses Junit for testing_

---

# __Properties__

* __Empty String addition__ ----------> returns 0
* __A single string value (e.g. "100")__ ----------> returns that number
* __Two string number sum (e.g. "60,40")__ ----------> return the sum i.e. 140
* __Multiple number sum (e.g. "7,1,3,4,8")__ ----------> returns the sum i.e. 150
* __Sum of numbers separated by new lines (e.g. "10,20,30\n15\n15")__ ----------> returns the sum i.e. 90
* __Sum of numbers separated by custome delimiters(specified using //) (e.g. "//;\n10;20;30;15;15")__ ----------> returns the sum i.e. 90
* __0 added for number greater than 1000 (e.g. "7,1,3,4,8,1001")__ ----------> returns the sum i.e. 23
* __Long custom delimeter accepted (e.g. "//[!!!]\n10!!!20!!!30!!!15!!!15")__ ----------> returns the sum i.e. 90
* __Throws error for negative value passed (e.g. "60,-1")__ ----------> returns error i.e "Negative integer not allowed"
* __Custom multiple delimiters accepted (e.g. "//[***][!!!]\n10***20***30!!!15***15")__ ----------> returns the sum i.e. 90

---
# _Techstack_
* Java
* Junit(for testing)

---
