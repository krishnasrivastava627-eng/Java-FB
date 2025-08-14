// with third variable

public class swap {
    public static void main(String[] args){
        int a = 5, b = 6;
        
        System.out.println("Before swap: a = " + a + ", b = " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("After swap; a = " +a +" ,b = "+b);

    }
    
}

// without third variable

public class swap {
    public static void main(String[] args){
        int a = 5, b = 6;
        
        System.out.println("Before swap: a = " + a + ", b = " + b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swap; a = " +a +" ,b = "+b);

        int c = 15, d = 16;
        System.out.println("Before swap: c = " + c + ", d = " + d);
        c = c*d;
        d = c/d;
        c = c/d;
        System.out.println("After swap; c = " +c +" ,d = "+d);


    }
    
}
public class swap{
    public static void main(String[] args) {
        int a = 5, b = 10;

        System.out.println("Before swap: a = " + a + ", b = " + b);

        b =(a+b)-(a=b);

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
