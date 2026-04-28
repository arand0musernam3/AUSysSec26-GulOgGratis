package zendesk.messaging.android.internal.messagingscreen;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.m1;
import androidx.lifecycle.viewmodel.CreationExtras;
import ba0.g;
import com.braze.h2;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.firebase.messaging.a0;
import i20.b;
import k.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t1.h1;
import v80.b0;
import v80.f0;
import v80.i1;
import z70.c;
import z70.e;
import z70.i;
import zendesk.android.messaging.Messaging;
import zendesk.android.messaging.model.MessagingSettings;
import zendesk.android.messaging.model.UserColors;
import zendesk.logger.Logger;
import zendesk.messaging.R;
import zendesk.messaging.android.internal.DefaultMessaging;
import zendesk.messaging.android.internal.analytics.AnalyticsProcessor;
import zendesk.messaging.android.internal.di.MessagingComponentKt;
import zendesk.messaging.android.internal.extension.ContextKtxKt;
import zendesk.messaging.android.internal.messagingscreen.MessagingScreenAction;
import zendesk.messaging.android.internal.model.MessagingTheme;
import zendesk.messaging.android.internal.permissions.RuntimePermissionLauncher;
import zendesk.messaging.android.internal.permissions.RuntimePermissionRequester;
import zendesk.ui.android.common.retryerror.RetryErrorRendering;
import zendesk.ui.android.common.retryerror.RetryErrorState;
import zendesk.ui.android.common.retryerror.RetryErrorView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 a2\u00020\u00012\u00020\u0002:\u0001aB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0015¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0004J\u0010\u0010\u0018\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001d\u0010\u0004J\u000f\u0010\u001e\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010\u0004J\u000f\u0010!\u001a\u00020\u0007H\u0002¢\u0006\u0004\b!\u0010\u0004J\u000f\u0010\"\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\"\u0010\u0004J\u000f\u0010#\u001a\u00020\u0007H\u0002¢\u0006\u0004\b#\u0010\u0004J\u000f\u0010$\u001a\u00020\u0007H\u0002¢\u0006\u0004\b$\u0010\u0004R\"\u0010&\u001a\u00020%8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R(\u0010-\u001a\u00020,8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b-\u0010.\u0012\u0004\b3\u0010\u0004\u001a\u0004\b/\u00100\"\u0004\b1\u00102R(\u00104\u001a\u00020,8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b4\u0010.\u0012\u0004\b7\u0010\u0004\u001a\u0004\b5\u00100\"\u0004\b6\u00102R\"\u00109\u001a\u0002088\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010@\u001a\u00020?8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0016\u0010G\u001a\u00020F8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010J\u001a\u00020I8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010M\u001a\u00020L8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010P\u001a\u00020O8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010S\u001a\u00020R8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010V\u001a\u00020U8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010Y\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010[\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R*\u0010_\u001a\u0018\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u00020]0\u0010j\b\u0012\u0004\u0012\u00020]`^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`¨\u0006b"}, d2 = {"Lzendesk/messaging/android/internal/messagingscreen/MessagingActivity;", "Lk/h;", "Lzendesk/messaging/android/internal/permissions/RuntimePermissionRequester;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "", "permission", "Lkotlin/Function1;", "", "onPermissionResult", "launchSinglePermissionRequest", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "collectStateUpdates", "(Lx70/c;)Ljava/lang/Object;", "setupMessagingTheme", "setupDependencies", "Lzendesk/android/messaging/Messaging;", AnalyticsProcessor.CHANNEL, "initViewModel", "(Lzendesk/android/messaging/Messaging;)V", "errorHandler", "isFragmentContainerEmpty", "()Z", "showCircularProgressBarIndicator", "hideCircularProgressBarIndicator", "hideRetryErrorViewIfNeeded", "showRetryErrorView", "setupPermissionLauncher", "Lzendesk/android/messaging/model/MessagingSettings;", "messagingSettings", "Lzendesk/android/messaging/model/MessagingSettings;", "getMessagingSettings", "()Lzendesk/android/messaging/model/MessagingSettings;", "setMessagingSettings", "(Lzendesk/android/messaging/model/MessagingSettings;)V", "Lzendesk/android/messaging/model/UserColors;", MessagingComponentKt.USER_DARK_COLORS, "Lzendesk/android/messaging/model/UserColors;", "getUserDarkColors", "()Lzendesk/android/messaging/model/UserColors;", "setUserDarkColors", "(Lzendesk/android/messaging/model/UserColors;)V", "getUserDarkColors$annotations", MessagingComponentKt.USER_LIGHT_COLORS, "getUserLightColors", "setUserLightColors", "getUserLightColors$annotations", "Lzendesk/messaging/android/internal/messagingscreen/MessagingScreenViewModelFactory;", "messagingScreenViewModelFactory", "Lzendesk/messaging/android/internal/messagingscreen/MessagingScreenViewModelFactory;", "getMessagingScreenViewModelFactory", "()Lzendesk/messaging/android/internal/messagingscreen/MessagingScreenViewModelFactory;", "setMessagingScreenViewModelFactory", "(Lzendesk/messaging/android/internal/messagingscreen/MessagingScreenViewModelFactory;)V", "Lzendesk/messaging/android/internal/messagingscreen/MessagingNavigator;", "messagingNavigator", "Lzendesk/messaging/android/internal/messagingscreen/MessagingNavigator;", "getMessagingNavigator", "()Lzendesk/messaging/android/internal/messagingscreen/MessagingNavigator;", "setMessagingNavigator", "(Lzendesk/messaging/android/internal/messagingscreen/MessagingNavigator;)V", "Lzendesk/messaging/android/internal/messagingscreen/MessagingScreenViewModel;", "messagingScreenViewModel", "Lzendesk/messaging/android/internal/messagingscreen/MessagingScreenViewModel;", "Lcom/google/android/material/progressindicator/CircularProgressIndicator;", "circularProgressIndicator", "Lcom/google/android/material/progressindicator/CircularProgressIndicator;", "Lzendesk/ui/android/common/retryerror/RetryErrorView;", "retryErrorView", "Lzendesk/ui/android/common/retryerror/RetryErrorView;", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "messagingTheme", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "Landroidx/fragment/app/FragmentContainerView;", "fragmentContainerView", "Landroidx/fragment/app/FragmentContainerView;", "Lzendesk/messaging/android/internal/permissions/RuntimePermissionLauncher;", "permissionLauncher", "Lzendesk/messaging/android/internal/permissions/RuntimePermissionLauncher;", "Lv80/i1;", "initializationJob", "Lv80/i1;", "isInitializationSuccessful", "Z", "Lzendesk/ui/android/common/retryerror/RetryErrorRendering;", "Lzendesk/messaging/android/internal/conversationscreen/RenderingUpdate;", "retryErrorViewRendering", "Lkotlin/jvm/functions/Function1;", "Companion", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMessagingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessagingActivity.kt\nzendesk/messaging/android/internal/messagingscreen/MessagingActivity\n+ 2 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,285:1\n48#2:286\n255#3:287\n257#3,2:288\n257#3,2:290\n*S KotlinDebug\n*F\n+ 1 MessagingActivity.kt\nzendesk/messaging/android/internal/messagingscreen/MessagingActivity\n*L\n212#1:286\n225#1:287\n226#1:288,2\n232#1:290,2\n*E\n"})
public final class MessagingActivity extends h implements RuntimePermissionRequester {

