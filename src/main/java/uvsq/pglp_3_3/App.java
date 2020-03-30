package uvsq.pglp_3_3;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void avanceTous() {
    	Robot rs1 = new RobotStatique();
    	Robot rd1 = new RobotDynamique();
    	Robot rd2 = new RobotDynamique();
    	
    	ArrayList<Robot> robots = new ArrayList<Robot>();
    	robots.add(rs1);
    	robots.add(rd1);
    	robots.add(rd2);
    	
    	for(Robot r : robots) {
    		r.avance();
    	}	

    }
	
    public static void main( String[] args )
    {
    	avanceTous();
    }
    
    
}
