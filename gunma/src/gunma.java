
import java.applet.AudioClip; //AudioClipクラスのインポート
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class gunma extends Frame {
	public int x, y, z;
	AudioClip p_ac=null; //音用
    //Image pi=getToolkit().getImage("プレーリー.png");
	
	gunma() {
        super("gunma"); 
        setLayout(new GridLayout(2, 3));
        
        Button  b1 = new Button("マタタビ");
        Button  b2 = new Button("バッタ");
        Button  b3 = new Button("イネ科の草");
        Button  b4 = new Button("猫");
        Button  b5 = new Button("カマキリ");
        Button  b6 = new Button("プレーリードッグ");
        b1.addActionListener(new levelup(1));
        b2.addActionListener(new levelup(2));
        b3.addActionListener(new levelup(3));
        b4.addActionListener(new levelup(4));
        b5.addActionListener(new levelup(5));
        b6.addActionListener(new levelup(6));
        add(b1);
        add(b2);
        add(b3); 
        add(b4);
        add(b5);
        add(b6);
        setSize(400, 200);
        show();
    }
	
   

	class levelup implements ActionListener {
    	public int j;
    	public String a="猫",b="カマキリ",c="プレーリードッグ";
    	public int i=1;
        public levelup(int fa) {
        	j = fa;
        }
         
		public void actionPerformed(ActionEvent e) {
			
			  
			if(j == 1){
			    System.out.println(a+"レベルアップ");
			    ++x;
			    p_ac =java.applet.Applet.newAudioClip(gunma.class.getResource("up.wav"));   
			    p_ac.play();
			    
			   
			}
			else if(j==2){
				System.out.println(b+"レベルアップ");
				++y;
				 p_ac =java.applet.Applet.newAudioClip(gunma.class.getResource("up.wav"));   
				 p_ac.play();
			}
			else if(j==3){
				System.out.println(c+"レベルアップ");
				++z;
				 p_ac =java.applet.Applet.newAudioClip(gunma.class.getResource("up.wav"));   
				 p_ac.play();
			}
			else if(j==4){
				System.out.println(a+"レベル"+(x+1));
				 p_ac =java.applet.Applet.newAudioClip(gunma.class.getResource("st.wav"));   
				 p_ac.play();
			}
			else if(j==5){
				System.out.println(b+"レベル"+(y+1));
			    p_ac =java.applet.Applet.newAudioClip(gunma.class.getResource("st.wav"));   
			    p_ac.play();
			}
			else{
				System.out.println(c+"レベル"+(z+1));
				 p_ac =java.applet.Applet.newAudioClip(gunma.class.getResource("st.wav"));   
				 p_ac.play();
				 if(z+1 >= 10){
				    	p_ac =java.applet.Applet.newAudioClip(gunma.class.getResource("wa.wav"));   
					    p_ac.play();
					  //フレームの作成
			              Frametest f = new Frametest();
			              f.setSize(200, 150);
			              f.setVisible(true);
			              //リスナーの設定
			              //f.addWindowListener(new Ada());
					    	
				    }
			}
			}
		}
			
		
    
    
		
    	
  
    
    public static void main(String [] args) {
        new gunma();
    }
}

