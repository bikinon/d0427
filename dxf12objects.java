package d0427;

/**
  *
  * Description
  *
  * @version 1.0 from 7/30/2016
  * @author Tim Gathercole
  */

public class dxf12objects {
  
  // start attributes
  public double xabs = 0;
  public double yabs = 0;
  public int hndl = 1000;
  // 1,1 = Right hand, pointing up Flap
  public int Xaxis = 1; // Direction of X axis +1 or -1
  public int Yaxis = 1; // Direction of Y axis +1 or -1
  public int CW = -1;
  public int CCW = 1; 
   
  public String dxf = "";
  public String dxfxmax = "10";
  public String dxfymax = "10";
  public String dimasz = "5.5";
  public String dimtxt = "7.1";
  public String dimexe = "2.2";
  public String lunits = "2";
  public String luprec = "4";
  public String dimdec = "9";
  public String dimzin = "8";
  public String dimexo = "0.1";
  public String dimgap = "0.1";
  // end attributes
  
  // start methods
  protected String dxf_header12() {
    // DXF Version 12 Header - Simplified version
    String cr = "\r\n";
    
    dxf +="  0" + cr;
    dxf +="SECTION" + cr;
    dxf +="  2" + cr;
    dxf +="HEADER" + cr;
    dxf +="  9" + cr;
    dxf +="$ACADVER" + cr;
    dxf +="  1" + cr;
    dxf +="AC1009" + cr;
    dxf +="  9" + cr;
    dxf +="$DWGCODEPAGE" + cr;
    dxf +="  3" + cr;
    dxf +="ansi_1252" + cr;
    dxf +="  9" + cr;
    dxf +="$INSBASE" + cr;
    dxf +=" 10" + cr;
    dxf +="0.0" + cr;
    dxf +=" 20" + cr;
    dxf +="0.0" + cr;
    dxf +=" 30" + cr;
    dxf +="0.0" + cr;
    dxf +="  9" + cr;
    dxf +="$EXTMIN" + cr;
    dxf +=" 10" + cr;
    dxf +="-114.0" + cr;
    dxf +=" 20" + cr;
    dxf +="0.0" + cr;
    dxf +=" 30" + cr;
    dxf +="0.0" + cr;
    dxf +="  9" + cr;
    dxf +="$EXTMAX" + cr;
    dxf +=" 10" + cr;
    dxf +="424.0" + cr;
    dxf +=" 20" + cr;
    dxf +="283.0000000000001" + cr;
    dxf +=" 30" + cr;
    dxf +="0.0" + cr;
    dxf +="  9" + cr;
    dxf +="$LIMMIN" + cr;
    dxf +=" 10" + cr;
    dxf +="0.0" + cr;
    dxf +=" 20" + cr;
    dxf +="0.0" + cr;
    dxf +="  9" + cr;
    dxf +="$LIMMAX" + cr;
    dxf +=" 10" + cr;
    dxf +="12.0" + cr;
    dxf +=" 20" + cr;
    dxf +="9.0" + cr;
    dxf +="  9" + cr;
    dxf +="$ORTHOMODE" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +="  9" + cr;
    dxf +="$REGENMODE" + cr;
    dxf +=" 70" + cr;
    dxf +="     1" + cr;
    dxf +="  9" + cr;
    dxf +="$FILLMODE" + cr;
    dxf +=" 70" + cr;
    dxf +="     1" + cr;
    dxf +="  9" + cr;
    dxf +="$QTEXTMODE" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +="  9" + cr;
    dxf +="$MIRRTEXT" + cr;
    dxf +=" 70" + cr;
    dxf +="     1" + cr;
    dxf +="  9" + cr;
    dxf +="$DRAGMODE" + cr;
    dxf +=" 70" + cr;
    dxf +="     2" + cr;
    dxf +="  9" + cr;
    dxf +="$LTSCALE" + cr;
    dxf +=" 40" + cr;
    dxf +="16.8125" + cr;
    dxf +="  9" + cr;
    dxf +="$OSMODE" + cr;
    dxf +=" 70" + cr;
    dxf +="    37" + cr;
    dxf +="  9" + cr;
    dxf +="$ATTMODE" + cr;
    dxf +=" 70" + cr;
    dxf +="     1" + cr;
    dxf +="  9" + cr;
    dxf +="$TEXTSIZE" + cr;
    dxf +=" 40" + cr;
    dxf +="0.2" + cr;
    dxf +="  9" + cr;
    dxf +="$TRACEWID" + cr;
    dxf +=" 40" + cr;
    dxf +="0.05" + cr;
    dxf +="  9" + cr;
    dxf +="$TEXTSTYLE" + cr;
    dxf +="  7" + cr;
    dxf +="STANDARD" + cr;
    dxf +="  9" + cr;
    dxf +="$CLAYER" + cr;
    dxf +="  8" + cr;
    dxf +="DIMS" + cr;
    dxf +="  9" + cr;
    dxf +="$CELTYPE" + cr;
    dxf +="  6" + cr;
    dxf +="BYLAYER" + cr;
    dxf +="  9" + cr;
    dxf +="$CECOLOR" + cr;
    dxf +=" 62" + cr;
    dxf +="   256" + cr;
    dxf +="  9" + cr;
    dxf +="$DIMSCALE" + cr;
    dxf +=" 40" + cr;
    dxf +="1.0" + cr;
    dxf +="  9" + cr;
    dxf +="$DIMASZ" + cr;
    dxf +=" 40" + cr;
    dxf +="5.0" + cr;
    dxf +="  9" + cr;
    dxf +="$DIMEXO" + cr;
    dxf +=" 40" + cr;
    dxf +="0.0625" + cr;
    dxf +="  9" + cr;
    dxf +="$DIMDLI" + cr;
    dxf +=" 40" + cr;
    dxf +="0.38" + cr;
    dxf +="  9" + cr;
    dxf +="$DIMRND" + cr;
    dxf +=" 40" + cr;
    dxf +="0.0" + cr;
    dxf +="  9" + cr;
    dxf +="$DIMDLE" + cr;
    dxf +=" 40" + cr;
    dxf +="0.0" + cr;
    dxf +="  9" + cr;
    dxf +="$DIMEXE" + cr;
    dxf +=" 40" + cr;
    dxf +="0.18" + cr;
    dxf +="  9" + cr;
    dxf +="$DIMTP" + cr;
    dxf +=" 40" + cr;
    dxf +="0.0" + cr;
    dxf +="  9" + cr;
    dxf +="$DIMTM" + cr;
    dxf +=" 40" + cr;
    dxf +="0.0" + cr;
    dxf +="  9" + cr;
    dxf +="$DIMTXT" + cr;
    dxf +=" 40" + cr;
    dxf +="10.0" + cr;
    dxf +="  9" + cr;
    dxf +="$DIMCEN" + cr;
    dxf +=" 40" + cr;
    dxf +="0.09" + cr;
    dxf +="  9" + cr;
    dxf +="$DIMTSZ" + cr;
    dxf +=" 40" + cr;
    dxf +="0.0" + cr;
    dxf +="  9" + cr;
    dxf +="$DIMTOL" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +="  9" + cr;
    dxf +="$DIMLIM" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +="  9" + cr;
    dxf +="$DIMTIH" + cr;
    dxf +=" 70" + cr;
    dxf +="     1" + cr;
    dxf +="  9" + cr;
    dxf +="$DIMTOH" + cr;
    dxf +=" 70" + cr;
    dxf +="     1" + cr;
    dxf +="  9" + cr;
    dxf +="$DIMSE1" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +="  9" + cr;
    dxf +="$DIMSE2" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +="  9" + cr;
    dxf +="$DIMTAD" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +="  9" + cr;
    dxf +="$DIMZIN" + cr;
    dxf +=" 70" + cr;
    dxf +="     8" + cr;
    dxf +="  9" + cr;
    dxf +="$DIMBLK" + cr;
    dxf +="  1" + cr;
    dxf +="" + cr;
    dxf +="  9" + cr;
    dxf +="$DIMASO" + cr;
    dxf +=" 70" + cr;
    dxf +="     1" + cr;
    dxf +="  9" + cr;
    dxf +="$DIMSHO" + cr;
    dxf +=" 70" + cr;
    dxf +="     1" + cr;
    dxf +="  9" + cr;
    dxf +="$DIMPOST" + cr;
    dxf +="  1" + cr;
    dxf +="" + cr;
    dxf +="  9" + cr;
    dxf +="$DIMAPOST" + cr;
    dxf +="  1" + cr;
    dxf +="" + cr;
    dxf +="  9" + cr;
    dxf +="$DIMALT" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +="  9" + cr;
    dxf +="$DIMALTD" + cr;
    dxf +=" 70" + cr;
    dxf +="     2" + cr;
    dxf +="  9" + cr;
    dxf +="$DIMALTF" + cr;
    dxf +=" 40" + cr;
    dxf +="25.4" + cr;
    dxf +="  9" + cr;
    dxf +="$DIMLFAC" + cr;
    dxf +=" 40" + cr;
    dxf +="1.0" + cr;
    dxf +="  9" + cr;
    dxf +="$DIMTOFL" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +="  9" + cr;
    dxf +="$DIMTVP" + cr;
    dxf +=" 40" + cr;
    dxf +="0.0" + cr;
    dxf +="  9" + cr;
    dxf +="$DIMTIX" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +="  9" + cr;
    dxf +="$DIMSOXD" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +="  9" + cr;
    dxf +="$DIMSAH" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +="  9" + cr;
    dxf +="$DIMBLK1" + cr;
    dxf +="  1" + cr;
    dxf +="" + cr;
    dxf +="  9" + cr;
    dxf +="$DIMBLK2" + cr;
    dxf +="  1" + cr;
    dxf +="" + cr;
    dxf +="  9" + cr;
    dxf +="$DIMSTYLE" + cr;
    dxf +="  2" + cr;
    dxf +="STANDARD" + cr;
    dxf +="  9" + cr;
    dxf +="$DIMCLRD" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +="  9" + cr;
    dxf +="$DIMCLRE" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +="  9" + cr;
    dxf +="$DIMCLRT" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +="  9" + cr;
    dxf +="$DIMTFAC" + cr;
    dxf +=" 40" + cr;
    dxf +="1.0" + cr;
    dxf +="  9" + cr;
    dxf +="$DIMGAP" + cr;
    dxf +=" 40" + cr;
    dxf +="0.09" + cr;
    dxf +="  9" + cr;
    dxf +="$LUNITS" + cr;
    dxf +=" 70" + cr;
    dxf +="     2" + cr;
    dxf +="  9" + cr;
    dxf +="$LUPREC" + cr;
    dxf +=" 70" + cr;
    dxf +="     4" + cr;
    dxf +="  9" + cr;
    dxf +="$SKETCHINC" + cr;
    dxf +=" 40" + cr;
    dxf +="0.1" + cr;
    dxf +="  9" + cr;
    dxf +="$FILLETRAD" + cr;
    dxf +=" 40" + cr;
    dxf +="0.0" + cr;
    dxf +="  9" + cr;
    dxf +="$AUNITS" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +="  9" + cr;
    dxf +="$AUPREC" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +="  9" + cr;
    dxf +="$MENU" + cr;
    dxf +="  1" + cr;
    dxf +="." + cr;
    dxf +="  9" + cr;
    dxf +="$ELEVATION" + cr;
    dxf +=" 40" + cr;
    dxf +="0.0" + cr;
    dxf +="  9" + cr;
    dxf +="$PELEVATION" + cr;
    dxf +=" 40" + cr;
    dxf +="0.0" + cr;
    dxf +="  9" + cr;
    dxf +="$THICKNESS" + cr;
    dxf +=" 40" + cr;
    dxf +="0.0" + cr;
    dxf +="  9" + cr;
    dxf +="$LIMCHECK" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +="  9" + cr;
    dxf +="$CHAMFERA" + cr;
    dxf +=" 40" + cr;
    dxf +="100.0" + cr;
    dxf +="  9" + cr;
    dxf +="$CHAMFERB" + cr;
    dxf +=" 40" + cr;
    dxf +="20.0" + cr;
    dxf +="  9" + cr;
    dxf +="$SKPOLY" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +="  9" + cr;
    dxf +="$TDCREATE" + cr;
    dxf +=" 40" + cr;
    dxf +="2451293.866724537" + cr;
    dxf +="  9" + cr;
    dxf +="$TDUPDATE" + cr;
    dxf +=" 40" + cr;
    dxf +="2458063.872402685" + cr;
    dxf +="  9" + cr;
    dxf +="$TDINDWG" + cr;
    dxf +=" 40" + cr;
    dxf +="0.2139366667" + cr;
    dxf +="  9" + cr;
    dxf +="$TDUSRTIMER" + cr;
    dxf +=" 40" + cr;
    dxf +="0.2139289352" + cr;
    dxf +="  9" + cr;
    dxf +="$USRTIMER" + cr;
    dxf +=" 70" + cr;
    dxf +="     1" + cr;
    dxf +="  9" + cr;
    dxf +="$ANGBASE" + cr;
    dxf +=" 50" + cr;
    dxf +="0.0" + cr;
    dxf +="  9" + cr;
    dxf +="$ANGDIR" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +="  9" + cr;
    dxf +="$PDMODE" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +="  9" + cr;
    dxf +="$PDSIZE" + cr;
    dxf +=" 40" + cr;
    dxf +="0.0" + cr;
    dxf +="  9" + cr;
    dxf +="$PLINEWID" + cr;
    dxf +=" 40" + cr;
    dxf +="0.0" + cr;
    dxf +="  9" + cr;
    dxf +="$COORDS" + cr;
    dxf +=" 70" + cr;
    dxf +="     2" + cr;
    dxf +="  9" + cr;
    dxf +="$SPLFRAME" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +="  9" + cr;
    dxf +="$SPLINETYPE" + cr;
    dxf +=" 70" + cr;
    dxf +="     6" + cr;
    dxf +="  9" + cr;
    dxf +="$SPLINESEGS" + cr;
    dxf +=" 70" + cr;
    dxf +="     8" + cr;
    dxf +="  9" + cr;
    dxf +="$ATTDIA" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +="  9" + cr;
    dxf +="$ATTREQ" + cr;
    dxf +=" 70" + cr;
    dxf +="     1" + cr;
    dxf +="  9" + cr;
    dxf +="$HANDLING" + cr;
    dxf +=" 70" + cr;
    dxf +="     1" + cr;
    dxf +="  9" + cr;
    dxf +="$HANDSEED" + cr;
    dxf +="  5" + cr;
    dxf +="74E" + cr;
    dxf +="  9" + cr;
    dxf +="$SURFTAB1" + cr;
    dxf +=" 70" + cr;
    dxf +="     6" + cr;
    dxf +="  9" + cr;
    dxf +="$SURFTAB2" + cr;
    dxf +=" 70" + cr;
    dxf +="     6" + cr;
    dxf +="  9" + cr;
    dxf +="$SURFTYPE" + cr;
    dxf +=" 70" + cr;
    dxf +="     6" + cr;
    dxf +="  9" + cr;
    dxf +="$SURFU" + cr;
    dxf +=" 70" + cr;
    dxf +="     6" + cr;
    dxf +="  9" + cr;
    dxf +="$SURFV" + cr;
    dxf +=" 70" + cr;
    dxf +="     6" + cr;
    dxf +="  9" + cr;
    dxf +="$UCSNAME" + cr;
    dxf +="  2" + cr;
    dxf +="" + cr;
    dxf +="  9" + cr;
    dxf +="$UCSORG" + cr;
    dxf +=" 10" + cr;
    dxf +="0.0" + cr;
    dxf +=" 20" + cr;
    dxf +="0.0" + cr;
    dxf +=" 30" + cr;
    dxf +="0.0" + cr;
    dxf +="  9" + cr;
    dxf +="$UCSXDIR" + cr;
    dxf +=" 10" + cr;
    dxf +="1.0" + cr;
    dxf +=" 20" + cr;
    dxf +="0.0" + cr;
    dxf +=" 30" + cr;
    dxf +="0.0" + cr;
    dxf +="  9" + cr;
    dxf +="$UCSYDIR" + cr;
    dxf +=" 10" + cr;
    dxf +="0.0" + cr;
    dxf +=" 20" + cr;
    dxf +="1.0" + cr;
    dxf +=" 30" + cr;
    dxf +="0.0" + cr;
    dxf +="  9" + cr;
    dxf +="$PUCSNAME" + cr;
    dxf +="  2" + cr;
    dxf +="" + cr;
    dxf +="  9" + cr;
    dxf +="$PUCSORG" + cr;
    dxf +=" 10" + cr;
    dxf +="0.0" + cr;
    dxf +=" 20" + cr;
    dxf +="0.0" + cr;
    dxf +=" 30" + cr;
    dxf +="0.0" + cr;
    dxf +="  9" + cr;
    dxf +="$PUCSXDIR" + cr;
    dxf +=" 10" + cr;
    dxf +="1.0" + cr;
    dxf +=" 20" + cr;
    dxf +="0.0" + cr;
    dxf +=" 30" + cr;
    dxf +="0.0" + cr;
    dxf +="  9" + cr;
    dxf +="$PUCSYDIR" + cr;
    dxf +=" 10" + cr;
    dxf +="0.0" + cr;
    dxf +=" 20" + cr;
    dxf +="1.0" + cr;
    dxf +=" 30" + cr;
    dxf +="0.0" + cr;
    dxf +="  9" + cr;
    dxf +="$USERI1" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +="  9" + cr;
    dxf +="$USERI2" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +="  9" + cr;
    dxf +="$USERI3" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +="  9" + cr;
    dxf +="$USERI4" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +="  9" + cr;
    dxf +="$USERI5" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +="  9" + cr;
    dxf +="$USERR1" + cr;
    dxf +=" 40" + cr;
    dxf +="0.0" + cr;
    dxf +="  9" + cr;
    dxf +="$USERR2" + cr;
    dxf +=" 40" + cr;
    dxf +="0.0" + cr;
    dxf +="  9" + cr;
    dxf +="$USERR3" + cr;
    dxf +=" 40" + cr;
    dxf +="0.0" + cr;
    dxf +="  9" + cr;
    dxf +="$USERR4" + cr;
    dxf +=" 40" + cr;
    dxf +="0.0" + cr;
    dxf +="  9" + cr;
    dxf +="$USERR5" + cr;
    dxf +=" 40" + cr;
    dxf +="0.0" + cr;
    dxf +="  9" + cr;
    dxf +="$WORLDVIEW" + cr;
    dxf +=" 70" + cr;
    dxf +="     1" + cr;
    dxf +="  9" + cr;
    dxf +="$SHADEDGE" + cr;
    dxf +=" 70" + cr;
    dxf +="     3" + cr;
    dxf +="  9" + cr;
    dxf +="$SHADEDIF" + cr;
    dxf +=" 70" + cr;
    dxf +="    70" + cr;
    dxf +="  9" + cr;
    dxf +="$TILEMODE" + cr;
    dxf +=" 70" + cr;
    dxf +="     1" + cr;
    dxf +="  9" + cr;
    dxf +="$MAXACTVP" + cr;
    dxf +=" 70" + cr;
    dxf +="    48" + cr;
    dxf +="  9" + cr;
    dxf +="$PLIMCHECK" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +="  9" + cr;
    dxf +="$PEXTMIN" + cr;
    dxf +=" 10" + cr;
    dxf +="0.0" + cr;
    dxf +=" 20" + cr;
    dxf +="0.0" + cr;
    dxf +=" 30" + cr;
    dxf +="0.0" + cr;
    dxf +="  9" + cr;
    dxf +="$PEXTMAX" + cr;
    dxf +=" 10" + cr;
    dxf +="0.0" + cr;
    dxf +=" 20" + cr;
    dxf +="0.0" + cr;
    dxf +=" 30" + cr;
    dxf +="0.0" + cr;
    dxf +="  9" + cr;
    dxf +="$PLIMMIN" + cr;
    dxf +=" 10" + cr;
    dxf +="-0.25" + cr;
    dxf +=" 20" + cr;
    dxf +="-0.25" + cr;
    dxf +="  9" + cr;
    dxf +="$PLIMMAX" + cr;
    dxf +=" 10" + cr;
    dxf +="10.75" + cr;
    dxf +=" 20" + cr;
    dxf +="8.25" + cr;
    dxf +="  9" + cr;
    dxf +="$UNITMODE" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +="  9" + cr;
    dxf +="$VISRETAIN" + cr;
    dxf +=" 70" + cr;
    dxf +="     1" + cr;
    dxf +="  9" + cr;
    dxf +="$PLINEGEN" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +="  9" + cr;
    dxf +="$PSLTSCALE" + cr;
    dxf +=" 70" + cr;
    dxf +="     1" + cr;
    dxf +="  0" + cr;
    dxf +="ENDSEC" + cr;
    dxf +="  0" + cr;
    dxf +="SECTION" + cr;
    dxf +="  2" + cr;
    dxf +="TABLES" + cr;
    dxf +="  0" + cr;
    dxf +="TABLE" + cr;
    dxf +="  2" + cr;
    dxf +="VPORT" + cr;
    dxf +=" 70" + cr;
    dxf +="     1" + cr;
    dxf +="  0" + cr;
    dxf +="VPORT" + cr;
    dxf +="  2" + cr;
    dxf +="*ACTIVE" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +=" 10" + cr;
    dxf +="0.0" + cr;
    dxf +=" 20" + cr;
    dxf +="0.0" + cr;
    dxf +=" 11" + cr;
    dxf +="1.0" + cr;
    dxf +=" 21" + cr;
    dxf +="1.0" + cr;
    dxf +=" 12" + cr;
    dxf +="155.0" + cr;
    dxf +=" 22" + cr;
    dxf +="141.5" + cr;
    dxf +=" 13" + cr;
    dxf +="0.0" + cr;
    dxf +=" 23" + cr;
    dxf +="0.0" + cr;
    dxf +=" 14" + cr;
    dxf +="0.5" + cr;
    dxf +=" 24" + cr;
    dxf +="0.5" + cr;
    dxf +=" 15" + cr;
    dxf +="0.5" + cr;
    dxf +=" 25" + cr;
    dxf +="0.5" + cr;
    dxf +=" 16" + cr;
    dxf +="0.0" + cr;
    dxf +=" 26" + cr;
    dxf +="0.0" + cr;
    dxf +=" 36" + cr;
    dxf +="1.0" + cr;
    dxf +=" 17" + cr;
    dxf +="0.0" + cr;
    dxf +=" 27" + cr;
    dxf +="0.0" + cr;
    dxf +=" 37" + cr;
    dxf +="0.0" + cr;
    dxf +=" 40" + cr;
    dxf +="288.6600000000001" + cr;
    dxf +=" 41" + cr;
    dxf +="1.99778270509978" + cr;
    dxf +=" 42" + cr;
    dxf +="50.0" + cr;
    dxf +=" 43" + cr;
    dxf +="0.0" + cr;
    dxf +=" 44" + cr;
    dxf +="0.0" + cr;
    dxf +=" 50" + cr;
    dxf +="0.0" + cr;
    dxf +=" 51" + cr;
    dxf +="0.0" + cr;
    dxf +=" 71" + cr;
    dxf +="     0" + cr;
    dxf +=" 72" + cr;
    dxf +="   100" + cr;
    dxf +=" 73" + cr;
    dxf +="     1" + cr;
    dxf +=" 74" + cr;
    dxf +="     0" + cr;
    dxf +=" 75" + cr;
    dxf +="     0" + cr;
    dxf +=" 76" + cr;
    dxf +="     0" + cr;
    dxf +=" 77" + cr;
    dxf +="     0" + cr;
    dxf +=" 78" + cr;
    dxf +="     0" + cr;
    dxf +="  0" + cr;
    dxf +="ENDTAB" + cr;
    dxf +="  0" + cr;
    dxf +="TABLE" + cr;
    dxf +="  2" + cr;
    dxf +="LTYPE" + cr;
    dxf +=" 70" + cr;
    dxf +="    12" + cr;
    dxf +="  0" + cr;
    dxf +="LTYPE" + cr;
    dxf +="  2" + cr;
    dxf +="CONTINUOUS" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +="  3" + cr;
    dxf +="Solid line" + cr;
    dxf +=" 72" + cr;
    dxf +="    65" + cr;
    dxf +=" 73" + cr;
    dxf +="     0" + cr;
    dxf +=" 40" + cr;
    dxf +="0.0" + cr;
    dxf +="  0" + cr;
    dxf +="LTYPE" + cr;
    dxf +="  2" + cr;
    dxf +="DASHED8" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +="  3" + cr;
    dxf +="_ _ _ _ _ _ _ _ (1/2 of Dashed4)_ _ _ _ _ _ _ _" + cr;
    dxf +=" 72" + cr;
    dxf +="    65" + cr;
    dxf +=" 73" + cr;
    dxf +="     2" + cr;
    dxf +=" 40" + cr;
    dxf +="0.09375" + cr;
    dxf +=" 49" + cr;
    dxf +="0.0625" + cr;
    dxf +=" 49" + cr;
    dxf +="-0.03125" + cr;
    dxf +="  0" + cr;
    dxf +="LTYPE" + cr;
    dxf +="  2" + cr;
    dxf +="CENTER" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +="  3" + cr;
    dxf +="____ _ ____ _ ____ _ ____ _ ____ _ ____ _ ____ " + cr;
    dxf +=" 72" + cr;
    dxf +="    65" + cr;
    dxf +=" 73" + cr;
    dxf +="     4" + cr;
    dxf +=" 40" + cr;
    dxf +="2.0" + cr;
    dxf +=" 49" + cr;
    dxf +="1.25" + cr;
    dxf +=" 49" + cr;
    dxf +="-0.25" + cr;
    dxf +=" 49" + cr;
    dxf +="0.25" + cr;
    dxf +=" 49" + cr;
    dxf +="-0.25" + cr;
    dxf +="  0" + cr;
    dxf +="LTYPE" + cr;
    dxf +="  2" + cr;
    dxf +="DOT2" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +="  3" + cr;
    dxf +="..............................................." + cr;
    dxf +=" 72" + cr;
    dxf +="    65" + cr;
    dxf +=" 73" + cr;
    dxf +="     3" + cr;
    dxf +=" 40" + cr;
    dxf +="0.125" + cr;
    dxf +=" 49" + cr;
    dxf +="0.0" + cr;
    dxf +=" 49" + cr;
    dxf +="-0.125" + cr;
    dxf +=" 49" + cr;
    dxf +="0.0" + cr;
    dxf +="  0" + cr;
    dxf +="LTYPE" + cr;
    dxf +="  2" + cr;
    dxf +="PHANTOM8" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +="  3" + cr;
    dxf +="___ _ _ ___ _ _ (1/2 of Phantom4)__ _ _ ___ _ _" + cr;
    dxf +=" 72" + cr;
    dxf +="    65" + cr;
    dxf +=" 73" + cr;
    dxf +="     6" + cr;
    dxf +=" 40" + cr;
    dxf +="0.3125" + cr;
    dxf +=" 49" + cr;
    dxf +="0.15625" + cr;
    dxf +=" 49" + cr;
    dxf +="-0.03125" + cr;
    dxf +=" 49" + cr;
    dxf +="0.03125" + cr;
    dxf +=" 49" + cr;
    dxf +="-0.03125" + cr;
    dxf +=" 49" + cr;
    dxf +="0.03125" + cr;
    dxf +=" 49" + cr;
    dxf +="-0.03125" + cr;
    dxf +="  0" + cr;
    dxf +="LTYPE" + cr;
    dxf +="  2" + cr;
    dxf +="DIVIDE2" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +="  3" + cr;
    dxf +="__..__..__..__..__..__..__..__..__..__..__..__." + cr;
    dxf +=" 72" + cr;
    dxf +="    65" + cr;
    dxf +=" 73" + cr;
    dxf +="     6" + cr;
    dxf +=" 40" + cr;
    dxf +="0.625" + cr;
    dxf +=" 49" + cr;
    dxf +="0.25" + cr;
    dxf +=" 49" + cr;
    dxf +="-0.125" + cr;
    dxf +=" 49" + cr;
    dxf +="0.0" + cr;
    dxf +=" 49" + cr;
    dxf +="-0.125" + cr;
    dxf +=" 49" + cr;
    dxf +="0.0" + cr;
    dxf +=" 49" + cr;
    dxf +="-0.125" + cr;
    dxf +="  0" + cr;
    dxf +="LTYPE" + cr;
    dxf +="  2" + cr;
    dxf +="DIVIDEX2" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +="  3" + cr;
    dxf +="________  .  .  ________  .  .  ________  .  . " + cr;
    dxf +=" 72" + cr;
    dxf +="    65" + cr;
    dxf +=" 73" + cr;
    dxf +="     6" + cr;
    dxf +=" 40" + cr;
    dxf +="2.5" + cr;
    dxf +=" 49" + cr;
    dxf +="1.0" + cr;
    dxf +=" 49" + cr;
    dxf +="-0.5" + cr;
    dxf +=" 49" + cr;
    dxf +="0.0" + cr;
    dxf +=" 49" + cr;
    dxf +="-0.5" + cr;
    dxf +=" 49" + cr;
    dxf +="0.0" + cr;
    dxf +=" 49" + cr;
    dxf +="-0.5" + cr;
    dxf +="  0" + cr;
    dxf +="LTYPE" + cr;
    dxf +="  2" + cr;
    dxf +="DASHDOT2" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +="  3" + cr;
    dxf +="_._._._._._._._._._._._._._._._._._._._._._._._" + cr;
    dxf +=" 72" + cr;
    dxf +="    65" + cr;
    dxf +=" 73" + cr;
    dxf +="     4" + cr;
    dxf +=" 40" + cr;
    dxf +="0.5" + cr;
    dxf +=" 49" + cr;
    dxf +="0.25" + cr;
    dxf +=" 49" + cr;
    dxf +="-0.125" + cr;
    dxf +=" 49" + cr;
    dxf +="0.0" + cr;
    dxf +=" 49" + cr;
    dxf +="-0.125" + cr;
    dxf +="  0" + cr;
    dxf +="LTYPE" + cr;
    dxf +="  2" + cr;
    dxf +="DOT" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +="  3" + cr;
    dxf +=". . . . . . . . . . . . . . . . . . . . . . . ." + cr;
    dxf +=" 72" + cr;
    dxf +="    65" + cr;
    dxf +=" 73" + cr;
    dxf +="     2" + cr;
    dxf +=" 40" + cr;
    dxf +="0.25" + cr;
    dxf +=" 49" + cr;
    dxf +="0.0" + cr;
    dxf +=" 49" + cr;
    dxf +="-0.25" + cr;
    dxf +="  0" + cr;
    dxf +="LTYPE" + cr;
    dxf +="  2" + cr;
    dxf +="DASHED" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +="  3" + cr;
    dxf +="__ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __" + cr;
    dxf +=" 72" + cr;
    dxf +="    65" + cr;
    dxf +=" 73" + cr;
    dxf +="     2" + cr;
    dxf +=" 40" + cr;
    dxf +="0.75" + cr;
    dxf +=" 49" + cr;
    dxf +="0.5" + cr;
    dxf +=" 49" + cr;
    dxf +="-0.25" + cr;
    dxf +="  0" + cr;
    dxf +="LTYPE" + cr;
    dxf +="  2" + cr;
    dxf +="DASHED2" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +="  3" + cr;
    dxf +="_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _" + cr;
    dxf +=" 72" + cr;
    dxf +="    65" + cr;
    dxf +=" 73" + cr;
    dxf +="     3" + cr;
    dxf +=" 40" + cr;
    dxf +="0.375" + cr;
    dxf +=" 49" + cr;
    dxf +="0.25" + cr;
    dxf +=" 49" + cr;
    dxf +="-0.125" + cr;
    dxf +=" 49" + cr;
    dxf +="0.0" + cr;
    dxf +="  0" + cr;
    dxf +="LTYPE" + cr;
    dxf +="  2" + cr;
    dxf +="PHANTOM2" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +="  3" + cr;
    dxf +="___ _ _ ___ _ _ ___ _ _ ___ _ _ ___ _ _ ___ _ _" + cr;
    dxf +=" 72" + cr;
    dxf +="    65" + cr;
    dxf +=" 73" + cr;
    dxf +="     6" + cr;
    dxf +=" 40" + cr;
    dxf +="1.25" + cr;
    dxf +=" 49" + cr;
    dxf +="0.625" + cr;
    dxf +=" 49" + cr;
    dxf +="-0.125" + cr;
    dxf +=" 49" + cr;
    dxf +="0.125" + cr;
    dxf +=" 49" + cr;
    dxf +="-0.125" + cr;
    dxf +=" 49" + cr;
    dxf +="0.125" + cr;
    dxf +=" 49" + cr;
    dxf +="-0.125" + cr;
    dxf +="  0" + cr;
    dxf +="ENDTAB" + cr;
    dxf +="  0" + cr;
    dxf +="TABLE" + cr;
    dxf +="  2" + cr;
    dxf +="LAYER" + cr;
    dxf +=" 70" + cr;
    dxf +="    21" + cr;
    dxf +="  0" + cr;
    dxf +="LAYER" + cr;
    dxf +="  2" + cr;
    dxf +="0" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +=" 62" + cr;
    dxf +="     7" + cr;
    dxf +="  6" + cr;
    dxf +="CONTINUOUS" + cr;
    dxf +="  0" + cr;
    dxf +="LAYER" + cr;
    dxf +="  2" + cr;
    dxf +="CUT" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +=" 62" + cr;
    dxf +="     1" + cr;
    dxf +="  6" + cr;
    dxf +="CONTINUOUS" + cr;
    dxf +="  0" + cr;
    dxf +="LAYER" + cr;
    dxf +="  2" + cr;
    dxf +="CREASE" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +=" 62" + cr;
    dxf +="     3" + cr;
    dxf +="  6" + cr;
    dxf +="DASHED" + cr;
    dxf +="  0" + cr;
    dxf +="LAYER" + cr;
    dxf +="  2" + cr;
    dxf +="CRE_8PT" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +=" 62" + cr;
    dxf +="     3" + cr;
    dxf +="  6" + cr;
    dxf +="PHANTOM8" + cr;
    dxf +="  0" + cr;
    dxf +="LAYER" + cr;
    dxf +="  2" + cr;
    dxf +="MATRIX" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +=" 62" + cr;
    dxf +="     3" + cr;
    dxf +="  6" + cr;
    dxf +="CONTINUOUS" + cr;
    dxf +="  0" + cr;
    dxf +="LAYER" + cr;
    dxf +="  2" + cr;
    dxf +="SLIT_SCORE" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +=" 62" + cr;
    dxf +="     5" + cr;
    dxf +="  6" + cr;
    dxf +="CONTINUOUS" + cr;
    dxf +="  0" + cr;
    dxf +="LAYER" + cr;
    dxf +="  2" + cr;
    dxf +="CUTCRE_6X6" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +=" 62" + cr;
    dxf +="     6" + cr;
    dxf +="  6" + cr;
    dxf +="DASHED" + cr;
    dxf +="  0" + cr;
    dxf +="LAYER" + cr;
    dxf +="  2" + cr;
    dxf +="PERF_6X6" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +=" 62" + cr;
    dxf +="     2" + cr;
    dxf +="  6" + cr;
    dxf +="DASHED" + cr;
    dxf +="  0" + cr;
    dxf +="LAYER" + cr;
    dxf +="  2" + cr;
    dxf +="PERF_3X3" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +=" 62" + cr;
    dxf +="     2" + cr;
    dxf +="  6" + cr;
    dxf +="DIVIDE2" + cr;
    dxf +="  0" + cr;
    dxf +="LAYER" + cr;
    dxf +="  2" + cr;
    dxf +="PER_12X12" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +=" 62" + cr;
    dxf +="     2" + cr;
    dxf +="  6" + cr;
    dxf +="DIVIDEX2" + cr;
    dxf +="  0" + cr;
    dxf +="LAYER" + cr;
    dxf +="  2" + cr;
    dxf +="PERF_10X10" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +=" 62" + cr;
    dxf +="     2" + cr;
    dxf +="  6" + cr;
    dxf +="PHANTOM2" + cr;
    dxf +="  0" + cr;
    dxf +="LAYER" + cr;
    dxf +="  2" + cr;
    dxf +="CUTCRE_12X12" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +=" 62" + cr;
    dxf +="     6" + cr;
    dxf +="  6" + cr;
    dxf +="DIVIDEX2" + cr;
    dxf +="  0" + cr;
    dxf +="LAYER" + cr;
    dxf +="  2" + cr;
    dxf +="CUTCRE_10X10" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +=" 62" + cr;
    dxf +="     6" + cr;
    dxf +="  6" + cr;
    dxf +="PHANTOM8" + cr;
    dxf +="  0" + cr;
    dxf +="LAYER" + cr;
    dxf +="  2" + cr;
    dxf +="CUT_DECKLE" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +=" 62" + cr;
    dxf +="     1" + cr;
    dxf +="  6" + cr;
    dxf +="PHANTOM8" + cr;
    dxf +="  0" + cr;
    dxf +="LAYER" + cr;
    dxf +="  2" + cr;
    dxf +="NOTCH" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +=" 62" + cr;
    dxf +="     1" + cr;
    dxf +="  6" + cr;
    dxf +="DOT2" + cr;
    dxf +="  0" + cr;
    dxf +="LAYER" + cr;
    dxf +="  2" + cr;
    dxf +="CENTRELINE" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +=" 62" + cr;
    dxf +="     9" + cr;
    dxf +="  6" + cr;
    dxf +="CENTER" + cr;
    dxf +="  0" + cr;
    dxf +="LAYER" + cr;
    dxf +="  2" + cr;
    dxf +="TEXT" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +=" 62" + cr;
    dxf +="     7" + cr;
    dxf +="  6" + cr;
    dxf +="CONTINUOUS" + cr;
    dxf +="  0" + cr;
    dxf +="LAYER" + cr;
    dxf +="  2" + cr;
    dxf +="DIMS" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +=" 62" + cr;
    dxf +="     7" + cr;
    dxf +="  6" + cr;
    dxf +="CONTINUOUS" + cr;
    dxf +="  0" + cr;
    dxf +="LAYER" + cr;
    dxf +="  2" + cr;
    dxf +="EMBOSS" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +=" 62" + cr;
    dxf +="     9" + cr;
    dxf +="  6" + cr;
    dxf +="CONTINUOUS" + cr;
    dxf +="  0" + cr;
    dxf +="LAYER" + cr;
    dxf +="  2" + cr;
    dxf +="BVIEW" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +=" 62" + cr;
    dxf +="     7" + cr;
    dxf +="  6" + cr;
    dxf +="CONTINUOUS" + cr;
    dxf +="  0" + cr;
    dxf +="LAYER" + cr;
    dxf +="  2" + cr;
    dxf +="DEFPOINTS" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +=" 62" + cr;
    dxf +="     7" + cr;
    dxf +="  6" + cr;
    dxf +="CONTINUOUS" + cr;
    dxf +="  0" + cr;
    dxf +="ENDTAB" + cr;
    dxf +="  0" + cr;
    dxf +="TABLE" + cr;
    dxf +="  2" + cr;
    dxf +="STYLE" + cr;
    dxf +=" 70" + cr;
    dxf +="     1" + cr;
    dxf +="  0" + cr;
    dxf +="STYLE" + cr;
    dxf +="  2" + cr;
    dxf +="STANDARD" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +=" 40" + cr;
    dxf +="0.0" + cr;
    dxf +=" 41" + cr;
    dxf +="1.0" + cr;
    dxf +=" 50" + cr;
    dxf +="0.0" + cr;
    dxf +=" 71" + cr;
    dxf +="     0" + cr;
    dxf +=" 42" + cr;
    dxf +="0.2" + cr;
    dxf +="  3" + cr;
    dxf +="txt.shx" + cr;
    dxf +="  4" + cr;
    dxf +="" + cr;
    dxf +="  0" + cr;
    dxf +="ENDTAB" + cr;
    dxf +="  0" + cr;
    dxf +="TABLE" + cr;
    dxf +="  2" + cr;
    dxf +="VIEW" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +="  0" + cr;
    dxf +="ENDTAB" + cr;
    dxf +="  0" + cr;
    dxf +="TABLE" + cr;
    dxf +="  2" + cr;
    dxf +="UCS" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +="  0" + cr;
    dxf +="ENDTAB" + cr;
    dxf +="  0" + cr;
    dxf +="TABLE" + cr;
    dxf +="  2" + cr;
    dxf +="APPID" + cr;
    dxf +=" 70" + cr;
    dxf +="     1" + cr;
    dxf +="  0" + cr;
    dxf +="APPID" + cr;
    dxf +="  2" + cr;
    dxf +="ACAD" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +="  0" + cr;
    dxf +="ENDTAB" + cr;
    dxf +="  0" + cr;
    dxf +="TABLE" + cr;
    dxf +="  2" + cr;
    dxf +="DIMSTYLE" + cr;
    dxf +=" 70" + cr;
    dxf +="     1" + cr;
    dxf +="  0" + cr;
    dxf +="DIMSTYLE" + cr;
    dxf +="  2" + cr;
    dxf +="STANDARD" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +="  3" + cr;
    dxf +="" + cr;
    dxf +="  4" + cr;
    dxf +="" + cr;
    dxf +="  5" + cr;
    dxf +="" + cr;
    dxf +="  6" + cr;
    dxf +="" + cr;
    dxf +="  7" + cr;
    dxf +="" + cr;
    dxf +=" 40" + cr;
    dxf +="1.0" + cr;
    dxf +=" 41" + cr;
    dxf +="5.0" + cr;
    dxf +=" 42" + cr;
    dxf +="0.0625" + cr;
    dxf +=" 43" + cr;
    dxf +="0.38" + cr;
    dxf +=" 44" + cr;
    dxf +="0.18" + cr;
    dxf +=" 45" + cr;
    dxf +="0.0" + cr;
    dxf +=" 46" + cr;
    dxf +="0.0" + cr;
    dxf +=" 47" + cr;
    dxf +="0.0" + cr;
    dxf +=" 48" + cr;
    dxf +="0.0" + cr;
    dxf +="140" + cr;
    dxf +="10.0" + cr;
    dxf +="141" + cr;
    dxf +="0.09" + cr;
    dxf +="142" + cr;
    dxf +="0.0" + cr;
    dxf +="143" + cr;
    dxf +="25.4" + cr;
    dxf +="144" + cr;
    dxf +="1.0" + cr;
    dxf +="145" + cr;
    dxf +="0.0" + cr;
    dxf +="146" + cr;
    dxf +="1.0" + cr;
    dxf +="147" + cr;
    dxf +="0.09" + cr;
    dxf +=" 71" + cr;
    dxf +="     0" + cr;
    dxf +=" 72" + cr;
    dxf +="     0" + cr;
    dxf +=" 73" + cr;
    dxf +="     1" + cr;
    dxf +=" 74" + cr;
    dxf +="     1" + cr;
    dxf +=" 75" + cr;
    dxf +="     0" + cr;
    dxf +=" 76" + cr;
    dxf +="     0" + cr;
    dxf +=" 77" + cr;
    dxf +="     0" + cr;
    dxf +=" 78" + cr;
    dxf +="     8" + cr;
    dxf +="170" + cr;
    dxf +="     0" + cr;
    dxf +="171" + cr;
    dxf +="     2" + cr;
    dxf +="172" + cr;
    dxf +="     0" + cr;
    dxf +="173" + cr;
    dxf +="     0" + cr;
    dxf +="174" + cr;
    dxf +="     0" + cr;
    dxf +="175" + cr;
    dxf +="     0" + cr;
    dxf +="176" + cr;
    dxf +="     0" + cr;
    dxf +="177" + cr;
    dxf +="     0" + cr;
    dxf +="178" + cr;
    dxf +="     0" + cr;
    dxf +="  0" + cr;
    dxf +="ENDTAB" + cr;
    dxf +="  0" + cr;
    dxf +="ENDSEC" + cr;
    dxf +="  0" + cr;
    dxf +="SECTION" + cr;
    dxf +="  2" + cr;
    dxf +="BLOCKS" + cr;
    dxf +="  0" + cr;
    dxf +="BLOCK" + cr;
    dxf +="  8" + cr;
    dxf +="0" + cr;
    dxf +="  2" + cr;
    dxf +="$MODEL_SPACE" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +=" 10" + cr;
    dxf +="0.0" + cr;
    dxf +=" 20" + cr;
    dxf +="0.0" + cr;
    dxf +=" 30" + cr;
    dxf +="0.0" + cr;
    dxf +="  3" + cr;
    dxf +="$MODEL_SPACE" + cr;
    dxf +="  1" + cr;
    dxf +="" + cr;
    dxf +="  0" + cr;
    dxf +="ENDBLK" + cr;
    dxf +="  5" + cr;
    dxf +="1A" + cr;
    dxf +="  8" + cr;
    dxf +="0" + cr;
    dxf +="  0" + cr;
    dxf +="BLOCK" + cr;
    dxf +=" 67" + cr;
    dxf +="     1" + cr;
    dxf +="  8" + cr;
    dxf +="0" + cr;
    dxf +="  2" + cr;
    dxf +="$PAPER_SPACE" + cr;
    dxf +=" 70" + cr;
    dxf +="     0" + cr;
    dxf +=" 10" + cr;
    dxf +="0.0" + cr;
    dxf +=" 20" + cr;
    dxf +="0.0" + cr;
    dxf +=" 30" + cr;
    dxf +="0.0" + cr;
    dxf +="  3" + cr;
    dxf +="$PAPER_SPACE" + cr;
    dxf +="  1" + cr;
    dxf +="" + cr;
    dxf +="  0" + cr;
    dxf +="ENDBLK" + cr;
    dxf +="  5" + cr;
    dxf +="744" + cr;
    dxf +=" 67" + cr;
    dxf +="     1" + cr;
    dxf +="  8" + cr;
    dxf +="0" + cr;
    dxf +="  0" + cr;
    dxf +="ENDSEC" + cr;
    dxf +="  0" + cr;
    dxf +="SECTION" + cr;
    dxf +="  2" + cr;
    dxf +="ENTITIES" + cr;

/*
//** ARTIOS HEADER FILE **    
    dxf +="  0"+ cr;
    dxf +="SECTION"+ cr;
    dxf +="  2"+ cr;
    dxf +="HEADER"+ cr;
    dxf +="  9"+ cr;
    dxf +="$ACADVER"+ cr;
    dxf +="  1"+ cr;
    dxf +="AC1009"+ cr; // DXF Version 12
    dxf +="  9"+ cr;
    dxf +="$EXTMIN"+ cr; // X, Y, and Z drawing extents 10, 20, 30 lower-left corner (in WCS)
    dxf +=" 10"+ cr;
    dxf +="0"+ cr;
    dxf +=" 20"+ cr;
    dxf +="0"+ cr;
    dxf +="  9"+ cr;
    dxf +="$EXTMAX"+ cr; // X, Y, and Z drawing extents 10, 20, 30 upper-right corner (in WCS)
    dxf +=" 10"+ cr;
    dxf += dxfxmax + cr;
    dxf +=" 20"+ cr;
    dxf += dxfymax + cr;
    dxf +="  0"+ cr;
    dxf +="ENDSEC"+ cr;
    dxf +="  0"+ cr;
    dxf +="SECTION"+ cr;
    dxf +="  2"+ cr;
    dxf +="TABLES"+ cr;
    dxf +="  0"+ cr;
    dxf +="TABLE"+ cr;
    dxf +="  2"+ cr;
    dxf +="LAYER"+ cr;
    dxf +=" 70"+ cr;
    dxf +=" 1"+ cr;
    dxf +="  0"+ cr;
    dxf +="LAYER"+ cr;
    dxf +="  2"+ cr;
    dxf +="Design"+ cr;
    dxf +=" 70"+ cr;
    dxf +="64"+ cr;
    dxf +=" 62"+ cr;
    dxf +="7"+ cr;
    dxf +="  6"+ cr;
    dxf +="CONTINUOUS"+ cr;
    dxf +="  0"+ cr;
    dxf +="ENDTAB"+ cr;
    dxf +="  0"+ cr;
    dxf +="ENDSEC"+ cr;
    dxf +="  0"+ cr;
    dxf +="SECTION"+ cr;
    dxf +="  2"+ cr;
    dxf +="BLOCKS"+ cr;
    dxf +="  0"+ cr;
    dxf +="ENDSEC"+ cr;
    dxf +="  0"+ cr;
    dxf +="SECTION"+ cr;
    dxf +="  2"+ cr;
    dxf +="ENTITIES"+ cr;
*/    
    return dxf;
  }
  
  
  protected String dxf_footer12() {
    /* WONT PRINT */
    //  Final part of the DXF File
    //  DXF version 12
    String cr = "\r\n"; // Chr(10).Chr(13);
    
    dxf +="  0" + cr;
    dxf +="ENDSEC" + cr;
    dxf +="  0" + cr;
    dxf +="EOF" + cr;
    
    return dxf;
  }
  
