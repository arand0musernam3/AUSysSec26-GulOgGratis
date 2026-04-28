package androidx.compose.foundation;

import b2.l;
import b4.s;
import b5.h1;
import c5.l3;
import c5.o2;
import com.braze.models.FeatureFlag;
import j5.j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import r8.k;
import v1.b0;
import v1.e1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ClickableElement;", "Lb5/h1;", "Lv1/b0;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ClickableElement extends h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f2233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e1 f2234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f2235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f2236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f2237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f2238g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Function0 f2239h;

    public ClickableElement(l lVar, e1 e1Var, boolean z11, boolean z12, String str, j jVar, Function0 function0) {
        this.f2233b = lVar;
        this.f2234c = e1Var;
        this.f2235d = z11;
        this.f2236e = z12;
        this.f2237f = str;
        this.f2238g = jVar;
        this.f2239h = function0;
    }

    @Override // b5.h1
    public final s create() {
        return new b0(this.f2233b, this.f2234c, this.f2235d, this.f2236e, this.f2237f, this.f2238g, this.f2239h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return Intrinsics.areEqual(this.f2233b, clickableElement.f2233b) && Intrinsics.areEqual(this.f2234c, clickableElement.f2234c) && this.f2235d == clickableElement.f2235d && this.f2236e == clickableElement.f2236e && Intrinsics.areEqual(this.f2237f, clickableElement.f2237f) && Intrinsics.areEqual(this.f2238g, clickableElement.f2238g) && this.f2239h == clickableElement.f2239h;
    }

    public final int hashCode() {
        l lVar = this.f2233b;
        int iHashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        e1 e1Var = this.f2234c;
        int iE = k.e(k.e((iHashCode + (e1Var != null ? e1Var.hashCode() : 0)) * 31, 31, this.f2235d), 31, this.f2236e);
        String str = this.f2237f;
        int iHashCode2 = (iE + (str != null ? str.hashCode() : 0)) * 31;
        j jVar = this.f2238g;
        return this.f2239h.hashCode() + ((iHashCode2 + (jVar != null ? Integer.hashCode(jVar.f24632a) : 0)) * 31);
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "clickable";
        l3 l3Var = o2Var.f7309c;
        l3Var.b(Boolean.valueOf(this.f2236e), FeatureFlag.ENABLED);
        l3Var.b(this.f2239h, "onClick");
        l3Var.b(this.f2237f, "onClickLabel");
        l3Var.b(this.f2238g, "role");
        l3Var.b(this.f2233b, "interactionSource");
        l3Var.b(this.f2234c, "indicationNodeFactory");
    }

    @Override // b5.h1
    public final void update(s sVar) {
        ((b0) sVar).Z0(this.f2233b, this.f2234c, this.f2235d, this.f2236e, this.f2237f, this.f2238g, this.f2239h);
    }
}
