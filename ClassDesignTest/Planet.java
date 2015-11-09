import java.util.Random;

public class Planet
{
    private String name;
    private double nameNum;
    private String relation;
    private double radius;
    private int population;
    private double percentSpaceMarines;
    private double smPop;
    private int numSD;
    private double numSM;
    private int maxPopulation;
    private int smPopInt;
    private int maxSpaceMarinesPerStarDestroyer;
    Random rand = new Random();
    String[] pName = {"Alpha", "Beta", "Delta", "Gamma"};
    String[] rStatus = {"friendly", "ally", "neutral", "hostile", "at war"};
    public Planet()
    {
        int randName = rand.nextInt((3 - 0) + 1);
        int randStat = rand.nextInt((4 - 0) + 1);
        radius = 1;
        population = 1;
        percentSpaceMarines = 1;
        smPop = 1;
        numSD = 1;
        numSM = 1;
        name = pName[randName];
        nameNum = Math.random();
        relation = rStatus[randStat];
    }//end method Planet
    public Planet(int maxPopulation, double percentSpaceMarines, int maxSpaceMarinesPerStarDestroyer)
    {
        //System.out.println(percentSpaceMarines);
        int randName = rand.nextInt((3 - 0) + 1);
        int randStat = rand.nextInt((4 - 0) + 1);
        radius = Math.random();
        population = rand.nextInt((maxPopulation - 10000) + 1);
        smPop = population * percentSpaceMarines;
        numSD = rand.nextInt((10000 - 1000) + 1);
        numSM = smPop / numSD;
        smPopInt = (int) smPop;
        name = pName[randName];
        nameNum = Math.random();
        relation = rStatus[randStat];
        this.percentSpaceMarines = percentSpaceMarines;
        //System.out.println(percentSpaceMarines);
        
    }//end method Planet
    public String toString()
    {
        String output = String.format("Name: %s %.2f\n" +
                "Relationship: %s\n" +
                "Radius: %.2f\n" +
                "Population: %d\n" +
                "Space Marines as Percent of Population: %.2f\n" +
                "Space Marines: %d\n" +
                "Star Destroyers: %d\n" +
                "Space marines per Star Destroyer: %.2f\n", name, nameNum, relation, radius, population, percentSpaceMarines, smPopInt, numSD, numSM);
        return output;
    }//end method toString()
}//end class Planet