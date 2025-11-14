package Exception_Handling;

public class Exception {

	public static void main(String[] args) {

		 	/*
		 	 * Syntax =>
		 	 *  		Try{
		 	 *  				Code that can cause exception
		 	 *  				
		 	 *  				Throw => to raise an exception
		 	 *  			}
		 	 *  			
		 	 *  		Catch(catch the exception )
		 	 *  			{
		 	 *  					Handling
		 	 *  			}
		 	 *  
		 	 *  			Finally {
		 	 *  						used to close the all 
		 	 *  						connection opened in try block=
		 	 *  							*CLEANUP*
		 	 *  				
		 	 *  				}
		 	 *     the finally block  the always execute imoperctive of exception
		 	 *     
		 	 *     ***Two situation of finally block is not run /doesn't ecxcute
		 	 *			1) JVM Crash
		 	 *			2) input output error  / system filuer
		 	 *  			
		 	 *  					
		 	 */
			try {
				
				// code that can cause exception
				System.out.println(" i am a try block");
				 throw new Exception(" this is my exception");
			}
			catch(Exception e){
			
				// code that catches and handeles exception
				System.out.println(" thsi is  throw block ");
				
				
			}
			finally {
				
				// celenup code - connections closing 
			}

	}

}
