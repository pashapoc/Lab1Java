package ua.lviv.iot.algo.part1.lab2;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public abstract class Saw {
    private String brand;
    public int power;
    public double WorkInHours;
    public boolean isWorking;
    public abstract void getRemainingWorkTime();
}
