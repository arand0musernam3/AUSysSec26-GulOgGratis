package zendesk.messaging.android.internal.conversationslistscreen.list;

import android.view.View;
import androidx.recyclerview.widget.r2;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/list/ConversationsListViewHolder;", "Landroidx/recyclerview/widget/r2;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Landroid/view/View;", "getView", "()Landroid/view/View;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ConversationsListViewHolder extends r2 {

    @NotNull
    private final View view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationsListViewHolder(@NotNull View view) {
        super(view);
        view.getClass();
        this.view = view;
    }

    @NotNull
    public final View getView() {
        return this.view;
    }
}
