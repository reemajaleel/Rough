package PackageGraphics;

interface interface_graphics{
   public float recArea(int l, int h);
   public float cirArea(int r);
   public float squArea(int a);
   public float triArea(int l, int h);
}

public class PackageGraphics implements interface_graphics {
    
    public float recArea(int l, int h){
        return l*h;
    }
    public float cirArea(int r){
        return r*r*(float)3.14;
    }
    public float squArea(int a){
        return a*a;
    }
    public float triArea(int l, int h){
        return l*h*(float)(.5);
    }
    
}