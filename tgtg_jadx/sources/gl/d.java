package gl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.app.tgtg.model.local.AppConstants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.collections.e0;
import kotlin.collections.x0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m3.s;
import y80.a2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f20535b;

    public /* synthetic */ d(l lVar, int i11) {
        this.f20534a = i11;
        this.f20535b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20534a) {
            case 0:
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final l lVar = this.f20535b;
                    boolean zBooleanValue = ((Boolean) lVar.f20554f.getValue()).booleanValue();
                    boolean zH = sVar.h(lVar);
                    Object objM = sVar.M();
                    m3.f fVar = m3.m.f29332a;
                    if (zH || objM == fVar) {
                        final int i11 = 0;
                        objM = new Function0() { // from class: gl.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i11) {
                                    case 0:
                                        lVar.f20554f.setValue(Boolean.FALSE);
                                        break;
                                    default:
                                        l lVar2 = lVar;
                                        lVar2.f20554f.setValue(Boolean.FALSE);
                                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                                        Context context = lVar2.getContext();
                                        intent.setData(Uri.fromParts("package", context != null ? context.getPackageName() : null, null));
                                        Context contextD = p70.g.d(lVar2.requireContext());
                                        Activity activity = contextD instanceof Activity ? (Activity) contextD : null;
                                        if (activity != null) {
                                            activity.startActivityForResult(intent, AppConstants.GO_TO_GPS_SETTINGS);
                                        }
                                        break;
                                }
                                return Unit.f26487a;
                            }
                        };
                        sVar.k0(objM);
                    }
                    Function0 function0 = (Function0) objM;
                    boolean zH2 = sVar.h(lVar);
                    Object objM2 = sVar.M();
                    if (zH2 || objM2 == fVar) {
                        final int i12 = 1;
                        objM2 = new Function0() { // from class: gl.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i12) {
                                    case 0:
                                        lVar.f20554f.setValue(Boolean.FALSE);
                                        break;
                                    default:
                                        l lVar2 = lVar;
                                        lVar2.f20554f.setValue(Boolean.FALSE);
                                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                                        Context context = lVar2.getContext();
                                        intent.setData(Uri.fromParts("package", context != null ? context.getPackageName() : null, null));
                                        Context contextD = p70.g.d(lVar2.requireContext());
                                        Activity activity = contextD instanceof Activity ? (Activity) contextD : null;
                                        if (activity != null) {
                                            activity.startActivityForResult(intent, AppConstants.GO_TO_GPS_SETTINGS);
                                        }
                                        break;
                                }
                                return Unit.f26487a;
                            }
                        };
                        sVar.k0(objM2);
                    }
                    ox.h.f(null, null, zBooleanValue, function0, (Function0) objM2, null, null, null, sVar, 0, 227);
                } else {
                    sVar.U();
                }
                return Unit.f26487a;
            default:
                Integer num = (Integer) obj;
                num.getClass();
                int iIntValue2 = ((Integer) obj2).intValue();
                a2 a2Var = this.f20535b.r().f20575i;
                Map map = ((jl.e) a2Var.getValue()).f25314a;
                ?? arrayList = (List) map.get(num);
                if (arrayList == 0) {
                    arrayList = new ArrayList(6);
                    for (int i13 = 0; i13 < 6; i13++) {
                        arrayList.add(Boolean.FALSE);
                    }
                }
                ArrayList arrayList2 = new ArrayList(e0.o(arrayList, 10));
                int i14 = 0;
                for (Object obj3 : arrayList) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        d0.n();
                        throw null;
                    }
                    boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                    if (i14 == iIntValue2) {
                        zBooleanValue2 = !zBooleanValue2;
                    }
                    arrayList2.add(Boolean.valueOf(zBooleanValue2));
                    i14 = i15;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                linkedHashMap.put(num, arrayList2);
                a2Var.k(null, new jl.e(x0.k(linkedHashMap)));
                return Unit.f26487a;
        }
    }
}
