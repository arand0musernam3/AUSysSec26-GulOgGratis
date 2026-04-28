package d6;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f14502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f14503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j0 f14504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f14505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z5.m f14506e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(g0 g0Var, Function0 function0, j0 j0Var, String str, z5.m mVar) {
        super(0);
        this.f14502a = g0Var;
        this.f14503b = function0;
        this.f14504c = j0Var;
        this.f14505d = str;
        this.f14506e = mVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f14502a.j(this.f14503b, this.f14504c, this.f14505d, this.f14506e);
        return Unit.f26487a;
    }
}
