 class IQDemo {
    public static void main (String args []){
        FixedQueue q1 = new FixedQueue (10);
        DynQueue q2 = new DynQueue (5);
        CircularQueue q3 = new CircularQueue (10);

        ICharQ iQ;

        char ch;
        int i;

        iQ = q1;
        for (i=0;i<10; i++)
            iQ.put((char) ('A' + i));

            System.out.print("Soderjimoe ocheredi: ");
            for (i = 0;i<10;i++){
                ch = iQ.get();
                System.out.print(ch);
            }


        System.out.println ();

        iQ = q2;
        for(i=0; i<10;i++)
            iQ.put ((char) ('Z' - i));

        System.out.print("Soderjimoe dynamicheskoi ocheredi: ");
        for (i=0; i<10;i++){
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println();

        iQ = q3;
        for(i=0;i<10;i++)
            iQ.put ((char) ('A' +i));

        System.out.print("Soderjimoe kolcevoi ocheredi: ");
        for(i=0;i<10;i++) {
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println();

        // Помещение дополниетльного символа в кольцевую очередь
        for(i=10; i<20; i++)
            iQ.put ((char) ('A' + i));

        System.out.print("Soderjimoe kolcevoi ocheredi: ");
        for(i=0;i<10;i++){
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println("\n Sohranenie i ispolzovanie dannih" + " kolcevoi ocheredi.");

        // Помещение сиволов в кольцевую очередь с их извлечением
        for (i=0; i<20; i++){
            iQ.put((char) ('A' + i));
            ch = iQ.get();
            System.out.print(ch);
        }


    }
}
