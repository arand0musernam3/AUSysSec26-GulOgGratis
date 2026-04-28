package a6;

import q1.a0;
import q1.l1;
import z5.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f826a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile l1 f827b = new l1(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object[] f828c;

    static {
        Object[] objArr = new Object[0];
        f828c = objArr;
        synchronized (objArr) {
            f827b.d((int) 115.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f827b.d((int) 130.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f827b.d((int) 150.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f827b.d((int) 180.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f827b.d((int) 200.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((f827b.c(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        i.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static a a(float f11) {
        float fC;
        a cVar;
        float[] fArr = f826a;
        if (f11 < 1.03f) {
            return null;
        }
        int i11 = (int) (f11 * 100.0f);
        a aVar = (a) f827b.b(i11);
        if (aVar != null) {
            return aVar;
        }
        l1 l1Var = f827b;
        if (l1Var.f35785a) {
            a0.a(l1Var);
        }
        int iA = r1.a.a(l1Var.f35788d, i11, l1Var.f35786b);
        if (iA >= 0) {
            return (a) f827b.h(iA);
        }
        int i12 = -(iA + 1);
        int i13 = i12 - 1;
        if (i12 >= f827b.f()) {
            c cVar2 = new c(new float[]{1.0f}, new float[]{f11});
            b(f11, cVar2);
            return cVar2;
        }
        if (i13 < 0) {
            cVar = new c(fArr, fArr);
            fC = 1.0f;
        } else {
            fC = f827b.c(i13) / 100.0f;
            cVar = (a) f827b.h(i13);
        }
        float fC2 = f827b.c(i12) / 100.0f;
        float fMax = (Math.max(0.0f, Math.min(1.0f, fC == fC2 ? 0.0f : (f11 - fC) / (fC2 - fC))) * 1.0f) + 0.0f;
        a aVar2 = (a) f827b.h(i12);
        float[] fArr2 = new float[9];
        for (int i14 = 0; i14 < 9; i14++) {
            float f12 = fArr[i14];
            float fB = cVar.b(f12);
            fArr2[i14] = ((aVar2.b(f12) - fB) * fMax) + fB;
        }
        c cVar3 = new c(fArr, fArr2);
        b(f11, cVar3);
        return cVar3;
    }

    public static void b(float f11, c cVar) {
        synchronized (f828c) {
            l1 l1VarClone = f827b.clone();
            l1VarClone.d((int) (f11 * 100.0f), cVar);
            f827b = l1VarClone;
        }
    }
}
