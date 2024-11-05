
class CharDemo {
    public static void main(String args[]){
        char ch1, ch2;
        ch1 = 88;
        ch2 = 'Y';

        System.out.print("ch1 and ch2: ");
        System.out.println(ch1 + "" + ch2);
        ch2--;
        System.out.println("ch2 is now " + ch2);



        int months [] = new int[12] ;
        int j = months.length;
        int i;

        for( i = 0; i < j; i++){
            System.out.println(i);
        }

    }

    int revenue [] [] = new int [12][25];
    int c, b , d = 0;

    for(c = 0; c < 12; c++){
        for(b = 0; b < 25; b++){
            revenue[c][b] = d;
            d++;
        }
    }

    for(c = 0; c < 12; c++){
        for (b = 0; b < 25; b++)
        System.out.print(revenue[c][d] + "");
        System.out.println();
    }
}