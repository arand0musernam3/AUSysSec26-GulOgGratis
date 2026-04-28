package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11888a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f11889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f11890c;

    public /* synthetic */ tc(oa oaVar, String str) {
        this.f11889b = oaVar;
        this.f11890c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11888a) {
            case 0:
                Context context = ((oa) this.f11889b).f11702b;
                k30.c0 c0Var = uc.f11936d;
                if (c0Var == null) {
                    synchronized (uc.f11935c) {
                        c0Var = uc.f11936d;
                        if (c0Var == null) {
                            a3.j jVar = new a3.j(4);
                            try {
                                String[] list = context.getAssets().list("phenotype");
                                if (list != null) {
                                    for (String str : list) {
                                        if (str.endsWith("_package_metadata.binarypb")) {
                                            try {
                                                AssetManager assets = context.getAssets();
                                                StringBuilder sb2 = new StringBuilder(str.length() + 10);
                                                sb2.append("phenotype/");
                                                sb2.append(str);
                                                InputStream inputStreamOpen = assets.open(sb2.toString());
                                                try {
                                                    c1 c1Var = c1.f11297a;
                                                    int i11 = p0.f11740a;
                                                    uc ucVar = new uc(context, vc.v(inputStreamOpen, c1.f11298b));
                                                    jVar.q(ucVar.f11938b, ucVar);
                                                    if (inputStreamOpen != null) {
                                                        inputStreamOpen.close();
                                                    }
                                                } catch (Throwable th2) {
                                                    if (inputStreamOpen != null) {
                                                        try {
                                                            inputStreamOpen.close();
                                                        } catch (Throwable th3) {
                                                            th2.addSuppressed(th3);
                                                        }
                                                        break;
                                                    }
                                                    throw th2;
                                                }
                                            } catch (zzaeh e5) {
                                                StringBuilder sb3 = new StringBuilder(str.length() + 45);
                                                sb3.append("Unable to read Phenotype PackageMetadata for ");
                                                sb3.append(str);
                                                Log.e("PackageInfo", sb3.toString(), e5);
                                            }
                                        }
                                    }
                                }
                            } catch (IOException e11) {
                                Log.e("PackageInfo", "Unable to read Phenotype PackageMetadata from assets.", e11);
                            }
                            k30.c0 c0VarF = jVar.f(true);
                            uc.f11936d = c0VarF;
                            c0Var = c0VarF;
                        }
                        break;
                    }
                }
                String str2 = (String) this.f11890c;
                if (c0Var.containsKey(str2)) {
                    return;
                }
                StringBuilder sb4 = new StringBuilder(str2.length() + 173);
                sb4.append("Config package ");
                sb4.append(str2);
                sb4.append(" cannot use FILE backing without declarative registration. See go/phenotype-android-integration#phenotype for more information. This will lead to stale flags.");
                Log.e("FilePhenotypeFlags", sb4.toString());
                return;
            default:
                this.f11889b = null;
                this.f11890c = null;
                return;
        }
    }

    public /* synthetic */ tc() {
    }
}
