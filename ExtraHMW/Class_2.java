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
