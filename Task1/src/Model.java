public class Model {
    private String finalPhrase="";
    public String getFinalPhrase() {
        return finalPhrase;
    }
    public void setFinalPhrase(String finalPhrase)
    {
        this.finalPhrase=finalPhrase;
    }
    public String createFinalPhrase(String phrase)
    {
        return finalPhrase+=phrase;
    }
}
