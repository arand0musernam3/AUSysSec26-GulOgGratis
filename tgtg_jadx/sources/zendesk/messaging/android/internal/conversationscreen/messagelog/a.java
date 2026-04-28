package zendesk.messaging.android.internal.conversationscreen.messagelog;

import kotlin.jvm.functions.Function1;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;
import zendesk.ui.android.common.buttonbanner.ButtonBannerRendering;
import zendesk.ui.android.common.buttonbanner.ButtonBannerState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MessageLogView f47695b;

    public /* synthetic */ a(MessageLogView messageLogView, int i11) {
        this.f47694a = i11;
        this.f47695b = messageLogView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f47694a) {
            case 0:
                return MessageLogView.showNewMessagesViewIfNeeded$lambda$19(this.f47695b, (ButtonBannerRendering) obj);
            case 1:
                return MessageLogView.showSeeLatestViewIfNeeded$lambda$25(this.f47695b, (ButtonBannerRendering) obj);
            case 2:
                return MessageLogView.showSeeLatestViewIfNeeded$lambda$30(this.f47695b, (ButtonBannerRendering) obj);
            case 3:
                return MessageLogView.showSeeLatestViewIfNeeded$lambda$25$lambda$24(this.f47695b, (ButtonBannerState) obj);
            case 4:
                return MessageLogView.showNewMessagesViewIfNeeded$lambda$19$lambda$18(this.f47695b, (ButtonBannerState) obj);
            case 5:
                return MessageLogView.hideSeeLatestView$lambda$9(this.f47695b, (ButtonBannerRendering) obj);
            case 6:
                return MessageLogView.hideSeeLatestView$lambda$9$lambda$8(this.f47695b, (ButtonBannerState) obj);
            case 7:
                return MessageLogView.showSeeLatestViewIfNeeded$lambda$30$lambda$29(this.f47695b, (ButtonBannerState) obj);
            case 8:
                return MessageLogView.showSeeLatestViewIfNeeded$lambda$28$lambda$27(this.f47695b, (ButtonBannerState) obj);
            case 9:
                return MessageLogView.AnonymousClass2.onScrolled$lambda$1(this.f47695b, (ButtonBannerRendering) obj);
            default:
                return MessageLogView.AnonymousClass2.onScrolled$lambda$1$lambda$0(this.f47695b, (ButtonBannerState) obj);
        }
    }
}
