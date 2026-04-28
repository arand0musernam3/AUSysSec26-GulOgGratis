package androidx.recyclerview.widget;

import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ExecutorService f3681b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f3680a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f3682c = new s(0);

    public static v a(t tVar) {
        int i11;
        z zVar;
        int i12;
        y yVar;
        int i13;
        int i14;
        z zVar2;
        z zVar3;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int oldListSize = tVar.getOldListSize();
        int newListSize = tVar.getNewListSize();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        y yVar2 = new y();
        int i25 = 0;
        yVar2.f3978a = 0;
        yVar2.f3979b = oldListSize;
        yVar2.f3980c = 0;
        yVar2.f3981d = newListSize;
        arrayList2.add(yVar2);
        int i26 = oldListSize + newListSize;
        int i27 = 1;
        int i28 = (((i26 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i28];
        int i29 = i28 / 2;
        int[] iArr2 = new int[i28];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            y yVar3 = (y) arrayList2.remove(arrayList2.size() - i27);
            if (yVar3.b() < i27 || yVar3.a() < i27) {
                i11 = i29;
                zVar = null;
            } else {
                int iA = ((yVar3.a() + yVar3.b()) + i27) / 2;
                int i31 = i27 + i29;
                iArr[i31] = yVar3.f3978a;
                iArr2[i31] = yVar3.f3979b;
                int i32 = i25;
                while (i32 < iA) {
                    int i33 = Math.abs(yVar3.b() - yVar3.a()) % 2 == i27 ? i27 : i25;
                    int iB = yVar3.b() - yVar3.a();
                    int i34 = -i32;
                    int i35 = i34;
                    while (true) {
                        if (i35 > i32) {
                            i13 = i25;
                            i11 = i29;
                            i14 = iA;
                            zVar2 = null;
                            break;
                        }
                        if (i35 == i34 || (i35 != i32 && iArr[i35 + 1 + i29] > iArr[(i35 - 1) + i29])) {
                            i19 = iArr[i35 + 1 + i29];
                            i21 = i19;
                        } else {
                            i19 = iArr[(i35 - 1) + i29];
                            i21 = i19 + 1;
                        }
                        i11 = i29;
                        int i36 = ((i21 - yVar3.f3978a) + yVar3.f3980c) - i35;
                        if (i32 == 0 || i21 != i19) {
                            i22 = i21;
                            i23 = i36;
                        } else {
                            i22 = i21;
                            i23 = i36 - 1;
                        }
                        int i37 = i35;
                        int i38 = i36;
                        int i39 = i22;
                        i14 = iA;
                        while (i39 < yVar3.f3979b && i38 < yVar3.f3981d && tVar.areItemsTheSame(i39, i38)) {
                            i39++;
                            i38++;
                        }
                        iArr[i37 + i11] = i39;
                        if (i33 != 0) {
                            int i41 = iB - i37;
                            i24 = i33;
                            if (i41 >= i34 + 1 && i41 <= i32 - 1 && iArr2[i41 + i11] <= i39) {
                                zVar2 = new z();
                                zVar2.f3984a = i19;
                                zVar2.f3985b = i23;
                                zVar2.f3986c = i39;
                                zVar2.f3987d = i38;
                                i13 = 0;
                                zVar2.f3988e = false;
                                break;
                            }
                        } else {
                            i24 = i33;
                        }
                        i35 = i37 + 2;
                        i25 = 0;
                        i29 = i11;
                        iA = i14;
                        i33 = i24;
                    }
                    if (zVar2 != null) {
                        zVar = zVar2;
                        break;
                    }
                    int i42 = (yVar3.b() - yVar3.a()) % 2 == 0 ? 1 : i13;
                    int iB2 = yVar3.b() - yVar3.a();
                    int i43 = i34;
                    while (true) {
                        if (i43 > i32) {
                            zVar3 = null;
                            break;
                        }
                        if (i43 == i34 || (i43 != i32 && iArr2[i43 + 1 + i11] < iArr2[(i43 - 1) + i11])) {
                            i15 = iArr2[i43 + 1 + i11];
                            i16 = i15;
                        } else {
                            i15 = iArr2[(i43 - 1) + i11];
                            i16 = i15 - 1;
                        }
                        int i44 = yVar3.f3981d - ((yVar3.f3979b - i16) - i43);
                        int i45 = (i32 == 0 || i16 != i15) ? i44 : i44 + 1;
                        int i46 = i42;
                        while (i16 > yVar3.f3978a && i44 > yVar3.f3980c) {
                            i17 = iB2;
                            if (!tVar.areItemsTheSame(i16 - 1, i44 - 1)) {
                                break;
                            }
                            i16--;
                            i44--;
                            iB2 = i17;
                        }
                        i17 = iB2;
                        iArr2[i43 + i11] = i16;
                        if (i46 != 0 && (i18 = i17 - i43) >= i34 && i18 <= i32 && iArr[i18 + i11] >= i16) {
                            zVar3 = new z();
                            zVar3.f3984a = i16;
                            zVar3.f3985b = i44;
                            zVar3.f3986c = i15;
                            zVar3.f3987d = i45;
                            zVar3.f3988e = true;
                            break;
                        }
                        i43 += 2;
                        i42 = i46;
                        iB2 = i17;
                    }
                    if (zVar3 != null) {
                        zVar = zVar3;
                        break;
                    }
                    i32++;
                    i29 = i11;
                    iA = i14;
                    i27 = 1;
                    i25 = 0;
                }
                i11 = i29;
                zVar = null;
            }
            if (zVar != null) {
                if (zVar.a() > 0) {
                    int i47 = zVar.f3987d;
                    int i48 = zVar.f3985b;
                    int i49 = i47 - i48;
                    int i51 = zVar.f3986c;
                    int i52 = zVar.f3984a;
                    int i53 = i51 - i52;
                    arrayList.add(i49 != i53 ? zVar.f3988e ? new u(i52, i48, zVar.a()) : i49 > i53 ? new u(i52, i48 + 1, zVar.a()) : new u(i52 + 1, i48, zVar.a()) : new u(i52, i48, i53));
                }
                if (arrayList3.isEmpty()) {
                    yVar = new y();
                    i12 = 1;
                } else {
                    i12 = 1;
                    yVar = (y) arrayList3.remove(arrayList3.size() - 1);
                }
                yVar.f3978a = yVar3.f3978a;
                yVar.f3980c = yVar3.f3980c;
                yVar.f3979b = zVar.f3984a;
                yVar.f3981d = zVar.f3985b;
                arrayList2.add(yVar);
                yVar3.f3979b = yVar3.f3979b;
                yVar3.f3981d = yVar3.f3981d;
                yVar3.f3978a = zVar.f3986c;
                yVar3.f3980c = zVar.f3987d;
                arrayList2.add(yVar3);
            } else {
                i12 = 1;
                arrayList3.add(yVar3);
            }
            i29 = i11;
            i27 = i12;
            i25 = 0;
        }
        Collections.sort(arrayList, f3682c);
        return new v(tVar, arrayList, iArr, iArr2);
    }

    public static int b(n2 n2Var, f1 f1Var, View view, View view2, y1 y1Var, boolean z11) {
        if (y1Var.getChildCount() == 0 || n2Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z11) {
            return Math.abs(y1Var.getPosition(view) - y1Var.getPosition(view2)) + 1;
        }
        return Math.min(f1Var.l(), f1Var.b(view2) - f1Var.e(view));
    }

    public static int c(n2 n2Var, f1 f1Var, View view, View view2, y1 y1Var, boolean z11, boolean z12) {
        if (y1Var.getChildCount() == 0 || n2Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z12 ? Math.max(0, (n2Var.b() - Math.max(y1Var.getPosition(view), y1Var.getPosition(view2))) - 1) : Math.max(0, Math.min(y1Var.getPosition(view), y1Var.getPosition(view2)));
        if (z11) {
            return Math.round((iMax * (Math.abs(f1Var.b(view2) - f1Var.e(view)) / (Math.abs(y1Var.getPosition(view) - y1Var.getPosition(view2)) + 1))) + (f1Var.k() - f1Var.e(view)));
        }
        return iMax;
    }

    public static int d(n2 n2Var, f1 f1Var, View view, View view2, y1 y1Var, boolean z11) {
        if (y1Var.getChildCount() == 0 || n2Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z11) {
            return n2Var.b();
        }
        return (int) (((f1Var.b(view2) - f1Var.e(view)) / (Math.abs(y1Var.getPosition(view) - y1Var.getPosition(view2)) + 1)) * n2Var.b());
    }
}
