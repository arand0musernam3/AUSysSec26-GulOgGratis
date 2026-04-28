package zendesk.messaging.android.internal.conversationscreen;

import java.util.List;
import kotlin.jvm.functions.Function1;
import zendesk.ui.android.conversation.form.FormResponseRendering;
import zendesk.ui.android.conversation.form.FormResponseState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f47713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f47714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f47715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f47716e;

    public /* synthetic */ v(List list, int i11, int i12, int i13, int i14) {
        this.f47712a = i14;
        this.f47713b = list;
        this.f47714c = i11;
        this.f47715d = i12;
        this.f47716e = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f47712a) {
            case 0:
                return RenderingUpdates.formResponseRenderingUpdate$lambda$11(this.f47713b, this.f47714c, this.f47715d, this.f47716e, (FormResponseRendering) obj);
            default:
                return RenderingUpdates.formResponseRenderingUpdate$lambda$11$lambda$10(this.f47713b, this.f47714c, this.f47715d, this.f47716e, (FormResponseState) obj);
        }
    }
}
