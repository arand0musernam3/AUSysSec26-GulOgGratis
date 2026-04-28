package androidx.vectordrawable.graphics.drawable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x6.e[] f4074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f4075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4076c;

    public n(n nVar) {
        this.f4074a = null;
        this.f4076c = 0;
        this.f4075b = nVar.f4075b;
        x6.e[] eVarArr = nVar.f4074a;
        x6.e[] eVarArr2 = new x6.e[eVarArr.length];
        for (int i11 = 0; i11 < eVarArr.length; i11++) {
            eVarArr2[i11] = new x6.e(eVarArr[i11]);
        }
        this.f4074a = eVarArr2;
    }

    public x6.e[] getPathData() {
        return this.f4074a;
    }

    public String getPathName() {
        return this.f4075b;
    }

    public void setPathData(x6.e[] eVarArr) {
        x6.e[] eVarArr2 = this.f4074a;
        if (eVarArr2 != null && eVarArr != null && eVarArr2.length == eVarArr.length) {
            for (int i11 = 0; i11 < eVarArr2.length; i11++) {
                x6.e eVar = eVarArr2[i11];
                char c3 = eVar.f43877a;
                x6.e eVar2 = eVarArr[i11];
                if (c3 == eVar2.f43877a && eVar.f43878b.length == eVar2.f43878b.length) {
                }
            }
            x6.e[] eVarArr3 = this.f4074a;
            for (int i12 = 0; i12 < eVarArr.length; i12++) {
                eVarArr3[i12].f43877a = eVarArr[i12].f43877a;
                int i13 = 0;
                while (true) {
                    float[] fArr = eVarArr[i12].f43878b;
                    if (i13 < fArr.length) {
                        eVarArr3[i12].f43878b[i13] = fArr[i13];
                        i13++;
                    }
                }
            }
            return;
        }
        x6.e[] eVarArr4 = new x6.e[eVarArr.length];
        for (int i14 = 0; i14 < eVarArr.length; i14++) {
            eVarArr4[i14] = new x6.e(eVarArr[i14]);
        }
        this.f4074a = eVarArr4;
    }

    public n() {
        this.f4074a = null;
        this.f4076c = 0;
    }
}
