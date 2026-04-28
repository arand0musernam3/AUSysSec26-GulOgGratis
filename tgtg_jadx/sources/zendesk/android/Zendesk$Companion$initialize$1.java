package zendesk.android;

import android.content.Context;
import ba0.g;
import com.braze.h2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import x70.c;
import z70.e;
import z70.i;
import zendesk.android.ZendeskResult;
import zendesk.android.messaging.MessagingFactory;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@e(c = "zendesk.android.Zendesk$Companion$initialize$1", f = "Zendesk.kt", l = {297, 298}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
public final class Zendesk$Companion$initialize$1 extends i implements Function2<b0, c<? super Unit>, Object> {
    final /* synthetic */ String $channelKey;
    final /* synthetic */ Context $context;
    final /* synthetic */ FailureCallback<Throwable> $failureCallback;
    final /* synthetic */ MessagingFactory $messagingFactory;
    final /* synthetic */ SuccessCallback<Zendesk> $successCallback;
    int label;

    /* JADX INFO: renamed from: zendesk.android.Zendesk$Companion$initialize$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.android.Zendesk$Companion$initialize$1$1", f = "Zendesk.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass1 extends i implements Function2<b0, c<? super Unit>, Object> {
        final /* synthetic */ FailureCallback<Throwable> $failureCallback;
        final /* synthetic */ ZendeskResult<Zendesk, Throwable> $result;
        final /* synthetic */ SuccessCallback<Zendesk> $successCallback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(ZendeskResult<Zendesk, ? extends Throwable> zendeskResult, FailureCallback<Throwable> failureCallback, SuccessCallback<Zendesk> successCallback, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$result = zendeskResult;
            this.$failureCallback = failureCallback;
            this.$successCallback = successCallback;
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(this.$result, this.$failureCallback, this.$successCallback, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((AnonymousClass1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
            ZendeskResult<Zendesk, Throwable> zendeskResult = this.$result;
            if (zendeskResult instanceof ZendeskResult.Failure) {
                this.$failureCallback.onFailure((Throwable) ((ZendeskResult.Failure) zendeskResult).getError());
            } else {
                if (!(zendeskResult instanceof ZendeskResult.Success)) {
                    e40.a.f();
                    return null;
                }
                this.$successCallback.onSuccess((Zendesk) ((ZendeskResult.Success) zendeskResult).getValue());
            }
            return Unit.f26487a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Zendesk$Companion$initialize$1(Context context, String str, MessagingFactory messagingFactory, FailureCallback<Throwable> failureCallback, SuccessCallback<Zendesk> successCallback, c<? super Zendesk$Companion$initialize$1> cVar) {
        super(2, cVar);
        this.$context = context;
        this.$channelKey = str;
        this.$messagingFactory = messagingFactory;
        this.$failureCallback = failureCallback;
        this.$successCallback = successCallback;
    }

    @Override // z70.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        return new Zendesk$Companion$initialize$1(this.$context, this.$channelKey, this.$messagingFactory, this.$failureCallback, this.$successCallback, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
        return ((Zendesk$Companion$initialize$1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (v80.f0.K(r1, r4, r12) == r0) goto L15;
     */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r12.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1d
            if (r1 == r4) goto L18
            if (r1 != r3) goto L12
            ba0.g.M(r13)
            r9 = r12
            goto L4f
        L12:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r13)
            return r2
        L18:
            ba0.g.M(r13)
            r9 = r12
            goto L37
        L1d:
            ba0.g.M(r13)
            r13 = r4
            zendesk.android.Zendesk$Companion r4 = zendesk.android.Zendesk.INSTANCE
            android.content.Context r5 = r12.$context
            java.lang.String r6 = r12.$channelKey
            zendesk.android.messaging.MessagingFactory r7 = r12.$messagingFactory
            r12.label = r13
            r8 = 0
            r10 = 8
            r11 = 0
            r9 = r12
            java.lang.Object r13 = zendesk.android.Zendesk.Companion.initialize$default(r4, r5, r6, r7, r8, r9, r10, r11)
            if (r13 != r0) goto L37
            goto L4e
        L37:
            zendesk.android.ZendeskResult r13 = (zendesk.android.ZendeskResult) r13
            c90.f r1 = v80.p0.f42144a
            w80.c r1 = a90.p.f1044a
            zendesk.android.Zendesk$Companion$initialize$1$1 r4 = new zendesk.android.Zendesk$Companion$initialize$1$1
            zendesk.android.FailureCallback<java.lang.Throwable> r5 = r9.$failureCallback
            zendesk.android.SuccessCallback<zendesk.android.Zendesk> r6 = r9.$successCallback
            r4.<init>(r13, r5, r6, r2)
            r9.label = r3
            java.lang.Object r13 = v80.f0.K(r1, r4, r12)
            if (r13 != r0) goto L4f
        L4e:
            return r0
        L4f:
            kotlin.Unit r13 = kotlin.Unit.f26487a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.android.Zendesk$Companion$initialize$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
