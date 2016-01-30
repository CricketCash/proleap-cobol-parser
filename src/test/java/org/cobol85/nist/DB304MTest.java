package org.cobol85.nist;

import java.io.File;

import org.junit.Test;
import org.cobol85.applicationcontext.Cobol85GrammarContextFactory;
import org.cobol85.runner.Cobol85ParseTestRunner;
import org.cobol85.runner.impl.Cobol85ParseTestRunnerImpl;

public class DB304MTest {

	@Test
	public void test() throws Exception {
		Cobol85GrammarContextFactory.configureDefaultApplicationContext();

		final File inputFile = new File("src/test/resources/org/cobol85/nist/DB304M.CBL");
		final Cobol85ParseTestRunner runner = new Cobol85ParseTestRunnerImpl();
		runner.parseFile(inputFile, null);
	}
}