import java.util.Random;

public class Kopp {

	private int id;
	private int sum;

	public Kopp(int id,int sum){
		this.id = id;
		this.sum =sum;
	}
	public int trill(){

		Random rand = new Random();
		int tall = 0;

		//Gives result between 0 and 6
		tall= rand.nextInt(6);
		tall++;

		return tall;
	}


}
