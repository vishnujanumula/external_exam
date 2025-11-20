import java.lang.*;
Public class Swap{
void swapping(int a,int b){
{
int c;
c=a;a=b;b=c;
System.out.println("After Swapping");
System.out.println("Value of a is " +a);
System.out.println("Value of b is " +b);
}

Public static void main(String args[]){
Swap s = new Swap();
int a=2,b=3;
System.out.println("Before swapping");
System.out.println("Value of a is" +a);
System.out.println("value of b is "+b);
s.swapping(a,b);
}
}
