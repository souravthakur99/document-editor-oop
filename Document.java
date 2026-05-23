import java.util.ArrayList;
import java.util.List;

public class Document{
   
    private List<DocumentElement> dElements;
    Document(){
        dElements=new ArrayList<>();
    }
    public void addElement(DocumentElement documentElement){
        dElements.add(documentElement);
    }
    public String render(){
        StringBuilder sb=new StringBuilder();
        for(DocumentElement element: dElements){
            sb.append(element.render());
            sb.append("\n");
        }
        return sb.toString();
        }

}

