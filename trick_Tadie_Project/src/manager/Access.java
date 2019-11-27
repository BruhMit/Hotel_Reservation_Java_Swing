package manager;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Tadesse
 */
public class Access extends javax.swing.JFrame {
  String gender;
   String S;
   String username;
    public Access() {
        initComponents();
        Toolkit toolkit=getToolkit();
        Dimension size=toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        fetch();
    }
    public Access(String username){
        this.username=username;
        initComponents();
        fetch();
    }
   public void fetch(){
        try{
         String url = "jdbc:mysql://localhost/record"; 
          Connection conn = DriverManager.getConnection(url,"root",""); 
           String sql= "select*from personalinfo ";
           PreparedStatement pstmt = conn.prepareStatement(sql);
           ResultSet rs=pstmt.executeQuery();
          jTable1.setModel(DbUtils.resultSetToTableModel(rs));
      }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
   public ImageIcon ResizeImage(String imagepath,byte[] pic){
    ImageIcon myImage=null;
    if(imagepath!=null){
        myImage=new ImageIcon(imagepath);
            }else{
        myImage=new ImageIcon(pic);
    }
    Image img=myImage.getImage();
    Image img2=img.getScaledInstance(labelImage.getWidth(),labelImage.getHeight(), Image.SCALE_SMOOTH);
    ImageIcon image=new ImageIcon(img2);
    return image;
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jButton6 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jTextField15 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jTextField16 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        labelImage = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox();
        jButton7 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox();
        jTextField28 = new javax.swing.JTextField();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jTextField29 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jTextField30 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jTextField31 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jTextField32 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jTextField33 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jTextField34 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jTextField35 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jTextField37 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jPanel7 = new javax.swing.JPanel();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField41 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 51, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 102, 204));

        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setText("Id");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel12.setForeground(new java.awt.Color(0, 0, 255));
        jLabel12.setText("First Name");

        jLabel13.setForeground(new java.awt.Color(0, 0, 255));
        jLabel13.setText("Middle N ame");

        jLabel14.setForeground(new java.awt.Color(0, 0, 255));
        jLabel14.setText("Last Name");

        jLabel15.setForeground(new java.awt.Color(0, 0, 255));
        jLabel15.setText("Gender");

