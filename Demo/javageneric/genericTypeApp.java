package javageneric;

class GeneralFunc<T> {
    private T data;
    private T data2;

    public GeneralFunc(T data, T data2) {
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

class GenericTypeApp {
    public static void main(String[] args) {

        GeneralFunc<String> str = new GeneralFunc<String>("Hello", "World");
        GeneralFunc<Integer> intr = new GeneralFunc<Integer>(100, 200);

        System.out.println();
        System.out.println(str.getData() + " " + str.getData2());
        System.out.println();
        System.out.println(
                intr.getData() + " + " + intr.getData2() + " = " + Integer.sum(intr.getData(), intr.getData2()));
        System.out.println();

    }
}