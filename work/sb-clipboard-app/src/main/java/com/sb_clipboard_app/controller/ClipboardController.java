package com.sb_clipboard_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb_clipboard_app.service.ClipboardService;

@RestController
@RequestMapping("/clipboard")
public class ClipboardController {
	
	private final ClipboardService clipboardService;

	@Autowired
    public ClipboardController(ClipboardService clipboardService) {
        this.clipboardService = clipboardService;
    }

	
    @PostMapping("/clear")
    public String clearClipboard() {
    	System.out.println("Im inside");
        clipboardService.clearClipboard();
        return "Clipboard cleared successfully";
    }
    
    @GetMapping
    public void name() {
		System.out.println("hello");
	}

}
