package com.braze.ui.inappmessage.jsinterface;

import android.content.Context;
import android.webkit.JavascriptInterface;
import ba0.g;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.h2;
import com.braze.models.inappmessage.IInAppMessageHtml;
import com.braze.support.BrazeLogger;
import com.braze.support.PermissionUtils;
import com.braze.ui.JavascriptInterfaceBase;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import v80.f0;
import v80.j2;
import x70.c;
import z70.e;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0017J\b\u0010\u0016\u001a\u00020\u0013H\u0017J\b\u0010\u0017\u001a\u00020\u0013H\u0007J\b\u0010\u0018\u001a\u00020\u0013H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u00020\t8G¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/braze/ui/inappmessage/jsinterface/InAppMessageJavascriptInterface;", "Lcom/braze/ui/JavascriptInterfaceBase;", "context", "Landroid/content/Context;", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessageHtml;", "<init>", "(Landroid/content/Context;Lcom/braze/models/inappmessage/IInAppMessageHtml;)V", "user", "Lcom/braze/ui/inappmessage/jsinterface/InAppMessageUserJavascriptInterface;", "getUser", "()Lcom/braze/ui/inappmessage/jsinterface/InAppMessageUserJavascriptInterface;", "wasCloseMessageCalled", "", "getWasCloseMessageCalled", "()Z", "setWasCloseMessageCalled", "(Z)V", "logButtonClick", "", "buttonId", "", "logClick", "beforeMessageClosed", "requestPushPermission", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInAppMessageJavascriptInterface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InAppMessageJavascriptInterface.kt\ncom/braze/ui/inappmessage/jsinterface/InAppMessageJavascriptInterface\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1#2:72\n*E\n"})
public final class InAppMessageJavascriptInterface extends JavascriptInterfaceBase {
    private static final long PUSH_PROMPT_INITIAL_DELAY_MS = 75;
    private static final long PUSH_PROMPT_WAIT_DELAY_TIMEOUT_MS = 25;
    private static final long PUSH_PROMPT_WAIT_FOR_DISPLAY_TIMEOUT_MS = 2500;

    @NotNull
    private final IInAppMessageHtml inAppMessage;

    @NotNull
    private final InAppMessageUserJavascriptInterface user;
    private boolean wasCloseMessageCalled;

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageJavascriptInterface$requestPushPermission$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.braze.ui.inappmessage.jsinterface.InAppMessageJavascriptInterface$requestPushPermission$1", f = "InAppMessageJavascriptInterface.kt", l = {52}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 extends i implements Function1<c<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageJavascriptInterface$requestPushPermission$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @e(c = "com.braze.ui.inappmessage.jsinterface.InAppMessageJavascriptInterface$requestPushPermission$1$1", f = "InAppMessageJavascriptInterface.kt", l = {55}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 0, 0})
        public static final class C00241 extends i implements Function2<b0, c<? super Unit>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            public C00241(c<? super C00241> cVar) {
                super(2, cVar);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final String invokeSuspend$lambda$0() {
                return "Waiting for IAM to be fully closed before requesting push prompt";
            }

            @Override // z70.a
            public final c<Unit> create(Object obj, c<?> cVar) {
                C00241 c00241 = new C00241(cVar);
                c00241.L$0 = obj;
                return c00241;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
                return ((C00241) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
            }

            @Override // z70.a
            public final Object invokeSuspend(Object obj) {
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    g.M(obj);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.L$0, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new a(1), 6, (Object) null);
                } else {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g.M(obj);
                }
                while (BrazeInAppMessageManager.INSTANCE.getInstance().isCurrentlyDisplayingInAppMessage()) {
                    this.label = 1;
                    if (f0.o(InAppMessageJavascriptInterface.PUSH_PROMPT_WAIT_DELAY_TIMEOUT_MS, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f26487a;
            }
        }

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(1, cVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeSuspend$lambda$0() {
            return "Requesting push prompt from Braze bridge html interface";
        }

        @Override // z70.a
        public final c<Unit> create(c<?> cVar) {
            return InAppMessageJavascriptInterface.this.new AnonymousClass1(cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(c<? super Unit> cVar) {
            return ((AnonymousClass1) create(cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                if (InAppMessageJavascriptInterface.this.getWasCloseMessageCalled()) {
                    C00241 c00241 = new C00241(null);
                    this.label = 1;
                    if (j2.b(InAppMessageJavascriptInterface.PUSH_PROMPT_WAIT_FOR_DISPLAY_TIMEOUT_MS, c00241, this) == aVar) {
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
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) InAppMessageJavascriptInterface.this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new a(0), 6, (Object) null);
            PermissionUtils.requestPushPermissionPrompt(BrazeInAppMessageManager.INSTANCE.getInstance().getActivity());
            return Unit.f26487a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageJavascriptInterface(@NotNull Context context, @NotNull IInAppMessageHtml iInAppMessageHtml) {
        super(context);
        context.getClass();
        iInAppMessageHtml.getClass();
        this.inAppMessage = iInAppMessageHtml;
        this.user = new InAppMessageUserJavascriptInterface(context);
    }

    @JavascriptInterface
    public final void beforeMessageClosed() {
        this.wasCloseMessageCalled = true;
    }

    @JavascriptInterface
    @NotNull
    public final InAppMessageUserJavascriptInterface getUser() {
        return this.user;
    }

    public final boolean getWasCloseMessageCalled() {
        return this.wasCloseMessageCalled;
    }

    @Override // com.braze.ui.JavascriptInterfaceBase
    @JavascriptInterface
    public void logButtonClick(@Nullable String buttonId) {
        if (buttonId != null) {
            this.inAppMessage.logButtonClick(buttonId);
        }
    }

    @Override // com.braze.ui.JavascriptInterfaceBase
    @JavascriptInterface
    public void logClick() {
        this.inAppMessage.logClick();
    }

    @JavascriptInterface
    public final void requestPushPermission() {
        BrazeInAppMessageManager.INSTANCE.getInstance().setShouldNextUnregisterBeSkipped(true);
        BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Long.valueOf(PUSH_PROMPT_INITIAL_DELAY_MS), null, new AnonymousClass1(null), 2, null);
    }

    public final void setWasCloseMessageCalled(boolean z11) {
        this.wasCloseMessageCalled = z11;
    }
}
