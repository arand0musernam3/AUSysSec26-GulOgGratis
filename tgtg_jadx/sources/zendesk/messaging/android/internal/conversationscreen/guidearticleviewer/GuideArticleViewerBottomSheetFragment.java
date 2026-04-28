package zendesk.messaging.android.internal.conversationscreen.guidearticleviewer;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.activity.y;
import androidx.fragment.app.o0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.m1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.x0;
import ba0.g;
import com.braze.Constants;
import com.braze.h2;
import com.google.android.material.bottomsheet.l;
import com.google.android.material.bottomsheet.m;
import com.google.firebase.messaging.a0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import v80.f0;
import y80.j;
import z70.c;
import z70.e;
import z70.i;
import zendesk.android.messaging.Messaging;
import zendesk.android.messaging.model.MessagingSettings;
import zendesk.android.messaging.model.UserColors;
import zendesk.core.ui.android.internal.xml.BottomSheetDialogKtxKt;
import zendesk.guidekit.android.GuideKit;
import zendesk.logger.Logger;
import zendesk.messaging.R;
import zendesk.messaging.android.internal.DefaultMessaging;
import zendesk.messaging.android.internal.analytics.AnalyticsProcessor;
import zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerAction;
import zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerEvent;
import zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerState;
import zendesk.messaging.android.internal.conversationscreen.o;
import zendesk.messaging.android.internal.di.MessagingComponentKt;
import zendesk.messaging.android.internal.extension.ContextKtxKt;
import zendesk.messaging.android.internal.model.MessagingTheme;
import zendesk.ui.android.conversation.articleviewer.ArticleViewer;
import zendesk.ui.android.conversation.articleviewer.ArticleViewerRendering;
import zendesk.ui.android.conversation.articleviewer.ArticleViewerState;
import zendesk.ui.android.conversation.articleviewer.articleattachmentcarousel.ArticleAttachmentItem;
import zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentState;
import zendesk.ui.android.conversation.articleviewer.articleheader.ArticleHeaderState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000¿\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001Z\b\u0000\u0018\u0000 j2\u00020\u0001:\u0001jB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\u0003J\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bH\u0082@¢\u0006\u0004\b \u0010\u001cJ\u0017\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\bH\u0002¢\u0006\u0004\b%\u0010\u0003J\u0017\u0010(\u001a\u00020\b2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)R\"\u0010+\u001a\u00020*8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00102\u001a\u0002018\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R(\u0010<\u001a\u00020;8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b<\u0010=\u0012\u0004\bB\u0010\u0003\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR(\u0010C\u001a\u00020;8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\bC\u0010=\u0012\u0004\bF\u0010\u0003\u001a\u0004\bD\u0010?\"\u0004\bE\u0010AR(\u0010G\u001a\u00020&8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\bG\u0010H\u0012\u0004\bL\u0010\u0003\u001a\u0004\bI\u0010J\"\u0004\bK\u0010)R\"\u0010N\u001a\u00020M8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u0016\u0010U\u001a\u00020T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010X\u001a\u00020W8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010[\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020\b0]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R \u0010b\u001a\u000e\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\b0`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR \u0010e\u001a\u000e\u0012\u0004\u0012\u00020d\u0012\u0004\u0012\u00020\b0`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010cR\"\u0010f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010&\u0012\u0004\u0012\u00020T0`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010cR*\u0010i\u001a\u0018\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020g0`j\b\u0012\u0004\u0012\u00020g`h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010c¨\u0006k"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerBottomSheetFragment;", "Lcom/google/android/material/bottomsheet/m;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroy", "onStart", "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerState$SuccessGuideArticle;", "state", "renderGuideArticleSuccess", "(Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerState$SuccessGuideArticle;)V", "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerState$Loading;", "renderLoading", "(Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerState$Loading;)V", "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerState$Error;", "renderError", "(Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerState$Error;)V", "Landroid/content/Context;", "context", "collectEvents", "(Landroid/content/Context;Lx70/c;)Ljava/lang/Object;", "collectStateUpdates", "(Lx70/c;)Ljava/lang/Object;", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "getMessagingTheme", "()Lzendesk/messaging/android/internal/model/MessagingTheme;", "setupGuideArticleViewerDependencies", "Lzendesk/android/messaging/Messaging;", AnalyticsProcessor.CHANNEL, "initGuideArticleViewerViewModel", "(Lzendesk/android/messaging/Messaging;)V", "errorHandler", "", Constants.BRAZE_WEBVIEW_URL_EXTRA, "shareUrl", "(Ljava/lang/String;)V", "Lzendesk/guidekit/android/GuideKit;", "guideKit", "Lzendesk/guidekit/android/GuideKit;", "getGuideKit", "()Lzendesk/guidekit/android/GuideKit;", "setGuideKit", "(Lzendesk/guidekit/android/GuideKit;)V", "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerViewModelFactory;", "guideArticleViewerViewModelFactory", "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerViewModelFactory;", "getGuideArticleViewerViewModelFactory", "()Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerViewModelFactory;", "setGuideArticleViewerViewModelFactory", "(Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerViewModelFactory;)V", "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerViewModel;", "guideArticleViewerViewModel", "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerViewModel;", "Lzendesk/android/messaging/model/UserColors;", MessagingComponentKt.USER_DARK_COLORS, "Lzendesk/android/messaging/model/UserColors;", "getUserDarkColors", "()Lzendesk/android/messaging/model/UserColors;", "setUserDarkColors", "(Lzendesk/android/messaging/model/UserColors;)V", "getUserDarkColors$annotations", MessagingComponentKt.USER_LIGHT_COLORS, "getUserLightColors", "setUserLightColors", "getUserLightColors$annotations", "baseUrl", "Ljava/lang/String;", "getBaseUrl", "()Ljava/lang/String;", "setBaseUrl", "getBaseUrl$annotations", "Lzendesk/android/messaging/model/MessagingSettings;", "messagingSettings", "Lzendesk/android/messaging/model/MessagingSettings;", "getMessagingSettings", "()Lzendesk/android/messaging/model/MessagingSettings;", "setMessagingSettings", "(Lzendesk/android/messaging/model/MessagingSettings;)V", "", "isInitializationSuccessful", "Z", "Lzendesk/ui/android/conversation/articleviewer/ArticleViewer;", "articleViewer", "Lzendesk/ui/android/conversation/articleviewer/ArticleViewer;", "zendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerBottomSheetFragment$onBackPressedCallback$1", "onBackPressedCallback", "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerBottomSheetFragment$onBackPressedCallback$1;", "Lkotlin/Function0;", "onRetryButtonClicked", "Lkotlin/jvm/functions/Function0;", "Lkotlin/Function1;", "Lzendesk/ui/android/conversation/articleviewer/articleattachmentcarousel/ArticleAttachmentItem;", "onAttachmentItemClicked", "Lkotlin/jvm/functions/Function1;", "Lzendesk/ui/android/conversation/articleviewer/articleheader/ArticleHeaderState$ButtonName;", "onMenuItemClicked", "shouldOverrideUrl", "Lzendesk/ui/android/conversation/articleviewer/ArticleViewerRendering;", "Lzendesk/messaging/android/internal/conversationscreen/RenderingUpdate;", "defaultRendering", "Companion", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GuideArticleViewerBottomSheetFragment extends m {

    @NotNull
    private static final String ARG_CREDENTIALS = "GuideArticleViewerBottomSheetFragment.ARG_CREDENTIALS";

    @NotNull
    public static final String ARG_GUIDE_ARTICLE_URL = "GuideArticleViewerBottomSheetFragment.ARG_GUIDE_ARTICLE_URL";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String LOG_TAG = "GuideArticleFrag";

    @NotNull
    public static final String TAG = "GuideArticleViewerBottomSheetFragment";
    private ArticleViewer articleViewer;
    public String baseUrl;

    @NotNull
    private final Function1<ArticleViewerRendering, ArticleViewerRendering> defaultRendering;
    private GuideArticleViewerViewModel guideArticleViewerViewModel;
    public GuideArticleViewerViewModelFactory guideArticleViewerViewModelFactory;
    public GuideKit guideKit;
    private boolean isInitializationSuccessful;
    public MessagingSettings messagingSettings;

    @NotNull
    private final Function1<ArticleAttachmentItem, Unit> onAttachmentItemClicked;

    @NotNull
    private final GuideArticleViewerBottomSheetFragment$onBackPressedCallback$1 onBackPressedCallback;

    @NotNull
    private final Function1<ArticleHeaderState.ButtonName, Unit> onMenuItemClicked;

    @NotNull
    private final Function0<Unit> onRetryButtonClicked;

    @NotNull
    private final Function1<String, Boolean> shouldOverrideUrl;
    public UserColors userDarkColors;
    public UserColors userLightColors;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ArticleHeaderState.ButtonName.values().length];
            try {
                iArr[ArticleHeaderState.ButtonName.CLOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ArticleHeaderState.ButtonName.BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ArticleHeaderState.ButtonName.SHARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment$collectStateUpdates$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment", f = "GuideArticleViewerBottomSheetFragment.kt", l = {268}, m = "collectStateUpdates")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(x70.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GuideArticleViewerBottomSheetFragment.this.collectStateUpdates(this);
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment$onViewCreated$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment$onViewCreated$1", f = "GuideArticleViewerBottomSheetFragment.kt", l = {358}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C04341 extends i implements Function2<b0, x70.c<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment$onViewCreated$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @e(c = "zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment$onViewCreated$1$1", f = "GuideArticleViewerBottomSheetFragment.kt", l = {359, 377}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
        public static final class C00531 extends i implements Function2<b0, x70.c<? super Unit>, Object> {
            int label;
            final /* synthetic */ GuideArticleViewerBottomSheetFragment this$0;

            /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment$onViewCreated$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
            @e(c = "zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment$onViewCreated$1$1$1", f = "GuideArticleViewerBottomSheetFragment.kt", l = {}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
            public static final class C00541 extends i implements Function2<b0, x70.c<? super Unit>, Object> {
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ GuideArticleViewerBottomSheetFragment this$0;

                /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment$onViewCreated$1$1$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
                @e(c = "zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment$onViewCreated$1$1$1$1", f = "GuideArticleViewerBottomSheetFragment.kt", l = {379}, m = "invokeSuspend")
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
                public static final class C00551 extends i implements Function2<b0, x70.c<? super Unit>, Object> {
                    int label;
                    final /* synthetic */ GuideArticleViewerBottomSheetFragment this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00551(GuideArticleViewerBottomSheetFragment guideArticleViewerBottomSheetFragment, x70.c<? super C00551> cVar) {
                        super(2, cVar);
                        this.this$0 = guideArticleViewerBottomSheetFragment;
                    }

                    @Override // z70.a
                    public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
                        return new C00551(this.this$0, cVar);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
                        return ((C00551) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
                    }

                    @Override // z70.a
                    public final Object invokeSuspend(Object obj) {
                        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                        int i11 = this.label;
                        if (i11 == 0) {
                            g.M(obj);
                            GuideArticleViewerBottomSheetFragment guideArticleViewerBottomSheetFragment = this.this$0;
                            this.label = 1;
                            if (guideArticleViewerBottomSheetFragment.collectStateUpdates(this) == aVar) {
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

                /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment$onViewCreated$1$1$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
                @e(c = "zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment$onViewCreated$1$1$1$2", f = "GuideArticleViewerBottomSheetFragment.kt", l = {382}, m = "invokeSuspend")
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
                public static final class AnonymousClass2 extends i implements Function2<b0, x70.c<? super Unit>, Object> {
                    int label;
                    final /* synthetic */ GuideArticleViewerBottomSheetFragment this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(GuideArticleViewerBottomSheetFragment guideArticleViewerBottomSheetFragment, x70.c<? super AnonymousClass2> cVar) {
                        super(2, cVar);
                        this.this$0 = guideArticleViewerBottomSheetFragment;
                    }

                    @Override // z70.a
                    public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
                        return new AnonymousClass2(this.this$0, cVar);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
                        return ((AnonymousClass2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
                    }

                    @Override // z70.a
                    public final Object invokeSuspend(Object obj) {
                        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                        int i11 = this.label;
                        if (i11 == 0) {
                            g.M(obj);
                            GuideArticleViewerBottomSheetFragment guideArticleViewerBottomSheetFragment = this.this$0;
                            Context contextRequireContext = guideArticleViewerBottomSheetFragment.requireContext();
                            contextRequireContext.getClass();
                            this.label = 1;
                            if (guideArticleViewerBottomSheetFragment.collectEvents(contextRequireContext, this) == aVar) {
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

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00541(GuideArticleViewerBottomSheetFragment guideArticleViewerBottomSheetFragment, x70.c<? super C00541> cVar) {
                    super(2, cVar);
                    this.this$0 = guideArticleViewerBottomSheetFragment;
                }

                @Override // z70.a
                public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
                    C00541 c00541 = new C00541(this.this$0, cVar);
                    c00541.L$0 = obj;
                    return c00541;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
                    return ((C00541) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
                }

                @Override // z70.a
                public final Object invokeSuspend(Object obj) {
                    y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                    if (this.label != 0) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g.M(obj);
                    b0 b0Var = (b0) this.L$0;
                    f0.B(b0Var, null, null, new C00551(this.this$0, null), 3);
                    f0.B(b0Var, null, null, new AnonymousClass2(this.this$0, null), 3);
                    return Unit.f26487a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00531(GuideArticleViewerBottomSheetFragment guideArticleViewerBottomSheetFragment, x70.c<? super C00531> cVar) {
                super(2, cVar);
                this.this$0 = guideArticleViewerBottomSheetFragment;
            }

            @Override // z70.a
            public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
                return new C00531(this.this$0, cVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
                return ((C00531) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:32:0x00a3, code lost:
            
                if (androidx.lifecycle.x0.b(r8, r3, r4, r7) == r0) goto L33;
             */
            @Override // z70.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    y70.a r0 = y70.a.COROUTINE_SUSPENDED
                    int r1 = r7.label
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1c
                    if (r1 == r3) goto L18
                    if (r1 != r2) goto L11
                    ba0.g.M(r8)
                    goto La9
                L11:
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    com.braze.h2.b(r8)
                    r8 = 0
                    return r8
                L18:
                    ba0.g.M(r8)
                    goto L2b
                L1c:
                    ba0.g.M(r8)
                    zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment r8 = r7.this$0
                    r7.label = r3
                    java.lang.Object r8 = zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment.access$setupGuideArticleViewerDependencies(r8, r7)
                    if (r8 != r0) goto L2b
                    goto La5
                L2b:
                    zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment r8 = r7.this$0
                    boolean r8 = zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment.access$isInitializationSuccessful$p(r8)
                    if (r8 != 0) goto L36
                    kotlin.Unit r8 = kotlin.Unit.f26487a
                    return r8
                L36:
                    zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment r8 = r7.this$0
                    android.os.Bundle r8 = r8.getArguments()
                    r1 = 0
                    if (r8 == 0) goto L46
                    java.lang.String r3 = "GuideArticleViewerBottomSheetFragment.ARG_GUIDE_ARTICLE_URL"
                    java.lang.String r8 = r8.getString(r3)
                    goto L47
                L46:
                    r8 = r1
                L47:
                    zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment r3 = r7.this$0
                    if (r8 == 0) goto La6
                    zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerViewModel r3 = zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment.access$getGuideArticleViewerViewModel$p(r3)
                    java.lang.String r4 = "guideArticleViewerViewModel"
                    if (r3 != 0) goto L57
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
                    r3 = r1
                L57:
                    zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerAction$RefreshTheme r5 = new zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerAction$RefreshTheme
                    zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment r6 = r7.this$0
                    zendesk.messaging.android.internal.model.MessagingTheme r6 = zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment.access$getMessagingTheme(r6)
                    r5.<init>(r6)
                    r3.process(r5)
                    zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment r3 = r7.this$0
                    zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerViewModel r3 = zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment.access$getGuideArticleViewerViewModel$p(r3)
                    if (r3 != 0) goto L71
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
                    r3 = r1
                L71:
                    zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerAction$Load r4 = new zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerAction$Load
                    r4.<init>(r8)
                    r3.process(r4)
                    zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment r8 = r7.this$0
                    androidx.lifecycle.Lifecycle r8 = r8.getLifecycle()
                    androidx.lifecycle.Lifecycle$State r8 = r8.b()
                    androidx.lifecycle.Lifecycle$State r3 = androidx.lifecycle.Lifecycle.State.CREATED
                    boolean r8 = r8.a(r3)
                    if (r8 == 0) goto La9
                    zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment r8 = r7.this$0
                    androidx.lifecycle.LifecycleOwner r8 = r8.getViewLifecycleOwner()
                    r8.getClass()
                    androidx.lifecycle.Lifecycle$State r3 = androidx.lifecycle.Lifecycle.State.STARTED
                    zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment$onViewCreated$1$1$1 r4 = new zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment$onViewCreated$1$1$1
                    zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment r5 = r7.this$0
                    r4.<init>(r5, r1)
                    r7.label = r2
                    java.lang.Object r8 = androidx.lifecycle.x0.b(r8, r3, r4, r7)
                    if (r8 != r0) goto La9
                La5:
                    return r0
                La6:
                    zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment.access$errorHandler(r3)
                La9:
                    kotlin.Unit r8 = kotlin.Unit.f26487a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment.C04341.C00531.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public C04341(x70.c<? super C04341> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return GuideArticleViewerBottomSheetFragment.this.new C04341(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C04341) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                LifecycleOwner viewLifecycleOwner = GuideArticleViewerBottomSheetFragment.this.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                Lifecycle.State state = Lifecycle.State.CREATED;
                C00531 c00531 = new C00531(GuideArticleViewerBottomSheetFragment.this, null);
                this.label = 1;
                if (x0.b(viewLifecycleOwner, state, c00531, this) == aVar) {
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

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment$setupGuideArticleViewerDependencies$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment", f = "GuideArticleViewerBottomSheetFragment.kt", l = {308}, m = "setupGuideArticleViewerDependencies")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C04351 extends c {
        int label;
        /* synthetic */ Object result;

        public C04351(x70.c<? super C04351> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GuideArticleViewerBottomSheetFragment.this.setupGuideArticleViewerDependencies(this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment$onBackPressedCallback$1] */
    public GuideArticleViewerBottomSheetFragment() {
        super(R.layout.zma_bottom_sheet_guide_article_viewer);
        this.onBackPressedCallback = new y() { // from class: zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment$onBackPressedCallback$1
            {
                super(true);
            }

            @Override // androidx.activity.y
            public void handleOnBackPressed() {
                GuideArticleViewerViewModel guideArticleViewerViewModel = this.this$0.guideArticleViewerViewModel;
                if (guideArticleViewerViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("guideArticleViewerViewModel");
                    guideArticleViewerViewModel = null;
                }
                guideArticleViewerViewModel.process(GuideArticleViewerAction.Back.INSTANCE);
            }
        };
        this.onRetryButtonClicked = new y.a(this, 19);
        final int i11 = 0;
        this.onAttachmentItemClicked = new Function1(this) { // from class: zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GuideArticleViewerBottomSheetFragment f47676b;

            {
                this.f47676b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i11) {
                    case 0:
                        return GuideArticleViewerBottomSheetFragment.onAttachmentItemClicked$lambda$1(this.f47676b, (ArticleAttachmentItem) obj);
                    case 1:
                        return GuideArticleViewerBottomSheetFragment.onMenuItemClicked$lambda$2(this.f47676b, (ArticleHeaderState.ButtonName) obj);
                    case 2:
                        return Boolean.valueOf(GuideArticleViewerBottomSheetFragment.shouldOverrideUrl$lambda$3(this.f47676b, (String) obj));
                    default:
                        return GuideArticleViewerBottomSheetFragment.defaultRendering$lambda$5(this.f47676b, (ArticleViewerRendering) obj);
                }
            }
        };
        final int i12 = 1;
        this.onMenuItemClicked = new Function1(this) { // from class: zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GuideArticleViewerBottomSheetFragment f47676b;

            {
                this.f47676b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i12) {
                    case 0:
                        return GuideArticleViewerBottomSheetFragment.onAttachmentItemClicked$lambda$1(this.f47676b, (ArticleAttachmentItem) obj);
                    case 1:
                        return GuideArticleViewerBottomSheetFragment.onMenuItemClicked$lambda$2(this.f47676b, (ArticleHeaderState.ButtonName) obj);
                    case 2:
                        return Boolean.valueOf(GuideArticleViewerBottomSheetFragment.shouldOverrideUrl$lambda$3(this.f47676b, (String) obj));
                    default:
                        return GuideArticleViewerBottomSheetFragment.defaultRendering$lambda$5(this.f47676b, (ArticleViewerRendering) obj);
                }
            }
        };
        final int i13 = 2;
        this.shouldOverrideUrl = new Function1(this) { // from class: zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GuideArticleViewerBottomSheetFragment f47676b;

            {
                this.f47676b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        return GuideArticleViewerBottomSheetFragment.onAttachmentItemClicked$lambda$1(this.f47676b, (ArticleAttachmentItem) obj);
                    case 1:
                        return GuideArticleViewerBottomSheetFragment.onMenuItemClicked$lambda$2(this.f47676b, (ArticleHeaderState.ButtonName) obj);
                    case 2:
                        return Boolean.valueOf(GuideArticleViewerBottomSheetFragment.shouldOverrideUrl$lambda$3(this.f47676b, (String) obj));
                    default:
                        return GuideArticleViewerBottomSheetFragment.defaultRendering$lambda$5(this.f47676b, (ArticleViewerRendering) obj);
                }
            }
        };
        final int i14 = 3;
        this.defaultRendering = new Function1(this) { // from class: zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GuideArticleViewerBottomSheetFragment f47676b;

            {
                this.f47676b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        return GuideArticleViewerBottomSheetFragment.onAttachmentItemClicked$lambda$1(this.f47676b, (ArticleAttachmentItem) obj);
                    case 1:
                        return GuideArticleViewerBottomSheetFragment.onMenuItemClicked$lambda$2(this.f47676b, (ArticleHeaderState.ButtonName) obj);
                    case 2:
                        return Boolean.valueOf(GuideArticleViewerBottomSheetFragment.shouldOverrideUrl$lambda$3(this.f47676b, (String) obj));
                    default:
                        return GuideArticleViewerBottomSheetFragment.defaultRendering$lambda$5(this.f47676b, (ArticleViewerRendering) obj);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object collectEvents(final Context context, x70.c<? super Unit> cVar) {
        GuideArticleViewerViewModel guideArticleViewerViewModel = this.guideArticleViewerViewModel;
        if (guideArticleViewerViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("guideArticleViewerViewModel");
            guideArticleViewerViewModel = null;
        }
        Object objCollect = guideArticleViewerViewModel.getEventsChannel().collect(new j() { // from class: zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment.collectEvents.2
            public final Object emit(GuideArticleViewerEvent guideArticleViewerEvent, x70.c<? super Unit> cVar2) {
                if (guideArticleViewerEvent instanceof GuideArticleViewerEvent.LoadUrlInBrowser) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(((GuideArticleViewerEvent.LoadUrlInBrowser) guideArticleViewerEvent).getUrl()));
                    if (intent.resolveActivity(context.getPackageManager()) != null) {
                        this.startActivity(intent);
                    } else {
                        Logger.e(GuideArticleViewerBottomSheetFragment.LOG_TAG, "Unable to find an activity for " + guideArticleViewerEvent, new Object[0]);
                    }
                } else if (guideArticleViewerEvent instanceof GuideArticleViewerEvent.ShareUrl) {
                    this.shareUrl(((GuideArticleViewerEvent.ShareUrl) guideArticleViewerEvent).getUrl());
                } else {
                    if (!Intrinsics.areEqual(guideArticleViewerEvent, GuideArticleViewerEvent.Close.INSTANCE)) {
                        e40.a.f();
                        return null;
                    }
                    this.dismiss();
                }
                return Unit.f26487a;
            }

            @Override // y80.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, x70.c cVar2) {
                return emit((GuideArticleViewerEvent) obj, (x70.c<? super Unit>) cVar2);
            }
        }, cVar);
        return objCollect == y70.a.COROUTINE_SUSPENDED ? objCollect : Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collectStateUpdates(x70.c<? super kotlin.Unit> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment$collectStateUpdates$1 r0 = (zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment$collectStateUpdates$1 r0 = new zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment$collectStateUpdates$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 == r3) goto L2a
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
        L28:
            r5 = 0
            return r5
        L2a:
            ba0.g.M(r5)
            goto L4d
        L2e:
            ba0.g.M(r5)
            zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerViewModel r5 = r4.guideArticleViewerViewModel
            if (r5 != 0) goto L3b
            java.lang.String r5 = "guideArticleViewerViewModel"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
            r5 = 0
        L3b:
            y80.y1 r5 = r5.getArticleViewerState()
            zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment$collectStateUpdates$2 r2 = new zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment$collectStateUpdates$2
            r2.<init>()
            r0.label = r3
            java.lang.Object r5 = r5.collect(r2, r0)
            if (r5 != r1) goto L4d
            return r1
        L4d:
            qc.y.m()
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment.collectStateUpdates(x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArticleViewerRendering defaultRendering$lambda$5(GuideArticleViewerBottomSheetFragment guideArticleViewerBottomSheetFragment, ArticleViewerRendering articleViewerRendering) {
        articleViewerRendering.getClass();
        return articleViewerRendering.toBuilder().state(new o(5)).onMenuItemClicked(guideArticleViewerBottomSheetFragment.onMenuItemClicked).shouldOverrideUrl(guideArticleViewerBottomSheetFragment.shouldOverrideUrl).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArticleViewerState defaultRendering$lambda$5$lambda$4(ArticleViewerState articleViewerState) {
        articleViewerState.getClass();
        ArticleContentState.ArticleLoadingStatus articleLoadingStatus = ArticleContentState.ArticleLoadingStatus.IDLE;
        MessagingTheme.Companion companion = MessagingTheme.INSTANCE;
        return articleViewerState.copy((25601 & 1) != 0 ? articleViewerState.articleData : null, (25601 & 2) != 0 ? articleViewerState.contentState : articleLoadingStatus, (25601 & 4) != 0 ? articleViewerState.iconColor : companion.getDEFAULT().getOnElevatedColor(), (25601 & 8) != 0 ? articleViewerState.backgroundColor : companion.getDEFAULT().getElevatedColor(), (25601 & 16) != 0 ? articleViewerState.buttonBackgroundColor : companion.getDEFAULT().getElevatedColor(), (25601 & 32) != 0 ? articleViewerState.textColor : companion.getDEFAULT().getOnElevatedColor(), (25601 & 64) != 0 ? articleViewerState.buttonColor : companion.getDEFAULT().getSuccessColor(), (25601 & 128) != 0 ? articleViewerState.indicatorColor : companion.getDEFAULT().getPrimaryColor(), (25601 & 256) != 0 ? articleViewerState.showBackButton : false, (25601 & 512) != 0 ? articleViewerState.showShareButton : true, (25601 & 1024) != 0 ? articleViewerState.attachmentList : null, (25601 & NewHope.SENDB_BYTES) != 0 ? articleViewerState.attachmentListTextColor : companion.getDEFAULT().getOnBackgroundColor(), (25601 & 4096) != 0 ? articleViewerState.navigationButtonBackgroundColor : companion.getDEFAULT().getElevatedColor(), (25601 & 8192) != 0 ? articleViewerState.focusedStateBorderColor : 0, (25601 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? articleViewerState.feedBackBannerOptions : null, (25601 & 32768) != 0 ? articleViewerState.shouldShowFeedbackBanner : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void errorHandler() {
        Logger.e(LOG_TAG, "Unable to show the article viewer screen without a Messaging instance.", new Object[0]);
        o0 activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MessagingTheme getMessagingTheme() {
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        return ContextKtxKt.getMessagingTheme(contextRequireContext, getMessagingSettings(), getUserLightColors(), getUserDarkColors());
    }

    private final void initGuideArticleViewerViewModel(Messaging messaging) {
        if (!(messaging instanceof DefaultMessaging)) {
            errorHandler();
            return;
        }
        ((DefaultMessaging) messaging).getMessagingComponent().guideArticleFragmentComponent().create(this, getArguments()).inject(this);
        GuideArticleViewerViewModelFactory guideArticleViewerViewModelFactory = getGuideArticleViewerViewModelFactory();
        guideArticleViewerViewModelFactory.getClass();
        ViewModelStore viewModelStore = getViewModelStore();
        CreationExtras defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelCreationExtras.getClass();
        a0 a0Var = new a0(viewModelStore, guideArticleViewerViewModelFactory, defaultViewModelCreationExtras);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GuideArticleViewerViewModel.class);
        orCreateKotlinClass.getClass();
        String qualifiedName = orCreateKotlinClass.getQualifiedName();
        if (qualifiedName == null) {
            i4.a.f("Local and anonymous classes can not be ViewModels");
        } else {
            this.guideArticleViewerViewModel = (GuideArticleViewerViewModel) a0Var.M("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), orCreateKotlinClass);
            this.isInitializationSuccessful = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachmentItemClicked$lambda$1(GuideArticleViewerBottomSheetFragment guideArticleViewerBottomSheetFragment, ArticleAttachmentItem articleAttachmentItem) {
        articleAttachmentItem.getClass();
        GuideArticleViewerViewModel guideArticleViewerViewModel = guideArticleViewerBottomSheetFragment.guideArticleViewerViewModel;
        if (guideArticleViewerViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("guideArticleViewerViewModel");
            guideArticleViewerViewModel = null;
        }
        guideArticleViewerViewModel.process(new GuideArticleViewerAction.OpenAttachment(articleAttachmentItem));
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMenuItemClicked$lambda$2(GuideArticleViewerBottomSheetFragment guideArticleViewerBottomSheetFragment, ArticleHeaderState.ButtonName buttonName) {
        buttonName.getClass();
        int i11 = WhenMappings.$EnumSwitchMapping$0[buttonName.ordinal()];
        if (i11 != 1) {
            GuideArticleViewerViewModel guideArticleViewerViewModel = null;
            if (i11 == 2) {
                GuideArticleViewerViewModel guideArticleViewerViewModel2 = guideArticleViewerBottomSheetFragment.guideArticleViewerViewModel;
                if (guideArticleViewerViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("guideArticleViewerViewModel");
                } else {
                    guideArticleViewerViewModel = guideArticleViewerViewModel2;
                }
                guideArticleViewerViewModel.process(GuideArticleViewerAction.Back.INSTANCE);
            } else {
                if (i11 != 3) {
                    e40.a.f();
                    return null;
                }
                GuideArticleViewerViewModel guideArticleViewerViewModel3 = guideArticleViewerBottomSheetFragment.guideArticleViewerViewModel;
                if (guideArticleViewerViewModel3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("guideArticleViewerViewModel");
                } else {
                    guideArticleViewerViewModel = guideArticleViewerViewModel3;
                }
                guideArticleViewerViewModel.process(GuideArticleViewerAction.Share.INSTANCE);
            }
        } else {
            guideArticleViewerBottomSheetFragment.dismiss();
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onRetryButtonClicked$lambda$0(GuideArticleViewerBottomSheetFragment guideArticleViewerBottomSheetFragment) {
        GuideArticleViewerViewModel guideArticleViewerViewModel = guideArticleViewerBottomSheetFragment.guideArticleViewerViewModel;
        if (guideArticleViewerViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("guideArticleViewerViewModel");
            guideArticleViewerViewModel = null;
        }
        guideArticleViewerViewModel.process(GuideArticleViewerAction.Reload.INSTANCE);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderError(GuideArticleViewerState.Error state) {
        ArticleViewer articleViewer = this.articleViewer;
        if (articleViewer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("articleViewer");
            articleViewer = null;
        }
        articleViewer.render(new xq.a(13, this, state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArticleViewerRendering renderError$lambda$11(GuideArticleViewerBottomSheetFragment guideArticleViewerBottomSheetFragment, GuideArticleViewerState.Error error, ArticleViewerRendering articleViewerRendering) {
        articleViewerRendering.getClass();
        return articleViewerRendering.toBuilder().state(new zendesk.core.android.internal.a(error, 2)).onMenuItemClicked(guideArticleViewerBottomSheetFragment.onMenuItemClicked).shouldOverrideUrl(guideArticleViewerBottomSheetFragment.shouldOverrideUrl).onRetryButtonClicked(guideArticleViewerBottomSheetFragment.onRetryButtonClicked).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArticleViewerState renderError$lambda$11$lambda$10(GuideArticleViewerState.Error error, ArticleViewerState articleViewerState) {
        articleViewerState.getClass();
        return articleViewerState.copy((25601 & 1) != 0 ? articleViewerState.articleData : null, (25601 & 2) != 0 ? articleViewerState.contentState : ArticleContentState.ArticleLoadingStatus.FAILED, (25601 & 4) != 0 ? articleViewerState.iconColor : error.getMessagingTheme().getOnElevatedColor(), (25601 & 8) != 0 ? articleViewerState.backgroundColor : error.getMessagingTheme().getElevatedColor(), (25601 & 16) != 0 ? articleViewerState.buttonBackgroundColor : error.getMessagingTheme().getBackgroundColor(), (25601 & 32) != 0 ? articleViewerState.textColor : error.getMessagingTheme().getOnElevatedColor(), (25601 & 64) != 0 ? articleViewerState.buttonColor : error.getMessagingTheme().getSuccessColor(), (25601 & 128) != 0 ? articleViewerState.indicatorColor : error.getMessagingTheme().getPrimaryColor(), (25601 & 256) != 0 ? articleViewerState.showBackButton : !error.getBackStack().isEmpty(), (25601 & 512) != 0 ? articleViewerState.showShareButton : true, (25601 & 1024) != 0 ? articleViewerState.attachmentList : null, (25601 & NewHope.SENDB_BYTES) != 0 ? articleViewerState.attachmentListTextColor : error.getMessagingTheme().getOnBackgroundColor(), (25601 & 4096) != 0 ? articleViewerState.navigationButtonBackgroundColor : error.getMessagingTheme().getBackgroundColor(), (25601 & 8192) != 0 ? articleViewerState.focusedStateBorderColor : 0, (25601 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? articleViewerState.feedBackBannerOptions : null, (25601 & 32768) != 0 ? articleViewerState.shouldShowFeedbackBanner : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderGuideArticleSuccess(GuideArticleViewerState.SuccessGuideArticle state) {
        ArticleViewer articleViewer = this.articleViewer;
        if (articleViewer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("articleViewer");
            articleViewer = null;
        }
        articleViewer.render(new a(this, state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArticleViewerRendering renderGuideArticleSuccess$lambda$7(GuideArticleViewerBottomSheetFragment guideArticleViewerBottomSheetFragment, GuideArticleViewerState.SuccessGuideArticle successGuideArticle, ArticleViewerRendering articleViewerRendering) {
        articleViewerRendering.getClass();
        return articleViewerRendering.toBuilder().state(new a(successGuideArticle, guideArticleViewerBottomSheetFragment)).onMenuItemClicked(guideArticleViewerBottomSheetFragment.onMenuItemClicked).shouldOverrideUrl(guideArticleViewerBottomSheetFragment.shouldOverrideUrl).onAttachmentItemClicked(guideArticleViewerBottomSheetFragment.onAttachmentItemClicked).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArticleViewerState renderGuideArticleSuccess$lambda$7$lambda$6(GuideArticleViewerState.SuccessGuideArticle successGuideArticle, GuideArticleViewerBottomSheetFragment guideArticleViewerBottomSheetFragment, ArticleViewerState articleViewerState) {
        articleViewerState.getClass();
        ArticleContentState.ArticleLoadingStatus articleLoadingStatus = ArticleContentState.ArticleLoadingStatus.SUCCESS;
        boolean z11 = !successGuideArticle.getBackStack().isEmpty();
        Uri uri = Uri.parse(successGuideArticle.getUrl());
        uri.getClass();
        return articleViewerState.copy((25601 & 1) != 0 ? articleViewerState.articleData : new ArticleContentState.ArticleData(uri, successGuideArticle.getTitle(), successGuideArticle.getHtmlBody(), guideArticleViewerBottomSheetFragment.getBaseUrl()), (25601 & 2) != 0 ? articleViewerState.contentState : articleLoadingStatus, (25601 & 4) != 0 ? articleViewerState.iconColor : successGuideArticle.getMessagingTheme().getOnElevatedColor(), (25601 & 8) != 0 ? articleViewerState.backgroundColor : successGuideArticle.getMessagingTheme().getElevatedColor(), (25601 & 16) != 0 ? articleViewerState.buttonBackgroundColor : successGuideArticle.getMessagingTheme().getElevatedColor(), (25601 & 32) != 0 ? articleViewerState.textColor : successGuideArticle.getMessagingTheme().getOnElevatedColor(), (25601 & 64) != 0 ? articleViewerState.buttonColor : successGuideArticle.getMessagingTheme().getSuccessColor(), (25601 & 128) != 0 ? articleViewerState.indicatorColor : successGuideArticle.getMessagingTheme().getPrimaryColor(), (25601 & 256) != 0 ? articleViewerState.showBackButton : z11, (25601 & 512) != 0 ? articleViewerState.showShareButton : true, (25601 & 1024) != 0 ? articleViewerState.attachmentList : successGuideArticle.getAttachments(), (25601 & NewHope.SENDB_BYTES) != 0 ? articleViewerState.attachmentListTextColor : successGuideArticle.getMessagingTheme().getOnBackgroundColor(), (25601 & 4096) != 0 ? articleViewerState.navigationButtonBackgroundColor : successGuideArticle.getMessagingTheme().getElevatedColor(), (25601 & 8192) != 0 ? articleViewerState.focusedStateBorderColor : 0, (25601 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? articleViewerState.feedBackBannerOptions : null, (25601 & 32768) != 0 ? articleViewerState.shouldShowFeedbackBanner : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderLoading(GuideArticleViewerState.Loading state) {
        ArticleViewer articleViewer = this.articleViewer;
        if (articleViewer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("articleViewer");
            articleViewer = null;
        }
        articleViewer.render(new xq.a(12, this, state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArticleViewerRendering renderLoading$lambda$9(GuideArticleViewerBottomSheetFragment guideArticleViewerBottomSheetFragment, GuideArticleViewerState.Loading loading, ArticleViewerRendering articleViewerRendering) {
        articleViewerRendering.getClass();
        return articleViewerRendering.toBuilder().state(new zendesk.core.android.internal.a(loading, 3)).onMenuItemClicked(guideArticleViewerBottomSheetFragment.onMenuItemClicked).shouldOverrideUrl(guideArticleViewerBottomSheetFragment.shouldOverrideUrl).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArticleViewerState renderLoading$lambda$9$lambda$8(GuideArticleViewerState.Loading loading, ArticleViewerState articleViewerState) {
        articleViewerState.getClass();
        return articleViewerState.copy((25601 & 1) != 0 ? articleViewerState.articleData : null, (25601 & 2) != 0 ? articleViewerState.contentState : ArticleContentState.ArticleLoadingStatus.LOADING, (25601 & 4) != 0 ? articleViewerState.iconColor : loading.getMessagingTheme().getOnElevatedColor(), (25601 & 8) != 0 ? articleViewerState.backgroundColor : loading.getMessagingTheme().getElevatedColor(), (25601 & 16) != 0 ? articleViewerState.buttonBackgroundColor : loading.getMessagingTheme().getBackgroundColor(), (25601 & 32) != 0 ? articleViewerState.textColor : loading.getMessagingTheme().getOnElevatedColor(), (25601 & 64) != 0 ? articleViewerState.buttonColor : loading.getMessagingTheme().getSuccessColor(), (25601 & 128) != 0 ? articleViewerState.indicatorColor : loading.getMessagingTheme().getPrimaryColor(), (25601 & 256) != 0 ? articleViewerState.showBackButton : !loading.getBackStack().isEmpty(), (25601 & 512) != 0 ? articleViewerState.showShareButton : true, (25601 & 1024) != 0 ? articleViewerState.attachmentList : null, (25601 & NewHope.SENDB_BYTES) != 0 ? articleViewerState.attachmentListTextColor : loading.getMessagingTheme().getOnBackgroundColor(), (25601 & 4096) != 0 ? articleViewerState.navigationButtonBackgroundColor : loading.getMessagingTheme().getBackgroundColor(), (25601 & 8192) != 0 ? articleViewerState.focusedStateBorderColor : 0, (25601 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? articleViewerState.feedBackBannerOptions : null, (25601 & 32768) != 0 ? articleViewerState.shouldShowFeedbackBanner : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object setupGuideArticleViewerDependencies(x70.c<? super kotlin.Unit> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment.C04351
            if (r0 == 0) goto L14
            r0 = r9
            zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment$setupGuideArticleViewerDependencies$1 r0 = (zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment.C04351) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment$setupGuideArticleViewerDependencies$1 r0 = new zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment$setupGuideArticleViewerDependencies$1
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r5.result
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            ba0.g.M(r9)
            goto L66
        L29:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r9)
            r9 = 0
            return r9
        L30:
            ba0.g.M(r9)
            r9 = r2
            android.content.Context r2 = r8.requireContext()
            r2.getClass()
            android.os.Bundle r1 = r8.getArguments()
            if (r1 == 0) goto L87
            java.lang.String r3 = "GuideArticleViewerBottomSheetFragment.ARG_CREDENTIALS"
            java.lang.String r1 = r1.getString(r3)
            if (r1 != 0) goto L4a
            goto L87
        L4a:
            zendesk.android.ZendeskCredentials$Companion r3 = zendesk.android.ZendeskCredentials.INSTANCE
            zendesk.android.ZendeskCredentials r3 = r3.fromQuery(r1)
            if (r3 != 0) goto L58
            r8.errorHandler()
            kotlin.Unit r9 = kotlin.Unit.f26487a
            return r9
        L58:
            zendesk.android.Zendesk$Companion r1 = zendesk.android.Zendesk.INSTANCE
            r5.label = r9
            r4 = 0
            r6 = 4
            r7 = 0
            java.lang.Object r9 = zendesk.messaging.android.internal.extension.ZendeskKtxKt.messaging$default(r1, r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto L66
            return r0
        L66:
            zendesk.android.ZendeskResult r9 = (zendesk.android.ZendeskResult) r9
            boolean r0 = r9 instanceof zendesk.android.ZendeskResult.Failure
            if (r0 == 0) goto L70
            r8.errorHandler()
            goto L7f
        L70:
            boolean r0 = r9 instanceof zendesk.android.ZendeskResult.Success
            if (r0 == 0) goto L82
            zendesk.android.ZendeskResult$Success r9 = (zendesk.android.ZendeskResult.Success) r9
            java.lang.Object r9 = r9.getValue()
            zendesk.android.messaging.Messaging r9 = (zendesk.android.messaging.Messaging) r9
            r8.initGuideArticleViewerViewModel(r9)
        L7f:
            kotlin.Unit r9 = kotlin.Unit.f26487a
            return r9
        L82:
            e40.a.f()
            r9 = 0
            return r9
        L87:
            r8.errorHandler()
            kotlin.Unit r9 = kotlin.Unit.f26487a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment.setupGuideArticleViewerDependencies(x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void shareUrl(String url) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", url);
        intent.setType("text/plain");
        startActivity(Intent.createChooser(intent, ""));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldOverrideUrl$lambda$3(GuideArticleViewerBottomSheetFragment guideArticleViewerBottomSheetFragment, String str) {
        if (str == null) {
            return true;
        }
        GuideArticleViewerViewModel guideArticleViewerViewModel = guideArticleViewerBottomSheetFragment.guideArticleViewerViewModel;
        if (guideArticleViewerViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("guideArticleViewerViewModel");
            guideArticleViewerViewModel = null;
        }
        guideArticleViewerViewModel.process(new GuideArticleViewerAction.Load(str));
        return true;
    }

    @NotNull
    public final String getBaseUrl() {
        String str = this.baseUrl;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("baseUrl");
        return null;
    }

    @NotNull
    public final GuideArticleViewerViewModelFactory getGuideArticleViewerViewModelFactory() {
        GuideArticleViewerViewModelFactory guideArticleViewerViewModelFactory = this.guideArticleViewerViewModelFactory;
        if (guideArticleViewerViewModelFactory != null) {
            return guideArticleViewerViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("guideArticleViewerViewModelFactory");
        return null;
    }

    @NotNull
    public final GuideKit getGuideKit() {
        GuideKit guideKit = this.guideKit;
        if (guideKit != null) {
            return guideKit;
        }
        Intrinsics.throwUninitializedPropertyAccessException("guideKit");
        return null;
    }

    @NotNull
    public final MessagingSettings getMessagingSettings() {
        MessagingSettings messagingSettings = this.messagingSettings;
        if (messagingSettings != null) {
            return messagingSettings;
        }
        Intrinsics.throwUninitializedPropertyAccessException("messagingSettings");
        return null;
    }

    @NotNull
    public final UserColors getUserDarkColors() {
        UserColors userColors = this.userDarkColors;
        if (userColors != null) {
            return userColors;
        }
        Intrinsics.throwUninitializedPropertyAccessException(MessagingComponentKt.USER_DARK_COLORS);
        return null;
    }

    @NotNull
    public final UserColors getUserLightColors() {
        UserColors userColors = this.userLightColors;
        if (userColors != null) {
            return userColors;
        }
        Intrinsics.throwUninitializedPropertyAccessException(MessagingComponentKt.USER_LIGHT_COLORS);
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        remove();
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            BottomSheetDialogKtxKt.setFullScreen$default(dialog, 0, false, 3, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        view.getClass();
        super.onViewCreated(view, savedInstanceState);
        Dialog dialogRequireDialog = requireDialog();
        dialogRequireDialog.getClass();
        ((l) dialogRequireDialog).getOnBackPressedDispatcher().a(this.onBackPressedCallback);
        ArticleViewer articleViewer = (ArticleViewer) view.findViewById(R.id.zma_article_viewer);
        this.articleViewer = articleViewer;
        if (articleViewer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("articleViewer");
            articleViewer = null;
        }
        articleViewer.render(this.defaultRendering);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        f0.B(m1.c(viewLifecycleOwner), null, null, new C04341(null), 3);
    }

    public final void setBaseUrl(@NotNull String str) {
        str.getClass();
        this.baseUrl = str;
    }

    public final void setGuideArticleViewerViewModelFactory(@NotNull GuideArticleViewerViewModelFactory guideArticleViewerViewModelFactory) {
        guideArticleViewerViewModelFactory.getClass();
        this.guideArticleViewerViewModelFactory = guideArticleViewerViewModelFactory;
    }

    public final void setGuideKit(@NotNull GuideKit guideKit) {
        guideKit.getClass();
        this.guideKit = guideKit;
    }

    public final void setMessagingSettings(@NotNull MessagingSettings messagingSettings) {
        messagingSettings.getClass();
        this.messagingSettings = messagingSettings;
    }

    public final void setUserDarkColors(@NotNull UserColors userColors) {
        userColors.getClass();
        this.userDarkColors = userColors;
    }

    public final void setUserLightColors(@NotNull UserColors userColors) {
        userColors.getClass();
        this.userLightColors = userColors;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerBottomSheetFragment$Companion;", "", "<init>", "()V", "TAG", "", "LOG_TAG", "ARG_GUIDE_ARTICLE_URL", "ARG_CREDENTIALS", "newInstance", "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerBottomSheetFragment;", "guideArticleUrl", "credentials", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final GuideArticleViewerBottomSheetFragment newInstance(@NotNull String guideArticleUrl, @NotNull String credentials) {
            guideArticleUrl.getClass();
            credentials.getClass();
            GuideArticleViewerBottomSheetFragment guideArticleViewerBottomSheetFragment = new GuideArticleViewerBottomSheetFragment();
            Bundle bundle = new Bundle();
            bundle.putString(GuideArticleViewerBottomSheetFragment.ARG_GUIDE_ARTICLE_URL, guideArticleUrl);
            bundle.putString(GuideArticleViewerBottomSheetFragment.ARG_CREDENTIALS, credentials);
            guideArticleViewerBottomSheetFragment.setArguments(bundle);
            return guideArticleViewerBottomSheetFragment;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getBaseUrl$annotations() {
    }

    public static /* synthetic */ void getUserDarkColors$annotations() {
    }

    public static /* synthetic */ void getUserLightColors$annotations() {
    }
}
