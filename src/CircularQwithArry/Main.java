package CircularQwithArry;
public class Main
{
    public static void main(String[] args)
    {
               QwithArray obj = new QwithArray(5);
            System.out.println(obj.isQueueEmpty());
            System.out.println(obj.isQueueFull());
            obj.enQueue(10);
            obj.enQueue(20);
            obj.enQueue(30);
            obj.enQueue(35);
            obj.enQueue(40);
             System.out.println(obj.isQueueFull());
            obj.deQueue();
            obj.enQueue(55);
            obj.deQueue();

    }


}
