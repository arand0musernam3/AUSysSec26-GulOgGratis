package zendesk.messaging.android.internal;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import zendesk.core.android.internal.DateKtxKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u0007"}, d2 = {"resolveDate", "", "Ljava/util/Date;", "locale", "Ljava/util/Locale;", "isFullMonthFormat", "", "zendesk.messaging_messaging-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConversationTitleProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationTitleProvider.kt\nzendesk/messaging/android/internal/ConversationTitleProviderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,255:1\n1#2:256\n*E\n"})
public final class ConversationTitleProviderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String resolveDate(Date date, Locale locale, boolean z11) {
        int i11 = Calendar.getInstance().get(1);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(1) == i11 ? z11 ? DateKtxKt.fullMonthAndDay(date, locale) : DateKtxKt.dayAndMonth(date, locale) : z11 ? DateKtxKt.fullMonthDayAndYear(date, locale) : DateKtxKt.monthDayAndYear(date, locale);
    }
}
