package j60;

import com.tgtg.componentlibrary.component.chip.DemoPantryChipKt;
import com.tgtg.componentlibrary.component.chip.model.ChipVariant;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.i;
import m3.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChipVariant f24747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f24748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f24749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f24750e;

    public /* synthetic */ b(ChipVariant chipVariant, boolean z11, boolean z12, boolean z13, int i11, int i12) {
        this.f24746a = i12;
        this.f24747b = chipVariant;
        this.f24748c = z11;
        this.f24749d = z12;
        this.f24750e = z13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f24746a) {
            case 0:
                ((Integer) obj2).getClass();
                int iF = i.F(1);
                DemoPantryChipKt.b(this.f24747b, this.f24748c, this.f24749d, this.f24750e, (n) obj, iF);
                break;
            default:
                ((Integer) obj2).getClass();
                int iF2 = i.F(1);
                DemoPantryChipKt.c(this.f24747b, this.f24748c, this.f24749d, this.f24750e, (n) obj, iF2);
                break;
        }
        return Unit.f26487a;
    }
}
