package e60;

import com.tgtg.componentlibrary.component.badgelabel.PantryBadgeLabelKt;
import com.tgtg.componentlibrary.component.badgelabel.model.BadgeLabelGeometry;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.i;
import m3.n;
import m3.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15799a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BadgeLabelGeometry f15801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f15802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function2 f15803e;

    public /* synthetic */ c(String str, BadgeLabelGeometry badgeLabelGeometry, Function2 function2, Function2 function22) {
        this.f15800b = str;
        this.f15801c = badgeLabelGeometry;
        this.f15802d = function2;
        this.f15803e = function22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15799a) {
            case 0:
                n nVar = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    PantryBadgeLabelKt.a(this.f15800b, this.f15801c, this.f15802d, this.f15803e, sVar, 0);
                } else {
                    sVar.U();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                PantryBadgeLabelKt.a(this.f15800b, this.f15801c, this.f15802d, this.f15803e, (n) obj, i.F(1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ c(String str, BadgeLabelGeometry badgeLabelGeometry, Function2 function2, Function2 function22, int i11) {
        this.f15800b = str;
        this.f15801c = badgeLabelGeometry;
        this.f15802d = function2;
        this.f15803e = function22;
    }
}
