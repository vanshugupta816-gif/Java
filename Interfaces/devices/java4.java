public class Smartphone implements Camera,MusicPlayer,Phone{
    @Override
    public void takePhoto() {
        System.out.println("taking photo with smartphone");
    }

    @Override
    public void recordVideo() {
        System.out.println("recording video with smartphone");
    }

    @Override
    public void playMusic() {
        System.out.println("playing music on smartphone");
    }

    @Override
    public void stopMusic() {
        System.out.println("stopping music on smartphone");
    }

    @Override
    public void makeCall(String number) {
        System.out.println("calling " + number + " from smartphone");
    }

    @Override
    public void endCall() {
        System.out.println("Ending call on smartphone");
    }
}
