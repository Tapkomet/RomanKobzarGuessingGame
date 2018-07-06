package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import main.*;

public class TestController {
	
	@BeforeClass
	public static void initialize(){
		Model model = new Model();
        View view = new View();

        Controller controller = new Controller(view, model);
	}
	
	@Test
	public void testProcess(){
		Assert.assertTrue(10==10);
	}
	
}