package lesson_7;

public class Cy_27 extends Airplane implements  SpecialAbility{

    private  int numberBombs;
    public Cy_27(String model, int speed, int max_height, int numberBombs) {
        super(model, speed, max_height);
        this.numberBombs = numberBombs;
    }

    @Override
    void Start() {
        System.out.println("start lasted "+ (random.nextInt(15)+10)+" seconds");

    }

    @Override
    public int TurboBoost(int speed) {
        System.out.println("Turbo Boost on");
        return (int) (speed*1.1);
    }

    @Override
    public void Stels() {
        System.out.println("Steals ON");
    }

    @Override
    public void NuclearStrike() {
        System.out.println("Bombs dropped " + (random.nextInt(numberBombs)+1) );

    }

    public int getNumberBombs() {
        return numberBombs;
    }
}
