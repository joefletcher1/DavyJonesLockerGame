import java.util.Random;

public class Generate {
	Random r;
	
	public Generate() {
		r = new Random();
	}
	
	public double getRandomNumber() {
		return r.nextDouble();
	}
}
