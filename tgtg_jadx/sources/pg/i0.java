package pg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends h0 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f34904x;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f34905w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f34904x = sparseIntArray;
        sparseIntArray.put(R.id.title, 1);
        sparseIntArray.put(R.id.btnSeeAll, 2);
        sparseIntArray.put(R.id.itemList, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i0(View view) {
        Object[] objArrB0 = a8.k.b0(view, 4, null, f34904x);
        super(null, view, (TextView) objArrB0[2], (RecyclerView) objArrB0[3], (TextView) objArrB0[1]);
        this.f34905w = -1L;
        ((ConstraintLayout) objArrB0[0]).setTag(null);
        view.setTag(R.id.dataBinding, this);
        synchronized (this) {
            this.f34905w = 1L;
        }
        e0();
    }

    @Override // a8.k
    public final void V() {
        synchronized (this) {
            this.f34905w = 0L;
        }
    }

    @Override // a8.k
    public final boolean Y() {
        synchronized (this) {
            try {
                return this.f34905w != 0;
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
