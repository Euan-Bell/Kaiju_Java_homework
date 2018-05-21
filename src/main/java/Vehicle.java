public abstract class Vehicle {

    private String vehicleType;
    private int vehicleAttackValue;
    private int vehicleHealthValue;


    public Vehicle(String vehicleType, int vehicleAttackValue, int vehicleHealthVaule){
        this.vehicleType = vehicleType;
        this.vehicleAttackValue = vehicleAttackValue;
        this.vehicleHealthValue = vehicleHealthVaule;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public int getVehicleAttackValue() {
        return vehicleAttackValue;
    }

    public int getVehicleHealthVaule() {
        return vehicleHealthValue;
    }
}
