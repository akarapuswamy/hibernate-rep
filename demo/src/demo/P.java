package demo;

public class P {
	public static void main(String[] args) {
		int a=100;
    for (int i = 0; i <=a; i++) {
    	int count =0;
    	for (int j = 1; j <=i; j++) {
    		if (i%j==0) {
    			count++;
			}
		}
    	if (count==2) {
    		System.out.println(i);
			
		}
	
}		
	}
}
