package lr5;

public class program2 {
    public static class Example {
        // Первое символьное поле
        public char startChar;

        // Второе символьное поле
        public char endChar;

        // Метод, вывод символов между startChar и endChar включительно
        public void printCharactersInRange() {
            char from = startChar < endChar ? startChar : endChar;
            char to = startChar > endChar ? startChar : endChar;

            for (char c = from; c <= to; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Example classExample = new Example();
        classExample.startChar = 'C';
        classExample.endChar = 'Z';
        classExample.printCharactersInRange();
    }
}