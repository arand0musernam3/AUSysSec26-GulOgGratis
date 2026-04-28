package zendesk.guidekit.android.internal.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.q;
import y70.a;
import z70.c;
import z70.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@e(c = "zendesk.guidekit.android.internal.data.GuideKitRepository", f = "GuideKitRepository.kt", l = {118}, m = "getArticle-BWLJW6A")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class GuideKitRepository$getArticle$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GuideKitRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuideKitRepository$getArticle$1(GuideKitRepository guideKitRepository, x70.c<? super GuideKitRepository$getArticle$1> cVar) {
        super(cVar);
        this.this$0 = guideKitRepository;
    }

    @Override // z70.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM998getArticleBWLJW6A = this.this$0.m998getArticleBWLJW6A(0L, null, null, this);
        return objM998getArticleBWLJW6A == a.COROUTINE_SUSPENDED ? objM998getArticleBWLJW6A : new q(objM998getArticleBWLJW6A);
    }
}
