
 class arm {
     public  static  void main(String[] args){

       int h=  sumofArmstrong(1,500);
         System.out.println(h);
        }
       static  double isArmstrong ( int n){
         int c = 0, b;
             double a = 0.0;

             int i = n;
             int j = n;
             while (i != 0) {
                 c++;
                 i = i / 10;
             }
             while (j != 0) {
                 b = j % 10;
                 a += Math.pow(b, c);
                 j = j / 10;
                 b = 0;
             }
             if(a==n)
             return a;
             return 0;
         }

        static int sumofArmstrong ( int a, int b){
             int g;
             double sum = 0.0;


             double f = 0.0;
             for (g = a; g <= b; g++) {
                 f = isArmstrong(g);
                 sum += f;
             }
             return (int) sum;


         }
     }

