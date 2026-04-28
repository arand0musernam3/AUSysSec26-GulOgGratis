package com.braze.ui;

import aa.e;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.braze.Constants;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.enums.Channel;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.models.inappmessage.m;
import com.braze.support.BrazeLogger;
import com.braze.ui.actions.UriAction;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J,\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J*\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016¨\u0006\u001b"}, d2 = {"Lcom/braze/ui/BrazeDeeplinkHandler;", "Lcom/braze/IBrazeDeeplinkHandler;", "<init>", "()V", "gotoUri", "", "context", "Landroid/content/Context;", "uriAction", "Lcom/braze/ui/actions/UriAction;", "getIntentFlags", "", "intentFlagPurpose", "Lcom/braze/IBrazeDeeplinkHandler$IntentFlagPurpose;", "createUriActionFromUrlString", Constants.BRAZE_WEBVIEW_URL_EXTRA, "", InAppMessageBase.EXTRAS, "Landroid/os/Bundle;", "openInWebView", "", "channel", "Lcom/braze/enums/Channel;", "createUriActionFromUri", "uri", "Landroid/net/Uri;", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBrazeDeeplinkHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrazeDeeplinkHandler.kt\ncom/braze/ui/BrazeDeeplinkHandler\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,90:1\n29#2:91\n*S KotlinDebug\n*F\n+ 1 BrazeDeeplinkHandler.kt\ncom/braze/ui/BrazeDeeplinkHandler\n*L\n43#1:91\n*E\n"})
public class BrazeDeeplinkHandler implements IBrazeDeeplinkHandler {

    @Nullable
    private static volatile IBrazeDeeplinkHandler customHandler;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final IBrazeDeeplinkHandler defaultHandler = new BrazeDeeplinkHandler();

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IBrazeDeeplinkHandler.IntentFlagPurpose.values().length];
            try {
                iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.NOTIFICATION_ACTION_WITH_DEEPLINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.NOTIFICATION_PUSH_STORY_PAGE_CLICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_OPEN_WITH_WEBVIEW_ACTIVITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_OPEN_WITH_ACTION_VIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.URI_UTILS_GET_MAIN_ACTIVITY_INTENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_BACK_STACK_GET_ROOT_INTENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_BACK_STACK_ONLY_GET_TARGET_INTENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createUriActionFromUrlString$lambda$0() {
        return "createUriActionFromUrlString url was null. Returning null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createUriActionFromUrlString$lambda$1() {
        return "createUriActionFromUrlString failed. Returning null.";
    }

    @NotNull
    public static final IBrazeDeeplinkHandler getInstance() {
        return INSTANCE.getInstance();
    }

    public static final void setBrazeDeeplinkHandler(@Nullable IBrazeDeeplinkHandler iBrazeDeeplinkHandler) {
        INSTANCE.setBrazeDeeplinkHandler(iBrazeDeeplinkHandler);
    }

    @Override // com.braze.IBrazeDeeplinkHandler
    @NotNull
    public UriAction createUriActionFromUri(@NotNull Uri uri, @Nullable Bundle extras, boolean openInWebView, @NotNull Channel channel) {
        uri.getClass();
        channel.getClass();
        return new UriAction(uri, extras, openInWebView, channel);
    }

    @Override // com.braze.IBrazeDeeplinkHandler
    @Nullable
    public UriAction createUriActionFromUrlString(@NotNull String url, @Nullable Bundle extras, boolean openInWebView, @NotNull Channel channel) {
        url.getClass();
        channel.getClass();
        try {
            if (!StringsKt.H(url)) {
                return createUriActionFromUri(Uri.parse(url), extras, openInWebView, channel);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new m(12), 6, (Object) null);
            return null;
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new m(13), 4, (Object) null);
            return null;
        }
    }

    @Override // com.braze.IBrazeDeeplinkHandler
    public int getIntentFlags(@NotNull IBrazeDeeplinkHandler.IntentFlagPurpose intentFlagPurpose) {
        intentFlagPurpose.getClass();
        switch (WhenMappings.$EnumSwitchMapping$0[intentFlagPurpose.ordinal()]) {
            case 1:
            case 2:
                return 1073741824;
            case 3:
            case 4:
            case 5:
                return 872415232;
            case 6:
            case 7:
                return 268435456;
            default:
                e40.a.f();
                return 0;
        }
    }

    @Override // com.braze.IBrazeDeeplinkHandler
    public void gotoUri(@NotNull Context context, @NotNull UriAction uriAction) {
        context.getClass();
        uriAction.getClass();
        uriAction.execute(context);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\u0005H\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/braze/ui/BrazeDeeplinkHandler$Companion;", "", "<init>", "()V", "defaultHandler", "Lcom/braze/IBrazeDeeplinkHandler;", "customHandler", "getInstance", "setBrazeDeeplinkHandler", "", "brazeDeeplinkHandler", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String setBrazeDeeplinkHandler$lambda$0(IBrazeDeeplinkHandler iBrazeDeeplinkHandler) {
            return "Custom IBrazeDeeplinkHandler ".concat(iBrazeDeeplinkHandler == null ? "cleared" : "set");
        }

        @NotNull
        public final IBrazeDeeplinkHandler getInstance() {
            IBrazeDeeplinkHandler iBrazeDeeplinkHandler = BrazeDeeplinkHandler.customHandler;
            return iBrazeDeeplinkHandler == null ? BrazeDeeplinkHandler.defaultHandler : iBrazeDeeplinkHandler;
        }

        public final void setBrazeDeeplinkHandler(@Nullable IBrazeDeeplinkHandler brazeDeeplinkHandler) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new e(brazeDeeplinkHandler, 25), 7, (Object) null);
            BrazeDeeplinkHandler.customHandler = brazeDeeplinkHandler;
        }

        private Companion() {
        }
    }
}