    @NotNull
    public static final String CONVERSATION_ID_KEY = "CONVERSATION_ID";

    @NotNull
    public static final String MESSAGING_SCREEN_KEY = "MESSAGING_SCREEN";

    @NotNull
    public static final String TAG = "MessagingActivity";
    private CircularProgressIndicator circularProgressIndicator;
    private FragmentContainerView fragmentContainerView;

    @Nullable
    private i1 initializationJob;
    private boolean isInitializationSuccessful;
    public MessagingNavigator messagingNavigator;
    private MessagingScreenViewModel messagingScreenViewModel;
    public MessagingScreenViewModelFactory messagingScreenViewModelFactory;
    public MessagingSettings messagingSettings;
    private MessagingTheme messagingTheme;
    private RuntimePermissionLauncher permissionLauncher;
    private RetryErrorView retryErrorView;

    @NotNull
    private final Function1<RetryErrorRendering, RetryErrorRendering> retryErrorViewRendering = new a(this, 0);
    public UserColors userDarkColors;
    public UserColors userLightColors;

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.messagingscreen.MessagingActivity$collectStateUpdates$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.messagingscreen.MessagingActivity", f = "MessagingActivity.kt", l = {119}, m = "collectStateUpdates")
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
            return MessagingActivity.this.collectStateUpdates(this);
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.messagingscreen.MessagingActivity$onCreate$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.messagingscreen.MessagingActivity$onCreate$1", f = "MessagingActivity.kt", l = {83, 90}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C04591 extends i implements Function2<b0, x70.c<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: zendesk.messaging.android.internal.messagingscreen.MessagingActivity$onCreate$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @e(c = "zendesk.messaging.android.internal.messagingscreen.MessagingActivity$onCreate$1$1", f = "MessagingActivity.kt", l = {82}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
        public static final class C00591 extends i implements Function2<b0, x70.c<? super Unit>, Object> {
            int label;
            final /* synthetic */ MessagingActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00591(MessagingActivity messagingActivity, x70.c<? super C00591> cVar) {
                super(2, cVar);
                this.this$0 = messagingActivity;
            }

