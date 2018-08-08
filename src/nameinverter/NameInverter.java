package nameinverter;

import java.util.Arrays;

public class NameInverter {
	String[] honorifics = {"Mr.","Mrs.","Dr."};
	String[] postnominals = {"PhD.","Jr.","Sr."};
	
	public String invertName(String string) {
		String[] names = string.trim().split("\\s+");
		String rtnName = names[1].trim() + ","+ names[0].trim();
		if(names.length > 2) {
			int postnomIndex = 2;
			if(Arrays.asList(honorifics).contains(names[0])) {
				rtnName = names[2].trim() + "," + names[1].trim();
				postnomIndex = (names.length > 3) ? 3 : 2;
			} 
			if(Arrays.asList(postnominals).contains(names[postnomIndex])) {
				String postnoms = "";
				for(int i = postnomIndex;i < names.length; ++i ) {
					postnoms += names[i] + " ";
				}
				rtnName += " " + postnoms.trim();
			}
		}
		return rtnName;
	}

}
