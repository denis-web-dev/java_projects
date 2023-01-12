package lr7.Example4;

public class Example4{
        public static void main(String[] args) throws CloneNotSupportedException {
    var base = new BaseClass2('X');
    System.out.println("character: " + base.character);
    var cloneBase = base.clone();
    cloneBase.character = 'Y';
    System.out.println("character: " + base.character);
    System.out.println("character: " + cloneBase.character);

    var inherited = new InheritedClass2('X', "text");
    System.out.println("character: " + inherited.character + ", text: " + inherited.text);
    var cloneInherited = inherited.clone();
    cloneInherited.character = 'Y';
    System.out.println("character: " + inherited.character);
    System.out.println("character: " + cloneInherited.character + ", text is cloned: " + (cloneInherited.text != inherited.text));

    var finalObject = new FinalClass2('X', "text", 42);
    System.out.println("character: " + finalObject.character + ", text: " + finalObject.text + ", value: " + finalObject.value);
    var cloneFinal = finalObject.clone();
    cloneFinal.character = 'Y';
    cloneFinal.value = 43;
    System.out.println("character: " + finalObject.character + ", value: " + finalObject.value);
    System.out.println("character: " + cloneFinal.character + ", value: " + cloneFinal.value + ", text is cloned: " + (cloneFinal.text != finalObject.text));
}
}


