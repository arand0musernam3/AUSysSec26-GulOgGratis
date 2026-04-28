package zendesk.messaging.android.internal.conversationslistscreen;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.y;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.m1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.x0;
import com.braze.h2;
import com.google.firebase.messaging.a0;
import k.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import v80.f0;
import y80.j;
import z70.i;
import zendesk.android.messaging.Messaging;
import zendesk.android.messaging.model.MessagingSettings;
import zendesk.android.messaging.model.UserColors;
import zendesk.core.android.internal.app.FeatureFlagManager;
import zendesk.core.ui.android.internal.model.ConversationEntry;
import zendesk.logger.Logger;
import zendesk.messaging.R;
import zendesk.messaging.android.internal.DefaultMessaging;
import zendesk.messaging.android.internal.VisibleScreen;
import zendesk.messaging.android.internal.VisibleScreenTracker;
import zendesk.messaging.android.internal.analytics.AnalyticsProcessor;
import zendesk.messaging.android.internal.conversationscreen.ConversationFragment;
import zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment;
import zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenActions;
import zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenNavigationEvents;
import zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenRendering;
import zendesk.messaging.android.internal.conversationslistscreen.di.ConversationListFragmentComponent;
import zendesk.messaging.android.internal.di.MessagingComponentKt;
import zendesk.messaging.android.internal.messagingscreen.MessagingNavigator;
import zendesk.messaging.android.internal.permissions.RuntimePermissionRequester;
import zendesk.ui.android.Renderer;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u008b\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u0001U\b\u0000\u0018\u0000 X2\u00020\u0001:\u0001XB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u0010\u0010\u0019\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0019\u0010\u0016J\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u0003J\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010\bR\"\u0010!\u001a\u00020 8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010(\u001a\u00020'8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R(\u0010/\u001a\u00020.8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b/\u00100\u0012\u0004\b5\u0010\u0003\u001a\u0004\b1\u00102\"\u0004\b3\u00104R(\u00106\u001a\u00020.8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b6\u00100\u0012\u0004\b9\u0010\u0003\u001a\u0004\b7\u00102\"\u0004\b8\u00104R\"\u0010;\u001a\u00020:8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010B\u001a\u00020A8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0016\u0010I\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u001c\u0010M\u001a\b\u0012\u0004\u0012\u00020L0K8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010P\u001a\u00020O8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010S\u001a\u00020R8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010V\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006Y"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/ConversationListFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStop", "onDestroy", "", "conversationId", "openMessagingScreen", "(Ljava/lang/String;)V", "collectStateUpdates", "(Lx70/c;)Ljava/lang/Object;", "navigationEvents", "requestNotificationPermission", "setupDependencies", "Lzendesk/android/messaging/Messaging;", AnalyticsProcessor.CHANNEL, "initViewModel", "(Lzendesk/android/messaging/Messaging;)V", "errorHandler", "setupPermissionRequester", "Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenViewModelFactory;", "conversationsListScreenViewModelFactory", "Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenViewModelFactory;", "getConversationsListScreenViewModelFactory", "()Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenViewModelFactory;", "setConversationsListScreenViewModelFactory", "(Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenViewModelFactory;)V", "Lzendesk/android/messaging/model/MessagingSettings;", "messagingSettings", "Lzendesk/android/messaging/model/MessagingSettings;", "getMessagingSettings", "()Lzendesk/android/messaging/model/MessagingSettings;", "setMessagingSettings", "(Lzendesk/android/messaging/model/MessagingSettings;)V", "Lzendesk/android/messaging/model/UserColors;", MessagingComponentKt.USER_DARK_COLORS, "Lzendesk/android/messaging/model/UserColors;", "getUserDarkColors", "()Lzendesk/android/messaging/model/UserColors;", "setUserDarkColors", "(Lzendesk/android/messaging/model/UserColors;)V", "getUserDarkColors$annotations", MessagingComponentKt.USER_LIGHT_COLORS, "getUserLightColors", "setUserLightColors", "getUserLightColors$annotations", "Lzendesk/core/android/internal/app/FeatureFlagManager;", "featureFlagManager", "Lzendesk/core/android/internal/app/FeatureFlagManager;", "getFeatureFlagManager", "()Lzendesk/core/android/internal/app/FeatureFlagManager;", "setFeatureFlagManager", "(Lzendesk/core/android/internal/app/FeatureFlagManager;)V", "Lzendesk/messaging/android/internal/messagingscreen/MessagingNavigator;", "messagingNavigator", "Lzendesk/messaging/android/internal/messagingscreen/MessagingNavigator;", "getMessagingNavigator", "()Lzendesk/messaging/android/internal/messagingscreen/MessagingNavigator;", "setMessagingNavigator", "(Lzendesk/messaging/android/internal/messagingscreen/MessagingNavigator;)V", "", "isInitializationSuccessful", "Z", "Lzendesk/ui/android/Renderer;", "Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenRendering;", "conversationListScreen", "Lzendesk/ui/android/Renderer;", "Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenViewModel;", "conversationsListScreenViewModel", "Lzendesk/messaging/android/internal/conversationslistscreen/ConversationsListScreenViewModel;", "Lzendesk/messaging/android/internal/permissions/RuntimePermissionRequester;", "permissionRequester", "Lzendesk/messaging/android/internal/permissions/RuntimePermissionRequester;", "zendesk/messaging/android/internal/conversationslistscreen/ConversationListFragment$onBackPressedCallback$1", "onBackPressedCallback", "Lzendesk/messaging/android/internal/conversationslistscreen/ConversationListFragment$onBackPressedCallback$1;", "Companion", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConversationListFragment extends Fragment {

    @NotNull
    private static final String ARG_CREDENTIALS = "ConversationListFragment.ARG_CREDENTIALS";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String LOG_TAG = "ConversationListFragment";

    @NotNull
    public static final String NAME = "ConversationListFragment";
    private Renderer<ConversationsListScreenRendering> conversationListScreen;
    private ConversationsListScreenViewModel conversationsListScreenViewModel;
    public ConversationsListScreenViewModelFactory conversationsListScreenViewModelFactory;
    public FeatureFlagManager featureFlagManager;
    private boolean isInitializationSuccessful;
    public MessagingNavigator messagingNavigator;
    public MessagingSettings messagingSettings;

    @NotNull
    private final ConversationListFragment$onBackPressedCallback$1 onBackPressedCallback;
    private RuntimePermissionRequester permissionRequester;
    public UserColors userDarkColors;
    public UserColors userLightColors;

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment$collectStateUpdates$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment", f = "ConversationListFragment.kt", l = {153}, m = "collectStateUpdates")
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
            return ConversationListFragment.this.collectStateUpdates(this);
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment$onViewCreated$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment$onViewCreated$1", f = "ConversationListFragment.kt", l = {98}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C04461 extends i implements Function2<b0, x70.c<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment$onViewCreated$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @z70.e(c = "zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment$onViewCreated$1$1", f = "ConversationListFragment.kt", l = {99, 113}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
        public static final class C00561 extends i implements Function2<b0, x70.c<? super Unit>, Object> {
            int label;
            final /* synthetic */ ConversationListFragment this$0;

            /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment$onViewCreated$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
            @z70.e(c = "zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment$onViewCreated$1$1$1", f = "ConversationListFragment.kt", l = {}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
            public static final class C00571 extends i implements Function2<b0, x70.c<? super Unit>, Object> {
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ ConversationListFragment this$0;

                /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment$onViewCreated$1$1$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
                @z70.e(c = "zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment$onViewCreated$1$1$1$1", f = "ConversationListFragment.kt", l = {115}, m = "invokeSuspend")
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
                public static final class C00581 extends i implements Function2<b0, x70.c<? super Unit>, Object> {
                    int label;
                    final /* synthetic */ ConversationListFragment this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00581(ConversationListFragment conversationListFragment, x70.c<? super C00581> cVar) {
                        super(2, cVar);
                        this.this$0 = conversationListFragment;
                    }

                    @Override // z70.a
                    public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
                        return new C00581(this.this$0, cVar);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
                        return ((C00581) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
                    }

                    @Override // z70.a
                    public final Object invokeSuspend(Object obj) {
                        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                        int i11 = this.label;
                        if (i11 == 0) {
                            ba0.g.M(obj);
                            ConversationListFragment conversationListFragment = this.this$0;
                            this.label = 1;
                            if (conversationListFragment.collectStateUpdates(this) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i11 != 1) {
                                h2.b("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ba0.g.M(obj);
                        }
                        return Unit.f26487a;
                    }
                }

                /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment$onViewCreated$1$1$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
                @z70.e(c = "zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment$onViewCreated$1$1$1$2", f = "ConversationListFragment.kt", l = {118}, m = "invokeSuspend")
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
                public static final class AnonymousClass2 extends i implements Function2<b0, x70.c<? super Unit>, Object> {
                    int label;
                    final /* synthetic */ ConversationListFragment this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(ConversationListFragment conversationListFragment, x70.c<? super AnonymousClass2> cVar) {
                        super(2, cVar);
                        this.this$0 = conversationListFragment;
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
                            ba0.g.M(obj);
                            ConversationListFragment conversationListFragment = this.this$0;
                            this.label = 1;
                            if (conversationListFragment.navigationEvents(this) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i11 != 1) {
                                h2.b("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ba0.g.M(obj);
                        }
                        return Unit.f26487a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00571(ConversationListFragment conversationListFragment, x70.c<? super C00571> cVar) {
                    super(2, cVar);
                    this.this$0 = conversationListFragment;
                }

                @Override // z70.a
                public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
                    C00571 c00571 = new C00571(this.this$0, cVar);
                    c00571.L$0 = obj;
                    return c00571;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
                    return ((C00571) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
                }

                @Override // z70.a
                public final Object invokeSuspend(Object obj) {
                    y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                    if (this.label != 0) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                    b0 b0Var = (b0) this.L$0;
                    f0.B(b0Var, null, null, new C00581(this.this$0, null), 3);
                    f0.B(b0Var, null, null, new AnonymousClass2(this.this$0, null), 3);
                    return Unit.f26487a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00561(ConversationListFragment conversationListFragment, x70.c<? super C00561> cVar) {
                super(2, cVar);
                this.this$0 = conversationListFragment;
            }

            @Override // z70.a
            public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
                return new C00561(this.this$0, cVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
                return ((C00561) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:23:0x009a, code lost:
            
                if (androidx.lifecycle.x0.b(r8, r3, r4, r7) == r0) goto L24;
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
                    goto L9d
                L11:
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    com.braze.h2.b(r8)
                    r8 = 0
                    return r8
                L18:
                    ba0.g.M(r8)
                    goto L2a
                L1c:
                    ba0.g.M(r8)
                    zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment r8 = r7.this$0
                    r7.label = r3
                    java.lang.Object r8 = zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment.access$setupDependencies(r8, r7)
                    if (r8 != r0) goto L2a
                    goto L9c
                L2a:
                    zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment r8 = r7.this$0
                    boolean r8 = zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment.access$isInitializationSuccessful$p(r8)
                    if (r8 != 0) goto L35
                    kotlin.Unit r8 = kotlin.Unit.f26487a
                    return r8
                L35:
                    zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment r8 = r7.this$0
                    zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel r8 = zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment.access$getConversationsListScreenViewModel$p(r8)
                    r1 = 0
                    if (r8 != 0) goto L44
                    java.lang.String r8 = "conversationsListScreenViewModel"
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
                    r8 = r1
                L44:
                    zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment r3 = r7.this$0
                    android.content.Context r3 = r3.requireContext()
                    r3.getClass()
                    zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment r4 = r7.this$0
                    zendesk.android.messaging.model.MessagingSettings r4 = r4.getMessagingSettings()
                    zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment r5 = r7.this$0
                    zendesk.android.messaging.model.UserColors r5 = r5.getUserLightColors()
                    zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment r6 = r7.this$0
                    zendesk.android.messaging.model.UserColors r6 = r6.getUserDarkColors()
                    zendesk.messaging.android.internal.model.MessagingTheme r3 = zendesk.messaging.android.internal.extension.ContextKtxKt.getMessagingTheme(r3, r4, r5, r6)
                    r8.refreshTheme$zendesk_messaging_messaging_android(r3)
                    zendesk.messaging.android.internal.VisibleScreenTracker r8 = zendesk.messaging.android.internal.VisibleScreenTracker.INSTANCE
                    r8.clearVisibleScreens$zendesk_messaging_messaging_android()
                    zendesk.messaging.android.internal.VisibleScreen$ConversationListScreen r3 = zendesk.messaging.android.internal.VisibleScreen.ConversationListScreen.INSTANCE
                    r8.setShownScreen$zendesk_messaging_messaging_android(r3)
                    zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment r8 = r7.this$0
                    androidx.lifecycle.Lifecycle r8 = r8.getLifecycle()
                    androidx.lifecycle.Lifecycle$State r8 = r8.b()
                    androidx.lifecycle.Lifecycle$State r3 = androidx.lifecycle.Lifecycle.State.CREATED
                    boolean r8 = r8.a(r3)
                    if (r8 == 0) goto L9d
                    zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment r8 = r7.this$0
                    androidx.lifecycle.LifecycleOwner r8 = r8.getViewLifecycleOwner()
                    r8.getClass()
                    androidx.lifecycle.Lifecycle$State r3 = androidx.lifecycle.Lifecycle.State.STARTED
                    zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment$onViewCreated$1$1$1 r4 = new zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment$onViewCreated$1$1$1
                    zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment r5 = r7.this$0
                    r4.<init>(r5, r1)
                    r7.label = r2
                    java.lang.Object r8 = androidx.lifecycle.x0.b(r8, r3, r4, r7)
                    if (r8 != r0) goto L9d
                L9c:
                    return r0
                L9d:
                    kotlin.Unit r8 = kotlin.Unit.f26487a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment.C04461.C00561.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public C04461(x70.c<? super C04461> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return ConversationListFragment.this.new C04461(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C04461) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                ba0.g.M(obj);
                LifecycleOwner viewLifecycleOwner = ConversationListFragment.this.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                Lifecycle.State state = Lifecycle.State.CREATED;
                C00561 c00561 = new C00561(ConversationListFragment.this, null);
                this.label = 1;
                if (x0.b(viewLifecycleOwner, state, c00561, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ba0.g.M(obj);
            }
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment$setupDependencies$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment", f = "ConversationListFragment.kt", l = {235}, m = "setupDependencies")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C04471 extends z70.c {
        int label;
        /* synthetic */ Object result;

        public C04471(x70.c<? super C04471> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationListFragment.this.setupDependencies(this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment$onBackPressedCallback$1] */
    public ConversationListFragment() {
        super(R.layout.zma_screen_conversations_list);
        this.onBackPressedCallback = new y() { // from class: zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment$onBackPressedCallback$1
            {
                super(true);
            }

            @Override // androidx.activity.y
            public void handleOnBackPressed() {
                if (this.this$0.isInitializationSuccessful) {
                    ConversationsListScreenViewModel conversationsListScreenViewModel = this.this$0.conversationsListScreenViewModel;
                    if (conversationsListScreenViewModel == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("conversationsListScreenViewModel");
                        conversationsListScreenViewModel = null;
                    }
                    conversationsListScreenViewModel.processMessagingClosedEvent();
                }
                setEnabled(false);
                o0 activity = this.this$0.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }
        };
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
            boolean r0 = r5 instanceof zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment$collectStateUpdates$1 r0 = (zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment$collectStateUpdates$1 r0 = new zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment$collectStateUpdates$1
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
            zendesk.messaging.android.internal.conversationslistscreen.ConversationsListScreenViewModel r5 = r4.conversationsListScreenViewModel
            if (r5 != 0) goto L3b
            java.lang.String r5 = "conversationsListScreenViewModel"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
            r5 = 0
        L3b:
            y80.y1 r5 = r5.getConversationsListScreenStateFlow()
            zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment$collectStateUpdates$2 r2 = new zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment$collectStateUpdates$2
            r2.<init>()
            r0.label = r3
            java.lang.Object r5 = r5.collect(r2, r0)
            if (r5 != r1) goto L4d
            return r1
        L4d:
            qc.y.m()
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment.collectStateUpdates(x70.c):java.lang.Object");
    }

    private final void errorHandler() {
        Logger.e("ConversationListFragment", "Unable to show the conversation list without a Messaging instance.", new Object[0]);
        o0 activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    private final void initViewModel(Messaging messaging) {
        if (!(messaging instanceof DefaultMessaging)) {
            errorHandler();
            return;
        }
        ConversationListFragmentComponent.Factory factoryConversationListFragmentComponent = ((DefaultMessaging) messaging).getMessagingComponent().conversationListFragmentComponent();
        o0 o0VarRequireActivity = requireActivity();
        o0VarRequireActivity.getClass();
        factoryConversationListFragmentComponent.create((h) o0VarRequireActivity).inject(this);
        ConversationsListScreenViewModelFactory conversationsListScreenViewModelFactory = getConversationsListScreenViewModelFactory();
        conversationsListScreenViewModelFactory.getClass();
        ViewModelStore viewModelStore = getViewModelStore();
        CreationExtras defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelCreationExtras.getClass();
        a0 a0Var = new a0(viewModelStore, conversationsListScreenViewModelFactory, defaultViewModelCreationExtras);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ConversationsListScreenViewModel.class);
        orCreateKotlinClass.getClass();
        String qualifiedName = orCreateKotlinClass.getQualifiedName();
        if (qualifiedName == null) {
            i4.a.f("Local and anonymous classes can not be ViewModels");
        } else {
            this.conversationsListScreenViewModel = (ConversationsListScreenViewModel) a0Var.M("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), orCreateKotlinClass);
            this.isInitializationSuccessful = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object navigationEvents(x70.c<? super Unit> cVar) {
        ConversationsListScreenViewModel conversationsListScreenViewModel = this.conversationsListScreenViewModel;
        if (conversationsListScreenViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("conversationsListScreenViewModel");
            conversationsListScreenViewModel = null;
        }
        Object objCollect = conversationsListScreenViewModel.getNavigationChannel().collect(new j() { // from class: zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment.navigationEvents.2
            public final Object emit(ConversationsListScreenNavigationEvents conversationsListScreenNavigationEvents, x70.c<? super Unit> cVar2) {
                if (conversationsListScreenNavigationEvents instanceof ConversationsListScreenNavigationEvents.NotificationPermissions) {
                    ConversationListFragment.this.requestNotificationPermission();
                } else {
                    if (!(conversationsListScreenNavigationEvents instanceof ConversationsListScreenNavigationEvents.ConversationScreen)) {
                        e40.a.f();
                        return null;
                    }
                    ConversationListFragment.this.openMessagingScreen(((ConversationsListScreenNavigationEvents.ConversationScreen) conversationsListScreenNavigationEvents).getConversationId());
                }
                return Unit.f26487a;
            }

            @Override // y80.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, x70.c cVar2) {
                return emit((ConversationsListScreenNavigationEvents) obj, (x70.c<? super Unit>) cVar2);
            }
        }, cVar);
        return objCollect == y70.a.COROUTINE_SUSPENDED ? objCollect : Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openMessagingScreen(String conversationId) {
        String string;
        Logger.i("ConversationListFragment", e0.f.k("Showing the Conversation Screen: ", conversationId), new Object[0]);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString(ARG_CREDENTIALS)) == null) {
            return;
        }
        MessagingNavigator.navigateToScreen$default(getMessagingNavigator(), ConversationFragment.Companion.newInstance$default(ConversationFragment.INSTANCE, string, conversationId, null, null, null, 28, null), "ConversationFragment", false, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestNotificationPermission() {
        if (Build.VERSION.SDK_INT >= 33) {
            RuntimePermissionRequester runtimePermissionRequester = this.permissionRequester;
            if (runtimePermissionRequester == null) {
                Intrinsics.throwUninitializedPropertyAccessException("permissionRequester");
                runtimePermissionRequester = null;
            }
            RuntimePermissionRequester.DefaultImpls.launchSinglePermissionRequest$default(runtimePermissionRequester, "android.permission.POST_NOTIFICATIONS", null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object setupDependencies(x70.c<? super kotlin.Unit> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment.C04471
            if (r0 == 0) goto L14
            r0 = r9
            zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment$setupDependencies$1 r0 = (zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment.C04471) r0
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
            zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment$setupDependencies$1 r0 = new zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment$setupDependencies$1
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
            java.lang.String r3 = "ConversationListFragment.ARG_CREDENTIALS"
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
            r8.initViewModel(r9)
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
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment.setupDependencies(x70.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setupPermissionRequester(Context context) {
        if (context instanceof RuntimePermissionRequester) {
            this.permissionRequester = (RuntimePermissionRequester) context;
            return;
        }
        Logger.e("ConversationListFragment", context + " must implement RuntimePermissionRequester", new Object[0]);
    }

    @NotNull
    public final ConversationsListScreenViewModelFactory getConversationsListScreenViewModelFactory() {
        ConversationsListScreenViewModelFactory conversationsListScreenViewModelFactory = this.conversationsListScreenViewModelFactory;
        if (conversationsListScreenViewModelFactory != null) {
            return conversationsListScreenViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("conversationsListScreenViewModelFactory");
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
    public final MessagingNavigator getMessagingNavigator() {
        MessagingNavigator messagingNavigator = this.messagingNavigator;
        if (messagingNavigator != null) {
            return messagingNavigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("messagingNavigator");
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
    public void onAttach(@NotNull Context context) {
        context.getClass();
        super.onAttach(context);
        setupPermissionRequester(context);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        remove();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        VisibleScreenTracker.INSTANCE.setHiddenScreen$zendesk_messaging_messaging_android(VisibleScreen.ConversationListScreen.INSTANCE);
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        view.getClass();
        super.onViewCreated(view, savedInstanceState);
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.onBackPressedCallback, viewLifecycleOwner);
        this.conversationListScreen = (Renderer) view.findViewById(R.id.zma_conversations_list_screen);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        f0.B(m1.c(viewLifecycleOwner2), null, null, new C04461(null), 3);
    }

    public final void setConversationsListScreenViewModelFactory(@NotNull ConversationsListScreenViewModelFactory conversationsListScreenViewModelFactory) {
        conversationsListScreenViewModelFactory.getClass();
        this.conversationsListScreenViewModelFactory = conversationsListScreenViewModelFactory;
    }

    public final void setFeatureFlagManager(@NotNull FeatureFlagManager featureFlagManager) {
        featureFlagManager.getClass();
        this.featureFlagManager = featureFlagManager;
    }

    public final void setMessagingNavigator(@NotNull MessagingNavigator messagingNavigator) {
        messagingNavigator.getClass();
        this.messagingNavigator = messagingNavigator;
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
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lzendesk/messaging/android/internal/conversationslistscreen/ConversationListFragment$Companion;", "", "<init>", "()V", "NAME", "", "ARG_CREDENTIALS", "LOG_TAG", "newInstance", "Lzendesk/messaging/android/internal/conversationslistscreen/ConversationListFragment;", "credentials", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ConversationListFragment newInstance(@NotNull String credentials) {
            credentials.getClass();
            ConversationListFragment conversationListFragment = new ConversationListFragment();
            Bundle bundle = new Bundle();
            bundle.putString(ConversationListFragment.ARG_CREDENTIALS, credentials);
            conversationListFragment.setArguments(bundle);
            return conversationListFragment;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.conversationslistscreen.ConversationListFragment$collectStateUpdates$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass2<T> implements j {
        public AnonymousClass2() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ConversationsListScreenRendering emit$lambda$9(final ConversationsListScreenState conversationsListScreenState, final ConversationListFragment conversationListFragment, ConversationsListScreenRendering conversationsListScreenRendering) {
            conversationsListScreenRendering.getClass();
            final int i11 = 2;
            final int i12 = 0;
            ConversationsListScreenRendering.Builder builderOnBackButtonClicked = conversationsListScreenRendering.toBuilder().state(new Function1() { // from class: zendesk.messaging.android.internal.conversationslistscreen.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i11) {
                        case 0:
                            return ConversationListFragment.AnonymousClass2.emit$lambda$9$lambda$3((ConversationListFragment) conversationsListScreenState, (ConversationEntry.ConversationItem) obj);
                        case 1:
                            return ConversationListFragment.AnonymousClass2.emit$lambda$9$lambda$5((ConversationListFragment) conversationsListScreenState, (ConversationEntry.LoadMore) obj);
                        default:
                            return ConversationListFragment.AnonymousClass2.emit$lambda$9$lambda$0((ConversationsListScreenState) conversationsListScreenState, (ConversationsListScreenState) obj);
                    }
                }
            }).onBackButtonClicked(new Function0() { // from class: zendesk.messaging.android.internal.conversationslistscreen.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i12) {
                        case 0:
                            return ConversationListFragment.AnonymousClass2.emit$lambda$9$lambda$1(conversationListFragment);
                        case 1:
                            return ConversationListFragment.AnonymousClass2.emit$lambda$9$lambda$2(conversationListFragment);
                        case 2:
                            return ConversationListFragment.AnonymousClass2.emit$lambda$9$lambda$4(conversationListFragment);
                        case 3:
                            return ConversationListFragment.AnonymousClass2.emit$lambda$9$lambda$6(conversationListFragment);
                        case 4:
                            return ConversationListFragment.AnonymousClass2.emit$lambda$9$lambda$7(conversationListFragment);
                        default:
                            return ConversationListFragment.AnonymousClass2.emit$lambda$9$lambda$8(conversationListFragment);
                    }
                }
            });
            final int i13 = 1;
            ConversationsListScreenRendering.Builder builderOnCreateConversationClicked = builderOnBackButtonClicked.onCreateConversationClicked(new Function0() { // from class: zendesk.messaging.android.internal.conversationslistscreen.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i13) {
                        case 0:
                            return ConversationListFragment.AnonymousClass2.emit$lambda$9$lambda$1(conversationListFragment);
                        case 1:
                            return ConversationListFragment.AnonymousClass2.emit$lambda$9$lambda$2(conversationListFragment);
                        case 2:
                            return ConversationListFragment.AnonymousClass2.emit$lambda$9$lambda$4(conversationListFragment);
                        case 3:
                            return ConversationListFragment.AnonymousClass2.emit$lambda$9$lambda$6(conversationListFragment);
                        case 4:
                            return ConversationListFragment.AnonymousClass2.emit$lambda$9$lambda$7(conversationListFragment);
                        default:
                            return ConversationListFragment.AnonymousClass2.emit$lambda$9$lambda$8(conversationListFragment);
                    }
                }
            });
            final int i14 = 0;
            ConversationsListScreenRendering.Builder builderOnListConversationClicked = builderOnCreateConversationClicked.onListConversationClicked(new Function1() { // from class: zendesk.messaging.android.internal.conversationslistscreen.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i14) {
                        case 0:
                            return ConversationListFragment.AnonymousClass2.emit$lambda$9$lambda$3((ConversationListFragment) conversationListFragment, (ConversationEntry.ConversationItem) obj);
                        case 1:
                            return ConversationListFragment.AnonymousClass2.emit$lambda$9$lambda$5((ConversationListFragment) conversationListFragment, (ConversationEntry.LoadMore) obj);
                        default:
                            return ConversationListFragment.AnonymousClass2.emit$lambda$9$lambda$0((ConversationsListScreenState) conversationListFragment, (ConversationsListScreenState) obj);
                    }
                }
            });
            final int i15 = 2;
            ConversationsListScreenRendering.Builder builderOnRetryButtonClicked = builderOnListConversationClicked.onRetryButtonClicked(new Function0() { // from class: zendesk.messaging.android.internal.conversationslistscreen.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i15) {
                        case 0:
                            return ConversationListFragment.AnonymousClass2.emit$lambda$9$lambda$1(conversationListFragment);
                        case 1:
                            return ConversationListFragment.AnonymousClass2.emit$lambda$9$lambda$2(conversationListFragment);
                        case 2:
                            return ConversationListFragment.AnonymousClass2.emit$lambda$9$lambda$4(conversationListFragment);
                        case 3:
                            return ConversationListFragment.AnonymousClass2.emit$lambda$9$lambda$6(conversationListFragment);
                        case 4:
                            return ConversationListFragment.AnonymousClass2.emit$lambda$9$lambda$7(conversationListFragment);
                        default:
                            return ConversationListFragment.AnonymousClass2.emit$lambda$9$lambda$8(conversationListFragment);
                    }
                }
            });
            final int i16 = 1;
            ConversationsListScreenRendering.Builder builderOnRetryPaginationClicked = builderOnRetryButtonClicked.onRetryPaginationClicked(new Function1() { // from class: zendesk.messaging.android.internal.conversationslistscreen.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i16) {
                        case 0:
                            return ConversationListFragment.AnonymousClass2.emit$lambda$9$lambda$3((ConversationListFragment) conversationListFragment, (ConversationEntry.ConversationItem) obj);
                        case 1:
                            return ConversationListFragment.AnonymousClass2.emit$lambda$9$lambda$5((ConversationListFragment) conversationListFragment, (ConversationEntry.LoadMore) obj);
                        default:
                            return ConversationListFragment.AnonymousClass2.emit$lambda$9$lambda$0((ConversationsListScreenState) conversationListFragment, (ConversationsListScreenState) obj);
                    }
                }
            });
            final int i17 = 3;
            ConversationsListScreenRendering.Builder builderOnStartPaging = builderOnRetryPaginationClicked.onStartPaging(new Function0() { // from class: zendesk.messaging.android.internal.conversationslistscreen.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i17) {
                        case 0:
                            return ConversationListFragment.AnonymousClass2.emit$lambda$9$lambda$1(conversationListFragment);
                        case 1:
                            return ConversationListFragment.AnonymousClass2.emit$lambda$9$lambda$2(conversationListFragment);
                        case 2:
                            return ConversationListFragment.AnonymousClass2.emit$lambda$9$lambda$4(conversationListFragment);
                        case 3:
                            return ConversationListFragment.AnonymousClass2.emit$lambda$9$lambda$6(conversationListFragment);
                        case 4:
                            return ConversationListFragment.AnonymousClass2.emit$lambda$9$lambda$7(conversationListFragment);
                        default:
                            return ConversationListFragment.AnonymousClass2.emit$lambda$9$lambda$8(conversationListFragment);
                    }
                }
            });
            final int i18 = 4;
            ConversationsListScreenRendering.Builder builderOnDismissCreateConversationError = builderOnStartPaging.onDismissCreateConversationError(new Function0() { // from class: zendesk.messaging.android.internal.conversationslistscreen.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i18) {
                        case 0:
                            return ConversationListFragment.AnonymousClass2.emit$lambda$9$lambda$1(conversationListFragment);
                        case 1:
                            return ConversationListFragment.AnonymousClass2.emit$lambda$9$lambda$2(conversationListFragment);
                        case 2:
                            return ConversationListFragment.AnonymousClass2.emit$lambda$9$lambda$4(conversationListFragment);
                        case 3:
                            return ConversationListFragment.AnonymousClass2.emit$lambda$9$lambda$6(conversationListFragment);
                        case 4:
                            return ConversationListFragment.AnonymousClass2.emit$lambda$9$lambda$7(conversationListFragment);
                        default:
                            return ConversationListFragment.AnonymousClass2.emit$lambda$9$lambda$8(conversationListFragment);
                    }
                }
            });
            final int i19 = 5;
            return builderOnDismissCreateConversationError.onMessageReceivedAuthorAnnounced(new Function0() { // from class: zendesk.messaging.android.internal.conversationslistscreen.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i19) {
                        case 0:
                            return ConversationListFragment.AnonymousClass2.emit$lambda$9$lambda$1(conversationListFragment);
                        case 1:
                            return ConversationListFragment.AnonymousClass2.emit$lambda$9$lambda$2(conversationListFragment);
                        case 2:
                            return ConversationListFragment.AnonymousClass2.emit$lambda$9$lambda$4(conversationListFragment);
                        case 3:
                            return ConversationListFragment.AnonymousClass2.emit$lambda$9$lambda$6(conversationListFragment);
                        case 4:
                            return ConversationListFragment.AnonymousClass2.emit$lambda$9$lambda$7(conversationListFragment);
                        default:
                            return ConversationListFragment.AnonymousClass2.emit$lambda$9$lambda$8(conversationListFragment);
                    }
                }
            }).build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ConversationsListScreenState emit$lambda$9$lambda$0(ConversationsListScreenState conversationsListScreenState, ConversationsListScreenState conversationsListScreenState2) {
            conversationsListScreenState2.getClass();
            return conversationsListScreenState.copy((Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 1) != 0 ? conversationsListScreenState.messagingTheme : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 2) != 0 ? conversationsListScreenState.title : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 4) != 0 ? conversationsListScreenState.description : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 8) != 0 ? conversationsListScreenState.logoUrl : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 16) != 0 ? conversationsListScreenState.isMultiConvoEnabled : false, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 32) != 0 ? conversationsListScreenState.canUserCreateMoreConversations : false, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 64) != 0 ? conversationsListScreenState.conversations : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 128) != 0 ? conversationsListScreenState.connectionStatus : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 256) != 0 ? conversationsListScreenState.showDeniedPermission : false, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 512) != 0 ? conversationsListScreenState.createConversationState : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 1024) != 0 ? conversationsListScreenState.conversationsListState : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & NewHope.SENDB_BYTES) != 0 ? conversationsListScreenState.shouldLoadMore : false, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 4096) != 0 ? conversationsListScreenState.currentPaginationOffset : 0, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 8192) != 0 ? conversationsListScreenState.loadMoreStatus : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? conversationsListScreenState.receivedMessageAuthor : null, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH & 32768) != 0 ? conversationsListScreenState.receivedMessageUnreadCount : 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit emit$lambda$9$lambda$1(ConversationListFragment conversationListFragment) {
            conversationListFragment.requireActivity().getOnBackPressedDispatcher().d();
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit emit$lambda$9$lambda$2(ConversationListFragment conversationListFragment) {
            ConversationsListScreenViewModel conversationsListScreenViewModel = conversationListFragment.conversationsListScreenViewModel;
            if (conversationsListScreenViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("conversationsListScreenViewModel");
                conversationsListScreenViewModel = null;
            }
            conversationsListScreenViewModel.dispatchAction(ConversationsListScreenActions.CreateConversation.INSTANCE);
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit emit$lambda$9$lambda$3(ConversationListFragment conversationListFragment, ConversationEntry.ConversationItem conversationItem) {
            conversationItem.getClass();
            ConversationsListScreenViewModel conversationsListScreenViewModel = conversationListFragment.conversationsListScreenViewModel;
            if (conversationsListScreenViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("conversationsListScreenViewModel");
                conversationsListScreenViewModel = null;
            }
            conversationsListScreenViewModel.dispatchAction(ConversationsListScreenActions.OpenConversation.INSTANCE);
            conversationListFragment.openMessagingScreen(conversationItem.getId());
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit emit$lambda$9$lambda$4(ConversationListFragment conversationListFragment) {
            ConversationsListScreenViewModel conversationsListScreenViewModel = conversationListFragment.conversationsListScreenViewModel;
            if (conversationsListScreenViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("conversationsListScreenViewModel");
                conversationsListScreenViewModel = null;
            }
            conversationsListScreenViewModel.dispatchAction(ConversationsListScreenActions.Retry.INSTANCE);
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit emit$lambda$9$lambda$5(ConversationListFragment conversationListFragment, ConversationEntry.LoadMore loadMore) {
            loadMore.getClass();
            ConversationsListScreenViewModel conversationsListScreenViewModel = conversationListFragment.conversationsListScreenViewModel;
            ConversationsListScreenViewModel conversationsListScreenViewModel2 = null;
            if (conversationsListScreenViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("conversationsListScreenViewModel");
                conversationsListScreenViewModel = null;
            }
            conversationsListScreenViewModel.dispatchAction(ConversationsListScreenActions.ResetLoadMoreStatus.INSTANCE);
            ConversationsListScreenViewModel conversationsListScreenViewModel3 = conversationListFragment.conversationsListScreenViewModel;
            if (conversationsListScreenViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("conversationsListScreenViewModel");
            } else {
                conversationsListScreenViewModel2 = conversationsListScreenViewModel3;
            }
            conversationsListScreenViewModel2.dispatchAction(ConversationsListScreenActions.LoadConversations.INSTANCE);
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit emit$lambda$9$lambda$6(ConversationListFragment conversationListFragment) {
            ConversationsListScreenViewModel conversationsListScreenViewModel = conversationListFragment.conversationsListScreenViewModel;
            if (conversationsListScreenViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("conversationsListScreenViewModel");
                conversationsListScreenViewModel = null;
            }
            conversationsListScreenViewModel.dispatchAction(ConversationsListScreenActions.LoadConversations.INSTANCE);
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit emit$lambda$9$lambda$7(ConversationListFragment conversationListFragment) {
            ConversationsListScreenViewModel conversationsListScreenViewModel = conversationListFragment.conversationsListScreenViewModel;
            if (conversationsListScreenViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("conversationsListScreenViewModel");
                conversationsListScreenViewModel = null;
            }
            conversationsListScreenViewModel.dispatchAction(ConversationsListScreenActions.DismissCreateConversationError.INSTANCE);
            return Unit.f26487a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit emit$lambda$9$lambda$8(ConversationListFragment conversationListFragment) {
            ConversationsListScreenViewModel conversationsListScreenViewModel = conversationListFragment.conversationsListScreenViewModel;
            if (conversationsListScreenViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("conversationsListScreenViewModel");
                conversationsListScreenViewModel = null;
            }
            conversationsListScreenViewModel.dispatchAction(ConversationsListScreenActions.ResetReceivedMessageAuthor.INSTANCE);
            return Unit.f26487a;
        }

        public final Object emit(ConversationsListScreenState conversationsListScreenState, x70.c<? super Unit> cVar) {
            Renderer renderer = ConversationListFragment.this.conversationListScreen;
            if (renderer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("conversationListScreen");
                renderer = null;
            }
            renderer.render(new a(0, conversationsListScreenState, ConversationListFragment.this));
            return Unit.f26487a;
        }

        @Override // y80.j
        public /* bridge */ /* synthetic */ Object emit(Object obj, x70.c cVar) {
            return emit((ConversationsListScreenState) obj, (x70.c<? super Unit>) cVar);
        }
    }

    public static /* synthetic */ void getUserDarkColors$annotations() {
    }

    public static /* synthetic */ void getUserLightColors$annotations() {
    }
}
