package Foundation.Collections.Generics;

public class Main {
    public static void main(String[] args) {

        // Box box = new Box();
        // box.setValue(25);
        // int val = box.getValue();
        // System.out.println(val);


        // Box box = new Box();
        // box.setValue(25);
        // int val = (Integer)box.getValue(); // this is good
        // System.out.println(val);

        // String str = (String) box.getValue(); // this is not good but is a run time error but we want it as compile time
        // System.out.println(str);


        // Box<Integer> box = new Box<>();
        // box.setValue(25);
        // int val = (Integer)box.getValue(); // this is good
        // System.out.println(val);
        // // String str = (String) box.getValue(); // now it gives compile time error

        InterfaceGenerics<String> ig = new InterfaceGenerics<>();
        ig.add("Hello");
        String s = ig.get();
        System.out.println(s);
    }
}
