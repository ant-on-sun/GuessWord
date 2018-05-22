package com.an_ant_on_the_sun.guessword.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileNames {
    static final String BUTTON_CLICK_FILE_NAME = "sounds/button_click.mp3";
    static final String SOUND_WIN_FILE_NAME = "sounds/sound_win.mp3";
    private static final String STICKMAN_SOUND_1_FILE_NAME = "sounds/stickman_sound1.mp3";
    private static final String STICKMAN_SOUND_2_FILE_NAME = "sounds/stickman_sound2.mp3";
    private static final String STICKMAN_SOUND_3_FILE_NAME = "sounds/stickman_sound3.mp3";
    private static final String STICKMAN_SOUND_4_FILE_NAME = "sounds/stickman_sound4.mp3";
    private static final String STICKMAN_SOUND_5_FILE_NAME = "sounds/stickman_sound5.mp3";
    private static final String STICKMAN_SOUND_6_FILE_NAME = "sounds/stickman_sound6.mp3";
    private static final String STICKMAN_SOUND_7_FILE_NAME = "sounds/stickman_sound7.mp3";
    private static final String STICKMAN_SOUND_8_FILE_NAME = "sounds/stickman_sound8.mp3";

    private List<String> stickmanSounds = new ArrayList<>();

    public FileNames(){
        stickmanSounds.addAll(Arrays.asList(
                STICKMAN_SOUND_1_FILE_NAME,
                STICKMAN_SOUND_2_FILE_NAME,
                STICKMAN_SOUND_3_FILE_NAME,
                STICKMAN_SOUND_4_FILE_NAME,
                STICKMAN_SOUND_5_FILE_NAME,
                STICKMAN_SOUND_6_FILE_NAME,
                STICKMAN_SOUND_7_FILE_NAME,
                STICKMAN_SOUND_8_FILE_NAME
        ));
    }

    public List<String> getStickmanSounds() {
        return stickmanSounds;
    }
}
