import java.util.*;

public class randomizer {
    public boolean isEmpty(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                count++;
            }
        }
        if (count == array.length) {
            System.out.println("Array is empty!");
        }
        return false;
    }

    public boolean isFull(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                count++;
            }
        }
        if (count == array.length) {
            System.out.println("Array is full!");
            return true;
        }
        return false;
    }

    public int getRandom() {
        Random random = new Random();
        int rand = random.nextInt(10);
        
        System.out.println("random index is: " + rand);
        return rand;
    }

    public void insert(int[] array, int value) {

        if (value > 0) {

            while (true) {
                int rand = getRandom();
                if (array[rand] < 0) {
                    array[rand] = value;
                    break;
                } else if (array[rand] >= 0) {
                    int rand2 = getRandom();
                    if (array[rand2] < 0) {
                        array[rand2] = value;
                        break;
                    }
                }
            }
        } else {
            return;
        }
    }

    public int delete(int[] array) {
        int rand3 = getRandom();
        int deletedNo = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[rand3] >= 0) {
                deletedNo = array[rand3];
                array[rand3] = -1;
                System.out.println("\nValue deleted:" + deletedNo + "\t" + "At random index:" + rand3 +"\n");
                break;
            } else if (array[rand3] < 0) {
                System.out.println("Value doesnt exist at index:" + rand3 +"/n");
                break;
            }
        }
        return deletedNo;
    }

    public void print(int[] array) {
        System.out.println("Array after operations.");
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + ":\t" + array[i]);
        }
    }
}
