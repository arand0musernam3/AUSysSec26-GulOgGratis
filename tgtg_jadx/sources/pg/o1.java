package pg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 extends n1 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final SparseIntArray f35027v;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f35028u;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f35027v = sparseIntArray;
        sparseIntArray.put(R.id.headerTv, 1);
        sparseIntArray.put(R.id.horizontalLine, 2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o1(View view) {
        Object[] objArrB0 = a8.k.b0(view, 3, null, f35027v);
        TextView textView = (TextView) objArrB0[1];
        super(null, view, textView);
        this.f35028u = -1L;
        ((ConstraintLayout) objArrB0[0]).setTag(null);
        view.setTag(R.id.dataBinding, this);
        synchronized (this) {
            this.f35028u = 1L;
        }
        e0();
    }

    @Override // a8.k
    public final void V() {
        synchronized (this) {
            this.f35028u = 0L;
        }
    }

    @Override // a8.k
    public final boolean Y() {
        synchronized (this) {
            try {
                return this.f35028u != 0;
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
