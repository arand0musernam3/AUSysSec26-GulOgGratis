package zendesk.messaging.android.internal.validation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z70.c;
import z70.e;
import zendesk.conversationkit.android.ConversationKit;
import zendesk.core.android.internal.app.FeatureFlagManager;
import zendesk.messaging.android.internal.events.MessagingEventDispatcher;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B)\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\fH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015¨\u0006\u0016"}, d2 = {"Lzendesk/messaging/android/internal/validation/ConversationFieldManager;", "", "Lzendesk/messaging/android/internal/validation/ConversationFieldValidator;", "conversationFieldValidator", "Lzendesk/conversationkit/android/ConversationKit;", "conversationKit", "Lzendesk/messaging/android/internal/events/MessagingEventDispatcher;", "messagingEventDispatcher", "Lzendesk/core/android/internal/app/FeatureFlagManager;", "featureFlagManager", "<init>", "(Lzendesk/messaging/android/internal/validation/ConversationFieldValidator;Lzendesk/conversationkit/android/ConversationKit;Lzendesk/messaging/android/internal/events/MessagingEventDispatcher;Lzendesk/core/android/internal/app/FeatureFlagManager;)V", "", "", "conversationFields", "", "handleConversationFields", "(Ljava/util/Map;Lx70/c;)Ljava/lang/Object;", "Lzendesk/messaging/android/internal/validation/ConversationFieldValidator;", "Lzendesk/conversationkit/android/ConversationKit;", "Lzendesk/messaging/android/internal/events/MessagingEventDispatcher;", "Lzendesk/core/android/internal/app/FeatureFlagManager;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConversationFieldManager {

    @NotNull
    private final ConversationFieldValidator conversationFieldValidator;

    @NotNull
    private final ConversationKit conversationKit;

    @NotNull
    private final FeatureFlagManager featureFlagManager;

    @NotNull
    private final MessagingEventDispatcher messagingEventDispatcher;

    /* JADX INFO: renamed from: zendesk.messaging.android.internal.validation.ConversationFieldManager$handleConversationFields$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.messaging.android.internal.validation.ConversationFieldManager", f = "ConversationFieldManager.kt", l = {23, 32}, m = "handleConversationFields")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
        Object L$0;
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
            return ConversationFieldManager.this.handleConversationFields(null, this);
        }
    }

    public ConversationFieldManager(@NotNull ConversationFieldValidator conversationFieldValidator, @NotNull ConversationKit conversationKit, @NotNull MessagingEventDispatcher messagingEventDispatcher, @NotNull FeatureFlagManager featureFlagManager) {
        conversationFieldValidator.getClass();
        conversationKit.getClass();
        messagingEventDispatcher.getClass();
        featureFlagManager.getClass();
        this.conversationFieldValidator = conversationFieldValidator;
        this.conversationKit = conversationKit;
        this.messagingEventDispatcher = messagingEventDispatcher;
        this.featureFlagManager = featureFlagManager;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        if (r7.addConversationFields(r6, r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handleConversationFields(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> r6, @org.jetbrains.annotations.NotNull x70.c<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof zendesk.messaging.android.internal.validation.ConversationFieldManager.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            zendesk.messaging.android.internal.validation.ConversationFieldManager$handleConversationFields$1 r0 = (zendesk.messaging.android.internal.validation.ConversationFieldManager.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.messaging.android.internal.validation.ConversationFieldManager$handleConversationFields$1 r0 = new zendesk.messaging.android.internal.validation.ConversationFieldManager$handleConversationFields$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.L$0
            zendesk.conversationkit.android.internal.metadata.ConversationMetadataService r6 = (zendesk.conversationkit.android.internal.metadata.ConversationMetadataService) r6
            ba0.g.M(r7)
            goto L77
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L35:
            java.lang.Object r6 = r0.L$0
            java.util.Map r6 = (java.util.Map) r6
            ba0.g.M(r7)
            goto L55
        L3d:
            ba0.g.M(r7)
            zendesk.core.android.internal.app.FeatureFlagManager r7 = r5.featureFlagManager
            boolean r7 = r7.getEnableConversationFieldValidator()
            if (r7 == 0) goto L66
            zendesk.messaging.android.internal.validation.ConversationFieldValidator r7 = r5.conversationFieldValidator
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r7.getValidationErrorsOrEmpty$zendesk_messaging_messaging_android(r6, r0)
            if (r7 != r1) goto L55
            goto L76
        L55:
            java.util.List r7 = (java.util.List) r7
            boolean r2 = r7.isEmpty()
            if (r2 != 0) goto L62
            zendesk.messaging.android.internal.events.MessagingEventDispatcher r2 = r5.messagingEventDispatcher
            r2.handleFieldValidationFailedEvent(r7)
        L62:
            java.util.Map r6 = zendesk.messaging.android.internal.validation.ConversationFieldValidatorKt.getOnlyValidFields(r7, r6)
        L66:
            zendesk.conversationkit.android.ConversationKit r7 = r5.conversationKit
            zendesk.conversationkit.android.internal.metadata.ConversationMetadataService r7 = r7.conversationMetadataService()
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r6 = r7.addConversationFields(r6, r0)
            if (r6 != r1) goto L77
        L76:
            return r1
        L77:
            kotlin.Unit r6 = kotlin.Unit.f26487a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.validation.ConversationFieldManager.handleConversationFields(java.util.Map, x70.c):java.lang.Object");
    }
}
