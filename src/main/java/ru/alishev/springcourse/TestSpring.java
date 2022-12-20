package ru.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);

        ArrayList<MusicPlayer> musicPlayer = context.getBean("list", ArrayList.class);

        for (MusicPlayer i : musicPlayer) {
            i.playMusic();
        }

//        System.out.println(i.getName());
//        System.out.println(i.getVolume());

        context.close();
    }
}
