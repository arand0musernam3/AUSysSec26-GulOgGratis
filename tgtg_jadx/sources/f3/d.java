package f3;

import android.content.Context;
import android.view.ViewGroup;
import com.app.tgtg.R;
import dn.k;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f17253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f17254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f17255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17256e;

    public d(@NotNull Context context) {
        super(context);
        this.f17252a = 5;
        ArrayList arrayList = new ArrayList();
        this.f17253b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f17254c = arrayList2;
        this.f17255d = new k(5);
        setClipChildren(false);
        e eVar = new e(context);
        addView(eVar);
        arrayList.add(eVar);
        arrayList2.add(eVar);
        this.f17256e = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
    }
}
