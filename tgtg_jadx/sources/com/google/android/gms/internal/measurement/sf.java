package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class sf {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final qf f11855d = new qf();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sf f11856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1.k1 f11857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11858c = false;

    public /* synthetic */ sf(sf sfVar, q1.k1 k1Var) {
        if (sfVar != null) {
            na0.a.Y(sfVar.f11858c);
        }
        this.f11856a = sfVar;
        this.f11857b = k1Var;
    }

    public static sf a(sf sfVar, sf sfVar2) {
        sfVar.getClass();
        sf sfVar3 = rf.f11834e;
        if (sfVar == sfVar3) {
            return sfVar2;
        }
        sfVar2.getClass();
        if (sfVar2 == sfVar3) {
            return sfVar;
        }
        k30.m<sf> mVarL = k30.m.l(2, sfVar, sfVar2);
        if (mVarL.isEmpty()) {
            return sfVar3;
        }
        if (mVarL.size() == 1) {
            return (sf) mVarL.iterator().next();
        }
        int i11 = 0;
        for (sf sfVar4 : mVarL) {
            do {
                i11 += sfVar4.f11857b.f35782c;
                sfVar4 = sfVar4.f11856a;
            } while (sfVar4 != null);
        }
        if (i11 == 0) {
            return rf.f11834e;
        }
        q1.k1 k1Var = new q1.k1(i11);
        for (sf sfVar5 : mVarL) {
            do {
                int i12 = 0;
                while (true) {
                    q1.k1 k1Var2 = sfVar5.f11857b;
                    if (i12 >= k1Var2.f35782c) {
                        break;
                    }
                    na0.a.X("Duplicate bindings: %s", k1Var2.g(i12), k1Var.put((qf) k1Var2.g(i12), k1Var2.j(i12)) == null);
                    i12++;
                }
                sfVar5 = sfVar5.f11856a;
            } while (sfVar5 != null);
        }
        return new rf(null, k1Var).b();
    }

    public final sf b() {
        if (this.f11858c) {
            com.braze.h2.b("Already frozen");
            return null;
        }
        this.f11858c = true;
        sf sfVar = this.f11856a;
        return (sfVar == null || !this.f11857b.isEmpty()) ? this : sfVar;
    }

    public final boolean c() {
        if (this.f11857b.containsKey(f11855d)) {
            return true;
        }
        sf sfVar = this.f11856a;
        return sfVar != null && sfVar.c();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpanExtras<");
        for (sf sfVar = this; sfVar != null; sfVar = sfVar.f11856a) {
            for (int i11 = 0; i11 < sfVar.f11857b.f35782c; i11++) {
                sb2.append("[");
                sb2.append(this.f11857b.j(i11));
                sb2.append("], ");
            }
        }
        sb2.append(">");
        return sb2.toString();
    }
}
