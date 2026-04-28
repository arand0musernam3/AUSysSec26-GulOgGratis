package com.braze.ui.actions;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.braze.BrazeInternal;
import com.braze.Constants;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.Channel;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.BrazeWebViewActivity;
import com.braze.ui.actions.UriAction;
import com.braze.ui.actions.brazeactions.BrazeActionParser;
import com.braze.ui.support.UriUtils;
import e0.f;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qw.b;
import qw.e;
import sr.r;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B+\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\rJ\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\"\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014J\"\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014J\"\u0010 \u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014J\"\u0010!\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014J\"\u0010\"\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0004J\"\u0010$\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0005J5\u0010%\u001a\b\u0012\u0004\u0012\u00020#0&2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010'\u001a\u00020#2\u0006\u0010(\u001a\u00020)H\u0007¢\u0006\u0002\u0010*R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006+"}, d2 = {"Lcom/braze/ui/actions/UriAction;", "Lcom/braze/ui/actions/IAction;", "uri", "Landroid/net/Uri;", InAppMessageBase.EXTRAS, "Landroid/os/Bundle;", "useWebView", "", "channel", "Lcom/braze/enums/Channel;", "<init>", "(Landroid/net/Uri;Landroid/os/Bundle;ZLcom/braze/enums/Channel;)V", "original", "(Lcom/braze/ui/actions/UriAction;)V", "getExtras", "()Landroid/os/Bundle;", "getChannel", "()Lcom/braze/enums/Channel;", "getUri", "()Landroid/net/Uri;", "setUri", "(Landroid/net/Uri;)V", "getUseWebView", "()Z", "setUseWebView", "(Z)V", "execute", "", "context", "Landroid/content/Context;", "openUriWithWebViewActivity", "openUriWithActionView", "openUriWithWebViewActivityFromPush", "openUriWithActionViewFromPush", "getWebViewActivityIntent", "Landroid/content/Intent;", "getActionViewIntent", "getIntentArrayWithConfiguredBackStack", "", "targetIntent", "configurationProvider", "Lcom/braze/configuration/BrazeConfigurationProvider;", "(Landroid/content/Context;Landroid/os/Bundle;Landroid/content/Intent;Lcom/braze/configuration/BrazeConfigurationProvider;)[Landroid/content/Intent;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class UriAction implements IAction {

    @NotNull
    private final Channel channel;

    @Nullable
    private final Bundle extras;

    @NotNull
    private Uri uri;
    private boolean useWebView;

    public UriAction(@NotNull UriAction uriAction) {
        uriAction.getClass();
        this.uri = uriAction.uri;
        this.extras = uriAction.extras;
        this.useWebView = uriAction.useWebView;
        this.channel = uriAction.channel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String execute$lambda$0(UriAction uriAction) {
        return a.b(uriAction.uri, "Not executing local Uri: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String execute$lambda$1(UriAction uriAction) {
        return "Executing BrazeActions uri:\n'" + uriAction.uri + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String execute$lambda$2(UriAction uriAction) {
        return "Executing Uri action from channel " + uriAction.channel + ": " + uriAction.uri + ". UseWebView: " + uriAction.useWebView + ". Extras: " + uriAction.extras;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getActionViewIntent$lambda$8(ResolveInfo resolveInfo) {
        return a0.p("Setting deep link intent package to ", resolveInfo.activityInfo.packageName, ".");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getIntentArrayWithConfiguredBackStack$lambda$10(String str) {
        return f.k("Adding custom back stack activity while opening uri from push: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getIntentArrayWithConfiguredBackStack$lambda$12(String str) {
        return f.k("Not adding unregistered activity to the back stack while opening uri from push: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getIntentArrayWithConfiguredBackStack$lambda$13() {
        return "Not adding back stack activity while opening uri from push due to disabled configuration setting.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getIntentArrayWithConfiguredBackStack$lambda$9() {
        return "Adding main activity intent to back stack while opening uri from push";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getWebViewActivityIntent$lambda$7(String str) {
        return f.k("Launching custom WebView Activity with class name: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String openUriWithActionView$lambda$4(Uri uri, Bundle bundle) {
        return "Failed to handle uri " + uri + " with extras: " + bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String openUriWithActionViewFromPush$lambda$6(Uri uri) {
        return a.b(uri, "Could not find appropriate activity to open for deep link ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String openUriWithWebViewActivity$lambda$3() {
        return "BrazeWebViewActivity not opened successfully.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String openUriWithWebViewActivityFromPush$lambda$5() {
        return "Braze WebView Activity not opened successfully.";
    }

    @Override // com.braze.ui.actions.IAction
    public void execute(@NotNull Context context) {
        context.getClass();
        if (BrazeFileUtils.isLocalUri(this.uri)) {
            final int i11 = 0;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0(this) { // from class: sw.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ UriAction f39281b;

                {
                    this.f39281b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i11) {
                        case 0:
                            return UriAction.execute$lambda$0(this.f39281b);
                        case 1:
                            return UriAction.execute$lambda$1(this.f39281b);
                        default:
                            return UriAction.execute$lambda$2(this.f39281b);
                    }
                }
            }, 7, (Object) null);
            return;
        }
        BrazeActionParser brazeActionParser = BrazeActionParser.INSTANCE;
        if (brazeActionParser.isBrazeActionUri(this.uri)) {
            final int i12 = 1;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0(this) { // from class: sw.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ UriAction f39281b;

                {
                    this.f39281b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i12) {
                        case 0:
                            return UriAction.execute$lambda$0(this.f39281b);
                        case 1:
                            return UriAction.execute$lambda$1(this.f39281b);
                        default:
                            return UriAction.execute$lambda$2(this.f39281b);
                    }
                }
            }, 6, (Object) null);
            brazeActionParser.execute(context, this.uri, this.channel);
            return;
        }
        final int i13 = 2;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0(this) { // from class: sw.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UriAction f39281b;

            {
                this.f39281b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return UriAction.execute$lambda$0(this.f39281b);
                    case 1:
                        return UriAction.execute$lambda$1(this.f39281b);
                    default:
                        return UriAction.execute$lambda$2(this.f39281b);
                }
            }
        }, 7, (Object) null);
        if (this.useWebView && CollectionsKt.I(BrazeFileUtils.REMOTE_SCHEMES, this.uri.getScheme())) {
            Channel channel = this.channel;
            Channel channel2 = Channel.PUSH;
            Uri uri = this.uri;
            Bundle bundle = this.extras;
            if (channel == channel2) {
                openUriWithWebViewActivityFromPush(context, uri, bundle);
                return;
            } else {
                openUriWithWebViewActivity(context, uri, bundle);
                return;
            }
        }
        Channel channel3 = this.channel;
        Channel channel4 = Channel.PUSH;
        Uri uri2 = this.uri;
        Bundle bundle2 = this.extras;
        if (channel3 == channel4) {
            openUriWithActionViewFromPush(context, uri2, bundle2);
        } else {
            openUriWithActionView(context, uri2, bundle2);
        }
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    @NotNull
    public final Intent getActionViewIntent(@NotNull Context context, @NotNull Uri uri, @Nullable Bundle extras) {
        context.getClass();
        uri.getClass();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        if (extras != null) {
            intent.putExtras(extras);
        }
        List<ResolveInfo> listQueryIntentActivities = Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0L)) : context.getPackageManager().queryIntentActivities(intent, 0);
        listQueryIntentActivities.getClass();
        if (listQueryIntentActivities.size() > 1) {
            Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ResolveInfo next = it.next();
                if (Intrinsics.areEqual(next.activityInfo.packageName, context.getPackageName())) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new rv.a(next, 6), 7, (Object) null);
                    intent.setPackage(next.activityInfo.packageName);
                    break;
                }
            }
        }
        return intent;
    }

    @Override // com.braze.ui.actions.IAction
    @NotNull
    public final Channel getChannel() {
        return this.channel;
    }

    @Nullable
    public final Bundle getExtras() {
        return this.extras;
    }

    @NotNull
    public final Intent[] getIntentArrayWithConfiguredBackStack(@NotNull Context context, @Nullable Bundle extras, @NotNull Intent targetIntent, @NotNull BrazeConfigurationProvider configurationProvider) {
        context.getClass();
        targetIntent.getClass();
        configurationProvider.getClass();
        Intent mainActivityIntent = null;
        if (configurationProvider.isPushDeepLinkBackStackActivityEnabled()) {
            String pushDeepLinkBackStackActivityClassName = configurationProvider.getPushDeepLinkBackStackActivityClassName();
            if (pushDeepLinkBackStackActivityClassName == null || StringsKt.H(pushDeepLinkBackStackActivityClassName)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new r(12), 6, (Object) null);
                mainActivityIntent = UriUtils.getMainActivityIntent(context, extras);
            } else if (UriUtils.isActivityRegisteredInManifest(context, pushDeepLinkBackStackActivityClassName)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new e(pushDeepLinkBackStackActivityClassName, 15), 6, (Object) null);
                if (extras != null) {
                    mainActivityIntent = new Intent().setClassName(context, pushDeepLinkBackStackActivityClassName).setFlags(BrazeDeeplinkHandler.INSTANCE.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_BACK_STACK_GET_ROOT_INTENT)).putExtras(extras);
                }
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new e(pushDeepLinkBackStackActivityClassName, 16), 6, (Object) null);
            }
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new r(10), 6, (Object) null);
        }
        if (mainActivityIntent != null) {
            return new Intent[]{mainActivityIntent, targetIntent};
        }
        targetIntent.setFlags(BrazeDeeplinkHandler.INSTANCE.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_BACK_STACK_ONLY_GET_TARGET_INTENT));
        return new Intent[]{targetIntent};
    }

    @NotNull
    public final Uri getUri() {
        return this.uri;
    }

    public final boolean getUseWebView() {
        return this.useWebView;
    }

    @NotNull
    public final Intent getWebViewActivityIntent(@NotNull Context context, @NotNull Uri uri, @Nullable Bundle extras) {
        Intent intent;
        context.getClass();
        uri.getClass();
        String customHtmlWebViewActivityClassName = BrazeInternal.INSTANCE.getConfigurationProvider(context).getCustomHtmlWebViewActivityClassName();
        if (customHtmlWebViewActivityClassName == null || StringsKt.H(customHtmlWebViewActivityClassName) || !UriUtils.isActivityRegisteredInManifest(context, customHtmlWebViewActivityClassName)) {
            intent = new Intent(context, (Class<?>) BrazeWebViewActivity.class);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new e(customHtmlWebViewActivityClassName, 14), 7, (Object) null);
            intent = new Intent().setClassName(context, customHtmlWebViewActivityClassName);
            intent.getClass();
        }
        if (extras != null) {
            intent.putExtras(extras);
        }
        intent.putExtra(Constants.BRAZE_WEBVIEW_URL_EXTRA, uri.toString());
        return intent;
    }

    public void openUriWithActionView(@NotNull Context context, @NotNull Uri uri, @Nullable Bundle extras) {
        context.getClass();
        uri.getClass();
        Intent actionViewIntent = getActionViewIntent(context, uri, extras);
        actionViewIntent.setFlags(BrazeDeeplinkHandler.INSTANCE.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_OPEN_WITH_ACTION_VIEW));
        try {
            context.startActivity(actionViewIntent);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new b(20, uri, extras), 4, (Object) null);
        }
    }

    public void openUriWithActionViewFromPush(@NotNull Context context, @NotNull Uri uri, @Nullable Bundle extras) {
        context.getClass();
        uri.getClass();
        try {
            context.startActivities(getIntentArrayWithConfiguredBackStack(context, extras, getActionViewIntent(context, uri, extras), BrazeInternal.INSTANCE.getConfigurationProvider(context)));
        } catch (ActivityNotFoundException e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e5, false, (Function0) new com.braze.ui.b(uri, 5), 4, (Object) null);
        }
    }

    public void openUriWithWebViewActivity(@NotNull Context context, @NotNull Uri uri, @Nullable Bundle extras) {
        context.getClass();
        uri.getClass();
        Intent webViewActivityIntent = getWebViewActivityIntent(context, uri, extras);
        webViewActivityIntent.setFlags(BrazeDeeplinkHandler.INSTANCE.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_OPEN_WITH_WEBVIEW_ACTIVITY));
        try {
            context.startActivity(webViewActivityIntent);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new r(9), 4, (Object) null);
        }
    }

    public void openUriWithWebViewActivityFromPush(@NotNull Context context, @NotNull Uri uri, @Nullable Bundle extras) {
        context.getClass();
        uri.getClass();
        try {
            context.startActivities(getIntentArrayWithConfiguredBackStack(context, extras, getWebViewActivityIntent(context, uri, extras), BrazeInternal.INSTANCE.getConfigurationProvider(context)));
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new r(11), 4, (Object) null);
        }
    }

    public final void setUri(@NotNull Uri uri) {
        uri.getClass();
        this.uri = uri;
    }

    public final void setUseWebView(boolean z11) {
        this.useWebView = z11;
    }

    public UriAction(@NotNull Uri uri, @Nullable Bundle bundle, boolean z11, @NotNull Channel channel) {
        uri.getClass();
        channel.getClass();
        this.uri = uri;
        this.extras = bundle;
        this.useWebView = z11;
        this.channel = channel;
    }
}
