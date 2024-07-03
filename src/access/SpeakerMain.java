package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);

        speaker.getVolume();

        speaker.volumeUp();
        speaker.getVolume();

        speaker.volumeUp();
        speaker.getVolume();

        // 필드 직접 접근
        System.out.println("멤버 변수 직접 접근");
//        speaker.volume = 200;
        speaker.getVolume();
    }
}
