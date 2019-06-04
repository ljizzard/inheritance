import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestManager {

    Manager manager;

    @Before
    public void setUp(){
        manager = new Manager("Sheila Smith", "ab123456c", 25000, "Reception");
    }

    @Test
    public void canGetName(){
        assertEquals("Sheila Smith", manager.getName());
    }

    @Test
    public void canSetName(){
        manager.setName("Bobby Bill");
        assertEquals("Bobby Bill", manager.getName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(200.00);
        assertEquals(25200, manager.getSalary());
    }

    @Test
    public void cannotSubmitNegativeRaiseSalary() {
        manager.raiseSalary(-300.00);
        assertEquals(25000, manager.getSalary());
    }

    @Test
    public void canGetSalary(){
        assertEquals(25000, manager.getSalary());
    }

    @Test
    public void canSetSalary(){
        manager.setSalary(30000);
        assertEquals(30000, manager.getSalary());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("ab123456c", manager.getNiNumber());
    }

    @Test
    public void canSetNINumber(){
        manager.setNiNumber("bc123456a");
        assertEquals("bc123456a", manager.getNiNumber());
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Reception", manager.getDeptName());
    }

    @Test
    public void canSetDeptName(){
        manager.setDeptName("Kitchen");
        assertEquals("Kitchen", manager.getDeptName());
    }

    @Test
    public void canGetBonus(){
        assertEquals(250, manager.payBonus(), 0.01);
    }
}
