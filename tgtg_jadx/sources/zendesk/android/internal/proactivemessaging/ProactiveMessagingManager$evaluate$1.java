package zendesk.android.internal.proactivemessaging;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z70.c;
import z70.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@e(c = "zendesk.android.internal.proactivemessaging.ProactiveMessagingManager", f = "ProactiveMessagingManager.kt", l = {76, 80, 98}, m = "evaluate$zendesk_zendesk_android")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class ProactiveMessagingManager$evaluate$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ProactiveMessagingManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProactiveMessagingManager$evaluate$1(ProactiveMessagingManager proactiveMessagingManager, x70.c<? super ProactiveMessagingManager$evaluate$1> cVar) {
        super(cVar);
        this.this$0 = proactiveMessagingManager;
    }

    @Override // z70.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.evaluate$zendesk_zendesk_android(null, this);
    }
}
