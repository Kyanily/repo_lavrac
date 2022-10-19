class Naloga1 {
    public static void main(String[] args) {
        for (int k = 1; k <= 10; k++) {
            System.out.print(k);
        }

        System.out.println();

        for(int i = 2; i <= 10; i++) {
            System.out.print(" ");
            for(int j = 2; j <= i; j++) { 
                if(j != i) {
                    System.out.print(" ");
                }
                else if(j == i){
                    System.out.print(i);    
                }
            }
            System.out.println();
        }
    }
}

