// Ho va ten : Do Gia Quan
//MSSV:12020309
package oop.asg02;

public class BigInteger
{
    private String number;
    public BigInteger(int init) {
        number = String.valueOf(init);
        
    }

    public BigInteger(String init) {
        int i=0;
        char x= init.charAt(i);
        while(x=='0'&&i<init.length()-1)
        {
           i++ ;           
		   x = init.charAt(i);
        }
        number= init.substring(i,init.length())  ;
    }

    public String toString() {
        
        return number;
    }

    public boolean equals(Object other) {
        return toString().equals(other.toString());
    }

    public long toLong() {
        return Long.parseLong(number);
    }
// ham add(BigInteger other) cho phep cong 2 BigIteger voi nhau
//so sanh do dai cua 2 BigInteger, neu xau nao ngan hon thi noi xau
//cho mot vong for chay tu cuoi den dau
//lay tung ki tu, chuyen ve dang xau, chuyen ve kieu int, sau do thuc hien phep cong
    public BigInteger add(BigInteger other) {

        String str = new String("0");
        String str1 = new String();
        String str2 = new String();
        int sum;
        int count=0;
        while (number.length()!=other.number.length()){
            if(number.length()<other.number.length())  number=str.concat(number) ; else
               other.number=str.concat(other.number);

        }
        for(int i=number.length()-1;i>=0;i--)
        {
            char x[] =  {number.charAt(i)};
            char y[] = {other.number.charAt(i)};

            String a= new String(x); ;
            String b= new String(y);

            sum= Integer.parseInt(a)+ Integer.parseInt(b) + count;

            count = sum/10;
            int mod = sum%10;

            str1= String.valueOf(mod);
            str2=str1+str2;


        }
        BigInteger sum1= new BigInteger(str2);
        return sum1;
    }
// ham subtract(BigInteger other) cho phep cong 2 BigIteger voi nhau
//so sanh do dai cua 2 BigInteger, neu xau nao ngan hon thi noi xau
//cho mot vong for chay tu cuoi den dau
//so sanh don vi cua tung xau
// neu don vi xau tren >= xau duoi thi thuc hien phep tru gan j=0
//nguoc lai, thi hieu duoc gan bang don vi xau tren +10+j-don vi xau duoi

    public BigInteger subtract(BigInteger other) {
        String str = new String("0");
        String str1 = new String();
        String str2 = new String();
        int subtract;
        int j = 0;

        while (number.length()!=other.number.length()){
            if(number.length()<other.number.length())  number=str.concat(number) ; else
                other.number=str.concat(other.number);

        }
        for(int i=number.length()-1;i>=0;i--)
        {
            char x[] =  {number.charAt(i)};
            char y[] = {other.number.charAt(i)};

            String a= new String(x);
            String b= new String(y);

            if( Integer.parseInt(a)>= Integer.parseInt(b) ) {
                subtract= Integer.parseInt(a)+j-Integer.parseInt(b);
                j=0;
            }
              else{
                subtract= Integer.parseInt(a)+10+j-Integer.parseInt(b);
                j=-1;

            }


            str1 = String.valueOf(subtract);
            str2 = str1 + str2;

        }
        BigInteger subtract1= new BigInteger(str2);
        return subtract1;
    }
}