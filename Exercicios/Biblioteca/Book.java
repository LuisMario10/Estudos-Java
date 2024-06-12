import java.util.ArrayList;

public class Book {
    private String name;
    private int quantPages;
    private String sinopse;
    private ArrayList<Float> listAvaliable;
    private float avaliable;

    public Book(String name, int quantPages, String sinopse) {
        this.setName(name);
        this.setQuantPages(quantPages);
        this.setSinopse(sinopse);
        this.listAvaliable = new ArrayList<Float>();
        this.avaliable = 0;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public int getQuantPages() {
        return this.quantPages;
    }

    public void setQuantPages(int quantPages) {
        this.quantPages = quantPages;
    }

    public String getSinopse() {
        return this.sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public ArrayList<Float> getListAvaliable() {
        return this.listAvaliable;
    }

    public void setAvaliable(float avaliable) {
        if(avaliable < 0 || avaliable > 10) {
            System.err.println("Error in setAvaliable!");
            System.err.println("Avaliação deve ser entre 0 e 10");
        } else {
            this.listAvaliable.add(avaliable);
            this.avaliable = (this.avaliable + avaliable) / this.listAvaliable.size();
        }
    }

    public float getAvaliable() {
        return this.avaliable;
    }

    public void status() {
        System.out.println("---------- Status Book ----------");
        System.out.println("Name: " + this.name);
        System.out.println("Quantity Pages: " + this.quantPages);
        System.out.println("Avaliable: " + this.avaliable);
        System.out.printf("Sinopse: \n %s\n", this.sinopse);
        System.out.println("------------------------------\n\n");
    }
}
