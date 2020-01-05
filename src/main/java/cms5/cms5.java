package cms5;

public class cms5 {
public static void main(String[] args) {
	System.out.println("helloWord123");
[INFO] Scanning for projects...
[INFO] 
[INFO] --------------------< com.asdf:asdf-senior1-week2 >---------------------
[INFO] Building asdf-senior1-week2 0.0.1-SNAPSHOT
[INFO] --------------------------------[ war ]---------------------------------
[INFO] 
[INFO] >>> jetty-maven-plugin:9.4.2.v20170220:run (default-cli) > test-compile @ asdf-senior1-week2 >>>
[WARNING] The POM for com.bw:10b-whd-utils:jar:0.0.1-SNAPSHOT is missing, no dependency information available
[WARNING] The POM for org.mybatis:mybatis:jar:3.2.8 is invalid, transitive dependencies (if any) will not be available, enable debug logging for more details
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 0.321 s
[INFO] Finished at: 2020-01-05T20:06:47+08:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal on project asdf-senior1-week2: Could not resolve dependencies for project com.asdf:asdf-senior1-week2:war:0.0.1-SNAPSHOT: Could not find artifact com.bw:10b-whd-utils:jar:0.0.1-SNAPSHOT -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/DependencyResolutionException
}
}
