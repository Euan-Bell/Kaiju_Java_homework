import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MothraTest {

    Mothra mothra;


    @Before
    public void before(){
        mothra = new Mothra("Mothra", 100, 60);
    }

    @Test
    public void canGetName(){
        assertEquals("Mothra",mothra.getName());
    }

    @Test
    public void canGetHealthValue(){
        assertEquals(100,mothra.getHealthValue());
    }

    @Test
    public void canGetAttackValue(){
        assertEquals(60,mothra.getAttackValue());
    }

    @Test
    public void canDamageKaiju(){
        assertEquals(70, mothra.getHealthValue() - 30);
    }

//    @Test
//    public void canDamageKaiju(){
//        assertEquals(20, mothra.getHealthValue() - fighterjet.getAttackValue1());
//    }


}


