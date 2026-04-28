package qz;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f37312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pz.d f37313b;

    public /* synthetic */ a0(a aVar, pz.d dVar) {
        this.f37312a = aVar;
        this.f37313b = dVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return com.google.android.gms.common.internal.i0.k(this.f37312a, a0Var.f37312a) && com.google.android.gms.common.internal.i0.k(this.f37313b, a0Var.f37313b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f37312a, this.f37313b});
    }

    public final String toString() {
        com.google.android.gms.common.internal.q qVar = new com.google.android.gms.common.internal.q(this);
        qVar.b(this.f37312a, "key");
        qVar.b(this.f37313b, "feature");
        return qVar.toString();
    }
}
