package Unit_Conversion;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
@SuppressWarnings("serial")
public class frame_UnitConversion  extends JFrame implements ActionListener{



		Toolkit toolkit =this.getToolkit();
		Dimension size =toolkit.getScreenSize();
		JComboBox<String> cb =new JComboBox<String>();
		JLabel inputlbl =new JLabel("From :");
		JComboBox<String> cb1 =new JComboBox<String>();
		JComboBox<String> cb2 =new JComboBox<String>();
		JTextField input =new JTextField();
		//JTextField output =new JTextField();
		JLabel select =new JLabel("Select Unit To Convert ");
		JLabel Unit =new JLabel("Select Unit Converter ");
		JLabel outputlbl =new JLabel("To :");
		JButton New= new JButton("New");
		JButton Convert= new JButton("Convert");
		JLabel output = new JLabel();
		JPanel opt =new JPanel();
		ImageIcon img = new ImageIcon(new ImageIcon("img.png").getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH));
		JLabel bg = new JLabel("", img, JLabel.CENTER);
		//JPanel opt =new JPanel();
		
		frame_UnitConversion (){
			 
			 this.setSize(400,400);
			 this.setTitle("UNIT_CONVERSION");
			 this.setLocation(size.width/2-this.getWidth()/2,size.height/2-this.getHeight()/2);
			 this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			 this.setResizable(false);
			 bg.setBounds(0, 0, 400, 400);
			 
			 Unit.setBounds(80, 10, 300, 60);
			 Unit.setFont(new Font("Times To New Roman", Font.BOLD, 20));
			 
			 select.setBounds(80, 90, 300, 60);
			 select.setFont(new Font("Times To New Roman", Font.BOLD, 20));
			 
			 
			 cb.setBounds(100, 60, 170, 30);
			 cb.setFocusable(false);
			 cb.addItem("Select Unit To Convert");
			 cb.addItem("Length");
			 cb.addItem("Temperature");
			 cb.addItem("Time");
			 cb.addItem("Weight");

			 
			 inputlbl.setBounds(20, 150, 140, 30);
			 input.setBounds(20, 180, 140, 30);
			 
			 outputlbl.setBounds(210, 150, 140, 30);
			// output.setBounds(210, 180, 140, 30);
			//output.setEnabled(false);	
			// opt.setBounds(210, 180, 140, 30);
			// opt.setBackground(Color.WHITE);
			// opt.setForeground(Color.BLACK);
			//output.setFont(new Font("Calibri", Font.BOLD, 20));
			opt.setBounds(210, 180, 140, 30);
			opt.setBackground(Color.WHITE);
			opt.setBorder(BorderFactory.createLineBorder(Color.GRAY,1));
				 
			output.setBounds(215, 180, 140, 30);
			output.setForeground(Color.BLACK);
			 
			 cb1.setBounds(20, 220, 140, 30);
			 cb1.setFocusable(false);
			 
			 cb2.setBounds(210, 220, 140, 30);
			 cb2.setFocusable(false);
			 
			 Convert.setBounds(20, 280, 140, 30);
			 Convert.setFocusable(false);
			 
			 New.setBounds(210, 280, 140, 30);
			 New.setFocusable(false);
			 
			 this.add(New);
			 this.add(Convert);
			 this.add(Unit);
			 this.add(select);
			 this.add(input);
			 this.add(inputlbl);
			 this.add(outputlbl);
			 this.add(cb);
			 this.add(cb1);
			 this.add(cb2);
			 this.add(output);
			 this.add(opt);
			 this.add(bg);
			 this.setLayout(null);
			 this.setVisible(true);
			 cb.addActionListener(this);
			 New.addActionListener(this);
			 Convert.addActionListener(this);
		 }

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		
			String selectedInput = (String) cb.getSelectedItem();
			String inputUnit = (String) cb1.getSelectedItem();
	        String outputUnit = (String) cb2.getSelectedItem();

			 if (e.getSource()==cb) {
		
			 
			 cb1.removeAllItems();
			 cb2.removeAllItems();

			 if (selectedInput.equals("Length")) {
					cb1.addItem("Millimeter");
					cb1.addItem("Centimeter");
					cb1.addItem("Meter");
					cb1.addItem("Kilometer");
					cb1.addItem("Mile(s)");
					cb1.addItem("Yard");
					cb1.addItem("Foot");
					cb1.addItem("Inch(s)");
					
					
					cb2.addItem("Millimeter");
					cb2.addItem("Centimeter");
					cb2.addItem("Meter");
					cb2.addItem("Kilometer");
					cb2.addItem("Mile(s)");
					cb2.addItem("Yard");
					cb2.addItem("Foot");
					cb2.addItem("Inch(s)");
					
					
				
		        }
			 else if (selectedInput.equals("Weight")){
		        	
		        	cb1.addItem("Miligram(s)");
					cb1.addItem("Gram(s)");
					cb1.addItem("Kilogram(s)");
					cb1.addItem("Pound(s)");
					cb1.addItem("Ounce(s)");
					
					cb2.addItem("Miligram(s)");
					cb2.addItem("Gram(s)");
					cb2.addItem("Kilogram(s)");
					cb2.addItem("Pound(s)");
					cb2.addItem("Ounce(s)");
					
		        }
		        else if(selectedInput.equals("Temperature")) {
		        	cb1.addItem("Celsius");
					cb1.addItem("Fahrenheit");
					cb1.addItem("Kelvin");
					
					cb2.addItem("Celsius");
					cb2.addItem("Fahrenheit");
					cb2.addItem("Kelvin");
					
					
			       }
		        else if (selectedInput.equals("Time")) {
			    	   
			    	   cb1.addItem("Milisecond(s)");
						cb1.addItem("Second(s)");
						cb1.addItem("Minute(s)");
						cb1.addItem("Hour(s)");
						cb1.addItem("Day(s)");
						cb1.addItem("Week(s)");
						cb1.addItem("Month(s)");
						cb1.addItem("Year(s)");
						
						
						cb2.addItem("Milisecond(s)");
						cb2.addItem("Second(s)");
						cb2.addItem("Minute(s)");
						cb2.addItem("Hour(s)");
						cb2.addItem("Day(s)");
						cb2.addItem("Week(s)");
						cb2.addItem("Month(s)");
						cb2.addItem("Year(s)");
							
		        }
			    	   
			       }
			 	
			 
			 	if (e.getSource()==New){
			 		output.setText("");
			 		input.setText("");
			 		cb1.removeAllItems();
			 		cb2.removeAllItems();
			 		
			 	}
			 	
			 	
			 	//LENGTH
			 	 ///METER COMPUTATION
			 
			 	
				if(e.getSource()==Convert){
					String in= input.getText();
				 	/*if (in == "") {
				 		JOptionPane.showMessageDialog(this, "Please Enter a valid number ");
				 	}else {*/
					if (!isNumeric(in)) {
						JOptionPane.showMessageDialog(this, "Please Enter a valid number ","title",JOptionPane.ERROR_MESSAGE);
						return;
					}
			 	
					double inputValue = Double.parseDouble(input.getText());
			         double outputValue = 0.0;
					  
			            if (inputUnit.equals("Meter")) {
			            	
			                if (outputUnit.equals("Centimeter")) {
			                	
			                    outputValue = inputValue * 100.0;
			                    output.setText(String.format("%.8f", outputValue));
			                } 
			                else if (outputUnit.equals("Meter")) {
			                	 outputValue = inputValue;
			                	 output.setText(String.format("%.0f", outputValue));	
			                }
			                
			                else if (outputUnit.equals("Inch(s)")) {
			                	
			                    outputValue = inputValue * 39.3700787;
			                    output.setText(String.format("%.8f", outputValue));
			                    
			                }
			                else if (outputUnit.equals("Millimeter")) {
			                	 outputValue = inputValue * 1000;
			                	  output.setText(String.format("%.8f", outputValue));
			                }
			                else if (outputUnit.equals("Kilometer")) {
			                	 outputValue = inputValue * 0.001;
			                	  output.setText(String.format("%.8f", outputValue));
			                }
			                else if (outputUnit.equals("Mile(s)")) {
			                	 outputValue = inputValue * 0.0006214;
			                	  output.setText(String.format("%.8f", outputValue));
			                }
			                else if (outputUnit.equals("Yard")) {
			                	 outputValue = inputValue * 1.0936133;
			                	  output.setText(String.format("%.8f", outputValue));
				                    
			                } else if (outputUnit.equals("Foot")) {
			                	 outputValue = inputValue * 3.2808399;
			                	  output.setText(String.format("%.8f", outputValue));
			                }
			            }
				}
				 ///Centimeter COMPUTATION
				 if (e.getSource() == Convert){
					 double inputValue = Double.parseDouble(input.getText());
			         double outputValue = 0;

			    	   if (inputUnit.equals("Centimeter")) {
			    		   if (outputUnit.equals("Centimeter")) {
			                	
			                    outputValue = inputValue;
			                    output.setText(String.format("%.0f", outputValue));	
			                } 
			            	
			                if (outputUnit.equals("Meter")) {
			                	
			                    outputValue = inputValue * 0.01;
			                    output.setText(String.format("%.8f", outputValue));
			                } 
			                
			                else if (outputUnit.equals("Inch(s)")) {
			                	
			                    outputValue = inputValue * 0.393700787;
			                    output.setText(String.format("%.8f", outputValue));
			                    
			                }
			                else if (outputUnit.equals("Millimeter")) {
			                	 outputValue = inputValue * 10;
				                    output.setText(String.format("%.8f", outputValue));
			                }
			                else if (outputUnit.equals("Kilometer")) {
			                	 outputValue = inputValue * 0.00001;
				                    output.setText(String.format("%.8f", outputValue));
			                }
			                else if (outputUnit.equals("Mile(s)")) {
			                	 outputValue = inputValue * 0.0006214;
				                    output.setText(String.format("%.8"
				                    		+ "f", outputValue));
			                }
			                else if (outputUnit.equals("Yard)")) {
			                	 outputValue = inputValue * 1.0936133;
				                    output.setText(String.format("%.8f", outputValue));
				                    
			                } else if (outputUnit.equals("Foot")) {
			                	 outputValue = inputValue * 0.032808399;
				                    output.setText(String.format("%.8f", outputValue));
			                }
			                
			                
			                }
				 	}
				 ///Millimeter COMPUTATION
				 if (e.getSource() == Convert){
					 double inputValue = Double.parseDouble(input.getText());
			         double outputValue = 0;
				 
				 if (inputUnit.equals("Millimeter")) {
		                if (outputUnit.equals("Centimeter")) {
		                    outputValue = inputValue / 10.0;
		                    	output.setText(String.format("%.8f", outputValue));
		                }
		                else if (outputUnit.equals("Millimeter")) {
		                    outputValue = inputValue ;
		                    output.setText(String.format("%.0f", outputValue));	
	                }
		                else if (outputUnit.equals("Meter")) {
		                    outputValue = inputValue *0.001;
		                    	output.setText(String.format("%.8f", outputValue));
		                }
		                else if (outputUnit.equals("Kilometer")) {
		                    outputValue = inputValue * 0.000001;
	                    	output.setText(String.format("%.8f", outputValue));

		                } 
		                else if (outputUnit.equals("Inch(s) ")) {
		                    outputValue = inputValue * 0.393700787;
	                    	output.setText(String.format("%.8f", outputValue));

		                } 
		                else if (outputUnit.equals("Foot")) {
		                	 outputValue = inputValue * 3.2808399;
		                	output.setText(String.format("%.8f", outputValue));
		                } 
		                else if (outputUnit.equals("Yard")) {
		                	 outputValue = inputValue * 1.0936133;
		                	output.setText(String.format("%.8f", outputValue));
		                }
		                else if (outputUnit.equals("Mile(s)")) {
		                	outputValue = inputValue * 0.0006214;
		                	output.setText(String.format("%.8f", outputValue));
		                } 
				 
				 
				 }
				 }
				 //KILOMETER
				 if (e.getSource() == Convert){
					 double inputValue = Double.parseDouble(input.getText());
			         double outputValue = 0;
				 
				 if (inputUnit.equals("Kilometer")) {
		                if (outputUnit.equals("Centimeter")) {
		                    outputValue = inputValue / 100000;
		                    output.setText(String.format("%.0f", outputValue));	
		                }
		                else if (outputUnit.equals("Kilometer")) {
		                    outputValue = inputValue ;
	                    	output.setText(String.format("%.8f", outputValue));
	                }
		                else if (outputUnit.equals("Meter")) {
		                    outputValue = inputValue *1000;
		                    	output.setText(String.format("%.8f", outputValue));
		                }
		                else if (outputUnit.equals("Millimeter ")) {
		                    outputValue = inputValue * 1000000;
	                    	output.setText(String.format("%.8f", outputValue));

		                } 
		                else if (outputUnit.equals("Inch(s)")) {
		                    outputValue = inputValue * 39370.0787;
	                    	output.setText(String.format("%.8f", outputValue));

		                } 
		                else if (outputUnit.equals("Foot")) {
		                	 outputValue = inputValue * 3280.8399;
		                	output.setText(String.format("%.8f", outputValue));
		                } 
		                else if (outputUnit.equals("Yard")) {
		                	 outputValue = inputValue * 1093.6133;
		                	output.setText(String.format("%.8f", outputValue));
		                }
		                else if (outputUnit.equals("Mile(s)")) {
		                	outputValue = inputValue * 0.6214;
		                	output.setText(String.format("%.8f", outputValue));
		                } 
				 
				 
				 }
				 }
				 //MILE
				 if (e.getSource() == Convert){
					 double inputValue = Double.parseDouble(input.getText());
			         double outputValue = 0;
				 
				 if (inputUnit.equals("Mile(s)")) {
		                if (outputUnit.equals("Centimeter")) {
		                    outputValue = inputValue * 160926.9391696169939;
		                    	output.setText(String.format("%.8f", outputValue));
		                }
		                else if (outputUnit.equals("Mile(s)")) {
		                    outputValue = inputValue ;
		                    output.setText(String.format("%.0f", outputValue));	
	                }
		                else if (outputUnit.equals("Meter")) {
		                    outputValue = inputValue *1609.269391696169939;
		                    	output.setText(String.format("%.8f", outputValue));
		                }
		                else if (outputUnit.equals("Millimeter")) {
		                    outputValue = inputValue * 1609269.391696169939;
	                    	output.setText(String.format("%.8f", outputValue));

		                } 
		                else if (outputUnit.equals("Inch(s)")) {
		                    outputValue = inputValue * 63360;
	                    	output.setText(String.format("%.8f", outputValue));

		                } 
		                else if (outputUnit.equals("Foot")) {
		                	 outputValue = inputValue * 5280;
		                	output.setText(String.format("%.8f", outputValue));
		                } 
		                else if (outputUnit.equals("Yard")) {
		                	 outputValue = inputValue * 1760;
		                	output.setText(String.format("%.8f", outputValue));
		                }
		                else if (outputUnit.equals("Kilometer")) {
		                	outputValue = inputValue *1.60934;
		                	output.setText(String.format("%.8f", outputValue));
		                } 
				 
				 
				 }
				 }
				 //YARD
				 if(e.getSource()==Convert){
				 		
					 	
						double inputValue = Double.parseDouble(input.getText());
				         double outputValue = 0.0;
						  
				            if (inputUnit.equals("Yard")) {
				            	
				                if (outputUnit.equals("Centimeter")) {
				                	
				                    outputValue = inputValue * 91.44;
				                    output.setText(String.format("%.8f", outputValue));
				                } 
				                else if (outputUnit.equals("Yard")) {
				                	 outputValue = inputValue;
				                	 output.setText(String.format("%.0f", outputValue));	
				                }
				                
				                else if (outputUnit.equals("Inch(s)")) {
				                	
				                    outputValue = inputValue * 36;
				                    output.setText(String.format("%.8f", outputValue));
				                    
				                }
				                else if (outputUnit.equals("Millimeter")) {
				                	 outputValue = inputValue * 914.4;
				                	  output.setText(String.format("%.8f", outputValue));
				                }
				                else if (outputUnit.equals("Kilometer")) {
				                	 outputValue = inputValue * 0.000914;
				                	  output.setText(String.format("%.8f", outputValue));
				                }
				                else if (outputUnit.equals("Mile(s)")) {
				                	 outputValue = inputValue * 0.000568;
				                	  output.setText(String.format("%.8f", outputValue));
				                }
				                else if (outputUnit.equals("Meter")) {
				                	 outputValue = inputValue * 0.9144;
				                	  output.setText(String.format("%.8f", outputValue));
					                    
				                } else if (outputUnit.equals("Foot")) {
				                	 outputValue = inputValue * 3;
				                	  output.setText(String.format("%.8f", outputValue));
				                }
				            }
				 
				 }
				 //FOOT
				 if(e.getSource()==Convert){
				 		
					 	
						double inputValue = Double.parseDouble(input.getText());
				         double outputValue = 0.0;
						  
				            if (inputUnit.equals("Foot")) {
				            	
				                if (outputUnit.equals("Centimeter")) {
				                	
				                    outputValue = inputValue *30.48;
				                    output.setText(String.format("%.8f", outputValue));
				                } 
				                else if (outputUnit.equals("Foot")) {
				                	 outputValue = inputValue;
				                	 output.setText(String.format("%.0f", outputValue));	
				                }
				                
				                else if (outputUnit.equals("Inch(s)")) {
				                	
				                    outputValue = inputValue * 12;
				                    output.setText(String.format("%.8f", outputValue));
				                    
				                }
				                else if (outputUnit.equals("Millimeter")) {
				                	 outputValue = inputValue *304.8;
				                	  output.setText(String.format("%.8f", outputValue));
				                }
				                else if (outputUnit.equals("Kilometer")) {
				                	 outputValue = inputValue * 0.0003048;
				                	  output.setText(String.format("%.8f", outputValue));
				                }
				                else if (outputUnit.equals("Mile(s)")) {
				                	 outputValue = inputValue * 0.000189394;
				                	  output.setText(String.format("%.8f", outputValue));
				                }
				                else if (outputUnit.equals("Meter")) {
				                	 outputValue = inputValue * 0.3048;
				                	  output.setText(String.format("%.8f", outputValue));
					                    
				                } else if (outputUnit.equals("Yard")) {
				                	 outputValue = inputValue * 0.333333;
				                	  output.setText(String.format("%.8f", outputValue));
				                }
				            }
				 
				 }
				 //INCH
				 if(e.getSource()==Convert){
				 		
					 	
						double inputValue = Double.parseDouble(input.getText());
				         double outputValue = 0.0;
						  
				            if (inputUnit.equals("Inch(s)")) {
				            	
				                if (outputUnit.equals("Centimeter")) {
				                	
				                    outputValue = inputValue * 2.54;
				                    output.setText(String.format("%.8f", outputValue));
				                } 
				                else if (outputUnit.equals("Inch(s)")) {
				                	 outputValue = inputValue;
				                	 output.setText(String.format("%.0f", outputValue));	
				                }
				                
				                else if (outputUnit.equals("Yard")) {
				                	
				                    outputValue = inputValue * 0.027778;
				                    output.setText(String.format("%.8f", outputValue));
				                    
				                }
				                else if (outputUnit.equals("Millimeter")) {
				                	 outputValue = inputValue *25.4;
				                	  output.setText(String.format("%.8f", outputValue));
				                }
				                else if (outputUnit.equals("Kilometer")) {
				                	 outputValue = inputValue *0.000025;
				                	  output.setText(String.format("%.8f", outputValue));
				                }
				                else if (outputUnit.equals("Mile(s)")) {
				                	 outputValue = inputValue * 0.000016;
				                	  output.setText(String.format("%.8f", outputValue));
				                }
				                else if (outputUnit.equals("Meter")) {
				                	 outputValue = inputValue * 0.0254;
				                	  output.setText(String.format("%.8f", outputValue));
					                    
				                } else if (outputUnit.equals("Foot")) {
				                	 outputValue = inputValue * 0.0833333;
				                	  output.setText(String.format("%.8f", outputValue));
				                }
				            }
				 
				 }
				 //WEIGHT
				 //Miligram(s)
				 if (e.getSource()==Convert) {
					 double inputValue = Double.parseDouble(input.getText());
			         double outputValue = 0.0;
			         if (inputUnit.equals("Miligram(s)")) {	
			        	if (outputUnit.equals("Miligram(s)")) {
			                   outputValue = inputValue ;
			                   output.setText(String.format("%.0f", outputValue));	
			                
			        	 }
			        	else if (outputUnit.equals("Gram(s)")) {
			                   outputValue = inputValue * 0.001;
			                    output.setText(String.format("%.8f", outputValue));
			                
			        	 }
			         
			         else if (outputUnit.equals("Kilogram(s)")) {
		                   outputValue = inputValue * 0.000001;
		                    output.setText(String.format("%.8f", outputValue));
		                
		        	 }
			         else if (outputUnit.equals("Pound(s)")) {
		                   outputValue = inputValue * 0.000002;
		                    output.setText(String.format("%.8f", outputValue));
		                
			         }
			         else if (outputUnit.equals("Ounce(s)")) {
		                   outputValue = inputValue *0.000035;
		                    output.setText(String.format("%.8f", outputValue));
		                
			         }
					 
					 
					 
				 }
				 }
				 //Gram(s)
				 if (e.getSource()==Convert) {
					 double inputValue = Double.parseDouble(input.getText());
			         double outputValue = 0.0;
			         if (inputUnit.equals("Gram(s)")) {	
			        	if (outputUnit.equals("Gram(s)")) {
			                   outputValue = inputValue ;
			                   output.setText(String.format("%.0f", outputValue));	
			                
			        	 }
			        	else if (outputUnit.equals("Miligram(s)")) {
			                   outputValue = inputValue * 1000;
			                    output.setText(String.format("%.8f", outputValue));
			                
			        	 }
			         
			         else if (outputUnit.equals("Kilogram(s)")) {
		                   outputValue = inputValue *0.001;
		                    output.setText(String.format("%.8f", outputValue));
		                
		        	 }
			         else if (outputUnit.equals("Pound(s)")) {
		                   outputValue = inputValue *0.002205;
		                    output.setText(String.format("%.8f", outputValue));
		                
			         }
			         else if (outputUnit.equals("Ounce(s)")) {
		                   outputValue = inputValue* 0.035274;
		                    output.setText(String.format("%.8f", outputValue));
		                
			         }
					 
					 
					 
				 }
				 }
				 //Kilogram(s)
				 if (e.getSource()==Convert) {
					 double inputValue = Double.parseDouble(input.getText());
			         double outputValue = 0.0;
			         if (inputUnit.equals("Kilogram(s)")) {	
			        	if (outputUnit.equals("Kilogram(s)")) {
			                   outputValue = inputValue ;
			                   output.setText(String.format("%.0f", outputValue));	
			                
			        	 }
			        	else if (outputUnit.equals("Miligram(s)")) {
			                   outputValue = inputValue * 1000000;
			                    output.setText(String.format("%.8f", outputValue));
			                
			        	 }
			         
			         else if (outputUnit.equals("Gram(s)")) {
		                   outputValue = inputValue *1000;
		                    output.setText(String.format("%.8f", outputValue));
		                
		        	 }
			         else if (outputUnit.equals("Pound(s)")) {
		                   outputValue = inputValue *2.204623;
		                    output.setText(String.format("%.8f", outputValue));
		                
			         }
			         else if (outputUnit.equals("Ounce(s)")) {
		                   outputValue = inputValue*35.27396;
		                    output.setText(String.format("%.8f", outputValue));
		                
			         }
			        	}
			         }
				 //Pound(s)
				 if (e.getSource()==Convert) {
					 double inputValue = Double.parseDouble(input.getText());
			         double outputValue = 0.0;
			         if (inputUnit.equals("Pound(s)")) {	
			        	if (outputUnit.equals("Pound(s)")) {
			                   outputValue = inputValue ;
			                   output.setText(String.format("%.0f", outputValue));	
			                
			        	 }
			        	else if (outputUnit.equals("Miligram(s)")) {
			                   outputValue = inputValue * 453592.4;
			                    output.setText(String.format("%.8f", outputValue));
			                
			        	 }
			         
			         else if (outputUnit.equals("Gram(s)")) {
		                   outputValue = inputValue *453.5924;
		                    output.setText(String.format("%.8f", outputValue));
		                
		        	 }
			         else if (outputUnit.equals("Kilogram(s)")) {
		                   outputValue = inputValue *0.453592;
		                    output.setText(String.format("%.8f", outputValue));
		                
			         }
			         else if (outputUnit.equals("Ounce(s)")) {
		                   outputValue = inputValue*16;
		                    output.setText(String.format("%.8f", outputValue));
		                
			         }
			        	}
			         }
				//Pound(s)
				 if (e.getSource()==Convert) {
					 double inputValue = Double.parseDouble(input.getText());
			         double outputValue = 0.0;
			         if (inputUnit.equals("Ounce(s)")) {	
			        	if (outputUnit.equals("Ounce(s)")) {
			                   outputValue = inputValue ;
			                   output.setText(String.format("%.0f", outputValue));	
			                
			        	 }
			        	else if (outputUnit.equals("Miligram(s)")) {
			                   outputValue = inputValue * 28349.52;
			                    output.setText(String.format("%.8f", outputValue));
			                
			        	 }
			         
			         else if (outputUnit.equals("Gram(s)")) {
		                   outputValue = inputValue *28.34952;
		                    output.setText(String.format("%.8f", outputValue));
		                
		        	 }
			         else if (outputUnit.equals("Kilogram(s)")) {
		                   outputValue = inputValue *0.02835;
		                    output.setText(String.format("%.8f", outputValue));
		                
			         }
			         else if (outputUnit.equals("Pound(s)")) {
		                   outputValue = inputValue*0.0625;
		                    output.setText(String.format("%.8f", outputValue));
		                
			         }
			        	}
			         }
				 //Temperature
				 //Celsius
				 if (e.getSource()==Convert) {
					 double inputValue = Double.parseDouble(input.getText());
			         double outputValue = 0.0;
					  if (inputUnit.equals("Celsius")) {
						  if (outputUnit.equals("Celsius")) {
							  outputValue = inputValue ;
							  output.setText(String.format("%.0f", outputValue));	
						  
						  }
						  else if (outputUnit.equals("Fahrenheit")) {
			                   outputValue = (inputValue*9/5) + 32 ;

			                    output.setText(String.format("%.8f", outputValue));
			                
				         }
			                  
						  else if (outputUnit.equals("Kelvin")) {
			                   outputValue = inputValue + 273.15;
			                    output.setText(String.format("%.8f", outputValue));						  
					  }
				        	
				  }	 
					 
				 }
				 //Fahrenheit
				 if (e.getSource()==Convert) {
					 double inputValue = Double.parseDouble(input.getText());
			         double outputValue = 0.0;
					  if (inputUnit.equals("Fahrenheit")) {
						  if (outputUnit.equals("Fahrenheit")) {
							  outputValue = inputValue ;
							  output.setText(String.format("%.0f", outputValue));	
						  
						  }
						  else if (outputUnit.equals("Celsius")) {
			                   outputValue = (inputValue - 32) * 5/9 ;

			                    output.setText(String.format("%.8f", outputValue));
			                
				         }
			                  
						  else if (outputUnit.equals("Kelvin")) {
			                   outputValue = (inputValue-32) * 5/9 + 273.15;
			                    output.setText(String.format("%.8f", outputValue));						  
					  }
				        	
				  }	 
					 
				 }
				//Kelvin
				 if (e.getSource()==Convert) {
					 double inputValue = Double.parseDouble(input.getText());
			         double outputValue = 0.0;
					  if (inputUnit.equals("Kelvin")) {
						  if (outputUnit.equals("Kelvin")) {
							  outputValue = inputValue ;
							  output.setText(String.format("%.0f", outputValue));	
						  
						  }
						  else if (outputUnit.equals("Celsius")) {
			                   outputValue = inputValue - 273.15  ;

			                    output.setText(String.format("%.8f", outputValue));
			                
				         }
			                  
						  else if (outputUnit.equals("Fahrenheit")) {
			                   outputValue = (inputValue-273.15) * 9/5 + 32;
			                    output.setText(String.format("%.8f", outputValue));						  
					  }
				        	
				  }	 
					 
				 }
				 //TIME
				 //SEconds
				 if (e.getSource()==Convert) {
					 double inputValue = Double.parseDouble(input.getText());
			         double outputValue = 0.0;
				  if (inputUnit.equals("Second(s)")) {
		                if (outputUnit.equals("Second(s)")) {
		                    outputValue = inputValue;
		                    output.setText(String.format("%.0f", outputValue));					  
						  
		                } 
		                else if (outputUnit.equals("Milisecond(s)")) {
		                    outputValue = inputValue / 1000;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                
		                else if (outputUnit.equals("Minute(s)")) {
		                    outputValue = inputValue /60;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                else if (outputUnit.equals("Hour(s)")) {
		                    outputValue = inputValue / 3600.0;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                else if (outputUnit.equals("Day(s)")) {
		                    outputValue = inputValue / 86400.0;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                else if (outputUnit.equals("Week(s)")) {
		                    outputValue = inputValue / 604800.0;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                else if (outputUnit.equals("Month(s)")) {
		                    outputValue = inputValue / 2.628e+6;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                else if (outputUnit.equals("Year(s)")) {
		                    outputValue = inputValue / 3.154+7;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                
		            }
				  }
				//TIME
				 //Milisecond(s)
				 if (e.getSource()==Convert) {
					 double inputValue = Double.parseDouble(input.getText());
			         double outputValue = 0.0;
				  if (inputUnit.equals("Milisecond(s)")) {
		                if (outputUnit.equals("Milisecond(s)")) {
		                    outputValue = inputValue;
		                    output.setText(String.format("%.0f", outputValue));						  
						  
		                } 
		                else if (outputUnit.equals("Second(s)")) {
		                    outputValue = inputValue / 1000;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                
		                else if (outputUnit.equals("Minute(s)")) {
		                    outputValue = inputValue /60000;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                else if (outputUnit.equals("Hour(s)")) {
		                    outputValue = inputValue /  3.6e+6;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                else if (outputUnit.equals("Day(s)")) {
		                    outputValue = inputValue / 8.64e+7
;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                else if (outputUnit.equals("Week(s)")) {
		                    outputValue = inputValue / 6.048e+8;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                else if (outputUnit.equals("Month(s)")) {
		                    outputValue = inputValue /2.628e+9;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                else if (outputUnit.equals("Year(s)")) {
		                    outputValue = inputValue / 3.154e+10;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                
		            }
				  }
				//Minute(s)
				 if (e.getSource()==Convert) {
					 double inputValue = Double.parseDouble(input.getText());
			         double outputValue = 0.0;
				  if (inputUnit.equals("Minute(s)")) {
		                if (outputUnit.equals("Minute(s)")) {
		                    outputValue = inputValue;
		                    output.setText(String.format("%.0f", outputValue));						  
						  
		                } 
		                else if (outputUnit.equals("Second(s)")) {
		                    outputValue = inputValue / 60;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                
		                else if (outputUnit.equals("Milisecond(s)")) {
		                    outputValue = inputValue / 60000;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                else if (outputUnit.equals("Hour(s)")) {
		                    outputValue = inputValue /  60;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                else if (outputUnit.equals("Day(s)")) {
		                    outputValue = inputValue / 1440;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                else if (outputUnit.equals("Week(s)")) {
		                    outputValue = inputValue / 10080;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                else if (outputUnit.equals("Month(s)")) {
		                    outputValue = inputValue /43800;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                else if (outputUnit.equals("Year(s)")) {
		                    outputValue = inputValue / 525600;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                
		            }
				  }
					//Hour(s)
				 if (e.getSource()==Convert) {
					 double inputValue = Double.parseDouble(input.getText());
			         double outputValue = 0.0;
				  if (inputUnit.equals("Hour(s)")) {
		                if (outputUnit.equals("Hour(s)")) {
		                    outputValue = inputValue;
		                    output.setText(String.format("%.0f", outputValue));						  
						  
		                } 
		                else if (outputUnit.equals("Second(s)")) {
		                    outputValue = inputValue / 3600;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                
		                else if (outputUnit.equals("Milisecond(s)")) {
		                    outputValue = inputValue / 3.6e+6;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                else if (outputUnit.equals("Minute(s)")) {
		                    outputValue = inputValue /  60;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                else if (outputUnit.equals("Day(s)")) {
		                    outputValue = inputValue / 24;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                else if (outputUnit.equals("Week(s)")) {
		                    outputValue = inputValue / 168;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                else if (outputUnit.equals("Month(s)")) {
		                    outputValue = inputValue /730;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                else if (outputUnit.equals("Year(s)")) {
		                    outputValue = inputValue / 8760;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                
		            }
				  }
				//Day(s)
				 if (e.getSource()==Convert) {
					 double inputValue = Double.parseDouble(input.getText());
			         double outputValue = 0.0;
				  if (inputUnit.equals("Day(s)")) {
		                if (outputUnit.equals("Day(s)")) {
		                    outputValue = inputValue;
		                    output.setText(String.format("%.0f", outputValue));						  
						  
		                } 
		                else if (outputUnit.equals("Second(s)")) {
		                    outputValue = inputValue *86400;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                
		                else if (outputUnit.equals("Milisecond(s)")) {
		                    outputValue = inputValue * 8.64e+7;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                else if (outputUnit.equals("Minute(s)")) {
		                    outputValue = inputValue *1440;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                else if (outputUnit.equals("Hour(s)")) {
		                    outputValue = inputValue * 24;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                else if (outputUnit.equals("Week(s)")) {
		                    outputValue = inputValue / 7;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                else if (outputUnit.equals("Month(s)")) {
		                    outputValue = inputValue / 30.417;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                else if (outputUnit.equals("Year(s)")) {
		                    outputValue = inputValue / 365;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                
		            }
				  }
					//week
				 if (e.getSource()==Convert) {
					 double inputValue = Double.parseDouble(input.getText());
			         double outputValue = 0.0;
				  if (inputUnit.equals("Week(s)")) {
		                if (outputUnit.equals("Week(s)")) {
		                    outputValue = inputValue;
		                    output.setText(String.format("%.0f", outputValue));						  
						  
		                } 
		                else if (outputUnit.equals("Second(s)")) {
		                    outputValue = inputValue * 604800;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                
		                else if (outputUnit.equals("Milisecond(s)")) {
		                    outputValue = inputValue * 6.048e+8;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                else if (outputUnit.equals("Minute(s)")) {
		                    outputValue = inputValue *10080;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                else if (outputUnit.equals("Hour(s)")) {
		                    outputValue = inputValue * 168;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                else if (outputUnit.equals("Day(s)")) {
		                    outputValue = inputValue / 7;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                else if (outputUnit.equals("Month(s)")) {
		                    outputValue = inputValue /4.345;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                else if (outputUnit.equals("Year(s)")) {
		                    outputValue = inputValue / 52.143;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                
		            }
				  }
					//MONTH
				 if (e.getSource()==Convert) {
					 double inputValue = Double.parseDouble(input.getText());
			         double outputValue = 0.0;
				  if (inputUnit.equals("Month(s)")) {
		                if (outputUnit.equals("Month(s)")) {
		                    outputValue = inputValue;
		                    output.setText(String.format("%.0f", outputValue));						  
						  
		                } 
		                else if (outputUnit.equals("Second(s)")) {
		                    outputValue = inputValue *  2.628e+6;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                
		                else if (outputUnit.equals("Milisecond(s)")) {
		                    outputValue = inputValue *2.628e+9;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                else if (outputUnit.equals("Minute(s)")) {
		                    outputValue = inputValue *43800;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                else if (outputUnit.equals("Hour(s)")) {
		                    outputValue = inputValue * 730;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                else if (outputUnit.equals("Day(s)")) {
		                    outputValue = inputValue *30.417;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                else if (outputUnit.equals("Week(s)")) {
		                    outputValue = inputValue *4.345;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                else if (outputUnit.equals("Year(s)")) {
		                    outputValue = inputValue / 12;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                
		            }
				  }
					//MONTH
				 if (e.getSource()==Convert) {
					 double inputValue = Double.parseDouble(input.getText());
			         double outputValue = 0.0;
				  if (inputUnit.equals("Year(s)")) {
		                if (outputUnit.equals("Year(s)")) {
		                    outputValue = inputValue;
		                    output.setText(String.format("%.0f", outputValue));						  
						  
		                } 
		                else if (outputUnit.equals("Second(s)")) {
		                    outputValue = inputValue *  3.154e+7;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                
		                else if (outputUnit.equals("Milisecond(s)")) {
		                    outputValue = inputValue * 3.154e+10;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                else if (outputUnit.equals("Minute(s)")) {
		                    outputValue = inputValue *525600;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                else if (outputUnit.equals("Hour(s)")) {
		                    outputValue = inputValue * 8760;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                else if (outputUnit.equals("Day(s)")) {
		                    outputValue = inputValue *365;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                else if (outputUnit.equals("Week(s)")) {
		                    outputValue = inputValue * 52.143;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                else if (outputUnit.equals("Month(s)")) {
		                    outputValue = inputValue * 12;
		                    output.setText(String.format("%.8f", outputValue));		
		                } 
		                
		            }
				 }
				  }
				 private boolean isNumeric(String str) {
						try {
							Double.parseDouble(str);
						}catch (NumberFormatException N) {
						return false;
					}
				 return true;
			 	}

		
			 	}
		