        jLabel16.setForeground(new java.awt.Color(0, 0, 255));
        jLabel16.setText("Nationality");

        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });

        jComboBox1.setForeground(new java.awt.Color(0, 0, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Afghanistan", "Albania", "Algeria", "American Samoa", "Andorra", "Angola", "Anguilla", "Antarctica", "Antigua and Barbuda", "Argentina", "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana", "Bouvet Island", "Brazil", "British Antarctic Territory", "British Indian Ocean Territory", "British Virgin Islands", "Brunei", "Bulgaria", "Burkina Faso", "Burundi", "Cambodia", "Cameroon", "Canada", "Canton and Enderbury Islands", "Cape Verde", "Cayman Islands", "Central African Republic", "Chad", "Chile", "China", "Christmas Island", "Cocos [Keeling] Islands", "Colombia", "Comoros", "Congo - Brazzaville", "Congo - Kinshasa", "Cook Islands", "Costa Rica", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Côte d’Ivoire", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "Dronning Maud Land", "East Germany", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Falkland Islands", "Faroe Islands", "Fiji", "Finland", "France", "French Guiana", "French Polynesia", "French Southern Territories", "French Southern and Antarctic Territories", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Gibraltar", "Greece", "Greenland", "Grenada", "Guadeloupe", "Guam", "Guatemala", "Guernsey", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Heard Island and McDonald Islands", "Honduras", "Hong Kong SAR China", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland", "Isle of Man", "Israel", "Italy", "Jamaica", "Japan", "Jersey", "Johnston Island", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Macau SAR China", "Macedonia", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Martinique", "Mauritania", "Mauritius", "Mayotte", "Metropolitan France", "Mexico", "Micronesia", "Midway Islands", "Moldova", "Monaco", "Mongolia", "Montenegro", "Montserrat", "Morocco", "Mozambique", "Myanmar [Burma]", "Namibia", "Nauru", "Nepal", "Netherlands", "Netherlands Antilles", "Neutral Zone", "New Caledonia", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Niue", "Norfolk Island", "North Korea", "North Vietnam", "Northern Mariana Islands", "Norway", "Oman", "Pacific Islands Trust Territory", "Pakistan", "Palau", "Palestinian Territories", "Panama", "Panama Canal Zone", "Papua New Guinea", "Paraguay", "People's Democratic Republic of Yemen", "Peru", "Philippines", "Pitcairn Islands", "Poland", "Portugal", "Puerto Rico", "Qatar", "Romania", "Russia", "Rwanda", "Réunion", "Saint Barthélemy", "Saint Helena", "Saint Kitts and Nevis", "Saint Lucia", "Saint Martin", "Saint Pierre and Miquelon", "Saint Vincent and the Grenadines", "Samoa", "San Marino", "Saudi Arabia", "Senegal", "Serbia", "Serbia and Montenegro", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Georgia and the South Sandwich Islands", "South Korea", "Spain", "Sri Lanka", "Sudan", "Suriname", "Svalbard and Jan Mayen", "Swaziland", "Sweden", "Switzerland", "Syria", "São Tomé and Príncipe", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Timor-Leste", "Togo", "Tokelau", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Turks and Caicos Islands", "Tuvalu", "U.S. Minor Outlying Islands", "U.S. Miscellaneous Pacific Islands", "U.S. Virgin Islands", "Uganda", "Ukraine", "Union of Soviet Socialist Republics", "United Arab Emirates", "United Kingdom", "United States", "Unknown or Invalid Region", "Uruguay", "Uzbekistan", "Vanuatu", "Vatican City", "Venezuela", "Vietnam", "Wake Island", "Wallis and Futuna", "Western Sahara", "Yemen", "Zambia", "Zimbabwe", "Åland Islands" }));

        jButton6.setText("choose image");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel17.setForeground(new java.awt.Color(0, 0, 255));
        jLabel17.setText("Disability");

        jComboBox2.setForeground(new java.awt.Color(0, 0, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel18.setForeground(new java.awt.Color(0, 0, 255));
        jLabel18.setText("Marital Status");

        jLabel19.setForeground(new java.awt.Color(0, 0, 255));
        jLabel19.setText("Place of Birth");

        jLabel20.setForeground(new java.awt.Color(0, 0, 255));
        jLabel20.setText("Date of Birth");

        jLabel21.setForeground(new java.awt.Color(0, 0, 255));
        jLabel21.setText("City");

        jComboBox3.setForeground(new java.awt.Color(0, 0, 255));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel22.setForeground(new java.awt.Color(0, 0, 255));
        jLabel22.setText("Email");

        jLabel23.setForeground(new java.awt.Color(0, 0, 255));
        jLabel23.setText("Street Adress");

        jLabel24.setForeground(new java.awt.Color(0, 0, 255));
        jLabel24.setText("Home Phone");

        jLabel25.setForeground(new java.awt.Color(0, 0, 255));
        jLabel25.setText("Work Phone");

        jLabel26.setForeground(new java.awt.Color(0, 0, 255));
        jLabel26.setText("mobile");

        jLabel27.setForeground(new java.awt.Color(0, 0, 255));
        jLabel27.setText("Profession");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField23)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel21)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19)
                            .addComponent(jLabel26))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField15)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField16)
                            .addComponent(jTextField21))))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25)
                            .addComponent(jLabel27))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField18)
                            .addComponent(jTextField19)
                            .addComponent(jTextField20)
                            .addComponent(jTextField22))))
                .addGap(90, 90, 90))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jButton6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel24)
                        .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel25))
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 28, Short.MAX_VALUE))
        );

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 51, 255))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(0, 102, 204));

        jLabel29.setForeground(new java.awt.Color(0, 0, 255));
        jLabel29.setText("Id");

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));

        labelImage.setBackground(new java.awt.Color(255, 255, 51));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelImage, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
        );

        jLabel31.setForeground(new java.awt.Color(0, 0, 255));
        jLabel31.setText("First Name");

        jLabel32.setForeground(new java.awt.Color(0, 0, 255));
        jLabel32.setText("Middle Name");

        jLabel33.setForeground(new java.awt.Color(0, 0, 255));
        jLabel33.setText("Last Name");

        jLabel34.setForeground(new java.awt.Color(0, 0, 255));
        jLabel34.setText("Gender");

        jLabel35.setForeground(new java.awt.Color(0, 0, 255));
        jLabel35.setText("Nationality");

        jTextField26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField26ActionPerformed(evt);
            }
        });

        jComboBox4.setForeground(new java.awt.Color(0, 0, 255));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ethiopia", "Afghanistan", "Albania", "Algeria", "American Samoa", "Andorra", "Angola", "Anguilla", "Antarctica", "Antigua and Barbuda", "Argentina", "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana", "Bouvet Island", "Brazil", "British Antarctic Territory", "British Indian Ocean Territory", "British Virgin Islands", "Brunei", "Bulgaria", "Burkina Faso", "Burundi", "Cambodia", "Cameroon", "Canada", "Canton and Enderbury Islands", "Cape Verde", "Cayman Islands", "Central African Republic", "Chad", "Chile", "China", "Christmas Island", "Cocos [Keeling] Islands", "Colombia", "Comoros", "Congo - Brazzaville", "Congo - Kinshasa", "Cook Islands", "Costa Rica", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Côte d’Ivoire", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "Dronning Maud Land", "East Germany", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Falkland Islands", "Faroe Islands", "Fiji", "Finland", "France", "French Guiana", "French Polynesia", "French Southern Territories", "French Southern and Antarctic Territories", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Gibraltar", "Greece", "Greenland", "Grenada", "Guadeloupe", "Guam", "Guatemala", "Guernsey", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Heard Island and McDonald Islands", "Honduras", "Hong Kong SAR China", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland", "Isle of Man", "Israel", "Italy", "Jamaica", "Japan", "Jersey", "Johnston Island", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Macau SAR China", "Macedonia", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Martinique", "Mauritania", "Mauritius", "Mayotte", "Metropolitan France", "Mexico", "Micronesia", "Midway Islands", "Moldova", "Monaco", "Mongolia", "Montenegro", "Montserrat", "Morocco", "Mozambique", "Myanmar [Burma]", "Namibia", "Nauru", "Nepal", "Netherlands", "Netherlands Antilles", "Neutral Zone", "New Caledonia", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Niue", "Norfolk Island", "North Korea", "North Vietnam", "Northern Mariana Islands", "Norway", "Oman", "Pacific Islands Trust Territory", "Pakistan", "Palau", "Palestinian Territories", "Panama", "Panama Canal Zone", "Papua New Guinea", "Paraguay", "People's Democratic Republic of Yemen", "Peru", "Philippines", "Pitcairn Islands", "Poland", "Portugal", "Puerto Rico", "Qatar", "Romania", "Russia", "Rwanda", "Réunion", "Saint Barthélemy", "Saint Helena", "Saint Kitts and Nevis", "Saint Lucia", "Saint Martin", "Saint Pierre and Miquelon", "Saint Vincent and the Grenadines", "Samoa", "San Marino", "Saudi Arabia", "Senegal", "Serbia", "Serbia and Montenegro", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Georgia and the South Sandwich Islands", "South Korea", "Spain", "Sri Lanka", "Sudan", "Suriname", "Svalbard and Jan Mayen", "Swaziland", "Sweden", "Switzerland", "Syria", "São Tomé and Príncipe", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Timor-Leste", "Togo", "Tokelau", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Turks and Caicos Islands", "Tuvalu", "U.S. Minor Outlying Islands", "U.S. Miscellaneous Pacific Islands", "U.S. Virgin Islands", "Uganda", "Ukraine", "Union of Soviet Socialist Republics", "United Arab Emirates", "United Kingdom", "United States", "Unknown or Invalid Region", "Uruguay", "Uzbekistan", "Vanuatu", "Vatican City", "Venezuela", "Vietnam", "Wake Island", "Wallis and Futuna", "Western Sahara", "Yemen", "Zambia", "Zimbabwe", "Åland Islands" }));

        jButton7.setText("choose image");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel36.setForeground(new java.awt.Color(0, 0, 255));
        jLabel36.setText("Disability");

        jComboBox5.setForeground(new java.awt.Color(0, 0, 255));
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No", "Disable" }));

        jLabel37.setForeground(new java.awt.Color(0, 0, 255));
        jLabel37.setText("Marital Status");

        jLabel38.setForeground(new java.awt.Color(0, 0, 255));
        jLabel38.setText("Place of Birth");

        jLabel39.setForeground(new java.awt.Color(0, 0, 255));
        jLabel39.setText("Date of Birth");

        jLabel40.setForeground(new java.awt.Color(0, 0, 255));
        jLabel40.setText("City");

        jComboBox6.setForeground(new java.awt.Color(0, 0, 255));
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Single", "Maried", "Divorced" }));

        jLabel41.setForeground(new java.awt.Color(0, 0, 255));
        jLabel41.setText("Email");

        jLabel42.setForeground(new java.awt.Color(0, 0, 255));
        jLabel42.setText("Street Adress");

        jLabel43.setForeground(new java.awt.Color(0, 0, 255));
        jLabel43.setText("Home Phone");

        jLabel44.setForeground(new java.awt.Color(0, 0, 255));
        jLabel44.setText("Work Phone");

        jLabel45.setForeground(new java.awt.Color(0, 0, 255));
        jLabel45.setText("mobile");

        jLabel46.setForeground(new java.awt.Color(0, 0, 255));
        jLabel46.setText("Profession");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("male");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("female");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel32))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel35)
                                    .addComponent(jLabel36))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField25, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField27, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField26, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField24, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40)
                            .addComponent(jLabel39)
                            .addComponent(jLabel45)
                            .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField28)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField29)
                            .addComponent(jTextField34))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel46)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel44)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel43)
                                        .addGap(24, 24, 24)
                                        .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel42)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel34)
                                    .addComponent(jRadioButton1))
                                .addGap(15, 15, 15))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jRadioButton2)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel36))
                    .addComponent(jButton7))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel42)
                        .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel38))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel45))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel46))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Emergency Contact", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 51, 255))); // NOI18N

        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Full Name");

        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Relation");

        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("Email");

        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("mobile");

        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setText("occupation");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Family Back Ground", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(51, 51, 255))); // NOI18N
        jPanel9.setForeground(new java.awt.Color(0, 102, 204));

        jLabel47.setForeground(new java.awt.Color(0, 0, 255));
        jLabel47.setText("Full Name");

        jLabel48.setForeground(new java.awt.Color(0, 0, 255));
        jLabel48.setText("Relation");

        jLabel49.setForeground(new java.awt.Color(0, 0, 255));
        jLabel49.setText("Occupation");

        jLabel50.setForeground(new java.awt.Color(0, 0, 255));
        jLabel50.setText("Date of birth");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel51)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel47)
                            .addComponent(jLabel48)
                            .addComponent(jLabel49)
                            .addComponent(jLabel50))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField37)
                            .addComponent(jTextField38)
                            .addComponent(jTextField39)
                            .addComponent(jDateChooser3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel47)
                            .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel48)
                            .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel49)
                            .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel50))
                    .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel51)
                .addGap(22, 22, 22))
        );

        jPanel7.setBackground(new java.awt.Color(204, 255, 204));

        add.setBackground(new java.awt.Color(204, 255, 204));
        add.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add.setForeground(new java.awt.Color(51, 51, 255));
        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manager/add-event-icon.png"))); // NOI18N
        add.setText("add");
        add.setBorder(null);
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(204, 255, 204));
        update.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update.setForeground(new java.awt.Color(0, 51, 255));
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manager/Text-Edit-icon (1).png"))); // NOI18N
        update.setText("update");
        update.setBorder(null);
        update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(204, 255, 204));
        delete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        delete.setForeground(new java.awt.Color(0, 51, 255));
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manager/Button-Cancel-icon (1).png"))); // NOI18N
        delete.setText("delete");
        delete.setBorder(null);
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 255, 204));
        jButton2.setForeground(new java.awt.Color(0, 51, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manager/Clear-icon (1).png"))); // NOI18N
        jButton2.setText("Clear");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 255, 204));
        jButton3.setForeground(new java.awt.Color(0, 51, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manager/Logout-icon (1).png"))); // NOI18N
        jButton3.setText("Log out");
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(add, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTextField41.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField41KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField41KeyTyped(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 51, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manager/Search-icon (1).png"))); // NOI18N
        jButton1.setText("Search");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        close.setBackground(new java.awt.Color(204, 255, 204));
        close.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        close.setForeground(new java.awt.Color(0, 51, 255));
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manager/Windows-Close-Program-icon (1).png"))); // NOI18N
        close.setText("close");
        close.setBorder(null);
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 51, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manager/Security-Password-2-icon (1).png"))); // NOI18N
        jButton4.setText("Change Password");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButton5.setText("Upload File");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton8.setText("view all");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(jButton8)
                                    .addGap(37, 37, 37)
                                    .addComponent(jButton5)))
                            .addGap(31, 31, 31))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(46, 46, 46)
                            .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton4)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1362, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(331, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(jTextField41))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton8)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(445, 445, 445))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        JFileChooser chooser =new  JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        filename=f.getAbsolutePath();
        jLabel13.setIcon(new ImageIcon(f.toString()));
        ImageIcon imagecon=new  ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(jLabel28.getWidth(), jLabel28.getHeight(),Image.SCALE_DEFAULT ));
        jLabel28.setIcon(imagecon);
        try{
            File image=new File(filename);
            FileInputStream fis=new FileInputStream(image);
            ByteArrayOutputStream bos=new  ByteArrayOutputStream ();
            byte[] buf=new byte[1024];
            for(int readNum;(readNum=fis.read(buf))!=-1;){
                bos.write(buf,0,readNum);
            }
            person_image=bos.toByteArray();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);

        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField26ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        JFileChooser    filechooser=new JFileChooser();
        filechooser.setPreferredSize(new Dimension(1000,600));
        filechooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter=new FileNameExtensionFilter("images","jpg","gif","png","GIF");
        filechooser.addChoosableFileFilter(filter);
        int result=filechooser.showSaveDialog(null);
        if(result==JFileChooser.APPROVE_OPTION){
            File selectedFile=filechooser.getSelectedFile();
            String path=selectedFile.getAbsolutePath();
            labelImage.setIcon(ResizeImage(path,null));
            S=path;
        }
        else if(result==JFileChooser.CANCEL_OPTION){
            System.out.println("no data");
        }
    }//GEN-LAST:event_jButton7ActionPerformed
