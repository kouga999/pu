import java.applet.AudioClip;
import java.applet.Applet;
public class oto extends Applet{
 public AudioClip up,sta;
 
 public void init(){
 AudioClip up=getAudioClip(getDocumentBase(), "up.wav"); //�t�@�C���ǂݍ���
 AudioClip sta=getAudioClip(getDocumentBase(), "up.wav"); //�t�@�C���ǂݍ���
	 up.play();
}
}