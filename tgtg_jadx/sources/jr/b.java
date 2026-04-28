package jr;

import b0.z;
import g3.o6;
import g3.s0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m3.i;
import m3.m;
import m3.n;
import m3.s;
import u3.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f25376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f25377c;

    public /* synthetic */ b(String str, Function0 function0) {
        this.f25375a = 1;
        this.f25376b = function0;
        this.f25377c = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        n nVar = (n) obj;
        Integer num = (Integer) obj2;
        switch (this.f25375a) {
            case 0:
                num.getClass();
                z.d(this.f25377c, this.f25376b, nVar, i.F(1));
                break;
            case 1:
                int iIntValue = num.intValue();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Function0 function0 = this.f25376b;
                    boolean zF = sVar.f(function0);
                    Object objM = sVar.M();
                    if (zF || objM == m.f29332a) {
                        objM = new nn.m(5, function0);
                        sVar.k0(objM);
                    }
                    s0.n((Function0) objM, null, false, null, null, null, null, e.e(-830881078, sVar, new o6(this.f25377c, 4)), sVar, 805306368, 510);
                } else {
                    sVar.U();
                }
                break;
            default:
                num.getClass();
                rk.e.i(this.f25377c, this.f25376b, nVar, i.F(1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ b(String str, Function0 function0, int i11, int i12) {
        this.f25375a = i12;
        this.f25377c = str;
        this.f25376b = function0;
    }
}
