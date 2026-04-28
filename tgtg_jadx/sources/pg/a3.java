package pg;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a3 extends a8.k {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final SparseIntArray f34778t;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f34779s;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f34778t = sparseIntArray;
        sparseIntArray.put(R.id.clMnuPopupBackground, 1);
        sparseIntArray.put(R.id.svPopupBox, 2);
        sparseIntArray.put(R.id.tvPopupTitle, 3);
        sparseIntArray.put(R.id.ivCloseIcon, 4);
        sparseIntArray.put(R.id.ivTopIcon, 5);
        sparseIntArray.put(R.id.tvTopText, 6);
        sparseIntArray.put(R.id.ivCenterIcon, 7);
        sparseIntArray.put(R.id.tvCenterText, 8);
        sparseIntArray.put(R.id.ivBottomIcon, 9);
        sparseIntArray.put(R.id.tvBottomText, 10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(View view) {
        super(0, view, null);
        Object[] objArrB0 = a8.k.b0(view, 11, null, f34778t);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrB0[0];
        this.f34779s = -1L;
        constraintLayout.setTag(null);
        view.setTag(R.id.dataBinding, this);
        synchronized (this) {
            this.f34779s = 1L;
        }
        e0();
    }

    @Override // a8.k
    public final void V() {
        synchronized (this) {
            this.f34779s = 0L;
        }
    }

    @Override // a8.k
    public final boolean Y() {
        synchronized (this) {
            try {
                return this.f34779s != 0;
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
