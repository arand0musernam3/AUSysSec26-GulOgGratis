package zendesk.messaging.android.internal.conversationscreen;

import kotlin.jvm.functions.Function1;
import zendesk.conversationkit.android.model.Conversation;
import zendesk.conversationkit.android.model.Field;
import zendesk.ui.android.conversation.form.FieldState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f47681b;

    public /* synthetic */ i(Object obj, int i11) {
        this.f47680a = i11;
        this.f47681b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f47680a) {
            case 0:
                return ConversationScreenCoordinator.onFormFocusChanged$lambda$15$lambda$14((ConversationScreenViewModel) this.f47681b, ((Boolean) obj).booleanValue());
            case 1:
                return MessageLogEntryMapper.map$lambda$8$lambda$4$lambda$3((Conversation) this.f47681b, (String) obj);
            case 2:
                return RenderingUpdates.formRenderingUpdate$lambda$8$lambda$7$lambda$0((Field.Text) this.f47681b, (FieldState.Text) obj);
            case 3:
                return RenderingUpdates.formRenderingUpdate$lambda$8$lambda$7$lambda$1((Field.Email) this.f47681b, (FieldState.Email) obj);
            default:
                return RenderingUpdates.formRenderingUpdate$lambda$8$lambda$7$lambda$6((Field.Select) this.f47681b, (FieldState.Select) obj);
        }
    }
}
