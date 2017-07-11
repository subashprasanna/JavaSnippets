
public class BinarySearch {
	public BinarySearch(){}
	
	public static void main(String[] args) {
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
			if(end < start) {
				found = true;
				break;
			}
			
			middle = start + (end - start) / 2;
			
			if(findValue < value[middle] ) {
				end = middle - 1;
			}
			
			if(findValue > value[middle]) {
				start = middle + 1;
			}
			
			if(value[middle] == findValue) {
				result = true;
				found = true;
				break;
			}
		}
		
		return result;
	}

}
