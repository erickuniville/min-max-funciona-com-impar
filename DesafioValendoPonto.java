public class DesafioValendoPonto {
	
	public static void main(String[] args) {
		DesafioValendoPonto teste = new DesafioValendoPonto();
		
		int[] vetor = {1, 2, 3, 999, -999};
		
		int[] resultado = teste.minmax3(vetor);
		
		System.out.println("MENOR: " + resultado[0]);
		System.out.println("MAIOR: " + resultado[1]);
	}
	
	public int[] minmax3 (int v[]) {
		int i, a, b;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		if(v.length % 2 == 0) { //Tamanho PAR
			for(i = 0; i < v.length; i += 2) {
				if(v[i] < v[i + 1]) {
					a = i;
					b = i + 1;
				} else {
					a = i + 1;
					b = i;
				}
				
				if(v[a] < min) {
					min = v[a];
				}
				if(v[b] > max) {
					max = v[b];
				}
			}
		}
		else { //Tamanho ÍMPAR
			for(i = 0; i < v.length - 1; i += 2) {
				if(v[i] < v[i + 1]) {
					a = i;
					b = i + 1;
				} else {
					a = i + 1;
					b = i;
				}
				
				if(v[a] < min) {
					min = v[a];
				}
				if(v[b] > max) {
					max = v[b];
				}
			}
			
			if(v[i] < min) {
				min = v[i];
			}
			if(v[i] > max) {
				max = v[i];
			}
		}
		
		return new int[] {min, max};
	}
}
