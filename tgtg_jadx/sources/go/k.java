package go;

import com.app.tgtg.feature.orderview.charity.CharityOrderActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import xh.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f20733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f20734c;

    public /* synthetic */ k(Function1 function1, a aVar, int i11) {
        this.f20732a = i11;
        this.f20733b = function1;
        this.f20734c = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i11 = this.f20732a;
        a aVar = this.f20734c;
        Function1 function1 = this.f20733b;
        switch (i11) {
            case 0:
                int i12 = CharityOrderActivity.f9162o;
                function1.invoke(new z(aVar.f20698a.m429getOrderIdreIZeYA()));
                break;
            default:
                int i13 = CharityOrderActivity.f9162o;
                function1.invoke(new z(aVar.f20698a.m429getOrderIdreIZeYA()));
                break;
        }
        return Unit.f26487a;
    }
}
