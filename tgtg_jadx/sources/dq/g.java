package dq;

import com.app.tgtg.feature.orderview.charity.CharityOrderActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.specialrewards.SpecialRewardsActivity;
import g9.f0;
import g9.p;
import hp.r;
import hp.w;
import hp.x;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;
import w2.g0;
import xh.a0;
import xh.d0;
import xh.i0;
import xh.n;
import xh.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f15153b;

    public /* synthetic */ g(f0 f0Var, int i11) {
        this.f15152a = i11;
        this.f15153b = f0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i11 = this.f15152a;
        f0 f0Var = this.f15153b;
        switch (i11) {
            case 0:
                p.f(f0Var, "Thanks");
                break;
            case 1:
                p.f(f0Var, x.INSTANCE.f22335a);
                break;
            case 2:
                p.f(f0Var, w.INSTANCE.f22335a);
                break;
            case 3:
                p.f(f0Var, r.INSTANCE.f22335a);
                break;
            case 4:
                int i12 = CharityOrderActivity.f9162o;
                break;
            case 5:
                int i13 = CharityOrderActivity.f9162o;
                p.e(f0Var, a0.INSTANCE);
                break;
            case 6:
                int i14 = CharityOrderActivity.f9162o;
                f0Var.g();
                break;
            case 7:
                int i15 = SpecialRewardsActivity.f9434g;
                p.f(f0Var, "screen_used_and_expired_list");
                break;
            case 8:
                p.e(f0Var, rl.d.INSTANCE);
                break;
            case 9:
                f0Var.g();
                break;
            case 10:
                f0Var.h();
                break;
            case 11:
                p.e(f0Var, d0.INSTANCE);
                break;
            case 12:
                p.e(f0Var, new i0(null, null));
                break;
            case 13:
                f0Var.d(xh.h.INSTANCE, new g0(7));
                break;
            case 14:
                f0Var.g();
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                f0Var.g();
                break;
            case 16:
                f0Var.g();
                break;
            case 17:
                f0Var.g();
                break;
            case 18:
                f0Var.g();
                break;
            case 19:
                f0Var.h();
                break;
            case 20:
                p.e(f0Var, xh.w.INSTANCE);
                break;
            case 21:
                p.e(f0Var, s.INSTANCE);
                break;
            case 22:
                p.e(f0Var, new n("Home"));
                break;
            case 23:
                p.e(f0Var, new n("Plan_tooltip"));
                break;
            default:
                f0Var.g();
                f0Var.d(ii.e.INSTANCE, new g0(9));
                break;
        }
        return Unit.f26487a;
    }
}
