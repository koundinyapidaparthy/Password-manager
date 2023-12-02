import java.util.Scanner;

// Group 3 Project

// Students Details 

// 1. Koundinya Pidaparthy
// 2. Vaseem Syed
// 3. Varun chava
// 4. Sunil Chinthaparthi
// 5. Murali Marupudi
// 6. Ruthwik Mamidala


public class Main {

    public static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        Generator generator = new Generator(keyboard);
        generator.mainLoop();
        keyboard.close();
    }
}
