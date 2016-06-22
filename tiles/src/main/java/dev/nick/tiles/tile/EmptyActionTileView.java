package dev.nick.tiles.tile;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

import dev.nick.tiles.R;

public class EmptyActionTileView extends TileView {
    public EmptyActionTileView(Context context) {
        super(context);
    }

    public EmptyActionTileView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onBindActionView(RelativeLayout container) {
        super.onBindActionView(container);
        getTitleTextView().setTextColor(getResources().getColor(R.color.action_text_color));
    }
}
