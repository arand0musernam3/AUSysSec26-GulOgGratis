package com.braze.ui;

import a90.p;
import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import ba0.g;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import com.braze.BrazeInternal;
import com.braze.Constants;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.h2;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.m;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.ui.banners.listeners.IBannerWebViewClientListener;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener;
import com.braze.ui.inappmessage.listeners.IWebViewClientStateListener;
import com.braze.ui.support.UriUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v0.n;
import v80.b0;
import v80.f0;
import v80.i1;
import v80.p0;
import w.a0;
import xa.d;
import xa.f;
import z70.e;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 L2\u00020\u0001:\u0002MLBG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J%\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010&\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\fH\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010(\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\fH\u0017¢\u0006\u0004\b(\u0010*J\u0017\u0010-\u001a\u00020\u00122\b\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b-\u0010.J\u001f\u00101\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u00108R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00109R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010:R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010;R\u0018\u0010<\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010D\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006N"}, d2 = {"Lcom/braze/ui/BrazeWebViewClient;", "Landroid/webkit/WebViewClient;", "Landroid/content/Context;", "context", "Lcom/braze/ui/BrazeWebViewClient$Type;", "type", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessage", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageWebViewClientListener;", "inAppMessageWebViewClientListener", "Lcom/braze/ui/banners/listeners/IBannerWebViewClientListener;", "bannerWebViewClientListener", "", "assetDirectoryUrl", "<init>", "(Landroid/content/Context;Lcom/braze/ui/BrazeWebViewClient$Type;Lcom/braze/models/inappmessage/IInAppMessage;Lcom/braze/ui/inappmessage/listeners/IInAppMessageWebViewClientListener;Lcom/braze/ui/banners/listeners/IBannerWebViewClientListener;Ljava/lang/String;)V", "Landroid/webkit/WebView;", "view", "", "appendBridgeJavascript", "(Landroid/webkit/WebView;)V", "markPageFinished", "()V", Constants.BRAZE_WEBVIEW_URL_EXTRA, "", "handleUrlOverride", "(Ljava/lang/String;)Z", "Landroid/net/Uri;", "uri", "Landroid/os/Bundle;", "queryBundle", "handleQueryAction", "(Ljava/lang/String;Landroid/net/Uri;Landroid/os/Bundle;)V", "Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceResponse;", "shouldInterceptRequest", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z", "(Landroid/webkit/WebView;Ljava/lang/String;)Z", "Lcom/braze/ui/inappmessage/listeners/IWebViewClientStateListener;", "listener", "setWebViewClientStateListener", "(Lcom/braze/ui/inappmessage/listeners/IWebViewClientStateListener;)V", "Landroid/webkit/RenderProcessGoneDetail;", "detail", "onRenderProcessGone", "(Landroid/webkit/WebView;Landroid/webkit/RenderProcessGoneDetail;)Z", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/braze/ui/BrazeWebViewClient$Type;", "getType", "()Lcom/braze/ui/BrazeWebViewClient$Type;", "Lcom/braze/models/inappmessage/IInAppMessage;", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageWebViewClientListener;", "Lcom/braze/ui/banners/listeners/IBannerWebViewClientListener;", "webViewClientStateListener", "Lcom/braze/ui/inappmessage/listeners/IWebViewClientStateListener;", "hasPageFinishedLoading", "Z", "Ljava/util/concurrent/atomic/AtomicBoolean;", "hasCalledPageFinishedOnListener", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lv80/i1;", "markPageFinishedJob", "Lv80/i1;", "", "maxOnPageFinishedWaitTimeMs", "I", "Lxa/f;", "assetLoader", "Lxa/f;", "Companion", "Type", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBrazeWebViewClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrazeWebViewClient.kt\ncom/braze/ui/BrazeWebViewClient\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,313:1\n29#2:314\n*S KotlinDebug\n*F\n+ 1 BrazeWebViewClient.kt\ncom/braze/ui/BrazeWebViewClient\n*L\n185#1:314\n*E\n"})
public class BrazeWebViewClient extends WebViewClient {

    @NotNull
    private static final String AUTHORITY_NAME_CLOSE = "close";

    @NotNull
    private static final String AUTHORITY_NAME_CUSTOM_EVENT = "customEvent";

    @NotNull
    private static final String BRAZE_CUSTOM_EVENT_NAME_KEY = "name";

    @NotNull
    private static final String BRAZE_SCHEME = "appboy";

    @NotNull
    public static final String BRIDGE_JS_FILE = "braze-html-bridge.js";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String JAVASCRIPT_PREFIX = "javascript:";

