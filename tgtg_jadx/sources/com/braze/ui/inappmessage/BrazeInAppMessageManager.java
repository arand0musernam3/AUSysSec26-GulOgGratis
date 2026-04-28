package com.braze.ui.inappmessage;

import a3.p;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.webkit.WebView;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.inappmessage.MessageType;
import com.braze.enums.inappmessage.Orientation;
import com.braze.events.BrazeUserChangeEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.InAppMessageEvent;
import com.braze.events.SdkDataWipeEvent;
import com.braze.h2;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.InAppMessageHtml;
import com.braze.models.inappmessage.n;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.ui.actions.brazeactions.BrazeActionUtils;
import com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener;
import com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener;
import com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer;
import com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView;
import com.braze.ui.support.ViewUtils;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import v80.f0;
import v80.p0;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0017\u0018\u0000 Z2\u00020\u0001:\u0001ZB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u0014J \u0010\u001b\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010!\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0017¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020\u0006H\u0000¢\u0006\u0004\b#\u0010\u0003J\u000f\u0010&\u001a\u00020\u0006H\u0000¢\u0006\u0004\b%\u0010\u0003J\u0015\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'H\u0002¢\u0006\u0004\b)\u0010*J\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020+0'2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00102\u001a\u0002018\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u0012\u0004\b4\u0010\u0003R&\u00106\u001a\b\u0012\u0004\u0012\u00020\u000e058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b6\u00107\u0012\u0004\b:\u0010\u0003\u001a\u0004\b8\u00109R#\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020(0;8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001e\u0010@\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u001e\u0010C\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010AR\u001e\u0010D\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010AR\u0018\u0010F\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010I\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010L\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010NR*\u0010O\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bO\u0010P\u0012\u0004\bT\u0010\u0003\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010\u0011R*\u0010U\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bU\u0010P\u0012\u0004\bX\u0010\u0003\u001a\u0004\bV\u0010R\"\u0004\bW\u0010\u0011R\u0011\u0010Y\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\bY\u0010\u0014¨\u0006["}, d2 = {"Lcom/braze/ui/inappmessage/BrazeInAppMessageManager;", "Lcom/braze/ui/inappmessage/InAppMessageManagerBase;", "<init>", "()V", "Landroid/content/Context;", "context", "", "ensureSubscribedToInAppMessageEvents", "(Landroid/content/Context;)V", "Landroid/app/Activity;", "activity", "registerInAppMessageManager", "(Landroid/app/Activity;)V", "unregisterInAppMessageManager", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessage", "addInAppMessage", "(Lcom/braze/models/inappmessage/IInAppMessage;)V", "", "requestDisplayInAppMessage", "()Z", "dismissed", "hideCurrentlyDisplayingInAppMessage", "(Z)V", "resetAfterInAppMessageClose", "getIsCurrentlyDisplayingInAppMessage", "isCarryOver", "displayInAppMessage", "(Lcom/braze/models/inappmessage/IInAppMessage;ZLx70/c;)Ljava/lang/Object;", "verifyOrientationStatus", "(Lcom/braze/models/inappmessage/IInAppMessage;)Z", "", "currentUserId", "isInAppMessageForTheSameUser", "(Lcom/braze/models/inappmessage/IInAppMessage;Ljava/lang/String;)Z", "pauseWebviewIfNecessary$android_sdk_ui_release", "pauseWebviewIfNecessary", "resumeWebviewIfNecessary$android_sdk_ui_release", "resumeWebviewIfNecessary", "Lcom/braze/events/IEventSubscriber;", "Lcom/braze/events/InAppMessageEvent;", "createInAppMessageEventSubscriber", "()Lcom/braze/events/IEventSubscriber;", "Lcom/braze/events/BrazeUserChangeEvent;", "createBrazeUserChangeEventSubscriber", "(Landroid/content/Context;)Lcom/braze/events/IEventSubscriber;", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;", "inAppMessageViewLifecycleListener", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "displayingInAppMessage", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getDisplayingInAppMessage$annotations", "Ljava/util/Stack;", "inAppMessageStack", "Ljava/util/Stack;", "getInAppMessageStack", "()Ljava/util/Stack;", "getInAppMessageStack$annotations", "", "inAppMessageEventMap", "Ljava/util/Map;", "getInAppMessageEventMap", "()Ljava/util/Map;", "inAppMessageEventSubscriber", "Lcom/braze/events/IEventSubscriber;", "Lcom/braze/events/SdkDataWipeEvent;", "sdkDataWipeEventSubscriber", "brazeUserChangeEventSubscriber", "", "originalOrientation", "Ljava/lang/Integer;", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "Lcom/braze/configuration/BrazeConfigurationProvider;", "Lcom/braze/ui/inappmessage/IInAppMessageViewWrapper;", "inAppMessageViewWrapper", "Lcom/braze/ui/inappmessage/IInAppMessageViewWrapper;", "Ljava/lang/String;", "carryoverInAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "getCarryoverInAppMessage", "()Lcom/braze/models/inappmessage/IInAppMessage;", "setCarryoverInAppMessage", "getCarryoverInAppMessage$annotations", "unregisteredInAppMessage", "getUnregisteredInAppMessage", "setUnregisteredInAppMessage", "getUnregisteredInAppMessage$annotations", "isCurrentlyDisplayingInAppMessage", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"StaticFieldLeak"})
@SourceDebugExtension({"SMAP\nBrazeInAppMessageManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrazeInAppMessageManager.kt\ncom/braze/ui/inappmessage/BrazeInAppMessageManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,828:1\n1#2:829\n*E\n"})
public class BrazeInAppMessageManager extends InAppMessageManagerBase {

