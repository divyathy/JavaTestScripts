package Common;

public enum BaseURI {
    baseURL("https://asuonline.asu.edu/");
    private final String baseURI;
    BaseURI(String baseURI) {this.baseURI=baseURI;}
    public String getBaseURI() {return this.baseURI;}
}
