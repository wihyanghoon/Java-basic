package oop1;

public class MusicPlayer {
    int volume;
    boolean isOn = false;

    void on(){
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    void off(){
        isOn = false;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    void VolumeUp () {
        volume++;
        System.out.println("현재 볼륨 : " + volume);
    }

    void VolumeDown () {
        volume--;
        System.out.println("현재 볼륨 : " + volume);
    }

    void showStatus () {
        System.out.println("현재 뮤직 플레이어의 상태 확인");

        if(isOn){
            System.out.println("음악 플레이어 ON, 볼륨 : " + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
