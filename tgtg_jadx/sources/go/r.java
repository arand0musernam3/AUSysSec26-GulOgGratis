package go;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f20761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f20762c;

    public /* synthetic */ r(a aVar, int i11, int i12) {
        this.f20760a = i12;
        this.f20761b = aVar;
        this.f20762c = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f20760a;
        m3.n nVar = (m3.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                bx.o.A(this.f20761b, nVar, m3.i.F(this.f20762c | 1));
                break;
            case 1:
                bx.o.e(this.f20761b, nVar, m3.i.F(this.f20762c | 1));
                break;
            default:
                bx.o.b(this.f20761b, nVar, m3.i.F(this.f20762c | 1));
                break;
        }
        return Unit.f26487a;
    }
}
