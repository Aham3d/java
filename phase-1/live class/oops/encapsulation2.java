// 4/11



// class customer{
//     private int cID;
//     private String cName;
//     private int cNum;

//     public customer(){
//         cID = 1;
//         cName = "Arul";
//         cNum = 8239487; 
//     }

//     public customer(int cID, String cName, int cNum){
//         this.cID = cID;
//         this.cName = cName;
//         this.cNum = cNum; 
//     }

//     public int getID(){
//         return cID;
//     }
    
//     public String getName(){
//         return cName;
//     }

//     public int getNum(){
//         return cNum;
//     } 

// }           

// public class encapsulation2
// {
//     public static void main(String[] args) 
//     {
//         customer c1 = new customer();
//         System.out.println(c1.getID());
//         System.out.println(c1.getName());
//         System.out.println(c1.getNum());

//         customer c2 = new customer(2, "azad", 348762);
//         System.out.println(c2.getID());
//         System.out.println(c2.getName());
//         System.out.println(c2.getNum());
//     }    
// }











// class customer{
//     private int cID;
//     private String cName;
//     private int cNum;

//     public customer(){ // --here 
//         cID = 1;
//         cName = "Arul";
//         cNum = 8239487; 
//     }

//     public customer(int cID, String cName, int cNum){
//         this();                 // local chaining to --
//         this.cID = cID;         // without this next three lines the OP will be of the 1st constructor ( the top one )
//         this.cName = cName;
//         this.cNum = cNum; 

//     }

//     public int getID(){
//         return cID;
//     }
    
//     public String getName(){
//         return cName;
//     }

//     public int getNum(){
//         return cNum;
//     } 

// }           

// public class encapsulation2
// {
//     public static void main(String[] args) 
//     {
//         customer c2 = new customer(2, "azad", 348762);
//         System.out.println(c2.getID());
//         System.out.println(c2.getName());
//         System.out.println(c2.getNum());
//     }    
// }




class customer{
    private int cID;
    private String cName;
    private int cNum;

    public customer(){ // --here 
        cID = 1;
        cName = "Arul";
        cNum = 8239487; 
    }

    public customer(String cName){ // --here
        this();                    // local chaining to --
        this.cName = cName;

    }

    public customer(int cID, String cName, int cNum) {
        this(cName); // local chaining to--
    }

    public int getID(){
        return cID;
    }
    
    public String getName(){
        return cName;
    }

    public int getNum(){
        return cNum;
    } 

}           

public class encapsulation2
{
    public static void main(String[] args) 
    {
        customer c2 = new customer(2, "azad", 348762);
        System.out.println(c2.getID());
        System.out.println(c2.getName());
        System.out.println(c2.getNum());
    }    
}





    // reference       object of the class
    //      |              |
    // customer c = new customer();
    //               |           |  
    //              JVM        constructor