import java.applet.AudioClip;
import java.applet.Applet;
public class oto extends Applet{
 public AudioClip up,sta;
 
 public void init(){
 AudioClip up=getAudioClip(getDocumentBase(), "up.wav"); //ファイル読み込み
 AudioClip sta=getAudioClip(getDocumentBase(), "up.wav"); //ファイル読み込み
	 up.play();
}
}