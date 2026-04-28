package ti;

import c5.t1;
import f0.f2;
import g3.g7;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ok.g0;
import v80.b0;
import v80.f0;
import y80.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f40241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f40242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0 f40243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f40244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f40245f;

    public m(b0 b0Var, m1.a aVar, String str, t1 t1Var, String str2) {
        this.f40240a = 2;
        this.f40243d = b0Var;
        this.f40241b = aVar;
        this.f40245f = str;
        this.f40242c = t1Var;
        this.f40244e = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f40240a) {
            case 0:
                s sVar = (s) this.f40241b;
                sVar.a((List) this.f40242c);
                sVar.b(new l(this.f40243d, (g7) this.f40244e, this.f40245f, 0));
                cv.i iVar = cv.i.ACTION_CUSTOM_COLLECTION_DAYS_DELETE;
                iVar.getClass();
                sVar.f40263d.b(iVar);
                break;
            case 1:
                s sVar2 = (s) this.f40241b;
                sVar2.a((List) this.f40242c);
                sVar2.b(new l(this.f40243d, (g7) this.f40244e, this.f40245f, 1));
                cv.i iVar2 = cv.i.ACTION_CUSTOM_COLLECTION_DAYS_DELETE;
                iVar2.getClass();
                sVar2.f40263d.b(iVar2);
                break;
            default:
                f0.B(this.f40243d, null, null, new mn.g((t1) this.f40242c, (String) this.f40244e, null, 20), 3);
                m1.a aVar = (m1.a) this.f40241b;
                aVar.getClass();
                String str = this.f40245f;
                str.getClass();
                f2 f2Var = (f2) aVar.f28697a;
                ((m1) f2Var.f16653f).i(new ok.n(new g0(str)));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ m(s sVar, List list, b0 b0Var, g7 g7Var, String str, int i11) {
        this.f40240a = i11;
        this.f40241b = sVar;
        this.f40242c = list;
        this.f40243d = b0Var;
        this.f40244e = g7Var;
        this.f40245f = str;
    }
}
