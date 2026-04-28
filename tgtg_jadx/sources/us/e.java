package us;

import com.app.tgtg.model.remote.voucher.BasicVoucher;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f41520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BasicVoucher f41521c;

    public /* synthetic */ e(List list, BasicVoucher basicVoucher, int i11, int i12) {
        this.f41519a = i12;
        this.f41520b = list;
        this.f41521c = basicVoucher;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f41519a;
        m3.n nVar = (m3.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                a.i(this.f41520b, this.f41521c, nVar, m3.i.F(1));
                break;
            default:
                a.m(this.f41520b, this.f41521c, nVar, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }
}
