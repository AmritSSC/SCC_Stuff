import java.lang.Math; 

class Project3_r1 { 
  
    // driver code 
    public static void main(String args[]) 
    { 
    	//radius
    	double r = 1000; // m
    	// gravitational constant
        double G = 0.0000000000667; //m^3/(kg*s^2)
        // these two go together to create big number:
        double Me_base = 598000000;
        double Me_mult = 100000000;
        // multiply the above to get the required constant:
        double Me = Me_base * Me_mult * Me_mult; //kg
        // defining such a large value is not allowed it seems,
        // keeps resulting in error
        // double Me = 5980000000000000000000000;
     
        // calculate velocity
        double vel = Math.sqrt(G*Me*Me_mult*Me_mult/(r*r));
        
        //return data and calculations:
        System.out.println("Mass of Earth = " + Me +" kg \n");
        System.out.println("Gravitational Constant = " + G +" m^3/(kg*s^2)\n");
        System.out.println("Distance from Earth = " + r + " m \n");
        System.out.println("Velocity is = " + Math.sqrt(vel) + " m/s" + "\n");
    } 
} 