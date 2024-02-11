public class class2 {
    public double [] findAverageAndDeviations(int [] array){
        int total = 0;
        double [] arr = new double [array.length];
        for (int i = 0; i < array.length; i++){
            total += array[i];
        }
        double average = (double) total / array.length;
        System.out.println("Average: " + average);
        for (int i = 0; i < arr.length; i++){
            arr[i] = array[i] - average;
        }
        return arr;
    }

    public int sumOfIndexes(int [] array, boolean oddOrEvenIndexes){
        int sum = 0;
        if (oddOrEvenIndexes){ //if oddOrEvenIndexes is true calculate the sum of odd indexes
            for (int i = 0; i < array.length; i++){
                if (i % 2 != 0){
                    sum += array[i];
                }
            }
        }
        else { //if oddOrEvenIndexes is true calculate the sum of even indexes
            for (int i = 0; i < array.length; i++){
                if (i % 2 == 0){
                    sum += array[i];
                }
            }
        }
        return sum;
    }
}
