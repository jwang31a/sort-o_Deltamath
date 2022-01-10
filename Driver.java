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
    for (int i = 0; i < 10000; i++){
      glen.add(i);
    }
    Sorts.bubbleSortV(glen);
    Sorts.selectionSortV(glen);
    Sorts.insertionSortV(glen);
    ArrayList foo = new ArrayList<Integer>();
    for (int i = 0; i < 10000; i++){
      foo.add(i);
    }
    Sorts.bubbleSortV(foo);
    Sorts.selectionSortV(foo);
    Sorts.insertionSortV(foo);
  }
}
