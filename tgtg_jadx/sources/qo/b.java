package qo;

import com.app.tgtg.feature.postpurchase.PostPurchaseActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PostPurchaseActivity f37201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f37202b;

    public b(PostPurchaseActivity postPurchaseActivity, f fVar) {
        this.f37201a = postPurchaseActivity;
        this.f37202b = fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        PostPurchaseActivity.a0(this.f37201a, this.f37202b);
        return Unit.f26487a;
    }
}
