public class Mothra extends Kaiju {

    public Mothra(String name, int healthValue, int attackValue){
        super(name, healthValue, attackValue);
    }

    @Override
    public String canRoar() {
        return "SCREECH!";
    }

//    @Override
//    public String canFly() {
//        return "Take to skies!";
//    }

//    public int monsterAttack(){
//        return - Godzilla.attackValue();
//    }



}
