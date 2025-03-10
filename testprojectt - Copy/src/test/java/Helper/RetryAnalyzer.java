package Helper;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;


public class RetryAnalyzer implements IRetryAnalyzer {

	private int retryCount = 0;
	private static final int maxCount = 5;
	
	@Override
	public boolean retry(ITestResult result) {
		System.out.println("Retrying...");
		if(retryCount < maxCount) {
			retryCount++;
			return true;
		}
		
		return false;
	}

}
