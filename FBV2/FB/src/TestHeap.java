import java.util.ArrayList;

public class TestHeap {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Program Start...");
		ArrayList l = new ArrayList();
		while(true){
			String name = new String("amit "+System.nanoTime());
			Thread.sleep(50);
			l.add(name);
		}

	}

}
