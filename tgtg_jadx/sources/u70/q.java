package u70;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\b\u0087@\u0018\u0000 \u0004*\u0006\b\u0000\u0010\u0001 \u00012\u00060\u0002j\u0002`\u0003:\u0002\u0005\u0006\u0088\u0001\u0007\u0092\u0001\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"Lu70/q;", "T", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "b", "u70/o", "u70/p", "value", "", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q<T> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final o f40850b = new o(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f40851a;

    public /* synthetic */ q(Object obj) {
        this.f40851a = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof p) {
            return ((p) obj).f40849a;
        }
        return null;
    }

    public static final boolean b(Object obj) {
        return !(obj instanceof p);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final /* synthetic */ Object getF40851a() {
        return this.f40851a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return Intrinsics.areEqual(this.f40851a, ((q) obj).f40851a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f40851a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f40851a;
        if (obj instanceof p) {
            return ((p) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
