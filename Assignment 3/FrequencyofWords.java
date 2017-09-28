
import java.util.*;

public class FrequencyofWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s=sc.nextLine();
		String a[]=s.split(" ");
		final TreeMap<String, Integer> tmap=new TreeMap<String, Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(!tmap.containsKey(a[i]))
				tmap.put(a[i],1);
			else
				tmap.put(a[i],tmap.get(a[i])+1);
		}
		Comparator <String> comp=new Comparator<String> ()
		{
			public int compare(String a,String b) {
				if(tmap.get(b)==(tmap.get(a)) || tmap.get(b)>(tmap.get(a)))
     					return 1;
				else
						return -1;
			    }
		};
		TreeMap<String, Integer> tmap1=new TreeMap<String, Integer>(comp);
		tmap1.putAll(tmap); 
		for(Map.Entry<String,Integer> entry: tmap1.entrySet())
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

}
