package m2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d1 f28804g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f28806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f28808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Boolean f28809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t5.c f28810f;

    static {
        int i11 = 0;
        f28804g = new d1(i11, i11, 127);
    }

    public /* synthetic */ d1(int i11, int i12, int i13) {
        this((i13 & 1) != 0 ? -1 : 3, (i13 & 2) != 0 ? null : Boolean.FALSE, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? -1 : i12, null, null);
    }

    public final int a() {
        int i11 = this.f28808d;
        r5.l lVar = new r5.l(i11);
        if (i11 == -1) {
            lVar = null;
        }
        if (lVar != null) {
            return lVar.f37687a;
        }
        return 1;
    }

    public final r5.m b(boolean z11) {
        int i11 = this.f28805a;
        r5.n nVar = new r5.n(i11);
        if (i11 == -1) {
            nVar = null;
        }
        int i12 = nVar != null ? nVar.f37695a : 0;
        Boolean bool = this.f28806b;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        int i13 = this.f28807c;
        r5.o oVar = i13 != 0 ? new r5.o(i13) : null;
        int i14 = oVar != null ? oVar.f37696a : 1;
        int iA = a();
        t5.c cVar = this.f28810f;
        if (cVar == null) {
            cVar = t5.c.f39795c;
        }
        return new r5.m(z11, i12, zBooleanValue, i14, iA, cVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return this.f28805a == d1Var.f28805a && Intrinsics.areEqual(this.f28806b, d1Var.f28806b) && this.f28807c == d1Var.f28807c && this.f28808d == d1Var.f28808d && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f28809e, d1Var.f28809e) && Intrinsics.areEqual(this.f28810f, d1Var.f28810f);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f28805a) * 31;
        Boolean bool = this.f28806b;
        int iB = r8.k.b(this.f28808d, r8.k.b(this.f28807c, (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31, 31), 961);
        Boolean bool2 = this.f28809e;
        int iHashCode2 = (iB + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        t5.c cVar = this.f28810f;
        return iHashCode2 + (cVar != null ? cVar.f39796a.hashCode() : 0);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) r5.n.a(this.f28805a)) + ", autoCorrectEnabled=" + this.f28806b + ", keyboardType=" + ((Object) r5.o.a(this.f28807c)) + ", imeAction=" + ((Object) r5.l.a(this.f28808d)) + ", platformImeOptions=nullshowKeyboardOnFocus=" + this.f28809e + ", hintLocales=" + this.f28810f + ')';
    }

    public d1(int i11, Boolean bool, int i12, int i13, Boolean bool2, t5.c cVar) {
        this.f28805a = i11;
        this.f28806b = bool;
        this.f28807c = i12;
        this.f28808d = i13;
        this.f28809e = bool2;
        this.f28810f = cVar;
    }
}
