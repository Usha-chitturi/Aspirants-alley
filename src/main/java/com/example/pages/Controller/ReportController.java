package com.example.pages.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
@RequestMapping
public class ReportController {

    @GetMapping("/report")
    public String showReportPage() {
        return "report"; // The name of the HTML template for the report page
    }

    @PostMapping
    public String handleReport(
            @RequestParam("username") String username,
            @RequestParam("content") String content,
            Model model) {
        // Handle the report submission here (e.g., save to a database, send an email, etc.)

        // Add attributes to the model if needed
        model.addAttribute("message", "Report submitted successfully");

        // Redirect or show a confirmation page
        return "redirect:/posts"; // You might need to create a success page or redirect accordingly
    }
}
