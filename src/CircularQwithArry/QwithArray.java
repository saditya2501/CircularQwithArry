package CircularQwithArry;
public class QwithArray
{
        int[] arr;
        int top;
        int size;
        int beginning;
      public QwithArray(int size)
      {
            arr= new int[size];
            top = -1;
            beginning = -1;
      }

        public boolean isQueueEmpty()
        {
            if (beginning == -1)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        public boolean isQueueFull()
        {

            if ((beginning==0) && (top+1 == arr.length))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        public void enQueue(int value)
        {
            if (isQueueFull())
            {
                System.out.println("\nQueue overflow ");
            }
            else
                {
                if(beginning ==-1)
                {
                    beginning = 0;
                }
                if (top+1 == arr.length)
                {
                    top=0;
                }
                else
                    {
                    top++;
                }
                arr[top] = value;
                System.out.println("\nInserted "+value+" in the Queue.");
            }
        }
       public void deQueue()
       {
         if (isQueueEmpty())
         {
                System.out.println("Queue underflow!!");
            }
         else
             {
                System.out.println("Dequeue from Queue- " + arr[beginning]);
                arr[beginning]= 0;
                if (beginning == top)
                {
                    beginning = top = -1;
                }
                else if (beginning + 1 == arr.length)
                {
                    beginning = 0;
                }
                else
                    {
                    beginning++;
                }
            }
        }
}



