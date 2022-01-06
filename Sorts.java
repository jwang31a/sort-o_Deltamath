import java.util.ArrayList;

public class Sorts {
  public static void bubbleSortV( ArrayList<Comparable> data )
  {
    boolean measure = false;
    int swap = 0;
    while (measure == false){
      for (int i = data.size() - 1; i > 0; i--) {
        if ((Integer)data.get(i - 1) > (Integer)data.get(i)) {
          Comparable temp = data.get(i - 1);
          data.set(i - 1, data.get(i));
          data.set(i, temp);
          swap += 1;
        }
      }
      if (swap == 0){
        measure = true;
      }
      swap = 0;
    }
    /* YOUR IMPLEMENTATION HERE */
  }

  public static void selectionSortV( ArrayList<Comparable> data )
  {
    //note: this version places greatest value at "rightmost" end
    boolean hit = false;
    //maxPos will point to position of SELECTION (greatest value)
    int maxPos = data.size()-1;
    int pass = data.size()-1;
    for(int i = 0; i < data.size()-1; i++  ) {
      System.out.println( "\nbegin pass " + (data.size()-pass) );//diag


      for(int n = 0; n <= pass;n++  ) {
        if ((Integer)data.get(n) > (Integer)data.get(maxPos)){
          maxPos = n;
         hit = true;
        }
      }
      if (hit == true){
         Comparable temp = data.get(maxPos);
         data.set(maxPos, data.get(pass));
         data.set(pass, temp);
      }
       pass -= 1;
       hit = false;
        System.out.println( "maxPos: " + maxPos );//diag
        System.out.println( data );//diag
       maxPos = pass;

      System.out.println( "after swap: " +  data );//diag
    }
  }

  public static void insertionSortV( ArrayList<Comparable> data )
  {
    boolean sorted = false;
    for(int in = 0; in < data.size(); in++  ) {
      //partition marks first item in unsorted region
      int partition = in;
      System.out.println( "\npartition: " + partition + "\tdataset:"); //diag
      System.out.println( data );
      //traverse sorted region from right to left
      for( int i = in + 1; i > 0; i-- ) {
        // "walk" the current item to where it belongs
        // by swapping adjacent items
        if (i == data.size()) {
          break;
        }
        else if ( (Integer)data.get(i) < (Integer)data.get(i - 1)) {
          System.out.println( "swap indices "+(i-1)+" & "+i+"..." ); //diag
          Comparable temp = data.get(i);
          data.set(i, data.get(i - 1));
          data.set(i -1, temp);
        }
        else
          break;
      }
    }
  }//end insertionSortV
}
