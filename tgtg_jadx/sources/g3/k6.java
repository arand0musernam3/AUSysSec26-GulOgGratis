package g3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l2.a f18961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l2.a f18962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l2.a f18963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l2.a f18964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l2.a f18965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l2.a f18966f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l2.a f18967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l2.a f18968h;

    public k6() {
        l2.f fVar = j6.f18892a;
        l2.f fVar2 = j6.f18893b;
        l2.f fVar3 = j6.f18894c;
        l2.f fVar4 = j6.f18895d;
        l2.f fVar5 = j6.f18897f;
        l2.f fVar6 = j6.f18896e;
        l2.f fVar7 = j6.f18898g;
        l2.f fVar8 = j6.f18899h;
        this.f18961a = fVar;
        this.f18962b = fVar2;
        this.f18963c = fVar3;
        this.f18964d = fVar4;
        this.f18965e = fVar5;
        this.f18966f = fVar6;
        this.f18967g = fVar7;
        this.f18968h = fVar8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k6)) {
            return false;
        }
        k6 k6Var = (k6) obj;
        return Intrinsics.areEqual(this.f18961a, k6Var.f18961a) && Intrinsics.areEqual(this.f18962b, k6Var.f18962b) && Intrinsics.areEqual(this.f18963c, k6Var.f18963c) && Intrinsics.areEqual(this.f18964d, k6Var.f18964d) && Intrinsics.areEqual(this.f18965e, k6Var.f18965e) && Intrinsics.areEqual(this.f18966f, k6Var.f18966f) && Intrinsics.areEqual(this.f18967g, k6Var.f18967g) && Intrinsics.areEqual(this.f18968h, k6Var.f18968h);
    }

    public final int hashCode() {
        return this.f18968h.hashCode() + ((this.f18967g.hashCode() + ((this.f18966f.hashCode() + ((this.f18965e.hashCode() + ((this.f18964d.hashCode() + ((this.f18963c.hashCode() + ((this.f18962b.hashCode() + (this.f18961a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f18961a + ", small=" + this.f18962b + ", medium=" + this.f18963c + ", large=" + this.f18964d + ", largeIncreased=" + this.f18966f + ", extraLarge=" + this.f18965e + ", extralargeIncreased=" + this.f18967g + ", extraExtraLarge=" + this.f18968h + ')';
    }
}
