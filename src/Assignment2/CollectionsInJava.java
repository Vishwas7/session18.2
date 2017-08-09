package Assignment2;
/**
 * In here importing class, which are belong from java.util.package
 */
import java.util.ArrayList;
import java.util.Collections;
/**
 * 
 * @author Vishwas 
 * Created a class CollectionsInJava and main method 
 *
 */
public class CollectionsInJava {

	public static void main(String[] args) {
		
		System.out.println("\nHDTV display in according to the size\n");
		// creating objects
		HDTV LGTv = new HDTV("LG Smart LED TV ", 32);
		HDTV HitachiTv = new HDTV("Hitachi Smart TV ", 70);
		HDTV VideoconTv = new HDTV("Videocon Smart TV ", 46);
 
		// creating three array as mention in question
		ArrayList<HDTV> arrayList = new ArrayList<HDTV>();
		arrayList.add(LGTv);
		arrayList.add(HitachiTv);
		arrayList.add(VideoconTv);
 
		/**
		 * using Collection.sort()
		 * It is used to sort the elements present
		 * in the specified list of Collection in ascending order.
		 * 
		 */
		Collections.sort(arrayList, new SortingFromSize());
		for (HDTV hdtv : arrayList) {
			System.out.println(hdtv.getBrandName() + "size is : " +hdtv.getSize());
		}
	}

	}


