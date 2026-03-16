class kthBit{
    public static void main(String[] args){
        int n = 5;
        int k = 3;

        if((n & (1<<(k-1)))!= 0){
            System.out.println("set");
        }else{
            System.out.println("Not send");
        }
    }
}