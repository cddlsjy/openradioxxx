package com.yuriy.openradio.mobile.view.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.yuriy.openradio.mobile.dependencies.DependencyRegistry
import com.yuriy.openradio.shared.broadcast.AppLocalReceiverCallback
import com.yuriy.openradio.shared.model.media.MediaItemsSubscription
import com.yuriy.openradio.shared.presenter.MediaPresenter
import com.yuriy.openradio.shared.presenter.MediaPresenterListener
import com.yuriy.openradio.mobile.view.list.MobileMediaItemsAdapter
import androidx.media3.common.MediaItem
import androidx.media3.common.MediaMetadata
import com.yuriy.openradio.shared.media.PlaybackState

class MainActivity : AppCompatActivity() {
    private lateinit var mAdapter: MobileMediaItemsAdapter
    private lateinit var mMediaPresenter: MediaPresenter
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DependencyRegistry.inject(this)
        init(this, savedInstanceState)
    }
    
    private fun init(activity: MainActivity, savedInstanceState: Bundle?) {
        mAdapter = MobileMediaItemsAdapter()
        mMediaPresenter = MediaPresenter()
        
        mMediaPresenter.init(
            activity,
            View(this),
            savedInstanceState ?: Bundle(),
            View(this),
            View(this),
            mAdapter,
            object : MediaItemsSubscription {
                override fun onChildrenLoaded(parentId: String, children: List<MediaItem>) {}
                override fun onError(parentId: String) {}
            },
            object : MediaPresenterListener {
                override fun showProgressBar() {}
                override fun handleMetadataChanged(metadata: MediaMetadata) {}
                override fun handlePlaybackStateChanged(state: PlaybackState) {}
            },
            object : AppLocalReceiverCallback {
                override fun onCurrentIndexOnQueueChanged(index: Int) {}
            }
        )
    }
}