public void search(String a){
     
        if(a.equals("")){
          JOptionPane.showMessageDialog(null,"please insert an id to search");  
        }
        else{ try{
           String url = "jdbc:mysql://localhost/record"; 
           Connection conn = DriverManager.getConnection(url,"root","");
           String sql= "select*from personalinfo where id=?";
           PreparedStatement pstmt = conn.prepareStatement(sql);  
           pstmt.setString(1, a);
           ResultSet rs=pstmt.executeQuery();
           if(rs.next()){
           String id=rs.getString("id"); 
           jTextField24.setText(id);
           String first=rs.getString("firstname"); 
           jTextField25.setText(first);
           String middle=rs.getString("middlename"); 
           jTextField26.setText(middle);
           String last=rs.getString("lastname"); 
           jTextField27.setText(last);
           String gender=rs.getString("gender"); 
         //  jTextField36.setText(gender);
           String marital=rs.getString("marital"); 
          // jTextField49.setText(marital);
           String dis=rs.getString("disability"); 
          // jTextField51.setText(dis);
           String nation=rs.getString("nation"); 
           //jTextField50.setText(nation);
           String place=rs.getString("placebirth"); 
           jTextField28.setText(place);
           String city=rs.getString("city"); 
           jTextField29.setText(city);
           String email=rs.getString("email"); 
           jTextField30.setText(email);
           String street=rs.getString("streetadress"); 
           jTextField31.setText(street);
           int mobil=rs.getInt("mobile"); 
           String s=String.valueOf(mobil);  
           jTextField34.setText(s);
           int work=rs.getInt("workphone"); 
           String wr=String.valueOf(work);  
           jTextField33.setText(wr);
           int home=rs.getInt("homephone"); 
           String hm=String.valueOf(home);  
           jTextField32.setText(hm);
          String pro=rs.getString("profession");
            jTextField35.setText(pro);
           //SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
           String dat = rs.getString("datebirth"); 
     if(rs.getBytes("image")!=null){
     byte[] img=rs.getBytes("image");
     ImageIcon image=new ImageIcon(img);
     Image im=image.getImage();
     Image myimage=im.getScaledInstance(labelImage.getWidth(), labelImage.getHeight(), Image.SCALE_SMOOTH);
     ImageIcon newImage=new ImageIcon(myimage);
     labelImage.setIcon(newImage);
      }else{
       labelImage.setIcon(null);   
      }
          // Date da = (Date) formatter.parse(dat);
           //jDateChooser4.setDate(da);
           //jTextField52.setText(dat);
           //jLabel28.setIcon(ResizeImage(null,rs.getBytes("image")));
           }
           else if(a.contains(" ")){
               JOptionPane.showMessageDialog(null,"please insert an id to search"); 
           }
           else{
            JOptionPane.showMessageDialog(null,"there is no recordee with this id");   
           }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
         try{
           String url = "jdbc:mysql://localhost/record"; 
           Connection conn = DriverManager.getConnection(url,"root","");
           String sql= "select*from emergencycontact where id=?";
           PreparedStatement pstmt = conn.prepareStatement(sql);  
           pstmt.setString(1, a);
           ResultSet rs=pstmt.executeQuery();
           if(rs.next()){
          
           String full=rs.getString("fullname"); 
           jTextField6.setText(full);
           String  rel=rs.getString("relation"); 
           jTextField7.setText(rel);
           String em=rs.getString("email"); 
           jTextField8.setText(em);
           String mob=rs.getString("mobile"); 
           jTextField9.setText(mob);
           String oc=rs.getString("occupation"); 
           jTextField10.setText(oc);
             }
            }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        try{
           String url = "jdbc:mysql://localhost/record"; 
           Connection conn = DriverManager.getConnection(url,"root","");
           String sql= "select*from emergencycontact where id=?";
           PreparedStatement pstmt = conn.prepareStatement(sql);  
           pstmt.setString(1, a);
           ResultSet rs=pstmt.executeQuery();
           if(rs.next()){
          
           String fulf=rs.getString("fullname"); 
           jTextField37.setText(fulf);
           String re=rs.getString("relation"); 
           jTextField38.setText(re);
           String oc=rs.getString("occupation"); 
           jTextField39.setText(oc);
             }
            }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        }
}
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        String id=jTextField24.getText();
        if(id.equals("")){
            JOptionPane.showMessageDialog(null, "please fill the text to add the record");
        }
        
        /*else if(date.equals(" ")){
            JOptionPane.showMessageDialog(null, "date of birth is mandatory" ,
                "data insertion", JOptionPane.PLAIN_MESSAGE);
        }
        else if(first.equals(" ")){
            JOptionPane.showMessageDialog(null, "first name is mandatory" ,
                "data insertion", JOptionPane.PLAIN_MESSAGE);
        }
        else if(middle.equals(" ")){
            JOptionPane.showMessageDialog(null, " middle name is mandatory" ,
                "data insertion", JOptionPane.PLAIN_MESSAGE);
        }
        else if(last.equals(" ")){
            JOptionPane.showMessageDialog(null, "last name is mandatory" ,
                "data insertion", JOptionPane.PLAIN_MESSAGE);
        }
        else if(nation.equals(" ")){
            JOptionPane.showMessageDialog(null, "nationility is mandatory" ,
                "data insertion", JOptionPane.PLAIN_MESSAGE);
        }
        else if(mobile.equals(" ")){
            JOptionPane.showMessageDialog(null, "mobile number  is mandatory" ,
                "data insertion", JOptionPane.PLAIN_MESSAGE);
        }
        else  if(email.equals(" ")){
            JOptionPane.showMessageDialog(null, "email is mandatory" ,
                "data insertion", JOptionPane.PLAIN_MESSAGE);
        }
        else if(place.equals(" ")){
            JOptionPane.showMessageDialog(null, "birth place  is mandatory" ,
                "data insertion", JOptionPane.PLAIN_MESSAGE);
        }
        else if(fulle.equals(" ")){
            JOptionPane.showMessageDialog(null, "name of the emergency is mandatory" ,
                "data insertion", JOptionPane.PLAIN_MESSAGE);
        }
        else if(fullf.equals(" ")){
            JOptionPane.showMessageDialog(null, "name of the fammilly is mandatory" ,
                "data insertion", JOptionPane.PLAIN_MESSAGE);
        }
        else if(relation.equals(" ")){
            JOptionPane.showMessageDialog(null, "relation  of the emergemcy contact is mandatory" ,
                "data insertion", JOptionPane.PLAIN_MESSAGE);
        }
        else if(relate.equals(" ")){
            JOptionPane.showMessageDialog(null, "relation  of the fammily contact is mandatory" ,
                "data insertion", JOptionPane.PLAIN_MESSAGE);
        }
        else if(mobilee.equals(" ")){
            JOptionPane.showMessageDialog(null, "mobile of the emergemcy contact is mandatory" ,
                "data insertion", JOptionPane.PLAIN_MESSAGE);
        }*/
        /* else  if(gender.equals("")){
            JOptionPane.showMessageDialog(null, "gender is mandatory" ,
                "data insertion", JOptionPane.PLAIN_MESSAGE);
        }*/
        else{
            String first=jTextField25.getText();
        String middle=jTextField26.getText();
        String last=jTextField27.getText();
        String place=jTextField28.getText();
        String work=jTextField33.getText();
        String home=jTextField32.getText();
        String mobile=jTextField34.getText();
        int mobile1=Integer.parseInt(mobile);
        int work1=Integer.parseInt(work);
        int home1=Integer.parseInt(home);
        String city=jTextField29.getText();
        String email=jTextField30.getText();
        String street=jTextField31.getText();
        String marital =jComboBox6.getSelectedItem().toString();
        String nation =jComboBox4.getSelectedItem().toString();
        String dis =jComboBox5.getSelectedItem().toString();
        String pro=jTextField35.getText();
        String date=((JTextField)jDateChooser2.getDateEditor().getUiComponent()).getText();
      
       //for the emergency contact
        
        String fulle=jTextField6.getText();
        String relation=jTextField7.getText();
        String emaile=jTextField8.getText();
        String mobilee=jTextField9.getText();
        int mobilee1=Integer.parseInt(mobilee);
        String ocupation=jTextField10.getText();
        //for the fammilly back ground
        String fullf=jTextField37.getText();
        String relate=jTextField38.getText();
        String occu=jTextField39.getText();
        String datebirth= ((JTextField)jDateChooser3.getDateEditor().getUiComponent()).getText();
            try {
                String url = "jdbc:mysql://localhost/record";
                Connection conn = DriverManager.getConnection(url,"root","");
                //Statement st = conn.createStatement();
                String sql= "INSERT INTO personalinfo(id, firstname, middlename, lastname, gender, marital, nation, disability,"
                + " placebirth,datebirth, city, streetadress, email, mobile,"
                + " workphone, homephone, profession, image) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, id);
                pstmt.setString(2, first);
                pstmt.setString(3, middle);
                pstmt.setString(4, last);
                pstmt.setString(5, gender);
                pstmt.setString(6, marital);
                pstmt.setString(7, nation);
                pstmt.setString(8, dis);
                pstmt.setString(9, place);
                pstmt.setString(10, date);
                pstmt.setString(11, city);
                pstmt.setString(12, street);
                pstmt.setString(13, email);
                pstmt.setInt(14, mobile1);
                pstmt.setInt(15, work1);
                pstmt.setInt(16, home1);
                pstmt.setString(17, pro);
               if(S!=null){
                 InputStream is=new FileInputStream(new File(S));
                 pstmt.setBlob(18, is);
             }else{
                 pstmt.setBlob(18,(InputStream)null);
             }
                pstmt.executeUpdate();
                
                conn.close();

            } catch (Exception e) {
                System.err.println("Got an exception! ");
                JOptionPane.showMessageDialog(null,e);

            }
            try{
             String url = "jdbc:mysql://localhost/record";
                Connection conn = DriverManager.getConnection(url,"root","");
                String sql= "INSERT INTO emergencycontact(id, fullname,relation, email, mobile, occupation)"
                + " VALUES (?,?,?,?,?,?)";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, id);
                pstmt.setString(2, fulle);
                pstmt.setString(3, relation);
                pstmt.setString(4, emaile);
                pstmt.setInt(5, mobilee1);  
                pstmt.setString(6, ocupation);  
                pstmt.executeUpdate();
                conn.close();
            }catch(Exception e){
              //JOptionPane.showMessageDialog(null,e);  
            }
            try{
                String url = "jdbc:mysql://localhost/record";
                Connection conn = DriverManager.getConnection(url,"root","");
                //Statement st = conn.createStatement();
                String sql= "INSERT INTO   fammilybackground(id, fullname,relation, occupation,datofbirth) VALUES (?,?,?,?,?)";

                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, id);
                pstmt.setString(2, fullf);
                pstmt.setString(3, relate);
                pstmt.setString(4, occu);
                pstmt.setString(5, datebirth);  
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "successfully inserted" ,
                    "data insertion", JOptionPane.PLAIN_MESSAGE);
                conn.close();
            }catch(Exception e){
              //JOptionPane.showMessageDialog(null,e);  
            }
            
        }
 fetch();
    }//GEN-LAST:event_addActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        String id1=jTextField41.getText();
        String id=jTextField24.getText();
        
        /*if(id.equals("")&&id1.equals("")&&fulle.equals("")&&relation.equals("")&&emaile.equals("")
                &&mobilee.equals("")&&ocupation.equals("")&&fullf.equals("")&&relate.equals("")&&occu.equals("")&datebirth.equals("")
              &&first.equals("")&&last.equals("")&&middle.equals("") &&place.equals("")&&work.equals("")&&home.equals("")&&mobile.equals("") 
               &&city.equals("")&&email.equals("")&&street.equals("")&&marital.equals("")&&nation.equals("")
                &&dis.equals("")&&pro.equals("")&&date.equals("")&&S==null) {
          JOptionPane.showMessageDialog(null,"please select a recordee to update");  
        }*/
        if(id.equals("")){
           JOptionPane.showMessageDialog(null,"please select to update"); 
        }
        else{
            String first=jTextField25.getText();
        String middle=jTextField26.getText();
        String last=jTextField27.getText();
        String place=jTextField28.getText();
        String work=jTextField33.getText();
        String home=jTextField32.getText();
        String mobile=jTextField34.getText();
        int mobile1=Integer.parseInt(mobile);
        int work1=Integer.parseInt(work);
        int home1=Integer.parseInt(home);
        String city=jTextField29.getText();
        String email=jTextField30.getText();
        String street=jTextField31.getText();
        //String gender =jComboBox1.getSelectedItem().toString();
        String marital =jComboBox6.getSelectedItem().toString();
        String nation =jComboBox4.getSelectedItem().toString();
        String dis =jComboBox5.getSelectedItem().toString();
        String pro=jTextField35.getText();
        String date=((JTextField)jDateChooser2.getDateEditor().getUiComponent()).getText();
       // String gender=jTextField36.getText();
         String fulle=jTextField6.getText();
        String relation=jTextField7.getText();
        String emaile=jTextField8.getText();
        String mobilee=jTextField9.getText();
        int mobilee1=Integer.parseInt(mobilee);
        String ocupation=jTextField10.getText();
        //int number = Integer.parseInt(mobile);
        String fullf=jTextField37.getText();
        String relate=jTextField38.getText();
        String occu=jTextField39.getText();
        String datebirth= ((JTextField)jDateChooser3.getDateEditor().getUiComponent()).getText();
           int p=JOptionPane.showConfirmDialog(null, "Are you sure you want to update this recrdee"," delete", 
               JOptionPane.YES_NO_OPTION);
               if(p==0){ 
           try {
            
            String url = "jdbc:mysql://localhost/record";
            Connection conn = DriverManager.getConnection(url,"root","");
            //Statement st = conn.createStatement();
            String sql= "update personalinfo set id='"+id+"' ,firstname='"+first+"',lastname='"+last+"',middlename='"+middle+"',placebirth='"+place+"'"
            + ",mobile='"+mobile1+"',workphone='"+work1+"',homephone='"+home1+"',city='"+city+"',email='"+email+"'"
            + ",streetadress='"+street+"',marital='"+marital+"',nation='"+nation+"',disability='"+dis+"'"
            + ",profession='"+pro+"',datebirth='"+date+"',image=? where id='"+id+"'";
              
            PreparedStatement pstmt = conn.prepareStatement(sql);
            if(S!=null){
                 InputStream is=new FileInputStream(new File(S));
                 pstmt.setBlob(1, is);
             }else{
                try{
           String ur = "jdbc:mysql://localhost/record"; 
           Connection con = DriverManager.getConnection(url,"root","");
           String sq= "select*from personalinfo where id=?";
           PreparedStatement pstm = con.prepareStatement(sq);  
           pstm.setString(1, id);
           ResultSet r=pstm.executeQuery();
            if(r.next()){
             // pstmt.setBlob(1,((outputStream))r.getBytes("image"));
               Icon a=labelImage.getIcon();
               //pstmt.setBlob(1,   a);
              // ImageIcon c=ResizeImage(null,a);
               }
                }catch(Exception e){
                    
                }
           
             }
            pstmt.execute();
           
        } catch (Exception e) {
            //System.err.println("Got an er! ");
         //   JOptionPane.showMessageDialog(null,e);
        }
        try {
           
            String url = "jdbc:mysql://localhost/record";
            Connection conn = DriverManager.getConnection(url,"root","");
                   String sql= "update emergencycontact set id='"+id+"', mobile='"+mobilee1+"'"
                    + ",fullname='"+fulle+"',relation='"+relation+"',"
                    + "occupation='"+ocupation+"',email='"+emaile+"' where id='"+id+"'";
                   PreparedStatement pstmt = conn.prepareStatement(sql);
                   pstmt.execute();
            
        } catch (Exception e) {
            System.err.println("Got an exception! ");
          JOptionPane.showMessageDialog(null," emerge"+e);
        }
        try {
            String url = "jdbc:mysql://localhost/record"; 
            Connection conn = DriverManager.getConnection(url,"root","");
            //Statement st = conn.createStatement();
            String sql= "update fammilybackground set id='"+id+"',fullname='"+fullf+"',relation='"+relate+"',"
                    + "occupation='"+occu+"',datofbirth='"+datebirth+"' where id='"+id+"'";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.execute();
            JOptionPane.showMessageDialog(null,"data successfully updated");
            //conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            JOptionPane.showMessageDialog(null," fam"+e);
        }
          fetch();
         }
       
        }
       
    }//GEN-LAST:event_updateActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         String d=jTextField41.getText();
        if(d.equals("")){
          JOptionPane.showMessageDialog(null,"please insert an id to search");  
        }
        else{ try{
           String url = "jdbc:mysql://localhost/record"; 
           Connection conn = DriverManager.getConnection(url,"root","");
           String sql= "select*from personalinfo where id=?";
           PreparedStatement pstmt = conn.prepareStatement(sql);  
           pstmt.setString(1, d);
           ResultSet rs=pstmt.executeQuery();
           if(rs.next()){
           String id=rs.getString("id"); 
           jTextField24.setText(id);
           String first=rs.getString("firstname"); 
           jTextField25.setText(first);
           String middle=rs.getString("middlename"); 
           jTextField26.setText(middle);
           String last=rs.getString("lastname"); 
           jTextField27.setText(last);
           String gender=rs.getString("gender"); 
         //  jTextField36.setText(gender);
           String marital=rs.getString("marital"); 
          // jTextField49.setText(marital);
           String dis=rs.getString("disability"); 
          // jTextField51.setText(dis);
           String nation=rs.getString("nation"); 
           //jTextField50.setText(nation);
           String place=rs.getString("placebirth"); 
           jTextField28.setText(place);
           String city=rs.getString("city"); 
           jTextField29.setText(city);
           String email=rs.getString("email"); 
           jTextField30.setText(email);
           String street=rs.getString("streetadress"); 
           jTextField31.setText(street);
           int mobil=rs.getInt("mobile"); 
           String s=String.valueOf(mobil);  
           jTextField34.setText(s);
           int work=rs.getInt("workphone"); 
           String wr=String.valueOf(work);  
           jTextField33.setText(wr);
           int home=rs.getInt("homephone"); 
           String hm=String.valueOf(home);  
           jTextField32.setText(hm);
          String pro=rs.getString("profession");
            jTextField35.setText(pro);
           //SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
           String dat = rs.getString("datebirth"); 
     if(rs.getBytes("image")!=null){
     byte[] img=rs.getBytes("image");
     ImageIcon image=new ImageIcon(img);
     Image im=image.getImage();
     Image myimage=im.getScaledInstance(labelImage.getWidth(), labelImage.getHeight(), Image.SCALE_SMOOTH);
     ImageIcon newImage=new ImageIcon(myimage);
     labelImage.setIcon(newImage);
      }else{
       labelImage.setIcon(null);   
      }
         
           }
           else if(d.contains(" ")){
               JOptionPane.showMessageDialog(null,"please insert an id to search"); 
           }
           else{
            JOptionPane.showMessageDialog(null,"there is no recordee with this id");   
           }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        try{
           String url = "jdbc:mysql://localhost/record"; 
           Connection conn = DriverManager.getConnection(url,"root","");
           String sql= "select*from emergencycontact where id=?";
           PreparedStatement pstmt = conn.prepareStatement(sql);  
           pstmt.setString(1, d);
           ResultSet rs=pstmt.executeQuery();
           if(rs.next()){
          
           String full=rs.getString("fullname"); 
           jTextField6.setText(full);
           String  rel=rs.getString("relation"); 
           jTextField7.setText(rel);
           String em=rs.getString("email"); 
           jTextField8.setText(em);
           String mob=rs.getString("mobile"); 
           jTextField9.setText(mob);
           String oc=rs.getString("occupation"); 
           jTextField10.setText(oc);
             }
            }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        try{
           String url = "jdbc:mysql://localhost/record"; 
           Connection conn = DriverManager.getConnection(url,"root","");
           String sql= "select*from fammilybackground where id=?";
           PreparedStatement pstmt = conn.prepareStatement(sql);  
           pstmt.setString(1, d);
           ResultSet rs=pstmt.executeQuery();
           if(rs.next()){
          
           String fulf=rs.getString("fullname"); 
           jTextField37.setText(fulf);
           String re=rs.getString("relation"); 
           jTextField38.setText(re);
           String oc=rs.getString("occupation"); 
           jTextField39.setText(oc);
             }
            }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       jTextField41.setText("");
       jTextField24.setText("");
       jTextField25.setText("");
       jTextField26.setText("");
       jTextField27.setText("");
       jTextField28.setText("");
       jTextField29.setText("");
       jTextField30.setText("");
       jTextField31.setText("");
       jTextField32.setText("");
       jTextField33.setText("");
       jTextField34.setText("");
       jTextField35.setText("");
      // jTextField36.setText("");
       labelImage.setIcon(null);
       jTextField6.setText("");
       jTextField7.setText("");
       jTextField8.setText("");
       jTextField9.setText("");
       jTextField10.setText("");
        jTextField37.setText("");
       jTextField38.setText("");
       jTextField39.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       login log=new login();
       log.setVisible(true);
       setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
          
          String id=jTextField24.getText();
          String id1=jTextField41.getText();
           if(id.equals("")&&id1.equals("")){
           JOptionPane.showMessageDialog(null, " please select a recordee to delete");   
           }   
           else { 
               int p=JOptionPane.showConfirmDialog(null, "Are you sure want to delete this recrdee"," delete", 
               JOptionPane.YES_NO_OPTION);
               if(p==0){
                 try{
                     String url = "jdbc:mysql://localhost/record"; 
                     Connection conn = DriverManager.getConnection(url,"root","");
                     String sql= " delete from personalinfo where id=?";
                     PreparedStatement pstmt = conn.prepareStatement(sql);  
                     pstmt.setString(1, id);
                     pstmt.execute(); 
                   
          }catch(Exception e){
              JOptionPane.showMessageDialog(null, " you hava an error");
          }
                 fetch();
           try{
                     String url = "jdbc:mysql://localhost/record"; 
                     Connection conn = DriverManager.getConnection(url,"root","");
                     String sql= " delete from emergencycontact where id=?";
                     PreparedStatement pstmt = conn.prepareStatement(sql);  
                     pstmt.setString(1, id);
                     pstmt.execute(); 
                     
          }catch(Exception e){
              JOptionPane.showMessageDialog(null, " you hava an error");
          }
           fetch();
           try{
                     String url = "jdbc:mysql://localhost/record"; 
                     Connection conn = DriverManager.getConnection(url,"root","");
                     String sql= " delete from fammilybackground where id=?";
                     PreparedStatement pstmt = conn.prepareStatement(sql);  
                     pstmt.setString(1, id);
                     pstmt.execute(); 
                     JOptionPane.showMessageDialog(null, " deleted");
          }catch(Exception e){
              JOptionPane.showMessageDialog(null, " you hava an error");
          }
           fetch();
          }
          
          }  
    }//GEN-LAST:event_deleteActionPerformed

    private void jTextField41KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField41KeyPressed
    if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        String d=jTextField41.getText();
        if(d.equals("")){
          JOptionPane.showMessageDialog(null,"please insert an id to search");  
        }
        else{ try{
           String url = "jdbc:mysql://localhost/record"; 
           Connection conn = DriverManager.getConnection(url,"root","");
           String sql= "select*from personalinfo where id=?";
           PreparedStatement pstmt = conn.prepareStatement(sql);  
           pstmt.setString(1, d);
           ResultSet rs=pstmt.executeQuery();
           if(rs.next()){
           String id=rs.getString("id"); 
           jTextField24.setText(id);
           String first=rs.getString("firstname"); 
           jTextField25.setText(first);
           String middle=rs.getString("middlename"); 
           jTextField26.setText(middle);
           String last=rs.getString("lastname"); 
           jTextField27.setText(last);
           String gender=rs.getString("gender"); 
         //  jTextField36.setText(gender);
           String marital=rs.getString("marital"); 
          // jTextField49.setText(marital);
           String dis=rs.getString("disability"); 
          // jTextField51.setText(dis);
           String nation=rs.getString("nation"); 
           //jTextField50.setText(nation);
           String place=rs.getString("placebirth"); 
           jTextField28.setText(place);
           String city=rs.getString("city"); 
           jTextField29.setText(city);
           String email=rs.getString("email"); 
           jTextField30.setText(email);
           String street=rs.getString("streetadress"); 
           jTextField31.setText(street);
           int mobil=rs.getInt("mobile"); 
           String s=String.valueOf(mobil);  
           jTextField34.setText(s);
           int work=rs.getInt("workphone"); 
           String wr=String.valueOf(work);  
           jTextField33.setText(wr);
           int home=rs.getInt("homephone"); 
           String hm=String.valueOf(home);  
           jTextField32.setText(hm);
          String pro=rs.getString("profession");
            jTextField35.setText(pro);
           //SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
           String dat = rs.getString("datebirth"); 
     if(rs.getBytes("image")!=null){
     byte[] img=rs.getBytes("image");
     ImageIcon image=new ImageIcon(img);
     Image im=image.getImage();
     Image myimage=im.getScaledInstance(labelImage.getWidth(), labelImage.getHeight(), Image.SCALE_SMOOTH);
     ImageIcon newImage=new ImageIcon(myimage);
     labelImage.setIcon(newImage);
      }else{
       labelImage.setIcon(null);   
      }
         
           }
           else if(d.contains(" ")){
               JOptionPane.showMessageDialog(null,"please insert an id to search"); 
           }
           else{
            JOptionPane.showMessageDialog(null,"there is no recordee with this id");   
           }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        try{
           String url = "jdbc:mysql://localhost/record"; 
           Connection conn = DriverManager.getConnection(url,"root","");
           String sql= "select*from emergencycontact where id=?";
           PreparedStatement pstmt = conn.prepareStatement(sql);  
           pstmt.setString(1, d);
           ResultSet rs=pstmt.executeQuery();
           if(rs.next()){
          
           String full=rs.getString("fullname"); 
           jTextField6.setText(full);
           String  rel=rs.getString("relation"); 
           jTextField7.setText(rel);
           String em=rs.getString("email"); 
           jTextField8.setText(em);
           String mob=rs.getString("mobile"); 
           jTextField9.setText(mob);
           String oc=rs.getString("occupation"); 
           jTextField10.setText(oc);
             }
            }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        try{
           String url = "jdbc:mysql://localhost/record"; 
           Connection conn = DriverManager.getConnection(url,"root","");
           String sql= "select*from fammilybackground where id=?";
           PreparedStatement pstmt = conn.prepareStatement(sql);  
           pstmt.setString(1, d);
           ResultSet rs=pstmt.executeQuery();
           if(rs.next()){
          
           String fulf=rs.getString("fullname"); 
           jTextField37.setText(fulf);
           String re=rs.getString("relation"); 
           jTextField38.setText(re);
           String oc=rs.getString("occupation"); 
           jTextField39.setText(oc);
             }
            }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
        } 
    }
    }//GEN-LAST:event_jTextField41KeyPressed

    private void jTextField41KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField41KeyTyped
       
    }//GEN-LAST:event_jTextField41KeyTyped

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
     gender ="male";
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        gender="female";
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      changepassword pa=new changepassword(username);
      pa.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        if((evt.getKeyCode()==KeyEvent.VK_UP)||(evt.getKeyCode()==KeyEvent.VK_DOWN)){
           try{
               
           
           DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
           int selectedRowIndex=jTable1.getSelectedRow();
           search(model.getValueAt(selectedRowIndex,0).toString());
         /*  jTextField25.setText(model.getValueAt(selectedRowIndex,1).toString());
           jTextField26.setText(model.getValueAt(selectedRowIndex,2).toString());
           jTextField27.setText(model.getValueAt(selectedRowIndex,3).toString());
           jTextField28.setText(model.getValueAt(selectedRowIndex,8).toString());
           jTextField29.setText(model.getValueAt(selectedRowIndex,9).toString());
           jTextField31.setText(model.getValueAt(selectedRowIndex,10).toString());
           jTextField30.setText(model.getValueAt(selectedRowIndex,11).toString());
           jTextField34.setText(model.getValueAt(selectedRowIndex,12).toString());
           jTextField33.setText(model.getValueAt(selectedRowIndex,13).toString());
           jTextField32.setText(model.getValueAt(selectedRowIndex,14).toString());
           jTextField35.setText(model.getValueAt(selectedRowIndex,15).toString());
           */
           }catch(Exception e){
               
           }
        }
    }//GEN-LAST:event_jTable1KeyPressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       try{
               
           
          DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
           int selectedRowIndex=jTable1.getSelectedRow();
           search(model.getValueAt(selectedRowIndex,0).toString());
           }catch(Exception e){
               
           }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       //from line1929 to 1933 it directs to the absolute path of the file
     /* JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
         filename2 = f.getAbsolutePath();
        try{            
            BufferedReader br=new BufferedReader(new FileReader( filename2));//this reads the file
            String line;
            while((line=br.readLine())!=null){
                String[] value=line.split(",");//this splits the first row using the comma separating. and the data put in the array value
                ArrayList<String> ci = new ArrayList<>();// is an array list to hold the data that we read aleady.
               //the codes from line 100 to 104 adds the value to the arraylist.
                ci.add(value[0]);
                ci.add(value[1]);
                ci.add(value[2]);
                ci.add(value[3]);
                ci.add(value[4]);
                ci.add(value[5]);
                ci.add(value[6]);
                ci.add(value[7]);
                ci.add(value[8]);
                ci.add(value[9]);
                ci.add(value[10]);
                ci.add(value[11]);
                ci.add(value[12]);
                ci.add(value[13]);
                ci.add(value[14]);
                ci.add(value[15]);
                ci.add(value[16]);
                ci.add(value[17]);
                ci.add(value[18]);
                ci.add(value[19]);
                ci.add(value[20]);
                ci.add(value[21]);
                ci.add(value[22]);
                ci.add(value[23]);
                ci.add(value[24]);
                ci.add(value[25]);
                perform cs=new perform(ci);// is the constractor of the perform class and intilised the value of the arraylist
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        JOptionPane.showMessageDialog(null,"sussfully uploaded");
        //fetch();*/
                         
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
      viewall v=new viewall();
      v.setVisible(true);
      setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Access.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Access.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Access.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Access.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Access().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton close;
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel labelImage;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
 private Image icon=null;
 //private Image ico=null;
String imagepath=null;
String filename=null;
String filenam=null;
byte[] person_image=null;
byte[] person=null;
String filename1=null;
String filename2=null;
    
}
