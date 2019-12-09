package duck;

public class DuckTestDrive {
    public static void main(String[] args) {
        /*
        출력 결과
            1. Turkey 가 말한다
            Gobble gobble
            I'm flying a short distance
            2. DUCK이 말한다
            Quack
            I'm flying
            3. turkeyAdapter가 말한다
            Gobble gobble
            I'm flying a short distance
            I'm flying a short distance
            I'm flying a short distance
            I'm flying a short distance
            I'm flying a short distance
            */
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);  //실제는 가금류지만 오리처럼 보이게 함

        System.out.println("1. Turkey 가 말한다");
        turkey.gobble();
        turkey.fly();

        System.out.println("2. DUCK이 말한다");
        testDuck(duck);

        System.out.println("3. turkeyAdapter가 말한다");
        testDuck(turkeyAdapter);

    }
    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }

}
