package pg;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b3 extends a8.k {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final SparseIntArray f34798t;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f34799s;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f34798t = sparseIntArray;
        sparseIntArray.put(R.id.logo, 1);
        sparseIntArray.put(R.id.title, 2);
        sparseIntArray.put(R.id.constraintLayout, 3);
        sparseIntArray.put(R.id.tvHint, 4);
        sparseIntArray.put(R.id.tfEmail, 5);
        sparseIntArray.put(R.id.tvError, 6);
        sparseIntArray.put(R.id.btnPositive, 7);
        sparseIntArray.put(R.id.btnNegative, 8);
        sparseIntArray.put(R.id.guideImageLeft, 9);
        sparseIntArray.put(R.id.guideImageRight, 10);
        sparseIntArray.put(R.id.guideline2, 11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(View view) {
        super(0, view, null);
        Object[] objArrB0 = a8.k.b0(view, 12, null, f34798t);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrB0[0];
        this.f34799s = -1L;
        constraintLayout.setTag(null);
        view.setTag(R.id.dataBinding, this);
        synchronized (this) {
            this.f34799s = 1L;
        }
        e0();
    }

    @Override // a8.k
    public final void V() {
        synchronized (this) {
            this.f34799s = 0L;
        }
    }

    @Override // a8.k
    public final boolean Y() {
        synchronized (this) {
            try {
                return this.f34799s != 0;
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
