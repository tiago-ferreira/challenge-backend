package br.com.challenge.backend.controller.controller;

import br.com.challenge.backend.controller.model.Item;
import br.com.challenge.backend.controller.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping
    public List<Item> findItems(@RequestParam("begindate") String beginDate, @RequestParam("finaldate") String finalDate) {
        return itemService.findItems(beginDate, finalDate);
    }
}
