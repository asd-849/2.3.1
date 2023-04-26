package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import web.service.UserService;
import web.model.User;

@Controller
@RequestMapping()
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public String index(ModelMap model) {
//        model.addAttribute("user", new User());
        model.addAttribute("users", userService.getAllUsers());
        return "index";
    }

    @GetMapping("/user")
    public String show(@RequestParam Long id, ModelMap model) {
        model.addAttribute("user", userService.getUser(id));
        return "show";
    }

//    @GetMapping("/new")
//    public String newUser(@ModelAttribute("user") User user) {
//        return "new";
//    }
    @GetMapping("/new")
    public String newUser(Model model) {
        model.addAttribute("user", new User());
        return "new";
    }

    @PostMapping("/createUser")
    public String createUser(@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return "redirect:/";
    }

    @GetMapping("/edit")
    public String editUser(Model model, @RequestParam Long id) {
        model.addAttribute("user", userService.getUser(id));
        return "edit";
    }

//    @PatchMapping("/{id}")
//    public String updateUser(@ModelAttribute("user") User user, @PathVariable("id") Long id) {
//        userService.updateUserById(user, id);
//        return "redirect:/";
//    }

    @PostMapping("/edit")
    public String updateUser(@ModelAttribute("user") User user, @RequestParam Long id) {
        userService.updateUserById(user, id);
        return "redirect:/";
    }

//    @DeleteMapping("/{id}")
//    public String deleteUser(@PathVariable("id") Long id) {
//        userService.removeUserById(id);
//        return "redirect:/";
//    }

    @GetMapping("/delete")
    public String deleteUser(@RequestParam Long id) {
        userService.removeUserById(id);
        return "redirect:/";
    }
}
