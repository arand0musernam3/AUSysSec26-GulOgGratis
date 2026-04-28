package m0;

import androidx.camera.core.ImageProcessingUtil;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l0 implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28548a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28549b;

    @Override // m0.e0
    public final void d(f0 f0Var) throws Exception {
        e0 e0Var;
        switch (this.f28548a) {
            case 0:
                n0 n0Var = (n0) this.f28549b;
                int i11 = ImageProcessingUtil.f2216a;
                if (n0Var != null) {
                    n0Var.close();
                    return;
                }
                return;
            default:
                ld.k kVar = (ld.k) this.f28549b;
                synchronized (kVar.f27647c) {
                    try {
                        int i12 = kVar.f27645a - 1;
                        kVar.f27645a = i12;
                        if (kVar.f27646b && i12 == 0) {
                            kVar.close();
                        }
                        e0Var = (e0) kVar.f27650f;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                if (e0Var != null) {
                    e0Var.d(f0Var);
                    return;
                }
                return;
        }
    }
}
