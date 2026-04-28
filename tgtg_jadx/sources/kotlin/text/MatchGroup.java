package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/text/MatchGroup;", "", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class MatchGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IntRange f26585b;

    public MatchGroup(String str, IntRange intRange) {
        str.getClass();
        this.f26584a = str;
        this.f26585b = intRange;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchGroup)) {
            return false;
        }
        MatchGroup matchGroup = (MatchGroup) obj;
        return Intrinsics.areEqual(this.f26584a, matchGroup.f26584a) && Intrinsics.areEqual(this.f26585b, matchGroup.f26585b);
    }

    public final int hashCode() {
        return this.f26585b.hashCode() + (this.f26584a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f26584a + ", range=" + this.f26585b + ')';
    }
}
