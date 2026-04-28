package zendesk.messaging.android.internal.validation;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import zendesk.logger.Logger;
import zendesk.messaging.android.internal.validation.ValidationError;
import zendesk.messaging.android.internal.validation.model.ConversationField;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\n\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0019\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J;\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0014H\u0080@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lzendesk/messaging/android/internal/validation/ConversationFieldValidator;", "", "Lzendesk/messaging/android/internal/validation/ValidationRules;", "rules", "Lzendesk/messaging/android/internal/validation/ConversationFieldRepository;", "conversationFieldRepository", "<init>", "(Lzendesk/messaging/android/internal/validation/ValidationRules;Lzendesk/messaging/android/internal/validation/ConversationFieldRepository;)V", "", "id", "providedValue", "", "Lzendesk/messaging/android/internal/validation/model/ConversationField;", "fetchedConversationFields", "", "Lzendesk/messaging/android/internal/validation/ValidationError;", "listOfErrors", "", "runFieldValidation", "(Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;Ljava/util/List;)V", "", "fieldsToValidate", "getValidationErrorsOrEmpty$zendesk_messaging_messaging_android", "(Ljava/util/Map;Lx70/c;)Ljava/lang/Object;", "getValidationErrorsOrEmpty", "Lzendesk/messaging/android/internal/validation/ValidationRules;", "Lzendesk/messaging/android/internal/validation/ConversationFieldRepository;", "getConversationFieldRepository", "()Lzendesk/messaging/android/internal/validation/ConversationFieldRepository;", "Companion", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConversationFieldValidator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationFieldValidator.kt\nzendesk/messaging/android/internal/validation/ConversationFieldValidator\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,214:1\n216#2,2:215\n1#3:217\n*S KotlinDebug\n*F\n+ 1 ConversationFieldValidator.kt\nzendesk/messaging/android/internal/validation/ConversationFieldValidator\n*L\n32#1:215,2\n*E\n"})
public final class ConversationFieldValidator {

    @NotNull
    public static final String LOG_TAG = "ConversationFieldValidator";

    @NotNull
    private final ConversationFieldRepository conversationFieldRepository;

    @NotNull
    private final ValidationRules rules;

    public ConversationFieldValidator(@NotNull ValidationRules validationRules, @NotNull ConversationFieldRepository conversationFieldRepository) {
        validationRules.getClass();
        conversationFieldRepository.getClass();
        this.rules = validationRules;
        this.conversationFieldRepository = conversationFieldRepository;
    }

    private final void runFieldValidation(String id2, Object providedValue, List<? extends ConversationField> fetchedConversationFields, List<ValidationError> listOfErrors) {
        Object next;
        Iterator<T> it = fetchedConversationFields.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.areEqual(((ConversationField) next).getId(), id2)) {
                    break;
                }
            }
        }
        ConversationField conversationField = (ConversationField) next;
        if (conversationField == null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(ValidationRules.FIELD_ID_NOT_FOUND_ERROR, Arrays.copyOf(new Object[]{id2}, 1));
            listOfErrors.add(new ValidationError.FieldValidationFailed(id2, str));
            Logger.e(LOG_TAG, str, new Object[0]);
            return;
        }
        String strValidate = conversationField.validate(providedValue, this.rules);
        if (strValidate != null) {
            listOfErrors.add(new ValidationError.FieldValidationFailed(id2, strValidate));
            Logger.e(LOG_TAG, strValidate, new Object[0]);
        }
    }

    @NotNull
    public final ConversationFieldRepository getConversationFieldRepository() {
        return this.conversationFieldRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getValidationErrorsOrEmpty$zendesk_messaging_messaging_android(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> r5, @org.jetbrains.annotations.NotNull x70.c<? super java.util.List<? extends zendesk.messaging.android.internal.validation.ValidationError>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof zendesk.messaging.android.internal.validation.ConversationFieldValidator$getValidationErrorsOrEmpty$1
            if (r0 == 0) goto L13
            r0 = r6
            zendesk.messaging.android.internal.validation.ConversationFieldValidator$getValidationErrorsOrEmpty$1 r0 = (zendesk.messaging.android.internal.validation.ConversationFieldValidator$getValidationErrorsOrEmpty$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.messaging.android.internal.validation.ConversationFieldValidator$getValidationErrorsOrEmpty$1 r0 = new zendesk.messaging.android.internal.validation.ConversationFieldValidator$getValidationErrorsOrEmpty$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.L$0
            java.util.Map r5 = (java.util.Map) r5
            ba0.g.M(r6)
            goto L42
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r6)
            zendesk.messaging.android.internal.validation.ConversationFieldRepository r6 = r4.conversationFieldRepository
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r6.fetchConversationFields$zendesk_messaging_messaging_android(r0)
            if (r6 != r1) goto L42
            return r1
        L42:
            zendesk.messaging.android.internal.validation.ConversationFieldResult r6 = (zendesk.messaging.android.internal.validation.ConversationFieldResult) r6
            boolean r0 = r6 instanceof zendesk.messaging.android.internal.validation.ConversationFieldResult.Error
            if (r0 == 0) goto L53
            zendesk.messaging.android.internal.validation.ConversationFieldResult$Error r6 = (zendesk.messaging.android.internal.validation.ConversationFieldResult.Error) r6
            zendesk.messaging.android.internal.validation.ValidationError r5 = r6.getError()
            java.util.List r5 = kotlin.collections.c0.c(r5)
            return r5
        L53:
            boolean r0 = r6 instanceof zendesk.messaging.android.internal.validation.ConversationFieldResult.Success
            if (r0 == 0) goto L88
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L64:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L87
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            r3 = r6
            zendesk.messaging.android.internal.validation.ConversationFieldResult$Success r3 = (zendesk.messaging.android.internal.validation.ConversationFieldResult.Success) r3
            java.lang.Object r3 = r3.getData()
            java.util.List r3 = (java.util.List) r3
            r4.runFieldValidation(r2, r1, r3, r0)
            goto L64
        L87:
            return r0
        L88:
            e40.a.f()
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.messaging.android.internal.validation.ConversationFieldValidator.getValidationErrorsOrEmpty$zendesk_messaging_messaging_android(java.util.Map, x70.c):java.lang.Object");
    }
}
