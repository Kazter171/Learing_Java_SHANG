package D3_Java_dataType;

public class dataType_03 {
    public static void main(String[] args){

        // TODO:P 数据类型的转换

        String name = "ZhangSan";
        int age = 30;

        // byte -> short -> int -> long -> float -> double
        byte b = 10;
        short s = b;
        int i = s;
        long lon = i;
        float f = lon;
        double d = f;
        // 范围小的数据可以直接转换为范围打的数据，大的不能直接转

        int i1 = (int) 10.30; //小括号强制转换


    }
}
