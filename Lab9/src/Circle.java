
public class Circle {
double radius;
    
    public Circle(double radius) {
         this.radius=radius;
    }
    
    public double getCircumference() {
        return (2*Math.PI*radius);
    }
    
    public String getFormattedCircumference() {
        
        return formatNumber(getCircumference());
    }
    public double getArea() {
        
        return (Math.PI*(radius*radius));
    }
    
    public String getFormattedArea() {
        
        return formatNumber(getArea());
    }
    
    private String formatNumber(double x) {
        String area=String.valueOf(x);
        String format=area.substring(0, (area.indexOf(".")+1));
        String otherPart=area.substring(area.indexOf(".")+1,area.length());
        for(int i=0 ; i<=1;i++ ) {
            format+=otherPart.charAt(i);
        }
        
        return format;
    }
}



