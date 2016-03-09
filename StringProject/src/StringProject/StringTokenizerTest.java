package StringProject;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		

		StringTokenizer st = new StringTokenizer("raghava,ravi;rauj",",;");
		
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
		
		String remoteFileName = "T.Delivery.ATTACH_NAME_MASK={CFO_TYPE}_{BU}_{PAR_CHAN}_{SUB_CHAN}_{DOC_NUM}_{BATCH_DATE}.csv.SCHENKERCFOINV.ZZDELL_OMEGA.ZZATX_OMEGA.csv";
		
		String extension = remoteFileName.substring(remoteFileName.length() - 4, remoteFileName.length());
		
		if(extension.equals(".csv")){
			remoteFileName = remoteFileName.substring(0, remoteFileName.length() - 4);
		}
		
		System.out.println("Final Output "+remoteFileName);


	}

}
