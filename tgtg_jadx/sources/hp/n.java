package hp;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
@SourceDebugExtension({"SMAP\nRecipeGeneratorAsyncResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecipeGeneratorAsyncResponse.kt\ncom/app/tgtg/feature/recipegenerator/model/RecipeGeneratorAsyncResponse\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1#2:28\n*E\n"})
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f22309e;

    public /* synthetic */ n(int i11, String str, long j9, String str2, String str3, Long l) {
        if (31 != (i11 & 31)) {
            m90.c1.j(i11, 31, l.f22299a.getDescriptor());
            throw null;
        }
        this.f22305a = str;
        this.f22306b = j9;
        this.f22307c = str2;
        this.f22308d = str3;
        this.f22309e = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.areEqual(this.f22305a, nVar.f22305a) && this.f22306b == nVar.f22306b && Intrinsics.areEqual(this.f22307c, nVar.f22307c) && Intrinsics.areEqual(this.f22308d, nVar.f22308d) && Intrinsics.areEqual(this.f22309e, nVar.f22309e);
    }

    public final int hashCode() {
        int iB = w2.l1.b(e0.f.b(this.f22305a.hashCode() * 31, 31, this.f22306b), 31, this.f22307c);
        String str = this.f22308d;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.f22309e;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b3.i.n(this.f22306b, "RecipeGeneratorAsyncResponse(pollingId=", this.f22305a, ", pollingIntervalMilliseconds=");
        j4.s.A(sbN, ", userStatus=", this.f22307c, ", rateLimitInterval=", this.f22308d);
        sbN.append(", rateLimitRetryAfterSeconds=");
        sbN.append(this.f22309e);
        sbN.append(")");
        return sbN.toString();
    }
}
