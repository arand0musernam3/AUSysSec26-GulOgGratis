package pg;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends a8.k {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final SparseIntArray f35182t;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f35183s;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f35182t = sparseIntArray;
        sparseIntArray.put(R.id.descriptionLayout, 1);
        sparseIntArray.put(R.id.icon, 2);
        sparseIntArray.put(R.id.description, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(View view) {
        super(0, view, null);
        Object[] objArrB0 = a8.k.b0(view, 4, null, f35182t);
        this.f35183s = -1L;
        ((ConstraintLayout) objArrB0[0]).setTag(null);
        view.setTag(R.id.dataBinding, this);
        synchronized (this) {
            this.f35183s = 1L;
        }
        e0();
    }

    @Override // a8.k
    public final void V() {
        synchronized (this) {
            this.f35183s = 0L;
        }
    }

    @Override // a8.k
    public final boolean Y() {
        synchronized (this) {
            try {
                return this.f35183s != 0;
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
