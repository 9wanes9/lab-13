package boba;
public class DeCod {
 public  static void deCode(String str, int sdvig) {
        char[] abc = {'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З',
                'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я'};
        char[] bukva = str.toCharArray();
        for (int i = 0; i < bukva.length; i++) {
            for (int j = 0; j < abc.length; j++) {
                if (bukva[i] == abc[j] && j > Math.abs(sdvig) - 1&&sdvig< 0) {
                    bukva[i] = (char) ((int) abc[j + sdvig]);
                    break;
                } else if (bukva[i] == abc[j] && j < Math.abs(sdvig) - 1 && sdvig < 0) {
                    bukva[i] = (char) ((int) abc[abc.length + (j + sdvig)]);
                    break;
                } else if (bukva[i] == abc[j] && j < abc.length && (j + sdvig) < abc.length && sdvig > 0) {
                    bukva[i] = (char) ((int) abc[j + sdvig]);
                    break;
                }
                else if (bukva[i] == abc[j] && j < abc.length && (j + sdvig) > abc.length && sdvig > 0){
                    bukva[i] = (char) ((int) abc[j + sdvig-abc.length]);
                    break;
                }
                else if (bukva[i] != abc[j]) {
                    bukva[i] = bukva[i];
                }
            }
        }
        String deStr = new String(bukva);
        System.out.print(deStr);
    }   
}
