package b3;

import g3.r9;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m5.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f5671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f5672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5673d;

    public /* synthetic */ x(u0 u0Var, Function2 function2, int i11, int i12) {
        this.f5670a = i12;
        this.f5671b = u0Var;
        this.f5672c = function2;
        this.f5673d = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        m3.n nVar = (m3.n) obj;
        Integer num = (Integer) obj2;
        switch (this.f5670a) {
            case 0:
                num.intValue();
                z.a(this.f5671b, this.f5672c, nVar, m3.i.F(this.f5673d | 1));
                break;
            default:
                num.getClass();
                r9.a(this.f5671b, this.f5672c, nVar, m3.i.F(this.f5673d | 1));
                break;
        }
        return Unit.f26487a;
    }
}
