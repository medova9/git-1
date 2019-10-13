package homeworkString;

import java.util.regex.Pattern;

public class MainClass {
    public static void main(String[] args) {
        String text =
                "1. В цифровой форме число заметнее. По наблюдениям психологов, «первоклассники не замечают в условии" +
                        " задачи арифметическое данное, если оно обозначено словесно, а не в виде цифры, к чему они привыкли»" +
                        " (Богоявленский Д. Н. Психология усвоения знаний в школе / Д. Н. Богоявленский, Н. А. Менчинская. М." +
                        ", 1959. С. 169).\n" +
                        "2. В цифровой форме дву- и многозначные числа схватываются читателем намного быстрее? Они, по-видимо" +
                        "му, не прочитываются, не переводятся мысленно в словесную форму, а именно схватываются взглядом, что" +
                        " упрощает и ускоряет восприятие текста?\n" +
                        "3. Однозначные числа в косвенных падежах в цифровой форме несколько усложняют чтение. Скорее всего, " +
                        "потому, что все же прочитываются в именительном падеже (после 4 заседаний — «после четыре заседаний»" +
                        "). Но потребность согласовать с падежом существительного вынуждает вернуться к числительному и прочи" +
                        "тать его правильно: четырех заседаний. На это уходит время, а при словесной форме числительное сразу" +
                        " читается правильно.";
        System.out.println(text);
        String textOut;

        System.out.println("------------------------------------");
        System.out.println("1. Преобразовать текст так, чтобы каждое слово начиналось с заглавной буквы.");
        textOut = runTask1(text);
        System.out.println(textOut);

        System.out.println("------------------------------------");
        System.out.println("2. Подсчитать количество содержащихся в данном тексте знаков препинания");
        int counter = runTask2(text);
        System.out.println("Количество знаков препинания " + counter);

        System.out.println("------------------------------------");
        System.out.println("3.  Определить сумму всех целых чисел, встречающихся в заданном тексте");
        counter = runTask3(text);
        System.out.println("Сумма " + counter);

        System.out.println("------------------------------------");
        System.out.println("4. В каждом слове текста k-ю букву заменить заданным символом. Если  k больше длины сло" +
                "ва, корректировку не выполнять.");
        int position = 6;
        char symbol = 'А';
        textOut = runTask4(text, position, symbol);
        System.out.println("Заменить " + position + " букву на " + symbol);
        System.out.println(textOut);

        System.out.println("------------------------------------");
        System.out.println("5. Удалить из текста его часть, заключенную между двумя символами, которые вводятся (на" +
                "пример, между скобками ‘(’ и ‘)’ или между звездочками ‘*’ и т.п.).");
        textOut = runTask5(text, '(', ')');
        System.out.println(textOut);

        System.out.println("------------------------------------");
        System.out.println("6.  Найти и напечатать, сколько раз повторяется в тексте каждое слово, которое встречае" +
                "тся в нем.");
        runTask6(text);

        System.out.println("------------------------------------");
        System.out.println("7. Найти, каких букв, гласных или согласных, больше в каждом предложении текста");
        runTask7(text);

        System.out.println("------------------------------------");
        System.out.println("8. Во всех вопросительных предложениях текста найти и напечатать без повторений слова з" +
                "аданной длины");
        textOut = runTask8(text, 1);


    }

