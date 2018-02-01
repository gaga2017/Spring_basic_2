import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class A {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new GenericApplicationContext();
		if(applicationContext.containsBean("a"))
			System.out.println("aaaaaa");
	
	}
}
