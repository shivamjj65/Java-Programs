package com.programs;

//THIS IS A CLASS
    public class P18_Methods
    {

        //THIS IS ANOTHER METHOD ADD IN SAME CLASS AS OF MAIN, so  static keyword is used to declare
        static int add(int a,int b)
        {    //int is datatype, a , b are parameters
            int c = a+b;
            return c;               // returned value is c
        }

        //THIS IS A METHOD "void main"
        public static void main(String[] args)
        {
            System.out.println("Method is a function  written inside a class");
            System.out.println("Since java is a OOP language we need to declare method inside a class");
            System.out.println("Syntax: dataType name(){\n\t//body\n}");
            System.out.println("Function can be called by two ways:\n \t1.By calling method having static within a same class \n eg: \npublic class methods{\n\n\tstatic int method1(parameters){\n\t\t//method code\n\t\treturn ;\n\t\t}\n\n\t\tint method2(parameters){\n\t\t//method code\n\t\treturn ;\n\t\t}\n\n\t\tpsvm{\n\t\tmethod1(parameters);\n\t\tmethods obj = new methods();\t//object created\n\t\tobj.method2(parameters);\t//method 2 called through class object\n\t\t}\n}");
            int a=10,b=20;
            int c = add(a,b); // CALLING A METHOD
            System.out.println("\nAddition is: "+c);
            int x=100,y=23;
            int z;
            P18_Methods obj = new P18_Methods();
            z = obj.sub(x,y);
            System.out.println("Subtraction is "+z);

        }

        int sub(int a,int b){
            int c= a-b;
            return c;
        }

}
