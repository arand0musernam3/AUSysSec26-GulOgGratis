package td;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f39987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineContext f39988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineContext f39989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function1 f39990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function1 f39991e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Function1 f39992f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ud.i f39993g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ud.g f39994h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ud.d f39995i;

    public g(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, Function1 function1, Function1 function12, Function1 function13, ud.i iVar, ud.g gVar, ud.d dVar) {
        this.f39987a = coroutineContext;
        this.f39988b = coroutineContext2;
        this.f39989c = coroutineContext3;
        this.f39990d = function1;
        this.f39991e = function12;
        this.f39992f = function13;
        this.f39993g = iVar;
        this.f39994h = gVar;
        this.f39995i = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f39987a, gVar.f39987a) && Intrinsics.areEqual(this.f39988b, gVar.f39988b) && Intrinsics.areEqual(this.f39989c, gVar.f39989c) && Intrinsics.areEqual(this.f39990d, gVar.f39990d) && Intrinsics.areEqual(this.f39991e, gVar.f39991e) && Intrinsics.areEqual(this.f39992f, gVar.f39992f) && Intrinsics.areEqual(this.f39993g, gVar.f39993g) && this.f39994h == gVar.f39994h && this.f39995i == gVar.f39995i;
    }

    public final int hashCode() {
        CoroutineContext coroutineContext = this.f39987a;
        int iHashCode = (coroutineContext == null ? 0 : coroutineContext.hashCode()) * 31;
        CoroutineContext coroutineContext2 = this.f39988b;
        int iHashCode2 = (iHashCode + (coroutineContext2 == null ? 0 : coroutineContext2.hashCode())) * 31;
        CoroutineContext coroutineContext3 = this.f39989c;
        int iHashCode3 = (iHashCode2 + (coroutineContext3 == null ? 0 : coroutineContext3.hashCode())) * 923521;
        Function1 function1 = this.f39990d;
        int iHashCode4 = (iHashCode3 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function1 function12 = this.f39991e;
        int iHashCode5 = (iHashCode4 + (function12 == null ? 0 : function12.hashCode())) * 31;
        Function1 function13 = this.f39992f;
        int iHashCode6 = (iHashCode5 + (function13 == null ? 0 : function13.hashCode())) * 31;
        ud.i iVar = this.f39993g;
        int iHashCode7 = (iHashCode6 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        ud.g gVar = this.f39994h;
        int iHashCode8 = (iHashCode7 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        ud.d dVar = this.f39995i;
        return iHashCode8 + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        return "Defined(fileSystem=null, interceptorCoroutineContext=" + this.f39987a + ", fetcherCoroutineContext=" + this.f39988b + ", decoderCoroutineContext=" + this.f39989c + ", memoryCachePolicy=null, diskCachePolicy=null, networkCachePolicy=null, placeholderFactory=" + this.f39990d + ", errorFactory=" + this.f39991e + ", fallbackFactory=" + this.f39992f + ", sizeResolver=" + this.f39993g + ", scale=" + this.f39994h + ", precision=" + this.f39995i + ")";
    }
}
