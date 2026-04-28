package uk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.mapService.Locations;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m extends ArrayAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f41341a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, List list) {
        super(context, 0, list);
        context.getClass();
        this.f41341a = list;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i11, View view, ViewGroup viewGroup) {
        viewGroup.getClass();
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.location_list_item, viewGroup, false);
        }
        view.getClass();
        ((TextView) view.findViewById(R.id.name)).setText(((Locations) this.f41341a.get(i11)).getDisplayName());
        return view;
    }
}
