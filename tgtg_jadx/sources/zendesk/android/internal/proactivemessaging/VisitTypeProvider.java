package zendesk.android.internal.proactivemessaging;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v80.b0;
import v80.f0;
import x70.c;
import z70.e;
import z70.i;
import zendesk.android.internal.di.ZendeskInitializedComponentScope;
import zendesk.conversationkit.android.ConversationKit;
import zendesk.conversationkit.android.model.VisitType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@ZendeskInitializedComponentScope
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0019\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R$\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8\u0000@BX\u0080.¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lzendesk/android/internal/proactivemessaging/VisitTypeProvider;", "", "Lzendesk/conversationkit/android/ConversationKit;", "conversationKit", "Lv80/b0;", "coroutineScope", "<init>", "(Lzendesk/conversationkit/android/ConversationKit;Lv80/b0;)V", "Lzendesk/conversationkit/android/model/VisitType;", "value", "visitType", "Lzendesk/conversationkit/android/model/VisitType;", "getVisitType$zendesk_zendesk_android", "()Lzendesk/conversationkit/android/model/VisitType;", "Companion", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VisitTypeProvider {

    @NotNull
    public static final String LOG_TAG = "VisitTypeRepository";
    private VisitType visitType;

    /* JADX INFO: renamed from: zendesk.android.internal.proactivemessaging.VisitTypeProvider$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.android.internal.proactivemessaging.VisitTypeProvider$1", f = "VisitTypeProvider.kt", l = {40, 48}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass1 extends i implements Function2<b0, c<? super Unit>, Object> {
        final /* synthetic */ ConversationKit $conversationKit;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ConversationKit conversationKit, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$conversationKit = conversationKit;
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return VisitTypeProvider.this.new AnonymousClass1(this.$conversationKit, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((AnonymousClass1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
        
            if (r7.setVisitType(r1, r6) == r0) goto L22;
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
                if (r1 == 0) goto L1f
                if (r1 == r3) goto L17
                if (r1 != r2) goto L10
                ba0.g.M(r7)
                goto L69
            L10:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                com.braze.h2.b(r7)
            L15:
                r7 = 0
                return r7
            L17:
                java.lang.Object r1 = r6.L$0
                zendesk.android.internal.proactivemessaging.VisitTypeProvider r1 = (zendesk.android.internal.proactivemessaging.VisitTypeProvider) r1
                ba0.g.M(r7)
                goto L31
            L1f:
                ba0.g.M(r7)
                zendesk.android.internal.proactivemessaging.VisitTypeProvider r1 = zendesk.android.internal.proactivemessaging.VisitTypeProvider.this
                zendesk.conversationkit.android.ConversationKit r7 = r6.$conversationKit
                r6.L$0 = r1
                r6.label = r3
                java.lang.Object r7 = r7.getVisitType(r6)
                if (r7 != r0) goto L31
                goto L68
            L31:
                zendesk.conversationkit.android.ConversationKitResult r7 = (zendesk.conversationkit.android.ConversationKitResult) r7
                boolean r3 = r7 instanceof zendesk.conversationkit.android.ConversationKitResult.Failure
                if (r3 == 0) goto L4a
                zendesk.conversationkit.android.ConversationKitResult$Failure r7 = (zendesk.conversationkit.android.ConversationKitResult.Failure) r7
                java.lang.Throwable r7 = r7.getCause()
                r3 = 0
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.String r4 = "VisitTypeRepository"
                java.lang.String r5 = "Failure getting visit type "
                zendesk.logger.Logger.e(r4, r5, r7, r3)
                zendesk.conversationkit.android.model.VisitType r7 = zendesk.conversationkit.android.model.VisitType.NEW
                goto L56
            L4a:
                boolean r3 = r7 instanceof zendesk.conversationkit.android.ConversationKitResult.Success
                if (r3 == 0) goto L6c
                zendesk.conversationkit.android.ConversationKitResult$Success r7 = (zendesk.conversationkit.android.ConversationKitResult.Success) r7
                java.lang.Object r7 = r7.getValue()
                zendesk.conversationkit.android.model.VisitType r7 = (zendesk.conversationkit.android.model.VisitType) r7
            L56:
                zendesk.android.internal.proactivemessaging.VisitTypeProvider.access$setVisitType$p(r1, r7)
                zendesk.conversationkit.android.ConversationKit r7 = r6.$conversationKit
                zendesk.conversationkit.android.model.VisitType r1 = zendesk.conversationkit.android.model.VisitType.REPEAT
                r3 = 0
                r6.L$0 = r3
                r6.label = r2
                java.lang.Object r7 = r7.setVisitType(r1, r6)
                if (r7 != r0) goto L69
            L68:
                return r0
            L69:
                kotlin.Unit r7 = kotlin.Unit.f26487a
                return r7
            L6c:
                e40.a.f()
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.android.internal.proactivemessaging.VisitTypeProvider.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public VisitTypeProvider(@NotNull ConversationKit conversationKit, @NotNull b0 b0Var) {
        conversationKit.getClass();
        b0Var.getClass();
        f0.B(b0Var, null, null, new AnonymousClass1(conversationKit, null), 3);
    }

    @NotNull
    public final VisitType getVisitType$zendesk_zendesk_android() {
        VisitType visitType = this.visitType;
        if (visitType != null) {
            return visitType;
        }
        Intrinsics.throwUninitializedPropertyAccessException("visitType");
        return null;
    }
}
