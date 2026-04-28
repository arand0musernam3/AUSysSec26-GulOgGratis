package t1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f39375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o f39376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o f39377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o f39378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f39379e;

    public b2(z zVar) {
        this.f39375a = zVar;
        this.f39379e = zVar.d();
    }

    public final o a(long j9, o oVar, o oVar2) {
        o oVar3;
        if (this.f39377c == null) {
            this.f39377c = oVar.c();
        }
        o oVar4 = this.f39377c;
        if (oVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            oVar4 = null;
        }
        int iB = oVar4.b();
        int i11 = 0;
        while (true) {
            oVar3 = this.f39377c;
            if (i11 >= iB) {
                break;
            }
            if (oVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
                oVar3 = null;
            }
            oVar.getClass();
            oVar3.e(this.f39375a.e(oVar2.a(i11), j9), i11);
            i11++;
        }
        if (oVar3 != null) {
            return oVar3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
        return null;
    }
}
