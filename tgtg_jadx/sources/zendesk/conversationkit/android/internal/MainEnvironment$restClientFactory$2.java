package zendesk.conversationkit.android.internal;

import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import com.braze.h2;
import j4.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@z70.e(c = "zendesk.conversationkit.android.internal.MainEnvironment$restClientFactory$2", f = "Environment.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
public final class MainEnvironment$restClientFactory$2 extends z70.i implements Function1<x70.c<? super String>, Object> {
    int label;
    final /* synthetic */ MainEnvironment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainEnvironment$restClientFactory$2(MainEnvironment mainEnvironment, x70.c<? super MainEnvironment$restClientFactory$2> cVar) {
        super(1, cVar);
        this.this$0 = mainEnvironment;
    }

    @Override // z70.a
    public final x70.c<Unit> create(x70.c<?> cVar) {
        return new MainEnvironment$restClientFactory$2(this.this$0, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(x70.c<? super String> cVar) {
        return ((MainEnvironment$restClientFactory$2) create(cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            ba0.g.M(obj);
            return s.k("android/", this.this$0.sdkVendor, ExpiryDateInput.SEPARATOR, this.this$0.getSdkVersion());
        }
        h2.b("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
