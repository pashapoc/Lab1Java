package ua.lviv.iot.algo.part1.lab2;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString

public class MiniRechargeableSaw extends Saw {
    public String BatteryType;
    public MiniRechargeableSaw(String BatteryType, String brand, int power, double WorkInHours, boolean isWorking) {
        super(brand, power, WorkInHours, isWorking);
        this.BatteryType = BatteryType;
    };
    public void getRemainingWorkTime() {
        while (isWorking) {
            System.out.printf("Remaining work time is:%s", WorkInHours);
            break;
        }
    };
}
