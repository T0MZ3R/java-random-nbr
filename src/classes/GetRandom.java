package classes;

public class GetRandom {
	public static int Integer(double min, double max){
	    int x = (int)((Math.random()*((max-min)+1))+min);
	    return x;
	}
}
