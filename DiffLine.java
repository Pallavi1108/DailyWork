package cog.cognizant;

public class DiffLine {

	    public static void main(String[] args) {

	        String st = "India will be 5 trillion USD economy by 2025";


	        int i;
	        int j;
	        for (i = 0; i <= st.length(); i++){
	            if (st.substring(i).startsWith(" ") || i == 0) {
	                for (j = i + 1; j <= st.length(); j++){

	                    if (st.substring(j).startsWith(" ") || j == st.length()) {
	                       
	                        System.out.println(st.substring(i, j));
	                     
	                        i = j;
	                      

 }
}
 }
}  
	        }
}