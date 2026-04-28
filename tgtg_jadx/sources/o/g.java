package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.app.tgtg.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f31529a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f31530b;

    public g(h hVar) {
        this.f31530b = hVar;
        a();
    }

    public final void a() {
        l lVar = this.f31530b.f31533c;
        n nVar = lVar.f31564v;
        if (nVar != null) {
            lVar.i();
            ArrayList arrayList = lVar.f31553j;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (((n) arrayList.get(i11)) == nVar) {
                    this.f31529a = i11;
                    return;
                }
            }
        }
        this.f31529a = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final n getItem(int i11) {
        h hVar = this.f31530b;
        l lVar = hVar.f31533c;
        lVar.i();
        ArrayList arrayList = lVar.f31553j;
        hVar.getClass();
        int i12 = this.f31529a;
        if (i12 >= 0 && i11 >= i12) {
            i11++;
        }
        return (n) arrayList.get(i11);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        h hVar = this.f31530b;
        l lVar = hVar.f31533c;
        lVar.i();
        int size = lVar.f31553j.size();
        hVar.getClass();
        return this.f31529a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i11) {
        return i11;
    }

    @Override // android.widget.Adapter
    public final View getView(int i11, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f31530b.f31532b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((y) view).a(getItem(i11));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
