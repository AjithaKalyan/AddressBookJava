/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.views;

//vo object
//import mvc.models.Person;

//import mvc.controller.AddressBookController;

import java.awt.BorderLayout;
import java.awt.Color;
//import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.HashSet;
import java.util.Set;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JList;
import javax.swing.JPanel;
//import javax.swing.ListSelectionModel;

/**
 *
 * @author Admin
 */
public class AddressBookMainGUI {
    
    private JFrame frame;
    private NameListPanel contactListPanel;
    private DetailViewPanel detailsPanel;
    private JButton btn_add;
    private JButton btn_edit;
    private JButton btn_delete;
    private JButton btn_search;
    private JPanel panel_btn;
    
    
    
    
     //private ContactDialog add;
     
     
  
        
    public AddressBookMainGUI(String text){
        frame = new JFrame("Address Book Java FDP");
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        //frame.pack();
        frame.setLocationRelativeTo(null);
        //frame.setSize(500, 500);
      //  frame.pack();
        frame.setVisible(true);
     //   frame.pack();
        //frame.setVisible(true);
       // frame.setLocationRelativeTo(null);
         //frame.setVisible(true);
      //   frame.setContentPane(new ImageIcon("D:\\Tuilps.jpg"));
      // setContentPane(new JLabel(new ImageIcon("C:\\Users\\Computer\\Downloads\\colorful design.png")));
        
             
        contactListPanel=new NameListPanel();
        frame.getContentPane().add(contactListPanel,BorderLayout.WEST);
        contactListPanel.setBackground(Color.ORANGE);
       // contactListPanel.setBackground(ImageIO.read(new File("D://came.bmp"));
        // background.setBackground(ImageIO.read(new File("/path/to/your/image/on/your/disk")));
       /* JList names; 
                names= new JList<String>(nameList);
        Component add1 = contactListPanel.add(names);*/
        //contentPane.add(namesJList);
        // contactListPanel.add(J)
        /*
        nameList = person.getNameList();
        // namesJList = new JList<String>(items);
        //  contentPane.add(namesJList);
        contactList = new JList<String>(nameList);
        this.add(contactList);
         */
        // to be removed from commen=t frim line 66 to  line 67//
        detailsPanel=new DetailViewPanel();
        frame.getContentPane().add(detailsPanel,BorderLayout.CENTER);
        detailsPanel.setBackground(Color.PINK);
       
       
        panel_btn= new JPanel();
        panel_btn.setLayout(new GridLayout(1, 4));
        
        btn_add = new JButton("Add");
        
        panel_btn.add(btn_add);
        btn_add.setForeground(Color.red);
        ImageIcon badd = new ImageIcon("D:\\came.jpg");
    //JButton button = new JButton(water);
    //frame.add(button);
    //ImageIcon img = new ImageIcon("C:\\Users\\Aksi\\Documents\\NetBeansProjects\\test'\\src\\test\\Black_B.ico");
        btn_add.setIcon(badd);
        
    
        btn_edit = new JButton("Edit");
        panel_btn.add(btn_edit);
        btn_edit.setBackground(Color.GREEN);
        
        
        btn_delete = new JButton("Delete");
        panel_btn.add(btn_delete);
        btn_delete.setForeground(Color.YELLOW);
        
        btn_search = new JButton("Search");
        panel_btn.add(btn_search);
        btn_search.setForeground(Color.MAGENTA);
        
        frame.getContentPane().add(panel_btn,BorderLayout.SOUTH);
    }
    
    public NameListPanel getNameListPanel()
    {
        return contactListPanel;
    }
    
    public DetailViewPanel getDetailViewPanel()
    {
        return detailsPanel;
    }
    
  /*  public  Person addPerson(Person person)
    {
        return person;
    }
    */        
    /*
    
    public LayoutManager getPanelLayout() {
  return panel.getLayout();
}
    
    */
    //btn_add.add
    public JFrame getMainGUIFrame()
    {
        return frame;
    }
    public JButton getAdd(){ 
        return btn_add;
    }
    
    public JButton getEdit(){
        return btn_edit;
    }
    
    public JButton getDelete(){
        return btn_delete;
    }
    
    public JButton getSearch(){
        return btn_search;
    }
    public void setText(String text){
       // label.setText(text);
    }
    
    /*
  public void  populateList(String[] namesList){
      JList namesJList;
            namesJList = new JList<String>(namesList);
            contactListPanel.add(namesJList);
            namesJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
  }
    */
    
}
