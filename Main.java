public class Main{

public static void main(String args[]){
    Document document=new Document();
    Persistence persistence=new SavetoFile();
    DocumentEditor documentEditor=new DocumentEditor(document, persistence);
    documentEditor.addText("hello");
    documentEditor.addImage("hi.jpg");
    System.out.println(documentEditor.renderDocument());
    documentEditor.saveDocument();
    
}
}