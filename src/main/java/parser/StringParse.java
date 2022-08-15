package parser;

import enums.Note;
import org.jfugue.pattern.Pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

public class StringParse {

    private static final java.util.regex.Pattern NOTAS_MUSICAIS = java.util.regex.Pattern.compile("([a-h])| |([A-H])");
    private static final java.util.regex.Pattern COMANDOS_DE_CONTROLE = java.util.regex.Pattern.compile("([a-h])| |([A-H])");
    public Pattern doStringParse(String text){
        char[] characterArray = text.toCharArray();
        Pattern pattern = new Pattern();
        List<String> notes = new ArrayList<>();


        for (char c : characterArray) {
            String letter = String.valueOf(c).toUpperCase();
            Matcher matchNotas = NOTAS_MUSICAIS.matcher(letter);
            Matcher controles = COMANDOS_DE_CONTROLE.matcher(letter);
            if (matchNotas.find()) {
                if(letter.equals(" ")){
                    letter = "SPACE";
                }
                pattern.add(Note.valueOf(letter).toString());
            }else if(controles.find()) {

            }
        }
        return pattern;
    }
}