    @Nullable
    private static volatile BrazeInAppMessageManager instance;

    @Nullable
    private IEventSubscriber<BrazeUserChangeEvent> brazeUserChangeEventSubscriber;

    @Nullable
    private IInAppMessage carryoverInAppMessage;

    @Nullable
    private BrazeConfigurationProvider configurationProvider;

    @Nullable
    private String currentUserId;

    @Nullable
    private IEventSubscriber<InAppMessageEvent> inAppMessageEventSubscriber;

    @Nullable
    private IInAppMessageViewWrapper inAppMessageViewWrapper;

    @Nullable
    private Integer originalOrientation;

    @Nullable
    private IEventSubscriber<SdkDataWipeEvent> sdkDataWipeEventSubscriber;

    @Nullable
    private IInAppMessage unregisteredInAppMessage;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ReentrantLock instanceLock = new ReentrantLock();

    @NotNull
    private final IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener = new DefaultInAppMessageViewLifecycleListener();

    @NotNull
    public final AtomicBoolean displayingInAppMessage = new AtomicBoolean(false);

    @NotNull
    private final Stack<IInAppMessage> inAppMessageStack = new Stack<>();

    @NotNull
    private final Map<IInAppMessage, InAppMessageEvent> inAppMessageEventMap = new LinkedHashMap();

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[InAppMessageOperation.values().length];
            try {
                iArr[InAppMessageOperation.DISPLAY_NOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InAppMessageOperation.DISPLAY_LATER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InAppMessageOperation.DISCARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InAppMessageOperation.REENQUEUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MessageType.values().length];
            try {
                iArr2[MessageType.HTML.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[MessageType.HTML_FULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$displayInAppMessage$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "com.braze.ui.inappmessage.BrazeInAppMessageManager", f = "BrazeInAppMessageManager.kt", l = {590}, m = "displayInAppMessage$suspendImpl")
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 extends z70.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
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
            return BrazeInAppMessageManager.displayInAppMessage$suspendImpl(BrazeInAppMessageManager.this, null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$hideCurrentlyDisplayingInAppMessage$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @z70.e(c = "com.braze.ui.inappmessage.BrazeInAppMessageManager$hideCurrentlyDisplayingInAppMessage$1", f = "BrazeInAppMessageManager.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 0, 0})
    public static final class C01471 extends i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ IInAppMessageViewWrapper $inAppMessageWrapperView;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01471(IInAppMessageViewWrapper iInAppMessageViewWrapper, x70.c<? super C01471> cVar) {
            super(2, cVar);
            this.$inAppMessageWrapperView = iInAppMessageViewWrapper;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return new C01471(this.$inAppMessageWrapperView, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C01471) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
            this.$inAppMessageWrapperView.close();
            return Unit.f26487a;
        }
    }

    private final IEventSubscriber<BrazeUserChangeEvent> createBrazeUserChangeEventSubscriber(Context context) {
        return new b(this, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createBrazeUserChangeEventSubscriber$lambda$57(BrazeInAppMessageManager brazeInAppMessageManager, BrazeUserChangeEvent brazeUserChangeEvent) {
        brazeUserChangeEvent.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeInAppMessageManager, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new e(brazeUserChangeEvent, 0), 6, (Object) null);
        String currentUserId = brazeUserChangeEvent.getCurrentUserId();
        brazeInAppMessageManager.currentUserId = currentUserId;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeInAppMessageManager, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new n(currentUserId, 17), 7, (Object) null);
        i0.v(brazeInAppMessageManager.inAppMessageStack, new p(20, brazeInAppMessageManager, currentUserId));
        if (!brazeInAppMessageManager.isInAppMessageForTheSameUser(brazeInAppMessageManager.carryoverInAppMessage, currentUserId)) {
            brazeInAppMessageManager.carryoverInAppMessage = null;
        }
        if (!brazeInAppMessageManager.isInAppMessageForTheSameUser(brazeInAppMessageManager.unregisteredInAppMessage, currentUserId)) {
            brazeInAppMessageManager.unregisteredInAppMessage = null;
        }
        if (brazeInAppMessageManager.displayingInAppMessage.get()) {
            brazeInAppMessageManager.hideCurrentlyDisplayingInAppMessage(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createBrazeUserChangeEventSubscriber$lambda$57$lambda$54(BrazeUserChangeEvent brazeUserChangeEvent) {
        return "InAppMessage manager handling new current user id: '" + brazeUserChangeEvent + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createBrazeUserChangeEventSubscriber$lambda$57$lambda$55(String str) {
        return e0.f.k("Removing in-app messages not from user ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean createBrazeUserChangeEventSubscriber$lambda$57$lambda$56(BrazeInAppMessageManager brazeInAppMessageManager, String str, IInAppMessage iInAppMessage) {
        return !brazeInAppMessageManager.isInAppMessageForTheSameUser(iInAppMessage, str);
    }

    private final IEventSubscriber<InAppMessageEvent> createInAppMessageEventSubscriber() {
        return new b(this, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createInAppMessageEventSubscriber$lambda$53(BrazeInAppMessageManager brazeInAppMessageManager, InAppMessageEvent inAppMessageEvent) {
        inAppMessageEvent.getClass();
        IInAppMessage inAppMessage = inAppMessageEvent.getInAppMessage();
        brazeInAppMessageManager.inAppMessageEventMap.put(inAppMessage, inAppMessageEvent);
        brazeInAppMessageManager.addInAppMessage(inAppMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$37(IInAppMessage iInAppMessage) {
        return e0.f.k("Attempting to display in-app message with payload: ", JsonUtils.getPrettyPrintedString(iInAppMessage.getJsonObject()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$38() {
        return "A in-app message is currently being displayed. Adding in-app message back on the stack.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$39() {
        return "Expiration timestamp not defined. Continuing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$40() {
        return "Not displaying control in-app message. Logging impression and ending display execution.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$41() {
        return "Cannot show message containing an invalid Braze Action.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$42() {
        return "Attempting to perform any fallback actions.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$43() {
        return "Cannot show message containing a Push Prompt due to existing push prompt status, Android API version, or Target SDK level.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$44() {
        return "Attempting to perform any fallback actions.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$45() {
        return "Creating view wrapper for immersive in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$46() {
        return "Creating view wrapper for base in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$47() {
        return "Creating view wrapper for in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$48() {
        return "In-app message view includes HTML. Delaying display until the content has finished loading.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void displayInAppMessage$lambda$51(IInAppMessageViewWrapper iInAppMessageViewWrapper, BrazeInAppMessageManager brazeInAppMessageManager, Activity activity) {
        if (iInAppMessageViewWrapper != null) {
            try {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeInAppMessageManager, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new com.braze.ui.contentcards.adapters.a(26), 7, (Object) null);
                iInAppMessageViewWrapper.open(activity);
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeInAppMessageManager, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new com.braze.ui.contentcards.adapters.a(27), 4, (Object) null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$51$lambda$49() {
        return "Page has finished loading. Opening in-app message view wrapper.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$51$lambda$50() {
        return "Failed to open view wrapper in page finished listener";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$52(IInAppMessage iInAppMessage) {
        return e0.f.k("Could not display in-app message with payload: ", JsonUtils.getPrettyPrintedString(iInAppMessage.getJsonObject()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0307 A[Catch: all -> 0x026e, TryCatch #3 {all -> 0x026e, blocks: (B:88:0x0208, B:90:0x020d, B:92:0x0213, B:94:0x022b, B:101:0x02be, B:103:0x02c4, B:106:0x02ed, B:108:0x02f1, B:110:0x02f7, B:105:0x02ea, B:97:0x0274, B:99:0x0278, B:100:0x029f, B:111:0x02ff, B:112:0x0306, B:113:0x0307, B:114:0x030e), top: B:130:0x0208 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x020d A[Catch: all -> 0x026e, TryCatch #3 {all -> 0x026e, blocks: (B:88:0x0208, B:90:0x020d, B:92:0x0213, B:94:0x022b, B:101:0x02be, B:103:0x02c4, B:106:0x02ed, B:108:0x02f1, B:110:0x02f7, B:105:0x02ea, B:97:0x0274, B:99:0x0278, B:100:0x029f, B:111:0x02ff, B:112:0x0306, B:113:0x0307, B:114:0x030e), top: B:130:0x0208 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object displayInAppMessage$suspendImpl(com.braze.ui.inappmessage.BrazeInAppMessageManager r23, com.braze.models.inappmessage.IInAppMessage r24, boolean r25, x70.c<? super kotlin.Unit> r26) {
        /*
            Method dump skipped, instruction units count: 838
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.ui.inappmessage.BrazeInAppMessageManager.displayInAppMessage$suspendImpl(com.braze.ui.inappmessage.BrazeInAppMessageManager, com.braze.models.inappmessage.IInAppMessage, boolean, x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ensureSubscribedToInAppMessageEvents$lambda$0() {
        return "Removing existing in-app message event subscriber before subscribing a new one.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ensureSubscribedToInAppMessageEvents$lambda$1() {
        return "Subscribing in-app message event subscriber";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ensureSubscribedToInAppMessageEvents$lambda$3() {
        return "Removing existing sdk data wipe event subscriber before subscribing a new one.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ensureSubscribedToInAppMessageEvents$lambda$4() {
        return "Subscribing sdk data wipe subscriber";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ensureSubscribedToInAppMessageEvents$lambda$5(BrazeInAppMessageManager brazeInAppMessageManager, SdkDataWipeEvent sdkDataWipeEvent) {
        sdkDataWipeEvent.getClass();
        if (brazeInAppMessageManager.displayingInAppMessage.get()) {
            brazeInAppMessageManager.hideCurrentlyDisplayingInAppMessage(false);
        }
        brazeInAppMessageManager.inAppMessageStack.clear();
        brazeInAppMessageManager.carryoverInAppMessage = null;
        brazeInAppMessageManager.unregisteredInAppMessage = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ensureSubscribedToInAppMessageEvents$lambda$7() {
        return "Removing existing user change event subscriber before subscribing a new one.";
    }

    @NotNull
    public static final BrazeInAppMessageManager getInstance() {
        return INSTANCE.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String pauseWebviewIfNecessary$lambda$62() {
        return "Pausing InAppMessage WebView";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerInAppMessageManager$lambda$10(Activity activity) {
        return e0.f.k("Registering InAppMessageManager with activity: ", activity.getLocalClassName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerInAppMessageManager$lambda$11() {
        return "Activity had null applicationContext in registerInAppMessageManager. Doing Nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerInAppMessageManager$lambda$14$lambda$13() {
        return "Requesting display of carryover in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerInAppMessageManager$lambda$16$lambda$15() {
        return "Adding previously unregistered in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerInAppMessageManager$lambda$18() {
        return "Error while calling attempting to register the InAppMessageManager";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerInAppMessageManager$lambda$9() {
        return "Null Activity passed to registerInAppMessageManager. Doing nothing";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$24() {
        return "No activity is currently registered to receive in-app messages. Saving in-app message as unregistered in-app message. It will automatically be displayed when the next activity registers to receive in-app messages.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$25() {
        return "No activity is currently registered to receive in-app messages and the in-app message stack is empty. Doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$26() {
        return "A in-app message is currently being displayed. Ignoring request to display in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$27() {
        return "The in-app message stack is empty. No in-app message will be displayed.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$28() {
        return "Using the control in-app message manager listener.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$29() {
        return "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISPLAY_NOW. The in-app message will be displayed.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$30() {
        return "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISPLAY_LATER. The in-app message will be pushed back onto the stack.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$31() {
        return "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISCARD. The in-app message will not be displayed and will not be put back on the stack.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$32() {
        return "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned REENQUEUE. The in-app message will not be displayed and will be marked as eligible for next time.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$33(IInAppMessage iInAppMessage) {
        return "An in-app message was requested to be re-enqueued, but it was not found. Discarding instead. In-app message = " + iInAppMessage;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$34() {
        return "Error running requestDisplayInAppMessage";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resetAfterInAppMessageClose$lambda$35() {
        return "Resetting after in-app message close.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resetAfterInAppMessageClose$lambda$36(Integer num) {
        return "Setting requested orientation to original orientation " + num;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resumeWebviewIfNecessary$lambda$63() {
        return "Resuming InAppMessage WebView";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unregisterInAppMessageManager$lambda$19(Activity activity) {
        return e0.f.k("Skipping unregistration due to setShouldNextUnregisterBeSkipped being true. Activity: ", activity != null ? activity.getLocalClassName() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unregisterInAppMessageManager$lambda$20() {
        return "Null Activity passed to unregisterInAppMessageManager.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unregisterInAppMessageManager$lambda$21(Activity activity) {
        return e0.f.k("Unregistering InAppMessageManager from activity: ", activity.getLocalClassName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unregisterInAppMessageManager$lambda$22() {
        return "In-app message view includes HTML. Removing the page finished listener.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unregisterInAppMessageManager$lambda$23() {
        return "Error while calling attempting to unregister the InAppMessageManager";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyOrientationStatus$lambda$58() {
        return "Cannot verify orientation status with null Activity.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyOrientationStatus$lambda$59() {
        return "Running on tablet. In-app message can be displayed in any orientation.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyOrientationStatus$lambda$60() {
        return "Any orientation specified. In-app message can be displayed in any orientation.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyOrientationStatus$lambda$61() {
        return "Requesting orientation lock.";
    }

    public void addInAppMessage(@Nullable IInAppMessage inAppMessage) {
        if (inAppMessage != null) {
            this.inAppMessageStack.push(inAppMessage);
            requestDisplayInAppMessage();
        }
    }

    @Nullable
    public Object displayInAppMessage(@NotNull IInAppMessage iInAppMessage, boolean z11, @NotNull x70.c<? super Unit> cVar) {
        return displayInAppMessage$suspendImpl(this, iInAppMessage, z11, cVar);
    }

    public void ensureSubscribedToInAppMessageEvents(@NotNull Context context) {
        context.getClass();
        if (this.inAppMessageEventSubscriber != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new d(3), 7, (Object) null);
            Braze.INSTANCE.getInstance(context).removeSingleSubscription(this.inAppMessageEventSubscriber, InAppMessageEvent.class);
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new d(4), 7, (Object) null);
        IEventSubscriber<InAppMessageEvent> iEventSubscriberCreateInAppMessageEventSubscriber = createInAppMessageEventSubscriber();
        Braze.Companion companion = Braze.INSTANCE;
        companion.getInstance(context).subscribeToNewInAppMessages(iEventSubscriberCreateInAppMessageEventSubscriber);
        this.inAppMessageEventSubscriber = iEventSubscriberCreateInAppMessageEventSubscriber;
        if (this.sdkDataWipeEventSubscriber != null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new d(5), 6, (Object) null);
            companion.getInstance(context).removeSingleSubscription(this.sdkDataWipeEventSubscriber, SdkDataWipeEvent.class);
        }
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new d(6), 6, (Object) null);
        b bVar = new b(this, 2);
        companion.getInstance(context).addSingleSynchronousSubscription(bVar, SdkDataWipeEvent.class);
        this.sdkDataWipeEventSubscriber = bVar;
        if (this.brazeUserChangeEventSubscriber != null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new d(7), 6, (Object) null);
            companion.getInstance(context).removeSingleSubscription(this.brazeUserChangeEventSubscriber, BrazeUserChangeEvent.class);
        }
        IEventSubscriber<BrazeUserChangeEvent> iEventSubscriberCreateBrazeUserChangeEventSubscriber = createBrazeUserChangeEventSubscriber(context);
        companion.getInstance(context).subscribeToChangeUserEvents(iEventSubscriberCreateBrazeUserChangeEventSubscriber);
        this.brazeUserChangeEventSubscriber = iEventSubscriberCreateBrazeUserChangeEventSubscriber;
    }

    @Nullable
    public final IInAppMessage getCarryoverInAppMessage() {
        return this.carryoverInAppMessage;
    }

    @NotNull
    public final Map<IInAppMessage, InAppMessageEvent> getInAppMessageEventMap() {
        return this.inAppMessageEventMap;
    }

    @NotNull
    public final Stack<IInAppMessage> getInAppMessageStack() {
        return this.inAppMessageStack;
    }

    public boolean getIsCurrentlyDisplayingInAppMessage() {
        return this.displayingInAppMessage.get();
    }

    @Nullable
    public final IInAppMessage getUnregisteredInAppMessage() {
        return this.unregisteredInAppMessage;
    }

    public void hideCurrentlyDisplayingInAppMessage(boolean dismissed) {
        setShouldNextUnregisterBeSkipped(false);
        IInAppMessageViewWrapper iInAppMessageViewWrapper = this.inAppMessageViewWrapper;
        if (iInAppMessageViewWrapper != null) {
            if (dismissed) {
                this.inAppMessageViewLifecycleListener.onDismissed(iInAppMessageViewWrapper.getInAppMessageView(), iInAppMessageViewWrapper.getInAppMessage());
            }
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                iInAppMessageViewWrapper.close();
                return;
            }
            BrazeCoroutineScope brazeCoroutineScope = BrazeCoroutineScope.INSTANCE;
            c90.f fVar = p0.f42144a;
            f0.B(brazeCoroutineScope, a90.p.f1044a, null, new C01471(iInAppMessageViewWrapper, null), 2);
        }
    }

    public final boolean isCurrentlyDisplayingInAppMessage() {
        return this.displayingInAppMessage.get();
    }

    public boolean isInAppMessageForTheSameUser(@Nullable IInAppMessage inAppMessage, @Nullable String currentUserId) {
        if (inAppMessage != null && currentUserId != null) {
            InAppMessageEvent inAppMessageEvent = this.inAppMessageEventMap.get(inAppMessage);
            String userId = inAppMessageEvent != null ? inAppMessageEvent.getUserId() : null;
            if (userId != null && !Intrinsics.areEqual(userId, currentUserId)) {
                return false;
            }
        }
        return true;
    }

    public final void pauseWebviewIfNecessary$android_sdk_ui_release() {
        WebView messageWebView;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new d(8), 7, (Object) null);
        IInAppMessageViewWrapper iInAppMessageViewWrapper = this.inAppMessageViewWrapper;
        if (iInAppMessageViewWrapper != null) {
            View inAppMessageView = iInAppMessageViewWrapper.getInAppMessageView();
            if (!(inAppMessageView instanceof InAppMessageHtmlBaseView) || (messageWebView = ((InAppMessageHtmlBaseView) inAppMessageView).getMessageWebView()) == null) {
                return;
            }
            messageWebView.onPause();
        }
    }

    public void registerInAppMessageManager(@Nullable Activity activity) {
        try {
            if (activity == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new com.braze.ui.contentcards.adapters.a(6), 6, (Object) null);
                return;
            }
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new ap.f(activity, 4), 6, (Object) null);
            this.mActivity = new WeakReference<>(activity);
            if (this.mApplicationContext == null) {
                Context applicationContext = activity.getApplicationContext();
                this.mApplicationContext = applicationContext;
                if (applicationContext == null) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new com.braze.ui.contentcards.adapters.a(7), 6, (Object) null);
                    return;
                }
            }
            if (this.configurationProvider == null) {
                Context context = this.mApplicationContext;
                this.configurationProvider = context != null ? new BrazeConfigurationProvider(context) : null;
            }
            IInAppMessage iInAppMessage = this.carryoverInAppMessage;
            if (iInAppMessage != null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new com.braze.ui.contentcards.adapters.a(8), 7, (Object) null);
                iInAppMessage.setAnimateIn(false);
                BrazeCoroutineScope brazeCoroutineScope = BrazeCoroutineScope.INSTANCE;
                c90.f fVar = p0.f42144a;
                f0.B(brazeCoroutineScope, a90.p.f1044a, null, new BrazeInAppMessageManager$registerInAppMessageManager$5$2(this, iInAppMessage, null), 2);
                this.carryoverInAppMessage = null;
            } else {
                IInAppMessage iInAppMessage2 = this.unregisteredInAppMessage;
                if (iInAppMessage2 != null) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new com.braze.ui.contentcards.adapters.a(10), 7, (Object) null);
                    addInAppMessage(iInAppMessage2);
                    this.unregisteredInAppMessage = null;
                }
            }
            Context context2 = this.mApplicationContext;
            if (context2 != null) {
                ensureSubscribedToInAppMessageEvents(context2);
            }
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new com.braze.ui.contentcards.adapters.a(11), 4, (Object) null);
        }
    }

    public boolean requestDisplayInAppMessage() {
        InAppMessageOperation inAppMessageOperationBeforeInAppMessageDisplayed;
        try {
            WeakReference<Activity> weakReference = this.mActivity;
            Activity activity = weakReference != null ? weakReference.get() : null;
            if (activity == null) {
                if (this.inAppMessageStack.empty()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new d(11), 7, (Object) null);
                    return false;
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new d(9), 6, (Object) null);
                this.unregisteredInAppMessage = this.inAppMessageStack.pop();
                return false;
            }
            if (this.displayingInAppMessage.get()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new d(12), 7, (Object) null);
                return false;
            }
            if (this.inAppMessageStack.isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new d(13), 7, (Object) null);
                return false;
            }
            IInAppMessage iInAppMessagePop = this.inAppMessageStack.pop();
            if (iInAppMessagePop.isControl()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new com.braze.ui.contentcards.adapters.a(1), 7, (Object) null);
                inAppMessageOperationBeforeInAppMessageDisplayed = getControlInAppMessageManagerListener().beforeInAppMessageDisplayed(iInAppMessagePop);
            } else {
                inAppMessageOperationBeforeInAppMessageDisplayed = getInAppMessageManagerListener().beforeInAppMessageDisplayed(iInAppMessagePop);
            }
            int i11 = WhenMappings.$EnumSwitchMapping$0[inAppMessageOperationBeforeInAppMessageDisplayed.ordinal()];
            if (i11 == 1) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new com.braze.ui.contentcards.adapters.a(2), 7, (Object) null);
                BackgroundInAppMessagePreparer.prepareInAppMessageForDisplay(iInAppMessagePop);
                return true;
            }
            if (i11 == 2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new com.braze.ui.contentcards.adapters.a(3), 7, (Object) null);
                this.inAppMessageStack.push(iInAppMessagePop);
                return false;
            }
            if (i11 == 3) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new com.braze.ui.contentcards.adapters.a(4), 7, (Object) null);
                return false;
            }
            if (i11 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            InAppMessageEvent inAppMessageEvent = this.inAppMessageEventMap.get(iInAppMessagePop);
            if (inAppMessageEvent == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new a(iInAppMessagePop, 0), 7, (Object) null);
                return false;
            }
            BrazeInternal brazeInternal = BrazeInternal.INSTANCE;
            Context applicationContext = activity.getApplicationContext();
            applicationContext.getClass();
            brazeInternal.reenqueueInAppMessage(applicationContext, inAppMessageEvent);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new com.braze.ui.contentcards.adapters.a(5), 7, (Object) null);
            return false;
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new d(10), 4, (Object) null);
            return false;
        }
    }

    public void resetAfterInAppMessageClose() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new com.braze.ui.contentcards.adapters.a(24), 6, (Object) null);
        this.inAppMessageViewWrapper = null;
        WeakReference<Activity> weakReference = this.mActivity;
        Activity activity = weakReference != null ? weakReference.get() : null;
        Integer num = this.originalOrientation;
        this.displayingInAppMessage.set(false);
        if (activity == null || num == null) {
            return;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new c(num, 0), 7, (Object) null);
        ViewUtils.setActivityRequestedOrientation(activity, num.intValue());
        this.originalOrientation = null;
    }

    public final void resumeWebviewIfNecessary$android_sdk_ui_release() {
        WebView messageWebView;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new com.braze.ui.contentcards.adapters.a(23), 7, (Object) null);
        IInAppMessageViewWrapper iInAppMessageViewWrapper = this.inAppMessageViewWrapper;
        if (iInAppMessageViewWrapper != null) {
            View inAppMessageView = iInAppMessageViewWrapper.getInAppMessageView();
            if (!(inAppMessageView instanceof InAppMessageHtmlBaseView) || (messageWebView = ((InAppMessageHtmlBaseView) inAppMessageView).getMessageWebView()) == null) {
                return;
            }
            messageWebView.onResume();
        }
    }

    public final void setCarryoverInAppMessage(@Nullable IInAppMessage iInAppMessage) {
        this.carryoverInAppMessage = iInAppMessage;
    }

    public final void setUnregisteredInAppMessage(@Nullable IInAppMessage iInAppMessage) {
        this.unregisteredInAppMessage = iInAppMessage;
    }

    public void unregisterInAppMessageManager(@Nullable Activity activity) {
        IInAppMessage inAppMessage;
        try {
            if (getShouldNextUnregisterBeSkipped()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new ap.f(activity, 3), 7, (Object) null);
                setShouldNextUnregisterBeSkipped(false);
                return;
            }
            if (activity == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new com.braze.ui.contentcards.adapters.a(9), 6, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new ap.f(activity, 5), 6, (Object) null);
            }
            IInAppMessageViewWrapper iInAppMessageViewWrapper = this.inAppMessageViewWrapper;
            if (iInAppMessageViewWrapper != null) {
                View inAppMessageView = iInAppMessageViewWrapper.getInAppMessageView();
                if (inAppMessageView instanceof InAppMessageHtmlBaseView) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new com.braze.ui.contentcards.adapters.a(25), 7, (Object) null);
                    ((InAppMessageHtmlBaseView) inAppMessageView).setHtmlPageFinishedListener(null);
                }
                ViewUtils.removeViewFromParent(inAppMessageView);
                if (iInAppMessageViewWrapper.getIsAnimatingClose()) {
                    this.inAppMessageViewLifecycleListener.afterClosed(iInAppMessageViewWrapper.getInAppMessage());
                    inAppMessage = null;
                } else {
                    inAppMessage = iInAppMessageViewWrapper.getInAppMessage();
                }
                this.carryoverInAppMessage = inAppMessage;
                this.inAppMessageViewWrapper = null;
            } else {
                this.carryoverInAppMessage = null;
            }
            this.mActivity = null;
            this.displayingInAppMessage.set(false);
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new d(2), 4, (Object) null);
        }
    }

    @SuppressLint({"InlinedApi"})
    public boolean verifyOrientationStatus(@NotNull IInAppMessage inAppMessage) {
        inAppMessage.getClass();
        WeakReference<Activity> weakReference = this.mActivity;
        Activity activity = weakReference != null ? weakReference.get() : null;
        Orientation orientation = inAppMessage.getOrientation();
        if (activity == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new com.braze.ui.contentcards.adapters.a(28), 6, (Object) null);
        } else if (ViewUtils.isRunningOnTablet(activity)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new com.braze.ui.contentcards.adapters.a(29), 7, (Object) null);
        } else {
            if (orientation != Orientation.ANY) {
                if (!ViewUtils.isCurrentOrientationValid(activity.getResources().getConfiguration().orientation, orientation)) {
                    return false;
                }
                if (this.originalOrientation == null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new d(1), 7, (Object) null);
                    this.originalOrientation = Integer.valueOf(activity.getRequestedOrientation());
                    ViewUtils.setActivityRequestedOrientation(activity, 14);
                }
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new d(0), 7, (Object) null);
        }
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\u0007H\u0007J\u0017\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0001¢\u0006\u0002\b\fJ\f\u0010\r\u001a\u00020\u000e*\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/braze/ui/inappmessage/BrazeInAppMessageManager$Companion;", "", "<init>", "()V", "instanceLock", "Ljava/util/concurrent/locks/ReentrantLock;", "instance", "Lcom/braze/ui/inappmessage/BrazeInAppMessageManager;", "getInstance", "setTestingInstance", "", "manager", "setTestingInstance$android_sdk_ui_release", "containsPushPermissionPrompt", "", "Lcom/braze/models/inappmessage/IInAppMessage;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean containsPushPermissionPrompt(IInAppMessage iInAppMessage) {
            return iInAppMessage instanceof InAppMessageHtml ? ((InAppMessageHtml) iInAppMessage).isPushPrimer() : BrazeActionUtils.containsAnyPushPermissionBrazeActions(iInAppMessage);
        }

        @NotNull
        public final BrazeInAppMessageManager getInstance() {
            if (BrazeInAppMessageManager.instance != null) {
                BrazeInAppMessageManager brazeInAppMessageManager = BrazeInAppMessageManager.instance;
                brazeInAppMessageManager.getClass();
                return brazeInAppMessageManager;
            }
            ReentrantLock reentrantLock = BrazeInAppMessageManager.instanceLock;
            reentrantLock.lock();
            try {
                if (BrazeInAppMessageManager.instance == null) {
                    BrazeInAppMessageManager.instance = new BrazeInAppMessageManager();
                }
                reentrantLock.unlock();
                BrazeInAppMessageManager brazeInAppMessageManager2 = BrazeInAppMessageManager.instance;
                brazeInAppMessageManager2.getClass();
                return brazeInAppMessageManager2;
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }

        public final void setTestingInstance$android_sdk_ui_release(@Nullable BrazeInAppMessageManager manager) {
            BrazeInAppMessageManager.instance = manager;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getCarryoverInAppMessage$annotations() {
    }

    public static /* synthetic */ void getDisplayingInAppMessage$annotations() {
    }

    public static /* synthetic */ void getInAppMessageStack$annotations() {
    }

    public static /* synthetic */ void getUnregisteredInAppMessage$annotations() {
    }
}
