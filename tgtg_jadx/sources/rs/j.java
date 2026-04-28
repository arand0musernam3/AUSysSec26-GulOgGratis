package rs;

import com.app.tgtg.model.remote.voucher.VoucherMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VoucherMode f38202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f38203c;

    public /* synthetic */ j(VoucherMode voucherMode, Function0 function0, int i11, int i12) {
        this.f38201a = i12;
        this.f38202b = voucherMode;
        this.f38203c = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f38201a;
        m3.n nVar = (m3.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                k.l(this.f38202b, this.f38203c, nVar, m3.i.F(1));
                break;
            default:
                k.j(this.f38202b, this.f38203c, nVar, m3.i.F(49));
                break;
        }
        return Unit.f26487a;
    }
}
