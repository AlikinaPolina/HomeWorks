import data.ArrayDb;
import data.Db;
import data.DbException;
import utils.ConsoleInteractor;
import utils.UserInteractor;
import utils.UserInteractorReadException;
import utils.UserInteractorWriteException;

import java.util.Arrays;

/**
 *
 * Note Book. UserInteractor and DB modules.
 * @author Alexander Ferenets (Istamendil) <ist.kazan@gmail.com>
 * 
 * Code for studying purposes. Programming course. Kazan Federal University, ITIS.
 * http://study.istamendil.info/
 */
public class App extends Application{
  
  private static final String DB = "/tmp/db.txt";
  private static final String PUNCH_CARD = "/tmp/card.txt";
  
  protected UserInteractor terminal;
  protected Db db;

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    App app = new App(args);
  }

  public App(String[] args) {
    super(args);
  }

  @Override
  public void init() {
    this.terminal = new ConsoleInteractor();
    this.db = new ArrayDb();
  }

  @Override
  public void start() {
    try {
      String command;
      while((command = this.terminal.readCommand()) != null){
        switch(command){
          case "readAll":
            this.terminal.print(Arrays.toString(this.db.findAll()));
            break;
          case "save":
            if((command = this.terminal.readCommand()) != null){
              this.db.save(command);
            }
            break;
          default:
            this.terminal.print("Unkown command");
        }
//        this.terminal.print(command);
      }
    } catch (UserInteractorReadException ex) {
      System.out.println("Can't read user input due error:");
      System.err.println(ex.getMessage());
      System.exit(1);
    } catch (UserInteractorWriteException ex) {
      System.out.println("Can't print data to user due error:");
      System.err.println(ex.getMessage());
      System.exit(1);
    } catch (DbException ex) {
      System.err.println(ex.getMessage());
      System.exit(1);
    }
  }
  
}
