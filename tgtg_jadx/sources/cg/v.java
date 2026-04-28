package cg;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f8136b;

    public /* synthetic */ v(u uVar, int i11, int i12) {
        this.f8135a = i12;
        this.f8136b = uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f8135a;
        m3.n nVar = (m3.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                j.d(this.f8136b, nVar, m3.i.F(1));
                break;
            default:
                wd.a.d(this.f8136b, nVar, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }
}
