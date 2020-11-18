package javageneric;

public class GenericClass<T> {
    private T data;
    private T data2;

    public GenericClass(T data, T data2) {
        this.data = data;
        this.data2 = data2;
    }

    public T getData() {
        return data;
    }

    public T getData2() {
        return data2;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setData2(T data2) {
        this.data2 = data2;
    }
}