public class DocumentEditor{
    private Document document;
    private Persistence persistence;
    private String renderdDocument="";
    DocumentEditor(Document document,Persistence persistence){
        this.document=document;
        this.persistence=persistence;
    }
    void addText(String text){
        document.addElement(new TextElement(text));
    }
    void addImage(String imagePath){
        document.addElement(new ImageElement(imagePath));
    }
    public String renderDocument(){
        if(renderdDocument.isEmpty()){
            renderdDocument=document.render();
        }
        return renderdDocument;
    }
    void saveDocument(){
        persistence.save(renderDocument());
    }


}
