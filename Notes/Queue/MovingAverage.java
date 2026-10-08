import java.util.*;

class Solution {

    static class MovingAverage {
        Queue<Integer> q;
        int size;
        double sum;

        MovingAverage(int size) {
            this.size = size;
            q = new LinkedList<>();
            this.sum = 0.0;
        }

        double next(int value) {
            q.add(value);
            sum += value;
            
            if (q.size() > size) {
                sum -= q.poll();
            }

            return sum / q.size(); 
        }
    }

    public static void main(String[] args) {
        MovingAverage obj = new MovingAverage(3);

        System.out.println(obj.next(1));
        System.out.println(obj.next(10));
        System.out.println(obj.next(3));
        System.out.println(obj.next(5));
    }
}