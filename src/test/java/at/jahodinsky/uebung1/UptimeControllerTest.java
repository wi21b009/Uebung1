package at.jahodinsky.uebung1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UptimeControllerTest {

    UptimeController uptimeController = new UptimeController();

    @Test
    void uptimeTest1() {
        assertEquals(String.format("uptime per month in minutes: 21600.00"), uptimeController.uptime(50.0));
    }

}