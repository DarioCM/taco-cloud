package dev.dario.tacocloud.controller;


import dev.dario.tacocloud.entity.TacoOrder;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

/**
 * The selected code consists of four annotations used in a Spring Boot controller class:
 *
 * - `@Slf4j`: This annotation from Lombok generates a logger field in the class, allowing you to log messages using `log.info()`, `log.error()`, etc.
 *
 * - `@Controller`: This annotation marks the class as a Spring MVC controller, making it capable of handling web requests.
 *
 * - `@RequestMapping("/orders")`: This annotation maps HTTP requests to `/orders` to the methods in this controller.
 *
 * - `@SessionAttributes("tacoOrder")`: This annotation indicates that the `tacoOrder` attribute should be stored in the session, allowing it to be accessed across multiple requests.
 *
 * ```java
 * @Slf4j
 * @Controller
 * @RequestMapping("/orders")
 * @SessionAttributes("tacoOrder")
 * ```
 * */

@Slf4j
@Controller
@RequestMapping("/orders")
@SessionAttributes("tacoOrder")
public class OrderController {

    @GetMapping("/current")
    public String orderForm() {
        return "orderForm";
    }


    @PostMapping
    public String processOrder(
            @Valid TacoOrder order,
            Errors errors,
            SessionStatus sessionStatus) {

        if (errors.hasErrors()) {
            return "orderForm";
        }

        log.info("Order submitted: {}" , order);
        sessionStatus.setComplete(); // xlean the session data for tacoorder bean
        return "redirect:/";
    }


}
