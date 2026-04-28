package zendesk.messaging.android.internal.conversationscreen;

import java.util.List;
import kotlin.jvm.functions.Function1;
import zendesk.conversationkit.android.model.Message;
import zendesk.messaging.android.internal.model.UploadFile;
import zendesk.ui.android.conversation.carousel.CarouselAction;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConversationScreenCoordinator f47671b;

    public /* synthetic */ g(ConversationScreenCoordinator conversationScreenCoordinator, int i11) {
        this.f47670a = i11;
        this.f47671b = conversationScreenCoordinator;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f47670a) {
            case 0:
                return ConversationScreenCoordinator.onCarouselAction$lambda$29(this.f47671b, (CarouselAction) obj);
            case 1:
                return ConversationScreenCoordinator.onFileAttachmentClicked$lambda$32(this.f47671b, (Message) obj);
            case 2:
                return ConversationScreenCoordinator.onFormDisplayedFieldsChanged$lambda$21(this.f47671b, (String) obj);
            case 3:
                return ConversationScreenCoordinator.onTyping$lambda$23(this.f47671b, (String) obj);
            case 4:
                return ConversationScreenCoordinator.launchCamera$lambda$34(this.f47671b, ((Boolean) obj).booleanValue());
            case 5:
                return ConversationScreenCoordinator.launchGallery$lambda$37(this.f47671b, ((Boolean) obj).booleanValue());
            case 6:
                return ConversationScreenCoordinator.capturePhoto$lambda$35(this.f47671b, (UploadFile) obj);
            default:
                return ConversationScreenCoordinator.openGallery$lambda$38(this.f47671b, (List) obj);
        }
    }
}
