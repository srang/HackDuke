import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jbox2d.testbed.framework.TestList;
import org.jbox2d.testbed.framework.TestbedController;
import org.jbox2d.testbed.framework.TestbedController.UpdateBehavior;
import org.jbox2d.testbed.framework.TestbedModel;
import org.jbox2d.testbed.framework.TestbedPanel;
import org.jbox2d.testbed.framework.TestbedSetting;
import org.jbox2d.testbed.framework.TestbedSetting.SettingType;
import org.jbox2d.testbed.framework.TestbedTest;
import org.jbox2d.testbed.framework.j2d.TestPanelJ2D;
import org.jbox2d.testbed.tests.BlobTest4;

public class Game_Exec {
	public static void main(String[] args) { 
		JFrame frame = new JFrame("Kung foo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		TestbedModel model = new TestbedModel();
		TestbedPanel testPanel = new TestPanelJ2D(model);
		TestbedTest game = new BlobTest4();
		model.addTest(game);
		TestList.populateModel(model);  
	    model.setDebugDraw(testPanel.getDebugDraw());
		model.getSettings().addSetting(new TestbedSetting("My Range Setting", SettingType.ENGINE, 10, 0, 20));
		TestbedController controller = new TestbedController(model,testPanel,UpdateBehavior.UPDATE_CALLED);
		panel.add((Component) testPanel);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		frame.pack();
		frame.setSize(600,600);
		frame.setVisible(true);
		controller.playTest(0);
		controller.start();

	}
}
