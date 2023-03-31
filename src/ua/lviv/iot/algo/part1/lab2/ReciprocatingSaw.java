package ua.lviv.iot.algo.part1.lab2;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class ReciprocatingSaw extends Saw {
    public String SpecialFeature;
    public ReciprocatingSaw(String SpecialFeature, String brand, int power, double WorkInHours, boolean isWorking) {
        super(brand, power, WorkInHours, isWorking);
        this.SpecialFeature = SpecialFeature;
    }
    public void getRemainingWorkTime() {
        while (isWorking = true) {
            System.out.printf("Remaining work time is:%s", WorkInHours);
            break;
        }
    };
}
