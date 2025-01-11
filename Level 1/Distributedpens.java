// Creating Class with name Distributedpens to distribute pens among students

public class Distributedpens{
    public static void main(String args[]){ 
        
        // Create a variable pens to store the total number of pens
        int pens = 14;
        
        // Create a variable students to store the total number of students
        int students = 3; 
        
        // Calculate the number of pens each student will receive by dividing total pens by number of students
        int penperstudent = pens / students;
        
        // Calculate the number of pens that are not distributed using the modulus operator
        int pennotdistributed = pens % students;
        
        // Print the number of pens each student gets and the number of pens that remain undistributed
        System.out.println("The Pen Per Student is " + penperstudent + " and the remaining pen not distributed is " + pennotdistributed);
    }
}
