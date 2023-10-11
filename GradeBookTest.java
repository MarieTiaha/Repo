import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest 
{

	GradeBook gradeBook1;
    GradeBook gradeBook2;

	@BeforeEach
	void setUp() throws Exception 
	{
		 // Create two GradeBook objects
        gradeBook1 = new GradeBook(5);
        gradeBook2 = new GradeBook(5);

        // Add scores to gradeBook1
        gradeBook1.addScore(82.0);
        gradeBook1.addScore(70.0);
        gradeBook1.addScore(68.0);

        // Add scores to gradeBook2
        gradeBook2.addScore(92.0);
        gradeBook2.addScore(86.0);
        gradeBook2.addScore(90.0);
	}

	@AfterEach
	void tearDown() throws Exception 
	{
		// Set the GradeBook objects to null
        gradeBook1 = null;
        gradeBook2 = null;
	}

	void testAddScore() 
	{
        // Check if scores are added correctly
        assertEquals("85.0 90.0 75.0", gradeBook1.toString());
        assertEquals("92.0 88.0 78.0", gradeBook2.toString());

        // Check if scoresSize is updated correctly
        assertEquals(3, gradeBook1.getScoresSize());
        assertEquals(3, gradeBook2.getScoresSize());
    }

    @Test
    void testSum() 
    {
        assertEquals(250.0, gradeBook1.sum());
        assertEquals(258.0, gradeBook2.sum());
    }

    @Test
    void testMinimum() 
    {
        assertEquals(75.0, gradeBook1.minimum());
        assertEquals(78.0, gradeBook2.minimum());
    }
    
    @Test
    void testFinalScore() 
    {
        assertEquals(152.0, gradeBook1.finalScore());

        assertEquals(182.0, gradeBook2.finalScore());

        GradeBook gradeBook3 = new GradeBook(5);
        assertEquals(0.0, gradeBook3.finalScore());
    }
}