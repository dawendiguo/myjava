import java.util.ArrayList;
import java.util.Iterator;

public abstract class NumberGenerator{
        //观察者名单
        private ArrayList<Observer> observers = new ArrayList<Observer>();
        public void addObserver(Observer observer){       //增加观察者
                observers.add(observer);
        }

        public void deleteObserver(Observer observer){    //删除观察者
                observers.remove(observer);
        }

        public void notifyObservers(){                    //通知所有观察者
                Iterator it = observers.iterator();
                while(it.hasNext()){
                        Observer o = (Observer)it.next();
                        o.update(this);                       //观察都更新操作
                }
        }

        public abstract int getNumber();                 //获取数值
        public abstract void execute();                   //生成数值

}