  protected boolean Line(double xval, double yval, String layer) {
    // DXF version 12
    // xval    = Incremental X movement
    // yval    = Incremental Y movement
    // layer   = Layer to use
    // eColor    = Colour to use
    // eLinetype = Line type to use
    //echo xval.'*'.yval.'*'.layer.'*'.eColor.'*'.eLinetype.'<br>';
    String cr = "\r\n";
    
    dxf +="  0" + cr;
    dxf +="LINE" + cr;
    dxf +="  5" + cr; //  Drawing Datadbase Handle
    dxf +=hndl + cr;
    dxf +="  8" + cr; //  Layer name
    dxf += layer + cr; // "Design" + cr; // 
    
    dxf +=" 6" + cr; // Line Type
    dxf +="CONTINUOUS" + cr;
    dxf +=" 62" + cr; // Line Colour
    dxf += getLineCol(layer) + cr;
    
    dxf +=" 10" + cr; //  Start X
    dxf += xabs + cr;
    dxf +=" 20" + cr; //  Start Y
    dxf += yabs + cr;
    dxf +=" 30" + cr; //  Start Z
    dxf +="0.0" + cr;
    dxf +=" 11" + cr; //  End X
    dxf += String.valueOf(xabs + xval * Xaxis) + cr;
    dxf +=" 21" + cr; //  End Y
    dxf += String.valueOf(yabs + yval * Yaxis) + cr;
    dxf +=" 31" + cr; //  End Z
    dxf +="0.0" + cr;
    //  Finish
    xabs = xabs + xval * Xaxis;
    yabs = yabs + yval * Yaxis;
    hndl = hndl + 1;
    return false;
  }
  
