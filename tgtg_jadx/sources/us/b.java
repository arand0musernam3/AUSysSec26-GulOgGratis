package us;

import com.app.tgtg.model.remote.voucher.VoucherMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ss.w0;
import ss.x0;
import ts.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t5.a f41512b;

    public /* synthetic */ b(int i11, t5.a aVar) {
        this.f41511a = i11;
        this.f41512b = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f41511a) {
            case 0:
                ((x0) this.f41512b.f39792c).f39269a.a(new b0());
                break;
            case 1:
                this.f41512b.B();
                break;
            case 2:
                this.f41512b.B();
                break;
            case 3:
                VoucherMode voucherMode = VoucherMode.REGULAR;
                t5.a aVar = this.f41512b;
                aVar.getClass();
                voucherMode.getClass();
                w0 w0Var = (w0) aVar.f39791b;
                w0Var.f39263c.i(new ts.c(voucherMode));
                break;
            case 4:
                VoucherMode voucherMode2 = VoucherMode.DISCOUNT;
                t5.a aVar2 = this.f41512b;
                aVar2.getClass();
                voucherMode2.getClass();
                w0 w0Var2 = (w0) aVar2.f39791b;
                w0Var2.f39263c.i(new ts.c(voucherMode2));
                break;
            default:
                this.f41512b.B();
                break;
        }
        return Unit.f26487a;
    }
}
