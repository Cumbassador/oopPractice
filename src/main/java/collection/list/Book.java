package collection.list;

public class Book {

    private final String title;
    private final String author;
    private int quantityOfPage;

    public Book(String title, String author, int quantityOfPage) {
        this.title = title;
        this.author = author;
        this.quantityOfPage = quantityOfPage;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getQuantityOfPage() {
        return this.quantityOfPage;
    }

    public void setQuantityOfPage(int quantityOfPage) {
        this.quantityOfPage = quantityOfPage;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Book)) return false;
        final Book other = (Book) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$title = this.getTitle();
        final Object other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
        final Object this$author = this.getAuthor();
        final Object other$author = other.getAuthor();
        if (this$author == null ? other$author != null : !this$author.equals(other$author)) return false;
        if (this.getQuantityOfPage() != other.getQuantityOfPage()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Book;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        final Object $author = this.getAuthor();
        result = result * PRIME + ($author == null ? 43 : $author.hashCode());
        result = result * PRIME + this.getQuantityOfPage();
        return result;
    }

    public String toString() {
        return " List: [Book{" + this.getTitle() + ", " + this.getAuthor() + ", " + this.getQuantityOfPage() + ")\n";
    }
}
