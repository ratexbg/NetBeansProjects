


import javax.annotation.ManagedBean;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
@ManagedBean(name = "ColorView")
@Named
@RequestScoped


public class ColorView {
      public static void main(String[] args){
    System.out.print("Enter something");
      }
    private String colorInline;
     
    private String colorPopup;
 
    public String getColorInline() {
        return colorInline;
    }
 
    public void setColorInline(String colorInline) {
        this.colorInline = colorInline;
    }
 
    public String getColorPopup() {
        return colorPopup;
    }
 
    public void setColorPopup(String colorPopup) {
        this.colorPopup = colorPopup;
    } 
}