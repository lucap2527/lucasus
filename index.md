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
*  This is an example of bubble sort code

![image1](https://github.com/lucap2527/lucasus/blob/gh-pages/Screenshot%202022-04-03%20211911.png)

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
