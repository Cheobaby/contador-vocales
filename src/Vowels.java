public class Vowels {
    public static void main(String []args){
        String item ="HOLA MUNDO";
        System.out.println("Numero de vocales: "+getCount(item));
    }
    public static int getCount(String str){
        byte cont=0;
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char vocal=str.charAt(i);
            if(vocal=='a' ||vocal=='e'||vocal=='i'||vocal=='o'||vocal=='u'){
                cont++;
            }
        }
        return cont;
    }

}