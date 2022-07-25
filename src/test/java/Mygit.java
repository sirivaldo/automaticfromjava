
import java.io.File;
import org.eclipse.jgit.api.AddCommand;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pibos
 */
public class Mygit {
    
      public static void main(String[] args) throws Exception {                  
               FileRepositoryBuilder builder = new FileRepositoryBuilder();
Repository repository = builder.setGitDir(new File("/gitfromjava"))
  .readEnvironment() // scan environment GIT_* variables
  .findGitDir() // scan up the file system tree
  .build();

Git git = new Git(repository);
AddCommand add = git.add();
add.addFilepattern("/gitfromjavay").call();
              }
      
      
      
    
}
