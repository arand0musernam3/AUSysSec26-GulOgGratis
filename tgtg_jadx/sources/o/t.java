package o;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t implements b0, x, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Rect f31604a;

    public static int n(ListAdapter listAdapter, Context context, int i11) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i12 = 0;
        int i13 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i14 = 0; i14 < count; i14++) {
            int itemViewType = listAdapter.getItemViewType(i14);
            if (itemViewType != i13) {
                view = null;
                i13 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i14, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i11) {
                return i11;
            }
            if (measuredWidth > i12) {
                i12 = measuredWidth;
            }
        }
        return i12;
    }

    @Override // o.x
    public final int getId() {
        return 0;
    }

    @Override // o.x
    public final boolean i(n nVar) {
        return false;
    }

    @Override // o.x
    public final boolean l(n nVar) {
        return false;
    }

    public abstract void m(l lVar);

    public abstract void o(View view);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i11, long j9) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (i) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (i) listAdapter).f31537a.q((MenuItem) listAdapter.getItem(i11), this, !(this instanceof f) ? 0 : 4);
    }

    public abstract void p(boolean z11);

    public abstract void q(int i11);

    public abstract void r(int i11);

    public abstract void s(PopupWindow.OnDismissListener onDismissListener);

    public abstract void t(boolean z11);

    public abstract void u(int i11);

    @Override // o.x
    public final void c(Context context, l lVar) {
    }
}
