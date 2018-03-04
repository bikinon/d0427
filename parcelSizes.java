package d0427;

import java.awt.*;
import javax.swing.*;
import javax.swing.JOptionPane;
/**
  *
  * Description
  *
  * @version 1.0 from 7/30/2016
  * @author Tim Gathercole
  */
// import dxf12objects;

public class parcelSizes {
  
  // start attributes
  public double odLength = 0;
  public double odWidth = 0;
  public double odDepth = 0;
  // end attributes
  
  // start methods
  public void checkSizes() {
    String msg = "";
    
    if (this.odLength > 240 || this.odWidth > 165 || this.odDepth > 5) {
      msg += "***RM Letter up to 100g 240x165x5 - TOO BIG ***\n";
    } else {
      msg += "RM Letter up to 100g - OK\n";
    }// end of if
    
    if (this.odLength > 353 || this.odWidth > 250 || this.odDepth > 25) {
      msg += "***RM Large Letter up to 750g 353x250x25 - TOO BIG ***\n";
    } else {
      msg += "RM Large Letter up to 750g - OK\n";
    }// end of if
    
    
    if (this.odLength > 415 || this.odWidth > 203 || this.odDepth > 25) {
      msg += "***Min Letterbox (Lil Pkg Data) 415x203x25 - TOO BIG ***\n";
    } else {
      msg += "Min Letterbox (Lil Pkg Data) 415x203x25 - OK\n";
    }// end of if
    
    if (this.odLength > 415 || this.odWidth > 254 || this.odDepth > 32) { // ** Lil Pkg data
      msg += "***TYPICAL Letterbox (Lil Pkg Data) 415x254x32 - TOO BIG ***\n";
    } else {
      msg += "TYPICAL Letterbox (Lil Pkg Data) 415x254x33 - OK\n";
    }// end of if
    
    if (this.odLength > 415 || this.odWidth > 305 || this.odDepth > 38) { // ** Lil Pkg data
      msg += "***Largest Letterbox (Lil Pkg Data) 415x254x38 - TOO BIG ***\n";
    } else {
      msg += "Largest Letterbox (Lil Pkg Data) 415x254x38 - OK\n";
    }// end of if
    
    if (this.odLength > 450 || this.odWidth > 350 || this.odDepth > 160) {
      msg += "***RM Small Parcel up to 2kg 450x350x160 - TOO BIG ***\n";
    } else {
      msg += "RM Small Parcel up to 2kg - OK\n";
    }// end of if
    
    if (this.odLength > 610 || this.odWidth > 460 || this.odDepth > 460) {
      msg += "***RM Medium Parcel up to 20kg 610x460x460 - TOO BIG ***\n";
    } else {
      msg += "RM Medium Parcel up to 20kg - OK\n";
    }// end of if
    
    JOptionPane.showMessageDialog(null, msg, "Info", JOptionPane.INFORMATION_MESSAGE);
    
    
  }
  
  // end methods
}