package hb0;

import kotlin.jvm.functions.Function1;
import zendesk.messaging.android.internal.conversationscreen.delegates.AdapterDelegatesHelper;
import zendesk.messaging.android.internal.model.MessagingTheme;
import zendesk.ui.android.conversation.avatar.AvatarImageRendering;
import zendesk.ui.android.conversation.avatar.AvatarImageState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f21691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessagingTheme f21692c;

    public /* synthetic */ c(String str, MessagingTheme messagingTheme, int i11) {
        this.f21690a = i11;
        this.f21691b = str;
        this.f21692c = messagingTheme;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f21690a) {
            case 0:
                return AdapterDelegatesHelper.renderAvatar$lambda$2$lambda$1$lambda$0(this.f21691b, this.f21692c, (AvatarImageState) obj);
            default:
                return AdapterDelegatesHelper.renderAvatar$lambda$2$lambda$1(this.f21691b, this.f21692c, (AvatarImageRendering) obj);
        }
    }
}
