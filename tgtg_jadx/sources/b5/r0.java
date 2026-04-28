package b5;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements z5.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f5952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f5953b = 9223372034707292159L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f5954c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u0 f5955d;

    public r0(u0 u0Var) {
        this.f5955d = u0Var;
    }

    @Override // z5.c
    public final float X() {
        return this.f5955d.X();
    }

    @Override // z5.c
    public final float a() {
        return this.f5955d.a();
    }

    public final z4.z b() {
        this.f5952a = true;
        u0 u0Var = this.f5955d;
        z4.z zVarF0 = u0Var.F0();
        if (z5.j.b(this.f5953b, 9223372034707292159L)) {
            this.f5953b = a.a.J(zVarF0.z(0L));
            this.f5954c = zVarF0.u();
        }
        u0Var.I0().H.b();
        return zVarF0;
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [float[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v14, types: [byte[], java.io.Serializable] */
    public final void c(z4.q qVar, float f11) {
        u0 u0Var = this.f5955d;
        androidx.recyclerview.widget.b bVar = u0Var.f5998m;
        if (bVar == null) {
            bVar = new androidx.recyclerview.widget.b();
            u0Var.f5998m = bVar;
        }
        int iE = kotlin.collections.y.E((z4.q[]) bVar.f3664b, qVar);
        if (iE >= 0) {
            float[] fArr = (float[]) bVar.f3665c;
            if (fArr[iE] != f11) {
                fArr[iE] = f11;
                ((byte[]) bVar.f3666d)[iE] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) bVar.f3666d;
                if (bArr[iE] == 2) {
                    bArr[iE] = 0;
                    return;
                }
                return;
            }
        }
        int i11 = bVar.f3663a;
        z4.q[] qVarArr = (z4.q[]) bVar.f3664b;
        if (i11 == qVarArr.length) {
            int i12 = i11 * 2;
            bVar.f3664b = (z4.q[]) Arrays.copyOf(qVarArr, i12);
            bVar.f3665c = Arrays.copyOf((float[]) bVar.f3665c, i12);
            bVar.f3666d = Arrays.copyOf((byte[]) bVar.f3666d, i12);
        }
        ((z4.q[]) bVar.f3664b)[i11] = qVar;
        ((byte[]) bVar.f3666d)[i11] = 3;
        ((float[]) bVar.f3665c)[i11] = f11;
        bVar.f3663a++;
    }
}
