package us;

import com.app.tgtg.model.remote.voucher.BasicVoucher;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import m3.b1;
import ss.c1;
import ss.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t5.a f41543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c1 f41544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b1 f41545d;

    public /* synthetic */ n(t5.a aVar, c1 c1Var, b1 b1Var, int i11) {
        this.f41542a = i11;
        this.f41543b = aVar;
        this.f41544c = c1Var;
        this.f41545d = b1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f41542a) {
            case 0:
                BasicVoucher basicVoucher = this.f41544c.f39144a;
                t5.a aVar = this.f41543b;
                aVar.getClass();
                basicVoucher.getClass();
                w wVar = (w) aVar.f39791b;
                wVar.f39256d.i(new ts.p(basicVoucher));
                this.f41545d.setValue(Boolean.TRUE);
                break;
            default:
                BasicVoucher basicVoucher2 = this.f41544c.f39144a;
                t5.a aVar2 = this.f41543b;
                aVar2.getClass();
                basicVoucher2.getClass();
                w wVar2 = (w) aVar2.f39791b;
                wVar2.f39256d.i(new ts.p(basicVoucher2));
                this.f41545d.setValue(Boolean.TRUE);
                break;
        }
        return Unit.f26487a;
    }
}
