package pg;

import android.util.SparseIntArray;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q2 extends p2 {
    public static final a8.h C;
    public static final SparseIntArray D;
    public long B;

    static {
        a8.h hVar = new a8.h(0);
        C = hVar;
        int[] iArr = {R.layout.nps_rating_page_rating, R.layout.nps_rating_page_thanks};
        ((String[][]) hVar.f973b)[1] = new String[]{"nps_rating_page_rating", "nps_rating_page_thanks"};
        ((int[][]) hVar.f974c)[1] = new int[]{3, 4};
        ((int[][]) hVar.f975d)[1] = iArr;
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(R.id.feedback_include, 2);
        sparseIntArray.put(R.id.ivBack, 5);
        sparseIntArray.put(R.id.itemNameTv, 6);
        sparseIntArray.put(R.id.ivClose, 7);
    }

    @Override // a8.k
    public final void V() {
        synchronized (this) {
            this.B = 0L;
        }
        this.f35073y.W();
        this.f35074z.W();
    }

    @Override // a8.k
    public final boolean Y() {
        synchronized (this) {
            try {
                if (this.B != 0) {
                    return true;
                }
                return this.f35073y.Y() || this.f35074z.Y();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // a8.k
    public final boolean c0(int i11, Object obj) {
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.B |= 1;
        }
        return true;
    }

    public final void f0() {
        synchronized (this) {
            this.B = 4L;
        }
        this.f35073y.f0();
        this.f35074z.f0();
        e0();
    }
}
