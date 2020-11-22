package Utilities;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {
	
//take screenshot when test case fail 
	
	public static void CaptureScreenShot(WebDriver driver , String ScrenShotName) {
		
		Path destPath=Paths.get("./ScreenShoots",ScrenShotName+".png");
		try {
			Files.createDirectories(destPath.getParent());
			FileOutputStream out= new FileOutputStream(destPath.toString());
			out.write(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES));
			out.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Exception while taking screenshot");
		}
		
	}
	
	
	
	
}