            @Override // z70.a
            public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
                return new C00591(this.this$0, cVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
                return ((C00591) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
            }

            @Override // z70.a
            public final Object invokeSuspend(Object obj) {
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    g.M(obj);
                    MessagingActivity messagingActivity = this.this$0;
                    this.label = 1;
                    if (messagingActivity.setupDependencies(this) == aVar) {
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

        /* JADX INFO: renamed from: zendesk.messaging.android.internal.messagingscreen.MessagingActivity$onCreate$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @e(c = "zendesk.messaging.android.internal.messagingscreen.MessagingActivity$onCreate$1$2", f = "MessagingActivity.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
        public static final class AnonymousClass2 extends i implements Function2<b0, x70.c<? super Unit>, Object> {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ MessagingActivity this$0;

            /* JADX INFO: renamed from: zendesk.messaging.android.internal.messagingscreen.MessagingActivity$onCreate$1$2$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
            @e(c = "zendesk.messaging.android.internal.messagingscreen.MessagingActivity$onCreate$1$2$1", f = "MessagingActivity.kt", l = {91}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
            public static final class C00601 extends i implements Function2<b0, x70.c<? super Unit>, Object> {
                int label;
                final /* synthetic */ MessagingActivity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00601(MessagingActivity messagingActivity, x70.c<? super C00601> cVar) {
                    super(2, cVar);
                    this.this$0 = messagingActivity;
                }

                @Override // z70.a
                public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
                    return new C00601(this.this$0, cVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
                    return ((C00601) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
                }

                @Override // z70.a
                public final Object invokeSuspend(Object obj) {
                    y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                    int i11 = this.label;
                    if (i11 == 0) {
                        g.M(obj);
                        MessagingActivity messagingActivity = this.this$0;
                        this.label = 1;
                        if (messagingActivity.collectStateUpdates(this) == aVar) {
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
            public AnonymousClass2(MessagingActivity messagingActivity, x70.c<? super AnonymousClass2> cVar) {
                super(2, cVar);
                this.this$0 = messagingActivity;
            }

            @Override // z70.a
            public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, cVar);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
                return ((AnonymousClass2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
            }

            @Override // z70.a
            public final Object invokeSuspend(Object obj) {
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
                f0.B((b0) this.L$0, null, null, new C00601(this.this$0, null), 3);
                return Unit.f26487a;
            }
        }

        public C04591(x70.c<? super C04591> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            C04591 c04591 = MessagingActivity.this.new C04591(cVar);
            c04591.L$0 = obj;
            return c04591;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C04591) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
        
            if (androidx.lifecycle.x0.b(r8, r1, r4, r7) == r0) goto L21;
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
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1c
                if (r1 == r4) goto L18
                if (r1 != r3) goto L11
                ba0.g.M(r8)
                goto L65
            L11:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                com.braze.h2.b(r8)
                r8 = 0
                return r8
            L18:
                ba0.g.M(r8)
                goto L43
            L1c:
                ba0.g.M(r8)
                java.lang.Object r8 = r7.L$0
                v80.b0 r8 = (v80.b0) r8
                zendesk.messaging.android.internal.messagingscreen.MessagingActivity r1 = zendesk.messaging.android.internal.messagingscreen.MessagingActivity.this
                zendesk.messaging.android.internal.messagingscreen.MessagingActivity$onCreate$1$1 r5 = new zendesk.messaging.android.internal.messagingscreen.MessagingActivity$onCreate$1$1
                r5.<init>(r1, r2)
                r6 = 3
                v80.b2 r8 = v80.f0.B(r8, r2, r2, r5, r6)
                zendesk.messaging.android.internal.messagingscreen.MessagingActivity.access$setInitializationJob$p(r1, r8)
                zendesk.messaging.android.internal.messagingscreen.MessagingActivity r8 = zendesk.messaging.android.internal.messagingscreen.MessagingActivity.this
                v80.i1 r8 = zendesk.messaging.android.internal.messagingscreen.MessagingActivity.access$getInitializationJob$p(r8)
                if (r8 == 0) goto L43
                r7.label = r4
                java.lang.Object r8 = r8.B(r7)
                if (r8 != r0) goto L43
                goto L64
            L43:
                zendesk.messaging.android.internal.messagingscreen.MessagingActivity r8 = zendesk.messaging.android.internal.messagingscreen.MessagingActivity.this
                boolean r8 = zendesk.messaging.android.internal.messagingscreen.MessagingActivity.access$isInitializationSuccessful$p(r8)
                if (r8 != 0) goto L4e
                kotlin.Unit r8 = kotlin.Unit.f26487a
                return r8
            L4e:
                zendesk.messaging.android.internal.messagingscreen.MessagingActivity r8 = zendesk.messaging.android.internal.messagingscreen.MessagingActivity.this
                zendesk.messaging.android.internal.messagingscreen.MessagingActivity.access$setupMessagingTheme(r8)
                zendesk.messaging.android.internal.messagingscreen.MessagingActivity r8 = zendesk.messaging.android.internal.messagingscreen.MessagingActivity.this
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED
                zendesk.messaging.android.internal.messagingscreen.MessagingActivity$onCreate$1$2 r4 = new zendesk.messaging.android.internal.messagingscreen.MessagingActivity$onCreate$1$2
                r4.<init>(r8, r2)
                r7.label = r3
                java.lang.Object r8 = androidx.lifecycle.x0.b(r8, r1, r4, r7)
                if (r8 != r0) goto L65
            L64:
                return r0
            L65:
                kotlin.Unit r8 = kotlin.Unit.f26487a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.messagingscreen.MessagingActivity.C04591.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.messagingscreen.MessagingActivity$onNewIntent$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.messagingscreen.MessagingActivity$onNewIntent$1", f = "MessagingActivity.kt", l = {102}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C04601 extends i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ String $conversationId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04601(String str, x70.c<? super C04601> cVar) {
            super(2, cVar);
            this.$conversationId = str;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return MessagingActivity.this.new C04601(this.$conversationId, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C04601) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                i1 i1Var = MessagingActivity.this.initializationJob;
                if (i1Var != null) {
                    this.label = 1;
                    if (i1Var.B(this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            if (MessagingActivity.this.messagingScreenViewModel != null) {
                MessagingScreenViewModel messagingScreenViewModel = MessagingActivity.this.messagingScreenViewModel;
                if (messagingScreenViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("messagingScreenViewModel");
                    messagingScreenViewModel = null;
                }
                messagingScreenViewModel.process(new MessagingScreenAction.LaunchConversationScreenFromNotification(this.$conversationId, null, 2, null));
            }
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.messagingscreen.MessagingActivity$setupDependencies$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.messagingscreen.MessagingActivity", f = "MessagingActivity.kt", l = {169}, m = "setupDependencies")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C04611 extends c {
        int label;
        /* synthetic */ Object result;

        public C04611(x70.c<? super C04611> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MessagingActivity.this.setupDependencies(this);
        }
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
            boolean r0 = r5 instanceof zendesk.messaging.android.internal.messagingscreen.MessagingActivity.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            zendesk.messaging.android.internal.messagingscreen.MessagingActivity$collectStateUpdates$1 r0 = (zendesk.messaging.android.internal.messagingscreen.MessagingActivity.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.messaging.android.internal.messagingscreen.MessagingActivity$collectStateUpdates$1 r0 = new zendesk.messaging.android.internal.messagingscreen.MessagingActivity$collectStateUpdates$1
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
            zendesk.messaging.android.internal.messagingscreen.MessagingScreenViewModel r5 = r4.messagingScreenViewModel
            if (r5 != 0) goto L3b
            java.lang.String r5 = "messagingScreenViewModel"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
            r5 = 0
        L3b:
            y80.y1 r5 = r5.getMessagingScreenState()
            zendesk.messaging.android.internal.messagingscreen.MessagingActivity$collectStateUpdates$2 r2 = new zendesk.messaging.android.internal.messagingscreen.MessagingActivity$collectStateUpdates$2
            r2.<init>()
            r0.label = r3
            java.lang.Object r5 = r5.collect(r2, r0)
            if (r5 != r1) goto L4d
            return r1
        L4d:
            qc.y.m()
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.messagingscreen.MessagingActivity.collectStateUpdates(x70.c):java.lang.Object");
    }

    private final void errorHandler() {
        Logger.e(TAG, "Unable to start the messaging screen without a Messaging instance.", new Object[0]);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideCircularProgressBarIndicator() {
        CircularProgressIndicator circularProgressIndicator = this.circularProgressIndicator;
        if (circularProgressIndicator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("circularProgressIndicator");
            circularProgressIndicator = null;
        }
        b bVar = circularProgressIndicator.f22950m;
        if (circularProgressIndicator.getVisibility() != 0) {
            circularProgressIndicator.removeCallbacks(circularProgressIndicator.l);
            return;
        }
        circularProgressIndicator.removeCallbacks(bVar);
        long jUptimeMillis = SystemClock.uptimeMillis() - circularProgressIndicator.f22945g;
        long j9 = circularProgressIndicator.f22944f;
        if (jUptimeMillis >= j9) {
            bVar.run();
        } else {
            circularProgressIndicator.postDelayed(bVar, j9 - jUptimeMillis);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideRetryErrorViewIfNeeded() {
        RetryErrorView retryErrorView = this.retryErrorView;
        RetryErrorView retryErrorView2 = null;
        if (retryErrorView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("retryErrorView");
            retryErrorView = null;
        }
        if (retryErrorView.getVisibility() == 0) {
            RetryErrorView retryErrorView3 = this.retryErrorView;
            if (retryErrorView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("retryErrorView");
            } else {
                retryErrorView2 = retryErrorView3;
            }
            retryErrorView2.setVisibility(8);
        }
    }

    private final void initViewModel(Messaging messaging) {
        if (!(messaging instanceof DefaultMessaging)) {
            errorHandler();
            return;
        }
        ((DefaultMessaging) messaging).getMessagingComponent().messagingActivityComponent().create(this, this, getIntent().getExtras()).inject(this);
        MessagingScreenViewModelFactory messagingScreenViewModelFactory = getMessagingScreenViewModelFactory();
        messagingScreenViewModelFactory.getClass();
        ViewModelStore viewModelStore = getViewModelStore();
        CreationExtras defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelCreationExtras.getClass();
        a0 a0Var = new a0(viewModelStore, messagingScreenViewModelFactory, defaultViewModelCreationExtras);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MessagingScreenViewModel.class);
        orCreateKotlinClass.getClass();
        String qualifiedName = orCreateKotlinClass.getQualifiedName();
        if (qualifiedName == null) {
            i4.a.f("Local and anonymous classes can not be ViewModels");
        } else {
            this.messagingScreenViewModel = (MessagingScreenViewModel) a0Var.M("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), orCreateKotlinClass);
            this.isInitializationSuccessful = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isFragmentContainerEmpty() {
        FragmentContainerView fragmentContainerView = this.fragmentContainerView;
        if (fragmentContainerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragmentContainerView");
            fragmentContainerView = null;
        }
        return fragmentContainerView.getChildCount() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchSinglePermissionRequest$lambda$4(Function1 function1, boolean z11) {
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z11));
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RetryErrorRendering retryErrorViewRendering$lambda$3(MessagingActivity messagingActivity, RetryErrorRendering retryErrorRendering) {
        retryErrorRendering.getClass();
        return retryErrorRendering.toBuilder().state(new a(messagingActivity, 1)).onButtonClicked(new y.a(messagingActivity, 22)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RetryErrorState retryErrorViewRendering$lambda$3$lambda$1(MessagingActivity messagingActivity, RetryErrorState retryErrorState) {
        retryErrorState.getClass();
        MessagingTheme messagingTheme = messagingActivity.messagingTheme;
        MessagingTheme messagingTheme2 = null;
        if (messagingTheme == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messagingTheme");
            messagingTheme = null;
        }
        int onBackgroundColor = messagingTheme.getOnBackgroundColor();
        String string = messagingActivity.getString(R.string.zuia_conversation_message_label_tap_to_retry);
        string.getClass();
        MessagingTheme messagingTheme3 = messagingActivity.messagingTheme;
        if (messagingTheme3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messagingTheme");
        } else {
            messagingTheme2 = messagingTheme3;
        }
        int onBackgroundColor2 = messagingTheme2.getOnBackgroundColor();
        String string2 = messagingActivity.getString(R.string.zuia_conversations_list_tap_to_retry_message_label);
        string2.getClass();
        return retryErrorState.copy(string2, onBackgroundColor2, string, onBackgroundColor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit retryErrorViewRendering$lambda$3$lambda$2(MessagingActivity messagingActivity) {
        MessagingScreenViewModel messagingScreenViewModel = messagingActivity.messagingScreenViewModel;
        if (messagingScreenViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messagingScreenViewModel");
            messagingScreenViewModel = null;
        }
        messagingScreenViewModel.process(MessagingScreenAction.ResolveScreen.INSTANCE);
        return Unit.f26487a;
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
            boolean r0 = r9 instanceof zendesk.messaging.android.internal.messagingscreen.MessagingActivity.C04611
            if (r0 == 0) goto L14
            r0 = r9
            zendesk.messaging.android.internal.messagingscreen.MessagingActivity$setupDependencies$1 r0 = (zendesk.messaging.android.internal.messagingscreen.MessagingActivity.C04611) r0
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
            zendesk.messaging.android.internal.messagingscreen.MessagingActivity$setupDependencies$1 r0 = new zendesk.messaging.android.internal.messagingscreen.MessagingActivity$setupDependencies$1
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r5.result
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L2a
            ba0.g.M(r9)
            r2 = r8
            goto L56
        L2a:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r9)
        L2f:
            r9 = 0
            return r9
        L31:
            ba0.g.M(r9)
            zendesk.android.ZendeskCredentials$Companion r9 = zendesk.android.ZendeskCredentials.INSTANCE
            android.content.Intent r1 = r8.getIntent()
            r1.getClass()
            java.lang.String r1 = zendesk.messaging.android.internal.messagingscreen.MessagingActivityIntentBuilderKt.getCredentials(r1)
            zendesk.android.ZendeskCredentials r3 = r9.fromQuery(r1)
            if (r3 == 0) goto L74
            zendesk.android.Zendesk$Companion r1 = zendesk.android.Zendesk.INSTANCE
            r5.label = r2
            r4 = 0
            r6 = 4
            r7 = 0
            r2 = r8
            java.lang.Object r9 = zendesk.messaging.android.internal.extension.ZendeskKtxKt.messaging$default(r1, r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto L56
            return r0
        L56:
            zendesk.android.ZendeskResult r9 = (zendesk.android.ZendeskResult) r9
            boolean r0 = r9 instanceof zendesk.android.ZendeskResult.Failure
            if (r0 == 0) goto L60
            r8.errorHandler()
            goto L78
        L60:
            boolean r0 = r9 instanceof zendesk.android.ZendeskResult.Success
            if (r0 == 0) goto L70
            zendesk.android.ZendeskResult$Success r9 = (zendesk.android.ZendeskResult.Success) r9
            java.lang.Object r9 = r9.getValue()
            zendesk.android.messaging.Messaging r9 = (zendesk.android.messaging.Messaging) r9
            r8.initViewModel(r9)
            goto L78
        L70:
            e40.a.f()
            goto L2f
        L74:
            r2 = r8
            r8.errorHandler()
        L78:
            kotlin.Unit r9 = kotlin.Unit.f26487a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.messagingscreen.MessagingActivity.setupDependencies(x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupMessagingTheme() {
        this.messagingTheme = ContextKtxKt.getMessagingTheme(this, getMessagingSettings(), getUserLightColors(), getUserDarkColors());
    }

    private final void setupPermissionLauncher() {
        RuntimePermissionLauncher runtimePermissionLauncher = new RuntimePermissionLauncher(getActivityResultRegistry(), this);
        this.permissionLauncher = runtimePermissionLauncher;
        getLifecycle().a(runtimePermissionLauncher);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showCircularProgressBarIndicator() {
        if (isFragmentContainerEmpty()) {
            CircularProgressIndicator circularProgressIndicator = this.circularProgressIndicator;
            if (circularProgressIndicator == null) {
                Intrinsics.throwUninitializedPropertyAccessException("circularProgressIndicator");
                circularProgressIndicator = null;
            }
            int i11 = circularProgressIndicator.f22943e;
            b bVar = circularProgressIndicator.l;
            if (i11 <= 0) {
                bVar.run();
            } else {
                circularProgressIndicator.removeCallbacks(bVar);
                circularProgressIndicator.postDelayed(bVar, i11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showRetryErrorView() {
        if (isFragmentContainerEmpty()) {
            RetryErrorView retryErrorView = this.retryErrorView;
            RetryErrorView retryErrorView2 = null;
            if (retryErrorView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("retryErrorView");
                retryErrorView = null;
            }
            retryErrorView.setVisibility(0);
            RetryErrorView retryErrorView3 = this.retryErrorView;
            if (retryErrorView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("retryErrorView");
            } else {
                retryErrorView2 = retryErrorView3;
            }
            retryErrorView2.render(this.retryErrorViewRendering);
        }
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
    public final MessagingScreenViewModelFactory getMessagingScreenViewModelFactory() {
        MessagingScreenViewModelFactory messagingScreenViewModelFactory = this.messagingScreenViewModelFactory;
        if (messagingScreenViewModelFactory != null) {
            return messagingScreenViewModelFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("messagingScreenViewModelFactory");
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

    @Override // zendesk.messaging.android.internal.permissions.RuntimePermissionRequester
    public void launchSinglePermissionRequest(@NotNull String permission, @Nullable Function1<? super Boolean, Unit> onPermissionResult) {
        permission.getClass();
        RuntimePermissionLauncher runtimePermissionLauncher = this.permissionLauncher;
        if (runtimePermissionLauncher == null) {
            Intrinsics.throwUninitializedPropertyAccessException("permissionLauncher");
            runtimePermissionLauncher = null;
        }
        runtimePermissionLauncher.launchSinglePermissionRequest(permission, new h1(onPermissionResult, 7));
    }

    @Override // androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zma_screen_messaging);
        setupPermissionLauncher();
        this.retryErrorView = (RetryErrorView) findViewById(R.id.zma_retry_error_view);
        this.fragmentContainerView = (FragmentContainerView) findViewById(R.id.zma_fragment_container);
        this.circularProgressIndicator = (CircularProgressIndicator) findViewById(R.id.zuia_progress_bar_indicator);
        f0.B(m1.c(this), null, null, new C04591(null), 3);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    public void onNewIntent(@NotNull Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        String stringExtra = intent.getStringExtra(CONVERSATION_ID_KEY);
        getIntent().putExtra(CONVERSATION_ID_KEY, stringExtra);
        f0.B(m1.c(this), null, null, new C04601(stringExtra, null), 3);
    }

    public final void setMessagingNavigator(@NotNull MessagingNavigator messagingNavigator) {
        messagingNavigator.getClass();
        this.messagingNavigator = messagingNavigator;
    }

    public final void setMessagingScreenViewModelFactory(@NotNull MessagingScreenViewModelFactory messagingScreenViewModelFactory) {
        messagingScreenViewModelFactory.getClass();
        this.messagingScreenViewModelFactory = messagingScreenViewModelFactory;
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

    public static /* synthetic */ void getUserDarkColors$annotations() {
    }

    public static /* synthetic */ void getUserLightColors$annotations() {
    }
}
