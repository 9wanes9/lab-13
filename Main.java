package boba;
public class Main {
    public static void main (String[] args){
        String text = "ЗТЕФТИ ЧЦФТ!\n" +
                "ЙЛЗ Б ЗЦИЭ Й ГЖКДЭКГШЕБ Ъ НЖДЖЬБДФЁБГЭ.\n" +
                "БЪВАШЬЪ УГЦ ЯЦ ЦЙН УЦИЦВАЮ БВЪХЕД ФАГДЪ.\n" +
                "ЗЛКСВПЗЁ Н ЁЫНЫДТЫ А ЩЛБХШЙЛЁ ХЗИПДН ТПНЙЗ ЫЮРЮЙЗЁ СТРДЖТА. ПГПГ.";
        System.out.println("Кодированный текст:\n"+text+"\n\nДекодированный текст:");
      DeCod.deCode("ЗТЕФТИ ЧЦФТ!",-4);
        System.out.println();
        DeCod.deCode("ЙЛЗ Б ЗЦИЭ Й ГЖКДЭКГШЕБ Ъ НЖДЖЬБДФЁБГЭ.",8);
        System.out.println();
        DeCod.deCode("БЪВАШЬЪ УГЦ ЯЦ ЦЙН УЦИЦВАЮ БВЪХЕД ФАГДЪ.",15);
        System.out.println();
        DeCod.deCode("ЗЛКСВПЗЁ",3);
        DeCod.deCode(" Н ",28);
        DeCod.deCode("ЁЫНЫДТЫ ",-23);
        DeCod.deCode("А ",2);
        DeCod.deCode("ЩЛБХШЙЛЁ ",-1);
        DeCod.deCode("ХЗИПДН ",-4);
        DeCod.deCode("ТПНЙЗ ",1);
        DeCod.deCode("ЫЮРЮЙЗЁ ",7);
        DeCod.deCode("СТРДЖТА.",31);
        DeCod.deCode(" ПГПГ.",-3);   
    }
}
    