package day32_arrays_split;
import java.util.*;


public class AWSZones {
    public static void main(String[] args) {

        String app = "etsy";
        String zones = "us-east-1,us-west-2,us-west-1";

        System.out.println("-----Starting deployment of etsy app to AWS zones-----");
        String[] zonesToDeploy = zones.split(",");
        for(String eachZone: zonesToDeploy) {
            System.out.println("Deploying [" + app + "] to " + eachZone + "...");
            System.out.println("Deployment of [" + app + "] to " + eachZone + " is completed\n");
        }
        System.out.println("---ALL DEPLOYMENTS COMPLETE, TRAFFIC ENABLED---");



    }
}
