
public class SuperPato extends Pato {
	private double poder;
	
	public SuperPato(String umNome, int umAno, double umPoder){
		super(umNome, umAno);
		this.poder = umPoder;
		
		
	}
	public void voa() {
		System.out.println("Super Pato voa como um jato de poder" + poder);
	}
	public void nada() {
		System.out.println("Super Pato nada como uma submarino de poder" + poder);
	}
	public void quack() {
		System.out.println("QUACK QUACK");
	}
	
		
		
}


