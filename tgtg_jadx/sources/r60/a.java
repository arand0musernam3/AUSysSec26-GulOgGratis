package r60;

import b4.t;
import com.tgtg.componentlibrary.component.iconbutton.variant.AccentPantryIconButtonKt;
import com.tgtg.componentlibrary.component.iconbutton.variant.IconOnlyPantryIconButtonKt;
import com.tgtg.componentlibrary.component.iconbutton.variant.SubtlePantryIconButtonKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m3.i;
import m3.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f37735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f37736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f37737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f37738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f37739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function2 f37740g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f37741h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f37742i;

    public /* synthetic */ a(Function0 function0, t tVar, String str, boolean z11, boolean z12, Function2 function2, int i11, int i12, int i13) {
        this.f37734a = i13;
        this.f37735b = function0;
        this.f37736c = tVar;
        this.f37737d = str;
        this.f37738e = z11;
        this.f37739f = z12;
        this.f37740g = function2;
        this.f37741h = i11;
        this.f37742i = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f37734a) {
            case 0:
                ((Integer) obj2).intValue();
                AccentPantryIconButtonKt.TinyAccentPantryIconButton(this.f37735b, this.f37736c, this.f37737d, this.f37738e, this.f37739f, this.f37740g, (n) obj, i.F(this.f37741h | 1), this.f37742i);
                break;
            case 1:
                ((Integer) obj2).intValue();
                AccentPantryIconButtonKt.SmallAccentPantryIconButton(this.f37735b, this.f37736c, this.f37737d, this.f37738e, this.f37739f, this.f37740g, (n) obj, i.F(this.f37741h | 1), this.f37742i);
                break;
            case 2:
                ((Integer) obj2).intValue();
                AccentPantryIconButtonKt.MediumAccentPantryIconButton(this.f37735b, this.f37736c, this.f37737d, this.f37738e, this.f37739f, this.f37740g, (n) obj, i.F(this.f37741h | 1), this.f37742i);
                break;
            case 3:
                ((Integer) obj2).intValue();
                IconOnlyPantryIconButtonKt.TinyIconOnlyPantryIconButton(this.f37735b, this.f37736c, this.f37737d, this.f37738e, this.f37739f, this.f37740g, (n) obj, i.F(this.f37741h | 1), this.f37742i);
                break;
            case 4:
                ((Integer) obj2).intValue();
                IconOnlyPantryIconButtonKt.SmallIconOnlyPantryIconButton(this.f37735b, this.f37736c, this.f37737d, this.f37738e, this.f37739f, this.f37740g, (n) obj, i.F(this.f37741h | 1), this.f37742i);
                break;
            case 5:
                ((Integer) obj2).intValue();
                IconOnlyPantryIconButtonKt.MediumIconOnlyPantryIconButton(this.f37735b, this.f37736c, this.f37737d, this.f37738e, this.f37739f, this.f37740g, (n) obj, i.F(this.f37741h | 1), this.f37742i);
                break;
            case 6:
                ((Integer) obj2).intValue();
                SubtlePantryIconButtonKt.SmallSubtlePantryIconButton(this.f37735b, this.f37736c, this.f37737d, this.f37738e, this.f37739f, this.f37740g, (n) obj, i.F(this.f37741h | 1), this.f37742i);
                break;
            case 7:
                ((Integer) obj2).intValue();
                SubtlePantryIconButtonKt.MediumSubtlePantryIconButton(this.f37735b, this.f37736c, this.f37737d, this.f37738e, this.f37739f, this.f37740g, (n) obj, i.F(this.f37741h | 1), this.f37742i);
                break;
            default:
                ((Integer) obj2).intValue();
                SubtlePantryIconButtonKt.TinySubtlePantryIconButton(this.f37735b, this.f37736c, this.f37737d, this.f37738e, this.f37739f, this.f37740g, (n) obj, i.F(this.f37741h | 1), this.f37742i);
                break;
        }
        return Unit.f26487a;
    }
}
