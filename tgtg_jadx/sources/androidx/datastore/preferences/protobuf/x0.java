package androidx.datastore.preferences.protobuf;

import com.braze.h2;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x0 f3059c = new x0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f3061b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f3060a = new i0();

    public final a1 a(Class cls) {
        o oVar;
        a1 a1VarW;
        Class cls2;
        b0.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f3061b;
        a1 a1Var = (a1) concurrentHashMap.get(cls);
        if (a1Var != null) {
            return a1Var;
        }
        i0 i0Var = this.f3060a;
        i0Var.getClass();
        Class cls3 = b1.f2932a;
        if (!z.class.isAssignableFrom(cls) && (cls2 = b1.f2932a) != null && !cls2.isAssignableFrom(cls)) {
            i4.a.f("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        z0 z0VarA = ((h0) i0Var.f2990a).a(cls);
        int i11 = z0VarA.f3069d;
        a aVar = z0VarA.f3066a;
        if ((i11 & 2) == 2) {
            if (z.class.isAssignableFrom(cls)) {
                a1VarW = new r0(b1.f2934c, p.f3024a, aVar);
            } else {
                g1 g1Var = b1.f2933b;
                o oVar2 = p.f3025b;
                if (oVar2 == null) {
                    h2.b("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                a1VarW = new r0(g1Var, oVar2, aVar);
            }
        } else if (z.class.isAssignableFrom(cls)) {
            s0 s0Var = t0.f3053b;
            e0 e0Var = f0.f2961b;
            i1 i1Var = b1.f2934c;
            o oVar3 = g0.f2971a[z0VarA.a().ordinal()] != 1 ? p.f3024a : null;
            m0 m0Var = n0.f3015b;
            if (!(z0VarA instanceof z0)) {
                int[] iArr = q0.f3029n;
                z0VarA.getClass();
                org.bouncycastle.jce.provider.a.c();
                return null;
            }
            a1VarW = q0.w(z0VarA, s0Var, e0Var, i1Var, oVar3, m0Var);
        } else {
            s0 s0Var2 = t0.f3052a;
            e0 e0Var2 = f0.f2960a;
            g1 g1Var2 = b1.f2933b;
            if (g0.f2971a[z0VarA.a().ordinal()] != 1) {
                o oVar4 = p.f3025b;
                if (oVar4 == null) {
                    h2.b("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                oVar = oVar4;
            } else {
                oVar = null;
            }
            m0 m0Var2 = n0.f3014a;
            if (!(z0VarA instanceof z0)) {
                int[] iArr2 = q0.f3029n;
                z0VarA.getClass();
                org.bouncycastle.jce.provider.a.c();
                return null;
            }
            a1VarW = q0.w(z0VarA, s0Var2, e0Var2, g1Var2, oVar, m0Var2);
        }
        a1 a1Var2 = (a1) concurrentHashMap.putIfAbsent(cls, a1VarW);
        return a1Var2 != null ? a1Var2 : a1VarW;
    }
}
