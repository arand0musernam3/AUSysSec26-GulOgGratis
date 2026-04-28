package m60;

import b4.t;
import com.tgtg.componentlibrary.component.chip.model.ChipVariant;
import com.tgtg.componentlibrary.component.chip.type.filterchip.PantryFilterChipKt;
import com.tgtg.componentlibrary.component.chip.type.selectionchip.PantrySelectionChipKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m3.i;
import m3.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f29684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f29685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f29686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f29687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ChipVariant f29688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f29689g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f29690h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f29691i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function2 f29692j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function2 f29693k;
    public final /* synthetic */ int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f29694m;

    public /* synthetic */ b(String str, Function0 function0, t tVar, String str2, ChipVariant chipVariant, boolean z11, boolean z12, boolean z13, Function2 function2, Function2 function22, int i11, int i12, int i13) {
        this.f29683a = i13;
        this.f29684b = str;
        this.f29685c = function0;
        this.f29686d = tVar;
        this.f29687e = str2;
        this.f29688f = chipVariant;
        this.f29689g = z11;
        this.f29690h = z12;
        this.f29691i = z13;
        this.f29692j = function2;
        this.f29693k = function22;
        this.l = i11;
        this.f29694m = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f29683a) {
            case 0:
                ((Integer) obj2).intValue();
                PantryFilterChipKt.PantryFilterChip(this.f29684b, this.f29685c, this.f29686d, this.f29687e, this.f29688f, this.f29689g, this.f29690h, this.f29691i, this.f29692j, this.f29693k, (n) obj, i.F(this.l | 1), this.f29694m);
                break;
            default:
                ((Integer) obj2).intValue();
                PantrySelectionChipKt.PantrySelectionChip(this.f29684b, this.f29685c, this.f29686d, this.f29687e, this.f29688f, this.f29689g, this.f29690h, this.f29691i, this.f29692j, this.f29693k, (n) obj, i.F(this.l | 1), this.f29694m);
                break;
        }
        return Unit.f26487a;
    }
}
