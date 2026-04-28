package dm;

import b4.t;
import ki.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m3.i;
import m3.n;
import y9.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f14975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f14976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f14977d;

    public /* synthetic */ f(t tVar, Function0 function0, Function0 function02, int i11, int i12) {
        this.f14974a = i12;
        this.f14975b = tVar;
        this.f14976c = function0;
        this.f14977d = function02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f14974a;
        n nVar = (n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                w.i(this.f14975b, this.f14976c, this.f14977d, nVar, i.F(49));
                break;
            case 1:
                j.i(this.f14975b, this.f14976c, this.f14977d, nVar, i.F(1));
                break;
            default:
                dx.f.c(this.f14975b, this.f14976c, this.f14977d, nVar, i.F(385));
                break;
        }
        return Unit.f26487a;
    }
}
