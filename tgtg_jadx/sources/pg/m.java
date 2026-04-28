package pg;

import android.util.SparseIntArray;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends l {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final SparseIntArray f34980y;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f34981x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f34980y = sparseIntArray;
        sparseIntArray.put(R.id.tvBulletPoint, 2);
        sparseIntArray.put(R.id.tvBody, 3);
    }

    @Override // a8.k
    public final void V() {
        long j9;
        synchronized (this) {
            j9 = this.f34981x;
            this.f34981x = 0L;
        }
        String str = this.f34968v;
        long j11 = j9 & 3;
        int i11 = 0;
        if (j11 != 0) {
            boolean z11 = str == null;
            if (j11 != 0) {
                j9 |= z11 ? 8L : 4L;
            }
            if (z11) {
                i11 = 8;
            }
        }
        if ((j9 & 3) != 0) {
            bx.k.G(this.f34967u, str);
            this.f34967u.setVisibility(i11);
        }
    }

    @Override // a8.k
    public final boolean Y() {
        synchronized (this) {
            try {
                return this.f34981x != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // a8.k
    public final boolean c0(int i11, Object obj) {
        return false;
    }

    @Override // pg.l
    public final void f0(String str) {
        this.f34968v = str;
        synchronized (this) {
            this.f34981x |= 1;
        }
        K(6);
        e0();
    }

    public final void g0() {
        synchronized (this) {
            this.f34981x = 2L;
        }
        e0();
    }
}
