package o30;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class y extends w0.e {
    @Override // w0.e
    public final void l(d0 d0Var, Set set) {
        synchronized (d0Var) {
            try {
                if (d0Var.f31942h == null) {
                    d0Var.f31942h = set;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // w0.e
    public final int t(d0 d0Var) {
        int i11;
        synchronized (d0Var) {
            i11 = d0Var.f31943i - 1;
            d0Var.f31943i = i11;
        }
        return i11;
    }
}
