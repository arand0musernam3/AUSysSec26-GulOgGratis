package zendesk.messaging.android.internal.conversationscreen;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import zendesk.messaging.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\u0007J\u0006\u0010\f\u001a\u00020\u0007J\u0006\u0010\r\u001a\u00020\u0007J\u0006\u0010\u000e\u001a\u00020\u0007J\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0007J\u0006\u0010\u0013\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/MessageLogLabelProvider;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "newMessages", "", "justNow", "sentAt", "timestamp", "sentJustNow", "sending", "tapToRetry", "formSubmissionFailed", "exceedsMaxFileSize", "size", "", "downloading", "downloadFailed", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MessageLogLabelProvider {

    @NotNull
    private final Context context;

    public MessageLogLabelProvider(@NotNull Context context) {
        context.getClass();
        this.context = context;
    }

    @NotNull
    public final String downloadFailed() {
        String string = this.context.getString(R.string.zuia_conversation_message_label_download_failed);
        string.getClass();
        return string;
    }

    @NotNull
    public final String downloading() {
        String string = this.context.getString(R.string.zuia_conversation_message_label_downloading);
        string.getClass();
        return string;
    }

    @NotNull
    public final String exceedsMaxFileSize(int size) {
        String string = this.context.getString(R.string.zuia_exceeds_max_file_size, Integer.valueOf(size));
        string.getClass();
        return string;
    }

    @NotNull
    public final String formSubmissionFailed() {
        String string = this.context.getString(R.string.zma_form_submission_error);
        string.getClass();
        return string;
    }

    @NotNull
    public final String justNow() {
        String string = this.context.getString(R.string.zuia_conversation_message_label_just_now);
        string.getClass();
        return string;
    }

    @NotNull
    public final String newMessages() {
        String string = this.context.getString(R.string.zuia_conversation_message_label_new);
        string.getClass();
        return string;
    }

    @NotNull
    public final String sending() {
        String string = this.context.getString(R.string.zuia_conversation_message_label_sending);
        string.getClass();
        return string;
    }

    @NotNull
    public final String sentAt(@NotNull String timestamp) {
        timestamp.getClass();
        String string = this.context.getString(R.string.zuia_conversation_message_label_sent_absolute, timestamp);
        string.getClass();
        return string;
    }

    @NotNull
    public final String sentJustNow() {
        String string = this.context.getString(R.string.zuia_conversation_message_label_sent_relative);
        string.getClass();
        return string;
    }

    @NotNull
    public final String tapToRetry() {
        String string = this.context.getString(R.string.zuia_conversation_message_label_tap_to_retry);
        string.getClass();
        return string;
    }
}
