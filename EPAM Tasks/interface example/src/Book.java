class Book implements IPrintable{
    String name;
    String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }


    @Override
    public void print() {
        System.out.println(name+author);
    }
}
