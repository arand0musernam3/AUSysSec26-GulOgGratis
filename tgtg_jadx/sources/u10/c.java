package u10;

import android.animation.TypeEvaluator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements TypeEvaluator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f40628b = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f40629a = new f();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f11, Object obj, Object obj2) {
        f fVar = (f) obj;
        f fVar2 = (f) obj2;
        float fJ = u00.d.J(fVar.f40632a, fVar2.f40632a, f11);
        float fJ2 = u00.d.J(fVar.f40633b, fVar2.f40633b, f11);
        float fJ3 = u00.d.J(fVar.f40634c, fVar2.f40634c, f11);
        f fVar3 = this.f40629a;
        fVar3.f40632a = fJ;
        fVar3.f40633b = fJ2;
        fVar3.f40634c = fJ3;
        return fVar3;
    }
}
