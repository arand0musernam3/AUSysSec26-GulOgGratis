package i3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f23124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f23125c;

    public /* synthetic */ i0(long j9, Function2 function2, int i11) {
        this.f23123a = 1;
        this.f23124b = j9;
        this.f23125c = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        m3.n nVar = (m3.n) obj;
        Integer num = (Integer) obj2;
        switch (this.f23123a) {
            case 0:
                int iIntValue = num.intValue();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    q0.c(this.f23124b, this.f23125c, sVar, 0);
                } else {
                    sVar.U();
                }
                break;
            case 1:
                num.getClass();
                q0.c(this.f23124b, this.f23125c, nVar, m3.i.F(1));
                break;
            default:
                int iIntValue2 = num.intValue();
                m3.s sVar2 = (m3.s) nVar;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    q0.c(this.f23124b, this.f23125c, sVar2, 0);
                } else {
                    sVar2.U();
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ i0(long j9, Function2 function2, int i11, byte b8) {
        this.f23123a = i11;
        this.f23124b = j9;
        this.f23125c = function2;
    }
}
