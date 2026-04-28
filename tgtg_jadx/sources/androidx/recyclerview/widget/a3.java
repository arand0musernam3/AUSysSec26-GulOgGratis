package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3657a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3658b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3659c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3660d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f3662f;

    public a3(StaggeredGridLayoutManager staggeredGridLayoutManager, int i11) {
        this.f3662f = staggeredGridLayoutManager;
        this.f3661e = i11;
    }

    public final void a() {
        View view = (View) j4.s.d(1, this.f3657a);
        StaggeredGridLayoutManager.a aVar = (StaggeredGridLayoutManager.a) view.getLayoutParams();
        this.f3659c = this.f3662f.f3630c.b(view);
        aVar.getClass();
    }

    public final void b() {
        this.f3657a.clear();
        this.f3658b = Integer.MIN_VALUE;
        this.f3659c = Integer.MIN_VALUE;
        this.f3660d = 0;
    }

    public final int c() {
        return this.f3662f.f3635h ? e(r1.size() - 1, -1) : e(0, this.f3657a.size());
    }

    public final int d() {
        return this.f3662f.f3635h ? e(0, this.f3657a.size()) : e(r1.size() - 1, -1);
    }

    public final int e(int i11, int i12) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f3662f;
        int iK = staggeredGridLayoutManager.f3630c.k();
        int iG = staggeredGridLayoutManager.f3630c.g();
        int i13 = i12 > i11 ? 1 : -1;
        while (i11 != i12) {
            View view = (View) this.f3657a.get(i11);
            int iE = staggeredGridLayoutManager.f3630c.e(view);
            int iB = staggeredGridLayoutManager.f3630c.b(view);
            boolean z11 = iE <= iG;
            boolean z12 = iB >= iK;
            if (z11 && z12 && (iE < iK || iB > iG)) {
                return staggeredGridLayoutManager.getPosition(view);
            }
            i11 += i13;
        }
        return -1;
    }

    public final int f(int i11) {
        int i12 = this.f3659c;
        if (i12 != Integer.MIN_VALUE) {
            return i12;
        }
        if (this.f3657a.size() == 0) {
            return i11;
        }
        a();
        return this.f3659c;
    }

    public final View g(int i11, int i12) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f3662f;
        View view = null;
        ArrayList arrayList = this.f3657a;
        if (i12 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f3635h && staggeredGridLayoutManager.getPosition(view2) >= i11) || ((!staggeredGridLayoutManager.f3635h && staggeredGridLayoutManager.getPosition(view2) <= i11) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            View view3 = (View) arrayList.get(i13);
            if ((staggeredGridLayoutManager.f3635h && staggeredGridLayoutManager.getPosition(view3) <= i11) || ((!staggeredGridLayoutManager.f3635h && staggeredGridLayoutManager.getPosition(view3) >= i11) || !view3.hasFocusable())) {
                break;
            }
            i13++;
            view = view3;
        }
        return view;
    }

    public final int h(int i11) {
        int i12 = this.f3658b;
        if (i12 != Integer.MIN_VALUE) {
            return i12;
        }
        ArrayList arrayList = this.f3657a;
        if (arrayList.size() == 0) {
            return i11;
        }
        View view = (View) arrayList.get(0);
        StaggeredGridLayoutManager.a aVar = (StaggeredGridLayoutManager.a) view.getLayoutParams();
        this.f3658b = this.f3662f.f3630c.e(view);
        aVar.getClass();
        return this.f3658b;
    }
}
