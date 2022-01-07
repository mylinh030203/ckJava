package ck;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpCustomer {
	JFrame fcus= new JFrame("Sign Up for Customer");
	JLabel lbsignup = new JLabel("Sign Up");
	JLabel lb = new JLabel();
	JLabel lbusernamecus = new JLabel("Username Customer");
	JTextField tfusernamecus = new JTextField(15);
	JLabel lbpasswordcus = new JLabel("Password Customer");
	JTextField tfpasswordcus = new JTextField(15);
	JButton btforget = new JButton("Forgotten Password");
	JButton btsignup = new JButton("Sign Up");
	JButton btcreateacA = new JButton("Create Account");
	JButton btcancel = new JButton("Cancel");
	public SignUpCustomer() {
		fcus.setLocation(300,20);
		fcus.setLayout(new GridLayout(5,2));
		Container contc = fcus.getContentPane();
		contc.add(lbsignup);
		contc.add(lb);
		contc.add(lbusernamecus);
		contc.add(tfusernamecus);
		contc.add(lbpasswordcus);
		contc.add(tfpasswordcus);
		contc.add(btforget);
		contc.add(btsignup);
		contc.add(btcreateacA);
		contc.add(btcancel);
	
		fcus.setSize(400,200);
		fcus.setVisible(true);
		btcancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				fcus.dispose();
			}
		});
		btsignup.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new choose1();
				fcus.dispose();
			}
		});
		btcreateacA.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new newAccount();
				fcus.dispose();
				
			}
		});
		btforget.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				new forgot_pass();
				fcus.dispose();
				
			}
		});
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SignUpCustomer();
	}
	class Inforcustomer1 extends JFrame {
		JFrame f2 = new JFrame("Information Customers");
		JLabel lbcmnd = new JLabel("CMND");
		JTextField tfcmnd = new JTextField(10);
		JLabel lbfullname = new JLabel("Full Name");
		JTextField tffullname = new JTextField(10);
		JLabel lbaddress = new JLabel("Home Town");
		String[] address = {"An Giang", "Bà rịa – Vũng tàu", "Bắc Giang", "Bắc Kạn", "Bạc Liêu","Bắc Ninh", "	Bến Tre", "	Bình Định"
	, "	Bình Dương", "	Bình Phước", "	Bình Thuận", "	Cà Mau", "	Cần Thơ", "	Cao Bằng ", "	Đà Nẵng", "Đắk Lắk"
	, "Đắk Nông", "Điện Biên", "Đồng Nai", "Đồng Tháp", "Gia Lai", "Hà Giang", "Hà Nam", "Hà Nội \r\n", "Hà Tĩnh\r\n", "Hải Dương\r\n"
	, "Hải Phòng\r\n", "Hậu Giang\r\n", "Hòa Bình\r\n", "Hưng Yên\r\n", "Khánh Hòa\r\n", "Kiên Giang\r\n", "Kon Tum\r\n"
	, "Lai Châu\r\n", "Lâm Đồng\r\n", "Lạng Sơn\r\n", "Lào Cai\r\n", "Long An\r\n", "Nam Định\r\n", "Nghệ An\r\n"
	, "Ninh Bình\r\n", "Ninh Thuận\r\n", "Phú Thọ\r\n", "Phú Yên\r\n", "Quảng Bình\r\n", "Quảng Nam\r\n", "Quảng Ngãi\r\n"
	, "Quảng Ninh\r\n", "Quảng Trị\r\n", "Sóc Trăng\r\n", "Sơn La\r\n", "Tây Ninh\r\n", "Thái Bình\r\n", "Thái Nguyên\r\n"
	, "Thanh Hóa\r\n", "Thừa Thiên Huế\r\n", "Tiền Giang\r\n", "Thành phố Hồ Chí Minh\r\n", "Trà Vinh\r\n", "Tuyên Quang\r\n"
	, "Vĩnh Long\r\n", "Vĩnh Phúc\r\n", "Yên Bái"};
		JComboBox jcbaddress = new JComboBox(address);
		JLabel lbbirthday = new JLabel ("Birthday");
		JLabel lbsdt = new JLabel("Phone Number");
		JTextField tfsdt = new JTextField(15);
		JDateChooser clbirthday = new JDateChooser();
		JButton btadd = new JButton ("Complete");
		JButton btnew = new JButton ("New");
		JButton btcancel = new JButton("Cancel");
		JLabel bl2b = new JLabel();
		JLabel lbinfor = new JLabel("Information of Tenant");
		public Inforcustomer1() {
			f2.setLocation(300,20);
			f2.setLayout(new GridLayout(10,2));
			Container cont2 =  f2.getContentPane();
			cont2.add(lbinfor);
			cont2.add(bl2b);
			cont2.add(lbcmnd);
			cont2.add(tfcmnd);	
			cont2.add(lbfullname);
			cont2.add(tffullname);
			cont2.add(lbaddress);
			cont2.add(jcbaddress);
			cont2.add(btnew);
			cont2.add(lbbirthday);
			cont2.add(clbirthday);
			cont2.add(lbsdt);
			cont2.add(tfsdt);
			cont2.add(btadd);		
			cont2.add(btnew);
			cont2.add(btcancel);
			f2.pack();
			f2.setSize(700,300);
			f2.setVisible(true);
			btnew.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					new Inforcustomer1();
					f2.dispose();
				}
			});
			btcancel.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					f2.dispose();
				}
			});
		}
	}
	class inforlandlords1 extends JFrame{
		JFrame f4 = new JFrame("Information Landlords");
		JLabel lbCMll = new JLabel("CMND");
		JTextField tfCMll = new JTextField(10);
		JLabel lbnamell = new JLabel("Full Name");
		JTextField tfnamell = new JTextField(10);
		JLabel lbaddressll = new JLabel("Address");
		JTextField tfaddressll = new JTextField(10);
		JLabel lbbirthdayll = new JLabel ("Birthday");
		JDateChooser dcbirthdayll = new JDateChooser();
		JLabel lbsdt = new JLabel("Phone Number");
		JTextField tfsdt = new JTextField(15);
		JButton btSee = new JButton ("See");
		JButton btfind = new JButton ("Find");
		public inforlandlords1() {
			f4.setLocation(300,20);
			f4.setLayout(new GridLayout(6,2));
			Container cont4 = f4.getContentPane();
			cont4.add(lbCMll);
			cont4.add(tfCMll);
			cont4.add(lbnamell);
			cont4.add(tfnamell);
			cont4.add(lbaddressll);
			cont4.add(tfaddressll);
			cont4.add(lbbirthdayll);
			cont4.add(dcbirthdayll);
			cont4.add(lbsdt);
			cont4.add(tfsdt);
			cont4.add(btSee);
			cont4.add(btfind);
			f4.pack();
			f4.setSize(500,200);
			f4.setVisible(true);
			}
		}
	class inforhouse1 extends JFrame{
		JFrame f5 = new JFrame("Information House");
		JLabel lbID = new JLabel("ID House");
		JTextField tfID = new JTextField(10);
		JLabel lbaddressh = new JLabel("Address House");
		JTextField tfaddressh = new JTextField(10);
		JLabel lbarea = new JLabel("House Area");
		JTextField tfarea = new JTextField(10);
		JLabel lbdeposits = new JLabel("Deposits");
		JTextField tfdeposits = new JTextField(10);
		JButton btfind = new JButton ("Find");
		JButton btSee = new JButton ("See");
		public inforhouse1() {
			f5.setLocation(300,20);
			f5.setLayout(new GridLayout(5,2));
			Container cont5 = f5.getContentPane();
			cont5.add(lbID);
			cont5.add(tfID);
			cont5.add(lbaddressh);
			cont5.add(tfaddressh);
			cont5.add(lbarea);
			cont5.add(tfarea);
			cont5.add(lbdeposits);
			cont5.add(tfdeposits);
			cont5.add(btfind);
			cont5.add(btSee);
			f5.pack();
			f5.setSize(500,200);
			f5.setVisible(true);
		}
	}
	class choose1 extends JFrame{
		JFrame f3 = new JFrame("Choose");
		JLabel lbchoose = new JLabel("Choose Object");
		JButton btcustomer = new JButton("Choose Customers");
		JButton btlandlords = new JButton("Choose Landlords");
		JButton bthouse = new JButton("Choose House");
		public choose1() {
			f3.setLocation(300,20);
			f3.setLayout(new GridLayout(4,1));
			Container cont3 =  f3.getContentPane();
			cont3.add(lbchoose);
			cont3.add(btcustomer);
			cont3.add(btlandlords);
			cont3.add(bthouse);
			f3.pack();
			f3.setSize(300,300);
			f3.setVisible(true);
			btcustomer.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					new Inforcustomer1();
					f3.dispose();
				}
			});
			btlandlords.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					new inforlandlords1();
					f3.dispose();
				}
			});
			bthouse.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					new inforhouse1();
					f3.dispose();
				}
			});
		}
		
	}
