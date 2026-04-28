package zendesk.messaging.android.internal.conversationscreen;

import zendesk.android.messaging.UrlSource;
import zendesk.core.ui.android.internal.model.MessageActionSize;
import zendesk.core.ui.android.internal.model.MessageSourceType;
import zendesk.messaging.android.internal.UriHandler;
import zendesk.messaging.android.internal.WebViewUriHandler;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements UriHandler, WebViewUriHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ConversationFragment f47651a;

    public /* synthetic */ b(ConversationFragment conversationFragment) {
        this.f47651a = conversationFragment;
    }

    @Override // zendesk.messaging.android.internal.UriHandler
    public void onUriClicked(String str, UrlSource urlSource, boolean z11, MessageSourceType messageSourceType) {
        ConversationFragment.uriHandler$lambda$2(this.f47651a, str, urlSource, z11, messageSourceType);
    }

    @Override // zendesk.messaging.android.internal.WebViewUriHandler
    public void onWebViewUriClicked(String str, MessageActionSize messageActionSize, UrlSource urlSource, MessageSourceType messageSourceType) {
        ConversationFragment.webViewUriHandler$lambda$4(this.f47651a, str, messageActionSize, urlSource, messageSourceType);
    }
}
