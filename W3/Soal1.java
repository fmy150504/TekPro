public class Soal1{  
    public static void main(String args[]){  
    String pesan="I wasn't home";  
    System.out.println("hasil:");  
    
    String[] s=pesan.split("[ !,?._'@]+");
    System.out.println(s.length);  
    for(String i:s){  
        System.out.println(i);  
    }  
    }
}