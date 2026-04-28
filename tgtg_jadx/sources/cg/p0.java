package cg;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b4.t f8050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8051c;

    public /* synthetic */ p0(b4.t tVar, int i11) {
        this.f8049a = 1;
        this.f8050b = tVar;
        this.f8051c = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        m3.n nVar = (m3.n) obj;
        Integer num = (Integer) obj2;
        switch (this.f8049a) {
            case 0:
                num.getClass();
                j.q(m3.i.F(1), this.f8051c, this.f8050b, nVar);
                break;
            case 1:
                num.intValue();
                d2.p.a(this.f8050b, nVar, m3.i.F(this.f8051c | 1));
                break;
            case 2:
                num.getClass();
                m2.a.b(m3.i.F(1), this.f8051c, this.f8050b, nVar);
                break;
            default:
                num.getClass();
                ox.h.h(this.f8051c, m3.i.F(7), this.f8050b, nVar);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ p0(b4.t tVar, int i11, int i12) {
        this.f8049a = 3;
        this.f8050b = tVar;
        this.f8051c = i11;
    }

    public /* synthetic */ p0(b4.t tVar, int i11, int i12, int i13) {
        this.f8049a = i13;
        this.f8050b = tVar;
        this.f8051c = i12;
    }
}
