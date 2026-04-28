package zendesk.messaging.android.internal.validation;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0080@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\u000e"}, d2 = {"Lzendesk/messaging/android/internal/validation/ConversationFieldRepository;", "", "Lzendesk/messaging/android/internal/validation/ConversationFieldService;", "conversationFieldService", "<init>", "(Lzendesk/messaging/android/internal/validation/ConversationFieldService;)V", "Lzendesk/messaging/android/internal/validation/ConversationFieldResult;", "", "Lzendesk/messaging/android/internal/validation/model/ConversationField;", "fetchConversationFields$zendesk_messaging_messaging_android", "(Lx70/c;)Ljava/lang/Object;", "fetchConversationFields", "Lzendesk/messaging/android/internal/validation/ConversationFieldService;", "Companion", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConversationFieldRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationFieldRepository.kt\nzendesk/messaging/android/internal/validation/ConversationFieldRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n1617#2,9:50\n1869#2:59\n1870#2:61\n1626#2:62\n1#3:60\n*S KotlinDebug\n*F\n+ 1 ConversationFieldRepository.kt\nzendesk/messaging/android/internal/validation/ConversationFieldRepository\n*L\n24#1:50,9\n24#1:59\n24#1:61\n24#1:62\n24#1:60\n*E\n"})
public final class ConversationFieldRepository {

    @NotNull
    public static final String LOG_TAG = "MessagingFieldRepository";

    @NotNull
    private final ConversationFieldService conversationFieldService;

    public ConversationFieldRepository(@NotNull ConversationFieldService conversationFieldService) {
        conversationFieldService.getClass();
        this.conversationFieldService = conversationFieldService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchConversationFields$zendesk_messaging_messaging_android(@org.jetbrains.annotations.NotNull x70.c<? super zendesk.messaging.android.internal.validation.ConversationFieldResult<? extends java.util.List<? extends zendesk.messaging.android.internal.validation.model.ConversationField>>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof zendesk.messaging.android.internal.validation.ConversationFieldRepository$fetchConversationFields$1
            if (r0 == 0) goto L13
            r0 = r8
            zendesk.messaging.android.internal.validation.ConversationFieldRepository$fetchConversationFields$1 r0 = (zendesk.messaging.android.internal.validation.ConversationFieldRepository$fetchConversationFields$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.messaging.android.internal.validation.ConversationFieldRepository$fetchConversationFields$1 r0 = new zendesk.messaging.android.internal.validation.ConversationFieldRepository$fetchConversationFields$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            java.lang.String r3 = "We were not able to validate your conversation fields at the moment. Ensure you have stable internet connection and try again."
            r4 = 1
            r5 = 0
            java.lang.String r6 = "MessagingFieldRepository"
            if (r2 == 0) goto L37
            if (r2 != r4) goto L30
            ba0.g.M(r8)     // Catch: java.lang.Throwable -> L2c kotlinx.serialization.SerializationException -> L2e
            goto L45
        L2c:
            r8 = move-exception
            goto L73
        L2e:
            r8 = move-exception
            goto L85
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L37:
            ba0.g.M(r8)
            zendesk.messaging.android.internal.validation.ConversationFieldService r8 = r7.conversationFieldService     // Catch: java.lang.Throwable -> L2c kotlinx.serialization.SerializationException -> L2e
            r0.label = r4     // Catch: java.lang.Throwable -> L2c kotlinx.serialization.SerializationException -> L2e
            java.lang.Object r8 = r8.getConversationFields(r0)     // Catch: java.lang.Throwable -> L2c kotlinx.serialization.SerializationException -> L2e
            if (r8 != r1) goto L45
            return r1
        L45:
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch: java.lang.Throwable -> L2c kotlinx.serialization.SerializationException -> L2e
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2c kotlinx.serialization.SerializationException -> L2e
            r0.<init>()     // Catch: java.lang.Throwable -> L2c kotlinx.serialization.SerializationException -> L2e
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L2c kotlinx.serialization.SerializationException -> L2e
        L50:
            boolean r1 = r8.hasNext()     // Catch: java.lang.Throwable -> L2c kotlinx.serialization.SerializationException -> L2e
            if (r1 == 0) goto L66
            java.lang.Object r1 = r8.next()     // Catch: java.lang.Throwable -> L2c kotlinx.serialization.SerializationException -> L2e
            zendesk.messaging.android.internal.rest.model.ConversationFieldDto r1 = (zendesk.messaging.android.internal.rest.model.ConversationFieldDto) r1     // Catch: java.lang.Throwable -> L2c kotlinx.serialization.SerializationException -> L2e
            zendesk.messaging.android.internal.validation.model.ConversationField r1 = zendesk.messaging.android.internal.rest.model.ConversationFieldDtoKt.toConversationField(r1)     // Catch: java.lang.Throwable -> L2c kotlinx.serialization.SerializationException -> L2e
            if (r1 == 0) goto L50
            r0.add(r1)     // Catch: java.lang.Throwable -> L2c kotlinx.serialization.SerializationException -> L2e
            goto L50
        L66:
            java.lang.String r8 = "Received response for conversation fields."
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L2c kotlinx.serialization.SerializationException -> L2e
            zendesk.logger.Logger.d(r6, r8, r1)     // Catch: java.lang.Throwable -> L2c kotlinx.serialization.SerializationException -> L2e
            zendesk.messaging.android.internal.validation.ConversationFieldResult$Success r8 = new zendesk.messaging.android.internal.validation.ConversationFieldResult$Success     // Catch: java.lang.Throwable -> L2c kotlinx.serialization.SerializationException -> L2e
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L2c kotlinx.serialization.SerializationException -> L2e
            return r8
        L73:
            java.lang.String r0 = "Failed to get conversation fields."
            java.lang.Object[] r1 = new java.lang.Object[r5]
            zendesk.logger.Logger.e(r6, r0, r8, r1)
            zendesk.messaging.android.internal.validation.ConversationFieldResult$Error r8 = new zendesk.messaging.android.internal.validation.ConversationFieldResult$Error
            zendesk.messaging.android.internal.validation.ValidationError$FieldRetrievalFailed r0 = new zendesk.messaging.android.internal.validation.ValidationError$FieldRetrievalFailed
            r0.<init>(r3)
            r8.<init>(r0)
            goto L96
        L85:
            java.lang.String r0 = "GET request for conversation fields failed to decode malformed JSON response."
            java.lang.Object[] r1 = new java.lang.Object[r5]
            zendesk.logger.Logger.e(r6, r0, r8, r1)
            zendesk.messaging.android.internal.validation.ConversationFieldResult$Error r8 = new zendesk.messaging.android.internal.validation.ConversationFieldResult$Error
            zendesk.messaging.android.internal.validation.ValidationError$FieldRetrievalFailed r0 = new zendesk.messaging.android.internal.validation.ValidationError$FieldRetrievalFailed
            r0.<init>(r3)
            r8.<init>(r0)
        L96:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.validation.ConversationFieldRepository.fetchConversationFields$zendesk_messaging_messaging_android(x70.c):java.lang.Object");
    }
}
