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

}
