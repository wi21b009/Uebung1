package at.jahodinsky.uebung1;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UptimeController {

    @RequestMapping("/up")
    public String uptime(@RequestParam double a) {
        double MinutesPerMonth = 30 * 24 * 60;
        double uptimePerMonth = MinutesPerMonth * (a / 100);

        return String.format("uptime per month in minutes: %.2f", uptimePerMonth);
    }
}
