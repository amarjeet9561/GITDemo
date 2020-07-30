package maven;

import org.testng.annotations.Test;

	public class RestAPITest {
	@Test
	public void JIRADefects() {
		System.out.println("JIRA Defect logged");
	}
	
	@Test
	public void RetestDefects() {
		System.out.println("Retested JIRA Defect");
	}
}
