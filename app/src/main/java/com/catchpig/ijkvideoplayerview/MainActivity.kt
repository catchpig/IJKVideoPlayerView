package com.catchpig.ijkvideoplayerview

import android.os.Bundle
import androidx.activity.ComponentActivity
import xyz.doikki.videoplayer.ijk.IjkPlayerFactory
import xyz.doikki.videoplayer.player.VideoView
import xyz.doikki.videoplayer.player.VideoViewConfig
import xyz.doikki.videoplayer.player.VideoViewManager

class MainActivity : ComponentActivity() {
    companion object {
        private const val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        VideoViewManager.setConfig(
            VideoViewConfig.newBuilder().setLogEnabled(true)
                .setPlayerFactory(IjkPlayerFactory.create()).build()
        )
        val videoPlayer = findViewById<VideoView>(R.id.player)
//        val path = "https://v-cdn.zjol.com.cn/280443.mp4"
//        val path ="https://vd2.bdstatic.com/mda-makrmmn3ccsrazst/sc/cae_h264_nowatermark/1611230649/mda-makrmmn3ccsrazst.mp4?v_from_s=hkapp-haokan-hnb&auth_key=1689168692-0-0-267ea6830024b145ff2c144797f6f900&bcevod_channel=searchbox_feed&pd=1&cr=2&cd=0&pt=3&logid=0092118903&vid=9484481650064978383&abtest=110930_1&klogid=0092118903"
        val path =
            "http://18.167.172.118:19001/tvdev/20230625/139a01fb-3fe4-4451-91f7-28c7b5b718b0/master.m3u8"
        videoPlayer.setUrl(path)
        videoPlayer.start()
    }
}