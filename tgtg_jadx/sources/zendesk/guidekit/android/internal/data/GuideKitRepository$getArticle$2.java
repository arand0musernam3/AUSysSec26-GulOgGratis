package zendesk.guidekit.android.internal.data;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import u70.q;
import v80.b0;
import x70.c;
import z70.e;
import z70.i;
import zendesk.guidekit.android.model.GuideArticle;
import zendesk.guidekit.android.model.GuideLocale;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@e(c = "zendesk.guidekit.android.internal.data.GuideKitRepository$getArticle$2", f = "GuideKitRepository.kt", l = {120, 143, 144, 147}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv80/b0;", "Lu70/q;", "Lzendesk/guidekit/android/model/GuideArticle;", "<anonymous>", "(Lv80/b0;)Lu70/q;"}, k = 3, mv = {2, 1, 0})
public final class GuideKitRepository$getArticle$2 extends i implements Function2<b0, c<? super q<? extends GuideArticle>>, Object> {
    final /* synthetic */ long $articleId;
    final /* synthetic */ String $baseUrl;
    final /* synthetic */ GuideLocale $guideLocale;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GuideKitRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuideKitRepository$getArticle$2(GuideKitRepository guideKitRepository, long j9, GuideLocale guideLocale, String str, c<? super GuideKitRepository$getArticle$2> cVar) {
        super(2, cVar);
        this.this$0 = guideKitRepository;
        this.$articleId = j9;
        this.$guideLocale = guideLocale;
        this.$baseUrl = str;
    }

    @Override // z70.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        GuideKitRepository$getArticle$2 guideKitRepository$getArticle$2 = new GuideKitRepository$getArticle$2(this.this$0, this.$articleId, this.$guideLocale, this.$baseUrl, cVar);
        guideKitRepository$getArticle$2.L$0 = obj;
        return guideKitRepository$getArticle$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(b0 b0Var, c<? super q<GuideArticle>> cVar) {
        return ((GuideKitRepository$getArticle$2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010a  */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.guidekit.android.internal.data.GuideKitRepository$getArticle$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
