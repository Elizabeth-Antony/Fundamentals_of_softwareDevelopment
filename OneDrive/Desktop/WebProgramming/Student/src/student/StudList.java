
import java.util.Scanner;
import student.Student;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author The following has evaluated to null or missing:
==> ElizabethAntony  [in template "Templates/Classes/Class.java" at line 24, column 14]

----
Tip: If the failing expression is known to legally refer to something that's sometimes null or missing, either specify a default value like myOptionalVar!myDefault, or use <#if myOptionalVar??>when-present<#else>when-missing</#if>. (These only cover the last step of the expression; to cover the whole expression, use parenthesis: (myOptionalVar.foo)!myDefault, (myOptionalVar.foo)??
----

----
FTL stack trace ("~" means nesting-related):
	- Failed at: ${ElizabethAntony}  [in template "Templates/Classes/Class.java" at line 24, column 12]
----
 */

public class StudList {
  public static void main(String[] args) {
       
        Student[] s1 = new Student[3];
        
        Scanner input = new Scanner(System.in);
        
        for(int i=0;i<s1.length;i++){
            s1 [i] = new Student();
            System.out.println("Enter a Student name: ");
            s1[i].setName(input.nextLine());
        }
        for(int i =0;i<s1.length;i++){
             
            System.out.println("Student name:" +s1[i].getName());
        }
    }
    
}
