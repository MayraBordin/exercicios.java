package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {
    // metodo "STATIC" serve para utilizarmos uma classe mesmo sem instanciar ela!
    public static String converterDateParadataEHora(Date data){

        //  SimpleDateFormat é uma classe que é utilizado para formatar, temos que passar o formato que queremos que ele formate;
        SimpleDateFormat formatador =new SimpleDateFormat("dd/MM/YYYY HH:mm");
        //07/07/2003 12:40;
        //dd/MM/YYYY HH:mm;
        // o "HH" de horas maiusculo é para formato PM Apos 12h, e "hh" minusculo é AM antes das 13h;
        return formatador.format(data);
        // retornar o que o formatador receber e ja formatar!!
    }

    public static String converterDateParadata(Date data){
        // utilizado para formatar somente data!
        SimpleDateFormat formatador =new SimpleDateFormat("dd/MM/YYYY");
       return formatador.format(data);
    }

        public static String converterDateParaHora(Date data){
            // utilizado para formatar somente horas!
            SimpleDateFormat formatador =new SimpleDateFormat(" HH:mm:ss");
           
            return formatador.format(data);

}
}
