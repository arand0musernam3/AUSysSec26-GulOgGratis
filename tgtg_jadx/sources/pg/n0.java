package pg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends m0 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final SparseIntArray f35008z;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f35009y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f35008z = sparseIntArray;
        sparseIntArray.put(R.id.title, 1);
        sparseIntArray.put(R.id.btnSeeAll, 2);
        sparseIntArray.put(R.id.gradient, 3);
        sparseIntArray.put(R.id.info, 4);
        sparseIntArray.put(R.id.itemList, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public n0(View view) {
        Object[] objArrB0 = a8.k.b0(view, 6, null, f35008z);
        super(null, view, (TextView) objArrB0[2], (ImageView) objArrB0[3], (TextView) objArrB0[4], (RecyclerView) objArrB0[5], (TextView) objArrB0[1]);
        this.f35009y = -1L;
        ((ConstraintLayout) objArrB0[0]).setTag(null);
        view.setTag(R.id.dataBinding, this);
        synchronized (this) {
            this.f35009y = 1L;
        }
        e0();
    }

    @Override // a8.k
    public final void V() {
        synchronized (this) {
            this.f35009y = 0L;
        }
    }

    @Override // a8.k
    public final boolean Y() {
        synchronized (this) {
            try {
                return this.f35009y != 0;
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