  protected String getLineCol(String layer) {
    // Return a colour for a layer from its Layer Name
    /* 
    See ArtiosCAD: Defaults > Import Tuning Table > Artios DXF - Metric
    0 = Glue assist  (DARK GREEN)
    1 = Cut (BLACK)
    2 = Crease (RED)
    3 = CUT CREASE 10x10 //Annotation   (LIGHT GREEN)
    4 = Partial Cut (BLACK)
    5 = PERF 6x6 //Annotation   (LIGHT GREEN)
    6 = SAFETY EDGE //Annotation   (LIGHT GREEN)
    7 = Cut (BLACK)
    8 = Reverse Crease (RED WITH MARK)
    9 = Reverse Partial Cut (DARk RED? WITH MARK)
    10 = Print Registration (DARK GREEN?)
    11 = Outside Bleed (LIGHT GREEN)
    12 = Annotation   (LIGHT GREEN)
    13 = Annotation   (LIGHT GREEN)
    14 = Annotation   (LIGHT GREEN)
    20 = Annotation   (LIGHT GREEN)
    */
    String col = "1";
    switch (layer) {
      case "CUT" : 
        col = "1";  // Artios understands Colour 7 as CUT   
        break;
      case "CUT_DECKLE" : 
        col = "1";  // Artios understands Colour 7 as CUT   
        break;
      case "CREASE" : 
        col = "3";  // green = 7
        break;
      case "MATRIX" : 
        col = "3";  // green = 7
        break;
      case "CUTCRE_6X6" : 
        col = "6";   // magenta = 6
        break;  
      case "CUTCRE_10X10" : 
        col = "6";   // magenta = 6
        break;  
      case "CUTCRE_12X12" : 
        col = "6";   // magenta = 6
        break;          
      case "PERF_12X12" : 
        col = "2";
        break; 
      case "PERF_10X10" : 
        col = "2";
        break;
      case "PERF_3X3" : 
        col = "2";
        break;
      case "PERF_6X6" : 
        col = "2";
        break;        
      case "SAFETY" : 
        col = "20";
        break;      
      case "TEXT" : 
        col = "7";
        break;     
      case "DIMS" : 
        col = "7";
        break;         
      default: 
        col = "1";
    } // end of switch
    return col;  
  }
  
