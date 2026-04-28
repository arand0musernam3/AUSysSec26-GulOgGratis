package zendesk.guidekit.android.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.q;
import y70.a;
import z70.c;
import z70.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@e(c = "zendesk.guidekit.android.internal.DefaultGuideKit", f = "DefaultGuideKit.kt", l = {52}, m = "getArticle-BWLJW6A")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class DefaultGuideKit$getArticle$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultGuideKit this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultGuideKit$getArticle$1(DefaultGuideKit defaultGuideKit, x70.c<? super DefaultGuideKit$getArticle$1> cVar) {
        super(cVar);
        this.this$0 = defaultGuideKit;
    }

    @Override // z70.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo994getArticleBWLJW6A = this.this$0.mo994getArticleBWLJW6A(null, 0L, null, this);
        return objMo994getArticleBWLJW6A == a.COROUTINE_SUSPENDED ? objMo994getArticleBWLJW6A : new q(objMo994getArticleBWLJW6A);
    }
}
