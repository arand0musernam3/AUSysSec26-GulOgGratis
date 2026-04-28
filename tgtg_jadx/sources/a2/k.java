package a2;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import m3.k1;
import z1.q;
import z1.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f222e;

    public /* synthetic */ k(float f11, Ref.FloatRef floatRef, Object obj, Object obj2, int i11) {
        this.f218a = i11;
        this.f219b = f11;
        this.f220c = floatRef;
        this.f221d = obj;
        this.f222e = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float fA;
        switch (this.f218a) {
            case 0:
                q2 q2Var = (q2) this.f221d;
                Function1 function1 = (Function1) this.f222e;
                t1.h hVar = (t1.h) obj;
                float fAbs = Math.abs(((Number) hVar.f39447e.getValue()).floatValue());
                float f11 = this.f219b;
                float fAbs2 = Math.abs(f11);
                k1 k1Var = hVar.f39447e;
                Ref.FloatRef floatRef = this.f220c;
                if (fAbs >= fAbs2) {
                    float fD = n.d(((Number) k1Var.getValue()).floatValue(), f11);
                    n.c(hVar, q2Var, function1, fD - floatRef.element);
                    hVar.a();
                    floatRef.element = fD;
                } else {
                    n.c(hVar, q2Var, function1, ((Number) k1Var.getValue()).floatValue() - floatRef.element);
                    floatRef.element = ((Number) k1Var.getValue()).floatValue();
                }
                break;
            case 1:
                q2 q2Var2 = (q2) this.f221d;
                Function1 function12 = (Function1) this.f222e;
                t1.h hVar2 = (t1.h) obj;
                float fD2 = n.d(((Number) hVar2.f39447e.getValue()).floatValue(), this.f219b);
                Ref.FloatRef floatRef2 = this.f220c;
                float f12 = fD2 - floatRef2.element;
                try {
                    fA = q2Var2.a(f12);
                } catch (CancellationException unused) {
                    hVar2.a();
                    fA = 0.0f;
                }
                function12.invoke(Float.valueOf(fA));
                if (Math.abs(f12 - fA) > 0.5f || fD2 != ((Number) hVar2.f39447e.getValue()).floatValue()) {
                    hVar2.a();
                }
                floatRef2.element += fA;
                break;
            default:
                q qVar = (q) this.f221d;
                Ref.FloatRef floatRef3 = (Ref.FloatRef) this.f222e;
                t1.h hVar3 = (t1.h) obj;
                k1 k1Var2 = hVar3.f39447e;
                float fFloatValue = ((Number) k1Var2.getValue()).floatValue();
                float f13 = this.f219b;
                Ref.FloatRef floatRef4 = this.f220c;
                if ((fFloatValue >= f13 || floatRef4.element <= f13) && (((Number) k1Var2.getValue()).floatValue() <= f13 || floatRef4.element >= f13)) {
                    qVar.a(((Number) k1Var2.getValue()).floatValue(), ((Number) hVar3.b()).floatValue());
                    floatRef3.element = ((Number) hVar3.b()).floatValue();
                    floatRef4.element = ((Number) k1Var2.getValue()).floatValue();
                } else {
                    float fFloatValue2 = ((Number) k1Var2.getValue()).floatValue();
                    if (f13 == 0.0f) {
                        f13 = 0.0f;
                    } else if (f13 <= 0.0f ? fFloatValue2 >= f13 : fFloatValue2 <= f13) {
                        f13 = fFloatValue2;
                    }
                    qVar.a(f13, ((Number) hVar3.b()).floatValue());
                    floatRef3.element = Float.isNaN(((Number) hVar3.b()).floatValue()) ? 0.0f : ((Number) hVar3.b()).floatValue();
                    floatRef4.element = f13;
                    hVar3.a();
                }
                break;
        }
        return Unit.f26487a;
    }
}
