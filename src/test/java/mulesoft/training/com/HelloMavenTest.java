package mulesoft.training.com;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;

public class HelloMavenTest extends FunctionalTestCase {

    @Test
    public void mavenFlowReturnsHelloMaven() throws Exception {
        runFlowAndExpect("mavenFlow", "Hello: This is my first Maven Project and building through Jenkins");
    }
    
    @Override
    protected String getConfigFile() {
        return "maven-project.xml";
    }

}
