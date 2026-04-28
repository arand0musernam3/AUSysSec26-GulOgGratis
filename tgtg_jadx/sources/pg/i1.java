package pg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends h1 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final SparseIntArray f34906w;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f34907v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f34906w = sparseIntArray;
        sparseIntArray.put(R.id.icon, 1);
        sparseIntArray.put(R.id.label, 2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i1(View view) {
        Object[] objArrB0 = a8.k.b0(view, 3, null, f34906w);
        super(null, view, (ImageView) objArrB0[1], (TextView) objArrB0[2]);
        this.f34907v = -1L;
        ((LinearLayout) objArrB0[0]).setTag(null);
        view.setTag(R.id.dataBinding, this);
        synchronized (this) {
            this.f34907v = 1L;
        }
        e0();
    }

    @Override // a8.k
    public final void V() {
        synchronized (this) {
            this.f34907v = 0L;
        }
    }

    @Override // a8.k
    public final boolean Y() {
        synchronized (this) {
            try {
                return this.f34907v != 0;
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
