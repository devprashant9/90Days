package Foundation.Collections.Generics;

public class InterfaceGenerics<T> implements MyInterface<T> {

    private T item;

    @Override
    public void add(T item) {
        this.item = item;
    }

    @Override
    public T get() {
        return item;
    }

}
