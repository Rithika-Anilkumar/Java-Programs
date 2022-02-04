package myProject;
import java.awt.Frame;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;

public class SignupPage extends Frame implements ActionListener{
	TextField name1=new TextField(10);
	TextField name2=new TextField(10);
	TextField name3=new TextField(10);
	Button b;
	
	public SignupPage() {
		setTitle("SIGNUP");
		setSize(400,400);
		setVisible(true);
		setLayout(new FlowLayout());
		
		Label label1=new Label("Email");
		Label label2=new Label("UserName");
		Label label3=new Label("PassWord");
		
		label1.setAlignment(Label.CENTER);
		label2.setAlignment(Label.CENTER);
		label3.setAlignment(Label.CENTER);
		name3.setEchoChar('*');
		b=new Button("Submit");
		b.addActionListener(this);
		
		add(label1);
		add(name1);
		add(label2);
		add(name2);
		add(label3);
		add(name3);
		add(b);
		
		name1.setText("");
		name2.setText("");	
		name3.setText("");
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we ) {
				System.exit(0);
			}
		
		
		
	});
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println("Email-"+name1.getText());
		System.out.println("Username-"+name2.getText());
		System.out.println("Password-"+name3.getText());
		
	}
	public static void main(String[] args) {
		new SignupPage();

	}

}
