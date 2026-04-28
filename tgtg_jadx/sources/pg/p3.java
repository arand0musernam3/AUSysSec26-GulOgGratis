package pg;

import android.util.SparseIntArray;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p3 extends a8.k {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final SparseIntArray f35075t;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f35076s;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f35075t = sparseIntArray;
        sparseIntArray.put(R.id.button, 1);
    }

    @Override // a8.k
    public final void V() {
        synchronized (this) {
            this.f35076s = 0L;
        }
    }

    @Override // a8.k
    public final boolean Y() {
        synchronized (this) {
            try {
                return this.f35076s != 0;
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
