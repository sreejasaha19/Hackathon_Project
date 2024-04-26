import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HybridFrameWork {
    //Hybrid FrameWork Is used for 3 objectives: Reusability,Maintainability,Readability
	//Types of FrameWork
	//1) Built-in FrameWork(eg-TestNG, junit, cucumber)
	//2)Customized FrameWork(user-defined)(eg- modular framework, data driven ,keyword driven,hybrid driven
	//TestNG -- predefined framework which we will apply on selenium
	//TestNG is basically a framework which will provide a no of features which are helpful in automation.
	//developers also use testNG for unit testing
	//TestNG - test new generation. It is java based unit testing tool.
	//1)Test cases & test suite
	//2)Grouping of test cases - regression, sanity, functional
	//3)Prioritize
	//4)Parameterized  - we pass the parameter to the test cases.
	//5)Parallel testing
	//6)Reports
	//if there are 100 testcases out of that only 90 testcases can be automate. rest 10 testcases we have to do manual testing.
	//so this is 100% automation. 
	//the testcases which are completely automable should be automated. rest we don't have to consider.
	//1)sanity means the basic functional testcases we cannot proceed for further testing
	//those types of testcases are considered as first priority testcases as P1
	//2)Data driven test cases/retestcases - here we use multiple data for testing and wrong user credentials will fail the test cases.
	//so data driven test cases have to be automate becausesingle time we can manual test but if it is multiple times we have to automate 
	//3)regression test cases- the test cases which failed in previous testing but has been corrected in current build. theses test cases are of high priority as P2.
	//4)Any other test cases. --- P4
	//Phases of AUT
	//1)Analyzing AUT, 2)Choose test cases for automation. 3)Design & Development of framework, 4)Execution- local,remote ,5)Maintainance
	
	//pom.xml contains 2 types of entries-
	//1)dependencies-- download required dependency jar for a project
	//2)plug-ins-- to compile and run a project  1) maven compiler plugin(responsible for compiling our project)
	//2)maven surefire plugin(responsible for running our project)
	//cms(configuration management system) / vcs(version control System)
	//git - local repository -- individual local system where other developer can not access other's system 
	//github- remote repository -- here everyone can access all documents
	//repository is storage area where we store all files, maintain configuration, maintain different versions of files
	//for publishing codes or changes from workspace to local repository we use commit
	//for publishing codes or changes from local repository to remote repository we use push
	
	//Devops
	//Build Creation- Compile Code, Run code, test code,Package,install
	//Run Automation
	//Build certification - the whole work has to be certified for further testing
	//meven - build tool to buld the software through different process
	//jenkins - continuous integration tool
		

}
