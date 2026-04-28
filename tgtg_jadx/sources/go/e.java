package go;

import com.app.tgtg.feature.orderview.charity.CharityOrderActivity;
import g9.f0;
import g9.j0;
import g9.z;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import xh.b0;
import xh.l0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f20713b;

    public /* synthetic */ e(f0 f0Var, int i11) {
        this.f20712a = i11;
        this.f20713b = f0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i11 = this.f20712a;
        f0 f0Var = this.f20713b;
        switch (i11) {
            case 0:
                b0 b0Var = (b0) obj;
                int i12 = CharityOrderActivity.f9162o;
                b0Var.getClass();
                g9.p.e(f0Var, b0Var);
                break;
            case 1:
                j0 j0Var = (j0) obj;
                j0Var.getClass();
                int i13 = g9.b0.f20105h;
                g9.b0 b0VarJ = f0Var.f20186b.j();
                b0VarJ.getClass();
                j0Var.a(((z) o80.r.l(o80.o.d(b0VarJ, new g2.q(29)))).f20258b.f27563e);
                j0Var.f20158e = false;
                j0Var.f20159f = true;
                j0Var.f20155b = true;
                j0Var.f20156c = true;
                break;
            case 2:
                String str = (String) obj;
                str.getClass();
                g9.p.e(f0Var, new l0(str));
                break;
            default:
                String str2 = (String) obj;
                str2.getClass();
                g9.p.e(f0Var, new xh.r(str2, null, false));
                break;
        }
        return Unit.f26487a;
    }
}
