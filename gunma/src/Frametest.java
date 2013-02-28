import java.awt.*;
import java.awt.event.*;

public class Frametest extends Frame{
        //画像を変数に入れる
        Image pi=getToolkit().getImage("プレーリー.png");
        public void paint(Graphics g)
        {
               //変数piの画像を座標(50,35)に表示
                g.drawImage(pi,50,35,this);
        }
}







       /* public static void main(String[] args) {
              //フレームの作成
              Frametest f = new Frametest();
              f.setSize(200, 150);
              f.setVisible(true);
              //リスナーの設定
              f.addWindowListener(new Ada());
        } */
        
/*class Ada extends WindowAdapter
{
    public void windowClosing(WindowEvent e){
//閉じるボタンが押されたときの処理
       System.exit(0);
    } 
}*/


