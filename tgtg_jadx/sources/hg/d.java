package hg;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.n;
import o30.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f22043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f22044c;

    public /* synthetic */ d(int i11, int i12, boolean z11) {
        this.f22042a = 0;
        this.f22043b = z11;
        this.f22044c = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        n nVar = (n) obj;
        Integer num = (Integer) obj2;
        switch (this.f22042a) {
            case 0:
                num.getClass();
                a.a.c(this.f22043b, this.f22044c, nVar, m3.i.F(1));
                break;
            case 1:
                num.intValue();
                f0.i(this.f22043b, nVar, m3.i.F(this.f22044c | 1));
                break;
            default:
                num.intValue();
                f0.b(this.f22043b, nVar, m3.i.F(this.f22044c | 1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ d(boolean z11, int i11, int i12, byte b8) {
        this.f22042a = i12;
        this.f22043b = z11;
        this.f22044c = i11;
    }
}
