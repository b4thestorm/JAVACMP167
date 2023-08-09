public class Homework7_1 {
	public static int numJarsNeeded(int candyCount, int capacity) {
	    if (candyCount < capacity) {
	        return 1;
	    }
	    
	    if (candyCount == 0) {
	    	return 0;
	    }
	    
	    if (candyCount % capacity != 0) {
	        return candyCount + 1;    
	    }
	    
	    if (candyCount == capacity) {
			return candyCount;
		 }
	
		
        return numJarsNeeded(candyCount / capacity , capacity);    
	}
	
	public static int organizeParade(int paradeLength) {
    	/*    
    	Write a recursive method organizeParade(int paradeLength) that takes in the length of the parade and returns the number of different ways it can be organized based on the rules below:

		A parade consists of Floats and Bands.
		Bands cannot be consecutively placed
		Floats can however be placed anywhere
		P(n) = P(n-1) + P(n-2) when n>2
		P(2) = 3 	//base case:  3 ways to organize  	F,B  || B,F  || F,F
		P(1) = 2 	//base case:  2 ways to organize 	F || B 	  (only 1 item)
	 */
        if (paradeLength == 1) {
            return 2;
        } else if (paradeLength == 2) {
            return 3;
        } else {
            return organizeParade(paradeLength - 1) + organizeParade(paradeLength - 2);
        }
      }
    
	
	  public static int helper( String [] words, String target,  int lowIndex, int highIndex) {
	        int midIndex = (lowIndex + highIndex) / 2;
	        if (lowIndex == highIndex) {
	            if (words[lowIndex].compareTo(target) == 0) {
	                return lowIndex;
	            } else {
	                return -1;
	            }
	        }
	        if (words[midIndex].compareTo(target) == 0){
	             return midIndex;
	         } else {
	             if (words[midIndex].compareTo(target) > 1) {
	                 //Search to the left - 1;
	                return helper(words, target, lowIndex, midIndex - 1);
	                 
	             } else {
	                     //Search to the right + 1;
	                 return  helper(words, target,  midIndex + 1, highIndex);
	             }
	        }
	    }
	    
	public static int binarySearch (String target, String [ ] words) {
	    int highIndex = words.length - 1;
	    int lowIndex = 0;
	    int index = helper(words, target,  lowIndex, highIndex);
	    return index;
	}
	    
	public static int  getPowerOfXtoN (int xBase, int nExp) {
	  if (nExp == 0) {
	     return  1;
	   } else if  (nExp == 1) { 
	     return xBase * 1;
	   } else {
	     return xBase * getPowerOfXtoN(xBase, nExp-1);
	  }
	}
	    
	public static int fib (int n) {
	   if (n == 0) {
	        return 0;
	   } else if (n == 1) {
	       return 1;
	   } else {
	      return fib(n - 2) + fib(n - 1);
	   }
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
