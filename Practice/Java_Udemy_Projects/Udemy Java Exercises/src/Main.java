import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Point first = new Point(6, 4);
//        Point second = new Point(3,1);
//        System.out.println("distance(0,0)= " + first.distance());
//        System.out.println("distance(second)= " + first.distance(second));
//        System.out.println("distance(2,2)= " + first.distance(2,2));
//        Point point = new Point();
//        System.out.println("distance()= " + point.distance());

//        int[] normalArray = {1,2,3,4,5};
//        int[] reversedArray = new int[normalArray.length];
//
//        for(int i = 0; i < normalArray.length; i++) {
//            reversedArray[i] = normalArray[normalArray.length -1 - i];
//        }
//
//        System.out.println("normalArray: " + Arrays.toString(normalArray));
//        System.out.println("reversedArray: " + Arrays.toString(reversedArray));


//        int[] oneArray = {1,2,3,4,5};
//        int temp;
//        for(int i = 0; i < oneArray.length / 2; i++) {
//            temp = oneArray[i];
//            oneArray[i] = oneArray[oneArray.length - 1 - i];
//            oneArray[oneArray.length - 1 - i] = temp;
//            System.out.println("oneArray: " + Arrays.toString(oneArray));
//        }
//
//        System.out.println("oneArray: " + Arrays.toString(oneArray));


    }


    public class Person {

        private String firstName;
        private String lastName;
        private int age;

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public int getAge() {
            return this.age;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAge(int age) {
            if(age < 0 || age > 100) {
                this.age = 0;
            } else {
                this.age = age;
            }
        }

        public boolean isTeen() {
            return (this.age > 12 && this.age < 20);
        }

        public String getFullName() {
            if(this.firstName.isEmpty() && this.lastName.isEmpty()) {
                return "";
            }
            if(this.firstName.isEmpty()) {
                return this.lastName;
            }
            if(this.lastName.isEmpty()) {
                return this.firstName;
            }

            return this.firstName + " " + this.lastName;
        }
    }


    public class SimpleCalculator {

        private double firstNumber;
        private double secondNumber;

        public double getFirstNumber() {
            return this.firstNumber;
        }

        public double getSecondNumber() {
            return this.secondNumber;
        }

        public void setFirstNumber(double firstNumber) {
            this.firstNumber = firstNumber;
        }

        public void setSecondNumber(double secondNumber) {
            this.secondNumber = secondNumber;
        }

        public double getAdditionResult() {
            return this.firstNumber + this.secondNumber;
        }

        public double getSubtractionResult() {
            return this.firstNumber - this.secondNumber;
        }

        public double getMultiplicationResult() {
            return this.firstNumber * this.secondNumber;
        }

        public double getDivisionResult() {
            if(secondNumber == 0) {
                return 0;
            }
            return this.firstNumber / this.secondNumber;
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double area = width * height;
        int buckets = (int) Math.ceil(area / areaPerBucket);
        buckets -= extraBuckets;

        return buckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {

        if(width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double area = width * height;
        int buckets = (int) Math.ceil(area / areaPerBucket);

        return buckets;
    }

    public static int getBucketCount(double area, double areaPerBucket) {

        if(area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        int buckets = (int) Math.ceil(area / areaPerBucket);

        return buckets;
    }















    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        while(true) {
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {
                int number = scanner.nextInt();
                count++;
                sum += number;

            } else {
                break;
            }
        }

        long average = Math.round((double) sum / count);

        System.out.println("SUM = " + sum + " AVG = " + average);
    }


    public static void printSquareStar(int number) {

        if(number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for(int i = 0; i < number; i++) {
            for(int j = 0; j < number; j++) {
                if(i == 0 || i == number - 1 || j == 0 || j == number - 1 || i == j || (j == number - (i + 1))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static int getLargestPrime(int number) {
        if(number < 2) {
            return -1;
        }else if(number == 2) {
            return number;
        }

        int largestPrime = -1;
        boolean isPrime = false;

        for(int i = number; i > 1; i--) {
            if(number % i == 0) {

                if(i < 2) {
                    return -1;
                } else if(i == 2) {
                    return 2;
                }

                for(int j = i/2 + 1; j > 1; j--) {
                    if(i % j == 0) {
                        isPrime = false;
                        break;
                    } else {
                        isPrime = true;
                    }
                }
            }
            if(isPrime) {
                largestPrime = i;
                return largestPrime;
            }
        }
        return -1;
    }




}
