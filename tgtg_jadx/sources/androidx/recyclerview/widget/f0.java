package androidx.recyclerview.widget;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f3726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3727d;

    public final void a(int i11, int i12) {
        if (i11 < 0) {
            i4.a.f("Layout positions must be non-negative");
            return;
        }
        if (i12 < 0) {
            i4.a.f("Pixel distance must be non-negative");
            return;
        }
        int i13 = this.f3727d;
        int i14 = i13 * 2;
        int[] iArr = this.f3726c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f3726c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i14 >= iArr.length) {
            int[] iArr3 = new int[i13 * 4];
            this.f3726c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f3726c;
        iArr4[i14] = i11;
        iArr4[i14 + 1] = i12;
        this.f3727d++;
    }

    public final void b(RecyclerView recyclerView, boolean z11) {
        this.f3727d = 0;
        int[] iArr = this.f3726c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        y1 y1Var = recyclerView.f3598n;
        if (recyclerView.f3596m == null || y1Var == null || !y1Var.isItemPrefetchEnabled()) {
            return;
        }
        if (z11) {
            if (!recyclerView.f3581e.g()) {
                y1Var.collectInitialPrefetchPositions(recyclerView.f3596m.getItemCount(), this);
            }
        } else if (!recyclerView.Q()) {
            y1Var.collectAdjacentPrefetchPositions(this.f3724a, this.f3725b, recyclerView.f3599n1, this);
        }
        int i11 = this.f3727d;
        if (i11 > y1Var.mPrefetchMaxCountObserved) {
            y1Var.mPrefetchMaxCountObserved = i11;
            y1Var.mPrefetchMaxObservedInInitialPrefetch = z11;
            recyclerView.f3579c.n();
        }
    }
}
