package colorPicker;
import  org.primefaces.component.colorpicker.ColorPicker;
import	org.primefaces.component.ColorPicker;
import	org.primefaces.component;
import	org.primefaces.component.ColorPickerRenderer;
import	org.primefaces.component.colorpicker.ColorPickerRenderer;
        
import javax.faces.bean.RequestScoped;
import javax.faces.event.NamedEvent;
import javax.faces.bean.ManagedBean;
import javax.faces.event.AjaxBehaviorEvent;
    
@ManagedBean
@NamedEvent
@RequestScoped
public class ColorView {
     
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
//
//
//import javax.annotation.ManagedBean;
//import javax.enterprise.context.RequestScoped;
//
//
//@ManagedBean
//@RequestScoped
//
//
//public class ColorView {
//      public void submit() {
//        this.result = "Submitted values: " + this.colorInline + ", " + this.colorPopup;
//        System.out.println(result);
//    }
//
//
//    private String colorInline;
//     
//    private String colorPopup;
//    
//    private String result;
// 
//    public String getColorInline() {
//        return colorInline;
//    }
// 
//    public void setColorInline(String colorInline) {
//        this.colorInline = colorInline;
//    }
// 
//    public String getColorPopup() {
//        return colorPopup;
//    }
// 
//    public void setColorPopup(String colorPopup) {
//        this.colorPopup = colorPopup;
//    } 
//}