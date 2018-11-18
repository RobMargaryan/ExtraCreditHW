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


public class kartolner {
	int width;
	int height;
	int depth;
		public kartolner(int width, int height, int depth) {
		this.width = width;
		this.height = height; 
		this.depth = depth;
		}
		int volume() {
		return width*height*depth;
		}
		int mean() {
		return (width+height+depth)/3;
		}
		public static void main(String[] args) {
		kartolner hashvark = new kartolner(20,20,20);
			
			
		System.out.println(hashvark.volume());
		System.out.println(hashvark.mean());
		}
}

public class Dinozavr {
	int lol;
	int bob;
	int coc;
		public Dinozavr(int lol, int bob, int coc) {
		this.lol = lol;
		this.bob = bob;
		this.coc = coc;
		}
		int demm() {
		return ((bob*bob-(4*(lol*coc))));
		}
		int dodosh() {
		return 4;
		}
	
		public static void main(String[] args) {
		Dinozavr deeel = new Dinozavr(-3,-4,-4);
			
			
		System.out.println(deeel.dodosh());
		}
}