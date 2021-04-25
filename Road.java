public class Road implements Obstacle{
    private final int lenght;

    public Road(int lenght)
    {
        this.lenght = lenght;
    }

    public void pass(Run runnable)
    {
        runnable.run(lenght);
    }

    @Override
    public void accept(Active active)
    {
        this.pass((Run) active);
    }
}
