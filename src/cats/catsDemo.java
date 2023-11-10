package cats;

public class catsDemo {
    public static void main (String [] args) {
        Cat myCat = new Cat ();
        myCat.name = "Murzik";
        myCat.breed = "Brit";
        myCat.age = 5;

        myCat.meow ();
        myCat.happyBirthday();
        System.out.println("Возраст нашей кошки - " + myCat.age);

    }
}
