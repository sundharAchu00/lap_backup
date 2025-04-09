package interfaceclass;

public class MobileDriver implements WhatsApp,Instagram{
	
	@Override
	public void audioCall() {
		System.out.println("Making a Video Call");
	}
	@Override
	public void videoCall() {
		System.out.println("Making a Audio Call");
	}

	public static void main(String[] args) {
		
		WhatsApp w1=new MobileDriver();
		Instagram i1=new MobileDriver();
		w1.audioCall();
		w1.videoCall();
		
		System.out.println("*************");
		i1.audioCall();
		i1.videoCall();
		
	}

}
