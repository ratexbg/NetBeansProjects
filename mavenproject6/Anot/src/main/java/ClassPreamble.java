
import java.lang.annotation.Documented;

   

@Documented
public @interface ClassPreamble{
        String author();
        String date();
        int currentRevision() default 1;
        String lastModified() default "10.10.2019";
        String lastModifiedBy() default "Ivan Todorov";
        String [] reviewers();        
               
  }
    
    

