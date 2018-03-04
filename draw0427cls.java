package d0427;

import java.awt.*;
import javax.swing.*;

public class draw0427cls extends dxf12objects {
  
  // start attributes
  // Anfang Attribute
    public double length = 0;
    public double width = 0;
    public double depth = 0;
    public String style = "0427";
    public String unit = "m";
    public String flute = "E";
  
    public double dotr=0;
    public double dinr=0;
    public double dblbend=0;
  //  public double bofst=0;
  public double bofstL=0;
  public double bofstR=0;
  public double bofst2 = 0;
    public double cofst=0;
    public double cofst2=0;
    public double lug=0;
    public double l1=0; // base
    public double l2=0; // lid
    public double w1=0;
    public double d1=0;
    public double dside=0;
    public double dfront=100;
    public double dmain=0;
    public double tuckrad=10;
    public double w2=0;
    public double ins1=0;
    public double ba=0;
    public double fa=0;   
    public int slotType = 0; // 1=  , 2=  
    public int slotVert = 1;

    public double blks1 = 0;
    public double blkn2 = 0;
    public double blkn2IntLk = 0;
    public double blks1IntLk = 0;
    public double interlockblks1; // being decremented
    public double interlockblkn2;
  
  
    public double eliteFlexoS1 = 0;
    public double eliteFlexoN2 = 0;
    public int noUpS1 = 0;
    public int noUpN2 = 0;
    
    public String cutlay = "CUT";
    public String crelay = "CREASE";
    public int col = 1; // Line Colour
    public String ltype = "CONTINUOUS"; // Line Type
  // Ende Attribute
  // end attributes
  
  // start methods
  // ****************************    
  // Anfang Methoden
  public String Draw0427() {    
    
    this.dxf += this.dxf_header12();  
    // draw the main body starting at top left
    this.absMove(0,0);
    
    double inr2otr = (l1 - l2) / 2; 
    ba = Math.sqrt(w1*w1 + dmain*dmain);
    ba=Math.floor(ba - w1 + 5);
    if (dside<80) {
      fa=10; 
    } else {
      fa=15;    
    }
    // Main Lid section - Top Left
    folderflap(w2, dside, ba, fa, bofst2, bofst2, 0, 0); 
    Line(dmain-dinr, inr2otr - this.bofstL, this.cutlay); // Angle line from Top of Main Depth to top of Left TOE Flap
    this.relMove(-(dmain-dinr), -(inr2otr - this.bofstL));
    Line(0, -l2, crelay);
    this.absMove(0,0); // Move back
    Line(0, -l2, crelay);
    this.Xaxis = 1; 
    this.Yaxis = -1;
    folderflap(w2, dside, ba, fa, bofst2, bofst2, 0, 0); 
    Line(dmain-dinr, inr2otr - this.bofstL, this.cutlay); // Angle line from Top of Main Depth to top of Left TOE Flap
    this.relMove(-(dmain-dinr), -(inr2otr - this.bofstL));
    this.Xaxis = 1; 
    this.Yaxis = 1;    
    this.absMove(0,0); // Move back
    // Arc Flaps
    double flapLen = dfront-(cofst*2);
    if (flapLen > w1 / 2) { // Stop Arc flap hitting the inner flap in TOE
        flapLen = w1 / 2;
    }        
    Line(-cofst2, inr2otr - this.bofstL, cutlay);
    arcflap(dfront-(cofst*2), flapLen, dfront-(cofst*2)); 
    this.relMove(-(dfront-(cofst*2)), 0);
    Line(0, -(l2 + ((inr2otr - this.bofstL)*2)), cutlay);
    this.relMove(dfront-(cofst*2) + cofst2, inr2otr - this.bofstL);
    this.Xaxis = 1; 
    this.Yaxis = -1; 
    Line(-cofst2, inr2otr - this.bofstL, cutlay);
    arcflap(dfront-(cofst*2), flapLen, dfront-(cofst*2)); 
    this.Xaxis = 1; 
    this.Yaxis = 1; 
    
    // Move to do Base
    this.absMove(0,0);
    this.relMove(w2 + this.dmain, inr2otr - this.bofstL);
    
    this.toe(w1, slotVert); 
    
    // must be FALSE because we go UP not DOWN on X axis
    this.Xaxis = -1;
    this.Yaxis = 1; 
    this.TheFlap(w1, bofstL); // Top Base flap Left
    this.Xaxis = 1;
    this.Yaxis = 1;
    Line(0, -l1 + (this.bofstL * 2), crelay); // Left Side Base Fold
    this.relMove(0, l1 - (this.bofstL * 2));
    
    this.relMove(w1, bofstL - bofstR);
    Line(0, -l1 + (this.bofstR * 2), crelay); // Right Side Base Fold
    this.relMove(this.dinr, l1 - (this.bofstR * 2));
    Line(0, -l1 + (this.bofstR * 2), cutlay); // Right Side Edge
    this.relMove(-this.dinr, l1 - (this.bofstR * 2));
    this.TheFlap(w1, bofstR); // Top Base flap Right
    
    this.relMove(0, -(l1 - (bofstR * 2)));
    this.Xaxis = 1;
    this.Yaxis = -1;
    this.TheFlap(w1, bofstR); // , this.dotr, this.dinr, this.dblbend, this.bofst, this.cofst, this.lug);
    
    this.relMove(-w1, -(bofstL - bofstR));
    slotVert = -1;
    this.toe(w1, slotVert); // , this.dotr, this.dinr, this.dblbend, this.bofst, this.cofst, this.lug, -1); // Slots UP
    this.Xaxis = 1;
    this.Yaxis = 1;
    this.relMove(0, bofstL *2); // toe move is the wrong way?
    this.Xaxis = -1;
    this.Yaxis = -1;
    this.TheFlap(w1, bofstL); //, this.dotr, this.dinr, this.dblbend, this.bofst, this.cofst, this.lug);
    
    
    
    
    dxf +="  0\r\n";
    dxf +="ENDSEC\r\n";
    dxf +="  0\r\n";
    dxf +="EOF\r\n";
    
    return dxf;
  }
  // ************************************    
  
