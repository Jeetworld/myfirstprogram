package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Ffirstclass {
	@Test
	public void abc() throws IOException
	{
		Properties pop= new Properties();
		FileInputStream io= new FileInputStream("C:\\Program Files\\Java\\Maven\\MavenProject\\src\\test\\java\\Framework\\common.properties");
		pop.load(io);
		String a= pop.getProperty("URL");
		System.out.println(a);
		
	}
	
}
