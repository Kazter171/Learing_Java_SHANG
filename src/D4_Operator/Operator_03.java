package D4_Operator;

public class Operator_03 {
    public static void main(String[] args){
        //TODO: 运算符，数据运算的符号

        //TODO: 表达式

        //TODO: 一元运算符：一个元素参与运算

        int i = 1;
        int j = i++; // 先将i变量的值赋值给变量j,然后再加1

        //i被栈顶值所覆盖，导致最终i的值仍然是i的初始值。无论重复多少次i = i++操作，最终i的值都是其初始值。
        //正确为 int j = ++i;

        System.out.println(j);



    }
}
