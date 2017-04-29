import javax.swing.*;
import java.awt.*;

public class TestFigurePlus extends JFrame{
	TestFigurePlus(){
		setLayout(new GridLayout(2,4));
		add(new FigurePanelPlus(FigurePanelPlus.LINE));
		add(new FigurePanelPlus(FigurePanelPlus.RECTANGLE));
		add(new FigurePanelPlus(FigurePanelPlus.RECTANGLE,true));
		add(new FigurePanelPlus(FigurePanelPlus.OVAL));
		add(new FigurePanelPlus(FigurePanelPlus.OVAL,true));
		add(new FigurePanelPlus(FigurePanelPlus.HEXAGON,true));
		add(new FigurePanelPlus(FigurePanelPlus.HEXAGON));
		add(new FigurePanelPlus(FigurePanelPlus.ARC,true));
	}

	public static void main(String[] args){
		TestFigurePlus frame = new TestFigurePlus();

		frame.setTitle("Test Graph !");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();
	}
}
