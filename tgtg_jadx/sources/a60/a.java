package a60;

import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f831a;

    public /* synthetic */ a(int i11) {
        this.f831a = i11;
    }

    public static void b(Type type, Class cls) {
        Class<?> clsE = h0.e(type);
        if (cls.isAssignableFrom(clsE)) {
            StringBuilder sb2 = new StringBuilder("No JsonAdapter for ");
            sb2.append(type);
            String simpleName = cls.getSimpleName();
            String simpleName2 = clsE.getSimpleName();
            sb2.append(", you should probably use ");
            sb2.append(simpleName);
            sb2.append(" instead of ");
            sb2.append(simpleName2);
            sb2.append(" (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x025b  */
    /* JADX WARN: Type inference failed for: r13v9, types: [a60.k] */
    @Override // a60.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final a60.k a(java.lang.reflect.Type r21, java.util.Set r22, a60.b0 r23) {
        /*
            Method dump skipped, instruction units count: 1322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a60.a.a(java.lang.reflect.Type, java.util.Set, a60.b0):a60.k");
    }
}
