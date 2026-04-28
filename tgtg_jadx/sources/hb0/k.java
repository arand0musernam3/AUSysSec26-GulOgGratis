package hb0;

import zendesk.core.ui.android.internal.model.MessageActionSize;
import zendesk.core.ui.android.internal.model.MessageSourceType;
import zendesk.messaging.android.internal.WebViewUriHandler;
import zendesk.messaging.android.internal.conversationscreen.delegates.ImageMessageContainerAdapterDelegate;
import zendesk.messaging.android.internal.conversationscreen.delegates.TextMessageContainerAdapterDelegate;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements i80.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebViewUriHandler f21741b;

    public /* synthetic */ k(WebViewUriHandler webViewUriHandler, int i11) {
        this.f21740a = i11;
        this.f21741b = webViewUriHandler;
    }

    @Override // i80.o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        String str = (String) obj;
        MessageActionSize messageActionSize = (MessageActionSize) obj2;
        String str2 = (String) obj3;
        MessageSourceType messageSourceType = (MessageSourceType) obj4;
        switch (this.f21740a) {
            case 0:
                return ImageMessageContainerAdapterDelegate.ViewHolder.renderContent$lambda$1(this.f21741b, str, messageActionSize, str2, messageSourceType);
            default:
                return TextMessageContainerAdapterDelegate.ViewHolder.renderContent$lambda$3(this.f21741b, str, messageActionSize, str2, messageSourceType);
        }
    }
}
