package pm;

import com.app.tgtg.feature.main.fragments.browse.map.bottomSheet.MapBottomSheet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import y80.y1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f35527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f35528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f35529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f35530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function0 f35531f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u70.f f35532g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u70.f f35533h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ u70.f f35534i;

    public /* synthetic */ o(boolean z11, boolean z12, y1 y1Var, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, int i11) {
        this.f35526a = 2;
        this.f35529d = z11;
        this.f35530e = z12;
        this.f35527b = y1Var;
        this.f35531f = function0;
        this.f35528c = function02;
        this.f35532g = function03;
        this.f35533h = function04;
        this.f35534i = function05;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f35526a;
        u70.f fVar = this.f35534i;
        u70.f fVar2 = this.f35533h;
        u70.f fVar3 = this.f35532g;
        Object obj3 = this.f35528c;
        Object obj4 = this.f35527b;
        switch (i11) {
            case 0:
                ((Integer) obj2).getClass();
                int i12 = MapBottomSheet.f9095y;
                int iF = m3.i.F(1);
                ((MapBottomSheet) obj4).i((List) obj3, this.f35529d, this.f35530e, this.f35531f, (Function1) fVar3, (Function1) fVar2, (Function1) fVar, (m3.n) obj, iF);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int i13 = MapBottomSheet.f9095y;
                int iF2 = m3.i.F(1);
                ((MapBottomSheet) obj4).i((List) obj3, this.f35529d, this.f35530e, this.f35531f, (Function1) fVar3, (Function1) fVar2, (Function1) fVar, (m3.n) obj, iF2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iF3 = m3.i.F(1);
                ba0.g.f(this.f35529d, this.f35530e, (y1) obj4, this.f35531f, (Function0) obj3, (Function0) fVar3, (Function0) fVar2, (Function0) fVar, (m3.n) obj, iF3);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ o(MapBottomSheet mapBottomSheet, List list, boolean z11, boolean z12, Function0 function0, Function1 function1, Function1 function12, Function1 function13, int i11, int i12) {
        this.f35526a = i12;
        this.f35527b = mapBottomSheet;
        this.f35528c = list;
        this.f35529d = z11;
        this.f35530e = z12;
        this.f35531f = function0;
        this.f35532g = function1;
        this.f35533h = function12;
        this.f35534i = function13;
    }
}
