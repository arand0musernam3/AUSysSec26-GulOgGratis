package zendesk.messaging.android.internal.conversationscreen;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/TimeConstants;", "", "<init>", "()V", "MESSAGE_ANIMATED_RECENTLY", "", "ONE_MINUTE_DIFFERENCE", "ONE_DAY_DIFFERENCE", "", "ONE_YEAR_DIFFERENCE", "FIFTEEN_MINUTES_DIFFERENCE", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TimeConstants {
    public static final long FIFTEEN_MINUTES_DIFFERENCE = 900000;

    @NotNull
    public static final TimeConstants INSTANCE = new TimeConstants();
    public static final long MESSAGE_ANIMATED_RECENTLY = 1000;
    public static final int ONE_DAY_DIFFERENCE = 1;
    public static final long ONE_MINUTE_DIFFERENCE = 60000;
    public static final int ONE_YEAR_DIFFERENCE = 1;

    private TimeConstants() {
    }
}
