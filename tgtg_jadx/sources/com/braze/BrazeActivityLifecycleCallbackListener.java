package com.braze;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.braze.Braze;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.push.NotificationTrampolineActivity;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001BM\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nB7\b\u0017\u0012\u0014\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\u000bJ\u001a\u0010\u0019\u001a\u00020\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u0006J\u001a\u0010\u001c\u001a\u00020\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u0006J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0018H\u0016J\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0018H\u0016J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0018H\u0016J\u0010\u0010!\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0018H\u0016J\u001a\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u00182\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0018\u0010%\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010&\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0018H\u0016J\u0018\u0010'\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u0003H\u0007J\u000e\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020+R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010\u0013\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/braze/BrazeActivityLifecycleCallbackListener;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "sessionHandlingEnabled", "", "registerInAppMessageManager", "inAppMessagingRegistrationBlocklist", "", "Ljava/lang/Class;", "sessionHandlingBlocklist", "<init>", "(ZZLjava/util/Set;Ljava/util/Set;)V", "(Ljava/util/Set;Ljava/util/Set;)V", "shouldPersistWebView", "getShouldPersistWebView$annotations", "()V", "getShouldPersistWebView", "()Ljava/lang/Boolean;", "setShouldPersistWebView", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "isLoadingShouldPersistWebView", "Ljava/util/concurrent/atomic/AtomicBoolean;", "currentActivityRef", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "setInAppMessagingRegistrationBlocklist", "", "blocklist", "setSessionHandlingBlocklist", "onActivityStarted", "activity", "onActivityStopped", "onActivityResumed", "onActivityPaused", "onActivityCreated", "bundle", "Landroid/os/Bundle;", "onActivitySaveInstanceState", "onActivityDestroyed", "shouldHandleLifecycleMethodsInActivity", "forSessionHandling", "registerOnApplication", "context", "Landroid/content/Context;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class BrazeActivityLifecycleCallbackListener implements Application.ActivityLifecycleCallbacks {

    @Nullable
    private WeakReference<Activity> currentActivityRef;

    @NotNull
    private Set<? extends Class<?>> inAppMessagingRegistrationBlocklist;

    @NotNull
    private final AtomicBoolean isLoadingShouldPersistWebView;
    private final boolean registerInAppMessageManager;

    @NotNull
    private Set<? extends Class<?>> sessionHandlingBlocklist;
    private final boolean sessionHandlingEnabled;

    @Nullable
    private volatile Boolean shouldPersistWebView;

    /* JADX INFO: renamed from: com.braze.BrazeActivityLifecycleCallbackListener$onActivityCreated$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "com.braze.BrazeActivityLifecycleCallbackListener$onActivityCreated$2", f = "BrazeActivityLifecycleCallbackListener.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 0, 0})
    public static final class AnonymousClass2 extends z70.i implements Function2<v80.b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BrazeActivityLifecycleCallbackListener this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, BrazeActivityLifecycleCallbackListener brazeActivityLifecycleCallbackListener, x70.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$context = context;
            this.this$0 = brazeActivityLifecycleCallbackListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeSuspend$lambda$0() {
            return "Error while reading shouldPersistWebViewWhenBackgroundingApp from BrazeConfigurationProvider";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeSuspend$lambda$1(BrazeActivityLifecycleCallbackListener brazeActivityLifecycleCallbackListener) {
            return "Async load of shouldPersistWebView completed: " + brazeActivityLifecycleCallbackListener.getShouldPersistWebView();
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$context, this.this$0, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v80.b0 b0Var, x70.c<? super Unit> cVar) {
            return ((AnonymousClass2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
            v80.b0 b0Var = (v80.b0) this.L$0;
            int i11 = 0;
            try {
                Context context = this.$context;
                context.getClass();
                this.this$0.setShouldPersistWebView(Boolean.valueOf(new BrazeConfigurationProvider(context).getShouldPersistWebViewWhenBackgroundingApp()));
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) b0Var, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new x1(i11), 4, (Object) null);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) b0Var, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new y1(this.this$0, i11), 6, (Object) null);
            return Unit.f26487a;
        }
    }

    public BrazeActivityLifecycleCallbackListener(boolean z11, boolean z12, @Nullable Set<? extends Class<?>> set, @Nullable Set<? extends Class<?>> set2) {
        this.sessionHandlingEnabled = z11;
        this.registerInAppMessageManager = z12;
        this.isLoadingShouldPersistWebView = new AtomicBoolean(false);
        this.inAppMessagingRegistrationBlocklist = set == null ? kotlin.collections.p0.f26531a : set;
        this.sessionHandlingBlocklist = set2 == null ? kotlin.collections.p0.f26531a : set2;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new y1(this, 3), 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new y1(this, 1), 6, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0(BrazeActivityLifecycleCallbackListener brazeActivityLifecycleCallbackListener) {
        return "BrazeActivityLifecycleCallbackListener using in-app messaging blocklist: " + brazeActivityLifecycleCallbackListener.inAppMessagingRegistrationBlocklist;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$1(BrazeActivityLifecycleCallbackListener brazeActivityLifecycleCallbackListener) {
        return "BrazeActivityLifecycleCallbackListener using session handling blocklist: " + brazeActivityLifecycleCallbackListener.sessionHandlingBlocklist;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onActivityCreated$lambda$10(Activity activity) {
        return w.a0.k(activity.getClass(), "Automatically calling lifecycle method: ensureSubscribedToInAppMessageEvents for class: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onActivityPaused$lambda$8(Activity activity) {
        return w.a0.k(activity.getClass(), "Automatically calling lifecycle method: unregisterInAppMessageManager for class: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onActivityPaused$lambda$9(BrazeActivityLifecycleCallbackListener brazeActivityLifecycleCallbackListener) {
        return "Skipping unregisterInAppMessageManager in onActivityPaused. shouldPersistWebView=" + brazeActivityLifecycleCallbackListener.shouldPersistWebView + " (null means async load incomplete, defaulting to persist)";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onActivityResumed$lambda$6() {
        return "Activity is different from previous activity. Unregistering in-app message manager";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onActivityResumed$lambda$7(Activity activity) {
        return w.a0.k(activity.getClass(), "Automatically calling lifecycle method: registerInAppMessageManager for class: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onActivityStarted$lambda$4(Activity activity) {
        return w.a0.k(activity.getClass(), "Automatically calling lifecycle method: openSession for class: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onActivityStopped$lambda$5(Activity activity) {
        return w.a0.k(activity.getClass(), "Automatically calling lifecycle method: closeSession for class: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerOnApplication$lambda$12() {
        return "Failed to register this lifecycle callback listener directly against application class";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setInAppMessagingRegistrationBlocklist$lambda$2(Set set) {
        return "setInAppMessagingRegistrationBlocklist called with blocklist: " + set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setSessionHandlingBlocklist$lambda$3(Set set) {
        return "setSessionHandlingBlocklist called with blocklist: " + set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String shouldHandleLifecycleMethodsInActivity$lambda$11() {
        return "Skipping automatic registration for notification trampoline activity class.";
    }

    @Nullable
    public final Boolean getShouldPersistWebView() {
        return this.shouldPersistWebView;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        activity.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new v1(activity, 3), 6, (Object) null);
        BrazeInAppMessageManager companion = BrazeInAppMessageManager.INSTANCE.getInstance();
        Context applicationContext = activity.getApplicationContext();
        applicationContext.getClass();
        companion.ensureSubscribedToInAppMessageEvents(applicationContext);
        if (this.registerInAppMessageManager && this.shouldPersistWebView == null && this.isLoadingShouldPersistWebView.compareAndSet(false, true)) {
            v80.f0.B(BrazeCoroutineScope.INSTANCE, null, null, new AnonymousClass2(activity.getApplicationContext(), this, null), 3);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        activity.getClass();
        if (this.registerInAppMessageManager && shouldHandleLifecycleMethodsInActivity(activity, false)) {
            if (Intrinsics.areEqual(this.shouldPersistWebView, Boolean.FALSE)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new v1(activity, 1), 6, (Object) null);
                BrazeInAppMessageManager.INSTANCE.getInstance().unregisterInAppMessageManager(activity);
            } else {
                BrazeInAppMessageManager.INSTANCE.getInstance().pauseWebviewIfNecessary$android_sdk_ui_release();
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new y1(this, 2), 6, (Object) null);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        activity.getClass();
        if (this.registerInAppMessageManager) {
            if (shouldHandleLifecycleMethodsInActivity(activity, false)) {
                WeakReference<Activity> weakReference = this.currentActivityRef;
                Activity activity2 = weakReference != null ? weakReference.get() : null;
                Boolean bool = this.shouldPersistWebView;
                Boolean bool2 = Boolean.TRUE;
                if (Intrinsics.areEqual(bool, bool2) && activity2 != null && !Intrinsics.areEqual(activity2, activity)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new w1(0), 6, (Object) null);
                    BrazeInAppMessageManager.INSTANCE.getInstance().unregisterInAppMessageManager(activity);
                }
                if (Intrinsics.areEqual(this.shouldPersistWebView, bool2) && activity2 != null && Intrinsics.areEqual(activity2, activity)) {
                    BrazeInAppMessageManager.INSTANCE.getInstance().resumeWebviewIfNecessary$android_sdk_ui_release();
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new v1(activity, 4), 6, (Object) null);
                    BrazeInAppMessageManager.INSTANCE.getInstance().registerInAppMessageManager(activity);
                }
            } else {
                BrazeInAppMessageManager.INSTANCE.getInstance().unregisterInAppMessageManager(activity);
            }
        }
        this.currentActivityRef = new WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
        activity.getClass();
        if (this.sessionHandlingEnabled && shouldHandleLifecycleMethodsInActivity(activity, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new v1(activity, 2), 6, (Object) null);
            Braze.Companion companion = Braze.INSTANCE;
            Context applicationContext = activity.getApplicationContext();
            applicationContext.getClass();
            companion.getInstance(applicationContext).openSession(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        activity.getClass();
        if (this.sessionHandlingEnabled && shouldHandleLifecycleMethodsInActivity(activity, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new v1(activity, 0), 6, (Object) null);
            Braze.Companion companion = Braze.INSTANCE;
            Context applicationContext = activity.getApplicationContext();
            applicationContext.getClass();
            companion.getInstance(applicationContext).closeSession(activity);
        }
    }

    public final void registerOnApplication(@NotNull Context context) {
        context.getClass();
        try {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new r1(28), 4, (Object) null);
        }
    }

    public final void setInAppMessagingRegistrationBlocklist(@NotNull Set<? extends Class<?>> blocklist) {
        blocklist.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new u1(0, blocklist), 6, (Object) null);
        this.inAppMessagingRegistrationBlocklist = blocklist;
    }

    public final void setSessionHandlingBlocklist(@NotNull Set<? extends Class<?>> blocklist) {
        blocklist.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new u1(1, blocklist), 6, (Object) null);
        this.sessionHandlingBlocklist = blocklist;
    }

    public final void setShouldPersistWebView(@Nullable Boolean bool) {
        this.shouldPersistWebView = bool;
    }

    public final boolean shouldHandleLifecycleMethodsInActivity(@NotNull Activity activity, boolean forSessionHandling) {
        activity.getClass();
        Class<?> cls = activity.getClass();
        if (!Intrinsics.areEqual(cls, NotificationTrampolineActivity.class)) {
            return forSessionHandling ? !this.sessionHandlingBlocklist.contains(cls) : !this.inAppMessagingRegistrationBlocklist.contains(cls);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new r1(29), 6, (Object) null);
        return false;
    }

    public static /* synthetic */ void getShouldPersistWebView$annotations() {
    }

    public BrazeActivityLifecycleCallbackListener(@Nullable Set<? extends Class<?>> set) {
        this(set, (Set) null, 2, (DefaultConstructorMarker) null);
    }

    public BrazeActivityLifecycleCallbackListener(boolean z11) {
        this(z11, false, null, null, 14, null);
    }

    public BrazeActivityLifecycleCallbackListener(boolean z11, boolean z12) {
        this(z11, z12, null, null, 12, null);
    }

    public BrazeActivityLifecycleCallbackListener(boolean z11, boolean z12, @Nullable Set<? extends Class<?>> set) {
        this(z11, z12, set, null, 8, null);
    }

    public BrazeActivityLifecycleCallbackListener(Set set, Set set2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((Set<? extends Class<?>>) set, (Set<? extends Class<?>>) ((i11 & 2) != 0 ? kotlin.collections.p0.f26531a : set2));
    }

    public BrazeActivityLifecycleCallbackListener(boolean z11, boolean z12, Set set, Set set2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? true : z11, (i11 & 2) != 0 ? true : z12, (Set<? extends Class<?>>) ((i11 & 4) != 0 ? kotlin.collections.p0.f26531a : set), (Set<? extends Class<?>>) ((i11 & 8) != 0 ? kotlin.collections.p0.f26531a : set2));
    }

    public BrazeActivityLifecycleCallbackListener() {
        this(false, false, null, null, 15, null);
    }

    public BrazeActivityLifecycleCallbackListener(@Nullable Set<? extends Class<?>> set, @Nullable Set<? extends Class<?>> set2) {
        this(true, true, set, set2);
    }
}
