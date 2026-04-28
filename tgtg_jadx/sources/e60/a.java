package e60;

import com.tgtg.componentlibrary.component.badgelabel.PantryBadgeLabelDoc;
import com.tgtg.componentlibrary.component.badgelabel.model.BadgeLabelVariant;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.i;
import m3.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PantryBadgeLabelDoc f15784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BadgeLabelVariant f15785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f15786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15787e;

    public /* synthetic */ a(PantryBadgeLabelDoc pantryBadgeLabelDoc, BadgeLabelVariant badgeLabelVariant, Function2 function2, int i11, int i12) {
        this.f15783a = i12;
        this.f15784b = pantryBadgeLabelDoc;
        this.f15785c = badgeLabelVariant;
        this.f15786d = function2;
        this.f15787e = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f15783a;
        n nVar = (n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                this.f15784b.a(this.f15785c, this.f15786d, nVar, i.F(this.f15787e | 1));
                break;
            default:
                this.f15784b.b(this.f15785c, this.f15786d, nVar, i.F(this.f15787e | 1));
                break;
        }
        return Unit.f26487a;
    }
}
