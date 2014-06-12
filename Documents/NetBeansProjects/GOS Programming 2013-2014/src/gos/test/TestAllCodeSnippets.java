package gos.test;

import gos.tasks.Q1;
import gos.tasks.Q10;
import gos.tasks.Q11;
import gos.tasks.Q12;
import gos.tasks.Q13;
import gos.tasks.Q14;
import gos.tasks.Q15;
import gos.tasks.Q16;
import gos.tasks.Q17;
import gos.tasks.Q18;
import gos.tasks.Q19;
import gos.tasks.Q2;
import gos.tasks.Q20;
import gos.tasks.Q21;
import gos.tasks.Q22;
import gos.tasks.Q23;
import gos.tasks.Q24;
import gos.tasks.Q25;
import gos.tasks.Q3;
import gos.tasks.Q4;
import gos.tasks.Q5;
import gos.tasks.Q6;
import gos.tasks.Q7;
import gos.tasks.Q8;
import gos.tasks.Q9;
import gos.tasks.polymorphism.Rectangle;
import gos.tasks.polymorphism.Square;
import gos.tasks.polymorphism.Triangle;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * @author Çağrı Çakır
 */
public class TestAllCodeSnippets {

    private static final String PATH = System.getProperty("user.dir");
    public static String folder = PATH + File.separator + "src" + File.separator + "gos" + File.separator + "tasks" + File.separator;

    public static void main(String[] args) {
        actionMenu();
    }

    private static void showMenu() {
        System.out.println("Subject: Programming Language ");
        System.out.println("******************************");
        System.out.println("Press, ");
        System.out.println("\"1\", Constructors and Methods Overloading");
        System.out.println("\"2\", Arrays and Loops");
        System.out.println("\"3\", Recursive Functions");
        System.out.println("\"4\", Encapsulation");
        System.out.println("\"5\", Recursion. Advantages and disadvantages of the recursion");
        System.out.println("\"6\", I/O Streams");
        System.out.println("\"7\", Inheritance");
        System.out.println("\"8\", Inheritance and Method Overriding");
        System.out.println("\"9\", Inheritance and Polymorphism");
        System.out.println("\"10\", Stack. Main concept and its implementation as container");
        System.out.println("\"11\", Namespace. Localization scope of the variables");
        System.out.println("\"12\", Strings");
        System.out.println("\"13\", Queue. Main concept and implementation as container");
        System.out.println("\"14\", Abstract Classes");
        System.out.println("\"15\", Interface and Inheritance");
        System.out.println("\"16\", Binary Search");
        System.out.println("\"17\", Exception handling");
        System.out.println("\"18\", Inner Class");
        System.out.println("\"19\", Selection Sorting");
        System.out.println("\"20\", ArrayLists");
        System.out.println("\"21\", MultiThreading");
        System.out.println("\"22\", Method's arguments and return types");
        System.out.println("\"23\", Keywords in JAVA (THIS, SUPER)");
        System.out.println("\"24\", Keyword FINAL in JAVA");
        System.out.println("\"25\", Insertion Sorting");
        System.out.println();
        System.out.println("\"-1\", QUIT");
    }

    private static void iterateAction() {
        System.out.println("\nContinue(c) or Exit(-1)");
        Scanner def = new Scanner(System.in);
        String default_selection = def.nextLine();
        if ("c".equals(default_selection)) {
            actionMenu();
        } else {
            System.exit(0);
        }
    }

    private static void actionMenu() {
        int selection;

        showMenu();

        Scanner input = new Scanner(System.in);
        selection = input.nextInt();
/////////////////////////////  TEST MENU ACTION   //////////////////////////////       
        switch (selection) {
            case 1: {
                q1();
                readAnswerInFile("Q1");
                iterateAction();
                break;
            }
            case 2: {
                q2();
                readAnswerInFile("Q2");
                iterateAction();
                break;
            }
            case 3: {
                q3();
                readAnswerInFile("Q3");
                iterateAction();
                break;
            }
            case 4: {
                q4();
                readAnswerInFile("Q4");
                iterateAction();
                break;
            }
            case 5: {
                q5();
                readAnswerInFile("Q5");
                iterateAction();
                break;
            }
            case 6: {
                q6();
                readAnswerInFile("Q6");
                iterateAction();
                break;
            }
            case 7: {
                q7();
                readAnswerInFile("Q7");
                readAnswerInFile("inheritence/Point");
                readAnswerInFile("inheritence/Circle");
                readAnswerInFile("inheritence/Cylinder");
                iterateAction();
                break;
            }
            case 8: {
                q8();
                readAnswerInFile("Q8");
                iterateAction();
                break;
            }
            case 9: {
                q9();
                readAnswerInFile("Q9");
                readAnswerInFile("polymorphism/Triangle");
                readAnswerInFile("polymorphism/Square");
                readAnswerInFile("polymorphism/Rectangle");
                iterateAction();
                break;
            }
            case 10: {
                q10();
                readAnswerInFile("Q10");
                iterateAction();
                break;
            }
            case 11: {
                q11();
                readAnswerInFile("Q11");
                iterateAction();
                break;
            }
            case 12: {
                q12();
                readAnswerInFile("Q12");
                iterateAction();
                break;
            }
            case 13: {
                q13();
                readAnswerInFile("Q13");
                iterateAction();
                break;
            }
            case 14: {
                q14();
                readAnswerInFile("Q14");
                readAnswerInFile("abstractclass/AbstractClass");
                iterateAction();
                break;
            }
            case 15: {
                q15();
                readAnswerInFile("Q15");
                readAnswerInFile("interfaceclass/InterfaceClass");
                iterateAction();
                break;
            }
            case 16: {
                q16();
                readAnswerInFile("Q16");
                iterateAction();
                break;
            }
            case 17: {
                q17();
                readAnswerInFile("Q17");
                iterateAction();
                break;
            }
            case 18: {
                q18();
                readAnswerInFile("Q18");
                iterateAction();
                break;
            }
            case 19: {
                q19();
                readAnswerInFile("Q19");
                iterateAction();
                break;
            }
            case 20: {
                q20();
                readAnswerInFile("Q20");
                iterateAction();
                break;
            }
            case 21: {
                q21();
                readAnswerInFile("Q21");
                iterateAction();
                break;
            }
            case 22: {
                q22();
                readAnswerInFile("Q22");
                iterateAction();
                break;
            }
            case 23: {
                q23();
                readAnswerInFile("keywords/SubClass");
                readAnswerInFile("keywords/SuperClass");
                readAnswerInFile("keywords/TestKeyword");
                iterateAction();
                break;
            }
            case 24: {
                q24();
                readAnswerInFile("Q24");
                iterateAction();
                break;
            }
            case 25: {
                q25();
                readAnswerInFile("Q25");
                iterateAction();
                break;
            }
            case -1: {
                break;
            }
            default: {
                System.out.println("\tWrong option!\n");
                iterateAction();
            }
        }
    }

