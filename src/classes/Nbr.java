package classes;

public class Nbr {
	private int[] value;
	
	public Nbr() {
		value = new int[] {GetRandom.Integer(0, 9),GetRandom.Integer(0, 9),GetRandom.Integer(0, 9),GetRandom.Integer(0, 9)};
	}
	
	public Nbr(int a,int b, int c, int d) {
		value = new int[] {a,b,c,d};
	}
	
	public int get(int indice) {
		return value[indice];
	}
	
	public String strEquals(Nbr secret) {
		String builder = "";
		for(int i = 0; i < 4; i++) {
			if(value[i] < secret.get(i)){ builder = builder + "+";}
			else if(value[i] > secret.get(i)){ builder = builder + "-";}
			else { builder = builder + "=";}
		}
		return builder;
	}
	
	public Boolean boolEquals(Nbr secret) {
		if(secret.get(0) == value[0] && secret.get(1) == value[1] && secret.get(2) == value[2] && secret.get(3) == value[3]){
			return true;
		}
		else {
			return false;
		}
	}
	
	public String print() {
		return value[0]+""+value[1]+""+value[2]+""+value[3];
	}
}
