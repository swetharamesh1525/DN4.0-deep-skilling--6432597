/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("First log message");
        Logger logger2 = Logger.getInstance();
        logger2.log("Second log message");
        if (logger1 == logger2) {
            System.out.println("Logger is a Singleton.Single Object only created");
        } else {
            System.out.println("Logger is not a Singleton.Another Object is created");
        }
    }
}
