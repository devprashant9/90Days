package Foundation.Collections.Generics;

// public class Box {
//     private int value;

//     public int getValue() {
//         return value;
//     }

//     public void setValue(int value) {
//         this.value = value;
//     }
// }

// public class Box {
//     private Object value;

//     public Object getValue() {
//         return value;
//     }

//     public void setValue(Object value) {
//         this.value = value;
//     }
// }

public class Box<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
