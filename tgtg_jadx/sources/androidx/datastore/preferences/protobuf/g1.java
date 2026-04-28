package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g1 {
    public abstract h1 a(Object obj);

    public final boolean b(int i11, k kVar, Object obj) throws InvalidProtocolBufferException {
        int i12 = kVar.f2996b;
        int i13 = i12 >>> 3;
        int i14 = i12 & 7;
        if (i14 == 0) {
            kVar.w(0);
            ((h1) obj).c(i13 << 3, Long.valueOf(kVar.f2995a.n()));
            return true;
        }
        if (i14 == 1) {
            kVar.w(1);
            ((h1) obj).c((i13 << 3) | 1, Long.valueOf(kVar.f2995a.k()));
            return true;
        }
        if (i14 == 2) {
            ((h1) obj).c((i13 << 3) | 2, kVar.e());
            return true;
        }
        if (i14 != 3) {
            if (i14 == 4) {
                return false;
            }
            if (i14 != 5) {
                throw InvalidProtocolBufferException.b();
            }
            kVar.w(5);
            ((h1) obj).c(5 | (i13 << 3), Integer.valueOf(kVar.f2995a.j()));
            return true;
        }
        h1 h1Var = new h1(0, new int[8], new Object[8], true);
        int i15 = i13 << 3;
        int i16 = i15 | 4;
        int i17 = i11 + 1;
        if (i17 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (kVar.a() != Integer.MAX_VALUE && b(i17, kVar, h1Var)) {
        }
        if (i16 != kVar.f2996b) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        if (h1Var.f2986e) {
            h1Var.f2986e = false;
        }
        ((h1) obj).c(i15 | 3, h1Var);
        return true;
    }
}
