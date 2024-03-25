
public class PatoBorracha extends Pato {
	String cor;
public PatoBorracha(String umNome, int umAno, String umCor) {
	super(umNome, umAno);
	this.cor = umCor;	
}
public void voa() {
	System.out.println("O Pato" + cor + "não voa");
}
public void nada(){
	System.out.println("O Pato" +cor+ "boia");
}



}
