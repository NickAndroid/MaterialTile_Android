package dev.nick.androidsdkdemos.activities;

import android.content.Context;
import android.support.annotation.NonNull;

import dev.nick.androidsdkdemos.R;
import dev.nick.tiles.tile.SwitchTileView;
import dev.nick.tiles.tile.TileListener;

public class SwitchTile extends HeadlessTile {
    public SwitchTile(@NonNull Context context, TileListener listener) {
        super(context, listener);
        this.iconRes = R.drawable.ic_doc;
        this.tileView = new SwitchTileView(context);
    }
}
