import java.util.Scanner;

/*
6. Write a program to accept the year of graduation from school as an integer value from the users . Using the Binary search technique on the sorted array of integers given below . Output the message “record exists" if the value input is located in the array and if not output the message record does not exits”.
{1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002}
*/
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] record = {1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002};

        for (int i = 0; i < record.length; i++) {
            for (int j = i + 1; j < record.length; j++) {
                if (record[i] > record[j]) {
                    int temp = record[i];
                    record[i] = record[j];
                    record[j] = temp;
                }
            }
        }

        System.out.print("Enter the year of graduation: ");
        int yearOfGraduation = sc.nextInt();

        if (search(record, yearOfGraduation)) {
            System.out.println("Record exists");
        } else {
            System.out.println("Record does not exist");
        }
    }

    public static boolean search(int[] record, int target) {
        int start = 0;
        int end = record.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (record[mid] == target) {
                return true;
            } else if (record[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }
}
