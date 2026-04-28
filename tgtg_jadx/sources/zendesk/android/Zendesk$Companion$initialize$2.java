package zendesk.android;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z70.c;
import z70.e;
import zendesk.android.Zendesk;
import zendesk.android.messaging.MessagingFactory;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@e(c = "zendesk.android.Zendesk$Companion", f = "Zendesk.kt", l = {402, 347, 360}, m = "initialize")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class Zendesk$Companion$initialize$2 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Zendesk.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Zendesk$Companion$initialize$2(Zendesk.Companion companion, x70.c<? super Zendesk$Companion$initialize$2> cVar) {
        super(cVar);
        this.this$0 = companion;
    }

    @Override // z70.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.initialize((Context) null, (String) null, (MessagingFactory) null, false, (x70.c) this);
    }
}
