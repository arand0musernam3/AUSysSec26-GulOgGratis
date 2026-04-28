package v1;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f41676b;

    public /* synthetic */ a(g gVar, int i11) {
        this.f41675a = i11;
        this.f41676b = gVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        b5.l lVar;
        switch (this.f41675a) {
            case 0:
                m3.e0 e0Var = b1.f41690a;
                g gVar = this.f41676b;
                e1 e1Var = (e1) b5.o.e(gVar, e0Var);
                if (e1Var == null) {
                    c2.a.a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + e1Var);
                }
                e1 e1Var2 = gVar.f41729y;
                gVar.f41729y = e1Var;
                if (e1Var2 != null && !Intrinsics.areEqual(e1Var, e1Var2) && ((lVar = gVar.A) != null || !gVar.H)) {
                    if (lVar != null) {
                        gVar.M0(lVar);
                    }
                    gVar.A = null;
                    gVar.V0();
                }
                return Unit.f26487a;
            default:
                this.f41676b.f41727w.invoke();
                return Boolean.TRUE;
        }
    }
}
