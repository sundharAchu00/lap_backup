package com.sb_clipboard_app.service;
 
import org.springframework.stereotype.Service;
 
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
 
@Service
public class ClipboardService {
 
    public void clearClipboard() {
        try {
            if (GraphicsEnvironment.isHeadless()) {
                System.out.println("Headless environment detected. Clipboard operations are not supported.");
                return;
            }
 
            System.setProperty("java.awt.headless", "false");
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            StringSelection emptySelection = new StringSelection("");
            clipboard.setContents(emptySelection, (clipboard1, contents) ->{
            	
            });
        } catch (HeadlessException e) {
            System.out.println("Caught HeadlessException: " + e.getMessage());
            // Handle headless exception if necessary
        }
    }
}