    @NotNull
    public static final String QUERY_NAME_BUTTON_ID = "abButtonId";

    @NotNull
    public static final String QUERY_NAME_DEEPLINK = "abDeepLink";

    @NotNull
    public static final String QUERY_NAME_EXTERNAL_OPEN = "abExternalOpen";

    @NotNull
    private final f assetLoader;

    @Nullable
    private final IBannerWebViewClientListener bannerWebViewClientListener;

    @NotNull
    private final Context context;

    @NotNull
    private final AtomicBoolean hasCalledPageFinishedOnListener;
    private boolean hasPageFinishedLoading;

    @Nullable
    private final IInAppMessage inAppMessage;

    @Nullable
    private final IInAppMessageWebViewClientListener inAppMessageWebViewClientListener;

    @Nullable
    private i1 markPageFinishedJob;
    private final int maxOnPageFinishedWaitTimeMs;

    @NotNull
    private final Type type;

    @Nullable
    private IWebViewClientStateListener webViewClientStateListener;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/braze/ui/BrazeWebViewClient$Type;", "", "<init>", "(Ljava/lang/String;I)V", "BANNER", "IN_APP_MESSAGE", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ a80.a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type BANNER = new Type("BANNER", 0);
        public static final Type IN_APP_MESSAGE = new Type("IN_APP_MESSAGE", 1);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{BANNER, IN_APP_MESSAGE};
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = n.w(typeArr$values);
        }

        private Type(String str, int i11) {
        }

        @NotNull
        public static a80.a getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Type.values().length];
            try {
                iArr[Type.IN_APP_MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.BrazeWebViewClient$setWebViewClientStateListener$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.braze.ui.BrazeWebViewClient$setWebViewClientStateListener$1", f = "BrazeWebViewClient.kt", l = {156}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 extends i implements Function1<x70.c<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.braze.ui.BrazeWebViewClient$setWebViewClientStateListener$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @e(c = "com.braze.ui.BrazeWebViewClient$setWebViewClientStateListener$1$1", f = "BrazeWebViewClient.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 0, 0})
        public static final class C00231 extends i implements Function2<b0, x70.c<? super Unit>, Object> {
            int label;
            final /* synthetic */ BrazeWebViewClient this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00231(BrazeWebViewClient brazeWebViewClient, x70.c<? super C00231> cVar) {
                super(2, cVar);
                this.this$0 = brazeWebViewClient;
            }

            @Override // z70.a
            public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
                return new C00231(this.this$0, cVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
                return ((C00231) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
            }

            @Override // z70.a
            public final Object invokeSuspend(Object obj) {
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
                this.this$0.markPageFinished();
                return Unit.f26487a;
            }
        }

        public AnonymousClass1(x70.c<? super AnonymousClass1> cVar) {
            super(1, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(x70.c<?> cVar) {
            return BrazeWebViewClient.this.new AnonymousClass1(cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(x70.c<? super Unit> cVar) {
            return ((AnonymousClass1) create(cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                c90.f fVar = p0.f42144a;
                w80.c cVar = p.f1044a;
                C00231 c00231 = new C00231(BrazeWebViewClient.this, null);
                this.label = 1;
                if (f0.K(cVar, c00231, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            return Unit.f26487a;
        }
    }

    public BrazeWebViewClient(@NotNull Context context, @NotNull Type type, @Nullable IInAppMessage iInAppMessage, @Nullable IInAppMessageWebViewClientListener iInAppMessageWebViewClientListener, @Nullable IBannerWebViewClientListener iBannerWebViewClientListener, @Nullable String str) {
        f fVar;
        context.getClass();
        type.getClass();
        this.context = context;
        this.type = type;
        this.inAppMessage = iInAppMessage;
        this.inAppMessageWebViewClientListener = iInAppMessageWebViewClientListener;
        this.bannerWebViewClientListener = iBannerWebViewClientListener;
        this.hasCalledPageFinishedOnListener = new AtomicBoolean(false);
        this.maxOnPageFinishedWaitTimeMs = BrazeInternal.INSTANCE.getConfigurationProvider(context).getInAppMessageWebViewClientOnPageFinishedMaxWaitMs();
        if (str != null) {
            ArrayList<g7.a> arrayList = new ArrayList();
            arrayList.add(new g7.a(ExpiryDateInput.SEPARATOR, new d(context, new File(str))));
            ArrayList arrayList2 = new ArrayList();
            for (g7.a aVar : arrayList) {
                arrayList2.add(new xa.e((String) aVar.f20083a, (d) aVar.f20084b));
            }
            fVar = new f(arrayList2);
        } else {
            File file = new File(context.getCacheDir(), Constants.TRIGGERS_ASSETS_FOLDER);
            ArrayList<g7.a> arrayList3 = new ArrayList();
            arrayList3.add(new g7.a("/ab_triggers/", new d(context, file)));
            ArrayList arrayList4 = new ArrayList();
            for (g7.a aVar2 : arrayList3) {
                arrayList4.add(new xa.e((String) aVar2.f20083a, (d) aVar2.f20084b));
            }
            fVar = new f(arrayList4);
        }
        this.assetLoader = fVar;
    }

    private final void appendBridgeJavascript(WebView view) {
        try {
            AssetManager assets = this.context.getAssets();
            assets.getClass();
            view.loadUrl(JAVASCRIPT_PREFIX + BrazeFileUtils.getAssetFileStringContents(assets, BRIDGE_JS_FILE));
        } catch (Exception e5) {
            if (this.type == Type.IN_APP_MESSAGE) {
                BrazeInAppMessageManager.INSTANCE.getInstance().hideCurrentlyDisplayingInAppMessage(false);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new aa.e(this, 26), 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String appendBridgeJavascript$lambda$3(BrazeWebViewClient brazeWebViewClient) {
        return a0.p("Failed to get HTML ", brazeWebViewClient.type.name(), " javascript additions");
    }

    @NotNull
    public static final Bundle getBundleFromUrl(@NotNull String str) {
        return INSTANCE.getBundleFromUrl(str);
    }

    private final void handleQueryAction(String url, Uri uri, Bundle queryBundle) {
        IBannerWebViewClientListener iBannerWebViewClientListener;
        IInAppMessageWebViewClientListener iInAppMessageWebViewClientListener;
        IBannerWebViewClientListener iBannerWebViewClientListener2;
        IInAppMessageWebViewClientListener iInAppMessageWebViewClientListener2;
        String authority = uri.getAuthority();
        if (authority == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new b(uri, 0), 7, (Object) null);
            return;
        }
        int iHashCode = authority.hashCode();
        if (iHashCode == -1801488983) {
            if (authority.equals(AUTHORITY_NAME_CUSTOM_EVENT)) {
                Type type = this.type;
                if (type != Type.IN_APP_MESSAGE) {
                    if (type != Type.BANNER || (iBannerWebViewClientListener = this.bannerWebViewClientListener) == null) {
                        return;
                    }
                    iBannerWebViewClientListener.onCustomEventAction(this.context, url, queryBundle);
                    return;
                }
                IInAppMessage iInAppMessage = this.inAppMessage;
                if (iInAppMessage == null || (iInAppMessageWebViewClientListener = this.inAppMessageWebViewClientListener) == null) {
                    return;
                }
                iInAppMessageWebViewClientListener.onCustomEventAction(iInAppMessage, url, queryBundle);
                return;
            }
            return;
        }
        if (iHashCode == 94756344 && authority.equals("close")) {
            Type type2 = this.type;
            if (type2 != Type.IN_APP_MESSAGE) {
                if (type2 != Type.BANNER || (iBannerWebViewClientListener2 = this.bannerWebViewClientListener) == null) {
                    return;
                }
                iBannerWebViewClientListener2.onCloseAction(this.context, url, queryBundle);
                return;
            }
            IInAppMessage iInAppMessage2 = this.inAppMessage;
            if (iInAppMessage2 == null || (iInAppMessageWebViewClientListener2 = this.inAppMessageWebViewClientListener) == null) {
                return;
            }
            iInAppMessageWebViewClientListener2.onCloseAction(iInAppMessage2, url, queryBundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleQueryAction$lambda$10(Uri uri) {
        return org.bouncycastle.jcajce.provider.asymmetric.a.b(uri, "Uri authority was null. Uri: ");
    }

    private final boolean handleUrlOverride(String url) {
        IInAppMessageWebViewClientListener iInAppMessageWebViewClientListener;
        Type type = this.type;
        String str = (type == Type.IN_APP_MESSAGE && this.inAppMessageWebViewClientListener == null) ? "BrazeWebViewClient was given null IInAppMessageWebViewClientListener listener. Returning true." : (type == Type.BANNER && this.bannerWebViewClientListener == null) ? "BrazeWebViewClient was given null IBannerWebViewClientListener listener. Returning true." : StringsKt.H(url) ? "BrazeWebViewClient.shouldOverrideUrlLoading was given blank url. Returning true." : null;
        if (str != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new com.braze.models.inappmessage.n(str, 3), 6, (Object) null);
            return true;
        }
        Uri uri = Uri.parse(url);
        Bundle bundleFromUrl = INSTANCE.getBundleFromUrl(url);
        if (uri.getScheme() != null && Intrinsics.areEqual(uri.getScheme(), BRAZE_SCHEME)) {
            handleQueryAction(url, uri, bundleFromUrl);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new b(uri, 1), 7, (Object) null);
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i11 == 1) {
            IInAppMessage iInAppMessage = this.inAppMessage;
            if (iInAppMessage != null && (iInAppMessageWebViewClientListener = this.inAppMessageWebViewClientListener) != null) {
                iInAppMessageWebViewClientListener.onOtherUrlAction(iInAppMessage, url, bundleFromUrl);
            }
        } else {
            if (i11 != 2) {
                e40.a.f();
                return false;
            }
            IBannerWebViewClientListener iBannerWebViewClientListener = this.bannerWebViewClientListener;
            if (iBannerWebViewClientListener != null) {
                iBannerWebViewClientListener.onOtherUrlAction(this.context, url, bundleFromUrl);
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleUrlOverride$lambda$8(Uri uri) {
        return org.bouncycastle.jcajce.provider.asymmetric.a.b(uri, "Uri scheme was null or not an appboy url. Uri: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markPageFinished() {
        IWebViewClientStateListener iWebViewClientStateListener = this.webViewClientStateListener;
        if (iWebViewClientStateListener == null || !this.hasCalledPageFinishedOnListener.compareAndSet(false, true)) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new m(16), 6, (Object) null);
        iWebViewClientStateListener.onPageFinished();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String markPageFinished$lambda$5$lambda$4() {
        return "Page may not have finished loading, but max wait time has expired. Calling onPageFinished on listener.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onPageFinished$lambda$2$lambda$1() {
        return "Page has finished loading. Calling onPageFinished on listener";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onRenderProcessGone$lambda$13() {
        return "The webview rendering process crashed, returning true";
    }

    @Nullable
    public static final String parseCustomEventNameFromQueryBundle(@NotNull Bundle bundle) {
        return INSTANCE.parseCustomEventNameFromQueryBundle(bundle);
    }

    @NotNull
    public static final BrazeProperties parsePropertiesFromQueryBundle(@NotNull Bundle bundle) {
        return INSTANCE.parsePropertiesFromQueryBundle(bundle);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final Type getType() {
        return this.type;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(@NotNull WebView view, @NotNull String url) {
        BrazeWebViewClient brazeWebViewClient;
        view.getClass();
        url.getClass();
        super.onPageFinished(view, url);
        appendBridgeJavascript(view);
        IWebViewClientStateListener iWebViewClientStateListener = this.webViewClientStateListener;
        if (iWebViewClientStateListener == null || !this.hasCalledPageFinishedOnListener.compareAndSet(false, true)) {
            brazeWebViewClient = this;
        } else {
            brazeWebViewClient = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeWebViewClient, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new m(18), 6, (Object) null);
            iWebViewClientStateListener.onPageFinished();
        }
        brazeWebViewClient.hasPageFinishedLoading = true;
        i1 i1Var = brazeWebViewClient.markPageFinishedJob;
        if (i1Var != null) {
            i1Var.a(null);
        }
        brazeWebViewClient.markPageFinishedJob = null;
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(@NotNull WebView view, @NotNull RenderProcessGoneDetail detail) {
        view.getClass();
        detail.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new m(17), 6, (Object) null);
        return true;
    }

    public final void setWebViewClientStateListener(@Nullable IWebViewClientStateListener listener) {
        if (listener != null && this.hasPageFinishedLoading && this.hasCalledPageFinishedOnListener.compareAndSet(false, true)) {
            listener.onPageFinished();
        } else {
            this.markPageFinishedJob = BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Integer.valueOf(this.maxOnPageFinishedWaitTimeMs), null, new AnonymousClass1(null), 2, null);
        }
        this.webViewClientStateListener = listener;
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public WebResourceResponse shouldInterceptRequest(@Nullable WebView view, @Nullable WebResourceRequest request) {
        File file;
        if (request != null) {
            f fVar = this.assetLoader;
            Uri url = request.getUrl();
            for (xa.e eVar : fVar.f44214a) {
                eVar.getClass();
                String str = eVar.f44212b;
                d dVar = (!url.getScheme().equals("http") && (url.getScheme().equals("http") || url.getScheme().equals("https")) && url.getAuthority().equals(eVar.f44211a) && url.getPath().startsWith(str)) ? eVar.f44213c : null;
                if (dVar != null) {
                    String strReplaceFirst = url.getPath().replaceFirst(str, "");
                    File file2 = dVar.f44210a;
                    try {
                        String strW = ex.i.w(file2);
                        String canonicalPath = new File(file2, strReplaceFirst).getCanonicalPath();
                        file = canonicalPath.startsWith(strW) ? new File(canonicalPath) : null;
                    } catch (IOException e5) {
                        Log.e("WebViewAssetLoader", "Error opening the requested path: " + strReplaceFirst, e5);
                    }
                    if (file == null) {
                        Log.e("WebViewAssetLoader", String.format("The requested file: %s is outside the mounted directory: %s", strReplaceFirst, file2));
                        return new WebResourceResponse(null, null, null);
                    }
                    InputStream fileInputStream = new FileInputStream(file);
                    if (file.getPath().endsWith(".svgz")) {
                        fileInputStream = new GZIPInputStream(fileInputStream);
                    }
                    return new WebResourceResponse(ex.i.x(strReplaceFirst), null, fileInputStream);
                }
            }
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(@NotNull WebView view, @NotNull WebResourceRequest request) {
        view.getClass();
        request.getClass();
        String string = request.getUrl().toString();
        string.getClass();
        return handleUrlOverride(string);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0007J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u000fH\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u000fH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/braze/ui/BrazeWebViewClient$Companion;", "", "<init>", "()V", "BRIDGE_JS_FILE", "", "JAVASCRIPT_PREFIX", "BRAZE_SCHEME", "AUTHORITY_NAME_CLOSE", "AUTHORITY_NAME_CUSTOM_EVENT", "BRAZE_CUSTOM_EVENT_NAME_KEY", "QUERY_NAME_BUTTON_ID", "QUERY_NAME_EXTERNAL_OPEN", "QUERY_NAME_DEEPLINK", "getBundleFromUrl", "Landroid/os/Bundle;", Constants.BRAZE_WEBVIEW_URL_EXTRA, "parseCustomEventNameFromQueryBundle", "queryBundle", "parsePropertiesFromQueryBundle", "Lcom/braze/models/outgoing/BrazeProperties;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nBrazeWebViewClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrazeWebViewClient.kt\ncom/braze/ui/BrazeWebViewClient$Companion\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,313:1\n29#2:314\n216#3,2:315\n*S KotlinDebug\n*F\n+ 1 BrazeWebViewClient.kt\ncom/braze/ui/BrazeWebViewClient$Companion\n*L\n285#1:314\n287#1:315,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Bundle getBundleFromUrl(@NotNull String url) {
            url.getClass();
            Bundle bundle = new Bundle();
            if (!StringsKt.H(url)) {
                for (Map.Entry<String, String> entry : UriUtils.getQueryParameters(Uri.parse(url)).entrySet()) {
                    bundle.putString(entry.getKey(), entry.getValue());
                }
            }
            return bundle;
        }

        @Nullable
        public final String parseCustomEventNameFromQueryBundle(@NotNull Bundle queryBundle) {
            queryBundle.getClass();
            return queryBundle.getString(BrazeWebViewClient.BRAZE_CUSTOM_EVENT_NAME_KEY);
        }

        @NotNull
        public final BrazeProperties parsePropertiesFromQueryBundle(@NotNull Bundle queryBundle) {
            String string;
            queryBundle.getClass();
            BrazeProperties brazeProperties = new BrazeProperties();
            for (String str : queryBundle.keySet()) {
                if (!Intrinsics.areEqual(str, BrazeWebViewClient.BRAZE_CUSTOM_EVENT_NAME_KEY) && (string = queryBundle.getString(str, null)) != null && !StringsKt.H(string)) {
                    str.getClass();
                    brazeProperties.addProperty(str, string);
                }
            }
            return brazeProperties;
        }

        private Companion() {
        }
    }

    @Override // android.webkit.WebViewClient
    @u70.d
    public boolean shouldOverrideUrlLoading(@NotNull WebView view, @NotNull String url) {
        view.getClass();
        url.getClass();
        return handleUrlOverride(url);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleUrlOverride$lambda$7$lambda$6(String str) {
        return str;
    }

    public /* synthetic */ BrazeWebViewClient(Context context, Type type, IInAppMessage iInAppMessage, IInAppMessageWebViewClientListener iInAppMessageWebViewClientListener, IBannerWebViewClientListener iBannerWebViewClientListener, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, type, (i11 & 4) != 0 ? null : iInAppMessage, (i11 & 8) != 0 ? null : iInAppMessageWebViewClientListener, (i11 & 16) != 0 ? null : iBannerWebViewClientListener, (i11 & 32) != 0 ? null : str);
    }
}
