package lr5;

public class program3 {
    public static class Example {
        // Первое целочисленное поле
        public int firstNumber;

        // Второе целочисленное поле
        public int secondNumber;

        // Конструктор без аргументов
        public Example() {
            this.firstNumber = 0;
            this.secondNumber = 0;
        }

        // Конструктор с одним аргументом
        public Example(int number) {
            this.firstNumber = number;
            this.secondNumber = 0;
        }

        // Конструктор с двумя аргументами
        public Example(int firstNumber, int secondNumber) {
            this.firstNumber = firstNumber;
            this.secondNumber = secondNumber;
        }
    }

    public static void main(String[] args) {
        Example obj1 = new Example();
        System.out.println("obj1: firstNumber = " + obj1.firstNumber + ", secondNumber = " + obj1.secondNumber);

        Example obj2 = new Example(9);
        System.out.println("obj2: firstNumber = " + obj2.firstNumber + ", secondNumber = " + obj2.secondNumber);

        Example obj3 = new Example(12, 4);
        System.out.println("obj3: firstNumber = " + obj3.firstNumber + ", secondNumber = " + obj3.secondNumber);
    }
}
