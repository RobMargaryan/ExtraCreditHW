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