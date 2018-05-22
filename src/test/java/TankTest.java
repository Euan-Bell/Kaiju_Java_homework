import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TankTest {

    Tank tank;
    Godzilla godzilla;

    @Before
    public void before(){
        tank = new Tank("Tank", 30, 50, 100);
    }

    @Test
    public void canGetVehicleType(){
        assertEquals("Tank",tank.getVehicleType());
    }

    @Test
    public void canGetVehicleAttackValue1(){
        assertEquals(30, tank.getVehicleAttackValue1());
    }

    @Test
    public void canGetVehicleAttackValue2(){
        assertEquals(50, tank.getVehicleAttackValue2());
    }

    @Test
    public void canGetVehicleHealthValue(){
        assertEquals(100,tank.getVehicleHealthValue());
    }


    @Test
    public void canDamageVehicle(){
        assertEquals(20,tank.getVehicleHealthValue() - 80);
    }

//    @Test
//    public void canDamageVehicle(){
//        assertEquals(20, fighterjet.getVehicleHealthValue() - godzilla.getAttackValue());
//    }
}
