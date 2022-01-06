# sort-o_Deltamath

## Best Case Scenario For Each Sort

## Worst Case Scenario For Each Sort

## Initial hypothesis:
Selection sort doesn't have a worst or best case, it's just always not good.
We think this because for an AL to be considered sorted in selection sort, we have to iterate through every index

Bubble sort's worst case would be a reversed sorted AL.
This is because in a reverse order AL, the elements are at the opposite of where they should be, and to get them to the correct location, the algorithm will need to swap a lot of times.
Not only that, but it moves the more extreme elements to the wrong place.

Insertion sort would likely be the best of the three algorithms, since there are less swaps going on.
After one pass, the elements are not guaranteed to be in the right place, but it at least is more correct, so it will take less computer resources later on.
The worst case scenario for this would also be a reversed ArrayList, but it's faster than bubble sort because it requires less swaps.

They should all take the same number of passes, but not all passes will be the same for each algorithm.
Depending on the state of the AL, each pass will require a different number of swaps.
