package com.yuriy.openradio.mobile.view.list

import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import com.yuriy.openradio.shared.view.list.MediaItemViewHolder
import com.yuriy.openradio.shared.view.list.MediaItemsAdapter

class MobileMediaItemsAdapter : MediaItemsAdapter() {
    override fun onCreateViewHolder(parent: Any, viewType: Int): MediaItemViewHolder {
        val context = (parent as ViewGroup).context
        return MediaItemViewHolder(
            View(context),
            View(context),
            TextView(context),
            TextView(context),
            ImageView(context),
            CheckBox(context),
            TextView(context),
            null,
            View(context)
        )
    }
    
    override fun onBindViewHolder(holder: MediaItemViewHolder, position: Int) {
    }
    
    override fun getItemCount(): Int {
        return 0
    }
}
