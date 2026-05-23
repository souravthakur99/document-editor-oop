
    class ImageElement implements DocumentElement{
    private String imagePath;
    ImageElement(String imagePath){
        this.imagePath=imagePath;
    }
    @Override
    public String render(){
        return "Image"+imagePath+"";
    }
}

