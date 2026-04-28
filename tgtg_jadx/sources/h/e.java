package h;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContract;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends ActivityResultLauncher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityResultRegistry f20946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f20947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ActivityResultContract f20948d;

    public /* synthetic */ e(ActivityResultRegistry activityResultRegistry, String str, ActivityResultContract activityResultContract, int i11) {
        this.f20945a = i11;
        this.f20946b = activityResultRegistry;
        this.f20947c = str;
        this.f20948d = activityResultContract;
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public final void a(Object obj, se.b bVar) {
        switch (this.f20945a) {
            case 0:
                ActivityResultRegistry activityResultRegistry = this.f20946b;
                LinkedHashMap linkedHashMap = activityResultRegistry.f1755b;
                ArrayList arrayList = activityResultRegistry.f1757d;
                String str = this.f20947c;
                Object obj2 = linkedHashMap.get(str);
                ActivityResultContract activityResultContract = this.f20948d;
                if (obj2 == null) {
                    e40.a.k("Attempting to launch an unregistered ActivityResultLauncher with contract ", activityResultContract, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                int iIntValue = ((Number) obj2).intValue();
                arrayList.add(str);
                try {
                    activityResultRegistry.b(iIntValue, activityResultContract, obj, bVar);
                    return;
                } catch (Exception e5) {
                    arrayList.remove(str);
                    throw e5;
                }
            default:
                ActivityResultRegistry activityResultRegistry2 = this.f20946b;
                ArrayList arrayList2 = activityResultRegistry2.f1757d;
                LinkedHashMap linkedHashMap2 = activityResultRegistry2.f1755b;
                String str2 = this.f20947c;
                Object obj3 = linkedHashMap2.get(str2);
                ActivityResultContract activityResultContract2 = this.f20948d;
                if (obj3 == null) {
                    e40.a.k("Attempting to launch an unregistered ActivityResultLauncher with contract ", activityResultContract2, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                int iIntValue2 = ((Number) obj3).intValue();
                arrayList2.add(str2);
                try {
                    activityResultRegistry2.b(iIntValue2, activityResultContract2, obj, bVar);
                    return;
                } catch (Exception e11) {
                    arrayList2.remove(str2);
                    throw e11;
                }
        }
    }

    public void b() {
        this.f20946b.f(this.f20947c);
    }
}
