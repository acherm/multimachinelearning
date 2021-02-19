import static org.junit.Assert.fail;

import org.junit.Test;

public class MMLRLangTest {

	@Test
	public void testR1() throws Exception {
		ConfigurationML conf = new ConfigurationML("iris.csv", "variety");
		MLExecutor ex = new RLanguageMLExecutor(conf, true); // with Docker
		ex.generateCode();
		MLResult result = ex.run();	


		// TODO: refactor the code in R executor
		// TODO: generalize in case many metrics are computed
		String strRes = result.getStringResult();
		System.out.println(strRes);
		String realResult = strRes.substring(strRes.indexOf("]") + 2);

		try {
			Float.parseFloat(realResult);			
		}
		catch (Exception e) {
			fail("issue here!");
		}



	}

}
