package pg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import com.app.tgtg.R;
import com.app.tgtg.customview.npsratingview.NpsRatingView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m2 extends l2 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final SparseIntArray f34990v;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f34991u;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f34990v = sparseIntArray;
        sparseIntArray.put(R.id.npsRatingView, 1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public m2(View view) {
        Object[] objArrB0 = a8.k.b0(view, 2, null, f34990v);
        super(null, view, (NpsRatingView) objArrB0[1]);
        this.f34991u = -1L;
        ((FrameLayout) objArrB0[0]).setTag(null);
        view.setTag(R.id.dataBinding, this);
        synchronized (this) {
            this.f34991u = 1L;
        }
        e0();
    }

    @Override // a8.k
    public final void V() {
        synchronized (this) {
            this.f34991u = 0L;
        }
    }

    @Override // a8.k
    public final boolean Y() {
        synchronized (this) {
            try {
                return this.f34991u != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // a8.k
    public final boolean c0(int i11, Object obj) {
        return false;
    }
}
