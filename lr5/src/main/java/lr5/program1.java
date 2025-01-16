package lr5;

public class program1 {
        public static class Example {
            // Закрытое символьное поле
            private char character;

            // Метод, присваивает значение полю
            public void setCharacter(char character) {
                this.character = character;
            }

            // Метод, возвращает код символа
            public int getCharacterCode() {
                return (int) character;
            }

            // Метод, выводит символ и его код в консоль
            public void printCharacterAndCode() {
                System.out.println("Символ = " + character + ", Его код = " + getCharacterCode());
            }
        }

        public static void main(String[] args) {
            Example classExample = new Example();
            classExample.setCharacter('h');
            classExample.printCharacterAndCode();
        }
    }

