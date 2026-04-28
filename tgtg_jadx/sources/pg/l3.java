package pg;

import android.util.SparseIntArray;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l3 extends k3 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final SparseIntArray f34978v;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f34979u;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f34978v = sparseIntArray;
        sparseIntArray.put(R.id.tvBody, 1);
    }

    @Override // a8.k
    public final void V() {
        synchronized (this) {
            this.f34979u = 0L;
        }
    }

    @Override // a8.k
    public final boolean Y() {
        synchronized (this) {
            try {
                return this.f34979u != 0;
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