  public void allowanceSetup() {
    
    switch (flute) {
      case "E":  // E flute                                                                         
      dotr=depth+1; // Otr TOE
      dinr=depth+0; // Inr TOE
      dfront=depth+1;
      dblbend=6;
      bofstL=4; // 1.5; // moved over per Fred 29/9/17
      bofstR=4; // Bend offset Right side - Otr Flap entry
      bofst2=2; 
      cofst=1;
      cofst2 = 2;
      lug=3;
      l2=length + 2;
      l1=l2+(dblbend*2+2);
      w1=width+2;
      w2=width+3;
      dside=depth+1.5; // 0; // Side flap in Lid section
      dmain=depth+2; 
      if (dmain < 40) {
         lug=2.5; 
      }
      break;// ==
      
      case "B": // B flute                                                                      
      dotr=depth+2;
      dinr=depth+0;
      dfront=depth+1;
      dblbend=8;
      bofstL=2;
      bofstR=4;
      bofst2=4;
      cofst=2;
      cofst2=2;
      lug=4;
      l2=length + 3;
      l1=l2+(dblbend*2+2);
      w1=width+3;
      w2=width+6;
      dside=depth+2;
      dmain=depth+3; 
      break;// ==
      
      case "C": // C flute                                                                      
      dotr=depth+3;
      dinr=depth+1;
      dfront=depth+2;
      dblbend=14;
      bofstL=3;
      bofstR=6;
      bofst2=6;
      cofst=2;
      cofst2 = 3;
      lug=5;
      l2=length + 5;
      l1=l2+(dblbend*2+2);
      w1=width+5;
      w2=width+9;
      dside=depth+2;
      dmain=depth+5; 
      break; // ==
      
      case "BC": // "BC"                                                                                        
      dotr=depth+7;
      dinr=depth+4;
      dfront=depth+4;
      dblbend=20;
      bofstL=5;
      bofstR=10;
      bofst2=10;
      cofst=4;
      cofst2 = 4;
      lug=5;
      l2=length + 7;
      l1=l2+(dblbend*2+2);
      w1=width+7;
      w2=width+14;
      dside=depth+4;
      dmain=depth+7; 
      break; // ==
      
      case "Carton Brd": //
      dotr=depth+0;
      dinr=depth-0.5;
      dfront=depth+0.5;
      dblbend=2;
      bofstL=0.5;
      bofstR=1;
      bofst2=0.5;
      cofst=0.5;
      cofst2=1.5;
      lug=2.5;
      l2=length + 0; // Doesnt seem to work
      l1=l2+(dblbend*2); 
      w1=width+0;
      w2=width+1;
      dside=depth+0;  // Side flap in Lid section
      dmain=depth+0.5; 
      break;// ==      
    } 
    
    this.blks1 = (lug + dinr + dblbend + dotr) * 2 + l1;
    this.blkn2 = dinr + w1 + dmain + w2 + dfront;
    // Actually 1st way - but taken from the d0421+ prog
    blks1IntLk = lug + dinr + dblbend + dotr + l1 - ((l1 - l2) / 2) + dside; // this.blkn2 * 2;
    System.out.println("***draw0427cls.allowanceSetup BI=" + blks1IntLk); // + "**" + (lug + dinr + dblbend + dotr + l1 - ((l1 - l2) / 2)) );
    
    if (depth > length) {
      JOptionPane.showMessageDialog(null, "MAKE-UP WARNING /n/r Depth greater than Length - Extra bend may be needed in the turned in depth.", "Warning", JOptionPane.ERROR_MESSAGE);   
    } // if
    
  } // allowanceSetup
  
  
  
