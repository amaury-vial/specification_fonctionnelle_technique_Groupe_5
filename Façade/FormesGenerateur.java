package Façade;

public class FormesGenerateur {
    private Formes carre;
    private Formes rectangle;
    private Formes triangle;

    public FormesGenerateur() {
        carre = new Carre();
        rectangle = new Rectangle();
        triangle = new Triangle();
    }
    public void drawCarre(){
        carre.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawTriangle(){
        triangle.draw();
    }
}

