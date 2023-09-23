package org.launchcode.skillstracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

//    @GetMapping("/")
//    @ResponseBody
//    public String renderHomePage(){
//        return "Welcome to the page";
//    }

    @GetMapping("/")
    @ResponseBody
    public String skillTracker() {
        return "<h1>Skills Tracker</h1>" +
                "<h2>Three program languages</h2>" + "<ol>" +
                "<li>Java</li>" + "<li>JavaScript</li>" + "<li>C#</li>" + "</ol>" +
                "<p>Click <a href='/form'> here </a> to pick your favourite language</p>";
    }

    @GetMapping("/form") //GetMapping L24 and PostMapping L43 have the same route
    @ResponseBody
    public String form() {
        return "<html>" +
                "<body>" +
                "<form action='/result' method='POST'>" +
                "Name: <input name='name' type='text'><br/>" +
                "<label for='firstLanguage'>My 1st favorite language: </label>" +
                "<select name='firstLanguage'>" +
                    "<option>JavaScript</option>" +
                    "<option>Java</option>" +
                    "<option>C#</option>" +
                "</select><br/>" +

                "<label for='secondLanguage'>My 2nd favorite language: </label>" +
                "<select name='secondLanguage'>" +
                    "<option>JavaScript</option>" +
                    "<option>Java</option>" +
                    "<option>C#</option>" +
                "</select><br/>" +

                "<label for='thirdLanguage'>My 3rd favorite language: </label>" +
                "<select name='thirdLanguage'>" +
                    "<option>JavaScript</option>" +
                    "<option>Java</option>" +
                    "<option>C#</option>" +
                "</select><br/>" +

                "<input type='submit' value='submit'>" +

                "</form>" +
                "</body>" +
                "</html>"
                ;
    }

    @PostMapping("/result")
    @ResponseBody
    public String processSkillsForm(@RequestParam String name, String firstLanguage, String secondLanguage, String thirdLanguage) {
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<h3>Favourite Language</h3>" +
//                "<ol>" +
//                "<li>" + firstLanguage + "</li>" +
//                "<li>" + secondLanguage + "</li>" +
//                "<li>" + thirdLanguage + "</li>" +
//                "</ol>" +
                "<table>" +
                "<tr>" +
                "<td> 1 </td>"+
                "<td>" + firstLanguage + "</td>" +
                "</tr>" +

                "<tr>" +
                "<td> 2 </td>"+
                "<td>" + secondLanguage + "</td>" +
                "</tr>" +

                "<tr>" +
                "<td> 3 </td>"+
                "<td>" + thirdLanguage + "</td>" +
                "</tr>" +

                "</table>" +
                "</body>" +
                "</html>" ;
        }



    }

}
