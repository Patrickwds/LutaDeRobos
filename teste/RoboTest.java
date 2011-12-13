import static org.junit.Assert.*;

import org.junit.Test;

public class RoboTest {

	@Test
	public void deveLigarRobo() {
		Robo robo1 = new Robo();
		robo1.ligar();
		assertEquals(true,robo1.getEstadoLigadoOuDesligado());
	}

	@Test
	public void deveLigarDesligar() {
		Robo robo1 = new Robo();
		robo1.desligar();
		assertEquals(false,robo1.getEstadoLigadoOuDesligado());
	}
	
	@Test
	public void deveMoverParaCima(){
		Robo robo1 = new Robo();
		robo1.moverParaCima();
		assertEquals(1,robo1.getPosicaoY());
	}

	@Test
	public void deveMoverParaBaixo(){
		Robo robo1 = new Robo();
		robo1.moverParaBaixo();
		assertEquals(-1,robo1.getPosicaoY());
	}
	
	@Test
	public void deveMoverParaDireita(){
		Robo robo1 = new Robo();
		robo1.moverParaDireita();
		assertEquals(1,robo1.getPosicaoX());
	}
	
	@Test
	public void deveMoverParaEsquerda(){
		Robo robo1 = new Robo();
		robo1.moverParaEsquerda();
		assertEquals(-1,robo1.getPosicaoX());
	}
}
