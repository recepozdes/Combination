import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n, r,fakn=1,fakr=1,faknr=1;
        double combination;
        Scanner sc = new Scanner(System.in);
        System.out.print("n değerini giriniz : ");
        n = sc.nextInt();
        if(n>0){
            System.out.print("r değerini giriniz : ");
            r=sc.nextInt();
            if(r<=n){
                for(int i=1;i<=n;i++){
                    fakn=fakn*i;
                }
                for(int i=1;i<=r;i++){
                    fakr=fakr*i;
                }
                for(int i=1;i<=(n-r);i++){
                    faknr=faknr*i;
                }
                combination=fakn/(fakr*faknr);
                System.out.println("n!/(r!*(n-r)!) = "+combination);

            }
        }else{
            System.out.println("n değeri 0'dan büyük olmalıdır.");
        }
    }

    }
