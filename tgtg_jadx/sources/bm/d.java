package bm;

import g3.w6;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w6 f6355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f6356c;

    public /* synthetic */ d(w6 w6Var, Function0 function0, int i11, int i12) {
        this.f6354a = i12;
        this.f6355b = w6Var;
        this.f6356c = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f6354a;
        m3.n nVar = (m3.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                a.d(this.f6355b, this.f6356c, nVar, m3.i.F(49));
                break;
            case 1:
                xz.b.f(this.f6355b, this.f6356c, nVar, m3.i.F(1));
                break;
            default:
                zl.a.a(this.f6355b, this.f6356c, nVar, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }
}
