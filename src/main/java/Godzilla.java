public class Godzilla extends Kaiju {

    public Godzilla(String name, int healthValue, int attackValue){
        super(name, healthValue, attackValue);
    }

    @Override
    public String canRoar() {
        return "ROOOOAAAARRRR!";
    }

//    public int monsterAttack(){
//        return - Godzilla.attackValue();
//    }



}
