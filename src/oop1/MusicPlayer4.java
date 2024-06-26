package oop1;

public class MusicPlayer4 {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        // 뮤직 플레이어 시작
        player.on();
        // 뮤직 플레이어 볼륨 업
        player.VolumeUp();
        // 뮤직 플레이어 볼륨 업
        player.VolumeUp();
        // 뮤직 플레이어 볼륨 감소
        player.VolumeDown();
        // 뮤직 플레이어 상태값 확인
        player.showStatus();
        // 뮤직 플레이어 끄기
        player.off();
    }
}
