import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class Files
{
    public static void SaveToFile(String FileName, int count, boolean Update, ArrayList<Transport> transports) throws
            java.io.IOException {
        boolean Result = false;
        FileWriter dataOut = null;
        try {
            dataOut = new FileWriter(FileName, Update);
            long _addtime = 0;
            dataOut.append(Date.StartgetDate()).append("\n");
            for(int i = 0; i < count; i++)
            {
                Transport transport = new Transport("bmw x6", i+1, new Radio("europa plus", true));
                long time = System.nanoTime();
                transports.add(transport);
                long time1 = System.nanoTime() - time;
                _addtime += time1;
                dataOut.append("ADD, ID = ").append(String.valueOf(i + 1)).append("   ").append(String.valueOf(time1)).append(" ns").append("\n");
            }
            dataOut.append("addTotalTime: ").append(String.valueOf(_addtime)).append(" ns").append("\n");
            dataOut.append("addMedianTime: ").append(String.valueOf(_addtime / count)).append(" ns").append("\n");

            long _removetime = 0;
            for(int i = 0; i < count/10; i++)
            {
                while(true)
                {
                    int a = (int)(Math.random()*(count-i));
                    if(transports.get(a) != null)
                    {
                        long time = System.nanoTime();
                        transports.remove(transports.get(a));
                        long time1 = System.nanoTime() - time;
                        _removetime += time1;
                        dataOut.append("REMOVE, ID = ").append(String.valueOf((a+1))).append("   ").append(String.valueOf(time1)).append(" ns").append("\n");
                        break;
                    }
                }
            }
            dataOut.append("removeTotalTime: ").append(String.valueOf(_removetime )).append(" ns").append("\n");
            dataOut.append("removeMedianTime: ").append(String.valueOf(_removetime / count)).append(" ns").append("\n");
            dataOut.append(Date.FinishgetDate());
            Result = true;
        } catch (IOException e) {
            ErrMsgLog myerr = new ErrMsgLog();
            myerr.addErrWithLog(e); //Добавляем ошибку в список и пишем в лог без отображения в консоли
            myerr.showErrText(e);
        } finally {
            assert dataOut != null;
            dataOut.close();
        }
    }

    public static void SaveToFile(String FileName, int count, boolean Update, LinkedList<Transport> transports) throws
            java.io.IOException {
        boolean Result = false;
        FileWriter dataOut = null;
        try {
            dataOut = new FileWriter(FileName, Update);
            long _addtime = 0;
            dataOut.append(Date.StartgetDate()).append("\n");
            for(int i = 0; i < count; i++)
            {
                Transport transport = new Transport("bmw x6", i+1, new Radio("europa plus", true));
                long time = System.nanoTime();
                transports.add(transport);
                long time1 = System.nanoTime() - time;
                _addtime += time1;
                dataOut.append("ADD, ID = ").append(String.valueOf(i + 1)).append("   ").append(String.valueOf(time1)).append(" ns").append("\n");
            }
            dataOut.append("addTotalTime: ").append(String.valueOf(_addtime)).append(" ns").append("\n");
            dataOut.append("addMedianTime: ").append(String.valueOf(_addtime / count)).append(" ns").append("\n");

            long _removetime = 0;
            for(int i = 0; i < count/10; i++)
            {
                while(true)
                {
                    int a = (int)(Math.random()*(count-i));
                    if(transports.get(a) != null)
                    {
                        long time = System.nanoTime();
                        transports.remove(transports.get(a));
                        long time1 = System.nanoTime() - time;
                        _removetime += time1;
                        dataOut.append("REMOVE, ID = ").append(String.valueOf((a+1))).append("   ").append(String.valueOf(time1)).append(" ns").append("\n");
                        break;
                    }
                }
            }
            dataOut.append("removeTotalTime: ").append(String.valueOf(_removetime )).append(" ns").append("\n");
            dataOut.append("removeMedianTime: ").append(String.valueOf(_removetime / count)).append(" ns").append("\n");
            dataOut.append(Date.FinishgetDate());
            Result = true;
        } catch (IOException e) {
            ErrMsgLog myerr = new ErrMsgLog();
            myerr.addErrWithLog(e); //Добавляем ошибку в список и пишем в лог без отображения в консоли
            myerr.showErrText(e);
        } finally {
            assert dataOut != null;
            dataOut.close();
        }
    }




}
