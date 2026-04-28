package androidx.activity;

import android.os.Bundle;
import androidx.lifecycle.n1;
import androidx.navigation.fragment.NavHostFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.x0;
import y80.a2;
import y80.f1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements ea.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1726b;

    public /* synthetic */ g(Object obj, int i11) {
        this.f1725a = i11;
        this.f1726b = obj;
    }

    @Override // ea.d
    public final Bundle a() {
        Pair[] pairArr;
        switch (this.f1725a) {
            case 0:
                return ComponentActivity.q((ComponentActivity) this.f1726b);
            case 1:
                Map mapB = ((y3.f) this.f1726b).b();
                Bundle bundle = new Bundle();
                for (Map.Entry entry : mapB.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle;
            case 2:
                Bundle bundleK = ((g9.f0) this.f1726b).k();
                if (bundleK != null) {
                    return bundleK;
                }
                Bundle bundle2 = Bundle.EMPTY;
                bundle2.getClass();
                return bundle2;
            case 3:
                int i11 = ((NavHostFragment) this.f1726b).f3562c;
                if (i11 != 0) {
                    return jb.u.x(new Pair("android-support-nav:fragment:graphId", Integer.valueOf(i11)));
                }
                Bundle bundle3 = Bundle.EMPTY;
                bundle3.getClass();
                return bundle3;
            default:
                n1 n1Var = (n1) this.f1726b;
                for (Map.Entry entry2 : x0.k((LinkedHashMap) n1Var.f3502d).entrySet()) {
                    n1Var.z(((a2) ((f1) entry2.getValue())).getValue(), (String) entry2.getKey());
                }
                for (Map.Entry entry3 : x0.k((LinkedHashMap) n1Var.f3500b).entrySet()) {
                    n1Var.z(((ea.d) entry3.getValue()).a(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) n1Var.f3499a;
                if (linkedHashMap.isEmpty()) {
                    pairArr = new Pair[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry4 : linkedHashMap.entrySet()) {
                        arrayList.add(new Pair((String) entry4.getKey(), entry4.getValue()));
                    }
                    pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                }
                return jb.u.x((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        }
    }
}
