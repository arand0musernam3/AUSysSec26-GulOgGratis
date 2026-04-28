package vi;

import cj.q;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f42345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f42346c;

    public /* synthetic */ b(q qVar, int i11, int i12) {
        this.f42344a = i12;
        this.f42345b = qVar;
        this.f42346c = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f42344a;
        m3.n nVar = (m3.n) obj;
        ((Integer) obj2).intValue();
        switch (i11) {
            case 0:
                c.e(this.f42345b, nVar, m3.i.F(this.f42346c | 1));
                break;
            default:
                c.x(this.f42345b, nVar, m3.i.F(this.f42346c | 1));
                break;
        }
        return Unit.f26487a;
    }
}
