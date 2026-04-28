package c60;

import androidx.recyclerview.widget.r1;
import b4.t;
import com.google.android.gms.internal.measurement.cg;
import com.tgtg.componentlibrary.component.avatar.PantryAvatarKt;
import com.tgtg.componentlibrary.component.avatar.model.AvatarColors;
import com.tgtg.componentlibrary.component.avatar.model.AvatarGeometry;
import com.tgtg.componentlibrary.component.avatar.model.AvatarVariant;
import com.tgtg.componentlibrary.component.chip.model.ChipColors;
import com.tgtg.componentlibrary.component.chip.model.ChipGeometry;
import com.tgtg.componentlibrary.component.chip.model.ChipState;
import com.tgtg.componentlibrary.component.chip.type.choicechip.PantryChoiceChipKt;
import com.tgtg.componentlibrary.component.pageheader.PantryPageHeaderKt;
import com.tgtg.componentlibrary.component.pageheader.model.PageHeaderGeometry;
import com.tgtg.componentlibrary.component.pageheader.model.PageHeaderVariant;
import d2.b2;
import d2.e1;
import d2.y2;
import dn.k;
import g3.w5;
import g3.x5;
import g3.y5;
import i80.n;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.i;
import z4.m1;
import z4.t0;
import z4.z1;
import z5.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f7791f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f7792g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f7793h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f7794i;

    public /* synthetic */ f(PageHeaderVariant pageHeaderVariant, PageHeaderGeometry pageHeaderGeometry, Function0 function0, String str, Function2 function2, Function2 function22, Function2 function23, int i11) {
        this.f7786a = 5;
        this.f7788c = pageHeaderVariant;
        this.f7789d = pageHeaderGeometry;
        this.f7791f = function0;
        this.f7790e = str;
        this.f7792g = function2;
        this.f7793h = function22;
        this.f7794i = function23;
        this.f7787b = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        m1 m1Var;
        int iQ0;
        int iQ02;
        int i11;
        final r1 r1Var;
        Integer numValueOf;
        int iIntValue;
        int iQ03;
        int iC;
        switch (this.f7786a) {
            case 0:
                ((Integer) obj2).getClass();
                PantryAvatarKt.a((t) this.f7788c, (n) this.f7789d, (String) this.f7790e, (String) this.f7791f, (AvatarVariant) this.f7792g, (AvatarColors) this.f7793h, (AvatarGeometry) this.f7794i, (m3.n) obj, i.F(this.f7787b | 1));
                break;
            case 1:
                final y2 y2Var = (y2) this.f7788c;
                Function2 function2 = (Function2) this.f7789d;
                Function2 function22 = (Function2) this.f7790e;
                Function2 function23 = (Function2) this.f7791f;
                Function2 function24 = (Function2) this.f7792g;
                w5 w5Var = (w5) this.f7793h;
                Function2 function25 = (Function2) this.f7794i;
                final z1 z1Var = (z1) obj;
                z5.a aVar = (z5.a) obj2;
                float f11 = x5.f19776a;
                final int i12 = z5.a.i(aVar.f47271a);
                final int iH = z5.a.h(aVar.f47271a);
                long jB = z5.a.b(aVar.f47271a, 0, 0, 0, 0, 10);
                int iA = y2Var.a(z1Var, z1Var.getLayoutDirection());
                int iB = y2Var.b(z1Var, z1Var.getLayoutDirection());
                int iC2 = y2Var.c(z1Var);
                final m1 m1VarD = ((t0) CollectionsKt.O(z1Var.i(y5.TopBar, function2))).D(jB);
                int i13 = (-iA) - iB;
                int i14 = -iC2;
                final m1 m1VarD2 = ((t0) CollectionsKt.O(z1Var.i(y5.Snackbar, function22))).D(z5.b.i(i13, i14, jB));
                m1 m1VarD3 = ((t0) CollectionsKt.O(z1Var.i(y5.Fab, function23))).D(z5.b.i(i13, i14, jB));
                int i15 = m1VarD3.f47183a;
                int i16 = this.f7787b;
                if (i15 == 0 && m1VarD3.f47184b == 0) {
                    m1Var = m1VarD3;
                    r1Var = null;
                } else {
                    int i17 = m1VarD3.f47184b;
                    if (i16 == 0) {
                        m1Var = m1VarD3;
                        if (z1Var.getLayoutDirection() == m.Ltr) {
                            iQ0 = z1Var.q0(f11);
                            i11 = iQ0 + iA;
                        } else {
                            iQ02 = z1Var.q0(f11);
                            i11 = ((i12 - iQ02) - i15) - iB;
                        }
                    } else {
                        m1Var = m1VarD3;
                        if (i16 != 2 && i16 != 3) {
                            i11 = (((i12 - i15) + iA) - iB) / 2;
                        } else if (z1Var.getLayoutDirection() == m.Ltr) {
                            iQ02 = z1Var.q0(f11);
                            i11 = ((i12 - iQ02) - i15) - iB;
                        } else {
                            iQ0 = z1Var.q0(f11);
                            i11 = iQ0 + iA;
                        }
                    }
                    r1Var = new r1(i11, i17);
                }
                final m1 m1VarD4 = ((t0) CollectionsKt.O(z1Var.i(y5.BottomBar, function24))).D(jB);
                int i18 = 0;
                boolean z11 = m1VarD4.f47183a == 0 && m1VarD4.f47184b == 0;
                if (r1Var != null) {
                    int i19 = r1Var.f3901b;
                    if (z11 || i16 == 3) {
                        iQ03 = z1Var.q0(f11) + i19;
                        iC = y2Var.c(z1Var);
                    } else {
                        iQ03 = m1VarD4.f47184b + i19;
                        iC = z1Var.q0(f11);
                    }
                    numValueOf = Integer.valueOf(iC + iQ03);
                } else {
                    numValueOf = null;
                }
                int i21 = m1VarD2.f47184b;
                if (i21 != 0) {
                    if (numValueOf != null) {
                        iIntValue = numValueOf.intValue();
                    } else {
                        Integer numValueOf2 = !z11 ? Integer.valueOf(m1VarD4.f47184b) : null;
                        iIntValue = numValueOf2 != null ? numValueOf2.intValue() : y2Var.c(z1Var);
                    }
                    i18 = iIntValue + i21;
                }
                final int i22 = i18;
                e1 e1Var = new e1(y2Var, z1Var);
                w5Var.f19701a.setValue(new b2(d2.c.m(e1Var, z1Var.getLayoutDirection()), (m1VarD.f47183a == 0 && m1VarD.f47184b == 0) ? e1Var.c() : z1Var.O(m1VarD.f47184b), d2.c.l(e1Var, z1Var.getLayoutDirection()), z11 ? e1Var.a() : z1Var.O(m1VarD4.f47184b)));
                final m1 m1VarD5 = ((t0) CollectionsKt.O(z1Var.i(y5.MainContent, function25))).D(jB);
                final Integer num = numValueOf;
                final m1 m1Var2 = m1Var;
                break;
            case 2:
                ((Integer) obj2).getClass();
                gn.a.k((List) this.f7788c, (k) this.f7789d, (Function1) this.f7790e, (Function1) this.f7791f, (Function1) this.f7792g, (Function2) this.f7793h, (Function0) this.f7794i, (m3.n) obj, i.F(this.f7787b | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                PantryChoiceChipKt.a((String) this.f7790e, (String) this.f7791f, (ChipState) this.f7789d, (Function0) this.f7792g, (t) this.f7788c, (ChipColors) this.f7793h, (ChipGeometry) this.f7794i, (m3.n) obj, i.F(this.f7787b | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                cg.f((o9.i) this.f7789d, (r9.d) this.f7790e, (t) this.f7788c, (b4.f) this.f7791f, (Function1) this.f7792g, (Function1) this.f7793h, (Function2) this.f7794i, (m3.n) obj, i.F(this.f7787b | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                PantryPageHeaderKt.c((PageHeaderVariant) this.f7788c, (PageHeaderGeometry) this.f7789d, (Function0) this.f7791f, (String) this.f7790e, (Function2) this.f7792g, (Function2) this.f7793h, (Function2) this.f7794i, (m3.n) obj, i.F(this.f7787b | 1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ f(y2 y2Var, Function2 function2, Function2 function22, Function2 function23, int i11, Function2 function24, w5 w5Var, Function2 function25) {
        this.f7786a = 1;
        this.f7788c = y2Var;
        this.f7789d = function2;
        this.f7790e = function22;
        this.f7791f = function23;
        this.f7787b = i11;
        this.f7792g = function24;
        this.f7793h = w5Var;
        this.f7794i = function25;
    }

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i11, int i12) {
        this.f7786a = i12;
        this.f7788c = obj;
        this.f7789d = obj2;
        this.f7790e = obj3;
        this.f7791f = obj4;
        this.f7792g = obj5;
        this.f7793h = obj6;
        this.f7794i = obj7;
        this.f7787b = i11;
    }

    public /* synthetic */ f(String str, String str2, ChipState chipState, Function0 function0, t tVar, ChipColors chipColors, ChipGeometry chipGeometry, int i11) {
        this.f7786a = 3;
        this.f7790e = str;
        this.f7791f = str2;
        this.f7789d = chipState;
        this.f7792g = function0;
        this.f7788c = tVar;
        this.f7793h = chipColors;
        this.f7794i = chipGeometry;
        this.f7787b = i11;
    }

    public /* synthetic */ f(o9.i iVar, r9.d dVar, t tVar, b4.f fVar, Function1 function1, Function1 function12, Function2 function2, int i11) {
        this.f7786a = 4;
        this.f7789d = iVar;
        this.f7790e = dVar;
        this.f7788c = tVar;
        this.f7791f = fVar;
        this.f7792g = function1;
        this.f7793h = function12;
        this.f7794i = function2;
        this.f7787b = i11;
    }
}
