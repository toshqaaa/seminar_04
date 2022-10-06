import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/*
1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.

 */
public class ThirdProblem {
    int n;
    Object[] a;

    ThirdProblem() {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        a = new Object[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.next();
        }
        in.close();
    }

    public void addToStack(Object[] a) {
        Stack<Object> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(a[i]);
        }
        System.out.println("Первоначальный стэк: " + stack);
        int size = stack.size();
        for (int i=0; i<size; i++) {
            System.out.println("Взяли посмотреть " + i +": " + stack.peek());
            System.out.println("Взяли посмотреть и удалить " + i +": " + stack.pop());
        }
        System.out.println("Должен быть пустой стэк: " + stack);

    }

    public void addToQueue(Object[] a) {
        Queue<Object> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.add(a[i]);
        }
        System.out.println("Первоначальный очередь: " + queue);
        int size = queue.size();
        for (int i=0; i<size; i++) {
            System.out.println("Взяли посмотреть " + i +": " + queue.peek());
            System.out.println("Взяли посмотреть и удалить " + i +": " + queue.poll());
        }
        System.out.println("Должна быть пустая очередь: " + queue);
    }
}
