package v1;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h1 f41735b;

    public /* synthetic */ g1(h1 h1Var, int i11) {
        this.f41734a = i11;
        this.f41735b = h1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f41734a) {
            case 0:
                this.f41735b.N0();
                return Unit.f26487a;
            case 1:
                return new h4.b(this.f41735b.C);
            default:
                z4.z zVar = (z4.z) this.f41735b.A.getValue();
                return new h4.b(zVar != null ? zVar.S(0L) : 9205357640488583168L);
        }
    }
}
