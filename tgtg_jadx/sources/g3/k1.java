package g3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b4.t f18935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f18936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f18937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f18938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f18939f;

    public /* synthetic */ k1(b4.t tVar, float f11, long j9, int i11, int i12, int i13) {
        this.f18934a = i13;
        this.f18935b = tVar;
        this.f18936c = f11;
        this.f18937d = j9;
        this.f18938e = i11;
        this.f18939f = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18934a) {
            case 0:
                ((Integer) obj2).getClass();
                s0.g(this.f18935b, this.f18936c, this.f18937d, (m3.n) obj, m3.i.F(this.f18938e | 1), this.f18939f);
                break;
            default:
                ((Integer) obj2).getClass();
                s0.o(this.f18935b, this.f18936c, this.f18937d, (m3.n) obj, m3.i.F(this.f18938e | 1), this.f18939f);
                break;
        }
        return Unit.f26487a;
    }
}
