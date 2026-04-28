package b3;

import i4.g0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.e0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f5609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f5610c;

    public /* synthetic */ l(Function2 function2, Function2 function22, int i11) {
        this.f5608a = 3;
        this.f5609b = function2;
        this.f5610c = function22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        m3.n nVar = (m3.n) obj;
        Integer num = (Integer) obj2;
        switch (this.f5608a) {
            case 0:
                int iIntValue = num.intValue();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e0 e0Var = c.f5597a;
                    long j9 = ((i4.v) sVar.j(e.f5599a)).f23317a;
                    m3.i.a(e0Var.a(Float.valueOf((!((a) sVar.j(b.f5594a)).g() ? ((double) g0.u(j9)) < 0.5d : ((double) g0.u(j9)) > 0.5d) ? 0.87f : 1.0f)), u3.e.e(1236486620, sVar, new l(this.f5609b, this.f5610c, 1, (byte) 0)), sVar, 56);
                } else {
                    sVar.U();
                }
                break;
            case 1:
                int iIntValue2 = num.intValue();
                m3.s sVar2 = (m3.s) nVar;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    z.a(((a0) sVar2.j(b0.f5596b)).f5591j, u3.e.e(1789628237, sVar2, new l(this.f5609b, this.f5610c, 2, (byte) 0)), sVar2, 48);
                } else {
                    sVar2.U();
                }
                break;
            case 2:
                int iIntValue3 = num.intValue();
                m3.s sVar3 = (m3.s) nVar;
                if (sVar3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    Function2 function2 = this.f5609b;
                    Function2 function22 = this.f5610c;
                    if (function2 == null) {
                        sVar3.a0(1845819398);
                        s.c(function22, sVar3, 0);
                        sVar3.q(false);
                    } else {
                        sVar3.a0(1845823628);
                        s.a(function22, function2, sVar3, 0);
                        sVar3.q(false);
                    }
                } else {
                    sVar3.U();
                }
                break;
            default:
                num.getClass();
                s.a(this.f5609b, this.f5610c, nVar, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ l(Function2 function2, Function2 function22, int i11, byte b8) {
        this.f5608a = i11;
        this.f5609b = function2;
        this.f5610c = function22;
    }
}
