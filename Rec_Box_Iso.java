/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance_Overriding;

/**
 *
 * @author SenpaiJames
 */
public class Rec_Box_Iso {
    
    
     public static void main (String[] args){
     Rectangle2 rect ;
     
     Box myBox = new Box() ;
     myBox.setBox(2, 3, 4);
     Box myBox2 = new Box() ;
     myBox2.setBox(4, 7, 4);
     System.out.println("Box a :" + myBox.toString()) ;
     System.out.println("Box a Surface Area :" +myBox.getArea() );
     System.out.println("Box b :" + myBox2.toString()) ;
     System.out.println("Box b Surface Area :" +myBox2.getArea() );
     System.out.println("Check if Box a and Box b are equal?" + myBox.equals(myBox2));
     
     IsoscelesRight IT = new IsoscelesRight () ;
     IT.setTriangle(3.0, 4.4);
     IsoscelesRight IT2 = new IsoscelesRight () ;
     IT2.setTriangle(3.0, 4.4);
     System.out.println("IsoscelesRight a :" + IT.toString()) ;
     System.out.println("IsoscelesRight a Area :" +IT.getArea() );
     System.out.println("IsoscelesRight b :" + IT2.toString()) ;
     System.out.println("IsoscelesRight b Area :" +IT2.getArea() );
      System.out.println("Check if IsoscelesRight a and IsoscelesRight b are equal?" + IT.equals(IT2));
  
     
    
     
   }
   
    public static class Rectangle2 {
   private int length , width  ;

   
   public Rectangle2 (){
       
   } // default
   public void  setRectangle2 (int length, int width){
 
    this.length = length ;
    this.width = width ;
    
   
   }
   public int getLength (){
       return length ;
   }
   public int getWidth (){
       return width ;
   }
  
   public int getArea(){
       return getWidth() * getLength();
   }
 
   
  
   public String toString(){
       return " [ Length: " + length + " Width : " + width ;
   }
   }
    
    public static class Box extends Rectangle2 {
        private int height ;
        
        public Box (){
            
        }
        
        public void setBox(int length, int width,  int height){
            setRectangle2 (length, width ) ;
            this.height = height ;
            
        }
        public int getHeight(){
            return height ;
        }
        public int getArea(){
            return ( (2*(getLength() * getHeight())) + (2*(getLength()* getWidth())) + (2*(getWidth() *getHeight()))) ;
           
        }
        
       public boolean equals (Object o){
           if (this == o) {
               return true ;
           }
          if ( o == null || getClass()!= o.getClass()){
           return false ;
       } 
          Box myBox = (Box)o ;
          return super.toString() == myBox.toString() && height == myBox.getHeight()  ;
       }
       
         public String toString(){
       return super.toString() + " Height: " + height + "]" ;
   }
    }
 
    
    public static class Triangle {
   private double sideA,sideB , sideC  ;

   
   public Triangle (){
       
   } // default
   public void  setTriangle(double sideA, double sideB){
 
    this.sideA= sideA;
   
    this.sideB = sideB ;
    this.sideC= sideC;
   }
   public double getSideA (){
       return sideA ;
   }
 
    public double getsideB(){
           return sideB ;
        }
  public double getSideC(){
       return sideA ;
   }
 
  
   public double getArea(){
       return (0.5* (getSideA()*getSideA())) ;
   }
 
 
   public String toString(){
       return getSideA()+ "" + getsideB() ;
   }
   }
    public static class IsoscelesRight extends Triangle{
       private double sideA ,sideB , sideC  ;
         public IsoscelesRight () {
        
    }
        public  IsoscelesRight( double equalSize){
           
            sideA = equalSize ;
        }
        
        public double getEqualSide (double SideA ){
            SideA = 3.0 ;
            return SideA ;
        }
        public double getNotEqualSide (double sideC){
           sideC = getEqualSide(3.0)*Math.sqrt(2.0) ;
           return sideC ;
        }
        
         public boolean equals (Object o){
           if (this == o) {
               return true ;
           }
          if ( o == null || getClass()!= o.getClass()){
           return false ;
       } 
            IsoscelesRight IT = new IsoscelesRight() ;
          return super.sideA== IT.getEqualSide(sideA);
       }
           
   
        
        
        public String toString(){
            return "[ Iosceles Right : equal : " + getEqualSide(sideA)+ " Not equal :" +getNotEqualSide(sideC) + "]" ;
        }
    }
    
}


