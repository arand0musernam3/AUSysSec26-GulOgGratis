package r5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m5.h f37669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f37670b;

    public e0(m5.h hVar, s sVar) {
        this.f37669a = hVar;
        this.f37670b = sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return Intrinsics.areEqual(this.f37669a, e0Var.f37669a) && Intrinsics.areEqual(this.f37670b, e0Var.f37670b);
    }

    public final int hashCode() {
        return this.f37670b.hashCode() + (this.f37669a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f37669a) + ", offsetMapping=" + this.f37670b + ')';
    }
}
