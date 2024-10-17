
interface I1 {
    void display();
}

interface I2 {
    void show();
}

class Multiple implements I1, I2 {
    public void display() {
        System.out.println("this is display");
    }

    public void show() {
        System.out.println("this  is show  method");
    }

    public static void main(String[] args) {
        Multiple m = new Multiple();
        m.show();
        m.display();
    }
}
