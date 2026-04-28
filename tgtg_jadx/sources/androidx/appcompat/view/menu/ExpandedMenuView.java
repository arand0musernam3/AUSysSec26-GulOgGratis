package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import j30.g;
import o.k;
import o.l;
import o.n;
import o.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements k, z, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f1914b = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f1915a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        g gVarT = g.t(context, attributeSet, f1914b, i11);
        TypedArray typedArray = (TypedArray) gVarT.f24503c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(gVarT.k(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(gVarT.k(1));
        }
        gVarT.v();
    }

    @Override // o.z
    public final void b(l lVar) {
        this.f1915a = lVar;
    }

    @Override // o.k
    public final boolean c(n nVar) {
        return this.f1915a.q(nVar, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i11, long j9) {
        c((n) getAdapter().getItem(i11));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }
}
