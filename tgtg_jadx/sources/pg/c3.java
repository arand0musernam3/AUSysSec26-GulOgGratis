package pg;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c3 extends a8.k {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final SparseIntArray f34823t;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f34824s;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f34823t = sparseIntArray;
        sparseIntArray.put(R.id.logo, 1);
        sparseIntArray.put(R.id.title, 2);
        sparseIntArray.put(R.id.tvHint, 3);
        sparseIntArray.put(R.id.constraintLayout2, 4);
        sparseIntArray.put(R.id.llInput, 5);
        sparseIntArray.put(R.id.inputLayoutPhonePrefix, 6);
        sparseIntArray.put(R.id.etPhonePrefix, 7);
        sparseIntArray.put(R.id.inputLayoutPhoneNumber, 8);
        sparseIntArray.put(R.id.etPhoneNumber, 9);
        sparseIntArray.put(R.id.tvError, 10);
        sparseIntArray.put(R.id.btnPositive, 11);
        sparseIntArray.put(R.id.btnNegative, 12);
        sparseIntArray.put(R.id.guideImageLeft, 13);
        sparseIntArray.put(R.id.guideImageRight, 14);
        sparseIntArray.put(R.id.guideline2, 15);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(View view) {
        super(0, view, null);
        Object[] objArrB0 = a8.k.b0(view, 16, null, f34823t);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrB0[0];
        this.f34824s = -1L;
        constraintLayout.setTag(null);
        view.setTag(R.id.dataBinding, this);
        synchronized (this) {
            this.f34824s = 1L;
        }
        e0();
    }

    @Override // a8.k
    public final void V() {
        synchronized (this) {
            this.f34824s = 0L;
        }
    }

    @Override // a8.k
    public final boolean Y() {
        synchronized (this) {
            try {
                return this.f34824s != 0;
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
