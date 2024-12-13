class Armstrong {
    public static void main(String[] args) {
        int n, b, sum = 0, digits, temp;
        System.out.println("Armstrong numbers from 1 to 1000:");
      
        for (int i = 1; i <= 1000; i++) {
            n = i;  
            temp = n;
            digits = 0;
            sum = 0;

               while (temp > 0) {
                temp = temp / 10;
                digits++;
            }

            temp = n; 
            while (temp > 0) {
                b = temp % 10;
                sum += Math.pow(b, digits);
                temp = temp / 10; 
            }
            if (sum == n) {
                System.out.println(n + " ");
            }
        }
    }
}