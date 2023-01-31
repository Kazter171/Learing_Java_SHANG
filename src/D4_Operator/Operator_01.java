package D4_Operator;

public class Operator_01 {
    public static void main(String[] args){
        //TODO: 运算符，数据运算的符号

        //TODO: 表达式

        //TODO: 二元运算符：两个元素参与运算
        //类型是类型中最大的那种,最小使用为int类型
        System.out.println(1+2);
        System.out.println(1-2);
        System.out.println(1*2);
        System.out.println(1/2); // （int, int）=> int
        System.out.println(1.0/2); // （double, int）=> double
        System.out.println(1%2); //取余数，模运算

        byte b1 = 10;
        byte b2 = 20;
       //  byte b3 = b1 + b2; 错误，因为强制转为了int类型
        byte b3 = (byte) (b1 + b2);
        System.out.println(b3);

        System.out.println(1+2*3); //7
        System.out.println((1+2)*3); //9


        //TODO: 一元运算符：一个元素参与运算


    }
}
