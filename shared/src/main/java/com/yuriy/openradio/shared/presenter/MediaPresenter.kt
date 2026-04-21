package com.yuriy.openradio.shared.presenter

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.media3.common.MediaItem
import androidx.media3.common.MediaMetadata
import com.google.android.gms.cast.framework.CastContext
import com.yuriy.openradio.shared.broadcast.AppLocalReceiverCallback
import com.yuriy.openradio.shared.media.PlaybackState
import com.yuriy.openradio.shared.model.media.MediaItemsSubscription

class MediaPresenter {
    fun init(
        activity: Context,
        mainView: View,
        savedInstanceState: Bundle,
        listView: View,
        currentRadioStationView: View,
        adapter: Any,
        subscriptionCb: MediaItemsSubscription,
        listener: MediaPresenterListener,
        broadcastReceiverCb: AppLocalReceiverCallback
    ) {
    }

    fun getCastContext(): CastContext? = null

    fun destroy() {}

    fun handleResume() {}

    fun handleSaveInstanceState(outState: Bundle) {}

    fun handleBackPressed(): Boolean = false

    fun getOnSaveInstancePassed(): Boolean = false

    fun handleRemoveRadioStationMenu(view: View) {}

    fun handleEditRadioStationMenu(view: View) {}

    fun handleCurrentIndexOnQueueChanged(index: Int) {}

    fun handleChildrenLoaded(parentId: String, children: List<MediaItem>) {}

    fun handlePermissionsResult(permissions: Array<String>, grantResults: IntArray) {}

    fun updateDescription(view: View, metadata: MediaMetadata) {}

    fun getCurrentMediaItem(): MediaItem? = null

    fun getServiceCommander(): Any? = null

    fun isAdapterEmpty(): Boolean = true
}
