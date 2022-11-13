import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class ErrMsgLog {
    private static ArrayList<Exception> ErrList;
    private static Logger log;

    //private static FileHandler errhnd;
    public ErrMsgLog() throws IOException {
        ErrList = new ArrayList<>();
//Читаем конфигурационный файл лога
        LogManager.getLogManager().readConfiguration(ErrMsgLog.class.getResourceAsStream("settings.ini"));
        log = Logger.getLogger(ErrMsgLog.class.getName());
    }

    //Добавляем ошибку в список ошибок
    public void addErr(Exception e) {
        ErrList.add(e);
    }
    public void addErrWithLog(Exception e) {
        ErrList.add(e);
//Код записи сообщения в лог
        log.log(Level.FINE, e.getMessage());
    }
    //Получаем количество ошибок
    public int getErrCount() {
        return ErrList.size();
    }
    //Выводим информацию об ошибке
    public void showErrText(Exception e) {
        System.err.println(e.getMessage());
    }
    //Генерим (пробрасываем ошибку) с фиксацией в списке ошибок
    public Exception makeErr(Exception e) {
        addErr(e);
        return new Exception(e);
    }
}
