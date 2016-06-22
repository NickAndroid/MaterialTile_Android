package dev.nick.androidsdkdemos.activities;

import android.content.Context;
import android.support.annotation.NonNull;

import dev.nick.androidsdkdemos.R;
import dev.nick.tiles.tile.DateTileView;
import dev.nick.tiles.tile.QuickTile;
import dev.nick.tiles.tile.TileListener;

public class DataTimeTile extends QuickTile {
    public DataTimeTile(@NonNull Context context, TileListener listener) {
        super(context, listener);
        this.titleRes = R.string.app_name;
        this.iconRes = R.drawable.ic_doc;
        this.tileView = new DateTileView(context);
    }
}
