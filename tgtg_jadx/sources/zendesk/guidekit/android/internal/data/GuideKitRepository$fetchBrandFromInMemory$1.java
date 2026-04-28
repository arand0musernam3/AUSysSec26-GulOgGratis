package zendesk.guidekit.android.internal.data;

import kotlin.Metadata;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.q;
import y70.a;
import z70.c;
import z70.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@e(c = "zendesk.guidekit.android.internal.data.GuideKitRepository", f = "GuideKitRepository.kt", l = {190, BERTags.PRIVATE}, m = "fetchBrandFromInMemory-IoAF18A")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class GuideKitRepository$fetchBrandFromInMemory$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GuideKitRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuideKitRepository$fetchBrandFromInMemory$1(GuideKitRepository guideKitRepository, x70.c<? super GuideKitRepository$fetchBrandFromInMemory$1> cVar) {
        super(cVar);
        this.this$0 = guideKitRepository;
    }

    @Override // z70.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Exception {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM997fetchBrandFromInMemoryIoAF18A = this.this$0.m997fetchBrandFromInMemoryIoAF18A(this);
        return objM997fetchBrandFromInMemoryIoAF18A == a.COROUTINE_SUSPENDED ? objM997fetchBrandFromInMemoryIoAF18A : new q(objM997fetchBrandFromInMemoryIoAF18A);
    }
}
