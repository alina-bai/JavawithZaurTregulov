package Lesson27;

public class Tiger {
    public void eat(String eda) {
        if (!eda.equals ("myaso")) {
            throw new NeMyasoException("Tigr ne est " + eda);
        }
        System.out.println("Tigr est myaso");
    }
    public void drink (String jidkost) throws NeVodaException {

        if (!jidkost.equals("voda")) {
            throw new NeVodaException("Tigr ne pyet "+ jidkost);
        }
        System.out.println("Tigr pyet vodu");
    }


}
