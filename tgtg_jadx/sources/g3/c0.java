package g3;

import com.tgtg.componentlibrary.component.checkbox.PantryCheckboxKt;
import com.tgtg.componentlibrary.component.checkbox.model.CheckboxColors;
import com.tgtg.componentlibrary.component.checkbox.model.CheckboxGeometry;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18392a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f18394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f18395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f18396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f18397f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f18398g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f18399h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f18400i;

    public /* synthetic */ c0(b4.t tVar, Function0 function0, boolean z11, i4.v0 v0Var, f2 f2Var, b2.l lVar, Function2 function2, int i11) {
        this.f18393b = tVar;
        this.f18394c = function0;
        this.f18395d = z11;
        this.f18397f = v0Var;
        this.f18398g = f2Var;
        this.f18399h = lVar;
        this.f18400i = function2;
        this.f18396e = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18392a) {
            case 0:
                ((Integer) obj2).getClass();
                g0.c((l5.a) this.f18397f, this.f18394c, (k4.h) this.f18398g, (k4.h) this.f18399h, (b4.t) this.f18393b, this.f18395d, (z) this.f18400i, (m3.n) obj, m3.i.F(this.f18396e | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                s0.i((b4.t) this.f18393b, this.f18394c, this.f18395d, (i4.v0) this.f18397f, (f2) this.f18398g, (b2.l) this.f18399h, (Function2) this.f18400i, (m3.n) obj, m3.i.F(this.f18396e | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                j4.c((u3.d) this.f18397f, (u3.d) this.f18398g, (u3.d) this.f18399h, (Function2) this.f18393b, this.f18395d, this.f18394c, (Function0) this.f18400i, (m3.n) obj, m3.i.F(this.f18396e | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                PantryCheckboxKt.a((l5.a) this.f18397f, this.f18394c, (b2.l) this.f18398g, (CheckboxColors) this.f18399h, (CheckboxGeometry) this.f18400i, (b4.t) this.f18393b, this.f18395d, (m3.n) obj, m3.i.F(this.f18396e | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                tp.b.f((List) this.f18397f, (List) this.f18398g, (op.c) this.f18399h, this.f18395d, (Function1) this.f18393b, (Function1) this.f18400i, this.f18394c, (m3.n) obj, m3.i.F(this.f18396e | 1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ c0(List list, List list2, op.c cVar, boolean z11, Function1 function1, Function1 function12, Function0 function0, int i11) {
        this.f18397f = list;
        this.f18398g = list2;
        this.f18399h = cVar;
        this.f18395d = z11;
        this.f18393b = function1;
        this.f18400i = function12;
        this.f18394c = function0;
        this.f18396e = i11;
    }

    public /* synthetic */ c0(l5.a aVar, Function0 function0, b2.l lVar, CheckboxColors checkboxColors, CheckboxGeometry checkboxGeometry, b4.t tVar, boolean z11, int i11) {
        this.f18397f = aVar;
        this.f18394c = function0;
        this.f18398g = lVar;
        this.f18399h = checkboxColors;
        this.f18400i = checkboxGeometry;
        this.f18393b = tVar;
        this.f18395d = z11;
        this.f18396e = i11;
    }

    public /* synthetic */ c0(l5.a aVar, Function0 function0, k4.h hVar, k4.h hVar2, b4.t tVar, boolean z11, z zVar, int i11) {
        this.f18397f = aVar;
        this.f18394c = function0;
        this.f18398g = hVar;
        this.f18399h = hVar2;
        this.f18393b = tVar;
        this.f18395d = z11;
        this.f18400i = zVar;
        this.f18396e = i11;
    }

    public /* synthetic */ c0(u3.d dVar, u3.d dVar2, u3.d dVar3, Function2 function2, boolean z11, Function0 function0, Function0 function02, int i11) {
        this.f18397f = dVar;
        this.f18398g = dVar2;
        this.f18399h = dVar3;
        this.f18393b = function2;
        this.f18395d = z11;
        this.f18394c = function0;
        this.f18400i = function02;
        this.f18396e = i11;
    }
}
