package zendesk.analyticskit.android.internal.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import zendesk.analyticskit.android.model.AnalyticsEvent;
import zendesk.analyticskit.android.model.AnalyticsValueType;
import zendesk.analyticskit.android.model.UserAction;
import zendesk.analyticskit.android.model.Value;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0003*\u00020\u0004H\u0002\u001a\f\u0010\u0000\u001a\u00020\u0005*\u00020\u0006H\u0002\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\u0006H\u0002¨\u0006\t"}, d2 = {"toDomain", "Lzendesk/analyticskit/android/model/AnalyticsEvent;", "Lzendesk/analyticskit/android/internal/model/AnalyticsEventDto;", "Lzendesk/analyticskit/android/model/UserAction;", "Lzendesk/analyticskit/android/internal/model/UserActionDto;", "Lzendesk/analyticskit/android/model/Value;", "Lzendesk/analyticskit/android/internal/model/ValueDto;", "mapValueData", "Lzendesk/analyticskit/android/model/AnalyticsValueType;", "zendesk.analyticskit_analyticskit-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AnalyticsEventsDtoKt {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final AnalyticsValueType mapValueData(ValueDto valueDto) {
        String valueType = valueDto.getValueType();
        switch (valueType.hashCode()) {
            case -1282361241:
                if (valueType.equals(AnalyticsValueType.SHOW_MESSAGING_TYPE)) {
                    String exitAction = valueDto.getExitAction();
                    return new AnalyticsValueType.MessagingScreenValueType(exitAction != null ? exitAction : "");
                }
                break;
            case -1085510111:
                if (valueType.equals(AnalyticsValueType.DEFAULT_TYPE)) {
                    return AnalyticsValueType.DefaultValueType.INSTANCE;
                }
                break;
            case 52368092:
                if (valueType.equals(AnalyticsValueType.CONVERSATION_EXTENSION_TYPE)) {
                    String launchType = valueDto.getLaunchType();
                    if (launchType == null) {
                        launchType = "";
                    }
                    String size = valueDto.getSize();
                    return new AnalyticsValueType.ConversationExtensionValueType(launchType, size != null ? size : "");
                }
                break;
            case 932275414:
                if (valueType.equals(AnalyticsValueType.ARTICLE_TYPE)) {
                    String senderType = valueDto.getSenderType();
                    return new AnalyticsValueType.ArticleValueType(senderType != null ? senderType : "");
                }
                break;
            case 1220093287:
                if (valueType.equals(AnalyticsValueType.CUSTOMIZATION_API_TYPE)) {
                    String elementChanged = valueDto.getElementChanged();
                    return new AnalyticsValueType.CustomizedAPIValueType(elementChanged != null ? elementChanged : "");
                }
                break;
        }
        return AnalyticsValueType.DefaultValueType.INSTANCE;
    }

    @NotNull
    public static final AnalyticsEvent toDomain(@NotNull AnalyticsEventDto analyticsEventDto) {
        analyticsEventDto.getClass();
        return new AnalyticsEvent(analyticsEventDto.getBuid(), analyticsEventDto.getSuid(), analyticsEventDto.getUuid(), analyticsEventDto.getVersion(), analyticsEventDto.getChannel(), analyticsEventDto.getTimestamp(), analyticsEventDto.getAcceptLanguage(), toDomain(analyticsEventDto.getUserAction()));
    }

    private static final UserAction toDomain(UserActionDto userActionDto) {
        return new UserAction(userActionDto.getCategory(), userActionDto.getAction(), userActionDto.getLabel(), toDomain(userActionDto.getValue()));
    }

    private static final Value toDomain(ValueDto valueDto) {
        return new Value(valueDto.getOperatingSystemVersion(), valueDto.getChannelName(), valueDto.getMultiConvoEnabled(), valueDto.getCanUserCreateMoreConversations(), valueDto.getCanUserSeeConversationList(), valueDto.getDevice(), valueDto.getUserType(), valueDto.getSource(), mapValueData(valueDto));
    }
}
