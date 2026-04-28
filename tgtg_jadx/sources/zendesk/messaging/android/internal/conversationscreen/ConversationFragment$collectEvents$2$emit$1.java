package zendesk.messaging.android.internal.conversationscreen;

import kotlin.Metadata;
import zendesk.messaging.android.internal.conversationscreen.ConversationFragment;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@z70.e(c = "zendesk.messaging.android.internal.conversationscreen.ConversationFragment$collectEvents$2", f = "ConversationFragment.kt", l = {545}, m = "emit")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class ConversationFragment$collectEvents$2$emit$1 extends z70.c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ConversationFragment.AnonymousClass2<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConversationFragment$collectEvents$2$emit$1(ConversationFragment.AnonymousClass2<? super T> anonymousClass2, x70.c<? super ConversationFragment$collectEvents$2$emit$1> cVar) {
        super(cVar);
        this.this$0 = anonymousClass2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type x70.c to zendesk.messaging.android.internal.conversationscreen.ConversationFragment$collectEvents$2$emit$1 for r1v1 'this'  x70.c
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // z70.a
    public final java.lang.Object invokeSuspend(java.lang.Object r2) {
        /*
            r1 = this;
            r1.result = r2
            int r2 = r1.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 | r0
            r1.label = r2
            zendesk.messaging.android.internal.conversationscreen.ConversationFragment$collectEvents$2<T> r2 = r1.this$0
            r0 = 0
            java.lang.Object r2 = r2.emit(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.conversationscreen.ConversationFragment$collectEvents$2$emit$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
