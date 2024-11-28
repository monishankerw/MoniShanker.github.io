   SET
       https://www.geeksforgeeks.org/set-in-java/
          extends            extends                implement
       set--------->SortedSet---------->NavigableSet----------->TreeSet


       Set:
       ---> HashSet, TreeSet,LinkedHashSet
       ----> It is an interface
       ----->java.util package
       ----->Does not maintain any insertion order
       ---->Can not allow to duplicate value.
       ---->Set can store only one null value.
       ---->Not index based data structure store the data HashCode values.




List vs Set
List:
1. ArrayList and LinkedList
2. allow to store duplicate value.
3. Index based data structure.
4. List can store any value of null value.

Set

1. HashSet and TreeSet
2. not allow to store duplicate value.
3. not index based data structure store the data Hashcode value.
4. Set can store any one null value.

Here are multiple-choice questions (MCQs) based on the Set interface, its hierarchy, and the differences between List and Set in Java:

Set Basics

	1.	Which of the following is a characteristic of the Set interface in Java?
	•	A. Allows duplicate values.
	•	B. Maintains insertion order.
	•	C. Only allows one null value.
	•	D. Is index-based.
Answer: C. Only allows one null value.
2.	Which Java package contains the Set interface?
•	A. java.lang
•	B. java.io
•	C. java.util
•	D. java.collections
Answer: C. java.util
3.	Which of the following implementations of Set maintains a sorted order of elements?
•	A. HashSet
•	B. LinkedHashSet
•	C. TreeSet
•	D. ArrayList
Answer: C. TreeSet
4.	Which of these statements is true about HashSet?
•	A. It allows duplicate values.
•	B. It maintains insertion order.
•	C. It is index-based.
•	D. It is not index-based and uses hash code values to store elements.
Answer: D. It is not index-based and uses hash code values to store elements.
5.	How many null values can a Set store?
•	A. Multiple
•	B. One
•	C. None
•	D. Depends on the implementation
Answer: B. One

Set Hierarchy and Classes

	6.	Which of the following classes extends NavigableSet?
	•	A. TreeSet
	•	B. HashSet
	•	C. LinkedHashSet
	•	D. ArrayList
Answer: A. TreeSet
7.	Which interface does SortedSet extend in Java?
•	A. Collection
•	B. List
•	C. NavigableSet
•	D. Set
Answer: D. Set
8.	What ordering does LinkedHashSet maintain?
•	A. Sorted order
•	B. Natural order
•	C. No specific order
•	D. Insertion order
Answer: D. Insertion order
9.	What type of data structure does HashSet use internally?
•	A. Array
•	B. Linked list
•	C. Hash table
•	D. Binary tree
Answer: C. Hash table
10.	Which of the following is NOT a Set implementation in Java?
•	A. HashSet
•	B. TreeSet
•	C. LinkedHashSet
•	D. ArrayList
Answer: D. ArrayList

List vs Set

	11.	Which of the following data structures allows duplicate values?
	•	A. Set
	•	B. List
	•	C. TreeSet
	•	D. HashSet
Answer: B. List
12.	Which of the following is an index-based data structure?
•	A. Set
•	B. TreeSet
•	C. List
•	D. HashSet
Answer: C. List
13.	How many null values can a List hold?
•	A. None
•	B. One
•	C. Multiple
•	D. Unlimited
Answer: C. Multiple
14.	What is the main difference between a List and a Set?
•	A. List maintains insertion order, Set does not.
•	B. Set is index-based, List is not.
•	C. List does not allow duplicates, while Set does.
•	D. Set uses hash code values to store elements, List is index-based.
Answer: D. Set uses hash code values to store elements, List is index-based.
15.	Which of the following classes allows duplicate elements?
•	A. ArrayList
•	B. HashSet
•	C. TreeSet
•	D. LinkedHashSet
Answer: A. ArrayList

Set Specifics

	16.	Which of these is NOT a feature of Set?
	•	A. Allows duplicate elements
	•	B. Not index-based
	•	C. Can store one null value
	•	D. Uses hash codes to store data in HashSet
Answer: A. Allows duplicate elements
17.	Which of the following would be suitable for maintaining a collection of unique elements without any specific order?
•	A. ArrayList
•	B. LinkedList
•	C. HashSet
•	D. TreeSet
Answer: C. HashSet
18.	Which method is used to add elements to a Set?
•	A. insert()
•	B. put()
•	C. add()
•	D. addAt()
Answer: C. add()
19.	Which implementation would you choose to maintain a sorted set of elements?
•	A. HashSet
•	B. TreeSet
•	C. LinkedHashSet
•	D. ArrayList
Answer: B. TreeSet
20.	If you want to ensure that no duplicate values are stored, but also want to maintain the insertion order, which Set implementation would you use?
•	A. HashSet
•	B. LinkedHashSet
•	C. TreeSet
•	D. PriorityQueue
Answer: B. LinkedHashSet
