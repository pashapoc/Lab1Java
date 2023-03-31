package ua.lviv.iot.algo.part1.lab2;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString

public class Chainsaw extends Saw {
    public double fuelTankCapacity;
    public double fuelLevel;
    public double fuelConsumption;
    public Chainsaw (double fuelTankCapacity, double fuelLevel, double fuelConsumption, String brand, int power, double WorkInHours, boolean isWorking) {
        super(brand, power, WorkInHours, isWorking);
        this.fuelTankCapacity = fuelTankCapacity;
        this.fuelLevel = fuelLevel;
        this.fuelConsumption = fuelConsumption;
    }
    public void getRemainingWorkTime() {
        while (isWorking = true) {
            System.out.printf("Remaining work time is:%s", WorkInHours);
            break;
        }
    }

    public void start() {
        this.isWorking = true;
    }

    public void stop() {
        this.isWorking = false;
    }
    public void cutWood(double length) {
        final double n = 0.1;
        final double requiredFuel = length * n;
        if (requiredFuel > this.fuelLevel) {
            fuelLevel = 0;
            isWorking = false;
        } else {
            isWorking = true;
            fuelLevel -= requiredFuel;
            System.out.printf("length : %.2f\nfuelLevel : %.2f\n", length, fuelLevel );
        }
    }

    private static Chainsaw instance = new Chainsaw();

    static Chainsaw getInstance() {
        return instance;
    }
}