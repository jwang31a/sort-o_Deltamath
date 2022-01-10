import java.util.ArrayList;

public class Driver {
  public static ArrayList populate( int size, int lo, int hi ) {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      //     offset + rand int on interval [lo,hi]
      retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al ) {
    int randomIndex;
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }

  public static void main(String[] args) {
    ArrayList coco = new ArrayList<Integer>();
    for (int i = 0; i < 10; i++) {
      coco.add(i);
    }
    ArrayList test = new ArrayList<Integer>();
    for (int i = 0; i < 100; i++) {
      test.add(i);
    }
    ArrayList glen = new ArrayList<Integer>();
    for (int i = 0; i < 1000; i++){
      glen.add(i);
    }
    ArrayList aaaa = new ArrayList<Integer>();
    for (int i = 0; i < 10000; i++) {
      aaaa.add(i);
    }
    System.out.println("Bubble Sort Best Case");
    Sorts.bubbleSortV(coco);
    Sorts.bubbleSortV(test);
    Sorts.bubbleSortV(glen);
    Sorts.bubbleSortV(aaaa);
    System.out.println("Selection Sort Best Case");
    Sorts.selectionSortV(coco);
    Sorts.selectionSortV(test);
    Sorts.selectionSortV(glen);
    Sorts.selectionSortV(aaaa);
    System.out.println("Insertion Sort Best Case");
    Sorts.insertionSortV(coco);
    Sorts.insertionSortV(test);
    Sorts.insertionSortV(glen);
    Sorts.insertionSortV(aaaa);
    ArrayList foo = new ArrayList<Integer>();
    for (int i = 999; i >= 0; i--){
      foo.add(i);
    }
    ArrayList foo2 = new ArrayList<Integer>();
    for (int j = 99; j >= 0; j--) {
      foo2.add(j);
    }
    ArrayList foo3 = new ArrayList<Integer>();
    for (int k = 9; k >= 0; k--) {
      foo3.add(k);
    }
    /*
    heap space error
    ArrayList foo4 = new ArrayList<Integer>();
    for (int n = 9999; n >= 0; n++) {
      foo4.add(n);
    }
    */
    System.out.println("Bubble Sort Worst Case");
    Sorts.bubbleSortV(foo);
    Sorts.bubbleSortV(foo2);
    Sorts.bubbleSortV(foo3);
    //Sorts.bubbleSortV(foo4);
    for (int i = 0; i <1000; i++){
      foo.set(i,1000-i);
    }
    for (int i = 0; i <100; i++){
      foo2.set(i,100-i);
    }
    for (int i = 0; i <10; i++){
      foo3.set(i,10-i);
    }
    /*
    for (int i = 0; i <10000; i++){
      foo4.set(i,10000-i);
    }
    */
    System.out.println("Selection Sort Worst Case");
    Sorts.selectionSortV(foo);
    Sorts.selectionSortV(foo2);
    Sorts.selectionSortV(foo3);
    //Sorts.selectionSortV(foo4);
    for (int i = 0; i <1000; i++){
      foo.set(i,1000-i);
    }
    for (int i = 0; i <100; i++){
      foo2.set(i,100-i);
    }
    for (int i = 0; i <10; i++){
      foo3.set(i,100-i);
    }
    /*
    for (int i = 0; i <10000; i++){
      foo4.set(i,1000-i);
    }
    */
    System.out.println("Insertion Sort Worst Case");
    Sorts.insertionSortV(foo);
    Sorts.insertionSortV(foo2);
    Sorts.insertionSortV(foo3);
    //Sorts.insertionSortV(foo4);
  }
}
