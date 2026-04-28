package zendesk.ui.android.conversation.activitymessage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lzendesk/ui/android/conversation/activitymessage/ActivityMessageRendering;", "", "state", "Lzendesk/ui/android/conversation/activitymessage/ActivityMessageState;", "<init>", "(Lzendesk/ui/android/conversation/activitymessage/ActivityMessageState;)V", "getState", "()Lzendesk/ui/android/conversation/activitymessage/ActivityMessageState;", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ActivityMessageRendering {
    public static final int $stable = 0;

    @NotNull
    private final ActivityMessageState state;

    public /* synthetic */ ActivityMessageRendering(ActivityMessageState activityMessageState, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new ActivityMessageState(null, 0, 3, null) : activityMessageState);
    }

    @NotNull
    public final ActivityMessageState getState() {
        return this.state;
    }

    public ActivityMessageRendering(@NotNull ActivityMessageState activityMessageState) {
        activityMessageState.getClass();
        this.state = activityMessageState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityMessageRendering() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
