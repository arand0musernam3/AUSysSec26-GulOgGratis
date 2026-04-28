package yi;

import com.app.tgtg.model.remote.payment.PaymentMethods;
import kotlin.Pair;
import kotlin.collections.w0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e0 extends android.support.v4.media.session.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f45973e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f0 f45974f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b70.b f45975g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f45976h;

    public /* synthetic */ e0(f0 f0Var, Object obj, b70.b bVar, int i11) {
        this.f45973e = i11;
        this.f45974f = f0Var;
        this.f45976h = obj;
        this.f45975g = bVar;
    }

    @Override // android.support.v4.media.session.a
    public final void E(int i11, CharSequence charSequence) {
        int i12 = this.f45973e;
        charSequence.getClass();
        switch (i12) {
            case 0:
                f0 f0Var = this.f45974f;
                f0Var.B().d();
                f0Var.H((String) this.f45976h);
                break;
            default:
                f0 f0Var2 = this.f45974f;
                if (13 != i11) {
                    f0.u(f0Var2, "Payments - onAuthenticationError", 1);
                } else {
                    f0Var2.B().l((PaymentMethods) this.f45976h);
                    f0Var2.B().x(cv.i.DEBUG_ADYEN_BIOMETRICS_FAILED, w0.b(new Pair(dv.a.REASON, new dv.c("Cancelled"))));
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00cb  */
    @Override // android.support.v4.media.session.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F(t.p r9) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yi.e0.F(t.p):void");
    }
}
