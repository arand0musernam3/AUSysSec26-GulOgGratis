package zendesk.messaging.android.internal.conversationscreen.conversationextension;

import android.app.Dialog;
import android.content.Context;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import v80.f0;
import y80.j;
import z70.e;
import z70.i;
import zendesk.android.messaging.Messaging;
import zendesk.android.messaging.model.MessagingSettings;
import zendesk.android.messaging.model.UserColors;
import zendesk.core.android.internal.app.FeatureFlagManager;
import zendesk.core.ui.android.internal.model.MessageActionSize;
import zendesk.core.ui.android.internal.model.MessageSourceType;
import zendesk.core.ui.android.internal.xml.BottomSheetDialogKtxKt;
import zendesk.logger.Logger;
import zendesk.messaging.BuildConfig;
import zendesk.messaging.R;
import zendesk.messaging.android.internal.DefaultMessaging;
import zendesk.messaging.android.internal.analytics.AnalyticsProcessor;
import zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionAction;
import zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionEvent;
import zendesk.messaging.android.internal.di.MessagingComponentKt;
import zendesk.messaging.android.internal.extension.ContextKtxKt;
import zendesk.messaging.android.internal.model.MessagingTheme;
import zendesk.ui.android.conversation.conversationextension.ConversationExtensionLoadingState;
import zendesk.ui.android.conversation.conversationextension.ConversationExtensionRendering;
import zendesk.ui.android.conversation.conversationextension.ConversationExtensionView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000¥\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001L\b\u0000\u0018\u0000 ^2\u00020\u0001:\u0001^B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\u0003J\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u0019\u0010\u0014J\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010\u0003J\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!R\"\u0010#\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R(\u0010-\u001a\u00020,8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b-\u0010.\u0012\u0004\b3\u0010\u0003\u001a\u0004\b/\u00100\"\u0004\b1\u00102R(\u00104\u001a\u00020,8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b4\u0010.\u0012\u0004\b7\u0010\u0003\u001a\u0004\b5\u00100\"\u0004\b6\u00102R\"\u00109\u001a\u0002088\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010@\u001a\u00020?8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0016\u0010G\u001a\u00020F8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010J\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020\b0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020\b0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010QR\"\u0010U\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010T\u0012\u0004\u0012\u00020\b0S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020\b0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010QR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020\b0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010QR \u0010Y\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020\b0S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010VR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020\b0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010QR*\u0010]\u001a\u0018\u0012\u0004\u0012\u00020[\u0012\u0004\u0012\u00020[0Sj\b\u0012\u0004\u0012\u00020[`\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010V¨\u0006_"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionBottomSheetFragment;", "Lcom/google/android/material/bottomsheet/m;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroy", "onStart", "Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionState;", "state", "Lzendesk/ui/android/conversation/conversationextension/ConversationExtensionLoadingState;", "contentState", "renderState", "(Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionState;Lzendesk/ui/android/conversation/conversationextension/ConversationExtensionLoadingState;)V", "collectEvents", "(Lx70/c;)Ljava/lang/Object;", "collectStateUpdates", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "getMessagingTheme", "()Lzendesk/messaging/android/internal/model/MessagingTheme;", "setupConversationExtensionDependencies", "Lzendesk/android/messaging/Messaging;", AnalyticsProcessor.CHANNEL, "initConversationExtensionViewModel", "(Lzendesk/android/messaging/Messaging;)V", "errorHandler", "", "screenSize", "()D", "Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionViewModelFactory;", "conversationExtensionViewModelFactory", "Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionViewModelFactory;", "getConversationExtensionViewModelFactory", "()Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionViewModelFactory;", "setConversationExtensionViewModelFactory", "(Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionViewModelFactory;)V", "Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionViewModel;", "conversationExtensionViewModel", "Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionViewModel;", "Lzendesk/android/messaging/model/UserColors;", MessagingComponentKt.USER_DARK_COLORS, "Lzendesk/android/messaging/model/UserColors;", "getUserDarkColors", "()Lzendesk/android/messaging/model/UserColors;", "setUserDarkColors", "(Lzendesk/android/messaging/model/UserColors;)V", "getUserDarkColors$annotations", MessagingComponentKt.USER_LIGHT_COLORS, "getUserLightColors", "setUserLightColors", "getUserLightColors$annotations", "Lzendesk/android/messaging/model/MessagingSettings;", "messagingSettings", "Lzendesk/android/messaging/model/MessagingSettings;", "getMessagingSettings", "()Lzendesk/android/messaging/model/MessagingSettings;", "setMessagingSettings", "(Lzendesk/android/messaging/model/MessagingSettings;)V", "Lzendesk/core/android/internal/app/FeatureFlagManager;", "featureFlagManager", "Lzendesk/core/android/internal/app/FeatureFlagManager;", "getFeatureFlagManager", "()Lzendesk/core/android/internal/app/FeatureFlagManager;", "setFeatureFlagManager", "(Lzendesk/core/android/internal/app/FeatureFlagManager;)V", "Lzendesk/ui/android/conversation/conversationextension/ConversationExtensionView;", "conversationExtensionView", "Lzendesk/ui/android/conversation/conversationextension/ConversationExtensionView;", "", "isInitializationSuccessful", "Z", "zendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionBottomSheetFragment$onBackPressedCallback$1", "onBackPressedCallback", "Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionBottomSheetFragment$onBackPressedCallback$1;", "Lkotlin/Function0;", "onRetryButtonClicked", "Lkotlin/jvm/functions/Function0;", "onWebViewError", "Lkotlin/Function1;", "", "onWebSdkUpdateTitle", "Lkotlin/jvm/functions/Function1;", "closeDialog", "onBackButtonClicked", "onUrlUpdated", "pageLoadingComplete", "Lzendesk/ui/android/conversation/conversationextension/ConversationExtensionRendering;", "Lzendesk/messaging/android/internal/conversationscreen/RenderingUpdate;", "defaultRendering", "Companion", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConversationExtensionBottomSheetFragment extends m {

    @NotNull
    public static final String ARG_CONVERSATION_EXTENSION_CONVERSATION_ID = "ConversationExtensionBottomSheetFragment.ARG_CONVERSATION_EXTENSION_CONVERSATION_ID";

    @NotNull
    public static final String ARG_CONVERSATION_EXTENSION_LAUNCH_TYPE = "ConversationExtensionBottomSheetFragment.ARG_CONVERSATION_EXTENSION_LAUNCH_TYPE";

    @NotNull
    public static final String ARG_CONVERSATION_EXTENSION_SIZE = "ConversationExtensionBottomSheetFragment.ARG_CONVERSATION_EXTENSION_SIZE";

    @NotNull
    public static final String ARG_CONVERSATION_EXTENSION_SOURCE = "ConversationExtensionBottomSheetFragment.ARG_CONVERSATION_EXTENSION_SOURCE";

    @NotNull
    public static final String ARG_CONVERSATION_EXTENSION_URL = "ConversationExtensionBottomSheetFragment.ARG_CONVERSATION_EXTENSION_URL";

    @NotNull
    private static final String ARG_CREDENTIALS = "ConversationExtensionBottomSheetFragment.ARG_CREDENTIALS";
    private static final double COMPACT_SCREEN_SIZE = 0.5d;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final double FULL_SCREEN_SIZE = 1.0d;

    @NotNull
    public static final String LOG_TAG = "ConversationExtFrag";

    @NotNull
    private static final String SIZE_COMPACT = "COMPACT";

    @NotNull
    private static final String SIZE_FULL = "FULL";

    @NotNull
    private static final String SIZE_TALL = "TALL";

    @NotNull
    public static final String TAG = "ConversationExtensionBottomSheetFragment";
    private static final double TALL_SCREEN_SIZE = 0.7d;

    @NotNull
    private final Function0<Unit> closeDialog;
    private ConversationExtensionView conversationExtensionView;
    private ConversationExtensionViewModel conversationExtensionViewModel;
    public ConversationExtensionViewModelFactory conversationExtensionViewModelFactory;

    @NotNull
    private final Function1<ConversationExtensionRendering, ConversationExtensionRendering> defaultRendering;
    public FeatureFlagManager featureFlagManager;
    private boolean isInitializationSuccessful;
    public MessagingSettings messagingSettings;

    @NotNull
    private final Function0<Unit> onBackButtonClicked;

    @NotNull
    private final ConversationExtensionBottomSheetFragment$onBackPressedCallback$1 onBackPressedCallback;

    @NotNull
    private final Function0<Unit> onRetryButtonClicked;

    @NotNull
    private final Function1<String, Unit> onUrlUpdated;

    @NotNull
    private final Function1<String, Unit> onWebSdkUpdateTitle;

    @NotNull
    private final Function0<Unit> onWebViewError;

    @NotNull
    private final Function0<Unit> pageLoadingComplete;
    public UserColors userDarkColors;
    public UserColors userLightColors;

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment$collectStateUpdates$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment", f = "ConversationExtensionBottomSheetFragment.kt", l = {193}, m = "collectStateUpdates")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends z70.c {
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
            return ConversationExtensionBottomSheetFragment.this.collectStateUpdates(this);
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment$onViewCreated$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment$onViewCreated$1", f = "ConversationExtensionBottomSheetFragment.kt", l = {283}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C04311 extends i implements Function2<b0, x70.c<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment$onViewCreated$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @e(c = "zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment$onViewCreated$1$1", f = "ConversationExtensionBottomSheetFragment.kt", l = {284, 306}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
        public static final class C00501 extends i implements Function2<b0, x70.c<? super Unit>, Object> {
            int label;
            final /* synthetic */ ConversationExtensionBottomSheetFragment this$0;

            /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment$onViewCreated$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
            @e(c = "zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment$onViewCreated$1$1$1", f = "ConversationExtensionBottomSheetFragment.kt", l = {}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
            public static final class C00511 extends i implements Function2<b0, x70.c<? super Unit>, Object> {
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ ConversationExtensionBottomSheetFragment this$0;

                /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment$onViewCreated$1$1$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
                @e(c = "zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment$onViewCreated$1$1$1$1", f = "ConversationExtensionBottomSheetFragment.kt", l = {308}, m = "invokeSuspend")
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
                public static final class C00521 extends i implements Function2<b0, x70.c<? super Unit>, Object> {
                    int label;
                    final /* synthetic */ ConversationExtensionBottomSheetFragment this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00521(ConversationExtensionBottomSheetFragment conversationExtensionBottomSheetFragment, x70.c<? super C00521> cVar) {
                        super(2, cVar);
                        this.this$0 = conversationExtensionBottomSheetFragment;
                    }

                    @Override // z70.a
                    public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
                        return new C00521(this.this$0, cVar);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
                        return ((C00521) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
                    }

                    @Override // z70.a
                    public final Object invokeSuspend(Object obj) {
                        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                        int i11 = this.label;
                        if (i11 == 0) {
                            g.M(obj);
                            ConversationExtensionBottomSheetFragment conversationExtensionBottomSheetFragment = this.this$0;
                            this.label = 1;
                            if (conversationExtensionBottomSheetFragment.collectStateUpdates(this) == aVar) {
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

                /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment$onViewCreated$1$1$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
                @e(c = "zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment$onViewCreated$1$1$1$2", f = "ConversationExtensionBottomSheetFragment.kt", l = {311}, m = "invokeSuspend")
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
                public static final class AnonymousClass2 extends i implements Function2<b0, x70.c<? super Unit>, Object> {
                    int label;
                    final /* synthetic */ ConversationExtensionBottomSheetFragment this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(ConversationExtensionBottomSheetFragment conversationExtensionBottomSheetFragment, x70.c<? super AnonymousClass2> cVar) {
                        super(2, cVar);
                        this.this$0 = conversationExtensionBottomSheetFragment;
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
                            ConversationExtensionBottomSheetFragment conversationExtensionBottomSheetFragment = this.this$0;
                            this.label = 1;
                            if (conversationExtensionBottomSheetFragment.collectEvents(this) == aVar) {
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
                public C00511(ConversationExtensionBottomSheetFragment conversationExtensionBottomSheetFragment, x70.c<? super C00511> cVar) {
                    super(2, cVar);
                    this.this$0 = conversationExtensionBottomSheetFragment;
                }

                @Override // z70.a
                public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
                    C00511 c00511 = new C00511(this.this$0, cVar);
                    c00511.L$0 = obj;
                    return c00511;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
                    return ((C00511) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
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
                    f0.B(b0Var, null, null, new C00521(this.this$0, null), 3);
                    f0.B(b0Var, null, null, new AnonymousClass2(this.this$0, null), 3);
                    return Unit.f26487a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00501(ConversationExtensionBottomSheetFragment conversationExtensionBottomSheetFragment, x70.c<? super C00501> cVar) {
                super(2, cVar);
                this.this$0 = conversationExtensionBottomSheetFragment;
            }

            @Override // z70.a
            public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
                return new C00501(this.this$0, cVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
                return ((C00501) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:37:0x00c1, code lost:
            
                if (androidx.lifecycle.x0.b(r7, r3, r4, r6) == r0) goto L38;
             */
            @Override // z70.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    y70.a r0 = y70.a.COROUTINE_SUSPENDED
                    int r1 = r6.label
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1c
                    if (r1 == r3) goto L18
                    if (r1 != r2) goto L11
                    ba0.g.M(r7)
                    goto Lc4
                L11:
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    com.braze.h2.b(r7)
                    r7 = 0
                    return r7
                L18:
                    ba0.g.M(r7)
                    goto L2b
                L1c:
                    ba0.g.M(r7)
                    zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment r7 = r6.this$0
                    r6.label = r3
                    java.lang.Object r7 = zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment.access$setupConversationExtensionDependencies(r7, r6)
                    if (r7 != r0) goto L2b
                    goto Lc3
                L2b:
                    zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment r7 = r6.this$0
                    boolean r7 = zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment.access$isInitializationSuccessful$p(r7)
                    if (r7 != 0) goto L36
                    kotlin.Unit r7 = kotlin.Unit.f26487a
                    return r7
                L36:
                    zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment r7 = r6.this$0
                    android.os.Bundle r7 = r7.getArguments()
                    r1 = 0
                    if (r7 == 0) goto L46
                    java.lang.String r3 = "ConversationExtensionBottomSheetFragment.ARG_CONVERSATION_EXTENSION_URL"
                    java.lang.String r7 = r7.getString(r3)
                    goto L47
                L46:
                    r7 = r1
                L47:
                    zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment r3 = r6.this$0
                    java.lang.String r4 = "conversationExtensionViewModel"
                    if (r7 == 0) goto L66
                    zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionViewModel r7 = zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment.access$getConversationExtensionViewModel$p(r3)
                    if (r7 != 0) goto L57
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
                    r7 = r1
                L57:
                    zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionAction$RefreshTheme r3 = new zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionAction$RefreshTheme
                    zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment r5 = r6.this$0
                    zendesk.messaging.android.internal.model.MessagingTheme r5 = zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment.access$getMessagingTheme(r5)
                    r3.<init>(r5)
                    r7.process(r3)
                    goto L69
                L66:
                    zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment.access$errorHandler(r3)
                L69:
                    zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment r7 = r6.this$0
                    zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionViewModel r7 = zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment.access$getConversationExtensionViewModel$p(r7)
                    if (r7 != 0) goto L75
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
                    r7 = r1
                L75:
                    zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionAction$Load r3 = new zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionAction$Load
                    zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment r5 = r6.this$0
                    zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionViewModel r5 = zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment.access$getConversationExtensionViewModel$p(r5)
                    if (r5 != 0) goto L83
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
                    r5 = r1
                L83:
                    y80.y1 r4 = r5.getConversationExtensionState()
                    java.lang.Object r4 = r4.getValue()
                    zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionState r4 = (zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionState) r4
                    java.lang.String r4 = r4.getUrl()
                    r3.<init>(r4)
                    r7.process(r3)
                    zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment r7 = r6.this$0
                    androidx.lifecycle.Lifecycle r7 = r7.getLifecycle()
                    androidx.lifecycle.Lifecycle$State r7 = r7.b()
                    androidx.lifecycle.Lifecycle$State r3 = androidx.lifecycle.Lifecycle.State.CREATED
                    boolean r7 = r7.a(r3)
                    if (r7 == 0) goto Lc4
                    zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment r7 = r6.this$0
                    androidx.lifecycle.LifecycleOwner r7 = r7.getViewLifecycleOwner()
                    r7.getClass()
                    androidx.lifecycle.Lifecycle$State r3 = androidx.lifecycle.Lifecycle.State.STARTED
                    zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment$onViewCreated$1$1$1 r4 = new zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment$onViewCreated$1$1$1
                    zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment r5 = r6.this$0
                    r4.<init>(r5, r1)
                    r6.label = r2
                    java.lang.Object r7 = androidx.lifecycle.x0.b(r7, r3, r4, r6)
                    if (r7 != r0) goto Lc4
                Lc3:
                    return r0
                Lc4:
                    kotlin.Unit r7 = kotlin.Unit.f26487a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment.C04311.C00501.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public C04311(x70.c<? super C04311> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationExtensionBottomSheetFragment.this.new C04311(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C04311) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                LifecycleOwner viewLifecycleOwner = ConversationExtensionBottomSheetFragment.this.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                Lifecycle.State state = Lifecycle.State.CREATED;
                C00501 c00501 = new C00501(ConversationExtensionBottomSheetFragment.this, null);
                this.label = 1;
                if (x0.b(viewLifecycleOwner, state, c00501, this) == aVar) {
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

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment$setupConversationExtensionDependencies$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment", f = "ConversationExtensionBottomSheetFragment.kt", l = {233}, m = "setupConversationExtensionDependencies")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C04321 extends z70.c {
        int label;
        /* synthetic */ Object result;

        public C04321(x70.c<? super C04321> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationExtensionBottomSheetFragment.this.setupConversationExtensionDependencies(this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment$onBackPressedCallback$1] */
    public ConversationExtensionBottomSheetFragment() {
        super(R.layout.zma_bottom_sheet_conversation_extension);
        this.onBackPressedCallback = new y() { // from class: zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment$onBackPressedCallback$1
            {
                super(true);
            }

            @Override // androidx.activity.y
            public void handleOnBackPressed() {
                ConversationExtensionViewModel conversationExtensionViewModel = this.this$0.conversationExtensionViewModel;
                if (conversationExtensionViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("conversationExtensionViewModel");
                    conversationExtensionViewModel = null;
                }
                conversationExtensionViewModel.process(ConversationExtensionAction.Back.INSTANCE);
            }
        };
        final int i11 = 0;
        this.onRetryButtonClicked = new Function0(this) { // from class: zendesk.messaging.android.internal.conversationscreen.conversationextension.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConversationExtensionBottomSheetFragment f47655b;

            {
                this.f47655b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return ConversationExtensionBottomSheetFragment.onRetryButtonClicked$lambda$0(this.f47655b);
                    case 1:
                        return ConversationExtensionBottomSheetFragment.onWebViewError$lambda$1(this.f47655b);
                    case 2:
                        return ConversationExtensionBottomSheetFragment.closeDialog$lambda$3(this.f47655b);
                    case 3:
                        return ConversationExtensionBottomSheetFragment.onBackButtonClicked$lambda$4(this.f47655b);
                    default:
                        return ConversationExtensionBottomSheetFragment.pageLoadingComplete$lambda$6(this.f47655b);
                }
            }
        };
        final int i12 = 1;
        this.onWebViewError = new Function0(this) { // from class: zendesk.messaging.android.internal.conversationscreen.conversationextension.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConversationExtensionBottomSheetFragment f47655b;

            {
                this.f47655b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return ConversationExtensionBottomSheetFragment.onRetryButtonClicked$lambda$0(this.f47655b);
                    case 1:
                        return ConversationExtensionBottomSheetFragment.onWebViewError$lambda$1(this.f47655b);
                    case 2:
                        return ConversationExtensionBottomSheetFragment.closeDialog$lambda$3(this.f47655b);
                    case 3:
                        return ConversationExtensionBottomSheetFragment.onBackButtonClicked$lambda$4(this.f47655b);
                    default:
                        return ConversationExtensionBottomSheetFragment.pageLoadingComplete$lambda$6(this.f47655b);
                }
            }
        };
        final int i13 = 0;
        this.onWebSdkUpdateTitle = new Function1(this) { // from class: zendesk.messaging.android.internal.conversationscreen.conversationextension.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConversationExtensionBottomSheetFragment f47661b;

            {
                this.f47661b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        return ConversationExtensionBottomSheetFragment.onWebSdkUpdateTitle$lambda$2(this.f47661b, (String) obj);
                    case 1:
                        return ConversationExtensionBottomSheetFragment.onUrlUpdated$lambda$5(this.f47661b, (String) obj);
                    default:
                        return ConversationExtensionBottomSheetFragment.defaultRendering$lambda$8(this.f47661b, (ConversationExtensionRendering) obj);
                }
            }
        };
        final int i14 = 2;
        this.closeDialog = new Function0(this) { // from class: zendesk.messaging.android.internal.conversationscreen.conversationextension.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConversationExtensionBottomSheetFragment f47655b;

            {
                this.f47655b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return ConversationExtensionBottomSheetFragment.onRetryButtonClicked$lambda$0(this.f47655b);
                    case 1:
                        return ConversationExtensionBottomSheetFragment.onWebViewError$lambda$1(this.f47655b);
                    case 2:
                        return ConversationExtensionBottomSheetFragment.closeDialog$lambda$3(this.f47655b);
                    case 3:
                        return ConversationExtensionBottomSheetFragment.onBackButtonClicked$lambda$4(this.f47655b);
                    default:
                        return ConversationExtensionBottomSheetFragment.pageLoadingComplete$lambda$6(this.f47655b);
                }
            }
        };
        final int i15 = 3;
        this.onBackButtonClicked = new Function0(this) { // from class: zendesk.messaging.android.internal.conversationscreen.conversationextension.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConversationExtensionBottomSheetFragment f47655b;

            {
                this.f47655b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return ConversationExtensionBottomSheetFragment.onRetryButtonClicked$lambda$0(this.f47655b);
                    case 1:
                        return ConversationExtensionBottomSheetFragment.onWebViewError$lambda$1(this.f47655b);
                    case 2:
                        return ConversationExtensionBottomSheetFragment.closeDialog$lambda$3(this.f47655b);
                    case 3:
                        return ConversationExtensionBottomSheetFragment.onBackButtonClicked$lambda$4(this.f47655b);
                    default:
                        return ConversationExtensionBottomSheetFragment.pageLoadingComplete$lambda$6(this.f47655b);
                }
            }
        };
        final int i16 = 1;
        this.onUrlUpdated = new Function1(this) { // from class: zendesk.messaging.android.internal.conversationscreen.conversationextension.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConversationExtensionBottomSheetFragment f47661b;

            {
                this.f47661b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i16) {
                    case 0:
                        return ConversationExtensionBottomSheetFragment.onWebSdkUpdateTitle$lambda$2(this.f47661b, (String) obj);
                    case 1:
                        return ConversationExtensionBottomSheetFragment.onUrlUpdated$lambda$5(this.f47661b, (String) obj);
                    default:
                        return ConversationExtensionBottomSheetFragment.defaultRendering$lambda$8(this.f47661b, (ConversationExtensionRendering) obj);
                }
            }
        };
        final int i17 = 4;
        this.pageLoadingComplete = new Function0(this) { // from class: zendesk.messaging.android.internal.conversationscreen.conversationextension.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConversationExtensionBottomSheetFragment f47655b;

            {
                this.f47655b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i17) {
                    case 0:
                        return ConversationExtensionBottomSheetFragment.onRetryButtonClicked$lambda$0(this.f47655b);
                    case 1:
                        return ConversationExtensionBottomSheetFragment.onWebViewError$lambda$1(this.f47655b);
                    case 2:
                        return ConversationExtensionBottomSheetFragment.closeDialog$lambda$3(this.f47655b);
                    case 3:
                        return ConversationExtensionBottomSheetFragment.onBackButtonClicked$lambda$4(this.f47655b);
                    default:
                        return ConversationExtensionBottomSheetFragment.pageLoadingComplete$lambda$6(this.f47655b);
                }
            }
        };
        final int i18 = 2;
        this.defaultRendering = new Function1(this) { // from class: zendesk.messaging.android.internal.conversationscreen.conversationextension.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConversationExtensionBottomSheetFragment f47661b;

            {
                this.f47661b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i18) {
                    case 0:
                        return ConversationExtensionBottomSheetFragment.onWebSdkUpdateTitle$lambda$2(this.f47661b, (String) obj);
                    case 1:
                        return ConversationExtensionBottomSheetFragment.onUrlUpdated$lambda$5(this.f47661b, (String) obj);
                    default:
                        return ConversationExtensionBottomSheetFragment.defaultRendering$lambda$8(this.f47661b, (ConversationExtensionRendering) obj);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit closeDialog$lambda$3(ConversationExtensionBottomSheetFragment conversationExtensionBottomSheetFragment) {
        ConversationExtensionViewModel conversationExtensionViewModel = conversationExtensionBottomSheetFragment.conversationExtensionViewModel;
        if (conversationExtensionViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("conversationExtensionViewModel");
            conversationExtensionViewModel = null;
        }
        conversationExtensionViewModel.process(ConversationExtensionAction.Close.INSTANCE);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object collectEvents(x70.c<? super Unit> cVar) {
        ConversationExtensionViewModel conversationExtensionViewModel = this.conversationExtensionViewModel;
        if (conversationExtensionViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("conversationExtensionViewModel");
            conversationExtensionViewModel = null;
        }
        Object objCollect = conversationExtensionViewModel.getEventsChannel().collect(new AnonymousClass2(), cVar);
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
            boolean r0 = r5 instanceof zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment$collectStateUpdates$1 r0 = (zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment$collectStateUpdates$1 r0 = new zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment$collectStateUpdates$1
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
            zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionViewModel r5 = r4.conversationExtensionViewModel
            if (r5 != 0) goto L3b
            java.lang.String r5 = "conversationExtensionViewModel"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
            r5 = 0
        L3b:
            y80.y1 r5 = r5.getConversationExtensionState()
            zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment$collectStateUpdates$2 r2 = new zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment$collectStateUpdates$2
            r2.<init>()
            r0.label = r3
            java.lang.Object r5 = r5.collect(r2, r0)
            if (r5 != r1) goto L4d
            return r1
        L4d:
            qc.y.m()
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment.collectStateUpdates(x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationExtensionRendering defaultRendering$lambda$8(ConversationExtensionBottomSheetFragment conversationExtensionBottomSheetFragment, ConversationExtensionRendering conversationExtensionRendering) {
        conversationExtensionRendering.getClass();
        return conversationExtensionRendering.toBuilder().state(new d(1)).onWebSdkUpdateTitle(conversationExtensionBottomSheetFragment.onWebSdkUpdateTitle).onWebViewError(conversationExtensionBottomSheetFragment.onWebViewError).onWebSdkClose(conversationExtensionBottomSheetFragment.closeDialog).onCloseButtonClicked(conversationExtensionBottomSheetFragment.closeDialog).onRetryButtonClicked(conversationExtensionBottomSheetFragment.onRetryButtonClicked).onUrlUpdated(conversationExtensionBottomSheetFragment.onUrlUpdated).onPageLoadingComplete(conversationExtensionBottomSheetFragment.pageLoadingComplete).onBackButtonClicked(conversationExtensionBottomSheetFragment.onBackButtonClicked).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zendesk.ui.android.conversation.conversationextension.ConversationExtensionState defaultRendering$lambda$8$lambda$7(zendesk.ui.android.conversation.conversationextension.ConversationExtensionState conversationExtensionState) {
        conversationExtensionState.getClass();
        ConversationExtensionLoadingState conversationExtensionLoadingState = ConversationExtensionLoadingState.IDLE;
        MessagingTheme.Companion companion = MessagingTheme.INSTANCE;
        return zendesk.ui.android.conversation.conversationextension.ConversationExtensionState.copy$default(conversationExtensionState, conversationExtensionLoadingState, companion.getDEFAULT().getOnBackgroundColor(), companion.getDEFAULT().getElevatedColor(), companion.getDEFAULT().getElevatedColor(), companion.getDEFAULT().getOnElevatedColor(), companion.getDEFAULT().getSuccessColor(), companion.getDEFAULT().getPrimaryColor(), companion.getDEFAULT().getElevatedColor(), 0, null, null, BuildConfig.VERSION_NAME, false, 5888, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void errorHandler() {
        Logger.e(LOG_TAG, "Unable to show the Conversation Extension without a Messaging instance.", new Object[0]);
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

    private final void initConversationExtensionViewModel(Messaging messaging) {
        if (!(messaging instanceof DefaultMessaging)) {
            errorHandler();
            return;
        }
        ((DefaultMessaging) messaging).getMessagingComponent().conversationExtensionFragmentComponent().create(this, getArguments()).inject(this);
        ConversationExtensionViewModelFactory conversationExtensionViewModelFactory = getConversationExtensionViewModelFactory();
        conversationExtensionViewModelFactory.getClass();
        ViewModelStore viewModelStore = getViewModelStore();
        CreationExtras defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelCreationExtras.getClass();
        a0 a0Var = new a0(viewModelStore, conversationExtensionViewModelFactory, defaultViewModelCreationExtras);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ConversationExtensionViewModel.class);
        orCreateKotlinClass.getClass();
        String qualifiedName = orCreateKotlinClass.getQualifiedName();
        if (qualifiedName == null) {
            i4.a.f("Local and anonymous classes can not be ViewModels");
        } else {
            this.conversationExtensionViewModel = (ConversationExtensionViewModel) a0Var.M("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), orCreateKotlinClass);
            this.isInitializationSuccessful = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBackButtonClicked$lambda$4(ConversationExtensionBottomSheetFragment conversationExtensionBottomSheetFragment) {
        ConversationExtensionViewModel conversationExtensionViewModel = conversationExtensionBottomSheetFragment.conversationExtensionViewModel;
        if (conversationExtensionViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("conversationExtensionViewModel");
            conversationExtensionViewModel = null;
        }
        conversationExtensionViewModel.process(ConversationExtensionAction.Back.INSTANCE);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onRetryButtonClicked$lambda$0(ConversationExtensionBottomSheetFragment conversationExtensionBottomSheetFragment) {
        ConversationExtensionViewModel conversationExtensionViewModel = conversationExtensionBottomSheetFragment.conversationExtensionViewModel;
        if (conversationExtensionViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("conversationExtensionViewModel");
            conversationExtensionViewModel = null;
        }
        conversationExtensionViewModel.process(ConversationExtensionAction.Reload.INSTANCE);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onUrlUpdated$lambda$5(ConversationExtensionBottomSheetFragment conversationExtensionBottomSheetFragment, String str) {
        str.getClass();
        ConversationExtensionViewModel conversationExtensionViewModel = conversationExtensionBottomSheetFragment.conversationExtensionViewModel;
        if (conversationExtensionViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("conversationExtensionViewModel");
            conversationExtensionViewModel = null;
        }
        conversationExtensionViewModel.process(new ConversationExtensionAction.UpdateUrl(str));
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWebSdkUpdateTitle$lambda$2(ConversationExtensionBottomSheetFragment conversationExtensionBottomSheetFragment, String str) {
        ConversationExtensionViewModel conversationExtensionViewModel = conversationExtensionBottomSheetFragment.conversationExtensionViewModel;
        if (conversationExtensionViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("conversationExtensionViewModel");
            conversationExtensionViewModel = null;
        }
        conversationExtensionViewModel.process(new ConversationExtensionAction.UpdateTitle(str));
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWebViewError$lambda$1(ConversationExtensionBottomSheetFragment conversationExtensionBottomSheetFragment) {
        ConversationExtensionViewModel conversationExtensionViewModel = conversationExtensionBottomSheetFragment.conversationExtensionViewModel;
        if (conversationExtensionViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("conversationExtensionViewModel");
            conversationExtensionViewModel = null;
        }
        conversationExtensionViewModel.process(ConversationExtensionAction.WebViewError.INSTANCE);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pageLoadingComplete$lambda$6(ConversationExtensionBottomSheetFragment conversationExtensionBottomSheetFragment) {
        ConversationExtensionViewModel conversationExtensionViewModel = conversationExtensionBottomSheetFragment.conversationExtensionViewModel;
        if (conversationExtensionViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("conversationExtensionViewModel");
            conversationExtensionViewModel = null;
        }
        conversationExtensionViewModel.process(ConversationExtensionAction.LoadingComplete.INSTANCE);
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderState(ConversationExtensionState state, ConversationExtensionLoadingState contentState) {
        ConversationExtensionView conversationExtensionView = this.conversationExtensionView;
        if (conversationExtensionView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("conversationExtensionView");
            conversationExtensionView = null;
        }
        conversationExtensionView.render(new b(this, state, contentState, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationExtensionRendering renderState$lambda$10(ConversationExtensionBottomSheetFragment conversationExtensionBottomSheetFragment, ConversationExtensionState conversationExtensionState, ConversationExtensionLoadingState conversationExtensionLoadingState, ConversationExtensionRendering conversationExtensionRendering) {
        conversationExtensionRendering.getClass();
        return conversationExtensionRendering.toBuilder().state(new b(conversationExtensionBottomSheetFragment, conversationExtensionState, conversationExtensionLoadingState, 1)).onWebSdkUpdateTitle(conversationExtensionBottomSheetFragment.onWebSdkUpdateTitle).onWebViewError(conversationExtensionBottomSheetFragment.onWebViewError).onWebSdkClose(conversationExtensionBottomSheetFragment.closeDialog).onCloseButtonClicked(conversationExtensionBottomSheetFragment.closeDialog).onRetryButtonClicked(conversationExtensionBottomSheetFragment.onRetryButtonClicked).onUrlUpdated(conversationExtensionBottomSheetFragment.onUrlUpdated).onPageLoadingComplete(conversationExtensionBottomSheetFragment.pageLoadingComplete).onBackButtonClicked(conversationExtensionBottomSheetFragment.onBackButtonClicked).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zendesk.ui.android.conversation.conversationextension.ConversationExtensionState renderState$lambda$10$lambda$9(ConversationExtensionBottomSheetFragment conversationExtensionBottomSheetFragment, ConversationExtensionState conversationExtensionState, ConversationExtensionLoadingState conversationExtensionLoadingState, zendesk.ui.android.conversation.conversationextension.ConversationExtensionState conversationExtensionState2) {
        conversationExtensionState2.getClass();
        return zendesk.ui.android.conversation.conversationextension.ConversationExtensionState.copy$default(conversationExtensionState2, conversationExtensionLoadingState, conversationExtensionState.getMessagingTheme().getOnElevatedColor(), conversationExtensionState.getMessagingTheme().getElevatedColor(), conversationExtensionState.getMessagingTheme().getElevatedColor(), conversationExtensionState.getMessagingTheme().getOnElevatedColor(), conversationExtensionState.getMessagingTheme().getSuccessColor(), conversationExtensionState.getMessagingTheme().getPrimaryColor(), conversationExtensionState.getMessagingTheme().getElevatedColor(), 0, conversationExtensionState.getTitle(), conversationExtensionState.getUrl(), BuildConfig.VERSION_NAME, conversationExtensionBottomSheetFragment.getFeatureFlagManager().isConversationExtensionBackButtonEnabled() && !conversationExtensionState.getBackStack().isEmpty(), 256, null);
    }

    private final double screenSize() {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString(ARG_CONVERSATION_EXTENSION_SIZE) : null;
        if (string != null) {
            int iHashCode = string.hashCode();
            if (iHashCode == 2169487) {
                string.equals(SIZE_FULL);
            } else if (iHashCode != 2567341) {
                if (iHashCode == 1668466435 && string.equals(SIZE_COMPACT)) {
                    return COMPACT_SCREEN_SIZE;
                }
            } else if (string.equals(SIZE_TALL)) {
                return TALL_SCREEN_SIZE;
            }
        }
        return FULL_SCREEN_SIZE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object setupConversationExtensionDependencies(x70.c<? super kotlin.Unit> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment.C04321
            if (r0 == 0) goto L14
            r0 = r9
            zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment$setupConversationExtensionDependencies$1 r0 = (zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment.C04321) r0
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
            zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment$setupConversationExtensionDependencies$1 r0 = new zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment$setupConversationExtensionDependencies$1
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
            java.lang.String r3 = "ConversationExtensionBottomSheetFragment.ARG_CREDENTIALS"
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
            r8.initConversationExtensionViewModel(r9)
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
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment.setupConversationExtensionDependencies(x70.c):java.lang.Object");
    }

    @NotNull
    public final ConversationExtensionViewModelFactory getConversationExtensionViewModelFactory() {
        ConversationExtensionViewModelFactory conversationExtensionViewModelFactory = this.conversationExtensionViewModelFactory;
        if (conversationExtensionViewModelFactory != null) {
            return conversationExtensionViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("conversationExtensionViewModelFactory");
        return null;
    }

    @NotNull
    public final FeatureFlagManager getFeatureFlagManager() {
        FeatureFlagManager featureFlagManager = this.featureFlagManager;
        if (featureFlagManager != null) {
            return featureFlagManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("featureFlagManager");
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
        if (getResources().getConfiguration().orientation == 2) {
            Dialog dialog = getDialog();
            if (dialog != null) {
                BottomSheetDialogKtxKt.setConversationExtensionFullScreen$default(dialog, 0, false, FULL_SCREEN_SIZE, 3, null);
                return;
            }
            return;
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            BottomSheetDialogKtxKt.setConversationExtensionFullScreen$default(dialog2, 0, false, screenSize(), 3, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        view.getClass();
        super.onViewCreated(view, savedInstanceState);
        ConversationExtensionView conversationExtensionView = (ConversationExtensionView) view.findViewById(R.id.zma_conversation_extension);
        this.conversationExtensionView = conversationExtensionView;
        if (conversationExtensionView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("conversationExtensionView");
            conversationExtensionView = null;
        }
        conversationExtensionView.render(this.defaultRendering);
        Dialog dialogRequireDialog = requireDialog();
        dialogRequireDialog.getClass();
        ((l) dialogRequireDialog).getOnBackPressedDispatcher().a(this.onBackPressedCallback);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        f0.B(m1.c(viewLifecycleOwner), null, null, new C04311(null), 3);
    }

    public final void setConversationExtensionViewModelFactory(@NotNull ConversationExtensionViewModelFactory conversationExtensionViewModelFactory) {
        conversationExtensionViewModelFactory.getClass();
        this.conversationExtensionViewModelFactory = conversationExtensionViewModelFactory;
    }

    public final void setFeatureFlagManager(@NotNull FeatureFlagManager featureFlagManager) {
        featureFlagManager.getClass();
        this.featureFlagManager = featureFlagManager;
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
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionBottomSheetFragment$Companion;", "", "<init>", "()V", "TAG", "", "LOG_TAG", "ARG_CONVERSATION_EXTENSION_URL", "ARG_CONVERSATION_EXTENSION_SIZE", "ARG_CONVERSATION_EXTENSION_SOURCE", "ARG_CREDENTIALS", "ARG_CONVERSATION_EXTENSION_LAUNCH_TYPE", "ARG_CONVERSATION_EXTENSION_CONVERSATION_ID", "SIZE_FULL", "SIZE_TALL", "SIZE_COMPACT", "FULL_SCREEN_SIZE", "", "TALL_SCREEN_SIZE", "COMPACT_SCREEN_SIZE", "newInstance", "Lzendesk/messaging/android/internal/conversationscreen/conversationextension/ConversationExtensionBottomSheetFragment;", "conversationExtensionUrl", "conversationExtensionSize", "Lzendesk/core/ui/android/internal/model/MessageActionSize;", "credentials", "conversationExtensionLaunchType", "conversationExtensionSource", "Lzendesk/core/ui/android/internal/model/MessageSourceType;", "conversationId", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ConversationExtensionBottomSheetFragment newInstance(@NotNull String conversationExtensionUrl, @NotNull MessageActionSize conversationExtensionSize, @NotNull String credentials, @NotNull String conversationExtensionLaunchType, @NotNull MessageSourceType conversationExtensionSource, @NotNull String conversationId) {
            conversationExtensionUrl.getClass();
            conversationExtensionSize.getClass();
            credentials.getClass();
            conversationExtensionLaunchType.getClass();
            conversationExtensionSource.getClass();
            conversationId.getClass();
            ConversationExtensionBottomSheetFragment conversationExtensionBottomSheetFragment = new ConversationExtensionBottomSheetFragment();
            Bundle bundle = new Bundle();
            bundle.putString(ConversationExtensionBottomSheetFragment.ARG_CONVERSATION_EXTENSION_URL, conversationExtensionUrl);
            bundle.putString(ConversationExtensionBottomSheetFragment.ARG_CONVERSATION_EXTENSION_SIZE, conversationExtensionSize.toString());
            bundle.putString(ConversationExtensionBottomSheetFragment.ARG_CONVERSATION_EXTENSION_LAUNCH_TYPE, conversationExtensionLaunchType);
            bundle.putString(ConversationExtensionBottomSheetFragment.ARG_CONVERSATION_EXTENSION_SOURCE, conversationExtensionSource.getValue());
            bundle.putString(ConversationExtensionBottomSheetFragment.ARG_CREDENTIALS, credentials);
            bundle.putString(ConversationExtensionBottomSheetFragment.ARG_CONVERSATION_EXTENSION_CONVERSATION_ID, conversationId);
            conversationExtensionBottomSheetFragment.setArguments(bundle);
            return conversationExtensionBottomSheetFragment;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationscreen.conversationextension.ConversationExtensionBottomSheetFragment$collectEvents$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass2<T> implements j {
        public AnonymousClass2() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ConversationExtensionRendering emit$lambda$0(ConversationExtensionRendering conversationExtensionRendering) {
            conversationExtensionRendering.getClass();
            return new ConversationExtensionRendering.Builder().build();
        }

        public final Object emit(ConversationExtensionEvent conversationExtensionEvent, x70.c<? super Unit> cVar) {
            if (!Intrinsics.areEqual(conversationExtensionEvent, ConversationExtensionEvent.Close.INSTANCE)) {
                e40.a.f();
                return null;
            }
            ConversationExtensionView conversationExtensionView = ConversationExtensionBottomSheetFragment.this.conversationExtensionView;
            if (conversationExtensionView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("conversationExtensionView");
                conversationExtensionView = null;
            }
            conversationExtensionView.render(new d(0));
            ConversationExtensionBottomSheetFragment.this.dismiss();
            return Unit.f26487a;
        }

        @Override // y80.j
        public /* bridge */ /* synthetic */ Object emit(Object obj, x70.c cVar) {
            return emit((ConversationExtensionEvent) obj, (x70.c<? super Unit>) cVar);
        }
    }

    public static /* synthetic */ void getUserDarkColors$annotations() {
    }

    public static /* synthetic */ void getUserLightColors$annotations() {
    }
}
