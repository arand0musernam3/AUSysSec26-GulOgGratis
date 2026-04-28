package zendesk.analyticskit.android.model;

import e40.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zendesk.analyticskit.android.internal.model.AnalyticsEventDto;
import zendesk.analyticskit.android.internal.model.UserActionDto;
import zendesk.analyticskit.android.internal.model.ValueDto;
import zendesk.analyticskit.android.model.AnalyticsValueType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0003*\u00020\u0004H\u0002\u001a\f\u0010\u0000\u001a\u00020\u0005*\u00020\u0006H\u0002¨\u0006\u0007"}, d2 = {"toDto", "Lzendesk/analyticskit/android/internal/model/AnalyticsEventDto;", "Lzendesk/analyticskit/android/model/AnalyticsEvent;", "Lzendesk/analyticskit/android/internal/model/UserActionDto;", "Lzendesk/analyticskit/android/model/UserAction;", "Lzendesk/analyticskit/android/internal/model/ValueDto;", "Lzendesk/analyticskit/android/model/Value;", "zendesk.analyticskit_analyticskit-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AnalyticsEventKt {
    private static final ValueDto toDto(Value value) {
        AnalyticsValueType valueType = value.getValueType();
        if (Intrinsics.areEqual(valueType, AnalyticsValueType.DefaultValueType.INSTANCE)) {
            return new ValueDto(AnalyticsValueTypeKt.toSerializedString(value.getValueType()), value.getOperatingSystemVersion(), value.getChannelName(), value.getMultiConvoEnabled(), value.getCanUserCreateMoreConversations(), value.getCanUserSeeConversationList(), value.getDevice(), value.getUserType(), value.getSource(), (String) null, (String) null, (String) null, (String) null, (String) null, 15872, (DefaultConstructorMarker) null);
        }
        if (valueType instanceof AnalyticsValueType.ArticleValueType) {
            return new ValueDto(AnalyticsValueTypeKt.toSerializedString(value.getValueType()), value.getOperatingSystemVersion(), value.getChannelName(), value.getMultiConvoEnabled(), value.getCanUserCreateMoreConversations(), value.getCanUserSeeConversationList(), value.getDevice(), value.getUserType(), value.getSource(), (String) null, (String) null, ((AnalyticsValueType.ArticleValueType) value.getValueType()).getSenderType(), (String) null, (String) null, 13824, (DefaultConstructorMarker) null);
        }
        if (valueType instanceof AnalyticsValueType.ConversationExtensionValueType) {
            return new ValueDto(AnalyticsValueTypeKt.toSerializedString(value.getValueType()), value.getOperatingSystemVersion(), value.getChannelName(), value.getMultiConvoEnabled(), value.getCanUserCreateMoreConversations(), value.getCanUserSeeConversationList(), value.getDevice(), value.getUserType(), value.getSource(), ((AnalyticsValueType.ConversationExtensionValueType) value.getValueType()).getLaunchType(), ((AnalyticsValueType.ConversationExtensionValueType) value.getValueType()).getSize(), (String) null, (String) null, (String) null, 14336, (DefaultConstructorMarker) null);
        }
        if (valueType instanceof AnalyticsValueType.CustomizedAPIValueType) {
            return new ValueDto(AnalyticsValueTypeKt.toSerializedString(value.getValueType()), value.getOperatingSystemVersion(), value.getChannelName(), value.getMultiConvoEnabled(), value.getCanUserCreateMoreConversations(), value.getCanUserSeeConversationList(), value.getDevice(), value.getUserType(), value.getSource(), (String) null, (String) null, (String) null, ((AnalyticsValueType.CustomizedAPIValueType) value.getValueType()).getElementChanged(), (String) null, 11776, (DefaultConstructorMarker) null);
        }
        if (!(valueType instanceof AnalyticsValueType.MessagingScreenValueType)) {
            a.f();
            return null;
        }
        String operatingSystemVersion = value.getOperatingSystemVersion();
        String channelName = value.getChannelName();
        boolean multiConvoEnabled = value.getMultiConvoEnabled();
        boolean canUserCreateMoreConversations = value.getCanUserCreateMoreConversations();
        boolean canUserSeeConversationList = value.getCanUserSeeConversationList();
        String device = value.getDevice();
        String userType = value.getUserType();
        String exitAction = ((AnalyticsValueType.MessagingScreenValueType) value.getValueType()).getExitAction();
        return new ValueDto(AnalyticsValueTypeKt.toSerializedString(value.getValueType()), operatingSystemVersion, channelName, multiConvoEnabled, canUserCreateMoreConversations, canUserSeeConversationList, device, userType, value.getSource(), (String) null, (String) null, (String) null, (String) null, exitAction, 7680, (DefaultConstructorMarker) null);
    }

    private static final UserActionDto toDto(UserAction userAction) {
        return new UserActionDto(userAction.getCategory(), userAction.getAction(), userAction.getLabel(), toDto(userAction.getValue()));
    }

    @NotNull
    public static final AnalyticsEventDto toDto(@NotNull AnalyticsEvent analyticsEvent) {
        analyticsEvent.getClass();
        return new AnalyticsEventDto(analyticsEvent.getBuid(), analyticsEvent.getSuid(), analyticsEvent.getUuid(), analyticsEvent.getVersion(), analyticsEvent.getChannel(), analyticsEvent.getTimestamp(), analyticsEvent.getLanguage(), toDto(analyticsEvent.getUserAction()));
    }
}
