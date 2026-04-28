package androidx.compose.foundation;

import b2.l;
import b4.s;
import b5.h1;
import b5.m;
import c5.l3;
import c5.o2;
import com.braze.models.FeatureFlag;
import j5.j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import r8.k;
import v1.h0;
import w4.m0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/CombinedClickableElement;", "Lb5/h1;", "Lv1/h0;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class CombinedClickableElement extends h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f2240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f2242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function0 f2243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f2244f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Function0 f2245g;

    public CombinedClickableElement(l lVar, j jVar, String str, String str2, Function0 function0, Function0 function02) {
        this.f2240b = lVar;
        this.f2241c = str;
        this.f2242d = jVar;
        this.f2243e = function0;
        this.f2244f = str2;
        this.f2245g = function02;
    }

    @Override // b5.h1
    public final s create() {
        String str = this.f2241c;
        return new h0(this.f2240b, this.f2242d, this.f2244f, str, this.f2243e, this.f2245g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CombinedClickableElement.class != obj.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        return Intrinsics.areEqual(this.f2240b, combinedClickableElement.f2240b) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f2241c, combinedClickableElement.f2241c) && Intrinsics.areEqual(this.f2242d, combinedClickableElement.f2242d) && this.f2243e == combinedClickableElement.f2243e && Intrinsics.areEqual(this.f2244f, combinedClickableElement.f2244f) && this.f2245g == combinedClickableElement.f2245g;
    }

    public final int hashCode() {
        l lVar = this.f2240b;
        int iE = k.e(k.e((lVar != null ? lVar.hashCode() : 0) * 961, 31, false), 31, true);
        String str = this.f2241c;
        int iHashCode = (iE + (str != null ? str.hashCode() : 0)) * 31;
        j jVar = this.f2242d;
        int iHashCode2 = (this.f2243e.hashCode() + ((iHashCode + (jVar != null ? Integer.hashCode(jVar.f24632a) : 0)) * 31)) * 31;
        String str2 = this.f2244f;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Function0 function0 = this.f2245g;
        return Boolean.hashCode(true) + ((iHashCode3 + (function0 != null ? function0.hashCode() : 0)) * 961);
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "combinedClickable";
        l3 l3Var = o2Var.f7309c;
        l3Var.b(null, "indicationNodeFactory");
        l3Var.b(this.f2240b, "interactionSource");
        Boolean bool = Boolean.TRUE;
        l3Var.b(bool, FeatureFlag.ENABLED);
        l3Var.b(this.f2241c, "onClickLabel");
        l3Var.b(this.f2242d, "role");
        l3Var.b(this.f2243e, "onClick");
        l3Var.b(null, "onDoubleClick");
        l3Var.b(this.f2245g, "onLongClick");
        l3Var.b(this.f2244f, "onLongClickLabel");
        l3Var.b(bool, "hapticFeedbackEnabled");
    }

    @Override // b5.h1
    public final void update(s sVar) {
        m0 m0Var;
        h0 h0Var = (h0) sVar;
        h0Var.O = true;
        String str = h0Var.M;
        String str2 = this.f2244f;
        if (!Intrinsics.areEqual(str, str2)) {
            h0Var.M = str2;
            m.g(h0Var).G();
        }
        boolean z11 = false;
        boolean z12 = h0Var.N == null;
        Function0 function0 = this.f2245g;
        if (z12 != (function0 == null)) {
            h0Var.R0();
            m.g(h0Var).G();
            z11 = true;
        }
        h0Var.N = function0;
        boolean z13 = h0Var.f41726v ? z11 : true;
        h0Var.Z0(this.f2240b, null, false, true, this.f2241c, this.f2242d, this.f2243e);
        if (!z13 || (m0Var = h0Var.f41730z) == null) {
            return;
        }
        m0Var.N0();
    }
}
