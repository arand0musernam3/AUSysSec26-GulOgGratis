package f60;

import b4.t;
import com.tgtg.componentlibrary.component.badgelabel.variant.AccentPantryBadgeLabelKt;
import com.tgtg.componentlibrary.component.badgelabel.variant.AttentionPantryBadgeLabelKt;
import com.tgtg.componentlibrary.component.badgelabel.variant.BasePantryBadgeLabelKt;
import com.tgtg.componentlibrary.component.badgelabel.variant.NegativePantryBadgeLabelKt;
import com.tgtg.componentlibrary.component.badgelabel.variant.PositivePantryBadgeLabelKt;
import com.tgtg.componentlibrary.component.badgelabel.variant.UnavailablePantryBadgeLabelKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.i;
import m3.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f17443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f17444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f17445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function2 f17446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function2 f17447f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17448g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17449h;

    public /* synthetic */ a(String str, t tVar, String str2, Function2 function2, Function2 function22, int i11, int i12, int i13) {
        this.f17442a = i13;
        this.f17443b = str;
        this.f17444c = tVar;
        this.f17445d = str2;
        this.f17446e = function2;
        this.f17447f = function22;
        this.f17448g = i11;
        this.f17449h = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17442a) {
            case 0:
                ((Integer) obj2).intValue();
                AccentPantryBadgeLabelKt.MediumAccentPantryBadgeLabel(this.f17443b, this.f17444c, this.f17445d, this.f17446e, this.f17447f, (n) obj, i.F(this.f17448g | 1), this.f17449h);
                break;
            case 1:
                ((Integer) obj2).intValue();
                AccentPantryBadgeLabelKt.SmallAccentPantryBadgeLabel(this.f17443b, this.f17444c, this.f17445d, this.f17446e, this.f17447f, (n) obj, i.F(this.f17448g | 1), this.f17449h);
                break;
            case 2:
                ((Integer) obj2).intValue();
                AttentionPantryBadgeLabelKt.MediumAttentionPantryBadgeLabel(this.f17443b, this.f17444c, this.f17445d, this.f17446e, this.f17447f, (n) obj, i.F(this.f17448g | 1), this.f17449h);
                break;
            case 3:
                ((Integer) obj2).intValue();
                AttentionPantryBadgeLabelKt.SmallAttentionPantryBadgeLabel(this.f17443b, this.f17444c, this.f17445d, this.f17446e, this.f17447f, (n) obj, i.F(this.f17448g | 1), this.f17449h);
                break;
            case 4:
                ((Integer) obj2).intValue();
                BasePantryBadgeLabelKt.SmallBasePantryBadgeLabel(this.f17443b, this.f17444c, this.f17445d, this.f17446e, this.f17447f, (n) obj, i.F(this.f17448g | 1), this.f17449h);
                break;
            case 5:
                ((Integer) obj2).intValue();
                BasePantryBadgeLabelKt.MediumBasePantryBadgeLabel(this.f17443b, this.f17444c, this.f17445d, this.f17446e, this.f17447f, (n) obj, i.F(this.f17448g | 1), this.f17449h);
                break;
            case 6:
                ((Integer) obj2).intValue();
                NegativePantryBadgeLabelKt.SmallNegativePantryBadgeLabel(this.f17443b, this.f17444c, this.f17445d, this.f17446e, this.f17447f, (n) obj, i.F(this.f17448g | 1), this.f17449h);
                break;
            case 7:
                ((Integer) obj2).intValue();
                NegativePantryBadgeLabelKt.MediumNegativePantryBadgeLabel(this.f17443b, this.f17444c, this.f17445d, this.f17446e, this.f17447f, (n) obj, i.F(this.f17448g | 1), this.f17449h);
                break;
            case 8:
                ((Integer) obj2).intValue();
                PositivePantryBadgeLabelKt.MediumPositivePantryBadgeLabel(this.f17443b, this.f17444c, this.f17445d, this.f17446e, this.f17447f, (n) obj, i.F(this.f17448g | 1), this.f17449h);
                break;
            case 9:
                ((Integer) obj2).intValue();
                PositivePantryBadgeLabelKt.SmallPositivePantryBadgeLabel(this.f17443b, this.f17444c, this.f17445d, this.f17446e, this.f17447f, (n) obj, i.F(this.f17448g | 1), this.f17449h);
                break;
            case 10:
                ((Integer) obj2).intValue();
                UnavailablePantryBadgeLabelKt.MediumUnavailablePantryBadgeLabel(this.f17443b, this.f17444c, this.f17445d, this.f17446e, this.f17447f, (n) obj, i.F(this.f17448g | 1), this.f17449h);
                break;
            default:
                ((Integer) obj2).intValue();
                UnavailablePantryBadgeLabelKt.SmallUnavailablePantryBadgeLabel(this.f17443b, this.f17444c, this.f17445d, this.f17446e, this.f17447f, (n) obj, i.F(this.f17448g | 1), this.f17449h);
                break;
        }
        return Unit.f26487a;
    }
}