  /**
  * Create Full TOE drawing - main DXF returned ** From PHP **
  * @return string
  */
  public String DrawTOE()
  {
    int slotVert = 1;
    double tmp = 0;
    if (this.style == "0423") { // *** DrawTOE ***
      tmp = w1;
      w1 = l1;
      l1 = tmp;
    }
    
    this.dxf += this.dxf_header12();
    
    // draw the main body starting at btm right
    this.Line(0, -l1+this.bofstL*2, this.cutlay);
    
    this.relMove(dside, 0);
    this.Line(0, l1-this.bofstL*2, this.crelay);
    
    this.relMove(w1, bofstL - bofstR);
    this.Line(0, -l1+this.bofstR*2, this.crelay);
    
    this.relMove(dside, 0);
    this.Line(0, l1-this.bofstR*2, this.cutlay);
    
    this.relMove(-dside-w1, -(bofstL - bofstR));
    this.toe(w1, slotVert); //, this.dotr, this.dinr, this.dblbend, this.bofst, this.cofst, this.lug);
    
    // must be FALSE because we go UP not DOWN on X axis
    this.Xaxis = -1;
    this.Yaxis = 1; 
    this.TheFlap(w1, bofstL); //, this.dotr, this.dinr, this.dblbend, this.bofst, this.cofst, this.lug);
    this.Xaxis = 1;
    this.Yaxis = 1;
    this.relMove(w1, bofstL - bofstR);
    this.TheFlap(w1, bofstR); //, this.dotr, this.dinr, this.dblbend, this.bofst, this.cofst, this.lug);
    
    this.relMove(0, -l1+this.bofstR*2);
    this.Xaxis = 1;
    this.Yaxis = -1;
    this.TheFlap(w1, bofstR); // , this.dotr, this.dinr, this.dblbend, this.bofst, this.cofst, this.lug);
    
    this.relMove(-w1, -(bofstL - bofstR));
    slotVert = -1;
    this.toe(w1, slotVert); // , this.dotr, this.dinr, this.dblbend, this.bofst, this.cofst, this.lug, -1); // Slots UP
    this.Xaxis = 1;
    this.Yaxis = 1;
    this.relMove(0, bofstL *2); // toe move is the wrong way?
    this.Xaxis = -1;
    this.Yaxis = -1;
    this.TheFlap(w1, bofstL); //, this.dotr, this.dinr, this.dblbend, this.bofst, this.cofst, this.lug);
    
    //this.dxf += this.dxf_footer12();
    dxf +="  0\r\n";
    dxf +="ENDSEC\r\n";
    dxf +="  0\r\n";
    dxf +="EOF\r\n";
    //  echo '5 DXF_Footer2<br>';
    
    return this.dxf; // this.dxf;
  } // DrawTOE
  
  
  
