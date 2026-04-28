package pg;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 extends w1 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final SparseIntArray f35270v;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f35271u;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f35270v = sparseIntArray;
        sparseIntArray.put(R.id.middle, 1);
        sparseIntArray.put(R.id.animationView, 2);
        sparseIntArray.put(R.id.about1TitleTv, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public x1(View view) {
        Object[] objArrB0 = a8.k.b0(view, 4, null, f35270v);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) objArrB0[2];
        super(null, view, lottieAnimationView);
        this.f35271u = -1L;
        ((ConstraintLayout) objArrB0[0]).setTag(null);
        view.setTag(R.id.dataBinding, this);
        synchronized (this) {
            this.f35271u = 1L;
        }
        e0();
    }

    @Override // a8.k
    public final void V() {
        synchronized (this) {
            this.f35271u = 0L;
        }
    }

    @Override // a8.k
    public final boolean Y() {
        synchronized (this) {
            try {
                return this.f35271u != 0;
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
