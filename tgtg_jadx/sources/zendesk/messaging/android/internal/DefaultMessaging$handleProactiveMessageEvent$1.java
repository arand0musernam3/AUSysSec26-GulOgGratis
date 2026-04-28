package zendesk.messaging.android.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import x70.c;
import z70.e;
import z70.i;
import zendesk.messaging.android.internal.proactivemessaging.ProactiveMessageEvent;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@e(c = "zendesk.messaging.android.internal.DefaultMessaging$handleProactiveMessageEvent$1", f = "DefaultMessaging.kt", l = {448, 450, 467}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
public final class DefaultMessaging$handleProactiveMessageEvent$1 extends i implements Function2<b0, c<? super Unit>, Object> {
    final /* synthetic */ ProactiveMessageEvent $event;
    final /* synthetic */ Integer $proactiveMessageId;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DefaultMessaging this$0;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProactiveMessageEvent.values().length];
            try {
                iArr[ProactiveMessageEvent.CONVERSATION_OPENED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProactiveMessageEvent.REPLIED_TO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultMessaging$handleProactiveMessageEvent$1(Integer num, DefaultMessaging defaultMessaging, ProactiveMessageEvent proactiveMessageEvent, c<? super DefaultMessaging$handleProactiveMessageEvent$1> cVar) {
        super(2, cVar);
        this.$proactiveMessageId = num;
        this.this$0 = defaultMessaging;
        this.$event = proactiveMessageEvent;
    }

    @Override // z70.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        return new DefaultMessaging$handleProactiveMessageEvent$1(this.$proactiveMessageId, this.this$0, this.$event, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
        return ((DefaultMessaging$handleProactiveMessageEvent$1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (zendesk.messaging.android.internal.DefaultMessaging.clearRemainingProactiveMessages$default(r1, null, r8, 1, null) == r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.DefaultMessaging$handleProactiveMessageEvent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
