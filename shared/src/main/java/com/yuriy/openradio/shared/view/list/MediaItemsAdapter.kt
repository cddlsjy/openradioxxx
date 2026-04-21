package com.yuriy.openradio.shared.view.list

import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.media3.common.MediaItem
import androidx.media3.common.MediaMetadata

open class MediaItemViewHolder(
    view: View,
    val mRoot: View,
    val mNameView: TextView,
    val mDescriptionView: TextView,
    val mImageView: ImageView,
    val mFavoriteView: CheckBox,
    val mBitrateView: TextView,
    val mSettingsView: View?,
    val mForegroundView: View
) {
    val mFavoriteCheckView: CheckBox = mFavoriteView
}

interface OnSettingsListener {
    fun onSettingsClick(item: MediaItem)
}

open class MediaItemsAdapter {
    var activeItemId: Int = -1
    var parentId: String = ""

    fun getItem(position: Int): MediaItem? = null

    fun updateImage(context: android.content.Context, metadata: MediaMetadata, imageView: ImageView) {
    }

    fun updateBitrateView(bitrate: Int, bitrateView: TextView, isPlayable: Boolean) {
    }

    fun handleNameAndDescriptionView(nameView: TextView, descriptionView: TextView, metadata: MediaMetadata, parentId: String) {
    }

    fun handleFavoriteAction(
        checkBox: CheckBox,
        mediaId: String,
        metadata: MediaMetadata,
        commander: Any?
    ) {
    }

    fun onViewRecycled(holder: MediaItemViewHolder) {
    }

    var listener: OnItemSelectedListener? = null

    interface OnItemSelectedListener {
        fun onItemSelected(item: MediaItem, position: Int)
    }
}
