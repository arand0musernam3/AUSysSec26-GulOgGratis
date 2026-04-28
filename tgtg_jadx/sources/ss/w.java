package ss;

import ao.f2;
import ao.r3;
import com.app.tgtg.model.remote.voucher.BasicVoucher;
import com.app.tgtg.model.remote.voucher.VoucherState;
import java.util.List;
import y80.a2;
import y80.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r3 f39253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f2 f39254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cv.b f39255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m1 f39256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f39257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f39258f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f39259g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a2 f39260h;

    public w(r3 r3Var, f2 f2Var, cv.b bVar) {
        r3Var.getClass();
        f2Var.getClass();
        bVar.getClass();
        this.f39253a = r3Var;
        this.f39254b = f2Var;
        this.f39255c = bVar;
        this.f39256d = y80.r.b(0, 5, x80.a.DROP_OLDEST, 1);
        kotlin.collections.n0 n0Var = kotlin.collections.n0.f26529a;
        this.f39257e = n0Var;
        this.f39258f = n0Var;
        this.f39260h = y80.r.c(z0.f39277a);
    }

    public static final boolean a(w wVar, BasicVoucher basicVoucher) {
        wVar.getClass();
        if ((basicVoucher != null ? basicVoucher.getState() : null) != VoucherState.ACTIVE) {
            return (basicVoucher != null ? basicVoucher.getState() : null) == VoucherState.PENDING;
        }
        return true;
    }
}
