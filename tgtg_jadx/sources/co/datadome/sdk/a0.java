package co.datadome.sdk;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import ax.p0;
import com.braze.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import zw.q2;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataDomeSDKListener f8643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f8644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q2 f8645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z f8646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p0 f8647e;

    static {
        String str = Build.VERSION.RELEASE;
        Build.VERSION_CODES.class.getFields()[Build.VERSION.SDK_INT].getName();
        String str2 = Build.MODEL;
        String str3 = Build.PRODUCT;
        String str4 = Build.MANUFACTURER;
        String str5 = Build.DEVICE;
        String str6 = Build.HARDWARE;
        String str7 = Build.FINGERPRINT;
        String str8 = Build.TAGS;
    }

    public a0(DataDomeSDKListener dataDomeSDKListener, WeakReference weakReference, q2 q2Var, z zVar, p0 p0Var) {
        this.f8644b = weakReference;
        this.f8643a = dataDomeSDKListener;
        this.f8645c = q2Var;
        this.f8646d = zVar;
        this.f8647e = p0Var;
    }

    public final q90.r a() {
        String string;
        List listSingletonList;
        q2 q2Var = this.f8645c;
        String str = (String) q2Var.f48335c;
        List list = (List) q2Var.f48337e;
        String str2 = (String) q2Var.f48336d;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = (String) q2Var.f48338f;
        String str4 = str3 != null ? str3 : "";
        if (list == null) {
            string = "[]";
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((DataDomeEvent) it.next()).customJsonString());
            }
            string = arrayList.toString();
        }
        String str5 = this.f8646d == z.f8727b ? "android-java-manual" : "android-java-okhttp";
        oz.m mVar = new oz.m(7);
        mVar.h(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY, (String) q2Var.f48333a);
        mVar.h("ddk", (String) q2Var.f48334b);
        mVar.h("request", str2);
        mVar.h("ua", str4);
        mVar.h("events", string);
        mVar.h("inte", str5);
        WeakReference weakReference = this.f8644b;
        if (weakReference == null || weakReference.get() == null) {
            DataDomeSDKListener dataDomeSDKListener = this.f8643a;
            if (dataDomeSDKListener != null) {
                dataDomeSDKListener.onError(504, "Empty application context.");
            }
        } else {
            Context applicationContext = ((Application) weakReference.get()).getApplicationContext();
            LinkedHashMap linkedHashMap = s.f8707a;
            r rVar = r.f8703a;
            rVar.getClass();
            if (Intrinsics.areEqual(s.f8707a.get(rVar), Boolean.TRUE)) {
                ArrayList arrayList2 = new ArrayList(Arrays.asList(new nc.c(applicationContext), new nc.e(), new nc.d(applicationContext), new nc.f(applicationContext), new nc.g(applicationContext), new nc.a(applicationContext, str, 0), new nc.d(this.f8647e)));
                arrayList2.add(new nc.b(applicationContext));
                listSingletonList = arrayList2;
            } else {
                listSingletonList = Collections.singletonList(new nc.a(applicationContext, str, 1));
            }
            Iterator it2 = listSingletonList.iterator();
            while (it2.hasNext()) {
                for (Map.Entry entry : ((nc.h) it2.next()).a().entrySet()) {
                    mVar.h((String) entry.getKey(), entry.getValue().toString());
                }
            }
        }
        return new q90.r((ArrayList) mVar.f33836b, (ArrayList) mVar.f33837c);
    }
}
