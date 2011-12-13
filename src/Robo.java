
public class Robo {
	
	private static int quantidade;
	private static int rodoId;
	private int posicaoX;
	private int posicaoY;
	private boolean estadoLigadoOuDesligado = false;

	public Robo() {

	}
	
	public Robo(int posicaoX,int posicaoY) {
		quantidade++;
		rodoId= quantidade;	
	}
	
	//
	
	public void desligar() {
		System.out.println("Robo Desligado!");
		this.setEstadoLigadoOuDesligado(false);
	}

	public void ligar() {
		System.out.println("Robo Ligado!");
		this.setEstadoLigadoOuDesligado(true);
	}

	public void moverParaCima() {
		this.posicaoY = posicaoY + 1;
	}
	
	public void moverParaBaixo() {
		this.posicaoY = posicaoY - 1;
		
	}
	
	public void moverParaDireita() {
		this.posicaoX = posicaoX + 1;
		
	}
	
	public void moverParaEsquerda() {
		this.posicaoX = posicaoX - 1;
		
	}
	
	//

	public void setEstadoLigadoOuDesligado(boolean estadoLigadoOuDesligado) {
		this.estadoLigadoOuDesligado = estadoLigadoOuDesligado;
	}

	public boolean getEstadoLigadoOuDesligado() {
		return this.estadoLigadoOuDesligado;
	}
	
	public void setPosicaoY(int posicaoY) {
		this.posicaoY = posicaoY;
	}

	public int getPosicaoY() {
		return this.posicaoY;
	}

	public void setPosicaoX(int posicaoX) {
		this.posicaoX = posicaoX;
	}

	public int getPosicaoX() {
		return this.posicaoX;
	}



}
