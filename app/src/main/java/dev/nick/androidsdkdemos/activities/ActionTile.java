package dev.nick.androidsdkdemos.activities;

import android.content.Context;
import android.support.annotation.NonNull;

import dev.nick.androidsdkdemos.R;
import dev.nick.tiles.tile.EmptyActionTileView;
import dev.nick.tiles.tile.TileListener;

public class ActionTile extends HeadlessTile {
    public ActionTile(@NonNull Context context, TileListener listener) {
        super(context, listener);
        this.titleRes = 0;
        this.tileView = new EmptyActionTileView(context){
            @Override
            protected int getActionTextColor() {
                return getResources().getColor(R.color.colorAccent);
            }
        };
    }
}
