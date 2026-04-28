package n60;

import b4.t;
import com.tgtg.componentlibrary.component.chip.type.filterchip.variant.AvatarFilterChipKt;
import com.tgtg.componentlibrary.component.chip.type.filterchip.variant.IconFilterChipKt;
import com.tgtg.componentlibrary.component.chip.type.filterchip.variant.TextOnlyFilterChipKt;
import com.tgtg.componentlibrary.component.chip.type.selectionchip.variant.AvatarSelectionChipKt;
import com.tgtg.componentlibrary.component.chip.type.selectionchip.variant.IconSelectionChipKt;
import com.tgtg.componentlibrary.component.chip.type.selectionchip.variant.TextOnlySelectionChipKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m3.i;
import m3.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f30661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f30662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f30663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f30664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f30665f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f30666g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f30667h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function2 f30668i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f30669j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f30670k;

    public /* synthetic */ a(String str, boolean z11, Function0 function0, t tVar, String str2, boolean z12, boolean z13, Function2 function2, int i11, int i12, int i13) {
        this.f30660a = i13;
        this.f30661b = str;
        this.f30662c = z11;
        this.f30663d = function0;
        this.f30664e = tVar;
        this.f30665f = str2;
        this.f30666g = z12;
        this.f30667h = z13;
        this.f30668i = function2;
        this.f30669j = i11;
        this.f30670k = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f30660a) {
            case 0:
                ((Integer) obj2).intValue();
                AvatarFilterChipKt.AvatarFilterChip(this.f30661b, this.f30662c, this.f30663d, this.f30664e, this.f30665f, this.f30666g, this.f30667h, this.f30668i, (n) obj, i.F(this.f30669j | 1), this.f30670k);
                break;
            case 1:
                ((Integer) obj2).intValue();
                IconFilterChipKt.IconFilterChip(this.f30661b, this.f30662c, this.f30663d, this.f30664e, this.f30665f, this.f30666g, this.f30667h, this.f30668i, (n) obj, i.F(this.f30669j | 1), this.f30670k);
                break;
            case 2:
                ((Integer) obj2).intValue();
                TextOnlyFilterChipKt.TextOnlyFilterChip(this.f30661b, this.f30662c, this.f30663d, this.f30664e, this.f30665f, this.f30666g, this.f30667h, this.f30668i, (n) obj, i.F(this.f30669j | 1), this.f30670k);
                break;
            case 3:
                ((Integer) obj2).intValue();
                AvatarSelectionChipKt.AvatarSelectionChip(this.f30661b, this.f30662c, this.f30663d, this.f30664e, this.f30665f, this.f30666g, this.f30667h, this.f30668i, (n) obj, i.F(this.f30669j | 1), this.f30670k);
                break;
            case 4:
                ((Integer) obj2).intValue();
                IconSelectionChipKt.IconSelectionChip(this.f30661b, this.f30662c, this.f30663d, this.f30664e, this.f30665f, this.f30666g, this.f30667h, this.f30668i, (n) obj, i.F(this.f30669j | 1), this.f30670k);
                break;
            default:
                ((Integer) obj2).intValue();
                TextOnlySelectionChipKt.TextOnlySelectionChip(this.f30661b, this.f30662c, this.f30663d, this.f30664e, this.f30665f, this.f30666g, this.f30667h, this.f30668i, (n) obj, i.F(this.f30669j | 1), this.f30670k);
                break;
        }
        return Unit.f26487a;
    }
}
