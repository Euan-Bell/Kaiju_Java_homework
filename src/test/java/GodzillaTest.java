import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GodzillaTest {

    Godzilla godzilla;


    @Before
    public void before(){
        godzilla = new Godzilla("Godzilla", 100, 80);
    }

    @Test
    public void canGetName(){
        assertEquals("Godzilla",godzilla.getName());
    }

    @Test
    public void canGetHealthValue(){
        assertEquals(100,godzilla.getHealthValue());
    }

    @Test
    public void canGetAttackValue(){
        assertEquals(80,godzilla.getAttackValue());
    }

    @Test
    public void canDamageKaiju(){
        assertEquals(70, godzilla.getHealthValue() - 30);
    }

//    @Test
//    public void canDamageKaiju(){
//        assertEquals(20, godzilla.getHealthValue() - fighterjet.getAttackValue1());
//    }


}


