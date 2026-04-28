package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z1 extends k1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f34091m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f34092n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public w1 f34093o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public o.n f34094p;

    public z1(Context context, boolean z11) {
        super(context, z11);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f34091m = 21;
            this.f34092n = 22;
        } else {
            this.f34091m = 22;
            this.f34092n = 21;
        }
    }

    @Override // p.k1, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        o.i iVar;
        int headersCount;
        int iPointToPosition;
        int i11;
        if (this.f34093o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                iVar = (o.i) headerViewListAdapter.getWrappedAdapter();
            } else {
                iVar = (o.i) adapter;
                headersCount = 0;
            }
            o.n nVarB = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i11 = iPointToPosition - headersCount) < 0 || i11 >= iVar.getCount()) ? null : iVar.getItem(i11);
            o.n nVar = this.f34094p;
            if (nVar != nVarB) {
                o.l lVar = iVar.f31537a;
                if (nVar != null) {
                    this.f34093o.c(lVar, nVar);
                }
                this.f34094p = nVarB;
                if (nVarB != null) {
                    this.f34093o.i(lVar, nVarB);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i11, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i11 == this.f34091m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i11 != this.f34092n) {
            return super.onKeyDown(i11, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (o.i) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (o.i) adapter).f31537a.c(false);
        return true;
    }

    public void setHoverListener(w1 w1Var) {
        this.f34093o = w1Var;
    }

    @Override // p.k1, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
