package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    @Test
    public void testSettingJobId(){
        Job test_job_a = new Job();
        Job test_job_b = new Job();
        assertNotEquals(test_job_a, test_job_b);
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(test_job.getName() != null);
        assertEquals(test_job.getName(), "Product tester");
        assertTrue(test_job.getEmployer() instanceof Object);
        assertEquals(test_job.getEmployer().getValue(), "ACME");
        assertTrue(test_job.getLocation() instanceof Object);
        assertEquals(test_job.getLocation().getValue(), "Desert");
        assertTrue(test_job.getPositionType() instanceof Object);
        assertEquals(test_job.getPositionType().getValue(), "Quality control");
        assertTrue(test_job.getCoreCompetency() instanceof Object);
        assertEquals(test_job.getCoreCompetency().getValue(), "Persistence");
    }
    @Test
    public void testJobsForEquality(){
        Job test_job_a = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test_job_b = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(test_job_a.equals(test_job_b));
    }
    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        char firstChar = test_job.toString().charAt(0);
        char lastChar = test_job.toString().charAt(test_job.toString().length()-1);
        assertEquals(firstChar, '\n');
        assertEquals(lastChar, '\n');
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("\n" + "ID: " + test_job.getId() + "\n" + "Name: " + test_job.getName() + "\n" + "Employer: " + test_job.getEmployer() + "\n" + "Location: " + test_job.getLocation() + "\n" + "Position Type: " + test_job.getPositionType() + "\n" + "Core Competency: " + test_job.getCoreCompetency() + "\n", test_job.toString());
    }
    @Test
    public void testToStringHandlesEmptyField(){
        Job test_job = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("\n" + "ID: " + test_job.getId() + "\n" + "Name: " + test_job.getName() + "\n" + "Employer: " + "Data not available" + "\n" + "Location: " + test_job.getLocation() + "\n" + "Position Type: " + test_job.getPositionType() + "\n" + "Core Competency: " + test_job.getCoreCompetency() + "\n", test_job.toString());
    }

}
