class asdf{
    public static void main(String[] args) {
        
        for(int i = 1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
            //sapces
            int spaces = 2*(4-i);
            for(int j =1;j<=spaces;j++)
            {
                System.out.print(" ");
            }
            //2nd part
            for(int j=1;j<=i;j++)
            {
                System.out.println("*");
            }
            System.out.println();
        }


    }
}