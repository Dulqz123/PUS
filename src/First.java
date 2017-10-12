import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class First {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop=new Properties();
		String name="config.properties.txt";
		FileInputStream input = new FileInputStream(System.getProperty("user.home")+"/"+name);
		//System.out.println(input);
		prop.load(input);
		System.out.println(prop.get("a"));
		System.out.println(prop.get("b"));
		System.out.println(prop.get("c"));
		
		//Properties prop2=new Properties();
		FileInputStream input2 = new FileInputStream("./"+name);
		prop.load(input2);
		System.out.println(prop.get("a"));
		System.out.println(prop.get("b"));
		System.out.println(prop.get("c"));

//		for(int i=0;i<3;i++){
//		System.out.println("hello "+i);
//		}
	}

}
