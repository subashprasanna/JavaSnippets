
public class BinarySearch {
	public BinarySearch(){}
	
	public static void main(String[] args) {
		// array should be in sorted order for binary search
		int[] mArgs = {1,3,6,9,11,15,17,20};
		BinarySearch b = new BinarySearch();
		if(b.findValue(mArgs, 20)) {
			System.out.println("Found value");
		} else {
			System.out.println("Not found value");
		}
	}
	
	public boolean findValue(int[] value, int findValue) {
		boolean result = false;
		
		int start = 0;
		int end = value.length;
		int middle = 0;
		
		boolean found = false;
		while(!found) {
			// once start & end cross each other, search lifecycle ends
			if(end < start) {
				found = true;
				break;
			}
			
			// Find middle index in btw start and end index
			middle = start + (end - start) / 2;
			
			// if middle index value is searchable value, we found 
			if(value[middle] == findValue) {
				result = true;
				found = true;
				break;
			}
			
			// if search value < middle index array value, searchable value will be in left side only from middle, so ignore right side
			if(findValue < value[middle] ) {
				end = middle - 1; // limit the array search only left side
			}
			
			// if search value > middle index array value, searchable value will be in right side only from middle, so ignore left side
			if(findValue > value[middle]) {
				start = middle + 1; // limit the array search only right side
			}
		}
		
		return result;
	}

}
