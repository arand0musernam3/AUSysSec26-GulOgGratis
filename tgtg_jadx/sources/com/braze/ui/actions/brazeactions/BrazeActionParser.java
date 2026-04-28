package com.braze.ui.actions.brazeactions;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import b80.c;
import com.braze.enums.Channel;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.ui.actions.brazeactions.steps.AddToCustomAttributeArrayStep;
import com.braze.ui.actions.brazeactions.steps.AddToSubscriptionGroupStep;
import com.braze.ui.actions.brazeactions.steps.ContainerStep;
import com.braze.ui.actions.brazeactions.steps.IBrazeActionStep;
import com.braze.ui.actions.brazeactions.steps.LogCustomEventStep;
import com.braze.ui.actions.brazeactions.steps.NoOpStep;
import com.braze.ui.actions.brazeactions.steps.OpenLinkExternallyStep;
import com.braze.ui.actions.brazeactions.steps.OpenLinkInWebViewStep;
import com.braze.ui.actions.brazeactions.steps.RemoveFromCustomAttributeArrayStep;
import com.braze.ui.actions.brazeactions.steps.RemoveFromSubscriptionGroupStep;
import com.braze.ui.actions.brazeactions.steps.RequestPushPermissionStep;
import com.braze.ui.actions.brazeactions.steps.SetCustomUserAttributeStep;
import com.braze.ui.actions.brazeactions.steps.SetEmailSubscriptionStep;
import com.braze.ui.actions.brazeactions.steps.SetPushNotificationSubscriptionStep;
import com.braze.ui.actions.brazeactions.steps.StepData;
import j4.s;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.e0;
import kotlin.collections.w0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import qw.b;
import tr.e;
import v0.n;
import w.a0;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001 B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\b\u001a\u00020\t*\u0004\u0018\u00010\nJ \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u0011J\u001d\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0015J\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0019J\u001f\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001b*\u00020\nH\u0000¢\u0006\u0002\b\u001cJ\u0015\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u001fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/braze/ui/actions/brazeactions/BrazeActionParser;", "", "<init>", "()V", "BRAZE_ACTIONS_V1", "", CredentialProviderBaseController.TYPE_TAG, "BRAZE_ACTIONS_SCHEME", "isBrazeActionUri", "", "Landroid/net/Uri;", "execute", "", "context", "Landroid/content/Context;", "uri", "channel", "Lcom/braze/enums/Channel;", "parse", Bayeux.KEY_DATA, "Lcom/braze/ui/actions/brazeactions/steps/StepData;", "parse$android_sdk_ui_release", "parseEncodedActionToJson", "Lorg/json/JSONObject;", "action", "parseEncodedActionToJson$android_sdk_ui_release", "getBrazeActionVersionAndJson", "Lkotlin/Pair;", "getBrazeActionVersionAndJson$android_sdk_ui_release", "getActionType", "Lcom/braze/ui/actions/brazeactions/BrazeActionParser$ActionType;", "getActionType$android_sdk_ui_release", "ActionType", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BrazeActionParser {

    @NotNull
    public static final String BRAZE_ACTIONS_SCHEME = "brazeActions";

    @NotNull
    private static final String BRAZE_ACTIONS_V1 = "v1";

    @NotNull
    public static final BrazeActionParser INSTANCE = new BrazeActionParser();

    @NotNull
    public static final String TYPE = "type";

    private BrazeActionParser() {
    }

    public static /* synthetic */ void execute$default(BrazeActionParser brazeActionParser, Context context, Uri uri, Channel channel, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            channel = Channel.UNKNOWN;
        }
        brazeActionParser.execute(context, uri, channel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String execute$lambda$0(Channel channel, Uri uri) {
        return "Attempting to parse Braze Action with channel " + channel + " and uri:\n'" + uri + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String execute$lambda$1() {
        return "Failed to decode Braze Action into both version and json components. Doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String execute$lambda$2(String str) {
        return a0.p("Braze Actions version ", str, " is unsupported. Version must be v1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String execute$lambda$3(Uri uri) {
        return "Failed to parse uri as a Braze Action.\n'" + uri + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String execute$lambda$4(Uri uri) {
        return "Done handling Braze uri\n'" + uri + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getActionType$lambda$9(ActionType actionType, StepData stepData) {
        return "Cannot parse invalid action of type " + actionType + " and data " + stepData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBrazeActionVersionAndJson$lambda$7(Uri uri) {
        return a.b(uri, "Failed to parse version and encoded action from uri: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBrazeActionVersionAndJson$lambda$8(String str) {
        return a0.p("Failed to decode action into json. Action:\n'", str, "'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String parse$lambda$5(ActionType actionType, StepData stepData) {
        return "Performing Braze Action type " + actionType + " with data " + stepData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String parse$lambda$6(StepData stepData) {
        return "Failed to run with data " + stepData;
    }

    public final void execute(@NotNull Context context, @NotNull Uri uri, @NotNull Channel channel) {
        Pair brazeActionVersionAndJson$android_sdk_ui_release;
        context.getClass();
        uri.getClass();
        channel.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new b(25, channel, uri), 6, (Object) null);
        try {
            brazeActionVersionAndJson$android_sdk_ui_release = getBrazeActionVersionAndJson$android_sdk_ui_release(uri);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new com.braze.ui.b(uri, 7), 4, (Object) null);
        }
        if (brazeActionVersionAndJson$android_sdk_ui_release == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new e(19), 6, (Object) null);
            return;
        }
        String str = (String) brazeActionVersionAndJson$android_sdk_ui_release.f26485a;
        JSONObject jSONObject = (JSONObject) brazeActionVersionAndJson$android_sdk_ui_release.f26486b;
        if (!Intrinsics.areEqual(str, BRAZE_ACTIONS_V1)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qw.e(str, 18), 7, (Object) null);
        } else {
            parse$android_sdk_ui_release(context, new StepData(jSONObject, channel));
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new com.braze.ui.b(uri, 8), 6, (Object) null);
        }
    }

    public final /* synthetic */ ActionType getActionType$android_sdk_ui_release(StepData data) {
        data.getClass();
        ActionType actionTypeFromValue = ActionType.INSTANCE.fromValue(JsonUtils.getOptionalString(data.getSrcJson(), "type"));
        if (actionTypeFromValue.getImpl().isValid(data)) {
            return actionTypeFromValue;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new tw.a(actionTypeFromValue, data, 0), 7, (Object) null);
        return ActionType.INVALID;
    }

    public final /* synthetic */ Pair getBrazeActionVersionAndJson$android_sdk_ui_release(Uri uri) {
        JSONObject encodedActionToJson$android_sdk_ui_release;
        uri.getClass();
        String host = uri.getHost();
        String lastPathSegment = uri.getLastPathSegment();
        if (host == null || lastPathSegment == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) uri, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new com.braze.ui.b(uri, 6), 7, (Object) null);
            return null;
        }
        try {
            encodedActionToJson$android_sdk_ui_release = parseEncodedActionToJson$android_sdk_ui_release(lastPathSegment);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) uri, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new qw.e(lastPathSegment, 17), 4, (Object) null);
            encodedActionToJson$android_sdk_ui_release = null;
        }
        if (encodedActionToJson$android_sdk_ui_release == null) {
            return null;
        }
        return new Pair(host, encodedActionToJson$android_sdk_ui_release);
    }

    public final boolean isBrazeActionUri(@Nullable Uri uri) {
        return Intrinsics.areEqual(uri != null ? uri.getScheme() : null, BRAZE_ACTIONS_SCHEME);
    }

    public final /* synthetic */ void parse$android_sdk_ui_release(Context context, StepData data) {
        context.getClass();
        data.getClass();
        try {
            ActionType actionType$android_sdk_ui_release = getActionType$android_sdk_ui_release(data);
            if (actionType$android_sdk_ui_release == ActionType.INVALID) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new tw.a(actionType$android_sdk_ui_release, data, 1), 6, (Object) null);
            actionType$android_sdk_ui_release.getImpl().run(context, data);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new com.braze.ui.actions.brazeactions.steps.a(5, data), 4, (Object) null);
        }
    }

    public final /* synthetic */ JSONObject parseEncodedActionToJson$android_sdk_ui_release(String action) {
        action.getClass();
        byte[] bArrDecode = Base64.decode(action, 8);
        bArrDecode.getClass();
        int length = bArrDecode.length / 2;
        int[] iArr = new int[length];
        int iA = c.a(0, bArrDecode.length - 1, 2);
        if (iA >= 0) {
            int i11 = 0;
            while (true) {
                iArr[i11 / 2] = (bArrDecode[i11] & 255) | ((bArrDecode[i11 + 1] & 255) << 8);
                if (i11 == iA) {
                    break;
                }
                i11 += 2;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = iArr[i12];
            if (i13 < 0 || i13 > 65535) {
                i4.a.f(s.f(i13, "Invalid Char code: "));
                return null;
            }
            sb2.append((char) i13);
        }
        return new JSONObject(sb2.toString());
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0080\u0081\u0002\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0019B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u001a"}, d2 = {"Lcom/braze/ui/actions/brazeactions/BrazeActionParser$ActionType;", "", "key", "", "impl", "Lcom/braze/ui/actions/brazeactions/steps/IBrazeActionStep;", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lcom/braze/ui/actions/brazeactions/steps/IBrazeActionStep;)V", "getKey", "()Ljava/lang/String;", "getImpl", "()Lcom/braze/ui/actions/brazeactions/steps/IBrazeActionStep;", "CONTAINER", "LOG_CUSTOM_EVENT", "SET_CUSTOM_ATTRIBUTE", "REQUEST_PUSH_PERMISSION", "ADD_TO_SUBSCRIPTION_GROUP", "REMOVE_FROM_SUBSCRIPTION_GROUP", "ADD_TO_CUSTOM_ATTRIBUTE_ARRAY", "REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY", "SET_EMAIL_SUBSCRIPTION", "SET_PUSH_NOTIFICATION_SUBSCRIPTION", "OPEN_LINK_IN_WEBVIEW", "OPEN_LINK_EXTERNALLY", "INVALID", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nBrazeActionParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrazeActionParser.kt\ncom/braze/ui/actions/brazeactions/BrazeActionParser$ActionType\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,191:1\n1202#2,2:192\n1230#2,4:194\n*S KotlinDebug\n*F\n+ 1 BrazeActionParser.kt\ncom/braze/ui/actions/brazeactions/BrazeActionParser$ActionType\n*L\n50#1:192,2\n50#1:194,4\n*E\n"})
    public static final class ActionType {
        private static final /* synthetic */ a80.a $ENTRIES;
        private static final /* synthetic */ ActionType[] $VALUES;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;

        @NotNull
        private static final Map<String, ActionType> map;

        @NotNull
        private final IBrazeActionStep impl;

        @NotNull
        private final String key;
        public static final ActionType CONTAINER = new ActionType("CONTAINER", 0, "container", ContainerStep.INSTANCE);
        public static final ActionType LOG_CUSTOM_EVENT = new ActionType("LOG_CUSTOM_EVENT", 1, "logCustomEvent", LogCustomEventStep.INSTANCE);
        public static final ActionType SET_CUSTOM_ATTRIBUTE = new ActionType("SET_CUSTOM_ATTRIBUTE", 2, "setCustomUserAttribute", SetCustomUserAttributeStep.INSTANCE);
        public static final ActionType REQUEST_PUSH_PERMISSION = new ActionType("REQUEST_PUSH_PERMISSION", 3, "requestPushPermission", RequestPushPermissionStep.INSTANCE);
        public static final ActionType ADD_TO_SUBSCRIPTION_GROUP = new ActionType("ADD_TO_SUBSCRIPTION_GROUP", 4, "addToSubscriptionGroup", AddToSubscriptionGroupStep.INSTANCE);
        public static final ActionType REMOVE_FROM_SUBSCRIPTION_GROUP = new ActionType("REMOVE_FROM_SUBSCRIPTION_GROUP", 5, "removeFromSubscriptionGroup", RemoveFromSubscriptionGroupStep.INSTANCE);
        public static final ActionType ADD_TO_CUSTOM_ATTRIBUTE_ARRAY = new ActionType("ADD_TO_CUSTOM_ATTRIBUTE_ARRAY", 6, "addToCustomAttributeArray", AddToCustomAttributeArrayStep.INSTANCE);
        public static final ActionType REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY = new ActionType("REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY", 7, "removeFromCustomAttributeArray", RemoveFromCustomAttributeArrayStep.INSTANCE);
        public static final ActionType SET_EMAIL_SUBSCRIPTION = new ActionType("SET_EMAIL_SUBSCRIPTION", 8, "setEmailNotificationSubscriptionType", SetEmailSubscriptionStep.INSTANCE);
        public static final ActionType SET_PUSH_NOTIFICATION_SUBSCRIPTION = new ActionType("SET_PUSH_NOTIFICATION_SUBSCRIPTION", 9, "setPushNotificationSubscriptionType", SetPushNotificationSubscriptionStep.INSTANCE);
        public static final ActionType OPEN_LINK_IN_WEBVIEW = new ActionType("OPEN_LINK_IN_WEBVIEW", 10, "openLinkInWebview", OpenLinkInWebViewStep.INSTANCE);
        public static final ActionType OPEN_LINK_EXTERNALLY = new ActionType("OPEN_LINK_EXTERNALLY", 11, "openLink", OpenLinkExternallyStep.INSTANCE);
        public static final ActionType INVALID = new ActionType("INVALID", 12, "", NoOpStep.INSTANCE);

        private static final /* synthetic */ ActionType[] $values() {
            return new ActionType[]{CONTAINER, LOG_CUSTOM_EVENT, SET_CUSTOM_ATTRIBUTE, REQUEST_PUSH_PERMISSION, ADD_TO_SUBSCRIPTION_GROUP, REMOVE_FROM_SUBSCRIPTION_GROUP, ADD_TO_CUSTOM_ATTRIBUTE_ARRAY, REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY, SET_EMAIL_SUBSCRIPTION, SET_PUSH_NOTIFICATION_SUBSCRIPTION, OPEN_LINK_IN_WEBVIEW, OPEN_LINK_EXTERNALLY, INVALID};
        }

        static {
            ActionType[] actionTypeArr$values = $values();
            $VALUES = actionTypeArr$values;
            $ENTRIES = n.w(actionTypeArr$values);
            INSTANCE = new Companion(null);
            a80.a entries = getEntries();
            int iA = w0.a(e0.o(entries, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
            for (Object obj : entries) {
                linkedHashMap.put(((ActionType) obj).key, obj);
            }
            map = linkedHashMap;
        }

        private ActionType(String str, int i11, String str2, IBrazeActionStep iBrazeActionStep) {
            this.key = str2;
            this.impl = iBrazeActionStep;
        }

        @NotNull
        public static final ActionType fromValue(@Nullable String str) {
            return INSTANCE.fromValue(str);
        }

        @NotNull
        public static a80.a getEntries() {
            return $ENTRIES;
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) $VALUES.clone();
        }

        @NotNull
        public final IBrazeActionStep getImpl() {
            return this.impl;
        }

        @NotNull
        public final String getKey() {
            return this.key;
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0007R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/braze/ui/actions/brazeactions/BrazeActionParser$ActionType$Companion;", "", "<init>", "()V", "map", "", "", "Lcom/braze/ui/actions/brazeactions/BrazeActionParser$ActionType;", "fromValue", "value", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nBrazeActionParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrazeActionParser.kt\ncom/braze/ui/actions/brazeactions/BrazeActionParser$ActionType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,191:1\n1#2:192\n*E\n"})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final ActionType fromValue(@Nullable String value) {
                Map map = ActionType.map;
                if (value == null) {
                    value = "";
                }
                Object obj = map.get(value);
                if (obj == null) {
                    obj = ActionType.INVALID;
                }
                return (ActionType) obj;
            }

            private Companion() {
            }
        }
    }
}
