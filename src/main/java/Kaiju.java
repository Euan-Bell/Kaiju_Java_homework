 public abstract class Kaiju {

        private String name;
        private int healthValue;
        private int attackValue;

        public Kaiju(String name, int healthValue, int attackValue){
            this.name = name;
            this.healthValue = healthValue;
            this.attackValue = attackValue;
        }

     public String getName() {
         return name;
     }

     public int getAttackValue() {
         return attackValue;
     }

     public int getHealthValue() {
         return healthValue;
     }

     public abstract String canRoar();

//     public abstract int monsterAttack();
//

 }

