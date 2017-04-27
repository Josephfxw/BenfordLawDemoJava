
// Student Name: XUE WEI FAN

import java.io.*;

public class Benford {

	

	public static void main(String[] args) {

		Benford fib = new Benford();

		fib.SetReadWrite();
		

	}

	private void SetReadWrite() {

 		try {
 			// read data from data.txt
 			String fileName = "data.txt";
 			FileInputStream inStream = new FileInputStream(fileName);
 			InputStreamReader inStreamReader = new InputStreamReader(inStream);
 			BufferedReader br = new BufferedReader(inStreamReader);
 			
 			// write data to dataRecord.ext
 			String fileName1 = "dataRecord.txt";
 			
 		// second parameter set to false will rewrite the text in the file, true will append new text in the file, FilwWriter() has the same property		
 			BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName1,false)));
 			ReadWrite(br,bw1);
 	 		br.close();
 	 		bw1.close();
 		} catch (IOException e) {
			System.out.println(e.toString()); 			
 		}

	}


	

	// read data from data.txt file and read the counted data into dataRecord.txt file
	private void ReadWrite(BufferedReader br,BufferedWriter bw1) {
   
		try{ 
			  double total = 0;
			  int[] frequency = new int[10];   //from frequency[1] to frequency[9] count the number of appearance of 1 to 9 respectively
			  String line =  br.readLine();    // read each line from the textfile
		
			  while(line!=null){
				char[] charArray = line.toCharArray();      // convert a string line to character array
				 for(int i=0; i<charArray.length; ++i)
					 
				 {
					if(charArray[i] >='1' && charArray[i]<='9') // or if(Charcater.isDigit(charArray[i]) && charArray[i]!=0 )
						{
						++frequency[Character.getNumericValue(charArray[i])];
						++total;
					    break;
						}
				 }
				 
				 line =  br.readLine();
			  }
			     
			  for (int i = 1; i <= 9; i++)
			  {
				  System.out.printf("%n%d  (%.3f%%)\t : ",i,frequency[i]/total*100);
				 
				  int starnumber= (int) Math.round(frequency[i]/total*100);   // long Math.round(double) or int  Math.round(float) --->round off decimal to integer
			  
			      for(int j=0; j <starnumber;j++ )
			    	  System.out.printf("*") ; 
			      try {
						bw1.write(String.format("%d  (%.3f%%)\t : ",i , frequency[i]/total*100 )); // write data into dataRecord.txt file. use String.format() to align
						
						for(int j=0; j <starnumber;j++ )
							bw1.write("*");
						
						    bw1.newLine(); // write a newline character into the file.
					} catch (IOException e) {
						System.out.println(e.toString());
					}
			  } 
				
			  
			  
		}catch (IOException e) {
			System.out.println(e.toString());
		}	 
				  
    	
	}
}

	