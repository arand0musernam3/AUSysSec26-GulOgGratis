package g3;

import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m3.d3 f19099a = new m3.d3(new fw.b(25));

    public static final i4.v0 a(k6 k6Var, l3.s0 s0Var) {
        switch (l6.$EnumSwitchMapping$0[s0Var.ordinal()]) {
            case 1:
                return k6Var.f18965e;
            case 2:
                return k6Var.f18967g;
            case 3:
                return k6Var.f18968h;
            case 4:
                return c(k6Var.f18965e);
            case 5:
                return k6Var.f18961a;
            case 6:
                return c(k6Var.f18961a);
            case 7:
                return l2.g.f26790a;
            case 8:
                return k6Var.f18964d;
            case 9:
                return k6Var.f18966f;
            case 10:
                l2.a aVar = k6Var.f18964d;
                l2.c cVar = j6.f18900i;
                return l2.a.b(aVar, cVar, null, null, cVar, 6);
            case 11:
                return c(k6Var.f18964d);
            case 12:
                return k6Var.f18963c;
            case 13:
                return i4.g0.f23254b;
            case 14:
                return k6Var.f18962b;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                l2.a aVar2 = k6Var.f18964d;
                l2.c cVar2 = j6.f18900i;
                return l2.a.b(aVar2, null, cVar2, cVar2, null, 9);
            default:
                e40.a.f();
                return null;
        }
    }

    public static final i4.v0 b(l3.s0 s0Var, m3.n nVar) {
        return a((k6) ((m3.s) nVar).j(f19099a), s0Var);
    }

    public static l2.f c(l2.a aVar) {
        l2.c cVar = j6.f18900i;
        return l2.a.b(aVar, null, null, cVar, cVar, 3);
    }
}
