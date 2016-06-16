import javax.swing.JOptionPane;

public class MonthDay{
	public static void main(String[] args){
		String yearString = JOptionPane.showInputDialog("年份","请输入是那一年");
		String monthString = JOptionPane.showInputDialog("月份","请输入是那一个月");
		int year = Integer.parseInt(yearString);
		int month = Integer.parseInt(monthString);
		switch(month){
		case 1:
			
			JOptionPane.showMessageDialog(null,year+"年"+month+"月有31天");
			break;
		case 3:
			JOptionPane.showMessageDialog(null,year+"年"+month+"月有31天");
			break;
		case 4:
			JOptionPane.showMessageDialog(null,year+"年"+month+"月有30天");
			break;
		case 5:
			JOptionPane.showMessageDialog(null,year+"年"+month+"月有31天");
			break;
		case 6:
			JOptionPane.showMessageDialog(null,year+"年"+month+"月有30天");
			break;

		case 7:
			JOptionPane.showMessageDialog(null,year+"年"+month+"月有31天");
			break;
		case 8:
			JOptionPane.showMessageDialog(null,year+"年"+month+"月有31天");
			break;
		case 9:
			JOptionPane.showMessageDialog(null,year+"年"+month+"月有30天");
			break;
		case 10:
			JOptionPane.showMessageDialog(null,year+"年"+month+"月有31天");
			break;
		case 11:
			JOptionPane.showMessageDialog(null,year+"年"+month+"月有30天");
			break;
		case 12:
			JOptionPane.showMessageDialog(null,year+"年"+month+"月有31天");
			break;
		case 2:
			if((year%4==0&&year%100!=0)||(year%400==0))
			{
			JOptionPane.showMessageDialog(null,year+"年"+month+"月有29天");
			break;
			}
			else{
			JOptionPane.showMessageDialog(null,year+"年"+month+"月有28天");
			break;
			}
		default:
			JOptionPane.showMessageDialog(null,"输入的月份不正确，程序结束");
			break;
		}
	}
}

