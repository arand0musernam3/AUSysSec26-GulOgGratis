package pg;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends s {
    public long F;

    /* JADX WARN: Illegal instructions before constructor call */
    public t(View view) {
        Object[] objArrB0 = a8.k.b0(view, 7, null, null);
        super(null, view, (TextView) objArrB0[4], (TextView) objArrB0[3], (TextView) objArrB0[5], (TextView) objArrB0[6], (TextView) objArrB0[2], (TextView) objArrB0[1]);
        this.F = -1L;
        ((ConstraintLayout) objArrB0[0]).setTag(null);
        this.f35137s.setTag(null);
        this.f35138t.setTag(null);
        this.f35139u.setTag(null);
        this.f35140v.setTag(null);
        this.f35141w.setTag(null);
        this.f35142x.setTag(null);
        view.setTag(R.id.dataBinding, this);
        synchronized (this) {
            this.F = 64L;
        }
        e0();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a A[PHI: r2
      0x003a: PHI (r2v1 long) = (r2v0 long), (r2v22 long) binds: [B:7:0x0021, B:16:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a A[PHI: r2
      0x008a: PHI (r2v4 long) = (r2v3 long), (r2v18 long) binds: [B:35:0x006f, B:44:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d8 A[PHI: r2
      0x00d8: PHI (r2v7 long) = (r2v6 long), (r2v14 long) binds: [B:63:0x00bf, B:72:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f8 A[PHI: r2
      0x00f8: PHI (r2v9 long) = (r2v8 long), (r2v12 long) binds: [B:76:0x00e0, B:85:0x00f5] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // a8.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V() {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pg.t.V():void");
    }

    @Override // a8.k
    public final boolean Y() {
        synchronized (this) {
            try {
                return this.F != 0;
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
