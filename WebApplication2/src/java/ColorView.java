


import javax.annotation.ManagedBean;
import javax.enterprise.context.RequestScoped;


@ManagedBean
@RequestScoped


public class ColorView {
      public void submit() {
        this.result = "Submitted values: " + this.colorInline + ", " + this.colorPopup;
        System.out.println(result);
    }


    private String colorInline;
     
    private String colorPopup;
    
    private String result;
 
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