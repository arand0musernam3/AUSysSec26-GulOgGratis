package zendesk.messaging.android.internal.conversationscreen.conversationextension;

import com.tgtg.componentlibrary.component.pageheader.PantryPageHeaderKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionEvent;", "", PantryPageHeaderKt.CLOSE_CONTENT_DESCRIPTION, "Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionEvent$Close;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ConversationExtensionEvent {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionEvent$Close;", "Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionEvent;", "<init>", "()V", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Close implements ConversationExtensionEvent {

        @NotNull
        public static final Close INSTANCE = new Close();

        private Close() {
        }
    }
}
