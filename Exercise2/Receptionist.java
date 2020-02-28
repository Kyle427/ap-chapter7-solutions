//********************************************************************
//  Receptionist.java       Authors: Lewis/Loftus/Cocking
//
//  Solution to Programming Project 7.2
//********************************************************************

public class Receptionist extends Administrator
{
   protected boolean answering;

   //-----------------------------------------------------------------
   //  Sets up this receptionist with the specified information.
   //-----------------------------------------------------------------
   public Receptionist (String ename, int enum, String dept,
                        boolean ans)
   {
      super (ename, enum, dept);
      answering = ans;
   }

   //-----------------------------------------------------------------
   //  Sets the current answering status of this receptionist.
   //-----------------------------------------------------------------
   public void setIsAnswering (boolean isA)
   {
      answering = isA;
   }

   //-----------------------------------------------------------------
   //  Returns the current answering status of this receptionist.
   //-----------------------------------------------------------------
   public boolean getIsAnswering()
   {
      return answering;
   }

   //-----------------------------------------------------------------
   //  Returns a description of this receptionist as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      return super.toString() + "\tAnswering: " + answering;
   }

   //-----------------------------------------------------------------
   //  Prints a message appropriate for this receptionist.
   //-----------------------------------------------------------------
   public void answer()
   {
      System.out.print (name + " is");
      if (!answering)
         System.out.print (" not");
      System.out.println (" answering the phone.");
   }
}
