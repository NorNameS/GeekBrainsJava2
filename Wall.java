public class Wall implements Obstacle{
    private final int hight;

    public Wall(int hight)
    {
        this.hight = hight;
    }

    @Override
    public void accept(Active active)
    {
        this.pass((Jump) active);
    }

    public void pass(Jump jump)
    {
        jump.jump(hight);
    }
}
