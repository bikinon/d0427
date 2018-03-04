package d0427;

public class BoardSz {
  /* Calculate optimum board sizes
  * If blkS1 == blkInsetS1, etc. then NOT Interlocked
  * Interlocked styles can be T shaped (Symmetrical 0421) or L shaped (asymmetrical 0203/0701)
  */
  // Machine Size
  String diecutter = "Elite";
  public double eliteFlexoS1 = 1200 - 25;
  public double eliteFlexoN2 = 1620 - 20;
  public double ibericaS1 = 1000 - 30;
  public double ibericaN2 = 1000 - 20;
  public boolean asymmetrical = false;
  
  public double blkS1 = 0; // 
  public double blkN2 = 0; //
  public double blkInsetS1 = 0; //
  public double blkInsetN2 = 0; //
  
  public double rule2ruleS1 = 0;
  public double rule2ruleN2 = 0;
  
  private double dcS1 = 0; //
  private double dcN2 = 0; //
  private double trimS1 = 0; //
  private double trimN2 = 0; //
  //    private double dcRevS1 = 0; //
  //    private double dcRevN2 = 0; //
  
  public int noUpS1 = 0;
  public int noUpN2 = 0;
  public int noUpRevS1 = 0;
  public int noUpRevN2 = 0; 
  public int noUpIntLkS1 = 0;
  public int noUpIntLkN2 = 0;
  public int noUpIntLkRevS1 = 0;
  public int noUpIntLkRevN2 = 0; 
  
  
  public String CalcR2R() {
    String msg = "<html>";
    
    getDieCutterSizes();      
    getNonIntLkSizes();
    
    if (this.asymmetrical == true) { // L shaped type blank - interlocks only 1 side
      getAsymmetricalIntLkSizes();                
    } else { // T shaped type blank - interlocks both sides
      getSymmetricalIntLkSizes();
    } // this.asymmetrical == true
    
    System.out.println("BroadSz.CalcR2R *Blank Size: " + blkS1  + " x " + blkN2);
    if ((blkInsetS1 != blkS1 || blkInsetN2 != blkN2) && this.asymmetrical == false) { // Interlocked T
      if (noUpS1 * noUpIntLkN2 >= 1) {
        msg += "IntLk Std Feed: " + this.noUpIntLkS1 + "up " + (blkS1 + (blkInsetS1 * (this.noUpIntLkS1 - 1)))  + " x " + this.noUpIntLkN2 + "up " + (blkN2 + (blkInsetN2 * (this.noUpIntLkN2 - 1)));  
        System.out.println("blkN2==" + blkN2 + "*blkInsetN2=" + blkInsetN2);
      }
      if (noUpIntLkRevS1 * noUpRevN2 >= 1) {
        msg += "<br>IntLk Rev Feed: " + noUpIntLkRevS1 + "up " + (blkN2 + (blkInsetN2 * (noUpIntLkRevS1 - 1))) + " x " + this.noUpIntLkRevN2 + "up " + (blkS1 + (blkInsetS1 * (noUpIntLkRevN2 - 1))); 
      }       
      
    } else if ((blkInsetS1 != blkS1 || blkInsetN2 != blkN2) && this.asymmetrical == true) { // Interlocked L
      if (noUpS1 * noUpIntLkN2 > 1) {
        msg += "IntLk Std Feed: " + noUpIntLkS1 + "up " + rule2ruleS1  + " x " + this.noUpIntLkN2 + "up " + (blkN2 + (blkInsetN2 * (this.noUpIntLkN2 - 1))) + "<br> \n";  
      }
      if (noUpIntLkRevS1 * noUpRevN2 >= 1) {
        msg += "<br>IntLk Rev Feed: " + noUpIntLkRevS1 + "up " + (blkN2 + (blkInsetN2 * (noUpIntLkRevS1 - 1))) + " x " + this.noUpRevN2 + "up " + noUpRevN2*blkS1 + "<br>2 \n"; 
      }        
      
    } else { // Non Interlocked
      if (this.noUpS1 * this.noUpN2 > 0) {
        msg += "Std Feed: " + this.noUpS1 + "up " + noUpS1*blkS1  + " x " + this.noUpN2 + "up " + noUpN2*blkN2 + " \n";  
      }
      if (noUpRevS1 * noUpRevN2 > 0) {
        msg += "<br>Rev Feed: " + this.noUpRevS1 + "up " + noUpRevS1*blkN2 + " x " + this.noUpRevN2 + "up " + noUpRevN2*blkS1 + " \n";  
      }
    }
    System.out.println("msg=" + msg);
    return msg + "</html>";
  } // CalcR2R
  
  
  private void getAsymmetricalIntLkSizes() {
    this.noUpIntLkS1 = (int) (this.dcS1 / (this.blkS1 + blkInsetS1) );
    rule2ruleS1 = (this.blkS1 + blkInsetS1) * noUpIntLkS1;
    noUpIntLkS1 = noUpIntLkS1 * 2;
    if (this.dcS1 - ((noUpIntLkS1 / 2) * (this.blkS1 + blkInsetS1)) > this.blkS1) {
      this.noUpIntLkS1 += 1;
      rule2ruleS1 += blkS1;
    }
    
    this.noUpIntLkN2 = (int) (this.dcN2 / (this.blkN2 + blkInsetN2) );
    rule2ruleN2 = (this.blkN2 + blkInsetS1) * noUpIntLkN2;
    noUpIntLkN2 = noUpIntLkN2 * 2;
    if (this.dcN2 - ((noUpIntLkN2 / 2) * (this.blkN2 + blkInsetN2)) > this.blkN2) {
      this.noUpIntLkN2 += 1;
      rule2ruleN2 += blkN2;
    }     
  } // getAsymmetricalIntLkSizes
  
  
  private void getSymmetricalIntLkSizes() {
    this.noUpIntLkS1 = (int) ((this.dcS1 - this.blkS1) / blkInsetS1) + 1;
    this.noUpIntLkN2 = (int) ((this.dcN2 - this.blkN2) / blkInsetN2) + 1;    
    
    this.noUpIntLkRevS1 = (int) ((this.dcS1 - this.blkN2) / blkInsetN2) + 1;  
    this.noUpIntLkRevN2 = (int) ((this.dcN2 - this.blkS1) / blkInsetS1) + 1;        
  } // getSymmetricalIntLkSizes
  
  
  private void getNonIntLkSizes() {
    this.noUpS1 = (int) (this.dcS1 / this.blkS1);
    this.noUpN2 = (int) (this.dcN2 / this.blkN2);
    
    this.noUpRevS1 = (int) (this.dcS1 / this.blkN2);
    this.noUpRevN2 = (int) (this.dcN2 / this.blkS1);
  } // getNonIntLkSizes 
  
  
  private void getDieCutterSizes() {
    if (diecutter == "Elite") {
      dcS1 = eliteFlexoS1;
      dcN2 = eliteFlexoN2;
      trimS1 = 25;
      trimN2 = 20;
    }
    if (diecutter == "Iberica") {
      dcS1 = ibericaS1;
      dcN2 = ibericaN2;
      trimS1 = 30;
      trimN2 = 20;        
    }     
  } // getDieCutterSizes
  
} // MachineSz
