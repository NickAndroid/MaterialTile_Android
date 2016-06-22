package dev.nick.androidsdkdemos;

import android.support.annotation.NonNull;

import java.util.List;

import dev.nick.androidsdkdemos.activities.DataTimeTile;
import dev.nick.androidsdkdemos.activities.DropdownTile;
import dev.nick.androidsdkdemos.activities.EditTextTile;
import dev.nick.androidsdkdemos.activities.HeadlessTile;
import dev.nick.androidsdkdemos.activities.SwitchTile;
import dev.nick.tiles.tile.Category;
import dev.nick.tiles.tile.DashboardFragment;
import dev.nick.tiles.tile.QuickTile;
import dev.nick.tiles.tile.TileListener;

public class Dashboards extends DashboardFragment implements TileListener {

    @Override
    protected void onCreateDashCategories(List<Category> categories) {
        super.onCreateDashCategories(categories);
        Category category = new Category();
        category.addTile(new HeadlessTile(getActivity(), this));
        category.addTile(new HeadlessTile(getActivity(), this));
        category.addTile(new HeadlessTile(getActivity(), this));
        Category category1 = new Category();
        category1.addTile(new SwitchTile(getActivity(), this));
        category1.addTile(new SwitchTile(getActivity(), this));
        Category category2 = new Category();
        category2.addTile(new EditTextTile(getActivity(), this));
        category2.addTile(new DataTimeTile(getActivity(), this));
        category2.addTile(new DropdownTile(getActivity(), this));
        categories.add(category);
        categories.add(category1);
        categories.add(category2);
    }

    @Override
    public void onTileClick(@NonNull QuickTile tile) {
        // Nothing.
    }
}
