package _31_StringBuilder;

public class StringBuilder02 {
    public static void main(String[] args) {
        final int length = 200000;
//        String
        long startTime1 = System.currentTimeMillis();

        String str = "";
        for (int i = 0; i < length; i++) {
            str += "*";
        }

        long endTime1 = System.currentTimeMillis();
        long duration1 = endTime1 - startTime1;

        System.out.println("<String> elapsed time : " + duration1);

//        StringBuilder
        long startTime2 = System.currentTimeMillis();

        StringBuffer stringBuffer = new StringBuffer("");
        for (int i = 0; i < length; i++) {
            stringBuffer.append("*");
        }

        long endTime2 = System.currentTimeMillis();
        long duration2 = endTime2 - startTime2;
        System.out.println("<StringBuffer> elapsed time : " + duration2);

//        StringBuilder
        long startTime3 = System.currentTimeMillis();

        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i < length; i++) {
            stringBuilder.append("*");
        }

        long endTime3 = System.currentTimeMillis();
        long duration3 = endTime3 - startTime3;
        System.out.println("<StringBuilder> elapsed time : " + duration3);

    }
}