  protected boolean circle(double radius, String layer, int eColor) {
    /*
    * Make a relative move to the center of the circle and call this function
    */
    String cr = "\r\n";
    
    dxf +="  0"+ cr;
    dxf +="CIRCLE"+ cr;
    
    dxf +="  5"+ cr; //  Drawing Datadbase Handle
    dxf +=hndl+ cr;
    dxf +="  8"+ cr; //  Layer name
    dxf += layer+ cr; // "Design" + cr; // Artios Crap only has one layer
    
    dxf +=" 6" + cr; // Line Type
    dxf +="CONTINUOUS" + cr;
    dxf +=" 62" + cr; // Line Colour
    dxf += getLineCol(layer) + cr;
    
    dxf +=" 10"+ cr; //  center X
    dxf +=xabs+ cr;
    dxf +=" 20"+ cr; //  center Y
    dxf +=yabs+ cr;
    dxf +=" 30"+ cr; //  center Z
    dxf +="0.0"+ cr;
    dxf +=" 40"+ cr; //  Radius
    dxf +=radius+ cr;
    
    //  Finish
    hndl = hndl + 1;
    
    return true;
  }
  
  /**
  * ARC2
  * @param XcenterAbs
  * @param YcenterAbs
  * @param radius
  * @param startAngle (0-90-180-270) Mid(3) not Top Str
  * @param endAngle
  * @param endPosX - Incremental movement to update AbsX
  * @param endPosY - to update AbsY
  * @param layer
  * @return DXF Arc
  */ 
  protected boolean arc2(double XcenterAbs, double YcenterAbs, double radius, double startAngle, double endAngle, double endPosX, double endPosY, String layer) {
    String cr = "\r\n";
    
    dxf +="  0" + cr;
    dxf +="ARC" + cr;
    
    dxf +="  5" + cr; //  Drawing Datadbase Handle
    dxf += Integer.toString(hndl) + cr;
    dxf +="  8" + cr; //  Layer name
    dxf += layer + cr; // "Design" + cr; //
    
    dxf +=" 6" + cr; // Line Type
    dxf +="CONTINUOUS" + cr;
    dxf +=" 62" + cr; // Line Colour
    dxf += getLineCol(layer) + cr;
    
    dxf +=" 10" + cr; //  center X
    dxf += XcenterAbs + cr;
    dxf +=" 20" + cr; //  center Y
    dxf += YcenterAbs + cr;
    
    dxf +=" 30" + cr; //  center Z
    dxf +="0.0" + cr;
    
    dxf +=" 40" + cr; //  Radius
    dxf +=radius + cr;
    
    dxf +=" 50" + cr; //  Start Angle of Arc
    dxf +=startAngle + cr;
    dxf +=" 51" + cr; //  End Angle of Arc
    dxf +=endAngle + cr;
    
    //  Finish
    xabs = xabs + endPosX;
    yabs = yabs + endPosY;
    hndl += 1;
    
    return false;
  }
  
