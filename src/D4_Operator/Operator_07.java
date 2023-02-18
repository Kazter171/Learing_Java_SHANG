package D4_Operator;

public class Operator_07 {
    public static void main(String[] args){
    //TODO：运算符：三元运算符
        //条件表达式
        // 变量 = （条件表达式） ？ （任意表达式1）：（任意表达式（2））
        // k = （条件表达式）？ TRUE 执行 ：FALSE执行
        int i = 10;
        int j = 20;

        int k = (i == 10) ? 1+1 : 2+2;

        System.out.println(k);
    }
}
