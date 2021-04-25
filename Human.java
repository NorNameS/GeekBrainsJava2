public class Human implements Run, Jump{
    private final String name;
    private final int run;
    private final int jump;
    private boolean isStoped = false;

    Human(String name, int run, int jump)
    {
        this.name = name;
        this.run = run;
        this.jump = jump;
    }

    @Override
    public boolean isStoped()
    {
        return isStoped;
    }

    @Override
    public boolean jump(int height) {
        if(height <= jump)
        {
            System.out.println(name + " jumped: " + height);
            return true;
        }
        else
        {
            System.out.println(name + " hasn't jumped: " + height);
            isStoped = true;
            return false;
        }
    }

    @Override
    public boolean run(int length) {
        if(length <= run)
        {
            System.out.println(name + " run: " + length);
            return true;
        }
        else
        {
            System.out.println(name + " hasn't run:" + length);
            isStoped = false;
            return false;
        }
    }
}
