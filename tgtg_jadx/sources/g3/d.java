package g3;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ka f18430b;

    public /* synthetic */ d(ka kaVar, int i11) {
        this.f18429a = i11;
        this.f18430b = kaVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18429a) {
            case 0:
                this.f18430b.b(((Number) ((t1.h) obj).f39447e.getValue()).floatValue());
                break;
            default:
                float f11 = (int) (((z5.l) obj).f47286a & 4294967295L);
                ka kaVar = this.f18430b;
                kaVar.f18983a = -(f11 - kaVar.f18985c.h());
                break;
        }
        return Unit.f26487a;
    }
}
