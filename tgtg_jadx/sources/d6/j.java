package d6;

import a3.v0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f14492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f14493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j0 f14494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f14495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z5.m f14496e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g0 g0Var, Function0 function0, j0 j0Var, String str, z5.m mVar) {
        super(1);
        this.f14492a = g0Var;
        this.f14493b = function0;
        this.f14494c = j0Var;
        this.f14495d = str;
        this.f14496e = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        g0 g0Var = this.f14492a;
        g0Var.f14470o.addView(g0Var, g0Var.f14471p);
        g0Var.j(this.f14493b, this.f14494c, this.f14495d, this.f14496e);
        return new v0(g0Var, 3);
    }
}
