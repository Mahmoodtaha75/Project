import java.util.*;
class hiring{
    public int n;
    public String names[] = new String[1000];
    public int exp[] = new int[1000];
    public String best;
    
    void candi(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of candidates:");
        n = sc.nextInt();
        
        for(int i=1;i<=n;i++){
        System.out.println("Enter employees name:");
            names[i] = sc.next();
        System.out.println("enter the experince years of the candidate:");
            exp[i] = sc.nextInt();
        }
        sc.close();
    }

    void bestcd(){
        int i;
        best = names[0];
        int maxexp = exp[0];
        for(i = 0; i<n ;i++){
            if (exp[i] > maxexp) {
                maxexp = exp[i];
                best = names[i];
            }
        }

        System.out.print("\nbest candidtate for you is :"+best);
    }

    public static void main(String[] args) {
        hiring hy = new hiring();
        hy.candi();
        hy.bestcd();
    }
}