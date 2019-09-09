package tryMyself.dataStuctures.queue;

import java.util.Scanner;

public class CircleArrayQueueTry {
    public static void main(String[] args) {
        CircleArray theCircleQueue = new CircleArray(4);
        char key = ' ';
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.println("s(show):show");
            System.out.println("e(exit):exit");
            System.out.println("a(add):add");
            System.out.println("g(get):get");
            System.out.println("h(head):head");
            key = scanner.next().charAt(0);
            switch (key) {
                case 's':
                    theCircleQueue.showQueue();
                    break;
                case 'a':
                    System.out.println("please input value: ");
                    int value = scanner.nextInt();
                    theCircleQueue.addQueue(value);
                    break;
                case 'g':
                    try {
                        int res = theCircleQueue.getQueue();
                        System.out.printf("data is%d\n", res);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h':
                    try {
                        int res = theCircleQueue.headQueue();
                        System.out.printf("data head is%d\n", res);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e':
                    scanner.close();
                    loop = false;
                    break;

                default:
                    break;
            }
        }
        System.out.println("exit");

    }

}
 class CircleArray {
        private int maxSize;
        private int front;
        private int rear;
        private int[] arr;

        public CircleArray(int arrMaxSize) {
            maxSize = arrMaxSize;
            arr = new int[maxSize];

        }


        public boolean isFull() {
            return (rear + 1) % maxSize == front;
        }

        public boolean isEmpty() {
            return front == rear;
        }

        public void addQueue(int n) {
            if (isFull()) {
                System.out.println("I'm full");
                return;
            }
            arr[rear] = n;
            rear = (rear + 1) % maxSize;

        }

        public int getQueue() {
            if (isEmpty()) {
                throw new RuntimeException("empty");
            }
            int value = arr[front];
            front = (front + 1) % maxSize;
            return value;
        }

        public void showQueue() {
            if (isEmpty()) {
                System.out.println("empty");
                return;
            }
            for (int i = front; i < front + size(); i++) {
                System.out.printf("arr[%d]=%d\n", i % maxSize, arr[i % maxSize]);
            }
        }

        public int size() {
            return (rear + maxSize - front) % maxSize;
        }

        public int headQueue() {
            if (isEmpty()) {
                //System.out.println("empty");
                throw new RuntimeException("empty");
            }
            return arr[front];
        }
    }




