# sort-o_Deltamath

## Best Case Scenario For Each Sort

## Worst Case Scenario For Each Sort

## Initial hypothesis:
Selection sort shouldn't have a worst or best case, it's just always not good.
We think this because for an AL to be considered sorted in selection sort, we have a loop that iterates through every index to find the next smallest element.
There is also another loop that will act as the number of passes, and will move on to the rest of the unsorted area of the array.
The time complexity for this should be O(n^2).

Bubble sort's worst case should be a reversed sorted AL (AL, in descending order).
This is because in a reverse order AL, the elements are the opposite of where they should be, and to get them to the correct location, the algorithm will need to swap a lot of times.
The best case should be a sorted AL, which should be O(n) time, since it only has to iterate through once, not swapping anything, just comparing.
On average though, the time complexity should be O(n^2), since it will have to go through multiple passes through the array, with nested loops.

Insertion sort would likely be the best of the algorithms, since there are less swaps.
After p passes, p elements are not guaranteed to be in the right place.
It's only until length passes that all the elements are guaranteed to be in the right place.
This should be the most efficient because it requires fewer swaps than bubble sort, but also fewer comparisons than selection sort.

Not all passes between the three sorting algorithms will be the same.
For example, a pass in bubble sort will be longer, as it is an iteration through the whole array with many swaps and comparisons.
However, a pass in insertion sort will be short, consisting of only some comparisons and one swap only.

The best way to find out which sorting algorithm is best is by looking at the number of swaps and comparisons, since passes can give us unreliable information.