  /**
  * 
  * @param float w1
  * @param float dotr
  * @param float dinr
  * @param float dblbend
  * @param float bofst
  * @param float cofst
  * @param float lug
  */
  protected void TheFlap(double w1, double bofstSd) //w1,dotr,dinr,dblbend,bofst,cofst)
  {
    /*
    Vertical Flap for a Turn Over Ends Tray
    */  
    boolean sqrflag = false;
    double dis = dinr; // this.depth
    
    double edgePoint = 10;
    double WasteRemoval = 6; 
    double fa = 35;
    if (dis < 35) {
      fa=10;  // flap angle
    } else if (dis < 50) {
      fa=15;
    } else if (dis < 75) {
      fa=20;
    } else if (dis < 120) {
      fa=25;
    } else if (dis < 180) {
      fa=30;
    } else {
      fa=35;
    }   
    
    // Calc Flap Length
    double flap = lug + dinr + dblbend + dotr + bofstSd; // max possible size
    if (flap > (w1 / 2)) { // cant overlap
      flap=Math.floor((w1 / 2));
    }
    
    if ((flap > dinr+dblbend+dotr+bofstSd) && (flap < lug+dinr+dblbend+dotr+bofstSd)) {
      flap=dinr+dblbend+dotr+bofstSd; // no half lugs to end
    } else if ((flap > bofstSd+dotr) && (flap < bofstSd+dotr+dblbend+10)) {
      flap = bofstSd+dotr; // square flap
    } else if ((flap > bofstSd+dotr-edgePoint) && (flap < bofstSd+dotr)) {
      flap=bofstSd+dotr-edgePoint; // square flap not <10 to edge
    }
    
    if (flap <= (bofstSd + dotr)) {
      sqrflag = true;
    }
    
    //error_log(flap.'*'.dis.'*'.lug.'*'.dinr.'*'.dblbend.'*'.dotr.'*'.bofst);  
    //    SetCurrent( Find( "Crease" ) );
    Line(dis, 0, crelay); // Crease
    
    //    SetCurrent( Find( "Cut" ) );
    Line( 0, flap, cutlay); // Outer edge of flap
    
    if (sqrflag == true) {
      Line( -dis+cofst, 0, cutlay);
      relMove(-cofst, -flap);
    } else {
      Line( -dis+fa+cofst, 0, cutlay);
      Line( -fa+WasteRemoval, -flap+bofstSd+dotr, cutlay);
      Line( -WasteRemoval, 0, cutlay);
      relMove(-cofst, -bofstSd-dotr);
    } 
  } // TheFlap
  
  /**
  * 
  * @param float dis
  * @param float slotw
  */
  protected void TheSlot(double dis, double slotw) {
    // *** Lock Slots on TOE ***
    switch (slotType) {
      
      case 1: // square ends
      Line(-dis, 0, cutlay);
      Line(0, -slotw, cutlay); 
      Line(dis, 0, cutlay); 
      Line(0, slotw, cutlay);
      break;
      
      case 2: // U cut
      relMove(-dis, 0);
      Line(0, -slotw, cutlay); 
      Line(dis, 0, cutlay); 
      Line(0, slotw, cutlay);
      break;
      
      default: // rounded ends
      Line(-dis, 0, cutlay);
      arc(0, -slotw, slotw/2, cutlay, 1, CCW);
      Line(dis, 0, cutlay);   
      arc(0, slotw, slotw/2, cutlay, 1, CW);
    }
    
    relMove(-dis, 0); // saves multiple moves in main 
    
  } // TheSlot
  
