Started the new course from Udemy of the same teache Zaur Tregulov.
This course is for people who has already studied java but not confident about the some difficult topics.
iys started with the topic "Comparable and comparator".
Comparable vs Comparator in Java

When we need to sort objects in Java, there are two main approaches: Comparable and Comparator.

Comparable

Comparable is used when an object has a natural ordering.
For example: numbers are sorted in ascending order, strings — alphabetically.

To define this order, a class implements the Comparable interface and overrides the method:

compareTo(T o)

This method compares the current object with another one:

returns a negative number → if the current object is less than the other
returns 0 → if they are equal
returns a positive number → if the current object is greater

Example: sorting users by age.

👉 Important: with Comparable, you can define only one sorting order.

Comparator

Comparator is used when:

you need multiple sorting strategies
or you cannot modify the original class (for example, it comes from a library)

Here, you create a separate comparator object with the method:

compare(T o1, T o2)

It compares two objects:

returns a negative number → if the first object is less than the second
returns 0 → if they are equal
returns a positive number → if the first object is greater

Examples:

sorting users by name
by age
by registration date

👉 With Comparator, you can create as many sorting strategies as you need.

Key Differences
Comparable	Comparator
Defined inside the class	Defined outside the class
Single sorting logic	Multiple sorting strategies
compareTo() method	compare() method
Summary
Comparable → use when there is a single natural order
Comparator → use when you need flexibility and multiple ways to sort
