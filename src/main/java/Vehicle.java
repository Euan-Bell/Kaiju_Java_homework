public abstract class Vehicle {

    private String vehicleType;
    private int vehicleAttackValue1;
    private int vehicleAttackValue2;
    private int vehicleHealthValue;


    public Vehicle(String vehicleType, int vehicleAttackValue1, int vehicleAttackValue2, int vehicleHealthValue){
        this.vehicleType = vehicleType;
        this.vehicleAttackValue1 = vehicleAttackValue1;
        this.vehicleAttackValue2 = vehicleAttackValue2;
        this.vehicleHealthValue = vehicleHealthValue;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public int getVehicleAttackValue1() {
        return vehicleAttackValue1;
    }

    public int getVehicleAttackValue2() {
        return vehicleAttackValue2;
    }

    public int getVehicleHealthValue() {
        return vehicleHealthValue;
    }
}
