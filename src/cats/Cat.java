package cats;

public class Cat {

    String word = "Hello";
    int age;
    String breed;
    String name;

    public void meow (){
        System.out.println("Meow!");

    }
    public void happyBirthday(){
        System.out.println("У нашей кошки день рождения!");
        System.out.println("Ей было " + age);
        age = age + 1;
        System.out.println("А теперь ей " + age);
    }
}
