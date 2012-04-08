package ui;

import javax.swing.ImageIcon;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

import constants.Conts;
import threads.CamThread;
import threads.ControllerThread;
import threads.GPSThread;
import threads.MovementThread;
import threads.Utils;
import threads.SensorThread;

/**
 * This GUI was created with Netbeans. This frame provides control feedback from buttons and joysticks,
 * has the logs for threads and GPS, and shows the camera feed
 * @author Alex
 */
public class Window extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7853538490223377933L;
	/**A handle to the {@link Utils} thread. */
	private Utils utils;
	/**A handle to the {@link MovementThread}. */
	private MovementThread moveThread;
	/**Holds the rotated {@link #icon}. */
	private RotatedIcon rIcon;
	/**Holds the pure image from the camera. */
	private ImageIcon icon;

	/**Holds the progress bars to display GPS signal strength. */
	private JProgressBar[] satsSnr = new JProgressBar[6];
	/**Holds the labels for the PNR number from the GPS satellites. */
	private JLabel[] satsPrn = new JLabel[6];

	/**
	 * Creates new form Window
	 */
	public Window() {
		initComponents();

		satsSnr[0] = satProgress1;
		satsSnr[1] = satProgress2;
		satsSnr[2] = satProgress3;
		satsSnr[3] = satProgress4;
		satsSnr[4] = satProgress5;
		satsSnr[5] = satProgress6;

		satsPrn[0] = satProgress1Label;
		satsPrn[1] = satProgress2Label;
		satsPrn[2] = satProgress3Label;
		satsPrn[3] = satProgress4Label;
		satsPrn[4] = satProgress5Label;
		satsPrn[5] = satProgress6Label;

		new CamThread(this);
		new ControllerThread(this);
		new GPSThread(this);
		utils = new Utils(this);
		new MovementThread(this);
		new SensorThread(this);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {
		java.awt.GridBagConstraints gridBagConstraints;

		jPanel1 = new javax.swing.JPanel();
		jLabel19 = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		jPanel10 = new javax.swing.JPanel();
		jPanel7 = new javax.swing.JPanel();
		brakeProgress = new javax.swing.JProgressBar();
		jLabel2 = new javax.swing.JLabel();
		jPanel6 = new javax.swing.JPanel();
		steeringSlider = new javax.swing.JSlider();
		jLabel1 = new javax.swing.JLabel();
		jPanel8 = new javax.swing.JPanel();
		accelProgress = new javax.swing.JProgressBar();
		jLabel3 = new javax.swing.JLabel();
		jPanel3 = new javax.swing.JPanel();
		jPanel16 = new javax.swing.JPanel();
		satProgress6 = new javax.swing.JProgressBar();
		jPanel14 = new javax.swing.JPanel();
		satProgress6Label = new javax.swing.JLabel();
		jPanel17 = new javax.swing.JPanel();
		satProgress5 = new javax.swing.JProgressBar();
		satProgress5Label = new javax.swing.JLabel();
		jPanel18 = new javax.swing.JPanel();
		satProgress4 = new javax.swing.JProgressBar();
		satProgress4Label = new javax.swing.JLabel();
		jPanel19 = new javax.swing.JPanel();
		satProgress3 = new javax.swing.JProgressBar();
		satProgress3Label = new javax.swing.JLabel();
		jPanel20 = new javax.swing.JPanel();
		satProgress2 = new javax.swing.JProgressBar();
		satProgress2Label = new javax.swing.JLabel();
		jPanel21 = new javax.swing.JPanel();
		satProgress1 = new javax.swing.JProgressBar();
		satProgress1Label = new javax.swing.JLabel();
		jLabel18 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jScrollPane3 = new javax.swing.JScrollPane();
		gpsLog = new javax.swing.JTextArea();
		jPanel22 = new javax.swing.JPanel();
		orientationZLabel = new javax.swing.JLabel();
		orientationYLabel = new javax.swing.JLabel();
		orientationXLabel = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		accelZLabel = new javax.swing.JLabel();
		accelXLabel = new javax.swing.JLabel();
		accelYLabel = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jPanel4 = new javax.swing.JPanel();
		jScrollPane2 = new javax.swing.JScrollPane();
		logTextArea = new javax.swing.JTextArea();
		enableGPSStatusCheck = new javax.swing.JCheckBox();
		enableCameraCheck = new javax.swing.JCheckBox();
		enableSensorsCheck = new javax.swing.JCheckBox();
		jLabel4 = new javax.swing.JLabel();
		jLabel17 = new javax.swing.JLabel();
		enableLocationCheck = new javax.swing.JCheckBox();
		jLabel14 = new javax.swing.JLabel();
		jPanel5 = new javax.swing.JPanel();
		image = new javax.swing.JLabel();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();
		jMenuItem1 = new javax.swing.JMenuItem();
		jMenu2 = new javax.swing.JMenu();
		jMenu3 = new javax.swing.JMenu();
		steeringMenuItem = new javax.swing.JMenuItem();
		buttonsMenuItem = new javax.swing.JMenuItem();
		drivingMenuItem = new javax.swing.JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel19.setText("Super Awesome Car Thing");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 889, Short.MAX_VALUE)
						.addContainerGap())
				);
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap())
				);

		getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

		jPanel2.setLayout(new java.awt.GridBagLayout());

		brakeProgress.setOrientation(1);

		jLabel2.setText("Brake");

		javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
		jPanel7.setLayout(jPanel7Layout);
		jPanel7Layout.setHorizontalGroup(
				jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jLabel2)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(brakeProgress, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
						.addContainerGap())
				);
		jPanel7Layout.setVerticalGroup(
				jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel7Layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(jPanel7Layout.createSequentialGroup()
										.addComponent(brakeProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, Short.MAX_VALUE)))
										.addContainerGap())
				);

		jPanel10.add(jPanel7);

		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setText("Steering");

		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
		jPanel6.setLayout(jPanel6Layout);
		jPanel6Layout.setHorizontalGroup(
				jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel6Layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(steeringSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
								.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
								.addContainerGap())
				);
		jPanel6Layout.setVerticalGroup(
				jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel6Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(steeringSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap())
				);

		jPanel10.add(jPanel6);

		accelProgress.setOrientation(1);

		jLabel3.setText("Accel.");

		javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
		jPanel8.setLayout(jPanel8Layout);
		jPanel8Layout.setHorizontalGroup(
				jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel8Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(accelProgress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jLabel3)
						.addContainerGap())
				);
		jPanel8Layout.setVerticalGroup(
				jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel8Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
						.addContainerGap())
						.addComponent(accelProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
				);

		jPanel10.add(jPanel8);

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		jPanel2.add(jPanel10, gridBagConstraints);

		getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

		jPanel16.setLayout(new javax.swing.BoxLayout(jPanel16, javax.swing.BoxLayout.Y_AXIS));

		satProgress6.setMaximum(50);
		satProgress6.setOrientation(1);
		jPanel16.add(satProgress6);

		jPanel14.setLayout(new javax.swing.BoxLayout(jPanel14, javax.swing.BoxLayout.Y_AXIS));
		jPanel16.add(jPanel14);

		satProgress6Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		satProgress6Label.setText("02");
		satProgress6Label.setAlignmentX(0.5F);
		satProgress6Label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		jPanel16.add(satProgress6Label);

		jPanel17.setLayout(new javax.swing.BoxLayout(jPanel17, javax.swing.BoxLayout.Y_AXIS));

		satProgress5.setMaximum(50);
		satProgress5.setOrientation(1);
		jPanel17.add(satProgress5);

		satProgress5Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		satProgress5Label.setText("02");
		satProgress5Label.setAlignmentX(0.5F);
		satProgress5Label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		jPanel17.add(satProgress5Label);

		jPanel18.setLayout(new javax.swing.BoxLayout(jPanel18, javax.swing.BoxLayout.Y_AXIS));

		satProgress4.setMaximum(50);
		satProgress4.setOrientation(1);
		jPanel18.add(satProgress4);

		satProgress4Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		satProgress4Label.setText("02");
		satProgress4Label.setAlignmentX(0.5F);
		satProgress4Label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		jPanel18.add(satProgress4Label);

		jPanel19.setLayout(new javax.swing.BoxLayout(jPanel19, javax.swing.BoxLayout.Y_AXIS));

		satProgress3.setMaximum(50);
		satProgress3.setOrientation(1);
		jPanel19.add(satProgress3);

		satProgress3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		satProgress3Label.setText("02");
		satProgress3Label.setAlignmentX(0.5F);
		satProgress3Label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		jPanel19.add(satProgress3Label);

		jPanel20.setLayout(new javax.swing.BoxLayout(jPanel20, javax.swing.BoxLayout.Y_AXIS));

		satProgress2.setMaximum(50);
		satProgress2.setOrientation(1);
		jPanel20.add(satProgress2);

		satProgress2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		satProgress2Label.setText("02");
		satProgress2Label.setAlignmentX(0.5F);
		satProgress2Label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		jPanel20.add(satProgress2Label);

		jPanel21.setLayout(new javax.swing.BoxLayout(jPanel21, javax.swing.BoxLayout.Y_AXIS));

		satProgress1.setMaximum(50);
		satProgress1.setOrientation(1);
		jPanel21.add(satProgress1);

		satProgress1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		satProgress1Label.setText("02");
		satProgress1Label.setAlignmentX(0.5F);
		satProgress1Label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		jPanel21.add(satProgress1Label);

		jLabel18.setText("Current Location:");

		jButton1.setText("Show");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		gpsLog.setColumns(30);
		gpsLog.setLineWrap(true);
		gpsLog.setRows(5);
		gpsLog.setWrapStyleWord(true);
		jScrollPane3.setViewportView(gpsLog);

		orientationZLabel.setText("Z:");

		orientationYLabel.setText("Y:");

		orientationXLabel.setText("X: ");

		jLabel6.setText("Orientation:");

		jLabel5.setText("Sensor data:");

		accelZLabel.setText("Z:");

		accelXLabel.setText("X:");

		accelYLabel.setText("Y:");

		jLabel10.setText("Accelerometer:");

		javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
		jPanel22.setLayout(jPanel22Layout);
		jPanel22Layout.setHorizontalGroup(
				jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel22Layout.createSequentialGroup()
						.addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel22Layout.createSequentialGroup()
										.addContainerGap()
										.addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel10))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(orientationXLabel)
														.addComponent(orientationYLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(orientationZLabel)
														.addComponent(accelXLabel)
														.addComponent(accelYLabel)
														.addComponent(accelZLabel)))
														.addGroup(jPanel22Layout.createSequentialGroup()
																.addGap(10, 10, 10)
																.addComponent(jLabel5)))
																.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);
		jPanel22Layout.setVerticalGroup(
				jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel22Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jLabel5)
						.addGap(18, 18, 18)
						.addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel6)
								.addComponent(orientationXLabel))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(orientationYLabel)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(orientationZLabel)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel10)
										.addComponent(accelXLabel))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(accelYLabel)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(accelZLabel))
				);

		jLabel7.setText("LAT: ");

		jLabel8.setText("LNG: ");

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(
				jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
								.addGroup(jPanel3Layout.createSequentialGroup()
										.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addGroup(jPanel3Layout.createSequentialGroup()
														.addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
														.addComponent(jLabel7)
														.addComponent(jLabel8)
														.addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
														.addGap(0, 0, Short.MAX_VALUE)))
														.addContainerGap())
				);
		jPanel3Layout.setVerticalGroup(
				jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jLabel7)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jLabel8)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jButton1)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(57, Short.MAX_VALUE))
				);

		getContentPane().add(jPanel3, java.awt.BorderLayout.LINE_END);

		logTextArea.setColumns(30);
		logTextArea.setEditable(false);
		logTextArea.setLineWrap(true);
		logTextArea.setRows(5);
		logTextArea.setWrapStyleWord(true);
		jScrollPane2.setViewportView(logTextArea);

		enableGPSStatusCheck.setText("Enable GPS Status");
		enableGPSStatusCheck.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				enableGPSStatusCheckActionPerformed(evt);
			}
		});

		enableCameraCheck.setText("Enable Camera");
		enableCameraCheck.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				enableCameraCheckActionPerformed(evt);
			}
		});

		enableSensorsCheck.setText("Enable Sensors");
		enableSensorsCheck.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				enableSensorsCheckActionPerformed(evt);
			}
		});

		jLabel4.setText("Utils:");

		jLabel17.setText("Status:");

		enableLocationCheck.setText("Enable Location ");
		enableLocationCheck.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				enableLocationCheckActionPerformed(evt);
			}
		});

		jLabel14.setText("SOME TEXT TO FILL SOME SPACE HERE");

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(
				jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel4Layout.createSequentialGroup()
										.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(enableGPSStatusCheck)
												.addComponent(enableLocationCheck))
												.addGap(0, 0, Short.MAX_VALUE))
												.addGroup(jPanel4Layout.createSequentialGroup()
														.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
																.addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																.addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
																.addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
																		.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(enableCameraCheck)
																				.addComponent(jLabel4)
																				.addComponent(enableSensorsCheck)
																				.addComponent(jLabel17))
																				.addGap(0, 0, Short.MAX_VALUE)))
																				.addContainerGap())))
				);
		jPanel4Layout.setVerticalGroup(
				jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jLabel4)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(enableCameraCheck)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(enableSensorsCheck)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(enableLocationCheck)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(enableGPSStatusCheck)
						.addGap(15, 15, 15)
						.addComponent(jLabel17)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
						.addContainerGap())
				);

		getContentPane().add(jPanel4, java.awt.BorderLayout.LINE_START);

		image.setMinimumSize(new java.awt.Dimension(480, 640));

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout.setHorizontalGroup(
				jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel5Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
						.addContainerGap())
				);
		jPanel5Layout.setVerticalGroup(
				jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel5Layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
						.addContainerGap())
				);

		getContentPane().add(jPanel5, java.awt.BorderLayout.CENTER);

		jMenu1.setText("File");

		jMenuItem1.setText("Exit");
		jMenu1.add(jMenuItem1);

		jMenuBar1.add(jMenu1);

		jMenu2.setText("Testing");

		jMenu3.setText("Send command");

		steeringMenuItem.setText("Steering");
		steeringMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				steeringMenuItemMouseClicked(evt);
			}
		});
		steeringMenuItem.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				steeringMenuItemActionPerformed(evt);
			}
		});
		jMenu3.add(steeringMenuItem);

		buttonsMenuItem.setText("Buttons");
		buttonsMenuItem.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonsMenuItemActionPerformed(evt);
			}
		});
		jMenu3.add(buttonsMenuItem);

		drivingMenuItem.setText("Driving");
		drivingMenuItem.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				drivingMenuItemActionPerformed(evt);
			}
		});
		jMenu3.add(drivingMenuItem);

		jMenu2.add(jMenu3);

		jMenuBar1.add(jMenu2);

		setJMenuBar(jMenuBar1);

		pack();
	}// </editor-fold>

	/**
	 * Callback on the checked-change state of the GPS check box.
	 * @param evt
	 */
	private void enableGPSStatusCheckActionPerformed(java.awt.event.ActionEvent evt) {                                                     
		if(enableGPSStatusCheck.isSelected()){
			utils.sendCommand(Conts.UtilsCodes.ENABLE_GPS_STATUS);
			PrintToLog("Enabling GPS status listening.");
		}else{
			utils.sendCommand(Conts.UtilsCodes.DISABLE_GPS_STATUS);
			PrintToLog("Disabling GPS status listening.");
		}
	}                                                    

	/**
	 * Callback on the checked-change state of the camera check box.
	 * @param evt
	 */
	private void enableCameraCheckActionPerformed(java.awt.event.ActionEvent evt) {   
		if(enableCameraCheck.isSelected()){
			utils.sendCommand(Conts.UtilsCodes.ENABLE_CAM);
			PrintToLog("Enable camera.");
		}else{
			utils.sendCommand(Conts.UtilsCodes.DISABLE_CAM);
			PrintToLog("Disabling camera.");
		}
	}                                                 

	/**
	 * Callback on the checked-change state of the sensors check box.
	 * @param evt
	 */
	private void enableSensorsCheckActionPerformed(java.awt.event.ActionEvent evt) {                                                   
		if(enableSensorsCheck.isSelected()){
			utils.sendCommand(Conts.UtilsCodes.ENABLE_SENSORS);
			PrintToLog("Enabling sensor listening.");
		}else{
			utils.sendCommand(Conts.UtilsCodes.DISABLE_SENSORS);
			PrintToLog("Disabling sensor listening.");
		}
	}                                                  

	/**
	 * Callback on the checked-change state of the location check box.
	 * @param evt
	 */
	private void enableLocationCheckActionPerformed(java.awt.event.ActionEvent evt) {                                                    
		if(enableLocationCheck.isSelected()){
			utils.sendCommand(Conts.UtilsCodes.ENABLE_GPS);
			PrintToLog("Enable location listening.");
		}else{
			utils.sendCommand(Conts.UtilsCodes.DISABLE_GPS);
			PrintToLog("Disable location listening.");
		}
	}                                                   

	/**
	 * Callback on the steering menu. Provides a way to send steering data to the client without the controller.
	 * @param evt
	 */
	private void steeringMenuItemActionPerformed(java.awt.event.ActionEvent evt) {                                                 
		float i = 9999; 
		i = Float.valueOf((String) JOptionPane.showInputDialog(null,"Enter a value (-100/100)", "Steering Value",JOptionPane.PLAIN_MESSAGE,null,null,0));
		if(i != 9999){
			recieveControllerInput(new boolean[10], new float[]{i,0}, new float[2], new float[2]);
		}
	}                                                

	/**
	 * Callback on the buttons menu. Provides a way to send button data to the client without the controller.
	 * @param evt
	 */
	private void buttonsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {                                                
		String s = (String) JOptionPane.showInputDialog(null,"Enter a 10-long CSV list of 1/0", "Steering Value",JOptionPane.PLAIN_MESSAGE,null,null,0);
		if(s != null){
			String[] parts = s.split(",");
			if(parts.length != 10){

			}else{
				boolean[] buttons = new boolean[10];
				for(int i = 0; i < 10; i++){
					String part = parts[i];
					if(part.equals("0")){
						buttons[i] = false;
					}else if(part.equals("1")){
						buttons[i] = true;
					}
				}

				recieveControllerInput(buttons, new float[2], new float[2], new float[2]);
			}
		}
	}                                               

	private void drivingMenuItemActionPerformed(java.awt.event.ActionEvent evt) {                                                
		// TODO add your handling code here:
	}                                               

	private void steeringMenuItemMouseClicked(java.awt.event.MouseEvent evt) {                                              
		// TODO add your handling code here:
	}                                             

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}
	
	/**
	 * Displays the controller information, and sends the data to the client.
	 * @param buttons - boolean[] of button values
	 * @param LStick - float[] of X/Y values from the left stick
	 * @param RStick - float[] of X/Y values from the right stick
	 * @param triggers - float[] of values from triggers. Avoid using both triggers at same time.
	 */
	public void recieveControllerInput(boolean[] buttons, float[] LStick, float[] RStick, float[] triggers) {
		accelProgress.setValue((int)(accelProgress.getMaximum() * triggers[1]));
		brakeProgress.setValue((int)(brakeProgress.getMaximum() * RStick[1]));
		steeringSlider.setValue((int) (steeringSlider.getMaximum() / 2 + (LStick[0] * steeringSlider.getMaximum() / 2)));

		moveThread.doMove(buttons, LStick, RStick, triggers);
	}

	/**
	 * Set the image to display this byte[]. Converted to an image icon, then rotated.
	 * @param byteArray - byte[] of image data.
	 */
	public void setImage(byte[] byteArray) {
		icon = new ImageIcon(byteArray);
		rIcon = new RotatedIcon(icon, RotatedIcon.Rotate.DOWN);
		image.setIcon(rIcon);
	}

	/**
	 * Post a line of information to the GPS log.
	 * @param line - The line to add to the log
	 */
	public void postToGPSLog(String line){
		gpsLog.append(line +"\n");
		gpsLog.setCaretPosition(gpsLog.getText().length());
	}

	/**
	 * Post a line of information to the log.
	 * @param string - The line of information to add to the log
	 */
	public static void PrintToLog(String string) {
		logTextArea.append(string+"\n");
		logTextArea.setCaretPosition(logTextArea.getText().length());
	}

	/**
	 * Show the sensor values in the GUI
	 * @param orientX - float orientation X value
	 * @param orientY - float orientation Y value
	 * @param orientZ - float orientation Z value
	 * @param accelX - float acceleration X value
	 * @param accelY - float acceleration Y value
	 * @param accelZ - float acceleration Z value
	 */
	public void receivedSensorValues(float orientX, float orientY, float orientZ, float accelX, float accelY, float accelZ) {
		accelXLabel.setText("X: " + accelX);
		accelYLabel.setText("Y: " + accelY);
		accelZLabel.setText("Z: " + accelZ);

		orientationXLabel.setText("X: " + orientX);
		orientationYLabel.setText("Y: " + orientY);
		orientationZLabel.setText("Z: " + orientZ);
	}

	/**
	 * Show the GPS status data in the GUI
	 * @param prn - int[] of pseudo random numbers from satellites
	 * @param snr - float[] of signal-to-noise ratios from satellites
	 * @param used - boolean[] of flags showing if the satellite was used in the lock
	 */
	public void recievedGpsStatus(int[] prn, float[] snr, boolean[] used){
		for(int i = 0; i < 6; i++){
			if(prn[i] != 255){
				satsPrn[i].setText(String.valueOf(prn[i]));
				satsSnr[i].setValue((int)snr[i]);
				if(used[i]){
					satsSnr[i].setForeground(Color.GREEN);
				}else{
					satsSnr[i].setForeground(Color.GRAY);
				}
			}
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/*
		 * Set the Nimbus look and feel
		 */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
//		try {
//			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//				if ("Nimbus".equals(info.getName())) {
//					javax.swing.UIManager.setLookAndFeel(info.getClassName());
//					break;
//				}
//			}
//		} catch (ClassNotFoundException ex) {
//			java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//		} catch (InstantiationException ex) {
//			java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//		} catch (IllegalAccessException ex) {
//			java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
//			java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//		}
		//</editor-fold>

		/*
		 * Create and display the form
		 */
		java.awt.EventQueue.invokeLater(new Runnable() {

			public void run() {
				new Window().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JProgressBar accelProgress;
	private javax.swing.JLabel accelXLabel;
	private javax.swing.JLabel accelYLabel;
	private javax.swing.JLabel accelZLabel;
	private javax.swing.JProgressBar brakeProgress;
	private javax.swing.JMenuItem buttonsMenuItem;
	private javax.swing.JMenuItem drivingMenuItem;
	private javax.swing.JCheckBox enableCameraCheck;
	private javax.swing.JCheckBox enableGPSStatusCheck;
	private javax.swing.JCheckBox enableLocationCheck;
	private javax.swing.JCheckBox enableSensorsCheck;
	private javax.swing.JTextArea gpsLog;
	private javax.swing.JLabel image;
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel19;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu2;
	private javax.swing.JMenu jMenu3;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuItem jMenuItem1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel10;
	private javax.swing.JPanel jPanel14;
	private javax.swing.JPanel jPanel16;
	private javax.swing.JPanel jPanel17;
	private javax.swing.JPanel jPanel18;
	private javax.swing.JPanel jPanel19;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel20;
	private javax.swing.JPanel jPanel21;
	private javax.swing.JPanel jPanel22;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JPanel jPanel7;
	private javax.swing.JPanel jPanel8;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane3;
	private static javax.swing.JTextArea logTextArea;
	private javax.swing.JLabel orientationXLabel;
	private javax.swing.JLabel orientationYLabel;
	private javax.swing.JLabel orientationZLabel;
	private javax.swing.JProgressBar satProgress1;
	private javax.swing.JLabel satProgress1Label;
	private javax.swing.JProgressBar satProgress2;
	private javax.swing.JLabel satProgress2Label;
	private javax.swing.JProgressBar satProgress3;
	private javax.swing.JLabel satProgress3Label;
	private javax.swing.JProgressBar satProgress4;
	private javax.swing.JLabel satProgress4Label;
	private javax.swing.JProgressBar satProgress5;
	private javax.swing.JLabel satProgress5Label;
	private javax.swing.JProgressBar satProgress6;
	private javax.swing.JLabel satProgress6Label;
	private javax.swing.JMenuItem steeringMenuItem;
	private javax.swing.JSlider steeringSlider;
	// End of variables declaration
}
