package f50;

import kotlin.jvm.internal.Intrinsics;
import m90.c1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@i90.h
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f17347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f17348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f17349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f17350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f17351e;

    public /* synthetic */ h(int i11, Boolean bool, Double d3, Integer num, Integer num2, Long l) {
        if (31 != (i11 & 31)) {
            c1.j(i11, 31, f.f17346a.getDescriptor());
            throw null;
        }
        this.f17347a = bool;
        this.f17348b = d3;
        this.f17349c = num;
        this.f17350d = num2;
        this.f17351e = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(this.f17347a, hVar.f17347a) && Intrinsics.areEqual((Object) this.f17348b, (Object) hVar.f17348b) && Intrinsics.areEqual(this.f17349c, hVar.f17349c) && Intrinsics.areEqual(this.f17350d, hVar.f17350d) && Intrinsics.areEqual(this.f17351e, hVar.f17351e);
    }

    public final int hashCode() {
        Boolean bool = this.f17347a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d3 = this.f17348b;
        int iHashCode2 = (iHashCode + (d3 == null ? 0 : d3.hashCode())) * 31;
        Integer num = this.f17349c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f17350d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.f17351e;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "SessionConfigs(sessionsEnabled=" + this.f17347a + ", sessionSamplingRate=" + this.f17348b + ", sessionTimeoutSeconds=" + this.f17349c + ", cacheDurationSeconds=" + this.f17350d + ", cacheUpdatedTimeSeconds=" + this.f17351e + ')';
    }

    public h(Boolean bool, Double d3, Integer num, Integer num2, Long l) {
        this.f17347a = bool;
        this.f17348b = d3;
        this.f17349c = num;
        this.f17350d = num2;
        this.f17351e = l;
    }
}
