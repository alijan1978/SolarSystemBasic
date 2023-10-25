
public class Main {
    public static void main(String[] args) {

       SolarSystem solarSystem = new SolarSystem();

       solarSystem.Sun="Our solar system has 1 Sun";
       solarSystem.Moon="Our solar system has hundreds of moons";
       solarSystem.Planets="Our solar system has thousands of planets";


       FeatureSun featureSun = new FeatureSun();

       featureSun.temperature="2342345";
       featureSun.radius="234234"; // Now error is fixed
       featureSun.color="Yellow";


    }
}