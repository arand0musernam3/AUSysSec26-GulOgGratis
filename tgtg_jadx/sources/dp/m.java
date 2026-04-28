package dp;

import b0.z;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ap.n f15094b;

    public /* synthetic */ m(ap.n nVar, int i11, int i12) {
        this.f15093a = i12;
        this.f15094b = nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int i11 = this.f15093a;
        m3.n nVar = (m3.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                a.a.j(this.f15094b, nVar, m3.i.F(1));
                break;
            case 1:
                android.support.v4.media.session.a.f(this.f15094b, nVar, m3.i.F(1));
                break;
            case 2:
                z.p(this.f15094b, nVar, m3.i.F(1));
                break;
            case 3:
                bx.k.l(this.f15094b, nVar, m3.i.F(1));
                break;
            default:
                bx.o.G(this.f15094b, nVar, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }
}