class newAccount extends JFrame{
	JFrame flogin = new JFrame("Log in");
	JLabel lblogin = new JLabel("Log in");
	JLabel lb = new JLabel();
	JLabel lbusernamecus = new JLabel("Username");
	JTextField tfusernamecus = new JTextField(15);
	JLabel lbpasswordcus = new JLabel("Password");
	JTextField tfpasswordcus = new JTextField(15);
	JLabel lbemailcus = new JLabel("Email");	
	JTextField tfemailcus = new JTextField(15);
	JButton btcancel = new JButton("Cancel");
	JButton btlogin = new JButton("Log in");
	public newAccount() {
		flogin.setLocation(300,20);
		flogin.setLayout(new GridLayout(5,2));
		Container contlogin = flogin.getContentPane();
		contlogin.add(lblogin);
		contlogin.add(lb);
		contlogin.add(lbusernamecus);
		contlogin.add(tfusernamecus);
		contlogin.add(lbpasswordcus);
		contlogin.add(tfpasswordcus);
		contlogin.add(lbemailcus);
		contlogin.add(tfemailcus);
		contlogin.add(btcancel);
		contlogin.add(btlogin);
		flogin.pack();
		flogin.setSize(400,200);
		flogin.setVisible(true);
		btcancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				flogin.dispose();
			}
		});
		btlogin.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				//thêm vào csdl tài khoản khách hàng
				new Inforcustomer1();
				flogin.dispose();
			}
		});
	}
	
}

}


