package laba;

import java.util.ArrayList;
import java.util.List;

import javassist.CannotCompileException;
import javassist.ClassPool;

public class Program {
    final InputOutputConsole inputOutputConsole = new InputOutputConsole();

    public static void main(String[] args) {
        try {
            Program program = new Program();
            program.menu();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void menu() {
        while (true) {
            inputOutputConsole.writeMenu();
            int count = inputOutputConsole.inputNumberOfMenu(1, 5);
            switch (count) {
                case 1:
                    case1();
                case 2:
                    case2();
                case 3:
                    case3();
                    break;
                case 4:
                    startRecursion();
                    break;
                case 5:
                    case5();
                    break;
                default:
                    System.out.println("Exception");
            }
        }
    }

    private void case1() {
        List<Object> objects = new ArrayList<>();
        while (true) {
            objects.add(new Object());
        }
    }

    private void case2() {
        BigObject bigObject = new BigObject();
        while (true) {
            final BigObject x = bigObject;
            bigObject = new BigObject() {
                BigObject y = x;
            };
        }
    }

    private void case3() {
        ClassPool classPool = ClassPool.getDefault();
        for (int i = 0; i < 1000000; i++) {
            try {
                Class c = classPool.makeClass(
                        i + " outOfMemory.OutOfMemoryErrorMetaspace ").toClass();
            } catch (CannotCompileException e) {
                e.printStackTrace();
            }
        }
    }

    private void case5() {
        Object1 object1 = new Object1();
        Object2 object2 = new Object2();
        object1.obj = object2;
        object2.obj = object1;
        String temp = object1.toString();
    }

    private void startRecursion() {
        recursion();
    }

    private void recursion() {
        startRecursion();
    }
}
