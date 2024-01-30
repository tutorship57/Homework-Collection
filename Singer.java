public class Singer {
    String name ;
    Style style ;
    public Singer(String n,Style t){
        this.name = n; 
        this.style = t ;
    }
    public String getName() {
        return name;
    }
    public Style getStyle() {
        return style;
    }
    @Override
    public String toString() {
        return "Singer (" + name + "-SingStyle." + style + ")";
    }
    public int compareByName(Singer s ){
        return name.compareTo(s.getName());
    }
    public int compareByStyle(Singer s){
        return style.compareTo(s.getStyle());
    }
    
}

