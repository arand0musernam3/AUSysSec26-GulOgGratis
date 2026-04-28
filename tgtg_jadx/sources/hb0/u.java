package hb0;

import kotlin.jvm.functions.Function1;
import zendesk.messaging.android.internal.conversationscreen.delegates.TypingIndicatorContainerAdapterDelegate;
import zendesk.ui.android.conversation.avatar.AvatarImageRendering;
import zendesk.ui.android.conversation.avatar.AvatarImageState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f21829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TypingIndicatorContainerAdapterDelegate.ViewHolder f21830c;

    public /* synthetic */ u(String str, TypingIndicatorContainerAdapterDelegate.ViewHolder viewHolder, int i11) {
        this.f21828a = i11;
        this.f21829b = str;
        this.f21830c = viewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f21828a) {
            case 0:
                return TypingIndicatorContainerAdapterDelegate.ViewHolder.renderAvatar$lambda$5$lambda$4(this.f21829b, this.f21830c, (AvatarImageState) obj);
            default:
                return TypingIndicatorContainerAdapterDelegate.ViewHolder.renderAvatar$lambda$5(this.f21829b, this.f21830c, (AvatarImageRendering) obj);
        }
    }
}
