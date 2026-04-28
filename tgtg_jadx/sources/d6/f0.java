package d6;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.LongRef f14459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f14460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z5.k f14461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f14462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f14463e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Ref.LongRef longRef, g0 g0Var, z5.k kVar, long j9, long j11) {
        super(0);
        this.f14459a = longRef;
        this.f14460b = g0Var;
        this.f14461c = kVar;
        this.f14462d = j9;
        this.f14463e = j11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        g0 g0Var = this.f14460b;
        this.f14459a.element = g0Var.getPositionProvider().e(this.f14461c, this.f14462d, g0Var.getParentLayoutDirection(), this.f14463e);
        return Unit.f26487a;
    }
}
