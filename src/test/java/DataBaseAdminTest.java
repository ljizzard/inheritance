import org.junit.Before;
import org.junit.Test;
import techStaff.DataBaseAdmin;

import static org.junit.Assert.assertEquals;

public class DataBaseAdminTest {

    DataBaseAdmin dataBaseAdmin;

    @Before
    public void setUp() {
        dataBaseAdmin = new DataBaseAdmin("Zac Baggins", "gg987654g", 40000);
    }

    @Test
    public void canGetName() {
        assertEquals("Zac Baggins", dataBaseAdmin.getName());
    }

    @Test
    public void canSetName() {
        dataBaseAdmin.setName("Melissa Bainbridge");
        assertEquals("Melissa Bainbridge", dataBaseAdmin.getName());
    }

    @Test
    public void cannotSetBlankName() {
        dataBaseAdmin.setName("");
        assertEquals("Zac Baggins", dataBaseAdmin.getName());
    }

    @Test
    public void canRaiseSalary() {
        dataBaseAdmin.raiseSalary(400.00);
        assertEquals(40400, dataBaseAdmin.getSalary());
    }

    @Test
    public void cannotSubmitNegativeRaiseSalary() {
        dataBaseAdmin.raiseSalary(-300.00);
        assertEquals(40000, dataBaseAdmin.getSalary());
    }

    @Test
    public void canGetSalary(){
        assertEquals(40000, dataBaseAdmin.getSalary());
    }

    @Test
    public void canSetSalary() {
        dataBaseAdmin.setSalary(40000);
        assertEquals(40000, dataBaseAdmin.getSalary());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("gg987654g", dataBaseAdmin.getNiNumber());
    }

    @Test
    public void canSetNINumber() {
        dataBaseAdmin.setNiNumber("zz123456z");
        assertEquals("zz123456z", dataBaseAdmin.getNiNumber());
    }

    @Test
    public void canGetBonus() {
        assertEquals(400, dataBaseAdmin.payBonus(), 0.01);
    }

}
