public abstract class Display{
        public abstract int getColumns();       //获取横向字符数
        public abstract int getRows();          //获取行数
        public abstract String getRowText(int row);    //获取第ROW行字符串

        public final void show(){                     //全部显示
                for(int i = 0; i < getRows(); i++)
                        System.out.println(getRowText(i));
        }
}
