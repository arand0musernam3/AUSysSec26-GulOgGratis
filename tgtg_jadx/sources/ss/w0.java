package ss;

import ao.r3;
import com.app.tgtg.model.remote.voucher.BasicVoucher;
import com.app.tgtg.model.remote.voucher.VoucherMode;
import com.app.tgtg.model.remote.voucher.VoucherState;
import java.util.List;
import y80.a2;
import y80.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r3 f39261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cv.b f39262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m1 f39263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f39264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f39265e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public VoucherMode f39266f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a2 f39267g;

    public w0(r3 r3Var, cv.b bVar) {
        r3Var.getClass();
        bVar.getClass();
        this.f39261a = r3Var;
        this.f39262b = bVar;
        this.f39263c = y80.r.b(0, 2, x80.a.DROP_OLDEST, 1);
        kotlin.collections.n0 n0Var = kotlin.collections.n0.f26529a;
        this.f39264d = n0Var;
        this.f39265e = n0Var;
        this.f39266f = VoucherMode.REGULAR;
        this.f39267g = y80.r.c(g1.f39180a);
    }

    public static final boolean a(w0 w0Var, BasicVoucher basicVoucher) {
        w0Var.getClass();
        if ((basicVoucher != null ? basicVoucher.getState() : null) != VoucherState.ACTIVE) {
            return (basicVoucher != null ? basicVoucher.getState() : null) == VoucherState.PENDING;
        }
        return true;
    }
}
