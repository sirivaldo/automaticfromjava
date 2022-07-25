
import static com.oracle.webservices.internal.api.databinding.DatabindingModeFeature.builder;
import static com.oracle.webservices.internal.api.databinding.ExternalMetadataFeature.builder;
import java.io.File;
import static java.util.stream.DoubleStream.builder;
import static java.util.stream.IntStream.builder;
import static java.util.stream.Stream.builder;
import org.eclipse.jgit.api.AddCommand;
import org.eclipse.jgit.api.CommitCommand;
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
  Git git = Git.open(new File(".git"));

System.out.println("Repository: " + git.getRepository().toString());
/*
RevCommit rev = git.commit().setAmend(true)
               .setAuthor("me", "me@mail.com")
               .setMessage("Testing commit from jGit").call();

git.close();
*/



//Git git = new Git(repository);
AddCommand add = git.add();

add = git.add();
  
//git.add().addFilepattern("C:/gitfromjava/siri.txt").call();
//add.addFilepattern("C:/gitfromjava/siri.txt").call();
//add.addFilepattern("siri.txt").call();
add.addFilepattern(".").call();

CommitCommand commit = git.commit();
commit.setMessage("Adding changes1.").call();
//git.push().call();
git.close();
//testando
              }
      
      
      
    
}
