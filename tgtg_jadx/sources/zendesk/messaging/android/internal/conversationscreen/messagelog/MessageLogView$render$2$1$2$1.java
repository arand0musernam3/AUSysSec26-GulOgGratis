package zendesk.messaging.android.internal.conversationscreen.messagelog;

import android.util.Log;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class MessageLogView$render$2$1$2$1 implements Runnable {
    final /* synthetic */ MessageLogView this$0;

    public MessageLogView$render$2$1$2$1(MessageLogView messageLogView) {
        this.this$0 = messageLogView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            MessageLogView messageLogView = this.this$0;
            messageLogView.showSeeLatestViewIfNeeded(messageLogView.rendering.getState().getMessageLogEntryList$zendesk_messaging_messaging_android());
        } catch (Exception e5) {
            Log.d(MessageLogView.TAG, "SeeLatestView error: " + e5.getCause());
        }
    }
}
