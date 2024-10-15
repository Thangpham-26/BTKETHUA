public class Magazine  extends LibraryItem {
    private String publisher;
    private int issuenumber;

    public Magazine(String title, int yearPublished, String publisher, int issuenumber) {
        super(title, yearPublished);
        this.publisher = publisher;
        this.issuenumber = issuenumber;
    }
    public String getDetails(){
        return String.format("magazine title: "+getTitle()+", year: "+getYearPublished()+", publisher: "+publisher+", issuenumber: "+issuenumber);
    }
}
