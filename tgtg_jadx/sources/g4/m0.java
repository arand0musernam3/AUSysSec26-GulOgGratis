package g4;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f19954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g0 f19955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c6.f f19957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f19958f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(g0 g0Var, g0 g0Var2, Object obj, int i11, c6.f fVar, int i12) {
        super(1);
        this.f19953a = i12;
        this.f19954b = g0Var;
        this.f19955c = g0Var2;
        this.f19958f = obj;
        this.f19956d = i11;
        this.f19957e = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19953a) {
            case 0:
                z4.e eVar = (z4.e) obj;
                g0 g0Var = this.f19955c;
                if (this.f19954b != ((p) ((c5.y) b5.m.h(g0Var)).getFocusOwner()).h()) {
                    return Boolean.TRUE;
                }
                boolean zM = d.m(g0Var, (g0) this.f19958f, this.f19956d, this.f19957e);
                Boolean boolValueOf = Boolean.valueOf(zM);
                if (zM || !eVar.a()) {
                    return boolValueOf;
                }
                return null;
            default:
                z4.e eVar2 = (z4.e) obj;
                g0 g0Var2 = this.f19955c;
                if (this.f19954b != ((p) ((c5.y) b5.m.h(g0Var2)).getFocusOwner()).h()) {
                    return Boolean.TRUE;
                }
                boolean zJ = o0.j(this.f19956d, this.f19957e, g0Var2, (h4.c) this.f19958f);
                Boolean boolValueOf2 = Boolean.valueOf(zJ);
                if (zJ || !eVar2.a()) {
                    return boolValueOf2;
                }
                return null;
        }
    }
}
