package meli.ejerc;

public class StringUtils
{
    // Retorna una cadena compuesta por n caracteres c
    // Ejemplo: replicate('x',5) ==> 'xxxxx'
    public static String replicate(char c, int n)
    {
        String sReplicated = "";
        for(int i = 0; i < n; i++) {
            sReplicated += c;
        }
        return sReplicated;
    }

    // Retorna una cadena de longitud n, compuesta por s
    // y precedida de tantos caracteres c como sea necesario
    // para completar la longitud mencionada
    // Ejemplo lpad("5",3,'0') ==> "005"
    public static String lpad(String s, int n, char c)
    {
        int len = n - s.length();
        if (len==0) return s;
        return replicate(c,len) + s;
    }
    // Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static String[] toStringArray(int arr[])
    {
        String sArray[] = new String[arr.length];

        for (int i =0; i< arr.length; i++){
            sArray[i] = String.valueOf(arr[i]);
        }
        return sArray;
    }

    // Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static int[] toIntArray(String arr[])
    {
        int [] iArray = new int [arr.length];
        for(int i = 0;i < arr.length;i++)
        {
            iArray[i] = Integer.parseInt(arr[i]);
        }
        return iArray;
    }


    // Retorna la longitud del elemento con mayor cantidad
    // de caracteres del array arr
    public static int maxLength(String arr[])
    {
        int actLen = 0;
        int maxLen = 0;
        for(int i = 0;i < arr.length;i++)
        {
            actLen = arr[i].length() ;
            if(actLen > maxLen) maxLen = actLen;
        }
        return maxLen;
    }

    // Completa los elemento del arr agregando caracteres c
    // a la izquierda, dejando a todos con la longitud del mayor
    public static void lNormalize(String arr[], char c)
    {
        int maxLen = maxLength(arr);
        for(int i = 0;i < arr.length;i++)
        {
            arr[i] = lpad(arr[i] ,maxLen,c );
        }


    }

    public static String rpad(String s, int n, char c)
    {
        int len = n - s.length();
        if (len==0) return s;
        return  s + replicate(c,len);
    }

    public static String ltrim(String s){
        return s.replaceAll("^\\s+","");
    }
    public static String rtrim(String s){
        s.replaceAll("\\s+$","");
    }
    public static String trim(String s){

    }
    public static int indexOf(String s,char c , int n){

    }

}
