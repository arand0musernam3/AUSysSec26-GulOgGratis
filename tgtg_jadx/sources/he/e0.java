package he;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f21902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f21903b;

    public e0(k kVar) {
        this.f21902a = kVar;
        this.f21903b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        k kVar = this.f21902a;
        if (kVar != null && kVar.equals(e0Var.f21902a)) {
            return true;
        }
        Throwable th2 = this.f21903b;
        if (th2 == null || e0Var.f21903b == null) {
            return false;
        }
        return th2.toString().equals(th2.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f21902a, this.f21903b});
    }

    public e0(Throwable th2) {
        this.f21903b = th2;
        this.f21902a = null;
    }
}
