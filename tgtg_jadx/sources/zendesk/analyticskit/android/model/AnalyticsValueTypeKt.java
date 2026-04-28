package zendesk.analyticskit.android.model;

import e40.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import zendesk.analyticskit.android.model.AnalyticsValueType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toSerializedString", "", "Lzendesk/analyticskit/android/model/AnalyticsValueType;", "zendesk.analyticskit_analyticskit-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AnalyticsValueTypeKt {
    @NotNull
    public static final String toSerializedString(@NotNull AnalyticsValueType analyticsValueType) {
        analyticsValueType.getClass();
        if (analyticsValueType instanceof AnalyticsValueType.DefaultValueType) {
            return AnalyticsValueType.DEFAULT_TYPE;
        }
        if (analyticsValueType instanceof AnalyticsValueType.ConversationExtensionValueType) {
            return AnalyticsValueType.CONVERSATION_EXTENSION_TYPE;
        }
        if (analyticsValueType instanceof AnalyticsValueType.ArticleValueType) {
            return AnalyticsValueType.ARTICLE_TYPE;
        }
        if (analyticsValueType instanceof AnalyticsValueType.CustomizedAPIValueType) {
            return AnalyticsValueType.CUSTOMIZATION_API_TYPE;
        }
        if (analyticsValueType instanceof AnalyticsValueType.MessagingScreenValueType) {
            return AnalyticsValueType.SHOW_MESSAGING_TYPE;
        }
        a.f();
        return null;
    }
}
