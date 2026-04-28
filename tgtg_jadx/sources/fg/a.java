package fg;

import android.os.Parcelable;
import b4.t;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.payment.PaymentMethods;
import com.app.tgtg.model.remote.payment.VoucherPaymentInformation;
import com.app.tgtg.model.remote.voucher.BasicVoucher;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import y9.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f17669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f17670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f17672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f17673f;

    public /* synthetic */ a(t tVar, BasicItem basicItem, boolean z11, boolean z12, int i11) {
        this.f17668a = 0;
        this.f17672e = tVar;
        this.f17673f = basicItem;
        this.f17669b = z11;
        this.f17670c = z12;
        this.f17671d = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17668a) {
            case 0:
                ((Integer) obj2).getClass();
                w.a((t) this.f17672e, (BasicItem) this.f17673f, this.f17669b, this.f17670c, (m3.n) obj, m3.i.F(this.f17671d | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                hg.i.b((BasicVoucher) this.f17672e, this.f17669b, this.f17670c, (Function0) this.f17673f, (m3.n) obj, m3.i.F(this.f17671d | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                hg.i.a((VoucherPaymentInformation) this.f17672e, this.f17669b, this.f17670c, (Function0) this.f17673f, (m3.n) obj, m3.i.F(this.f17671d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iF = m3.i.F(1);
                vi.c.t((PaymentMethods) this.f17672e, this.f17669b, this.f17670c, (Function1) this.f17673f, (m3.n) obj, iF, this.f17671d);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ a(Parcelable parcelable, boolean z11, boolean z12, Function0 function0, int i11, int i12) {
        this.f17668a = i12;
        this.f17672e = parcelable;
        this.f17669b = z11;
        this.f17670c = z12;
        this.f17673f = function0;
        this.f17671d = i11;
    }

    public /* synthetic */ a(PaymentMethods paymentMethods, boolean z11, boolean z12, Function1 function1, int i11, int i12) {
        this.f17668a = 3;
        this.f17672e = paymentMethods;
        this.f17669b = z11;
        this.f17670c = z12;
        this.f17673f = function1;
        this.f17671d = i12;
    }
}
