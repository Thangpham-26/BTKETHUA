public class Book2 extends LibraryItem{
    private String author;
    private String isbn;

    public Book2( String title,int yearPublished, String author, String isbn){
        super(title, yearPublished);
        this.author=author;
        this.isbn=isbn;
    }
    public String getDetails(){
        return String.format("Book title: "+getTitle()+", year: "+getYearPublished()+", author: "+author+", isbn: "+isbn);
    }



}
