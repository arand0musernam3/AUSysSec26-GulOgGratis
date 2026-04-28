package us;

import com.app.tgtg.model.remote.VoucherId;
import com.app.tgtg.model.remote.voucher.response.VoucherType;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ss.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t5.a f41514b;

    public /* synthetic */ c(int i11, t5.a aVar) {
        this.f41513a = i11;
        this.f41514b = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f41513a) {
            case 0:
                VoucherType voucherType = (VoucherType) obj;
                String strM306unboximpl = ((VoucherId) obj2).m306unboximpl();
                voucherType.getClass();
                strM306unboximpl.getClass();
                t5.a aVar = this.f41514b;
                aVar.getClass();
                w wVar = (w) aVar.f39791b;
                wVar.f39256d.i(new ts.s(voucherType, strM306unboximpl, true));
                break;
            default:
                VoucherType voucherType2 = (VoucherType) obj;
                String strM306unboximpl2 = ((VoucherId) obj2).m306unboximpl();
                voucherType2.getClass();
                strM306unboximpl2.getClass();
                t5.a aVar2 = this.f41514b;
                aVar2.getClass();
                w wVar2 = (w) aVar2.f39791b;
                wVar2.f39256d.i(new ts.s(voucherType2, strM306unboximpl2, false));
                break;
        }
        return Unit.f26487a;
    }
}
