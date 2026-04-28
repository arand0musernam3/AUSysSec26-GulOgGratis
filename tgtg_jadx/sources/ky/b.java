package ky;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import com.app.tgtg.model.local.AppConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import n7.s;
import q5.a0;
import q5.c0;
import q5.v;
import qc.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f26684a;

    public b(Context context, int i11) {
        switch (i11) {
            case 3:
                this.f26684a = context.getApplicationContext();
                break;
            case 4:
                this.f26684a = context.getApplicationContext();
                break;
            case 5:
            case 6:
            default:
                context.getClass();
                this.f26684a = context;
                break;
            case 7:
                context.getClass();
                this.f26684a = context;
                break;
        }
    }

    public static n7.n c(b bVar, Object obj) {
        obj.getClass();
        if (Intrinsics.areEqual(obj, "androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return bVar.g();
        }
        if (obj instanceof s) {
            for (n7.m mVar : ((s) obj).f30682a) {
            }
        }
        Context context = bVar.f26684a;
        context.getClass();
        if (context.getPackageManager().hasSystemFeature("android.software.leanback") || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return bVar.g();
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            n7.p pVar = new n7.p(context);
            n7.p pVar2 = pVar.isAvailableOnDevice() ? pVar : null;
            return pVar2 == null ? bVar.g() : pVar2;
        }
        if (i11 <= 33) {
            return bVar.g();
        }
        return null;
    }

    public wy.j a() {
        Context context = this.f26684a;
        if (context == null) {
            y.g(Context.class.getCanonicalName(), " must be set");
            return null;
        }
        wy.j jVar = new wy.j();
        jVar.f43574a = yy.a.a(wy.l.f43582a);
        xy.e eVar = new xy.e(context, 1);
        jVar.f43575b = eVar;
        jVar.f43576c = yy.a.a(new dz.h(eVar, new xy.e(eVar, 0), 1));
        xy.e eVar2 = jVar.f43575b;
        jVar.f43577d = new dz.c(eVar2, 1);
        t70.a aVarA = yy.a.a(new dz.h(jVar.f43577d, yy.a.a(new dz.c(eVar2, 0)), 0));
        jVar.f43578e = aVarA;
        bz.c cVar = new bz.c(0);
        xy.e eVar3 = jVar.f43575b;
        bz.d dVar = new bz.d(eVar3, aVarA, cVar, 0);
        t70.a aVar = jVar.f43574a;
        t70.a aVar2 = jVar.f43576c;
        jVar.f43579f = yy.a.a(new bz.d(new bz.b(aVar, aVar2, dVar, aVarA, aVarA), new cz.k(eVar3, aVar2, aVarA, dVar, aVar, aVarA, aVarA), new cz.l(aVar, aVarA, dVar, aVarA), 1));
        return jVar;
    }

    public ApplicationInfo b(int i11, String str) {
        return this.f26684a.getPackageManager().getApplicationInfo(str, i11);
    }

    public PackageInfo d(int i11, String str) {
        return this.f26684a.getPackageManager().getPackageInfo(str, i11);
    }

    public boolean e() {
        int callingUid = Binder.getCallingUid();
        int iMyUid = Process.myUid();
        Context context = this.f26684a;
        if (callingUid == iMyUid) {
            return xz.b.E(context);
        }
        String nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid());
        if (nameForUid != null) {
            return context.getPackageManager().isInstantApp(nameForUid);
        }
        return false;
    }

    public Typeface f(a0 a0Var) {
        Context context = this.f26684a;
        if (!(a0Var instanceof a0)) {
            return null;
        }
        Typeface typefaceB = w6.j.b(context, a0Var.f35991a);
        typefaceB.getClass();
        q5.q qVar = a0Var.f35994d;
        ThreadLocal threadLocal = c0.f36006a;
        if (typefaceB == null) {
            return null;
        }
        if (qVar.f36036a.isEmpty()) {
            return typefaceB;
        }
        ThreadLocal threadLocal2 = c0.f36006a;
        Paint paint = (Paint) threadLocal2.get();
        if (paint == null) {
            paint = new Paint();
            threadLocal2.set(paint);
        }
        paint.setFontVariationSettings(null);
        paint.setTypeface(typefaceB);
        paint.setFontVariationSettings(v.a(qVar, context));
        return paint.getTypeface();
    }

    public n7.n g() throws PackageManager.NameNotFoundException {
        String string;
        Context context = this.f26684a;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), AppConstants.RESULT_CODE_FLASH_SALES_SURVEY);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        List listR0 = CollectionsKt.r0(arrayList);
        if (listR0.isEmpty()) {
            return null;
        }
        Iterator it = listR0.iterator();
        n7.n nVar = null;
        while (it.hasNext()) {
            try {
                Object objNewInstance = Class.forName((String) it.next()).getConstructor(Context.class).newInstance(context);
                objNewInstance.getClass();
                n7.n nVar2 = (n7.n) objNewInstance;
                if (!nVar2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (nVar != null) {
                        Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                        return null;
                    }
                    nVar = nVar2;
                }
            } catch (Throwable unused) {
            }
        }
        return nVar;
    }

    public /* synthetic */ b(Context context, short s7) {
        this.f26684a = context;
    }
}
