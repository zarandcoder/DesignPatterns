package website.zaripov.sololearn;

/*
class ClassTest {
    int x;
}

class B {
    public static void main(String[] args) {
        ClassTest t1, t2, t3;
        t1=t2=t3= new ClassTest();
        t1.x = 2;
        System.out.println(t1.x);
        t2.x = 3;
        t3.x = 4;
        if(t1.x == t3.x) {
            System.out.println(t2.x);
        } else {
            System.out.println(0);
        }
    }
}
*/

class Mother {
    int x;

    public Mother(int y) {
        x = y;
    }

    @Override
    public String toString() {
        return "x";
    }
}

class Daughter {
    public static void main(String[] args) {
        System.out.println(new Mother(5)); //x
    }
}