    private static void readAnswerInFile(String sourceFileName) {
        try {
            File file = new File(folder, sourceFileName + ".java");
//            System.out.println(file.toString());
            String cmds[] = new String[]{"cmd", "/c", file.toString()};
            Runtime.getRuntime().exec(cmds);
        } catch (IOException ex) {
            Logger.getLogger(TestAllCodeSnippets.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void q1() {
        Q1 ref = new Q1();
        ref.findVolume(3);
        ref.findVolume(3, 4);
        ref.findVolume(3, 4, 7);
    }

    private static void q2() {
        Q2 ref = new Q2();
        ref.initialize();
        ref.resizeCopy();
        ref.resizePaste();
    }

    private static void q3() {
        Q3 ref = new Q3();
        ref.firstN();
    }

    private static void q4() {
        Q4 ref = new Q4();
        String refStr = "PublicKey";
        ref.password = refStr;
        ref.setPassword(refStr);
        System.out.println(ref.getPassword());
    }

    private static void q5() {
        Q5 ref = new Q5();    
        ref.firstN();
    }

    private static void q6() {
        Q6 ref = new Q6();    
        try {
            ref.copyContent();
        } catch (IOException ex) {
            Logger.getLogger(TestAllCodeSnippets.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void q7() {
        Q7 ref = new Q7();    
        ref.testPoint();
        ref.testCircle();
        ref.testCylinder();
    }

    private static void q8() {
        Q8 ref = new Q8();    
        ref.run();
    }

    private static void q9() {
        
        Q9 refRECTANGE = new Rectangle("red", 5, 4);
        System.out.println(refRECTANGE + "\t Area of rectange is " + refRECTANGE.getArea());
        Q9 refTRIANGLE = new Triangle("blue", 3, 4);
        System.out.println(refTRIANGLE + "\t Area of triangle is " + refTRIANGLE.getArea());
        Q9 refSQUARE = new Square(3, "green");
        System.out.println(refSQUARE + "\t Area of square is " + refSQUARE.getArea());
        
        double[] areas = {
            refRECTANGE.getArea(),
            refSQUARE.getArea(),
            refTRIANGLE.getArea()
        };
        
        for(int i=0; i<areas.length; i++)
        {
            System.out.print(areas[i] + "\t");
        }
    }

    private static void q10() {
        Q10 ref = new Q10();    
        ref.reverseWordStack();
    }

    private static void q11() {
        Q11 ref = new Q11();    
        ref.namespace();
    }

    private static void q12() {
        Q12 ref = new Q12();    
        ref.compareString();
        ref.splitString();
    }

    private static void q13() {
        Q13 ref = new Q13();    
        ref.queue();
    }

    private static void q14() {
        Q14 ref = new Q14();    
        ref.draw();
    }

    private static void q15() {
        Q15 ref = new Q15();    
        ref.aMethod(0);
        ref.bMethod(0);
    }

    private static void q16() {
        Q16 ref = new Q16();    
        ref.searchBinary();
    }

    private static void q17() {
        Q17 ref = new Q17();
        ref.catchException();
    }

    private static void q18() {
        Q18 ref = new Q18();    
        ref.reachInnerClass();
    }

    private static void q19() {
        Q19 ref = new Q19();
        int [] elements = {98,13,434,2,54,13,45};
        ref.selectionSort2(elements);
    }

    private static void q20() {
        Q20 ref = new Q20();    
        ref.getClass();
        ref.showList();
        ref.removeElement();
        ref.addElement();
        ref.showList();
    }

    private static void q21() {
        Q21 ref = new Q21();    
        ref.configureThreads();
        ref.runThreads();
    }

    private static void q22() {
        Q22 ref = new Q22();
        String a =ref.callBack();
        System.out.print(a);
    }

    private static void q23() {
        Q23 ref = new Q23();
        ref.runKeyword();
    }

    private static void q24() {
        Q24 ref = new Q24();  
        double multiplyFinal = ref.multiplyFinal();
        System.out.print(multiplyFinal);
    }

    private static void q25() {
        Q25 ref = new Q25();
        int[] input = {4, 2, 9, 6, 23, 12, 34, 0, 1};
        ref.insertionSort(input);
    }
}
