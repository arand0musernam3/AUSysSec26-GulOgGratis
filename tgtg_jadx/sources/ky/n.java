package ky;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f26716b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, int i11) {
        super(0);
        this.f26715a = i11;
        this.f26716b = oVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f26715a) {
            case 0:
                PackageManager packageManager = (PackageManager) this.f26716b.f26718b;
                packageManager.getClass();
                List<ApplicationInfo> installedApplications = packageManager.getInstalledApplications(128);
                installedApplications.getClass();
                ArrayList arrayList = new ArrayList(e0.o(installedApplications, 10));
                for (ApplicationInfo applicationInfo : installedApplications) {
                    applicationInfo.getClass();
                    String str = applicationInfo.packageName;
                    str.getClass();
                    arrayList.add(new m(str));
                }
                return arrayList;
            default:
                PackageManager packageManager2 = (PackageManager) this.f26716b.f26718b;
                packageManager2.getClass();
                List<ApplicationInfo> installedApplications2 = packageManager2.getInstalledApplications(128);
                installedApplications2.getClass();
                ArrayList<ApplicationInfo> arrayList2 = new ArrayList();
                for (Object obj : installedApplications2) {
                    ApplicationInfo applicationInfo2 = (ApplicationInfo) obj;
                    applicationInfo2.getClass();
                    String str2 = applicationInfo2.sourceDir;
                    str2.getClass();
                    if (StringsKt.z(str2, "/system/", false)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(e0.o(arrayList2, 10));
                for (ApplicationInfo applicationInfo3 : arrayList2) {
                    applicationInfo3.getClass();
                    String str3 = applicationInfo3.packageName;
                    str3.getClass();
                    arrayList3.add(new m(str3));
                }
                return arrayList3;
        }
    }
}
