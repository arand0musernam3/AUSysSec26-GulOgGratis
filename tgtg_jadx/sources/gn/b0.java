package gn;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f20586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f20587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f20588d;

    public /* synthetic */ b0(List list, Function0 function0, Function1 function1, int i11, int i12) {
        this.f20585a = i12;
        this.f20586b = list;
        this.f20588d = function0;
        this.f20587c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f20585a;
        m3.n nVar = (m3.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                a.n(m3.i.F(49), this.f20586b, this.f20588d, this.f20587c, nVar);
                break;
            case 1:
                lp.r.f(m3.i.F(1), this.f20586b, this.f20588d, this.f20587c, nVar);
                break;
            case 2:
                ps.a.b(m3.i.F(1), this.f20586b, this.f20588d, this.f20587c, nVar);
                break;
            default:
                ti.t.c(m3.i.F(1), this.f20586b, this.f20588d, this.f20587c, nVar);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ b0(List list, Function1 function1, Function0 function0, int i11, int i12) {
        this.f20585a = i12;
        this.f20586b = list;
        this.f20587c = function1;
        this.f20588d = function0;
    }
}
