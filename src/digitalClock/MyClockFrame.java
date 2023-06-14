package digitalClock;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyClockFrame extends JFrame{
	
	SimpleDateFormat timeFormat;
	SimpleDateFormat dayFormat;
	SimpleDateFormat dateFormat;
	
	String time;
	String day;
	String date;
	
	JLabel timeLable;
	JLabel dayLable;
	JLabel dateLable;

	private static final long serialVersionUID = 1L;

	MyClockFrame(){
		this.setTitle("Clock");
		this.setBounds(500, 200, 250, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		//this.setSize(350, 240);
		ImageIcon img = new ImageIcon("download.png"); 
		this.setIconImage(img.getImage());
		
		this.setLayout(new FlowLayout());
		
		this.timeLable = new JLabel();
		timeLable.setBackground(Color.BLACK);
		timeLable.setForeground(Color.GREEN);
		timeLable.setOpaque(true);
		timeLable.setFont(new Font("Vendra", Font.PLAIN,40));	
		
		this.dayLable = new JLabel();
		dayLable.setFont(new Font("Lato", Font.PLAIN, 30));
		
		this.dateLable  = new JLabel();
		dateLable.setFont(new Font("Cambria", Font.PLAIN,20));	
		
		
		this.add(timeLable);
		this.add(dayLable);
		this.add(dateLable);

		
		
		this.setVisible(true);
		
		reSetTime();
		
		
	}

	private void reSetTime() {
		this.timeFormat = new SimpleDateFormat(" hh:mm:ss a ");
		this.dayFormat = new SimpleDateFormat("EEEE");
		this.dateFormat = new SimpleDateFormat("MMM dd, yyyy");
		while(true) {
			time = timeFormat.format(Calendar.getInstance().getTime());	
			timeLable.setText(time);
			
			day = dayFormat.format(Calendar.getInstance().getTime());
			dayLable.setText(day);
			
			date = dateFormat.format(Calendar.getInstance().getTime());
			dateLable.setText(date);
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
		}
		
	}
}
