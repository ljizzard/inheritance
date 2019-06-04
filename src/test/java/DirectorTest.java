import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setUp(){
        director = new Director("Dave Maymont", "aa123456a", 75000, "Big boss", 175000);
    }

    @Test
    public void canGetName(){
        assertEquals("Dave Maymont", director.getName());
    }

    @Test
    public void canSetName(){
        director.setName("Sylvia Paccitti");
        assertEquals("Sylvia Paccitti", director.getName());
    }

    @Test
    public void cannotSetBlankName() {
        director.setName("");
        assertEquals("Dave Maymont", director.getName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(750.00);
        assertEquals(75750, director.getSalary());
    }

    @Test
    public void canGetSalary(){
        assertEquals(75000, director.getSalary());
    }

    @Test
    public void canSetSalary(){
        director.setSalary(75000);
        assertEquals(75000, director.getSalary());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("aa123456a", director.getNiNumber());
    }

    @Test
    public void canSetNINumber(){
        director.setNiNumber("bb123456b");
        assertEquals("bb123456b", director.getNiNumber());
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Big boss", director.getDeptName());
    }

    @Test
    public void canSetDeptName(){
        director.setDeptName("little boss");
        assertEquals("little boss", director.getDeptName());
    }

    @Test
    public void canGetBonus(){
        assertEquals(1500, director.payBonus(), 0.01);
    }

    @Test
    public void canGetBudget(){
        assertEquals(175000, director.getBudget(),0.01);
    }

    @Test
    public void canSetBudget(){
        director.setBudget(200000);
        assertEquals(200000, director.getBudget(),0.01);
    }
}