  /** 
  * @param xval
  * @param yval
  * @param radius
  * @param layer
  * @param eColor
  * @param cw
  * @return
  */
  protected boolean arc(double xval, double yval, double radius, String layer, int eColor, int cw) {
    // DXF version 12
    // xval   = Incremental X movement to End point
    // yval   = Incremental Y movement to End point
    // radius   = Radius of Arc
    // layer    = Layer to use    (CUT)
    // eColor   = Colour to use  (1)
    // cw     = Clockwise movement of arc: -1 = CW, 1 = CCW so we can just multiply values  CW = std
    
    // Find Centre point of arc and
    double arcArray[] = {0, 0, 0, 0}; // {0 => 0, 1 => 0, 'startAngle' => 0, 'endAngle' => 0}
    arcArray = getArcAngles(xval, yval, radius, cw);
    arcArray[0] = xabs + arcArray[0];
    arcArray[1] = yabs + arcArray[1];
    
    String cr = "\r\n";
    
    dxf +="  0"+ cr;
    dxf +="ARC"+ cr;
    
    dxf +="  5"+ cr; //  Drawing Datadbase Handle
    dxf +=hndl+ cr;
    dxf +="  8"+ cr; //  Layer name
    dxf += layer+ cr;// "Design" + cr; //
    
    dxf +=" 6" + cr; // Line Type
    dxf +="CONTINUOUS" + cr;
    dxf +=" 62" + cr; // Line Colour
    dxf += getLineCol(layer) + cr;
    
    dxf +=" 10"+ cr; //  center X
    dxf +=arcArray[0]+ cr;
    dxf +=" 20"+ cr; //  center Y
    dxf +=arcArray[1]+ cr;
    
    dxf +=" 30"+ cr; //  center Z
    dxf +="0.0"+ cr;
    
    dxf +=" 40"+ cr; //  Radius
    dxf +=radius+ cr;
    
    dxf +=" 50"+ cr; //  Start Angle of Arc
    dxf +=arcArray[2]+ cr;
    dxf +=" 51"+ cr; //  End Angle of Arc
    dxf +=arcArray[3]+ cr;
    
    //  Finish
    xabs = xabs + xval * Xaxis;
    yabs = yabs + yval * Yaxis;
    hndl = hndl + 1;
    
    return true;
    
  } // arc - DXF v12
  
