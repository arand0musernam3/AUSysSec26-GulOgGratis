package bh;

import b4.t;
import dx.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.i;
import m3.n;
import xg.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f6261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f6262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ se.b f6263d;

    public /* synthetic */ a(t tVar, b0 b0Var, se.b bVar, int i11, int i12) {
        this.f6260a = i12;
        this.f6261b = tVar;
        this.f6262c = b0Var;
        this.f6263d = bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f6260a;
        n nVar = (n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                f.b(this.f6261b, this.f6262c, this.f6263d, nVar, i.F(1));
                break;
            default:
                ex.i.e(this.f6261b, this.f6262c, this.f6263d, nVar, i.F(1));
                break;
        }
        return Unit.f26487a;
    }
}
