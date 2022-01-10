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
    ArrayList glen = new ArrayList<Integer>();
    for (int i = 0; i < 1000; i++){
      glen.add(i);
    }
    System.out.println("Bubble Sort Best Case");
    Sorts.bubbleSortV(glen);
    System.out.println("Selection Sort Best Case");
    Sorts.selectionSortV(glen);
    System.out.println("Insertion Sort Best Case");
    Sorts.insertionSortV(glen);
    ArrayList foo = new ArrayList<Integer>();
    foo.size()= 1000;
    for (int i = 999; i >= 0; i--){
      foo.add(i);
    }
    System.out.println("Bubble Sort Worst Case");
    Sorts.bubbleSortV(foo);
    for (int i = 0; i >1000; i++){
      foo.set(i,foo.size()-i);
    }
    System.out.println("Selection Sort Worst Case");
    Sorts.selectionSortV(foo);
    for (int i = 0; i >1000; i++){
      foo.set(i,foo.size()-i);
    }
    System.out.println("Insertion Sort Worst Case");
    Sorts.insertionSortV(foo);
    
  }
}
