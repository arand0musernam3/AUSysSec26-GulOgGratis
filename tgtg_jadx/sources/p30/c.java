package p30;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import u30.o;
import zw.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements t40.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f34215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f34216c;

    public /* synthetic */ c(Context context, String str) {
        this.f34214a = 1;
        this.f34215b = context;
        this.f34216c = str;
    }

    @Override // t40.b
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.f34214a) {
            case 0:
                g gVar = (g) this.f34216c;
                Context context = (Context) this.f34215b;
                String strD = gVar.d();
                y40.a aVar = new y40.a();
                Context contextCreateDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
                SharedPreferences sharedPreferences = contextCreateDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:".concat(strD), 0);
                boolean z11 = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z11 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = contextCreateDeviceProtectedStorageContext.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextCreateDeviceProtectedStorageContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z11 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                        break;
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                aVar.f45412a = z11;
                return aVar;
            case 1:
                return new r40.h((Context) this.f34215b, (String) this.f34216c);
            default:
                u30.f fVar = (u30.f) this.f34216c;
                u30.b bVar = (u30.b) this.f34215b;
                u30.e eVar = bVar.f40675f;
                q2 q2Var = new q2();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                Set<u30.i> set = bVar.f40672c;
                Set set2 = bVar.f40676g;
                for (u30.i iVar : set) {
                    int i11 = iVar.f40694c;
                    int i12 = iVar.f40693b;
                    boolean z12 = i11 == 0;
                    o oVar = iVar.f40692a;
                    if (z12) {
                        if (i12 == 2) {
                            hashSet4.add(oVar);
                        } else {
                            hashSet.add(oVar);
                        }
                    } else if (i11 == 2) {
                        hashSet3.add(oVar);
                    } else if (i12 == 2) {
                        hashSet5.add(oVar);
                    } else {
                        hashSet2.add(oVar);
                    }
                }
                if (!set2.isEmpty()) {
                    hashSet.add(o.a(q40.b.class));
                }
                q2Var.f48333a = Collections.unmodifiableSet(hashSet);
                q2Var.f48334b = Collections.unmodifiableSet(hashSet2);
                q2Var.f48335c = Collections.unmodifiableSet(hashSet3);
                q2Var.f48336d = Collections.unmodifiableSet(hashSet4);
                q2Var.f48337e = Collections.unmodifiableSet(hashSet5);
                q2Var.f48338f = fVar;
                return eVar.i(q2Var);
        }
    }

    public /* synthetic */ c(int i11, Object obj, Object obj2) {
        this.f34214a = i11;
        this.f34216c = obj;
        this.f34215b = obj2;
    }
}
