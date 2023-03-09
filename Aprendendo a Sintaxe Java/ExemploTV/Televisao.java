package TV;

public class Televisao {
	
	private boolean ligada;
	private int volume;
	private int canal;
	
	public Televisao() {
		ligar();
		volume = 25;
		canal = 1;
	}
	
	public void ligar() {
		ligada = true;
	}
	
	public void desligar() {
		ligada = true;
	}
	
	public void aumentarVolume() {
		volume++;
	}

	public void diminuirVolume() {
		volume--;
	}
	
	public void aumentarCanal() {
		canal++;
	}
	
	public void diminuirCanal() {
		canal--;
	}
	
	public void mudarCanal(int canalDigitado) {
		canal = canalDigitado;
	}

	public boolean getLigada() {
		return ligada;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public int getCanal() {
		return canal;
	}
}
