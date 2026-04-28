package zendesk.conversationkit.android.internal.faye;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import z70.c;
import z70.e;
import zendesk.conversationkit.android.internal.ActionDispatcher;
import zendesk.conversationkit.android.internal.StubActionDispatcher;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lzendesk/conversationkit/android/internal/faye/SunCoFayeClientFactory;", "", "Lv80/b0;", "coroutineScope", "<init>", "(Lv80/b0;)V", "Ln90/c;", "json", "Lzendesk/conversationkit/android/internal/user/data/UserActionProcessorInMemoryDataSource;", "userActionProcessorInMemoryDataSource", "Lzendesk/conversationkit/android/internal/faye/SunCoFayeClient;", "create", "(Ln90/c;Lzendesk/conversationkit/android/internal/user/data/UserActionProcessorInMemoryDataSource;Lx70/c;)Ljava/lang/Object;", "Lv80/b0;", "Lzendesk/conversationkit/android/internal/ActionDispatcher;", "actionDispatcher", "Lzendesk/conversationkit/android/internal/ActionDispatcher;", "getActionDispatcher", "()Lzendesk/conversationkit/android/internal/ActionDispatcher;", "setActionDispatcher", "(Lzendesk/conversationkit/android/internal/ActionDispatcher;)V", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SunCoFayeClientFactory {

    @NotNull
    private ActionDispatcher actionDispatcher;

    @NotNull
    private final b0 coroutineScope;

    /* JADX INFO: renamed from: zendesk.conversationkit.android.internal.faye.SunCoFayeClientFactory$create$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.conversationkit.android.internal.faye.SunCoFayeClientFactory", f = "SunCoFayeClientFactory.kt", l = {38}, m = "create")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
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
            return SunCoFayeClientFactory.this.create(null, null, this);
        }
    }

    public SunCoFayeClientFactory(@NotNull b0 b0Var) {
        b0Var.getClass();
        this.coroutineScope = b0Var;
        this.actionDispatcher = new StubActionDispatcher();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object create(@org.jetbrains.annotations.NotNull n90.c r9, @org.jetbrains.annotations.NotNull zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource r10, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.conversationkit.android.internal.faye.SunCoFayeClient> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof zendesk.conversationkit.android.internal.faye.SunCoFayeClientFactory.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r11
            zendesk.conversationkit.android.internal.faye.SunCoFayeClientFactory$create$1 r0 = (zendesk.conversationkit.android.internal.faye.SunCoFayeClientFactory.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.conversationkit.android.internal.faye.SunCoFayeClientFactory$create$1 r0 = new zendesk.conversationkit.android.internal.faye.SunCoFayeClientFactory$create$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L31
            java.lang.Object r9 = r0.L$1
            r10 = r9
            zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource r10 = (zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource) r10
            java.lang.Object r9 = r0.L$0
            n90.c r9 = (n90.c) r9
            ba0.g.M(r11)
        L2f:
            r6 = r9
            goto L48
        L31:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r9)
            r9 = 0
            return r9
        L38:
            ba0.g.M(r11)
            r0.L$0 = r9
            r0.L$1 = r10
            r0.label = r3
            java.lang.Object r11 = r10.getUser(r0)
            if (r11 != r1) goto L2f
            return r1
        L48:
            zendesk.conversationkit.android.model.User r11 = (zendesk.conversationkit.android.model.User) r11
            zendesk.conversationkit.android.model.RealtimeSettings r9 = r11.getRealtimeSettings()
            java.lang.String r9 = r9.getBaseUrl()
            zendesk.faye.FayeClientBuilder r11 = new zendesk.faye.FayeClientBuilder
            r11.<init>(r9)
            zendesk.faye.FayeClient r3 = r11.build()
            zendesk.conversationkit.android.internal.ActionDispatcher r4 = r8.actionDispatcher
            v80.b0 r5 = r8.coroutineScope
            zendesk.conversationkit.android.internal.faye.SunCoFayeInMemoryDataSource r7 = new zendesk.conversationkit.android.internal.faye.SunCoFayeInMemoryDataSource
            r7.<init>(r10)
            zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient r2 = new zendesk.conversationkit.android.internal.faye.DefaultSunCoFayeClient
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.conversationkit.android.internal.faye.SunCoFayeClientFactory.create(n90.c, zendesk.conversationkit.android.internal.user.data.UserActionProcessorInMemoryDataSource, x70.c):java.lang.Object");
    }

    @NotNull
    public final ActionDispatcher getActionDispatcher() {
        return this.actionDispatcher;
    }

    public final void setActionDispatcher(@NotNull ActionDispatcher actionDispatcher) {
        actionDispatcher.getClass();
        this.actionDispatcher = actionDispatcher;
    }
}
