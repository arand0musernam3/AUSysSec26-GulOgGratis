package androidx.fragment.app;

import android.util.Log;
import androidx.activity.result.ActivityResultCallback;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 implements ActivityResultCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FragmentManager f3138b;

    public /* synthetic */ a1(FragmentManager fragmentManager, int i11) {
        this.f3137a = i11;
        this.f3138b = fragmentManager;
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public final void a(Object obj) {
        switch (this.f3137a) {
            case 0:
                Map map = (Map) obj;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    iArr[i11] = ((Boolean) arrayList.get(i11)).booleanValue() ? 0 : -1;
                }
                FragmentManager fragmentManager = this.f3138b;
                h1 h1Var = (h1) fragmentManager.G.pollFirst();
                if (h1Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                } else {
                    String str = h1Var.f3228a;
                    int i12 = h1Var.f3229b;
                    Fragment fragmentC = fragmentManager.f3109c.c(str);
                    if (fragmentC == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    } else {
                        fragmentC.onRequestPermissionsResult(i12, strArr, iArr);
                    }
                }
                break;
            case 1:
                h.a aVar = (h.a) obj;
                FragmentManager fragmentManager2 = this.f3138b;
                h1 h1Var2 = (h1) fragmentManager2.G.pollLast();
                if (h1Var2 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                } else {
                    String str2 = h1Var2.f3228a;
                    int i13 = h1Var2.f3229b;
                    Fragment fragmentC2 = fragmentManager2.f3109c.c(str2);
                    if (fragmentC2 == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                    } else {
                        fragmentC2.onActivityResult(i13, aVar.f20935a, aVar.f20936b);
                    }
                }
                break;
            default:
                h.a aVar2 = (h.a) obj;
                FragmentManager fragmentManager3 = this.f3138b;
                h1 h1Var3 = (h1) fragmentManager3.G.pollFirst();
                if (h1Var3 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                } else {
                    String str3 = h1Var3.f3228a;
                    int i14 = h1Var3.f3229b;
                    Fragment fragmentC3 = fragmentManager3.f3109c.c(str3);
                    if (fragmentC3 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                    } else {
                        fragmentC3.onActivityResult(i14, aVar2.f20935a, aVar2.f20936b);
                    }
                }
                break;
        }
    }
}
