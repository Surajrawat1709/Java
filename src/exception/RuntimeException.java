package exception;

//UnChecked Exception
public class RuntimeException {
    public static void main(String[] args) {
//        classCastException();
//        arithmeticException();
       // indexOutOfBoundException();
        nullPointerException();
    }

// 1) ClassCast Exception
    public static void classCastException(){
        Object val=0;
        System.out.println((String)val);
    }
// 2) Arithmetic Exception
public static void arithmeticException(){
    int a=10,b=0;
    System.out.println(a/b);
}

// 3) ArrayIndexOutOfBound/StringIndexOutofBOund Exception
public static void indexOutOfBoundException(){
//    int[] arr=new int[3];
//    System.out.println(arr[6]);
    String str="Suraj";
    System.out.println(str.charAt(8));
}

    // 4)  NullPointer Exception
    public static void nullPointerException(){
        String str=null;
        System.out.println(str.charAt(8));
    }

    // 5)
}
