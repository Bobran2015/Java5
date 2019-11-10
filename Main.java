package com.company;
//Задача 6. Удаление повторяющихся символов. Два варианта.
import java.lang.reflect.Modifier;

public class Main {

    public static void main(String[] args) {
        long time = System.currentTimeMillis() ;

        String s = bezPovtor3 ( "abfsjhkjhнкуАПНКyweл;ewjkklеущегкнfkdj",
                                  "ahfjhjSгнцщhfh fkjshнещгDцешгhkjhgfxvc" ) ;
        System.out.println ( "Вариант 1. Результат: " + s ) ;
        time = System.currentTimeMillis() - time ;
        System.out.println ("Время выполнения = " + time + " мс" ) ;

        time = System.currentTimeMillis() ;
        String t = bezPovtor2 ( "abfsjhkjhнкуАПНКyweл;ewjkklеущегкнfkdj",
                                  "ahfjhjSгнцщhfh fkjshнещгDцешгhkjhgfxvc" ) ;
        System.out.println ( "Вариант 2. Результат: " + t ) ;
        time = System.currentTimeMillis() - time ;
        System.out.println ("Время выполнения = " + time + " мс" ) ;
    }
    public static String bezPovtor3 (String word1, String word2) {
        StringBuffer wordRez = new StringBuffer () ;
        String wordInside = word1 + word2 ;
        int n = wordInside.length() ;
        if (n > 0) {
            char[] wordIn = wordInside.toCharArray() ;
            //String rez1 = String.valueOf ( wordIn ) ;
            //System.out.println ( wordIn ) ;
            wordRez = wordRez.append ( wordIn[0] ) ;
            for (int i = 1 ; i < n ; i++ ) {
                String a = String.valueOf ( wordIn[i] ) ;
                int k = wordRez.indexOf ( a ) ;
                if (k == -1) {
                    wordRez = wordRez.append ( wordIn[i] ) ;
                    //System.out.println ( wordRez );
                }
            }
        }
        return wordRez.toString() ;
    }
    public static String bezPovtor2 (String word1, String word2) {
        String wordInside = word1 + word2 ;
        int n = wordInside.length() ;
        if (n > 0) {
            char[] wordIn = wordInside.toCharArray() ;
            char[] rez = new char[n] ;
            rez[0] = wordIn[0] ;
            int i = 1;
            int j = 0;
            while (i < n) {
                char a = wordIn[i];
                int p = j;
                for (int k = 0; k <= p; k++) {
                    if (rez[k] == a) {
                        break;
                    }
                    ;
                    if (k == j) {
                        ++j;
                        rez[j] = a;
                       //System.out.println ( rez[j] );
                    }
                }
                i++;
            }
            String rez1 = String.valueOf ( rez ) ;
            return rez1 ;
        }
        else {
            return "Входящие данные не содержат символов.";
        }
    }
}

/*public static String bezPovtor ( String word1, string word2 )  {
        StringBuffer wordInside = word1 + word2 ;
        int i = 0 ;
        while ( i < wordInside.length() ) {
            String a = wordInside.substring( i, i ) ;// Преобразование типа?
            wordInside = wordInside.replace( a,'' ) ;
            i++ ;
        }
        return wordInside.toString();
    } */
