package pak2;

public class qwe {
    int id1, id2, id3, id4, id5;

    qwe(int id11, int id12, int id13, int id14, int id15) {
        id1 = id11;
        id2 = id12;
        id3 = id13;
        id4 = id14;
        id5 = id15;

    }
    public qwe() {
        this(0, 0, 0, 0, 0);
        //id1 = id21;
    }

    public qwe(int id21)  {   //Вот это! Хочу чтобы показалось в 
        this(id21, 0, 0, 0, 0);
        //id1 = id21;
    }

    qwe(int id31, int id32) {
        this(id31, id32, 0, 0, 0);    //Записываем матрицу и подставляем недостающий
        // параметр в этом конструкторе как ноль, как нулевое что-то.
        // id1 = id31;
        // id2 = id32;
    }

    qwe(int id31, int id32,int id33) {
        this(id31, id32, id33, 0, 0);    //Записываем матрицу и подставляем недостающий
        // параметр в этом конструкторе как ноль, как нулевое что-то.
        // id1 = id31;
        //id2 = id32;
        //id3 = id33;
    }



/*
    public static void main(String[] args) {
        // write your code here

        qwe s1 = new qwe(12, 23, 45, 5, 453);
        System.out.println(s1.id1 + s1.id2 + s1.id3 + s1.id4 + s1.id5);
        qwe s2 = new qwe(12);
        System.out.println(s2.id1 + s2.id2 + s2.id3 + s2.id4 + s2.id5);
        qwe s3 = new qwe(12,98);
        System.out.println(s3.id1 + s3.id2 + s3.id3 + s3.id4 + s3.id5);
        qwe s4 = new qwe(12,98,455);
        System.out.println(s4.id1 + s4.id2 + s4.id3 + s4.id4 + s4.id5);
        qwe s5 = new qwe();
        System.out.println(s5.id1 + s5.id2 + s5.id3 + s5.id4 + s5.id5);
    }*/
}
