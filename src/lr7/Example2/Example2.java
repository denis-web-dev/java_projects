package lr7.Example2;

public class Example2 {
    public static void main(String[] args) {
        final var superClassObject1 = new SuperClassTest2();
        System.out.println("string: " + superClassObject1.getStr() + ", length: " + superClassObject1.length);
        final var superClassObject2 = new SuperClassTest2("передал в конструктор суперкласса");
        System.out.println("string: " + superClassObject2.getStr() + ", length: " + superClassObject2.length);
        superClassObject2.setStr();
        System.out.println("string: " + superClassObject2.getStr() + ", length: " + superClassObject2.length);
        superClassObject2.setStr("передал в метод суперкласса");
        System.out.println("string: " + superClassObject2.getStr() + ", length: " + superClassObject2.length);

        final var subClassObject1 = new SubClassTest2("передал в конструктор подкласса");
        System.out.println("string: " + subClassObject1.getStr() + ", length: " + subClassObject1.length + ", value: " + subClassObject1.value);
        subClassObject1.setStr();
        System.out.println("string: " + subClassObject1.getStr() + ", length: " + subClassObject1.length + ", value: " + subClassObject1.value);
        subClassObject1.setStr("передал в метод подкласса");
        System.out.println("string: " + subClassObject1.getStr() + ", length: " + subClassObject1.length + ", value: " + subClassObject1.value);
        subClassObject1.setStr("передал в метод подкласса со значением", 42);
        System.out.println("string: " + subClassObject1.getStr() + ", length: " + subClassObject1.length + ", value: " + subClassObject1.value);
    }
    }

