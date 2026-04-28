package e60;

import b4.t;
import com.app.tgtg.model.remote.profile.response.LoyaltyCardDetails;
import com.app.tgtg.model.remote.profile.response.ProfileFeatureState;
import com.tgtg.componentlibrary.component.badgelabel.PantryBadgeLabelKt;
import com.tgtg.componentlibrary.component.badgelabel.model.BadgeLabelSize;
import com.tgtg.componentlibrary.component.badgelabel.model.BadgeLabelVariant;
import d2.z1;
import g3.o;
import g3.s0;
import i4.v0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m3.b1;
import m3.i;
import m3.n;
import ox.h;
import u3.d;
import v1.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15788a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f15790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f15793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f15794g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f15795h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f15796i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f15797j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f15798k;

    public /* synthetic */ b(t tVar, ProfileFeatureState profileFeatureState, LoyaltyCardDetails loyaltyCardDetails, z1 z1Var, Function0 function0, Function0 function02, boolean z11, b1 b1Var, int i11, int i12) {
        this.f15789b = tVar;
        this.f15793f = profileFeatureState;
        this.f15794g = loyaltyCardDetails;
        this.f15795h = z1Var;
        this.f15796i = function0;
        this.f15797j = function02;
        this.f15790c = z11;
        this.f15798k = b1Var;
        this.f15791d = i11;
        this.f15792e = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15788a) {
            case 0:
                ((Integer) obj2).intValue();
                PantryBadgeLabelKt.PantryBadgeLabel((String) this.f15793f, (t) this.f15789b, (String) this.f15794g, (BadgeLabelVariant) this.f15795h, (BadgeLabelSize) this.f15796i, this.f15790c, (Function2) this.f15797j, (Function2) this.f15798k, (n) obj, i.F(this.f15791d | 1), this.f15792e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                s0.n((Function0) this.f15793f, (t) this.f15789b, this.f15790c, (v0) this.f15794g, (o) this.f15795h, (a0) this.f15796i, (z1) this.f15797j, (d) this.f15798k, (n) obj, i.F(this.f15791d | 1), this.f15792e);
                break;
            case 2:
                ((Integer) obj2).getClass();
                h.f((String) this.f15793f, (String) this.f15794g, this.f15790c, (Function0) this.f15789b, (Function0) this.f15795h, (String) this.f15796i, (String) this.f15797j, (Integer) this.f15798k, (n) obj, i.F(this.f15791d | 1), this.f15792e);
                break;
            default:
                ((Integer) obj2).getClass();
                sn.a.b((t) this.f15789b, (ProfileFeatureState) this.f15793f, (LoyaltyCardDetails) this.f15794g, (z1) this.f15795h, (Function0) this.f15796i, (Function0) this.f15797j, this.f15790c, (b1) this.f15798k, (n) obj, i.F(this.f15791d | 1), this.f15792e);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ b(String str, t tVar, String str2, BadgeLabelVariant badgeLabelVariant, BadgeLabelSize badgeLabelSize, boolean z11, Function2 function2, Function2 function22, int i11, int i12) {
        this.f15793f = str;
        this.f15789b = tVar;
        this.f15794g = str2;
        this.f15795h = badgeLabelVariant;
        this.f15796i = badgeLabelSize;
        this.f15790c = z11;
        this.f15797j = function2;
        this.f15798k = function22;
        this.f15791d = i11;
        this.f15792e = i12;
    }

    public /* synthetic */ b(String str, String str2, boolean z11, Function0 function0, Function0 function02, String str3, String str4, Integer num, int i11, int i12) {
        this.f15793f = str;
        this.f15794g = str2;
        this.f15790c = z11;
        this.f15789b = function0;
        this.f15795h = function02;
        this.f15796i = str3;
        this.f15797j = str4;
        this.f15798k = num;
        this.f15791d = i11;
        this.f15792e = i12;
    }

    public /* synthetic */ b(Function0 function0, t tVar, boolean z11, v0 v0Var, o oVar, a0 a0Var, z1 z1Var, d dVar, int i11, int i12) {
        this.f15793f = function0;
        this.f15789b = tVar;
        this.f15790c = z11;
        this.f15794g = v0Var;
        this.f15795h = oVar;
        this.f15796i = a0Var;
        this.f15797j = z1Var;
        this.f15798k = dVar;
        this.f15791d = i11;
        this.f15792e = i12;
    }
}
