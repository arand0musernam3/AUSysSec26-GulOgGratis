package ks;

import com.app.tgtg.model.remote.payment.BasicSavedPaymentMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import m3.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f26656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BasicSavedPaymentMethod f26657c;

    public /* synthetic */ b(b1 b1Var, BasicSavedPaymentMethod basicSavedPaymentMethod, int i11) {
        this.f26655a = i11;
        this.f26656b = b1Var;
        this.f26657c = basicSavedPaymentMethod;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f26655a) {
            case 0:
                this.f26656b.setValue(this.f26657c);
                break;
            default:
                this.f26656b.setValue(this.f26657c);
                break;
        }
        return Unit.f26487a;
    }
}
