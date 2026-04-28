package n3;

import kotlin.jvm.functions.Function0;
import m3.f2;
import m3.q2;
import m3.w1;
import q1.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends k0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f30482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r f30483e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r f30484f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final r f30485g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f30486c;

    static {
        int i11 = 1;
        f30482d = new r(i11, 2, 0);
        int i12 = 1;
        f30483e = new r(i12, i12, 1);
        f30484f = new r(i11, 2, 2);
        int i13 = 1;
        f30485g = new r(i13, i13, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i11, int i12, int i13) {
        super(i11, i12);
        this.f30486c = i13;
    }

    @Override // n3.k0
    public final void a(a60.s sVar, m3.c cVar, q2 q2Var, g0.c cVar2, l0 l0Var) {
        switch (this.f30486c) {
            case 0:
                Object objInvoke = ((Function0) sVar.e(0)).invoke();
                m3.a aVar = (m3.a) sVar.e(1);
                int iD = sVar.d(0);
                aVar.getClass();
                q2Var.X(q2Var.c(aVar), objInvoke);
                cVar.n(iD, objInvoke);
                cVar.d(objInvoke);
                break;
            case 1:
                m3.a aVar2 = (m3.a) sVar.e(0);
                int iD2 = sVar.d(0);
                cVar.j();
                aVar2.getClass();
                cVar.c(iD2, q2Var.E(q2Var.c(aVar2)));
                break;
            case 2:
                Object objE = sVar.e(0);
                m3.a aVar3 = (m3.a) sVar.e(1);
                int iD3 = sVar.d(0);
                if (objE instanceof f2) {
                    f2 f2Var = (f2) objE;
                    ((o3.e) cVar2.f18002e).b(f2Var);
                    ((u0) cVar2.f18001d).d(f2Var);
                }
                Object objM = q2Var.M(q2Var.c(aVar3), iD3, objE);
                if (objM instanceof f2) {
                    cVar2.e((f2) objM);
                } else if (objM instanceof w1) {
                    ((w1) objM).d();
                }
                break;
            default:
                Object objE2 = sVar.e(0);
                int iD4 = sVar.d(0);
                if (objE2 instanceof f2) {
                    f2 f2Var2 = (f2) objE2;
                    ((o3.e) cVar2.f18002e).b(f2Var2);
                    ((u0) cVar2.f18001d).d(f2Var2);
                }
                Object objM2 = q2Var.M(q2Var.f29400t, iD4, objE2);
                if (objM2 instanceof f2) {
                    cVar2.e((f2) objM2);
                } else if (objM2 instanceof w1) {
                    ((w1) objM2).d();
                }
                break;
        }
    }

    @Override // n3.k0
    public m3.a b(a60.s sVar) {
        switch (this.f30486c) {
            case 0:
                return (m3.a) sVar.e(1);
            case 1:
                return (m3.a) sVar.e(0);
            default:
                return super.b(sVar);
        }
    }
}
