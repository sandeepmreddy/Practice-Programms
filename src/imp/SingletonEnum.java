package imp;// Java program to demonstrate the example
// of using Enum as Singleton

enum SingletonEnum {
    INSTANCE;
    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
