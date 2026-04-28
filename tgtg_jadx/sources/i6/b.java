package i6;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends xz.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double[] f23405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a[] f23406e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Type inference failed for: r0v0, types: [i6.b, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(int[] r33, double[] r34, double[][] r35) {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i6.b.<init>(int[], double[], double[][]):void");
    }

    @Override // xz.b
    public final double u(double d3) {
        a[] aVarArr = this.f23406e;
        a aVar = aVarArr[0];
        double d11 = aVar.f23390c;
        if (d3 < d11) {
            double d12 = d3 - d11;
            if (aVar.f23404r) {
                return (d12 * aVarArr[0].l) + aVar.c(d11);
            }
            aVar.g(d11);
            return (aVarArr[0].a() * d12) + aVarArr[0].e();
        }
        if (d3 > aVarArr[aVarArr.length - 1].f23391d) {
            double d13 = aVarArr[aVarArr.length - 1].f23391d;
            double d14 = d3 - d13;
            int length = aVarArr.length - 1;
            return (d14 * aVarArr[length].l) + aVarArr[length].c(d13);
        }
        for (int i11 = 0; i11 < aVarArr.length; i11++) {
            a aVar2 = aVarArr[i11];
            if (d3 <= aVar2.f23391d) {
                if (aVar2.f23404r) {
                    return aVar2.c(d3);
                }
                aVar2.g(d3);
                return aVarArr[i11].e();
            }
        }
        return Double.NaN;
    }

    @Override // xz.b
    public final void v(double d3, double[] dArr) {
        a[] aVarArr = this.f23406e;
        a aVar = aVarArr[0];
        double d11 = aVar.f23390c;
        if (d3 < d11) {
            double d12 = d3 - d11;
            if (aVar.f23404r) {
                double dC = aVar.c(d11);
                a aVar2 = aVarArr[0];
                dArr[0] = (aVar2.l * d12) + dC;
                dArr[1] = (d12 * aVarArr[0].f23399m) + aVar2.d(d11);
                return;
            }
            aVar.g(d11);
            dArr[0] = (aVarArr[0].a() * d12) + aVarArr[0].e();
            dArr[1] = (aVarArr[0].b() * d12) + aVarArr[0].f();
            return;
        }
        if (d3 <= aVarArr[aVarArr.length - 1].f23391d) {
            for (int i11 = 0; i11 < aVarArr.length; i11++) {
                a aVar3 = aVarArr[i11];
                if (d3 <= aVar3.f23391d) {
                    if (aVar3.f23404r) {
                        dArr[0] = aVar3.c(d3);
                        dArr[1] = aVarArr[i11].d(d3);
                        return;
                    } else {
                        aVar3.g(d3);
                        dArr[0] = aVarArr[i11].e();
                        dArr[1] = aVarArr[i11].f();
                        return;
                    }
                }
            }
            return;
        }
        double d13 = aVarArr[aVarArr.length - 1].f23391d;
        double d14 = d3 - d13;
        int length = aVarArr.length - 1;
        a aVar4 = aVarArr[length];
        if (aVar4.f23404r) {
            double dC2 = aVar4.c(d13);
            a aVar5 = aVarArr[length];
            dArr[0] = (aVar5.l * d14) + dC2;
            dArr[1] = (d14 * aVarArr[length].f23399m) + aVar5.d(d13);
            return;
        }
        aVar4.g(d3);
        dArr[0] = (aVarArr[length].a() * d14) + aVarArr[length].e();
        dArr[1] = (aVarArr[length].b() * d14) + aVarArr[length].f();
    }

    @Override // xz.b
    public final void w(double d3, float[] fArr) {
        a[] aVarArr = this.f23406e;
        a aVar = aVarArr[0];
        double d11 = aVar.f23390c;
        if (d3 < d11) {
            double d12 = d3 - d11;
            if (aVar.f23404r) {
                double dC = aVar.c(d11);
                a aVar2 = aVarArr[0];
                fArr[0] = (float) ((aVar2.l * d12) + dC);
                fArr[1] = (float) ((d12 * aVarArr[0].f23399m) + aVar2.d(d11));
                return;
            }
            aVar.g(d11);
            fArr[0] = (float) ((aVarArr[0].a() * d12) + aVarArr[0].e());
            fArr[1] = (float) ((aVarArr[0].b() * d12) + aVarArr[0].f());
            return;
        }
        if (d3 <= aVarArr[aVarArr.length - 1].f23391d) {
            for (int i11 = 0; i11 < aVarArr.length; i11++) {
                a aVar3 = aVarArr[i11];
                if (d3 <= aVar3.f23391d) {
                    if (aVar3.f23404r) {
                        fArr[0] = (float) aVar3.c(d3);
                        fArr[1] = (float) aVarArr[i11].d(d3);
                        return;
                    } else {
                        aVar3.g(d3);
                        fArr[0] = (float) aVarArr[i11].e();
                        fArr[1] = (float) aVarArr[i11].f();
                        return;
                    }
                }
            }
            return;
        }
        double d13 = aVarArr[aVarArr.length - 1].f23391d;
        double d14 = d3 - d13;
        int length = aVarArr.length - 1;
        a aVar4 = aVarArr[length];
        if (!aVar4.f23404r) {
            aVar4.g(d3);
            fArr[0] = (float) aVarArr[length].e();
            fArr[1] = (float) aVarArr[length].f();
        } else {
            double dC2 = aVar4.c(d13);
            a aVar5 = aVarArr[length];
            fArr[0] = (float) ((aVar5.l * d14) + dC2);
            fArr[1] = (float) ((d14 * aVarArr[length].f23399m) + aVar5.d(d13));
        }
    }

    @Override // xz.b
    public final void x(double d3, double[] dArr) {
        a[] aVarArr = this.f23406e;
        double d11 = aVarArr[0].f23390c;
        if (d3 < d11) {
            d3 = d11;
        } else if (d3 > aVarArr[aVarArr.length - 1].f23391d) {
            d3 = aVarArr[aVarArr.length - 1].f23391d;
        }
        for (int i11 = 0; i11 < aVarArr.length; i11++) {
            a aVar = aVarArr[i11];
            if (d3 <= aVar.f23391d) {
                if (aVar.f23404r) {
                    dArr[0] = aVar.l;
                    dArr[1] = aVar.f23399m;
                    return;
                } else {
                    aVar.g(d3);
                    dArr[0] = aVarArr[i11].a();
                    dArr[1] = aVarArr[i11].b();
                    return;
                }
            }
        }
    }

    @Override // xz.b
    public final double[] z() {
        return this.f23405d;
    }
}
