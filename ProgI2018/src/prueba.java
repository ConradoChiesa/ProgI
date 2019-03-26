
public class prueba {

public static void main(String[] args){
int i,j,k;
i = 4;
j = 3;
k = 4;
System.out.println("(i==j)||(i==k) "+
((i==j)||(i==k)));
System.out.println("(i==j)||(i==k)&&(i==2) "+
((i==j)||(i==k)&&(i==2)));
System.out.println("(i==j)||((i==k)&&(i==2)) "+
((i==j)||((i==k)&&(i==2))));
}
}