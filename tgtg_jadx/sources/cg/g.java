package cg;

import com.app.tgtg.model.local.BasketManager;
import d40.t1;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.h1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7972a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f7977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f7978g;

    public /* synthetic */ g(int i11, BasketManager basketManager, h1 h1Var, int i12, Function1 function1, int i13) {
        this.f7973b = i11;
        this.f7976e = basketManager;
        this.f7977f = h1Var;
        this.f7974c = i12;
        this.f7978g = function1;
        this.f7975d = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7972a) {
            case 0:
                ((Integer) obj2).getClass();
                i.a((b4.t) this.f7976e, (String) this.f7977f, (ArrayList) this.f7978g, this.f7973b, (m3.n) obj, m3.i.F(this.f7974c | 1), this.f7975d);
                break;
            case 1:
                ((Integer) obj2).getClass();
                jb.u.a(this.f7973b, (BasketManager) this.f7976e, (h1) this.f7977f, this.f7974c, (Function1) this.f7978g, (m3.n) obj, m3.i.F(this.f7975d | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ex.i.c(this.f7973b, (Integer) this.f7976e, (String) this.f7977f, (i80.n) this.f7978g, (m3.n) obj, m3.i.F(this.f7974c | 1), this.f7975d);
                break;
            case 3:
                ((Integer) obj2).getClass();
                os.k.a((b4.t) this.f7976e, this.f7973b, this.f7974c, (String) this.f7977f, (Function1) this.f7978g, (m3.n) obj, m3.i.F(this.f7975d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iF = m3.i.F(1);
                t1.d((b4.t) this.f7976e, this.f7973b, this.f7974c, (i4.v) this.f7977f, (Function0) this.f7978g, (m3.n) obj, iF, this.f7975d);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ g(int i11, Integer num, String str, i80.n nVar, int i12, int i13) {
        this.f7973b = i11;
        this.f7976e = num;
        this.f7977f = str;
        this.f7978g = nVar;
        this.f7974c = i12;
        this.f7975d = i13;
    }

    public /* synthetic */ g(b4.t tVar, int i11, int i12, i4.v vVar, Function0 function0, int i13, int i14) {
        this.f7976e = tVar;
        this.f7973b = i11;
        this.f7974c = i12;
        this.f7977f = vVar;
        this.f7978g = function0;
        this.f7975d = i14;
    }

    public /* synthetic */ g(b4.t tVar, int i11, int i12, String str, Function1 function1, int i13) {
        this.f7976e = tVar;
        this.f7973b = i11;
        this.f7974c = i12;
        this.f7977f = str;
        this.f7978g = function1;
        this.f7975d = i13;
    }

    public /* synthetic */ g(b4.t tVar, String str, ArrayList arrayList, int i11, int i12, int i13) {
        this.f7976e = tVar;
        this.f7977f = str;
        this.f7978g = arrayList;
        this.f7973b = i11;
        this.f7974c = i12;
        this.f7975d = i13;
    }
}
