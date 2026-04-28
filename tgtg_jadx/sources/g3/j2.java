package g3;

import com.braze.models.FeatureFlag;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lg3/j2;", "Lb5/h1;", "Lg3/l2;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class j2 extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b2.k f18875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d9 f18876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i4.v0 f18877f;

    public j2(boolean z11, boolean z12, b2.k kVar, d9 d9Var, i4.v0 v0Var) {
        g9 g9Var = g9.f18691a;
        g9 g9Var2 = g9.f18691a;
        this.f18873b = z11;
        this.f18874c = z12;
        this.f18875d = kVar;
        this.f18876e = d9Var;
        this.f18877f = v0Var;
    }

    @Override // b5.h1
    public final b4.s create() {
        g9 g9Var = g9.f18691a;
        g9 g9Var2 = g9.f18691a;
        return new l2(this.f18873b, this.f18874c, this.f18875d, this.f18876e, this.f18877f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2)) {
            return false;
        }
        j2 j2Var = (j2) obj;
        if (this.f18873b != j2Var.f18873b || this.f18874c != j2Var.f18874c || !Intrinsics.areEqual(this.f18875d, j2Var.f18875d) || !Intrinsics.areEqual(this.f18876e, j2Var.f18876e) || !Intrinsics.areEqual(this.f18877f, j2Var.f18877f)) {
            return false;
        }
        float f11 = g9.f18695e;
        if (!z5.f.c(f11, f11)) {
            return false;
        }
        float f12 = g9.f18694d;
        return z5.f.c(f12, f12);
    }

    public final int hashCode() {
        int iHashCode = (this.f18876e.hashCode() + ((this.f18875d.hashCode() + r8.k.e(Boolean.hashCode(this.f18873b) * 31, 31, this.f18874c)) * 31)) * 31;
        i4.v0 v0Var = this.f18877f;
        return Float.hashCode(g9.f18694d) + r8.k.a((iHashCode + (v0Var == null ? 0 : v0Var.hashCode())) * 31, g9.f18695e, 31);
    }

    @Override // b5.h1
    public final void inspectableProperties(c5.o2 o2Var) {
        o2Var.f7307a = "indicatorLine";
        c5.l3 l3Var = o2Var.f7309c;
        l3Var.b(Boolean.valueOf(this.f18873b), FeatureFlag.ENABLED);
        l3Var.b(Boolean.valueOf(this.f18874c), "isError");
        l3Var.b(this.f18875d, "interactionSource");
        l3Var.b(this.f18876e, "colors");
        l3Var.b(this.f18877f, "textFieldShape");
        l3Var.b(new z5.f(g9.f18695e), "focusedIndicatorLineThickness");
        l3Var.b(new z5.f(g9.f18694d), "unfocusedIndicatorLineThickness");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IndicatorLineElement(enabled=");
        sb2.append(this.f18873b);
        sb2.append(", isError=");
        sb2.append(this.f18874c);
        sb2.append(", interactionSource=");
        sb2.append(this.f18875d);
        sb2.append(", colors=");
        sb2.append(this.f18876e);
        sb2.append(", textFieldShape=");
        sb2.append(this.f18877f);
        sb2.append(", focusedIndicatorLineThickness=");
        r8.k.u(g9.f18695e, ", unfocusedIndicatorLineThickness=", sb2);
        sb2.append((Object) z5.f.d(g9.f18694d));
        sb2.append(')');
        return sb2.toString();
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        boolean z11;
        l2 l2Var = (l2) sVar;
        float f11 = g9.f18695e;
        float f12 = g9.f18694d;
        boolean z12 = l2Var.f18998q;
        boolean z13 = this.f18873b;
        boolean z14 = true;
        if (z12 != z13) {
            l2Var.f18998q = z13;
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z15 = l2Var.f18999r;
        boolean z16 = this.f18874c;
        if (z15 != z16) {
            l2Var.f18999r = z16;
            z11 = true;
        }
        b2.k kVar = l2Var.f19000s;
        b2.k kVar2 = this.f18875d;
        if (kVar != kVar2) {
            l2Var.f19000s = kVar2;
            v80.b2 b2Var = l2Var.f19004w;
            if (b2Var != null) {
                b2Var.a(null);
            }
            l2Var.f19004w = v80.f0.B(l2Var.getCoroutineScope(), null, null, new k2(l2Var, null, 3), 3);
        }
        d9 d9Var = l2Var.f19005x;
        d9 d9Var2 = this.f18876e;
        if (!Intrinsics.areEqual(d9Var, d9Var2)) {
            l2Var.f19005x = d9Var2;
            z11 = true;
        }
        i4.v0 v0Var = l2Var.f19007z;
        i4.v0 v0Var2 = this.f18877f;
        if (!Intrinsics.areEqual(v0Var, v0Var2)) {
            if (!Intrinsics.areEqual(l2Var.f19007z, v0Var2)) {
                l2Var.f19007z = v0Var2;
                l2Var.B.L0();
            }
            z11 = true;
        }
        if (!z5.f.c(l2Var.f19001t, f11)) {
            l2Var.f19001t = f11;
            z11 = true;
        }
        if (z5.f.c(l2Var.f19002u, f12)) {
            z14 = z11;
        } else {
            l2Var.f19002u = f12;
        }
        if (z14) {
            l2Var.P0();
        }
    }
}
