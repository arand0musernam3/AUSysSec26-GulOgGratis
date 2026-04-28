package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f31537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f31538b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f31539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f31540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LayoutInflater f31541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f31542f;

    public i(l lVar, LayoutInflater layoutInflater, boolean z11, int i11) {
        this.f31540d = z11;
        this.f31541e = layoutInflater;
        this.f31537a = lVar;
        this.f31542f = i11;
        a();
    }

    public final void a() {
        l lVar = this.f31537a;
        n nVar = lVar.f31564v;
        if (nVar != null) {
            lVar.i();
            ArrayList arrayList = lVar.f31553j;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (((n) arrayList.get(i11)) == nVar) {
                    this.f31538b = i11;
                    return;
                }
            }
        }
        this.f31538b = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final n getItem(int i11) {
        ArrayList arrayListL;
        boolean z11 = this.f31540d;
        l lVar = this.f31537a;
        if (z11) {
            lVar.i();
            arrayListL = lVar.f31553j;
        } else {
            arrayListL = lVar.l();
        }
        int i12 = this.f31538b;
        if (i12 >= 0 && i11 >= i12) {
            i11++;
        }
        return (n) arrayListL.get(i11);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListL;
        boolean z11 = this.f31540d;
        l lVar = this.f31537a;
        if (z11) {
            lVar.i();
            arrayListL = lVar.f31553j;
        } else {
            arrayListL = lVar.l();
        }
        return this.f31538b < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i11) {
        return i11;
    }

    @Override // android.widget.Adapter
    public final View getView(int i11, View view, ViewGroup viewGroup) {
        boolean z11 = false;
        if (view == null) {
            view = this.f31541e.inflate(this.f31542f, viewGroup, false);
        }
        int i12 = getItem(i11).f31571b;
        int i13 = i11 - 1;
        int i14 = i13 >= 0 ? getItem(i13).f31571b : i12;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f31537a.m() && i12 != i14) {
            z11 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z11);
        y yVar = (y) view;
        if (this.f31539c) {
            listMenuItemView.setForceShowIcon(true);
        }
        yVar.a(getItem(i11));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
