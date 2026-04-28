package le;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import m3.k1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f27673b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(h hVar, int i11) {
        super(0);
        this.f27672a = i11;
        this.f27673b = hVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f27672a) {
            case 0:
                h hVar = this.f27673b;
                float f11 = 0.0f;
                if (((he.k) hVar.f27685i.getValue()) != null) {
                    float fFloatValue = ((Number) hVar.f27682f.getValue()).floatValue();
                    k1 k1Var = hVar.f27681e;
                    if (fFloatValue < 0.0f) {
                        if (k1Var.getValue() != null) {
                            org.bouncycastle.jce.provider.a.c();
                            return null;
                        }
                    } else {
                        if (k1Var.getValue() != null) {
                            org.bouncycastle.jce.provider.a.c();
                            return null;
                        }
                        f11 = 1.0f;
                    }
                }
                return Float.valueOf(f11);
            case 1:
                h hVar2 = this.f27673b;
                k1 k1Var2 = hVar2.f27682f;
                return Float.valueOf((((Boolean) hVar2.f27680d.getValue()).booleanValue() && hVar2.f() % 2 == 0) ? -((Number) k1Var2.getValue()).floatValue() : ((Number) k1Var2.getValue()).floatValue());
            default:
                h hVar3 = this.f27673b;
                return Boolean.valueOf(hVar3.f() == ((Number) hVar3.f27679c.getValue()).intValue() && ((Number) hVar3.f27687k.getValue()).floatValue() == hVar3.e());
        }
    }
}
