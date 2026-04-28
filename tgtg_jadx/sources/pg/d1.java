package pg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends c1 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f34835x;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f34836w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f34835x = sparseIntArray;
        sparseIntArray.put(R.id.card, 1);
        sparseIntArray.put(R.id.heading, 2);
        sparseIntArray.put(R.id.info, 3);
        sparseIntArray.put(R.id.items, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d1(View view) {
        Object[] objArrB0 = a8.k.b0(view, 5, null, f34835x);
        CardView cardView = (CardView) objArrB0[1];
        super(null, view, cardView, (ImageView) objArrB0[3], (RecyclerView) objArrB0[4]);
        this.f34836w = -1L;
        ((FrameLayout) objArrB0[0]).setTag(null);
        view.setTag(R.id.dataBinding, this);
        synchronized (this) {
            this.f34836w = 1L;
        }
        e0();
    }

    @Override // a8.k
    public final void V() {
        synchronized (this) {
            this.f34836w = 0L;
        }
    }

    @Override // a8.k
    public final boolean Y() {
        synchronized (this) {
            try {
                return this.f34836w != 0;
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
