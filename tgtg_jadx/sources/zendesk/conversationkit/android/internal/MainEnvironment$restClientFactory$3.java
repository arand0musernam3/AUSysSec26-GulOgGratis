package zendesk.conversationkit.android.internal;

import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import com.braze.h2;
import j4.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@z70.e(c = "zendesk.conversationkit.android.internal.MainEnvironment$restClientFactory$3", f = "Environment.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
public final class MainEnvironment$restClientFactory$3 extends z70.i implements Function1<x70.c<? super String>, Object> {
    int label;
    final /* synthetic */ MainEnvironment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainEnvironment$restClientFactory$3(MainEnvironment mainEnvironment, x70.c<? super MainEnvironment$restClientFactory$3> cVar) {
        super(1, cVar);
        this.this$0 = mainEnvironment;
    }

    @Override // z70.a
    public final x70.c<Unit> create(x70.c<?> cVar) {
        return new MainEnvironment$restClientFactory$3(this.this$0, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(x70.c<? super String> cVar) {
        return ((MainEnvironment$restClientFactory$3) create(cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            h2.b("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ba0.g.M(obj);
        String appName$zendesk_conversationkit_conversationkit_android = this.this$0.getHostAppInfo().getAppName$zendesk_conversationkit_conversationkit_android();
        String appVersion$zendesk_conversationkit_conversationkit_android = this.this$0.getHostAppInfo().getAppVersion$zendesk_conversationkit_conversationkit_android();
        String deviceManufacturer$zendesk_conversationkit_conversationkit_android = this.this$0.getHostAppInfo().getDeviceManufacturer$zendesk_conversationkit_conversationkit_android();
        String deviceModel$zendesk_conversationkit_conversationkit_android = this.this$0.getHostAppInfo().getDeviceModel$zendesk_conversationkit_conversationkit_android();
        String deviceOperatingSystemVersion$zendesk_conversationkit_conversationkit_android = this.this$0.getHostAppInfo().getDeviceOperatingSystemVersion$zendesk_conversationkit_conversationkit_android();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(appName$zendesk_conversationkit_conversationkit_android);
        sb2.append(ExpiryDateInput.SEPARATOR);
        sb2.append(appVersion$zendesk_conversationkit_conversationkit_android);
        sb2.append(" (");
        sb2.append(deviceManufacturer$zendesk_conversationkit_conversationkit_android);
        s.A(sb2, " ", deviceModel$zendesk_conversationkit_conversationkit_android, "; Android ", deviceOperatingSystemVersion$zendesk_conversationkit_conversationkit_android);
        sb2.append(")");
        return sb2.toString();
    }
}
