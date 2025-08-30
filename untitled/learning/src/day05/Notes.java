package day05;

import java.time.ZoneId;
import java.util.Set;
import java.time.Instant;
public class Notes {

    public static void main(String[] args) {
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds.size());
        //System.out.println(zoneIds);


        Instant now = Instant.now();
        System.out.println( now);
        Instant instant1 = Instant.ofEpochMilli(0L);
        System.out.println(instant1);
    }
}

