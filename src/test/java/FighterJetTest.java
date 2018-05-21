import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FighterJetTest {

    FighterJet fighterjet;

    @Before
    public void before(){
        fighterjet = new FighterJet("FighterJet", 30, 40, 100);
    }

    @Test
    public void canGetVehicleType(){
        assertEquals("FighterJet",fighterjet.getVehicleType());
    }

    @Test
    public void canGetVehicleAttackValue1(){
        assertEquals(30, fighterjet.getVehicleAttackValue1());
    }

    @Test
    public void canGetVehicleAttackValue2(){
        assertEquals(40, fighterjet.getVehicleAttackValue2());
    }

    @Test
    public void canGetVehicleHealthValue(){
        assertEquals(100,fighterjet.getVehicleHealthValue());
    }
}
