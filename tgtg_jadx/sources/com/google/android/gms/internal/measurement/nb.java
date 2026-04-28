package com.google.android.gms.internal.measurement;

import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class nb {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final nb f11663c = new nb(lb.f11598b, hb.A());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lb f11664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hb f11665b;

    public nb(lb lbVar, hb hbVar) {
        lbVar.getClass();
        this.f11664a = lbVar;
        this.f11665b = hbVar;
    }

    public static nb a(x0 x0Var, boolean z11) throws zzaeh {
        lb lbVarA;
        int iC = x0Var.C();
        if (iC > 1) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(iC).length() + 44);
            sb2.append("Unsupported version: ");
            sb2.append(iC);
            sb2.append(". Current version is: 1");
            throw new zzaeh(sb2.toString());
        }
        x0Var.C();
        int iA = x0Var.a(x0Var.A());
        c1 c1Var = c1.f11297a;
        int i11 = p0.f11740a;
        hb hbVarZ = hb.z(x0Var, c1.f11298b);
        x0Var.b(iA);
        jb jbVar = new jb();
        Inflater inflater = jbVar.f11518a;
        try {
            if (z11) {
                int iA2 = x0Var.a(x0Var.A());
                int iC2 = x0Var.c();
                try {
                    lbVarA = lb.a(x0.h(new InflaterInputStream(new ib(jbVar, x0Var), inflater, iC2 < 0 ? 4096 : Math.min(iC2, 4096)), 4096));
                    inflater.reset();
                    if (x0Var.c() != 0) {
                        throw new zzaeh("Unexpected bytes remaining after FlagsBlob parsing.");
                    }
                    x0Var.b(iA2);
                } finally {
                }
            } else {
                inflater.setInput(x0Var.z());
                try {
                    lbVarA = lb.a(x0.h(new ib(jbVar, 0), 4096));
                } finally {
                }
            }
            jbVar.close();
            return new nb(lbVarA, hbVarZ);
        } finally {
            try {
                jbVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
    }
}
