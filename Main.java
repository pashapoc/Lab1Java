import jdk.dynalink.support.ChainedCallSite;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
class Chainsaw {
    private String brand;
    public int power;
    public double fuelTankCapacity;
    public double fuelLevel;
    public Boolean isWorking = false;

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
            System.out.printf("length : %.2f\nfuelLevel : %.2f", length, fuelLevel );
        }
    }

    private static Chainsaw instance = new Chainsaw();

    private static Chainsaw getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        Chainsaw[] chainsaw = {new Chainsaw("Husqvarna", 3000, 0.53, 0.53, false),
                Chainsaw.getInstance(),
                Chainsaw.getInstance(),
                new Chainsaw()
        };

        for (Chainsaw element : chainsaw) {
            System.out.println(element);
        }
        chainsaw[0].cutWood(4.0);
    }
}