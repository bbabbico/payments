package projectweb.payments.Controller_static;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import projectweb.payments.OdersRepository;
import projectweb.payments.Orders;

@Slf4j
@RequiredArgsConstructor
@Controller
public class homeController {

    private final OdersRepository ordersRepository;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @ResponseBody
    @PostMapping("/successful")
    public String successful(@RequestBody Orders orders) {
        System.out.println(orders.toString());
        ordersRepository.save(orders);
        return "successful";
    }

}
