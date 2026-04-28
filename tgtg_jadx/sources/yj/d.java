package yj;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xj.k f46059b;

    public /* synthetic */ d(xj.k kVar, int i11) {
        this.f46058a = i11;
        this.f46059b = kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f46058a) {
            case 0:
                this.f46059b.c();
                break;
            default:
                xj.k kVar = this.f46059b;
                if (!kVar.F) {
                    ft.c.P(ft.c.l() + 1);
                    kVar.F = true;
                }
                break;
        }
        return Unit.f26487a;
    }
}
