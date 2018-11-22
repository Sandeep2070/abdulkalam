package b;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test65 {

	public static void main(String[] args) 
	{
	String x=("   India win World cup in 2011");
	String y[]=x.split(" ");
	System.out.println(y);
	String z=String.join(",",y);
	System.out.println(z);
	String a=x.substring(3,x.length()-4);
	System.out.println(a);
	String b=x.trim();
	System.out.println(b);
	String c=x.toLowerCase();
	String d=x.toUpperCase();
	String e=x.replace("2011","2018");
	System.out.println(c+"\n "+d+"\n "+e);
	Pattern p=Pattern.compile("[0-9]{}");
	Matcher m=p.matcher(x);
	while(m.find())
	{
		System.out.println(m.group());
	}
	}

}
