public enum ScoreData {
    data(0.0, 0.0);

    private double MainScore;
    private double SubScore;


    ScoreData(double mainScore, double subScore) {
        MainScore = mainScore;
        SubScore = subScore;
    }

    public double getMainScore() {
        return MainScore;
    }

    public void setMainScore(double mainScore) {
        MainScore = mainScore;
    }

    public void addMainScore(double mainScore){
        MainScore += mainScore;
    }

    public double getSubScore() {
        return SubScore;
    }

    public void setSubScore(double subScore) {
        SubScore = subScore;
    }

    public void addSubScore(double subScore){
        SubScore += subScore;
    }
}