  protected void toe(double dis, int slotVert) //dis,dotr,dinr,dblbend,bofst,cofst,lug, slotVert = 1)
  {
    // *** Draw the main turn over section *** From original LP Macro
    double slotw = dblbend + 1; // width of lock slot
    if (slotVert == 0) {
      slotVert = 1;
    }
    
    double lugAng = 2;
    double minLug = 25;
    double min3Lugs = 900;
    double min1Lug = 101;
    double min0Lug = 50;    
    
    double x = 0;
    double y = 0;
    
    Line(-cofst, bofstL, cutlay);  // main outline of side
    Line(0,dotr, cutlay);
    Line(cofst*2,dblbend, cutlay);
    Line(0, dinr, cutlay);
    
    // Draw the lugs section
    if (dis < min0Lug) {        // === 0 lugs ===
      Line( dis-cofst*2, 0, cutlay);
    } else if (dis < min1Lug) { // === 1 lug ===
      y = Math.floor(dis / 3);
      x = dis - y*2; // div by 3rds
      y=y-cofst; // offset reduction
      Line( y, 0, cutlay); // cut then lug
      Line( lugAng, lug, cutlay);
      Line( x-lugAng*2, 0, cutlay);
      Line( lugAng, -lug, cutlay);
      Line( y, 0, cutlay);
    } else if (dis > min3Lugs) { // === 3 lugs ===
      y = Math.floor(dis / 8);
      x = y;
      //    y=y-cofst; // offset reduction
      Line( y-cofst, 0, cutlay); // cut then lug
      Line( lugAng, lug, cutlay);
      Line( x-lugAng*2, 0, cutlay);
      Line( lugAng, -lug, cutlay);
      Line( (dis-x*3-y*2)/2, 0, cutlay);
      
      Line( lugAng, lug, cutlay); // middle lug
      Line( x-lugAng*2, 0, cutlay);
      Line( lugAng, -lug, cutlay);
      
      Line( (dis-x*3-y*2)/2, 0, cutlay);
      Line( lugAng, lug, cutlay); // other lug
      Line( x-lugAng*2, 0, cutlay);
      Line( lugAng, -lug, cutlay);
      Line( y-cofst, 0, cutlay);
    } else { // === 2 lugs ==============
      y = Math.floor(dis/6);
      x=y; // lug size is width bend div by 6 to std with louth
      //    y=y-cofst; // offset reduction
      if (x < minLug) {
        x=minLug;
      }   
      Line( y-cofst, 0, cutlay); // cut the lug
      Line( lugAng, lug, cutlay);
      Line( x-lugAng*2, 0, cutlay);
      Line( lugAng, -lug, cutlay);
      Line( dis-x*2-y*2, 0, cutlay);
      Line( lugAng, lug, cutlay); // other lug
      Line( x-lugAng*2, 0, cutlay);
      Line( lugAng, -lug, cutlay);
      Line( y-cofst, 0, cutlay);
    }
    
    Line(0,-dinr, cutlay); // other outline of side
    Line(cofst*2,-dblbend, cutlay);
    Line(0,-dotr, cutlay);
    Line(-cofst,-bofstR, cutlay);
    
    //  SetCurrent( Find( "Crease" ) ); // double bends
    relMove(cofst,bofstR+dotr);
    Line( -dis-cofst*2, 0, crelay);
    relMove(cofst*2, dblbend);
    Line(dis-cofst*2, 0, crelay);
    relMove(cofst*2,-dotr-dblbend);
    
    // Lock holes
    if (dis<min0Lug) { // === 0 lugs ===
      Line( -dis-cofst*2, 0, crelay);
    } else if (dis<min1Lug) { // === 1 lug ===
      Line( -y-cofst*2, 0, crelay);
      this.Xaxis = -1;
      this.Yaxis = slotVert;   
      this.TheSlot(-x, slotw);
      this.Xaxis = 1;
      this.Yaxis = 1;   
      //    SetCurrent( Find( "Crease" ) );
      Line( -y-cofst*2, 0, crelay);
    } else if (dis>min3Lugs) { // === 3 lugs ===
      Line( -y-cofst, 0, crelay);
      this.Xaxis = -1;
      this.Yaxis = slotVert;   
      this.TheSlot(-x, slotw);
      this.Xaxis = 1;
      this.Yaxis = 1;   
      //    SetCurrent( Find( "Crease" ) ); // mid bend
      Line( (-dis+x*3+y*2)/2, 0, crelay);
      this.Xaxis = -1;
      this.Yaxis = slotVert;   
      this.TheSlot(-x, slotw);
      this.Xaxis = 1;
      this.Yaxis = 1;   
      //    SetCurrent( Find( "Crease" ) );
      Line( (-dis+x*3+y*2)/2, 0, crelay);
      this.Xaxis = -1;
      this.Yaxis = slotVert;   
      this.TheSlot(-x, slotw);
      this.Xaxis = 1;
      this.Yaxis = 1;   
      //    SetCurrent( Find( "Crease" ) );
      Line( -y-cofst, 0, crelay);
    } else { // === 2 lugs ==============
      Line( -y-cofst, 0, crelay);
//      this.Xaxis = -1;
      this.Yaxis = slotVert;
      this.TheSlot(-x, slotw);
      //    SetCurrent( Find( "Crease" ) ); // mid bend
//      this.Xaxis = 1;
//      this.Yaxis = 1;
      Line( -dis+x*2+y*2, 0, crelay);
//      this.Xaxis = -1;
//      this.Yaxis = slotVert;
      this.TheSlot(-x, slotw);
      //    SetCurrent( Find( "Crease" ) );
//      this.Xaxis = 1;
//      this.Yaxis = 1;   
      Line( -y-cofst, 0, crelay);
    }
    
    relMove(cofst, -bofstL); // move back to starting position
    //return true;
  } //  toe
  
  
  /**
  * @param dis - Horz Distance
  * @param flap  - length of flap Vert
  * @param a1  - angle cut side 1 (additional to ins1 value)
  * @param a2  - angle cut side 2
  * @param ins1  - inset step before starting to draw flap
  * @param ins2  - inset step at end of flap
  * @param r1  - radius on side 1
  * @param r2  - radius on side 2
  */
  private void folderflap(double dis, double flap, double a1, double a2, double ins1, double ins2, double r1, double r2) {// CONST vector start, endpnt_Xaxis, CONST Boolean YAxisUpwards,CONST Length flap,a1,a2,ins1,ins2,r1,r2)
    // folder type flap 14/12/1997 Tim Gathercole - Java version 24/12/2016
    double e1 =0 , e2 = 0, e3 = 0;
    //        UserCoords( start, endpnt_Xaxis, YAxisUpwards );  
    //        dis = GetLength( start, endpnt_Xaxis);
    
    if (ins1 > 0) {
      Line(ins1, 0, cutlay);
    }
    Line(dis-ins1-ins2, 0, crelay);
    
    if (ins2 > 0) {
      Line(ins2, 0, cutlay);
    }
    relMove(-dis+ins1, 0);  
    Line(a1, flap, cutlay); // e1=
    Line(dis-ins1-ins2-a1-a2, 0, cutlay); // e2
    Line(a2, -flap, cutlay); // e3
    
    //        IF r1>0 THEN // radius required?
    //          FILLET(e1,e2,Getmid(e1),Getmid(e2),r1);
    //        END;
    //        IF r2>0 THEN
    //          FILLET(e2,e3,Getmid(e2),Getmid(e3),r2);
    //        END;
    relMove(ins2, 0);
  } // folderflap
  
