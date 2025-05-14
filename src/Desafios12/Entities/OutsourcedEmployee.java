package Desafios12.Entities;

public class OutsourcedEmployee extends Employee {
    private Double additionalCharge;

    public OutsourcedEmployee(){}
    public OutsourcedEmployee(String name, Integer hours, Double valuePerHours, Double additionalCharge) {
        super(name, hours, valuePerHours);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double Payment(){
        return super.Payment() + additionalCharge * 1.1;
    }

}
