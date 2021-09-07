package assignment7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Info(Authorid = 1,date="28.12.1999",time="03.30",version=1)
public class developer {
	
    int DeveloperId;
    String name;
    String supervisor;
	public developer(int developerId, String name, String supervisor) {
		super();
		DeveloperId = developerId;
		this.name = name;
		this.supervisor = supervisor;
	}
    
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Info{
	int Authorid() default 1;
	String date() default "01.01.2000";
	String time() default "00.00";
	int version() default 1;
}