  protected double[] getArcAngles(double IncMoveX, double IncMoveY, double radius, int cw) {
    /* Partial conversion from HPGL2DXF - Largely a Special case protected boolean for 0422 slots
    * Find
    * Xcenter, Ycenter
    * startAngle, endAngle
    */
    // array('Xcenter' => 0, 'Ycenter' => 0, 'startAngle' => 0, 'endAngle' => 0) ** Java doesn't support associative arrays **
    double rtnArray[] = {0, 0, 0, 0};
    
    double rx =  (IncMoveX / 2) * Xaxis ; // absX - Xc
    double ry =  (IncMoveY / 2) * Yaxis; // absY - Yc
    double ang = -1; // set-up
    double aplus = 0; // set-up
    double angle = 0; // not required?
    double wrx = 0;
    double wry = 0;
    double tmp = 0;
    double strang = 0;
    double endang = 0;
    
    if (rx == 0) {
      angle = 180; // simple 180 arc
      //  rad = Abs(ry);
      if (ry > 0) {
        ang = 270; //90;
      } else {
        ang = 90; //270;
      }
      //GoTo arnxt
    } else if (ry == 0) {
      angle = 180; // simple 180 arc
      // rad = Abs(rx)
      if (rx > 0) {
        ang = 180; //0;
      } else {
        ang = 0; //180;
      }
      // GoTo arnxt
      //  rad = (Abs(rx) * Abs(rx)) + (Abs(ry) * Abs(ry)) // *** Radius is Known in this instance ***
      //  rad = Sqr(rad)
      
    } else if (rx > 0 && ry > 0) {
      aplus = 0;
      wrx = rx;
      wry = ry;
    } else if (rx < 0 && ry > 0) {
      aplus = 90;
      wrx = ry;
      wry = rx;
    } else if (rx < 0 && ry < 0) {
      aplus = 180;
      wrx = rx;
      wry = ry;
    } else if (rx > 0 && ry < 0) {
      aplus = 270;
      wrx = ry;
      wry = rx;
    }
    
    if (ang == -1) { // not touched by the first 2 conditions
      ang = Math.abs(wry) / Math.abs(wrx);  /* angle if not 0/90/180/270 */
      ang = Math.atan(ang);
      ang = (ang / 3.141592654) * 180;  /* rad2deg */
    }
    //arnxt:
    //  radius = rad
    
    strang = ang + aplus;
    endang = strang + angle;
    if (endang > 360) {
      endang = endang - 360;
    }
    
    /* start_angle = (strang * 3.141592654) /180  deg2rad */
    /* end_angle = (endang * 3.141592654) /180  deg2rad */
    if (Yaxis == -1) { // flipped slot
      tmp = strang;
      strang = endang;
      endang = tmp;
    }
    
    rtnArray[0] = rx; // Xcenter
    rtnArray[1] = ry; // Ycenter
    rtnArray[2] = strang; // startAngle
    rtnArray[3] = endang; // endAngle
    
    return rtnArray;
  } // getArcAngles
  
