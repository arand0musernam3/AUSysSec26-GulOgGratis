package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p6 extends w6 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11747e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f11748f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f11749g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f11750h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(z6 z6Var, Activity activity, x5 x5Var) {
        super(z6Var.f12082a, true);
        this.f11747e = 3;
        this.f11749g = activity;
        this.f11750h = x5Var;
        this.f11748f = z6Var;
    }

    @Override // com.google.android.gms.internal.measurement.w6
    public final void a() {
        Boolean boolValueOf;
        Bundle bundle;
        switch (this.f11747e) {
            case 0:
                try {
                    Context context = (Context) this.f11749g;
                    com.google.android.gms.common.internal.i0.h(context);
                    String strA = y00.c2.a(context);
                    Resources resources = context.getResources();
                    if (TextUtils.isEmpty(strA)) {
                        strA = y00.c2.a(context);
                    }
                    int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", strA);
                    a6 a6VarAsInterface = null;
                    if (identifier == 0) {
                        boolValueOf = null;
                    } else {
                        try {
                            boolValueOf = Boolean.valueOf(resources.getBoolean(identifier));
                        } catch (Resources.NotFoundException unused) {
                            boolValueOf = null;
                        }
                    }
                    a7 a7Var = (a7) this.f11748f;
                    boolean z11 = boolValueOf == null || !boolValueOf.booleanValue();
                    a7Var.getClass();
                    try {
                        a6VarAsInterface = z5.asInterface(zz.d.c(context, z11 ? zz.d.f48427d : zz.d.f48426c, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                    } catch (DynamiteModule$LoadingException e5) {
                        a7Var.b(e5, true, false);
                    }
                    a7Var.f11250f = a6VarAsInterface;
                    if (a7Var.f11250f != null) {
                        int iA = zz.d.a(context, ModuleDescriptor.MODULE_ID);
                        int iD = zz.d.d(context, ModuleDescriptor.MODULE_ID, false);
                        int iMax = Math.max(iA, iD);
                        boolean z12 = Boolean.TRUE.equals(boolValueOf) || iD < iA;
                        long j9 = iMax;
                        a7Var.f11251g = j9;
                        j6 j6Var = new j6(161000L, j9, z12, (Bundle) this.f11750h, y00.c2.a(context));
                        boolean z13 = a7Var.f11251g >= 169;
                        a6 a6Var = a7Var.f11250f;
                        if (!z13) {
                            com.google.android.gms.common.internal.i0.h(a6Var);
                            a6Var.initialize(new yz.b(context), j6Var, this.f11998a);
                        } else {
                            com.google.android.gms.common.internal.i0.h(a6Var);
                            a6Var.initializeWithElapsedTime(new yz.b(context), j6Var, this.f11998a, this.f11999b);
                        }
                    } else {
                        Log.w("FA", "Failed to connect to measurement client.");
                    }
                } catch (Exception e11) {
                    ((a7) this.f11748f).b(e11, true, false);
                    return;
                }
                break;
            case 1:
                a6 a6Var2 = ((a7) this.f11748f).f11250f;
                com.google.android.gms.common.internal.i0.h(a6Var2);
                a6Var2.getMaxUserProperties((String) this.f11749g, (x5) this.f11750h);
                break;
            case 2:
                Bundle bundle2 = (Bundle) this.f11750h;
                if (bundle2 != null) {
                    bundle = new Bundle();
                    if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = bundle2.get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                } else {
                    bundle = null;
                }
                a6 a6Var3 = ((z6) this.f11748f).f12082a.f11250f;
                com.google.android.gms.common.internal.i0.h(a6Var3);
                a6Var3.onActivityCreatedByScionActivityInfo(l6.d((Activity) this.f11749g), bundle, this.f11999b);
                break;
            default:
                a6 a6Var4 = ((z6) this.f11748f).f12082a.f11250f;
                com.google.android.gms.common.internal.i0.h(a6Var4);
                a6Var4.onActivitySaveInstanceStateByScionActivityInfo(l6.d((Activity) this.f11749g), (x5) this.f11750h, this.f11999b);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.w6
    public void b() {
        switch (this.f11747e) {
            case 1:
                ((x5) this.f11750h).A(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p6(a7 a7Var, Object obj, Object obj2, int i11) {
        super(a7Var, true);
        this.f11747e = i11;
        this.f11749g = obj;
        this.f11750h = obj2;
        this.f11748f = a7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(z6 z6Var, Bundle bundle, Activity activity) {
        super(z6Var.f12082a, true);
        this.f11747e = 2;
        this.f11750h = bundle;
        this.f11749g = activity;
        this.f11748f = z6Var;
    }
}
