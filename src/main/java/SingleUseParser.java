public class SingleUseParser {
    private final String xml;

    public SingleUseParser(String xml){
        this.xml = xml;
    }

    public Object parse(){
        // Parse this.xml
        return this.xml;
    }
}
