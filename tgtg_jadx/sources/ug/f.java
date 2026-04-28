package ug;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import y80.a2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tg.i f41136b;

    public /* synthetic */ f(tg.i iVar, int i11) {
        this.f41135a = i11;
        this.f41136b = iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f41135a) {
            case 0:
                a2 a2Var = this.f41136b.f40169h;
                Boolean bool = Boolean.TRUE;
                a2Var.getClass();
                a2Var.k(null, bool);
                break;
            default:
                tg.i iVar = this.f41136b;
                iVar.k(new vg.g("", ((vg.g) iVar.f40175o.getValue()).f42320b, null, null, 12));
                break;
        }
        return Unit.f26487a;
    }
}
