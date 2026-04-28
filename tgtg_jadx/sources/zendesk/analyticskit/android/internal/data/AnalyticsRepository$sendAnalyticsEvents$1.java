package zendesk.analyticskit.android.internal.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.q;
import y70.a;
import z70.c;
import z70.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@e(c = "zendesk.analyticskit.android.internal.data.AnalyticsRepository", f = "AnalyticsRepository.kt", l = {153}, m = "sendAnalyticsEvents-gIAlu-s")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class AnalyticsRepository$sendAnalyticsEvents$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AnalyticsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsRepository$sendAnalyticsEvents$1(AnalyticsRepository analyticsRepository, x70.c<? super AnalyticsRepository$sendAnalyticsEvents$1> cVar) {
        super(cVar);
        this.this$0 = analyticsRepository;
    }

    @Override // z70.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM990sendAnalyticsEventsgIAlus = this.this$0.m990sendAnalyticsEventsgIAlus(null, this);
        return objM990sendAnalyticsEventsgIAlus == a.COROUTINE_SUSPENDED ? objM990sendAnalyticsEventsgIAlus : new q(objM990sendAnalyticsEventsgIAlus);
    }
}
