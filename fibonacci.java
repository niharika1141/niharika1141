class RecursionDemo{
    static int fibonacci(int n) {
        if (n == 0){
            return 0;
    }
        else if(n==1){
            return 1;
        }
        else{
            return fibonacci(n - 1)+fibonacci(n - 2);
    }
}
    public static void main(String[] args) {
        int Number = 7;
            System.out.print("fibonacci Series:");
        for(int i=0; i < Number;i++){
            System.out.println(fibonacci(i)+"");
        }
    }
}
