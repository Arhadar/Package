package pak2;

public class qwe {
    public int id1, id2, id3, id4, id5;         //Обязательно надо сделать паблик эти переменные!!!

    public qwe(int id11, int id12, int id13, int id14, int id15) {
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

}
