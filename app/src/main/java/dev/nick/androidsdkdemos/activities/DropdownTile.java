package dev.nick.androidsdkdemos.activities;

import android.content.Context;
import android.support.annotation.NonNull;

import dev.nick.androidsdkdemos.R;
import dev.nick.tiles.tile.DropDownTileView;
import dev.nick.tiles.tile.QuickTile;
import dev.nick.tiles.tile.TileListener;

public class DropdownTile extends QuickTile {

    public DropdownTile(@NonNull Context context, TileListener listener) {
        super(context, listener);
        this.titleRes = R.string.app_name;
        this.iconRes = R.drawable.ic_mic;
        this.tileView = new DropDownTileView(context);
    }
}
