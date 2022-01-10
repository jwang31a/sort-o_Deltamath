# sort-o_Deltamath ()

## Best Case Scenario and Time Complexity For Each Sort
Bubble Sort:
The best case would be a sorted AL, which should be O(n) since it only iterates through the AL once, doing only constant time operations.

The worst case would be O(n^2) time, since it would have to go through the loops.
The first one starts at 0 and goes through n, and the second starts at i and finishes at n, meaning it has to swap n^2 times.

Selection sort:
The best case would be a sorted AL, which should still be slow.
It would take O(n^2) comparisons, but wouldn't swap.
This is because it has to still find the smallest remaining element in the unsorted partition, but everything is in order, so it won't have to swap.

The worst case would be O(n^2) time, since it has to iterate through the array from 0 to n, then i to n, resulting in n^2 actions, and a quadratic time complexity.

Insertion sort:
Insertion sort should be fairly similar to selection sort, due to the similarities in the algorithms, but instead of finding the lowest element in the unsorted partition, it just looks for the next element and places it where it should be in the sorted partition.

The best case would be a sorted AL, which should be O(n), because it won't have to swap, and it has to do fewer comparisons.
It has to do fewer comparisons because it will just select the next unsorted element, then compare it with the sorted elements, which is more efficient.

The worst case will be O(n^2) time, but it's still faster than selection sort, because it requires fewer comparisons, which speeds up the algorithm significantly.

## Worst Case Scenario and Time Complexity For Each Sort

## Initial hypothesis:
Bubble sort's worst case should be a reversed sorted AL (AL, in descending order).
This is because in a reverse order AL, the elements are the opposite of where they should be, and to get them to the correct location, the algorithm will need to swap a lot of times.
The best case should be a sorted AL, which should be O(n) time, since it only has to iterate through once, not swapping anything, just comparing.
On average though, the time complexity should be O(n^2), since it will have to go through multiple passes through the array, with nested loops.

Selection sort shouldn't have a worst or best case, it's just always not good.
We think this because for an AL to be considered sorted in selection sort, we have a loop that iterates through every index to find the next smallest element.
There is also another loop that will act as the number of passes, and will move on to the rest of the unsorted area of the array.
The time complexity for this should be O(n^2).

Insertion sort would likely be the best of the algorithms, since there are less swaps.
After p passes, p elements are not guaranteed to be in the right place.
It's only until length passes that all the elements are guaranteed to be in the right place.
This should be the most efficient because it requires fewer swaps than bubble sort, but also fewer comparisons than selection sort.

Not all passes between the three sorting algorithms will be the same.
For example, a pass in bubble sort will be longer, as it is an iteration through the whole array with many swaps and comparisons.
However, a pass in insertion sort will be short, consisting of only some comparisons and one swap only.

The best way to find out which sorting algorithm is best is by looking at the number of swaps and comparisons, since passes can give us unreliable information.

## C and k:
C is a constant, and for all points f(n), it must be less than or equal to C * g(n).
k
The dominant power is the only number that is important in big O notation.
