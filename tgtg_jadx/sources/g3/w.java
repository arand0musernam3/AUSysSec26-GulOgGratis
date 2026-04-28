package g3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19664a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f19665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f19667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f19668e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f19669f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19670g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f19671h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f19672i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f19673j;

    public /* synthetic */ w(Function0 function0, b4.t tVar, boolean z11, f2 f2Var, b2.l lVar, i4.v0 v0Var, Function2 function2, int i11, int i12) {
        this.f19665b = function0;
        this.f19666c = tVar;
        this.f19667d = z11;
        this.f19671h = f2Var;
        this.f19672i = lVar;
        this.f19668e = v0Var;
        this.f19673j = function2;
        this.f19669f = i11;
        this.f19670g = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19664a) {
            case 0:
                ((Integer) obj2).getClass();
                s0.c(this.f19665b, (b4.t) this.f19666c, this.f19667d, (i4.v0) this.f19668e, (u) this.f19671h, (v) this.f19672i, (u3.d) this.f19673j, (m3.n) obj, m3.i.F(this.f19669f | 1), this.f19670g);
                break;
            case 1:
                ((Integer) obj2).getClass();
                s0.h(this.f19665b, (b4.t) this.f19666c, this.f19667d, (f2) this.f19671h, (b2.l) this.f19672i, (i4.v0) this.f19668e, (Function2) this.f19673j, (m3.n) obj, m3.i.F(this.f19669f | 1), this.f19670g);
                break;
            default:
                ((Integer) obj2).getClass();
                z20.b.a((tg.i) this.f19666c, this.f19667d, this.f19665b, (Function0) this.f19668e, (Function0) this.f19671h, (Function0) this.f19672i, (String) this.f19673j, (m3.n) obj, m3.i.F(this.f19669f | 1), this.f19670g);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ w(Function0 function0, b4.t tVar, boolean z11, i4.v0 v0Var, u uVar, v vVar, u3.d dVar, int i11, int i12) {
        this.f19665b = function0;
        this.f19666c = tVar;
        this.f19667d = z11;
        this.f19668e = v0Var;
        this.f19671h = uVar;
        this.f19672i = vVar;
        this.f19673j = dVar;
        this.f19669f = i11;
        this.f19670g = i12;
    }

    public /* synthetic */ w(tg.i iVar, boolean z11, Function0 function0, Function0 function02, Function0 function03, Function0 function04, String str, int i11, int i12) {
        this.f19666c = iVar;
        this.f19667d = z11;
        this.f19665b = function0;
        this.f19668e = function02;
        this.f19671h = function03;
        this.f19672i = function04;
        this.f19673j = str;
        this.f19669f = i11;
        this.f19670g = i12;
    }
}
