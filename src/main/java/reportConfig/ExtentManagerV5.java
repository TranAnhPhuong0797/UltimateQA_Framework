package reportConfig;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import common.GlobalConstants;

public class ExtentManagerV5 {
	public static final ExtentReports extentReports = new ExtentReports();

	public synchronized static ExtentReports createExtentReports() {
		ExtentSparkReporter reporter = new ExtentSparkReporter(GlobalConstants.PROJECT_PATH + "/extentV5/ExtentReport.html");
		reporter.config().setReportName("NopCommerce HTML Report");
		reporter.config().setDocumentTitle("NopCommerce HTML Report");
		reporter.config().setTimelineEnabled(true);
		reporter.config().setEncoding("utf-8");
		reporter.config().setTheme(Theme.DARK);

		extentReports.attachReporter(reporter);
		extentReports.setSystemInfo("Company", "Ultimate QA");
		extentReports.setSystemInfo("Project", "Ultimate QA");
		extentReports.setSystemInfo("Team", "Ultimate Automate team");
		extentReports.setSystemInfo("JDK version", GlobalConstants.JAVA_VERSION);
		extentReports.setSystemInfo("OSname", GlobalConstants.OS_NAME);
		
		
		return extentReports;
	}
}
