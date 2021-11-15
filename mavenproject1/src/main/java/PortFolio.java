import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

 public class Name implements Comparable<Name>{
		private String firstName;
		private String lastName;

    public static void main(String[] args) {		
		
		Name(String firstName, String lastName){
			this.firstName = firstName;
			this.lastName = lastName;
		}

		@Override
		public int compareTo(Name o) {
			 int lastCmp = lastName.compareTo(o.lastName);
		        return (lastCmp != 0 ? lastCmp :firstName.compareTo(o.firstName));
		}
		
		public String toString() {
			return firstName + " " + lastName;
		    }	
}
    }
}