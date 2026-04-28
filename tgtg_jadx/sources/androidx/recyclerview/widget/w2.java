package androidx.recyclerview.widget;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f3962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f3963g;

    public w2(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f3963g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f3957a = -1;
        this.f3958b = Integer.MIN_VALUE;
        this.f3959c = false;
        this.f3960d = false;
        this.f3961e = false;
        int[] iArr = this.f3962f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
