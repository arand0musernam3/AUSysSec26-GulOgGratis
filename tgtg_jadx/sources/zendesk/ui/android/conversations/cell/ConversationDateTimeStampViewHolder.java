package zendesk.ui.android.conversations.cell;

import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import zendesk.ui.android.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lzendesk/ui/android/conversations/cell/ConversationDateTimeStampViewHolder;", "", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "dateTimeStampTextView", "Landroid/widget/TextView;", "onBind", "", "formattedDate", "", "dateTimeStampColor", "", "onBind$zendesk_ui_ui_android", "Companion", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConversationDateTimeStampViewHolder {
    public static final float DATE_TIMESTAMP_TEXT_ALPHA = 0.65f;

    @NotNull
    private final TextView dateTimeStampTextView;
    public static final int $stable = 8;

    public ConversationDateTimeStampViewHolder(@NotNull View view) {
        view.getClass();
        View viewFindViewById = view.findViewById(R.id.zuia_conversation_date_timestamp);
        viewFindViewById.getClass();
        this.dateTimeStampTextView = (TextView) viewFindViewById;
    }

    public final void onBind$zendesk_ui_ui_android(@NotNull String formattedDate, int dateTimeStampColor) {
        formattedDate.getClass();
        this.dateTimeStampTextView.setText(formattedDate);
        this.dateTimeStampTextView.setAlpha(0.65f);
        this.dateTimeStampTextView.setTextColor(dateTimeStampColor);
    }
}