  protected void relMove(double relX, double relY) {
    // Relative movement - takes global absolute co-ordinatates and adds a relative movement to them
    xabs = xabs + relX * Xaxis;
    yabs = yabs + relY * Yaxis;  
  } // relMove
  
  protected void absMove(double posX, double posY) {
    // Absolute movement - takes global absolute co-ordinatates and adds a relative movement to them
    xabs = posX * Xaxis;
    yabs = posY * Yaxis;  
  } // absMove

  
 /**
   * 
   * @param angLineX 
   * @param angLineY
   * @param rad Radius
   * @return
   */
  public static double[] findFilletPoints(double angLineX, double angLineY, double rad) {
    /* Finds Fillet points of an Arc on angled line, when filleting 2 lines - One Straight
     * TG - 26/08/2016
     */
    double rtnAry[] = {0, 0, 0};
    
    double lineAngle = Math.toDegrees(Math.atan2(angLineX, angLineY)); 
    rtnAry[0] = rad * Math.sin(Math.toRadians(lineAngle)); // Opposite (X)
    rtnAry[1] = rad * Math.cos(Math.toRadians(lineAngle)); // Adjacent (Y)
    rtnAry[2] = lineAngle; // Angle of Line / Angle of Arc hit point () 
    if (lineAngle > 45) {
      rtnAry[0] = rad - rtnAry[0];
      // Adjacent = IS OK
    }   
    
    return rtnAry; // 0=YendPt = this.topOtrRad - arcDat[0] , 1=XendPt , 2=endAngle = 360 - arcDat[2]
  } // findFilletPoints  
  
  // end methods
} // end of dxf12objects
