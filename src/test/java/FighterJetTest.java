import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FighterJetTest {

    FighterJet fighterjet;

    @Before
    public void before(){
        fighterjet = new FighterJet("FighterJet", 30, 100);
    }

    @Test
    public void canGetVehicleType(){
        assertEquals("FighterJet",fighterjet.getVehicleType());
    }

    @Test
    public void canGetVehicleAttackValue(){
        assertEquals(30, fighterjet.getVehicleAttackValue());
    }

    @Test
    public void canGetVehicleHealthValue(){
        assertEquals(100,fighterjet.getVehicleHealthVaule());
    }
}
