package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pa implements j30.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f11752b;

    public pa(Context context) {
        this.f11751a = 3;
        new ConcurrentHashMap();
        la.e(context != null, "Context cannot be null", new Object[0]);
        this.f11752b = context.getApplicationContext();
    }

    @Override // j30.l
    public Object get() {
        int i11 = this.f11751a;
        Context context = this.f11752b;
        switch (i11) {
            case 0:
                Object obj = oa.f11698j;
                final zw.q2 q2Var = new zw.q2();
                q2Var.f48333a = context;
                context.getClass();
                if (((j30.l) q2Var.f48334b) == null) {
                    q2Var.f48334b = oa.f11700m;
                }
                final int i12 = 1;
                if (((j30.l) q2Var.f48335c) == null) {
                    q2Var.f48335c = o00.h0.C(new pa((Context) q2Var.f48333a, i12));
                }
                if (((na) q2Var.f48336d) == null) {
                    q2Var.f48336d = new j30.l() { // from class: com.google.android.gms.internal.measurement.na
                        @Override // j30.l
                        public final Object get() {
                            int i13 = i12;
                            zw.q2 q2Var2 = q2Var;
                            switch (i13) {
                                case 0:
                                    Context context2 = (Context) q2Var2.f48333a;
                                    Object obj2 = oa.f11698j;
                                    try {
                                        ApplicationInfo applicationInfo = context2.getPackageManager().getApplicationInfo("com.google.android.gms", 0);
                                        applicationInfo.getClass();
                                        return new j30.i(applicationInfo);
                                    } catch (PackageManager.NameNotFoundException unused) {
                                        return j30.a.f24497a;
                                    }
                                default:
                                    return new j30.i(new ed((j30.l) q2Var2.f48334b));
                            }
                        }
                    };
                }
                final int i13 = 0;
                if (((j30.l) q2Var.f48337e) == null) {
                    Context context2 = (Context) q2Var.f48333a;
                    ArrayList arrayList = new ArrayList();
                    yd ydVar = new yd(new pa(context2));
                    new ConcurrentHashMap();
                    Collections.addAll(arrayList, ydVar, new be());
                    q2Var.f48337e = o00.h0.C(new s5(arrayList, 11));
                }
                if (((na) q2Var.f48338f) == null) {
                    q2Var.f48338f = new j30.l() { // from class: com.google.android.gms.internal.measurement.na
                        @Override // j30.l
                        public final Object get() {
                            int i132 = i13;
                            zw.q2 q2Var2 = q2Var;
                            switch (i132) {
                                case 0:
                                    Context context22 = (Context) q2Var2.f48333a;
                                    Object obj2 = oa.f11698j;
                                    try {
                                        ApplicationInfo applicationInfo = context22.getPackageManager().getApplicationInfo("com.google.android.gms", 0);
                                        applicationInfo.getClass();
                                        return new j30.i(applicationInfo);
                                    } catch (PackageManager.NameNotFoundException unused) {
                                        return j30.a.f24497a;
                                    }
                                default:
                                    return new j30.i(new ed((j30.l) q2Var2.f48334b));
                            }
                        }
                    };
                }
                return new oa((Context) q2Var.f48333a, (j30.l) q2Var.f48334b, (j30.l) q2Var.f48335c, (na) q2Var.f48336d, (j30.l) q2Var.f48337e, (na) q2Var.f48338f);
            case 1:
                Object obj2 = oa.f11698j;
                return new fb(new aa(this.f11752b, null, g1.f11429a, com.google.android.gms.common.api.d.S, com.google.android.gms.common.api.k.f11084c));
            default:
                Object obj3 = ta.f11885a;
                return la.c(context);
        }
    }

    public /* synthetic */ pa(Context context, int i11) {
        this.f11751a = i11;
        this.f11752b = context;
    }
}
