public class Compare3 implements Comparable<Compare3>
{


    private static Comparable a;

    public static Comparable largest(Comparable x1, Comparable x2, Comparable x3)
    {a=x1;
    if(a.compareTo(x2)==-1){
        a=x2;
        if(a.compareTo(x3)==-1) return x3;
        else return x2;
    }
    else{
        if(a.compareTo(x3)==-1) return x3;
        else return x1;
    }

    }

    @Override
    public int compareTo(Compare3 o) {
        return this.a.compareTo(o);
    }
}
