import java.awt.*;
import java.awt.event.*;

public class Frametest extends Frame{
        //�摜��ϐ��ɓ����
        Image pi=getToolkit().getImage("�v���[���[.png");
        public void paint(Graphics g)
        {
               //�ϐ�pi�̉摜�����W(50,35)�ɕ\��
                g.drawImage(pi,50,35,this);
        }
}







       /* public static void main(String[] args) {
              //�t���[���̍쐬
              Frametest f = new Frametest();
              f.setSize(200, 150);
              f.setVisible(true);
              //���X�i�[�̐ݒ�
              f.addWindowListener(new Ada());
        } */
        
/*class Ada extends WindowAdapter
{
    public void windowClosing(WindowEvent e){
//����{�^���������ꂽ�Ƃ��̏���
       System.exit(0);
    } 
}*/


