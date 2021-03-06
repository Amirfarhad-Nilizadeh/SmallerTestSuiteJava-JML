   public class SwapInArray {
        /*@ requires 0 <= x && x < array.length && 0 <= y && y < array.length; 
	  @ assignable array[x], array[y]; 
	  @ ensures \old(array[x]) == array[y] && \old(array[y]) == array[x];
	  @ ensures array.length == \old(array.length); @*/
	public void swap(int x, int y,  int array[]) {
	  int temp;   
	  if (!(x < array.length)) return;  
          temp = array[x];
          // array[x] = array[y];
	  if (!(y < array.length)) return;
          array[y] = temp;
       }
    }
