package yj;

import com.app.tgtg.model.remote.item.response.BasicItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f46066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f46067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BasicItem f46068c;

    public g(float f11, Function1 function1, BasicItem basicItem) {
        this.f46066a = f11;
        this.f46067b = function1;
        this.f46068c = basicItem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.f46066a > 0.5f) {
            this.f46067b.invoke(this.f46068c);
        }
        return Unit.f26487a;
    }
}
