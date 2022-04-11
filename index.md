## Build a GitHub page that describes Sort implementations and the Big O complexity of these Sorts ## 
**Big O Complexity**
* Big O notation is one of the most fundamental tools for computer scientists to analyze the cost of an algorithm. It is a good practice for software engineers to understand in-depth as well.
* Big O notation is a mathematical notation that describes the limiting behavior of a function when the argument tends towards a particular value or infinity
* Big O notation describes the complexity of your code using algebraic terms, with respect to the input size
* This is the formal definition of the Big O

![baka](https://github.com/lucap2527/lucasus/blob/gh-pages/Screenshot%202022-04-03%20210457.png)

**Selection Sort**
* The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array
* In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray
* This is a different seperate sorting process as the others described
* It has an O(n2) time complexity, which makes it inefficient on large lists, and generally performs worse than the similar insertion sort


**Merge Sort**
* Merge Sort is a Divide and Conquer algorithm. It divides the input array into two halves, calls itself for the two halves, and then merges the two sorted halves
* The merge() function is used for merging two halves. The merge(arr, l, m, r) is a key process that assumes that arr[l..m] and arr[m+1..r] are sorted and merges the two sorted sub-arrays into one
*  the array is recursively divided into two halves till the size becomes 1. Once the size becomes 1, the merge processes come into action and start merging arrays back till the complete array is merged.
*  This is an example of a merge sort

![susy](https://github.com/lucap2527/lucasus/blob/gh-pages/Screenshot%202022-04-03%20214209.png)

*  Overall time complexity of Merge sort is O(nLogn), Space complexity is O(n)
*  This is an example flow chart of a merge sort in progress, top is the values given

![sus](https://github.com/lucap2527/lucasus/blob/gh-pages/Merge-Sort-Tutorial.png)

**Insertion Sort**
* The array is virtually split into a sorted and an unsorted part
* Values from the unsorted part are picked and placed at the correct position in the sorted part
* The time complexity of the best case is O(N), space complexity is O(1), worst case time complexity is O(N^2) and average case time complexity is O(N^2)
* These are the go to steps for running a insertion sort
1. Iterate from arr[1] to arr[n] over the array
2. Compare the current element (key) to its predecessor
3. If the key element is smaller than its predecessor, compare it to the elements before. Move the greater elements one position up to make space for the swapped element
* This is an example of a insertion sort code

![image](https://github.com/lucap2527/lucasus/blob/gh-pages/Screenshot%202022-04-03%20211537.png)

**Bubble Sort**
* Simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order
* Bubble sort is often used to introduce the concept of a sorting algorithm
* In computer graphics it is popular for its capability to detect a very small error
* Works by sorting one value at a time, for example if you are running a sort to sort it by least to greatest (5,1,3) will turn into (1,5,3) on the first pass because it only goes one at a time
* This is an example of bubble sort code

![image2](https://github.com/lucap2527/lucasus/blob/gh-pages/Screenshot%202022-04-03%20213818.png)

* This is an example of a bubble sort pass through 
* This algorithm has a worst-case time complexity of O(n2). The bubble sort has a space complexity of O(1).


![image1](https://github.com/lucap2527/lucasus/blob/gh-pages/Screenshot%202022-04-03%20211911.png)

**Analytics**
* Below is the summarized data from 12 trials of each sort type
* Each trial includes a given 5000 elements per sort run
* Below is what the data looks like after running 1 sort trial

![image2](https://github.com/lucap2527/lucasus/blob/gh-pages/Screenshot%202022-04-03%20212421.png)

* The Analytical data is as follows:
1. Bubble Sort - 112000423 Nanoseconds Average Random - 298
2. Selection Sort - 89814213 Nanoseconds Average Rnadom - 273
3. Insertion Sort - 79342132 Nanoseconds Average Random - 189
4. Merge Sort - 91234121 Nanoseconds Average random - 255

* As we can see by the data given above the fastest average time on my 12 attempts was the Insertion Sort which ran at 79342132 average, calculated by adding all the times and dividing by 12, same for the randoms.

## Comp Sci Challenge Learnings ##
* a LinkedList acts as a dynamic array and we do not have to specify the size while creating it, the size of the list automatically increases when we dynamically add and remove items. And also, the elements are not stored in a continuous fashion. Therefore, there is no need to increase the size. Internally, the LinkedList is implemented using the doubly linked list data structure. The main difference between a normal linked list and a doubly LinkedList is that a doubly linked list contains an extra pointer, typically called the previous pointer, together with the next pointer and data which are there in the singly linked list. 

![money](https://github.com/lucap2527/lucasus/blob/gh-pages/Screenshot%202022-03-20%20202958.png)
## Point 1 ##
* Generics means parameterized types. The idea is to allow type (Integer, String, … etc., and user-defined types) to be a parameter to methods, classes, and interfaces. Using Generics, it is possible to create classes that work with different data types. An entity such as class, interface, or method that operates on a parameterized type is a generic entity.
* The Object is the superclass of all other classes, and Object reference can refer to any object. These features lack type safety. Generics add that type of safety feature. We will discuss that type of safety feature in later examples. Generics in Java are similar to templates in C++. For example, classes like HashSet, ArrayList, HashMap, etc., use generics very well. There are some fundamental differences between the two approaches to generic types. 
![sus](https://github.com/lucap2527/lucasus/blob/gh-pages/Screenshot%202022-03-20%20203333.png)
## Point 2 ##
* The Queue interface present in the java.util package and extends the Collection interface is used to hold the elements about to be processed in FIFO(First In First Out) order. It is an ordered list of objects with its use limited to insert elements at the end of the list and deleting elements from the start of the list, (i.e.), it follows the FIFO or the First-In-First-Out principle.
* The remove() method of Queue Interface returns and removes the element at the front the container. It deletes the head of the container. The method throws an NoSuchElementException when the Queue is empty.
![amogus](https://github.com/lucap2527/lucasus/blob/gh-pages/Screenshot%202022-03-20%20203734.png)
* In order to add an element in a queue, we can use the add() method. The insertion order is not retained in the PriorityQueue. The elements are stored based on the priority order which is ascending by default. 
![amogus](https://github.com/lucap2527/lucasus/blob/gh-pages/Screenshot%202022-03-20%20203709.png)
## Point 3 ##
* In order to merge 2 queues there is a list of steps you must go through:
1) Make pointers for both of the queues.
2) Make another queue, add the node having least value from the other two queues(the pointer's node having the smallest value) to it and move that pointer to the next node.
3) Again compare the node's values and add the node having the smallest value to the queue and move that pointer to the next node.
4) Keep doing this until rear of both the queues are reached.

![bear](https://github.com/lucap2527/lucasus/blob/gh-pages/Screenshot%202022-03-20%20204429.png)
## Point 4 ##
* For reversing the queue one approach could be to store the elements of the queue in a temporary data structure in a manner such that if we re-insert the elements in the queue they would get inserted in reverse order. So now our task is to choose such data-structure which can serve the purpose. According to the approach, the data-structure should have the property of ‘LIFO’ as the last element to be inserted in the data structure should actually be the first element of the reversed queue. The stack could help in approaching this problem. This will be a two-step process: 
1. Pop the elements from the queue and insert into the stack. (Topmost element of the stack is the last element of the queue)
2. Pop the elements of the stack to insert back into the queue. (The last element is the first one to be inserted into the queue)

![duck](https://github.com/lucap2527/lucasus/blob/gh-pages/Screenshot%202022-03-20%20204651.png)
## Point 5 ##
* There is a multitude of different functions one can perform with a stack, and with these are pretty much endless possibilities as to what you can do with these functions:
1. push (to add a new item to the top)
2. pop (to remove the most top item)
3. peek (to get the most top item)
4. isEmpty (to check whether the stack is empty)
5. size (to get the size of the stack)
6. search (to search for objects)
* Here's an example of some functions above at work:
![deer](https://github.com/lucap2527/lucasus/blob/gh-pages/Screenshot%202022-03-20%20205017.png)