  /**
  * @param dis - Distance of Panel Depth - Cut-offset (also main rad)
  * @param flapLen - length of flap, can be Chopped to stop hitting flap inside TOE
  * @param r1  - Currently Main Radius. Should be small fillet Radius 
  */
  private void arcflap(double dis, double flapLen, double r1) { // (CONST vector start, endpnt_Xaxis, CONST Boolean YAxisUpwards,CONST Length flap,r1)
    // Arced folder type flap 27/12/97 Tim Gathercole - Java version 29/12/2016
    // Can point UP or DOWN
    double opste = 0;
    double calcAng = 0;
    // flapLen = dis;
    if (dis != flapLen) { // We have to cut the flap short to stop it hitting the TOEs inner flap
        opste = Math.sqrt((r1 * r1) - (flapLen * flapLen));
        calcAng = Math.toDegrees(Math.acos(flapLen / r1)); // Amount Arc angle has to be cut back
    }
    if (this.Yaxis > 0) {
        calcAng = 90 + calcAng;
    } else {
        calcAng = 270 - calcAng;
    }
    Line(-dis, 0, crelay); // Crease Line        
    //arc(dis, flap, r1, cutlay, 1, CW);
    if (this.Yaxis > 0) {
      arc2(this.xabs+dis, this.yabs, r1, calcAng, 180, dis-opste, flapLen, cutlay);
    } else {
      arc2(this.xabs+dis, this.yabs, r1, 180, calcAng, dis-opste, -flapLen, cutlay);  
    }
    if (dis != flapLen) { // Chop line on Arc flap
        Line(opste, 0, cutlay);
    }
    Line(0, -flapLen, cutlay); // e2=
    
   // System.out.println(opste + "**\n" + calcAng);
    // FILLET(e1,e2,Getmid(e1),Getmid(e2),r1);
  } // arcflap
  
  
  // end methods
  
  
} // class
    
    
  