    private static String runTask8(String text, int length) {

        String sentences="";
// Находим вопросительные предложения
        for (int j = 0; j < text.length() && j != -1; j++) {
            for (int i = text.indexOf('?',j)-1; i >= 0 ; i--) {
                if(text.charAt(i)=='.'||text.charAt(i)=='?'){
                    j = text.indexOf('?',j)+1;
                    sentences+=text.substring(i+1,j);
                    break;
                }
            }
        }


        System.out.println(sentences);

        int counter;

        String[] words = sentences.split("\\s+");
        String[] wordsOut = new String[words.length];
        for (String s : words) {
            s = s.replaceAll("[!-?«-»—]+", "").toUpperCase();
        }
        int r = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length()==length) {
            counter = 0;
            for (int j = 0; j < wordsOut.length; j++) {
                if (words[i].replaceAll("[!-?«-»—]+", "").toUpperCase().equals(wordsOut[j])) {
                    counter++;
                }
            }
            if (counter == 0) {
                counter = 1;

                for (int j = 0; j < words.length; j++) {
                    if (j != i && words[i].replaceAll("[!-?«-»—]+", "").toUpperCase().equals(words[j].replaceAll("[!-?«-»—]+", "").toUpperCase())) {
                        counter++;
                    }
                }
                wordsOut[r] = words[i].replaceAll("[!-?«-»—]+", "").toUpperCase();
                System.out.println(wordsOut[r] + " встречается " + counter + " раз");
                r++;
            }
            }
        }

        return "";
    }

    private static void runTask7(String text) {
        String returnText = "";
        text = runTask5(text, '(', ')');
        int vowelsCount;
        int consonantsCount;
        text = text.replaceAll("1.|2.|3.+","").replace('\n',' ');

        String[] sentences = text.split("[.!?]+");
        for (String sentence : sentences) {
            System.out.println(sentence);
            sentence = sentence.replaceAll("\\s+","").replaceAll("[!-?«-»—]+","").toLowerCase();
            //System.out.println(sentence);
            vowelsCount =0;
            consonantsCount = 0;
            for (int i = 0; i < sentence.length(); i++) {
                if((sentence.charAt(i)+"").matches("[уеыаоэяию]")){
                    vowelsCount++;
                } else {
                    consonantsCount++;
                }
            }
            System.out.println(vowelsCount+" гласных, "+consonantsCount+" согласных");
            if (vowelsCount>consonantsCount){
                System.out.println("гласных больше");
            }
            if (vowelsCount<consonantsCount){
                System.out.println("согласных больше");
            }
            if (vowelsCount==consonantsCount){
                System.out.println("согласных и гласных одинаково");
            }
        }

    }

    private static void runTask6(String text) {
        int counter;
        String[] words = text.split("\\s+");
        String[] wordsOut = new String[words.length];
        for (String s : words) {
            s = s.replaceAll("[!-?«-»—]+", "").toUpperCase();
        }
        int r = 0;
        for (int i = 0; i < words.length; i++) {
            //if (!words[i].equals("")) {
                counter = 0;
                for (int j = 0; j < wordsOut.length; j++) {
                    if (words[i].replaceAll("[!-?«-»—]+", "").toUpperCase().equals(wordsOut[j])) {
                        counter++;
                    }
                }
                if (counter == 0) {
                    counter = 1;

                    for (int j = 0; j < words.length; j++) {
                        if (j != i && words[i].replaceAll("[!-?«-»—]+", "").toUpperCase().equals(words[j].replaceAll("[!-?«-»—]+", "").toUpperCase())) {
                            counter++;
                        }
                    }
                    wordsOut[r] = words[i].replaceAll("[!-?«-»—]+", "").toUpperCase();
                    System.out.println(wordsOut[r] + " встречается " + counter + " раз");
                    r++;
                }
            //}
        }

    }

    private static String runTask5(String text, char firstSymbol, char secondSymbol) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == firstSymbol
            ) {
                for (int j = i; j < text.length(); j++) {
                    if (text.charAt(j) == secondSymbol
                    ) {
                        text = text.substring(0, i) + text.substring(j + 1);
                        break;
                    }
                }
            }
        }

        return text;
    }

    private static String runTask4(String text, int position, char symbol) {
        String returnText = "";

        String[] sentences = text.split("\\n+");
        for (String sentence : sentences) {
            String[] words = sentence.split("\\s+");
            for (String s : words) {
                if (s.charAt(0) == '(' || s.charAt(0) == '«') {
                    if (s.length() >= position + 1) {
                        returnText += s.substring(0, position) + (symbol + "") + s.substring(position + 1) + " ";
                    } else {
                        returnText += s + " ";
                    }

                } else {
                    if (s.length() >= position) {
                        returnText += s.substring(0, position - 1) + (symbol + "") + s.substring(position) + " ";
                    } else {
                        returnText += s + " ";
                    }
                }
            }
            returnText += "\n";
        }

        return returnText;
    }

    private static int runTask3(String text) {
        int resultInt = 0;
        // "\D" - нецифровой символ
        String[] words = text.split("\\D+");
        for (String s : words) {
            System.out.println(s);
            resultInt += Integer.parseInt(s);
        }
        return resultInt;
    }

    private static int runTask2(String text) {

        int resultInt = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '.'
                    || text.charAt(i) == ','
                    || text.charAt(i) == '!'
                    || text.charAt(i) == ':'
                    || text.charAt(i) == ';'
                    || text.charAt(i) == '—'
                    || text.charAt(i) == '?'
            ) {
                resultInt++;
            }
        }

        return resultInt;
    }

    private static String runTask1(String text) {

        String returnText = "";

        String[] sentences = text.split("\\n+");
        for (String sentence : sentences) {
            String[] words = sentence.split("\\s+");
            for (String s : words) {
                if (s.charAt(0) == '(' || s.charAt(0) == '«') {
                    returnText += s.charAt(0) + (s.charAt(1) + "").toUpperCase() + s.substring(2) + " ";
                } else {
                    returnText += (s.charAt(0) + "").toUpperCase() + s.substring(1) + " ";
                }
            }
            returnText += "\n";
        }


        return returnText;
    }
}
