package Assignment2;
/**
 * In here importing class, which are belong from java.util.package
 */
import java.util.Comparator;
/**
 * 
 * @author Vishwas
 * In here creating a class named HDTV, as mention in the question;
 * than declared two variable or properties brandName and size as mention in question;
 * and than crating a constructor of this class and in arguments, i've passed 
 * brandNName and size;
 *
 */

public class HDTV {

	private String brandName;
	private int size;
	
	public HDTV(String brandName, int size) {
		super();
		this.brandName = brandName;
		this.size = size;
	}


	public String getBrandName() {
		return brandName;
	}


	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}
	
}

/**
 * 
 * @author Vishwas
 * In here created a class named SortingFromSize  
 * and implements with Comparator 
 * Comparator interface is used to order the objects of user-defined class.
 *
 */

class SortingFromSize implements Comparator<HDTV> {

	@Override
	public int compare(HDTV smartTv, HDTV smartTv1) {
		int tvSize= smartTv.getSize();
		int tv1Size= smartTv1.getSize();
		if (tvSize > tv1Size) {
			return 1;
		} else if (tvSize < tv1Size) {
			return -1;
		} else {
			return 0;
		}
	}
	
}