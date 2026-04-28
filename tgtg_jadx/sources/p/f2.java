package p;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.b f33897a;

    public f2(androidx.appcompat.widget.b bVar) {
        this.f33897a = bVar;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f33897a.f2144b.getChildCount();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i11) {
        ((g2) this.f33897a.f2144b.getChildAt(i11)).getClass();
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i11) {
        return i11;
    }

    @Override // android.widget.Adapter
    public final View getView(int i11, View view, ViewGroup viewGroup) {
        if (view != null) {
            getItem(i11);
            throw null;
        }
        getItem(i11);
        androidx.appcompat.widget.b bVar = this.f33897a;
        new g2(bVar, bVar.getContext());
        throw null;
    }
}
