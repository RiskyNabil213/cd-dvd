import java.util.Scanner;
    //Driver Class
        public class tester {
            public static void main(String[] args) {
                    Scanner in = new Scanner(System.in);
                    //baut looping untuk mengulang membuat onjek cd atau //dvd
                    System.out.println("berapa objek yang di buat?(Max 10)");
                    int jumlah = 0;
                    System.out.println("CD atau DVD");
                    String pilihan = in.next();
                String anObject;
                //kondisi
                if (pilihan.equals("cd")){
                    cd c1 = new cd();
                    c1.print(); 
                }else if (pilihan.equals("dvd")){
                    dvd d1 = new dvd();
                    d1.print();
                } else{
                    System.out.println("input salah.");
                }
                
       
    } 
    
}
