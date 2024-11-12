public class Scoreboard
{
    private String one;
    private String two;
    private int oneScore;
    private int twoScore;
    private String active;
    public Scoreboard (String teamOne, String teamTwo)
    {
      one = teamOne;
      two = teamTwo;
      active = teamOne;
    }
    public String getScore ()
    {
        return oneScore + "-" + twoScore + "-" + active;
    }
    public void recordPlay (int points)
    {
        if (active.equals(one))
        {
            oneScore += points;
        }
        else twoScore += points;
        if(points == 0)
        {
            if(active.equals(one)) active = two;
            else active = one;
        }
    }
}