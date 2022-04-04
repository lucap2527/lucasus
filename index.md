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

**Merge Sort**
* Merge Sort is a Divide and Conquer algorithm. It divides the input array into two halves, calls itself for the two halves, and then merges the two sorted halves
* The merge() function is used for merging two halves. The merge(arr, l, m, r) is a key process that assumes that arr[l..m] and arr[m+1..r] are sorted and merges the two sorted sub-arrays into one
*  the array is recursively divided into two halves till the size becomes 1. Once the size becomes 1, the merge processes come into action and start merging arrays back till the complete array is merged.
*  This is an example flow chart of a merge sort in progress, top is the values given

![sus](https://github.com/lucap2527/lucasus/blob/gh-pages/Merge-Sort-Tutorial.png)

**Insertion Sort**
* The array is virtually split into a sorted and an unsorted part
* Values from the unsorted part are picked and placed at the correct position in the sorted part
* These are the go to steps for running a insertion sort
1. Iterate from arr[1] to arr[n] over the array
2. Compare the current element (key) to its predecessor
3. If the key element is smaller than its predecessor, compare it to the elements before. Move the greater elements one position up to make space for the swapped element
* This is an example of a insertion sort code

![image](https://github.com/lucap2527/lucasus/blob/gh-pages/Screenshot%202022-04-03%20211537.png)
