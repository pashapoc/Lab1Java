package ua.lviv.iot.algo.part1.lab2;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class ElectricSaw extends Saw {
    public String ElectricEngineType;
    public int BatteryCapacity;
    public ElectricSaw(String ElectricEngineType, int BatteryCapacity, String brand, int power, double WorkInHours, Boolean isWorking){
    super(brand, power, WorkInHours, isWorking);
    this.ElectricEngineType = ElectricEngineType;
    this.BatteryCapacity = BatteryCapacity;
}
    public void getRemainingWorkTime() {
        while (isWorking = true) {
            System.out.printf("Remaining work time is:%s", WorkInHours);
        }
    }
}
