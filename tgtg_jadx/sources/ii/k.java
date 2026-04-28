package ii;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b4.t f23946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f23947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f23948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f23949e;

    public /* synthetic */ k(b4.t tVar, int i11, int i12, int i13, int i14) {
        this.f23945a = i14;
        this.f23946b = tVar;
        this.f23947c = i11;
        this.f23948d = i12;
        this.f23949e = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f23945a;
        m3.n nVar = (m3.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                l.e(this.f23947c, this.f23948d, m3.i.F(this.f23949e | 1), this.f23946b, nVar);
                break;
            default:
                zz.f.a(this.f23947c, m3.i.F(this.f23948d | 1), this.f23949e, this.f23946b, nVar);
                break;
        }
        return Unit.f26487a;
    }
}
