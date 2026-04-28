package zendesk.messaging.android.internal.validation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z70.c;
import z70.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@e(c = "zendesk.messaging.android.internal.validation.ConversationFieldValidator", f = "ConversationFieldValidator.kt", l = {28}, m = "getValidationErrorsOrEmpty$zendesk_messaging_messaging_android")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class ConversationFieldValidator$getValidationErrorsOrEmpty$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ConversationFieldValidator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationFieldValidator$getValidationErrorsOrEmpty$1(ConversationFieldValidator conversationFieldValidator, x70.c<? super ConversationFieldValidator$getValidationErrorsOrEmpty$1> cVar) {
        super(cVar);
        this.this$0 = conversationFieldValidator;
    }

    @Override // z70.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getValidationErrorsOrEmpty$zendesk_messaging_messaging_android(null, this);
    }
}
