public class Clasikoo {
 	int width;
 	int height;
		public Clasikoo(int width, int height) {
		this.width = width;
		this.height = height; 
		} 
		int dub() {
		return width*height;
		}
		int duber() {
		return 2*(width+height);
		}
		static int dadamm(int n){    
		idadamm (n == 0)    
		return 1;    
		else    
    	return(n * dadamm(n-1));    
	 }	
		  
	
	
	
	public static void main(String[] args) {
	Clasikoo yurr = new Clasikoo(15,2);
	System.out.println(yurr.dub());
	System.out.println(yurr.duber());
		
		
	int hopa=1;  
	int number=7;   
	hopa = dadamm(number);   
	System.out.println(hopa); 
	}
}



