package n3;

import java.util.Arrays;
import m3.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends nx.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f30474i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f30476k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f30477m;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public k0[] f30473h = new k0[16];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f30475j = new int[16];
    public Object[] l = new Object[16];

    public final void G() {
        this.f30474i = 0;
        this.f30476k = 0;
        Arrays.fill(this.l, 0, this.f30477m, (Object) null);
        this.f30477m = 0;
    }

    public final void H(m3.c cVar, q2 q2Var, g0.c cVar2, l0 l0Var) {
        if (J()) {
            a60.s sVar = new a60.s(this);
            m0 m0Var = (m0) sVar.f912d;
            while (true) {
                k0 k0Var = m0Var.f30473h[sVar.f909a];
                m3.a aVarB = k0Var.b(sVar);
                m3.c cVar3 = cVar;
                q2 q2Var2 = q2Var;
                g0.c cVar4 = cVar2;
                l0 l0Var2 = l0Var;
                try {
                    k0Var.a(sVar, cVar3, q2Var2, cVar4, l0Var2);
                    int i11 = sVar.f909a;
                    int i12 = m0Var.f30474i;
                    if (i11 < i12) {
                        k0 k0Var2 = m0Var.f30473h[i11];
                        sVar.f910b += k0Var2.f30469a;
                        sVar.f911c += k0Var2.f30470b;
                        int i13 = i11 + 1;
                        sVar.f909a = i13;
                        if (i13 >= i12) {
                            break;
                        }
                        cVar = cVar3;
                        q2Var = q2Var2;
                        cVar2 = cVar4;
                        l0Var = l0Var2;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        G();
    }

    public final boolean I() {
        return this.f30474i == 0;
    }

    public final boolean J() {
        return this.f30474i != 0;
    }

    public final void K(k0 k0Var) {
        int i11 = this.f30474i;
        k0[] k0VarArr = this.f30473h;
        if (i11 == k0VarArr.length) {
            k0[] k0VarArr2 = new k0[(i11 > 1024 ? 1024 : i11) + i11];
            System.arraycopy(k0VarArr, 0, k0VarArr2, 0, i11);
            this.f30473h = k0VarArr2;
        }
        int i12 = this.f30476k;
        int i13 = k0Var.f30469a;
        int i14 = k0Var.f30470b;
        int i15 = i12 + i13;
        int[] iArr = this.f30475j;
        int length = iArr.length;
        if (i15 > length) {
            int i16 = (length > 1024 ? 1024 : length) + length;
            if (i16 >= i15) {
                i15 = i16;
            }
            int[] iArr2 = new int[i15];
            kotlin.collections.x.f(0, iArr, 0, length, iArr2);
            this.f30475j = iArr2;
        }
        int i17 = this.f30477m + i14;
        Object[] objArr = this.l;
        int length2 = objArr.length;
        if (i17 > length2) {
            int i18 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i18 >= i17) {
                i17 = i18;
            }
            Object[] objArr2 = new Object[i17];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.l = objArr2;
        }
        k0[] k0VarArr3 = this.f30473h;
        int i19 = this.f30474i;
        this.f30474i = i19 + 1;
        k0VarArr3[i19] = k0Var;
        this.f30476k += k0Var.f30469a;
        this.f30477m += i14;
    }
}
