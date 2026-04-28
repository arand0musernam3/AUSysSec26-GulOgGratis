package z1;

import g3.t7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements a2.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f46428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f46429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t7 f46430c;

    public c(r rVar, Function1 function1, t7 t7Var) {
        this.f46428a = rVar;
        this.f46429b = function1;
        this.f46430c = t7Var;
    }

    @Override // a2.o
    public final float a(float f11, float f12) {
        return 0.0f;
    }

    @Override // a2.o
    public final float b(float f11) {
        r rVar = this.f46428a;
        float fG = rVar.g();
        Object objC = k.c(rVar.d(), fG, f11, this.f46429b, this.f46430c);
        if (!((Boolean) rVar.f46646a.invoke(objC)).booleanValue()) {
            objC = rVar.f46653h.getValue();
        }
        return ((a0) rVar.d()).f(objC) - fG;
    }
}
