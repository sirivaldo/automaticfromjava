/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gitfromjava;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.eclipse.jgit.api.Git;

/**
 *
 * @author pibos
 */
public class TestandoGit {
 
    
    
    
    
    
    
    
              public static void main(String[] args) throws Exception {      
                  
                  Path path = Paths.get("C:/gitfromjava.java"); 
 
           Files.readAllLines(path, StandardCharsets.UTF_8);
                  //Git git = Git.init().setDirectory("/path/to/repo").call();
                  //   Git git = Git.init().setDirectory().call();  
              }
    
    
}
