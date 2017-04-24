package chatbot;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class chatBot extends JFrame {
    
    
    
    private JTextField txtEnter = new JTextField();
    private JTextArea txtChat = new JTextArea();
    public chatBot() {
    
        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setVisible(true);
        this.setResizable(false);
        this.setLayout(null);
        this.setTitle("CHATPOT AI project");
        txtEnter.setLocation(2, 540);
        txtEnter.setSize(590, 30);
        txtEnter.setFont(new Font("Courier New", Font.ITALIC, 22));
        txtChat.setFont(new Font("Courier New", Font.ITALIC, 22));
        txtEnter.setForeground(Color.BLUE);
        txtChat.setForeground(Color.BLUE);

        
        txtEnter.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                                
                String text = txtEnter.getText();
                txtChat.append("You: " + text + "\n");
              
            if(text.contains("hi")){
                    botSay("Hello there!");
                }
                else if(text.contains("how are you")){
                    //Math.random   
                    
                    int desion = (int) (Math.random()*2+1);
                    if(desion == 1){
                        botSay("I'm doing well, thanks");
                    }
                    else if(desion == 2){
                        botSay("Not too bad");
                    }
                }
                else{
                    int decide = (int) (Math.random()*3+1);
                    if(decide == 1){
                        botSay("I didn't understand you what you say !!");
                    }
                    else if(decide == 2){
                        botSay("Please explain that !!");
                    }
                    else if(decide == 3){
                        botSay("what ???");
                    }
                }
            // After Each type make the text empty 
                txtEnter.setText("");
            }
        });
        //txtChat Attributes:
        txtChat.setLocation(15, 5);
        txtChat.setSize(560, 510);
        txtChat.setEditable(false);
        //Add Items To Frame:
        this.add(txtEnter);
        this.add(txtChat);
    }
    public void botSay(String s){
        txtChat.append("AI: " + s + "\n");
    }
   
    public static void main(String[] args){
        new chatBot();
     
    }
}