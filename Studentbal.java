public class Studentbal {
    private int bal1;private int bal2;private int bal3;
    private String fenn1;private String fenn2;private String fenn3;
    public Studentbal(String fenn1,String fenn2,String fenn3,int bal1,int bal2,int bal3){
        this.fenn1=fenn1;
        this.fenn2=fenn2;this.fenn3=fenn3;
        this.bal1=bal1;
        this.bal2=bal2;this.bal3=bal3;
    }
   public String Kesrler(){
        int a=0;
        String Kesrli_fenler=" ";
        if(bal1<51) {Kesrli_fenler+=fenn1+";";a++;}
        if(bal2<51) {Kesrli_fenler+=fenn2+";";a++;}
        if(bal3<51) {Kesrli_fenler+=fenn3;a++;}
       System.out.println("kesirin sayi: "+a);
        return Kesrli_fenler;
   }
public static void main(String[] args){
    Studentbal student=new Studentbal("Diferensial tenlikler",
            "Riyazi analiz-1","Ededi Usullar-1",35,34,56);
    System.out.println(student.Kesrler());
    }}


