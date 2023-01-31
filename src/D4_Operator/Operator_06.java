package D4_Operator;

public class Operator_06 {
    public static void main(String[] args){
        //TODO: 运算符，数据运算的符号

        //TODO: 逻辑运算符 —— 比较条件表达式之间的关系

        // 变量 = 条件表达式1 逻辑运算符 条件表达式2
        // 结果为Boolean
        // TRUE TURE =>
        // TRUE FALSE =>
        // FALSE TRUE =>
        // FALSE FALSE =>

        //TODO: & AND
        // 只有两个结果为TRUE时才为TRUE
        int i = 10;
        Boolean result = (i > 5) & (i < 20);
        Boolean result1 = (i > 11) & (i < 50);
        System.out.println(result);
        System.out.println(result1);

        //TODO: | OR
        // 只要任意一个结果为TRUE时才为TRUE
        int j = 10;
        Boolean result_or = (j > 5) | (j < 20);
        Boolean result1_or = (j > 11) | (j < 50);
        Boolean result2_or = (j > 11) | (j < 9);
        System.out.println(result_or);
        System.out.println(result1_or);
        System.out.println(result2_or);

        //TODO: && 短路与运算
        // 根据第一个的结果决定是否执行第二个
        // 若第一个结果为TRUE则执行第二个是否为TURE
        // 若执行第一个结果为FALSE则不执行第二个

        int k = 10;
        int q = 20;
        Boolean result_03 = (k > 5) && (q < 10);
        Boolean result1_03 = (k > 11) && (q < 50);
        Boolean result2_03 = (k > 5) && (q < 30);
        Boolean result3_03 = (k < 5) && (q < 50);

        Boolean result4_03 = (k < 5) && (++q > 20);


        System.out.println(result_03);
        System.out.println(result1_03);
        System.out.println(result2_03);
        System.out.println(result3_03);
        System.out.println(result4_03);
        System.out.println(q);

        //TODO: || 短路或运算
        // 根据第一个的结果决定是否执行第二个
        // 若第一个结果为FALSE则执行第二个是否为FALSE
        // 若执行第一个结果为TRUE则不执行第二个

        int x = 10;
        int z = 20;

        Boolean result5= (x < 5) || (++z > 30);

        System.out.println(result5);
        System.out.println(z);

        //TODO: ! 相反运算
        // true => fasle
        // false => true

        Boolean result6= x==10;
        System.out.println(result6);
        System.out.println(!result6);
    }
}
