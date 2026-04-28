package g3;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i3 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t1.b f18803b;

    public /* synthetic */ i3(t1.b bVar, int i11) {
        this.f18802a = i11;
        this.f18803b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        i4.s0 s0Var = (i4.s0) obj;
        switch (this.f18802a) {
            case 0:
                float fFloatValue = ((Number) this.f18803b.d()).floatValue();
                float fD = v3.d(s0Var, fFloatValue);
                float fE = v3.e(s0Var, fFloatValue);
                s0Var.p(fE == 0.0f ? 1.0f : fD / fE);
                s0Var.w(v3.f19627c);
                break;
            case 1:
                s0Var.getClass();
                t1.b bVar = this.f18803b;
                s0Var.o(((Number) bVar.d()).floatValue());
                s0Var.p(((Number) bVar.d()).floatValue());
                s0Var.x(0.0f);
                s0Var.y(160.0f);
                break;
            case 2:
                s0Var.getClass();
                t1.b bVar2 = this.f18803b;
                s0Var.o(((Number) bVar2.d()).floatValue());
                s0Var.p(((Number) bVar2.d()).floatValue());
                s0Var.x(0.0f);
                s0Var.y(120.0f);
                break;
            case 3:
                s0Var.getClass();
                t1.b bVar3 = this.f18803b;
                s0Var.o(((Number) bVar3.d()).floatValue());
                s0Var.p(((Number) bVar3.d()).floatValue());
                s0Var.x(80.0f);
                s0Var.y(-220.0f);
                break;
            case 4:
                s0Var.getClass();
                t1.b bVar4 = this.f18803b;
                s0Var.o(((Number) bVar4.d()).floatValue());
                s0Var.p(((Number) bVar4.d()).floatValue());
                s0Var.y(-400.0f);
                break;
            case 5:
                s0Var.getClass();
                t1.b bVar5 = this.f18803b;
                s0Var.o(((Number) bVar5.d()).floatValue());
                s0Var.p(((Number) bVar5.d()).floatValue());
                s0Var.x(0.0f);
                s0Var.y(-150.0f);
                break;
            default:
                s0Var.getClass();
                t1.b bVar6 = this.f18803b;
                s0Var.o(((Number) bVar6.d()).floatValue());
                s0Var.p(((Number) bVar6.d()).floatValue());
                s0Var.x(100.0f);
                s0Var.y(0.0f);
                break;
        }
        return Unit.f26487a;
    }
}
