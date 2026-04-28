package qz;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class u {
    private final pz.d[] zaa;
    private final boolean zab;
    private final int zac;

    public u(pz.d[] dVarArr, boolean z11, int i11) {
        this.zaa = dVarArr;
        boolean z12 = false;
        if (dVarArr != null && z11) {
            z12 = true;
        }
        this.zab = z12;
        this.zac = i11;
    }

    @NonNull
    public static <A extends com.google.android.gms.common.api.b, ResultT> t builder() {
        t tVar = new t();
        tVar.f37389b = true;
        tVar.f37391d = 0;
        return tVar;
    }

    public abstract void doExecute(com.google.android.gms.common.api.b bVar, d10.g gVar);

    public boolean shouldAutoResolveMissingFeatures() {
        return this.zab;
    }

    public final pz.d[] zaa() {
        return this.zaa;
    }

    public final int zab() {
        return this.zac;
    }

    public u() {
        this.zaa = null;
        this.zab = false;
        this.zac = 0;
    }
}
