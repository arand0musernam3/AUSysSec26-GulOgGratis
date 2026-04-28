package gn;

import cj.e0;
import com.google.android.gms.internal.measurement.cg;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20643a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u70.f f20644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u70.f f20645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f20646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function0 f20647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f20648f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f20649g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f20650h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f20651i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f20652j;

    public /* synthetic */ r(cj.q qVar, e0 e0Var, String str, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function2 function2, int i11) {
        this.f20649g = qVar;
        this.f20650h = e0Var;
        this.f20651i = str;
        this.f20647e = function0;
        this.f20644b = function02;
        this.f20645c = function03;
        this.f20652j = function04;
        this.f20646d = function2;
        this.f20648f = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20643a) {
            case 0:
                List list = (List) this.f20649g;
                fn.c cVar = (fn.c) this.f20650h;
                ((Integer) obj2).getClass();
                a.i(m3.i.F(this.f20648f | 1), (dn.k) this.f20651i, cVar, list, this.f20647e, (Function1) this.f20644b, (Function1) this.f20645c, (Function1) this.f20652j, this.f20646d, (m3.n) obj);
                break;
            case 1:
                ((Integer) obj2).getClass();
                cg.d((ArrayList) this.f20649g, (b4.t) this.f20650h, (b4.f) this.f20651i, (o9.j) this.f20652j, (Function1) this.f20644b, (Function1) this.f20645c, this.f20646d, this.f20647e, (m3.n) obj, m3.i.F(this.f20648f | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                wi.a.g((cj.q) this.f20649g, (e0) this.f20650h, (String) this.f20651i, this.f20647e, (Function0) this.f20644b, (Function0) this.f20645c, (Function0) this.f20652j, this.f20646d, (m3.n) obj, m3.i.F(this.f20648f | 1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ r(ArrayList arrayList, b4.t tVar, b4.f fVar, o9.j jVar, Function1 function1, Function1 function12, Function2 function2, Function0 function0, int i11) {
        this.f20649g = arrayList;
        this.f20650h = tVar;
        this.f20651i = fVar;
        this.f20652j = jVar;
        this.f20644b = function1;
        this.f20645c = function12;
        this.f20646d = function2;
        this.f20647e = function0;
        this.f20648f = i11;
    }

    public /* synthetic */ r(List list, fn.c cVar, dn.k kVar, Function1 function1, Function1 function12, Function1 function13, Function2 function2, Function0 function0, int i11) {
        this.f20649g = list;
        this.f20650h = cVar;
        this.f20651i = kVar;
        this.f20644b = function1;
        this.f20645c = function12;
        this.f20652j = function13;
        this.f20646d = function2;
        this.f20647e = function0;
        this.f20648f = i11;
    }
}
