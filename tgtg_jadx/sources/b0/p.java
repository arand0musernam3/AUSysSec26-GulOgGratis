package b0;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f5357b;

    public /* synthetic */ p(n nVar, int i11) {
        this.f5356a = i11;
        this.f5357b = nVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean zE;
        switch (this.f5356a) {
            case 0:
                zE = u00.d.E(this.f5357b);
                break;
            default:
                e0.u uVar = e0.v.f15412i0;
                e0.v vVar = this.f5357b.f5321b;
                uVar.getClass();
                zE = e0.u.c(vVar);
                break;
        }
        return Boolean.valueOf(zE);
    }
}
