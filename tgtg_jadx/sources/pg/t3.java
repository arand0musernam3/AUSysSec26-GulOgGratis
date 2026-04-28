package pg;

import android.util.SparseIntArray;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t3 extends s3 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final SparseIntArray f35175w;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f35176v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f35175w = sparseIntArray;
        sparseIntArray.put(R.id.toolbar, 1);
        sparseIntArray.put(R.id.topBar, 2);
        sparseIntArray.put(R.id.toolBarBorder, 3);
        sparseIntArray.put(R.id.scrollView, 4);
        sparseIntArray.put(R.id.llDescription, 5);
    }

    @Override // a8.k
    public final void V() {
        synchronized (this) {
            this.f35176v = 0L;
        }
    }

    @Override // a8.k
    public final boolean Y() {
        synchronized (this) {
            try {
                return this.f35176v != 0;
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
