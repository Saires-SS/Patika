package javass;

public class biryuzasalsayilar {
        public static void main(String[] args) {
            int count = 0;
            for(int numb = 2; numb <=100; numb++)
            {int control = 0;
                for (int i = 2; i < numb; i++)
                {if (numb % i == 0)
                    {control = 1;
                        break;}}
                if(control ==0)
                {System.out.print(numb +"\n");
                    count++;}}}}