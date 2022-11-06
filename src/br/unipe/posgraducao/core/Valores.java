package br.unipe.posgraducao.core;

public class Valores implements ValoresITF {
	
	int indice = 0;
	int [] valores = new int[10];
	
	@Override
	public boolean ins(int v) {
		boolean cheio = false;
		int indiceLivre = 0;
		
		if (v <= 0) {
			return false;
		}
		
		for(int i = 0; i < valores.length; i++) {
			if (valores[i] == 0) {
				indiceLivre = i;
				cheio = false;
				break;
			} else {
				cheio = true;
			}
		}
		if (cheio) {
			return false;
		} else {
			valores[indiceLivre] = v;
			return true;
		}
	}

	@Override
	public int del(int i) {
		boolean vazio = true;
		int valor = -1;
		
		if (i >= 0 && i < 10) {
		
			for(int x = 0; x < valores.length; x++) {
				if (valores[x] != 0) {
					vazio = false;
					break;
				}
			}
			
			if (valores[i] != 0 && !vazio) {
				 valor = valores[i];
				 valores[i] = 0;
			}
		} 
		
		return valor;
	}

	@Override
	public int size() {
		int size = 0;
		for (int i = 0; i < valores.length; i++) {
			if (valores[i] != 0) {
				size++;
			}
		}
		return size;
	}
}
