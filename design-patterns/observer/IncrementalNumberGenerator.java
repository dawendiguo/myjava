public class IncrementalNumberGenerator extends NumberGenerator{
        int start,step,end,current;
        
        public IncrementalNumberGenerator(int start,int end,int step){
                this.start = start;
                this.step = step;
                this.end = end;
                this.current = start;
        }

        public int getNumber(){
                return current;
        }

        public void execute(){
                for(current = start;current < end;current = current + step){
                        notifyObservers();
                }
        }
}
