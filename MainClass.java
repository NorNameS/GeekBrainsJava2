public class MainClass {



    public static void main(String[] args) {

        Obstacle[] obstacle = new Obstacle[] {
                new Wall(2),
                new Road(2),
                new Road(19),
                new Wall(4),
        };
        Active[] active = new Active[] {
                new Terminator("Робот Генна", 100, 5),
                new Cat("Кот Барса", 49, 4),
                new Human("Москвич Лошка", 12, 2),
        };
        for(Obstacle obstacles : obstacle)
            for(Active actives : active)
                if(!actives.isStoped())
                    obstacles.accept(actives);

    }
}
