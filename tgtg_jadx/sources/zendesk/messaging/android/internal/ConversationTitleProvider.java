package zendesk.messaging.android.internal;

import android.content.Context;
import e0.f;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w.a0;
import zendesk.core.android.internal.DateKtxKt;
import zendesk.core.ui.android.internal.local.LocaleProvider;
import zendesk.messaging.android.internal.conversationslistscreen.conversation.ConversationLogTimestampFormatter;
import zendesk.ui.android.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\f\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\rJD\u0010\u0012\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0013\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0017\u001a\u00020\u0018J2\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\"\u0010\u001b\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\rJ\u0010\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0010H\u0002J\"\u0010\u001c\u001a\u00020\r2\b\b\u0001\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\tH\u0002J\u0012\u0010 \u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0010H\u0002J\u0010\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u0018H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lzendesk/messaging/android/internal/ConversationTitleProvider;", "", "context", "Landroid/content/Context;", "localeProvider", "Lzendesk/core/ui/android/internal/local/LocaleProvider;", "timestampFormatter", "Lzendesk/messaging/android/internal/conversationslistscreen/conversation/ConversationLogTimestampFormatter;", "is24HourFormat", "", "<init>", "(Landroid/content/Context;Lzendesk/core/ui/android/internal/local/LocaleProvider;Lzendesk/messaging/android/internal/conversationslistscreen/conversation/ConversationLogTimestampFormatter;Z)V", "resolveTitle", "", "displayName", "createdAt", "Ljava/util/Date;", "fallbackTitle", "resolveAccessibilityListTitle", "participants", "latestMessage", "latestMessageOwner", "latestMessageTimestamp", "unreadMessagesCount", "", "resolveAccessibilityNonDefaultListTitle", "intro", "resolveAccessibilityHeaderTitle", "resolveDefaultTitle", "timestamp", "stringRes", "isFullMonthFormat", "resolveLatestMessageTimestamp", "resolveUnreadMessagesCount", "count", "Companion", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConversationTitleProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationTitleProvider.kt\nzendesk/messaging/android/internal/ConversationTitleProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,255:1\n1#2:256\n*E\n"})
public final class ConversationTitleProvider {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int UNREAD_MESSAGES_NONE = 0;

    @Deprecated
    public static final int UNREAD_MESSAGES_SINGLE = 1;

    @NotNull
    private final Context context;
    private final boolean is24HourFormat;

    @NotNull
    private final LocaleProvider localeProvider;

    @NotNull
    private final ConversationLogTimestampFormatter timestampFormatter;

    public ConversationTitleProvider(@NotNull Context context, @NotNull LocaleProvider localeProvider, @NotNull ConversationLogTimestampFormatter conversationLogTimestampFormatter, boolean z11) {
        context.getClass();
        localeProvider.getClass();
        conversationLogTimestampFormatter.getClass();
        this.context = context;
        this.localeProvider = localeProvider;
        this.timestampFormatter = conversationLogTimestampFormatter;
        this.is24HourFormat = z11;
    }

    private final String resolveAccessibilityNonDefaultListTitle(String intro, String latestMessage, String latestMessageOwner, Date latestMessageTimestamp, int unreadMessagesCount) {
        String string = this.context.getString(R.string.zuia_conversation_list_item_content_accessibility_label, k.l(intro, ", "), latestMessageOwner, f.k("\n", latestMessage), resolveLatestMessageTimestamp(latestMessageTimestamp), resolveUnreadMessagesCount(unreadMessagesCount));
        string.getClass();
        return string;
    }

    private final String resolveDefaultTitle(int stringRes, Date timestamp, boolean isFullMonthFormat) {
        String string = this.context.getString(stringRes, ConversationTitleProviderKt.resolveDate(timestamp, this.localeProvider.getLocale(), isFullMonthFormat), DateKtxKt.timeOnly(timestamp, this.localeProvider.getLocale(), this.is24HourFormat));
        string.getClass();
        return string;
    }

    private final String resolveLatestMessageTimestamp(Date timestamp) {
        return timestamp != null ? this.timestampFormatter.formatWhenConversationWasUpdatedAt$zendesk_messaging_messaging_android(timestamp, new Date()) : "";
    }

    private final String resolveUnreadMessagesCount(int count) {
        int i11 = R.string.zuia_conversation_list_item_one_unread_message_accessibility_label;
        int i12 = R.string.zuia_conversation_list_item_unread_messages_accessibility_label;
        if (count == 0) {
            return "";
        }
        Context context = this.context;
        if (count != 1) {
            String string = context.getString(i12, Integer.valueOf(count));
            string.getClass();
            return string;
        }
        String string2 = context.getString(i11);
        string2.getClass();
        return string2;
    }

    @NotNull
    public final String resolveAccessibilityHeaderTitle(@Nullable String displayName, @Nullable Date createdAt, @NotNull String fallbackTitle) {
        fallbackTitle.getClass();
        if (displayName == null) {
            displayName = createdAt != null ? resolveDefaultTitle(R.string.zuia_multiconvo_conversation_screen_header_default_title_accessibility_label, createdAt, true) : null;
            if (displayName == null) {
                return fallbackTitle;
            }
        }
        return displayName;
    }

    @NotNull
    public final String resolveAccessibilityListTitle(@Nullable String displayName, @NotNull String participants, @Nullable Date createdAt, @NotNull String latestMessage, @NotNull String latestMessageOwner, @Nullable Date latestMessageTimestamp, int unreadMessagesCount) {
        a0.C(participants, latestMessage, latestMessageOwner);
        if (displayName != null) {
            return resolveAccessibilityNonDefaultListTitle(displayName, latestMessage, latestMessageOwner, latestMessageTimestamp, unreadMessagesCount);
        }
        if (createdAt == null) {
            return resolveAccessibilityNonDefaultListTitle(participants, latestMessage, latestMessageOwner, latestMessageTimestamp, unreadMessagesCount);
        }
        String string = this.context.getString(R.string.zuia_multiconvo_conversation_list_screen_item_default_title_accessibility_label, ConversationTitleProviderKt.resolveDate(createdAt, this.localeProvider.getLocale(), true), DateKtxKt.timeOnly(createdAt, this.localeProvider.getLocale(), this.is24HourFormat), k.m(latestMessageOwner, ", ", latestMessage), resolveLatestMessageTimestamp(latestMessageTimestamp), resolveUnreadMessagesCount(unreadMessagesCount));
        string.getClass();
        return string;
    }

    @NotNull
    public final String resolveTitle(@Nullable String displayName, @Nullable Date createdAt, @NotNull String fallbackTitle) {
        fallbackTitle.getClass();
        if (displayName == null) {
            displayName = createdAt != null ? resolveDefaultTitle(createdAt) : null;
            if (displayName == null) {
                return fallbackTitle;
            }
        }
        return displayName;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lzendesk/messaging/android/internal/ConversationTitleProvider$Companion;", "", "<init>", "()V", "UNREAD_MESSAGES_NONE", "", "UNREAD_MESSAGES_SINGLE", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final String resolveDefaultTitle(Date timestamp) {
        int i11;
        int i12 = Calendar.getInstance().get(1);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(timestamp);
        if (calendar.get(1) == i12) {
            i11 = zendesk.messaging.R.string.zma_multiconvo_setting_conversation_titles_and_avatars_current_year;
        } else {
            i11 = zendesk.messaging.R.string.zma_multiconvo_setting_conversation_titles_and_avatars_previous_years;
        }
        return resolveDefaultTitle(i11, timestamp, false);
    }
}
