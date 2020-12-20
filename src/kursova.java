import java.util.ArrayList;

public class kursova {

    public static void getResult(Integer input){
        ArrayList<Integer> results = new ArrayList<>();

        while(input>= 1){
            // find the biggest sequential number which is smaller than the input
            if (input < 10){
                results.add(input);
                break;
            }

            int biggest = (int) getBiggest(input);
            input = input - biggest;
            results.add(biggest);
        }

        System.out.println(results);
        System.out.println(results.size());
    }

    public static double getBiggest(Integer higherValue){
        int length = (int) (Math.log10(higherValue) + 1);
        length -= 2;

        double powerNumber = Math.pow(10, length);
        double seqNumber = higherValue - powerNumber;

        int firstDigit = Integer.parseInt(Integer.toString((int) seqNumber).substring(0, 1));
        int lengthOfSeq = (int) (Math.log10(seqNumber) +1);

        int magicNumber = getMagicNumber(firstDigit,lengthOfSeq);


        if(magicNumber<=higherValue){
            return magicNumber;
        } else{
            int lengthMagicNumber = (int) (Math.log10(magicNumber) +1) - 1;
            powerNumber = Math.pow(10,lengthMagicNumber);
            seqNumber = magicNumber - powerNumber;

            firstDigit =  Integer.parseInt(Integer.toString((int) seqNumber).substring(0, 1));
            lengthOfSeq = (int) (Math.log10(seqNumber) + 1);

            magicNumber = getMagicNumber(firstDigit, lengthOfSeq);
            }
            return magicNumber;
        }

    public static int getMagicNumber(int firstDigit, int lenghtOfSeq){
        int magicNumber = 0;
        int power = 1;
        int num = 0 ;

        for(int i = 0;i<lenghtOfSeq;i++){
            num = firstDigit * power;
            magicNumber +=num;
            power = power * 10;
        }
        return magicNumber;
    }
    public static void main(String[] args) {
        getResult(591271278);
}}
