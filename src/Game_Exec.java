import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import org.jbox2d.testbed.framework.TestList;
import org.jbox2d.testbed.framework.TestbedController;
import org.jbox2d.testbed.framework.TestbedController.UpdateBehavior;
import org.jbox2d.testbed.framework.TestbedModel;
import org.jbox2d.testbed.framework.TestbedPanel;
import org.jbox2d.testbed.framework.TestbedSetting;
import org.jbox2d.testbed.framework.TestbedSetting.SettingType;
import org.jbox2d.testbed.framework.TestbedTest;
import org.jbox2d.testbed.framework.j2d.TestPanelJ2D;

import physics.FighterTestbedTest;


public class Game_Exec {
	//	public static void main(String[] args) { 
	//		final JFrame frame = new JFrame("Kung foo");
	//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//		final JPanel contentPanel = new JPanel();
	//		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
	//		contentPanel.setLayout(new BorderLayout(0, 0));
	//		frame.setContentPane(contentPanel);
	//		
	//		JPanel welcomePanel = new JPanel();
	//		contentPanel.add(welcomePanel, BorderLayout.CENTER);
	//		welcomePanel.setLayout(null);
	//		
	//		
	//		JButton btnNewButton = new JButton("Play");
	//		btnNewButton.addActionListener(new ActionListener() {
	//			public void actionPerformed(ActionEvent arg0) {
	//				TestbedModel model = new TestbedModel();
	//				TestbedPanel testPanel = new TestPanelJ2D(model);
	//				TestbedTest game = new FighterTestbedTest();
	//				model.addTest(game);
	//				TestList.populateModel(model);  
	//			    model.setDebugDraw(testPanel.getDebugDraw());
	//				model.getSettings().addSetting(new TestbedSetting("My Range Setting", SettingType.ENGINE, 10, 0, 20));
	//				TestbedController controller = new TestbedController(model,testPanel,UpdateBehavior.UPDATE_CALLED);
	//				contentPanel.add((Component) testPanel, BorderLayout.CENTER);
	//				controller.playTest(0);
	//				controller.start();
	//			
	//			}
	//		});
	//		btnNewButton.setHorizontalAlignment(SwingConstants.CENTER);
	//		btnNewButton.setBounds(190,100, 60,60);
	//		btnNewButton.setBackground(Color.LIGHT_GRAY);
	//		welcomePanel.add(btnNewButton);
	//		contentPanel.add(welcomePanel, BorderLayout.CENTER);
	//		frame.pack();
	//		frame.setSize(600,600);
	//		frame.setVisible(true);
	//	}

	public static void main(String[] args) { 
		JFrame frame = new JFrame("Kung foo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TestbedModel model = new TestbedModel();
		TestbedPanel testPanel = new TestPanelJ2D(model);
		TestbedTest game = new FighterTestbedTest();
		model.addTest(game);
		TestList.populateModel(model);  
		model.setDebugDraw(testPanel.getDebugDraw());
		model.getSettings().addSetting(new TestbedSetting("My Range Setting", SettingType.ENGINE, 10, 0, 20));
		TestbedController controller = new TestbedController(model,testPanel,UpdateBehavior.UPDATE_CALLED);
		frame.add((Component) testPanel, BorderLayout.CENTER);
		controller.playTest(0);
		controller.start();
		frame.pack();
		frame.setSize(600,600);
		frame.setVisible(true);
	}
}
