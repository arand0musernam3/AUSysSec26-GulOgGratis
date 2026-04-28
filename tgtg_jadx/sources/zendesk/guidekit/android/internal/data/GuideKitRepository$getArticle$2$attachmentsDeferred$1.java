package zendesk.guidekit.android.internal.data;

import ba0.g;
import com.braze.h2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import x70.c;
import y70.a;
import z70.e;
import z70.i;
import zendesk.guidekit.android.internal.rest.HelpCenterApi;
import zendesk.guidekit.android.internal.rest.model.AttachmentResponseDto;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@e(c = "zendesk.guidekit.android.internal.data.GuideKitRepository$getArticle$2$attachmentsDeferred$1", f = "GuideKitRepository.kt", l = {138}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "Lzendesk/guidekit/android/internal/rest/model/AttachmentResponseDto;", "<anonymous>", "(Lv80/b0;)Lzendesk/guidekit/android/internal/rest/model/AttachmentResponseDto;"}, k = 3, mv = {2, 1, 0})
public final class GuideKitRepository$getArticle$2$attachmentsDeferred$1 extends i implements Function2<b0, c<? super AttachmentResponseDto>, Object> {
    final /* synthetic */ String $attachmentsUrl;
    int label;
    final /* synthetic */ GuideKitRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuideKitRepository$getArticle$2$attachmentsDeferred$1(GuideKitRepository guideKitRepository, String str, c<? super GuideKitRepository$getArticle$2$attachmentsDeferred$1> cVar) {
        super(2, cVar);
        this.this$0 = guideKitRepository;
        this.$attachmentsUrl = str;
    }

    @Override // z70.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        return new GuideKitRepository$getArticle$2$attachmentsDeferred$1(this.this$0, this.$attachmentsUrl, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(b0 b0Var, c<? super AttachmentResponseDto> cVar) {
        return ((GuideKitRepository$getArticle$2$attachmentsDeferred$1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                g.M(obj);
                return obj;
            }
            h2.b("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        g.M(obj);
        HelpCenterApi helpCenterApi = this.this$0.helpCenterApi;
        String str = this.$attachmentsUrl;
        this.label = 1;
        Object attachments$default = HelpCenterApi.DefaultImpls.getAttachments$default(helpCenterApi, str, 0, this, 2, null);
        return attachments$default == aVar ? aVar : attachments$default;
    }
}
