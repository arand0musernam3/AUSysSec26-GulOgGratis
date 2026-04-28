package zendesk.messaging.android.internal.conversationscreen;

import java.util.List;
import kotlin.jvm.functions.Function2;
import zendesk.messaging.android.internal.model.MessageLogEntry;
import zendesk.ui.android.conversation.form.DisplayedField;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f47678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f47679c;

    public /* synthetic */ h(Object obj, int i11, String str) {
        this.f47677a = i11;
        this.f47678b = str;
        this.f47679c = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f47677a) {
            case 0:
                return ConversationScreenCoordinator.onFormDisplayedFieldsChanged$lambda$21$lambda$20(this.f47678b, (ConversationScreenCoordinator) this.f47679c, (DisplayedField) obj, (String) obj2);
            default:
                return ConversationScreenCoordinator.onFormCompletedProvider$lambda$13$lambda$12(this.f47678b, (ConversationScreenViewModel) this.f47679c, (List) obj, (MessageLogEntry.FormMessageContainer) obj2);
        }
    }
}
